/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memeator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetDragEvent;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.dnd.DropTargetEvent;
import java.awt.dnd.DropTargetListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author bintoy
 */
public class Memeator extends JFrame {
    private JTextArea jt;
    private ImagePanel iPanel;
    
    Memeator(){
        setTitle("MEME-ATOR");
        setVisible(true);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        // Create JTextArea
        iPanel = new ImagePanel();
        iPanel.setMaximumSize(new Dimension(800, 800));
        add(iPanel);
        
        setLocationRelativeTo(null);
        setSize(800, 800);
        show();
    }
}

class ImagePanel extends JPanel  implements DropTargetListener, ActionListener{
    private BufferedImage image;
    private BufferedImage imageToDraw;
    private String topText;
    private String bottomText;
    private JTextField topTextFieldHolder;
    private JTextField bottomTextFieldHolder;
    private JButton resetButtonHolder;
    private JButton saveButtonHolder;
    private JButton[] memeButtonsHolder;
    
    public ImagePanel(){
        enableDragAndDrop();
        try {                
            image = ImageIO.read(new File("images/drop.jpg"));
            topText = "";
            bottomText = "";
         } catch (IOException ex) {
              // handle exception...
         }
    }
    
    public ImagePanel(JTextField topTextField, JTextField bottomTextField, JButton resetButton, JButton saveButton, JButton[] memeButtons){
        enableDragAndDrop();
        topTextField.addActionListener(this);
        bottomTextField.addActionListener(this);
        resetButton.addActionListener(this);
        saveButton.addActionListener(this);
        topTextFieldHolder = topTextField;
        bottomTextFieldHolder = bottomTextField;;
        resetButtonHolder = resetButton;
        saveButtonHolder = saveButton;
        memeButtonsHolder = memeButtons;
        
        for (JButton mButton : memeButtons){
            mButton.addActionListener(this);
        }
        
        try {                
            image = ImageIO.read(new File("images/drop.jpg"));
            topText = "";
            bottomText = "";
         } catch (IOException ex) {
              // handle exception...
         }
    }
    
    public void setImage(String imageFile){
        try {                
            image = ImageIO.read(new File(imageFile));
         } catch (IOException ex) {
              // handle exception...
         }
        
        this.repaint();
        this.revalidate();
    }
    
    public void setTopText(String text){
        topText = text;
        this.repaint();
        this.revalidate();
    }
    
    public void setBottomText(String text){
        bottomText = text;
        this.repaint();
        this.revalidate();
    }
    
    public static BufferedImage toBufferedImage(Image img){
        if (img instanceof BufferedImage){
            return (BufferedImage) img;
        }

        // Create a buffered image with transparency
        BufferedImage bimage = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_ARGB);

        // Draw the image on to the buffered image
        Graphics2D bGr = bimage.createGraphics();
        bGr.drawImage(img, 0, 0, null);
        bGr.dispose();

