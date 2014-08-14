/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memeator;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util;
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetDragEvent;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.dnd.DropTargetEvent;
import java.awt.dnd.DropTargetListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author bintoy
 */
public class Memeator extends JFrame implements DropTargetListener {
    private JTextArea jt;
    private ImagePanel iPanel;
    
    Memeator(){
        setTitle("Drag and Drop Example");
        setVisible(true);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        // Create JTextArea
        iPanel = new ImagePanel();
        add(iPanel);
        
        enableDragAndDrop();
        setLocationRelativeTo(null);
        setSize(600, 400);
        show();
    }
    
    private void enableDragAndDrop(){
        DropTarget target = new DropTarget(this,this);
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Memeator();
    }

    @Override
    public void dragEnter(DropTargetDragEvent dtde) {
    }

    @Override
    public void dragOver(DropTargetDragEvent dtde) {
    }

    @Override
    public void dropActionChanged(DropTargetDragEvent dtde) {
    }

    @Override
    public void dragExit(DropTargetEvent dte) {
    }

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
            this.iPanel.setImage(file.getPath());
        } catch (UnsupportedFlavorException | IOException ex){
            
        }
    }
    
}

class ImagePanel extends JPanel {
    private BufferedImage image;

    public ImagePanel(String imageFile) {
       try {                
          image = ImageIO.read(new File(imageFile));
       } catch (IOException ex) {
            // handle exception...
       }
    }
    
    public ImagePanel(){
        try {                
            image = ImageIO.read(new File("placeholder.jpeg"));
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
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, null); // see javadoc for more info on the parameters            
    }
}