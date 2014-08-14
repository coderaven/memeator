/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memeator;

import java.awt.BorderLayout;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetDragEvent;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.dnd.DropTargetEvent;
import java.awt.dnd.DropTargetListener;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 *
 * @author bintoy
 */
public class Memeator extends JFrame implements DropTargetListener {
    private JTextArea jt;
    
    Memeator(){
        setTitle("Drag and Drop Example");
        setSize(400,400);
        setVisible(true);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        // Create JTextArea
        jt = new JTextArea();
        add(jt);
        
        enableDragAndDrop();
        setLocationRelativeTo(null);
        show();
    }
    
    private void enableDragAndDrop(){
        DropTarget target = new DropTarget(jt,this);
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
            jt.read(new FileReader(file),null);
        } catch (UnsupportedFlavorException | IOException ex){
            
        }
    }
    
}