        // Return the buffered image
        return bimage;
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        //g.drawImage(image, 0, 0, null); // see javadoc for more info on the parameters ;
        imageToDraw = textOverlayImageTop(toBufferedImage(image.getScaledInstance(550, 400, Image.SCALE_SMOOTH)), topText);
        imageToDraw = textOverlayImageBottom(toBufferedImage(imageToDraw.getScaledInstance(550, 400, Image.SCALE_SMOOTH)), bottomText);
        g.drawImage(imageToDraw, 0, 0, null);
    }
    
    private BufferedImage textOverlayImageTop(BufferedImage old, String text){
        int w = old.getWidth();
        int h = old.getHeight();
        BufferedImage img = new BufferedImage(
            w, h, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = img.createGraphics();
        g2d.drawImage(old, 0, 0, null);
        g2d.setFont(new Font("Arial", Font.BOLD, 40));
        FontMetrics fm = g2d.getFontMetrics();
        
        return textOverlay(old,text,0,fm.getHeight());
    }
    
    private BufferedImage textOverlayImageBottom(BufferedImage old, String text){
        return textOverlay(old,text,0,370);
    }
    
    private BufferedImage textOverlay(BufferedImage old, String text, int x, int y){
        int w = old.getWidth();
        int h = old.getHeight();
        
        BufferedImage img = new BufferedImage(
            w, h, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = img.createGraphics();
        
        
        g2d.drawImage(old, 0, 0, null);
        
        g2d.setFont(new Font("Arial", Font.BOLD, 40));
        FontMetrics fm = g2d.getFontMetrics();
        
        int stringLen = (int)  g2d.getFontMetrics().getStringBounds(text, g2d).getWidth();  
        int start = 250 - stringLen/2;

        g2d.setColor(Color.black);
        g2d.drawString(text, start + ShiftWest(x, 1), ShiftNorth(y, 1));
        g2d.drawString(text, start + ShiftWest(x, 1), ShiftSouth(y, 1));
        g2d.drawString(text, start + ShiftEast(x, 1), ShiftNorth(y, 1));
        g2d.drawString(text, start + ShiftEast(x, 1), ShiftSouth(y, 1));
        g2d.setColor(Color.white);
        g2d.drawString(text, start + x, y);
        g2d.dispose();
        return img;
    }
    
    int ShiftNorth(int p, int distance) {
        return (p - distance);
    }
    int ShiftSouth(int p, int distance) {
        return (p + distance);
    }
    int ShiftEast(int p, int distance) {
        return (p + distance);
    }
    int ShiftWest(int p, int distance) {
        return (p - distance);
    }
    
    private void enableDragAndDrop(){
        DropTarget target = new DropTarget(this,this);
    }

    @Override
    public void dragEnter(DropTargetDragEvent dtde) {}

    @Override
    public void dragOver(DropTargetDragEvent dtde) {}

    @Override
    public void dropActionChanged(DropTargetDragEvent dtde) {}

    @Override
    public void dragExit(DropTargetEvent dte) {}

    @Override
    public void drop(DropTargetDropEvent dtde) {
        try {
            // Accept the drop first, important!
            dtde.acceptDrop(DnDConstants.ACTION_COPY_OR_MOVE);
            
            // Get the files that are dropped as java.util.List
            java.util.List list = (java.util.List) dtde.getTransferable().getTransferData(DataFlavor.javaFileListFlavor);
            
            // Now get the first file from the list
            File file=(File)list.get(0);
            //jt.read(new FileReader(file),null);
            //jt.setText(file.getPath());
            //JOptionPane.showMessageDialog(null, "The file location is " + file.getPath());
            this.setImage(file.getPath());
        } catch (UnsupportedFlavorException | IOException ex){
            
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == topTextFieldHolder){
            setTopText(topTextFieldHolder.getText());
        } else if (e.getSource() == bottomTextFieldHolder){
            setBottomText(bottomTextFieldHolder.getText());
        } else if (e.getSource() == resetButtonHolder){
            setImage("images/drop.jpg");
            setTopText("");
            setBottomText("");
            topTextFieldHolder.setText("");
            bottomTextFieldHolder.setText("");
        } else if (e.getSource() == saveButtonHolder){
            JFileChooser fileChooser = new JFileChooser();
            javax.swing.filechooser.FileFilter ff = new javax.swing.filechooser.FileFilter() {
                @Override
                public String getDescription() {
                    return "png";
                }

                @Override
                public boolean accept(File f) {return true;}
            };
            fileChooser.addChoosableFileFilter(ff);
            fileChooser.setFileFilter(ff);
            if (fileChooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
              File file = fileChooser.getSelectedFile();
              // save to file
              //JOptionPane.showMessageDialog(null, file.getPath());
              File outputfile = new File(file.getPath()+".png");
                try {
                    ImageIO.write(imageToDraw, "png", outputfile);
                    JOptionPane.showMessageDialog(null, "File Successfully Saved!");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Error Occured! File not saved. Please try again!");
                }
            }
        } else {
            for (JButton mButton : memeButtonsHolder){
                if (e.getSource() == mButton){
                    setImage("images/" + mButton.getName() + ".png");
                }
            }
        }
        
    }

}