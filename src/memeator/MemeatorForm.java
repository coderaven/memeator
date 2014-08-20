/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memeator;

import java.awt.Color;
import javax.swing.JButton;

/**
 *
 * @author bintoy
 */
public class MemeatorForm extends javax.swing.JFrame {

    /**
     * Creates new form MemeatorForm
     */
    @SuppressWarnings("empty-statement")
    public MemeatorForm() {
        initComponents();
        getContentPane().setBackground(Color.WHITE); 
        this.setLocationRelativeTo(null);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        memeButtonGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        topTextField = new javax.swing.JTextField();
        bottomTextField = new javax.swing.JTextField();
        resetButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        meme1v = new javax.swing.JButton();
        meme2v = new javax.swing.JButton();
        meme3v = new javax.swing.JButton();
        meme4v = new javax.swing.JButton();
        meme5v = new javax.swing.JButton();
        meme6v = new javax.swing.JButton();
        meme7v = new javax.swing.JButton();
        meme8v = new javax.swing.JButton();
        meme9v = new javax.swing.JButton();
        meme10v = new javax.swing.JButton();
        meme11v = new javax.swing.JButton();
        meme12v = new javax.swing.JButton();
        iPanel = new ImagePanel(topTextField,bottomTextField,resetButton,saveButton,new JButton[]{meme1v,meme2v,meme3v,meme4v,meme5v,meme6v,meme7v,meme8v,meme9v,meme10v,meme11v,meme12v});
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/topbar.jpg"))); // NOI18N

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/bottombar.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");

        resetButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/reset.png"))); // NOI18N
        resetButton.setBorder(null);
        resetButton.setBorderPainted(false);
        resetButton.setContentAreaFilled(false);
        resetButton.setFocusPainted(false);
        resetButton.setFocusTraversalKeysEnabled(false);
        resetButton.setFocusable(false);

        saveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/save.png"))); // NOI18N
        saveButton.setBorder(null);
        saveButton.setBorderPainted(false);
        saveButton.setContentAreaFilled(false);
        saveButton.setFocusPainted(false);
        saveButton.setFocusTraversalKeysEnabled(false);
        saveButton.setFocusable(false);

        meme1v.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/meme1.jpg"))); // NOI18N
        meme1v.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        memeButtonGroup.add(meme1v);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, meme1v, org.jdesktop.beansbinding.ELProperty.create("meme1"), meme1v, org.jdesktop.beansbinding.BeanProperty.create("name"));
        bindingGroup.addBinding(binding);

        meme2v.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/meme2.jpg"))); // NOI18N
        meme2v.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        memeButtonGroup.add(meme2v);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, meme2v, org.jdesktop.beansbinding.ELProperty.create("meme2"), meme2v, org.jdesktop.beansbinding.BeanProperty.create("name"));
        bindingGroup.addBinding(binding);

        meme3v.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/meme3.jpg"))); // NOI18N
        meme3v.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        memeButtonGroup.add(meme3v);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, meme3v, org.jdesktop.beansbinding.ELProperty.create("meme3"), meme3v, org.jdesktop.beansbinding.BeanProperty.create("name"));
        bindingGroup.addBinding(binding);

        meme4v.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/meme4.jpg"))); // NOI18N
        meme4v.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        memeButtonGroup.add(meme4v);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, meme4v, org.jdesktop.beansbinding.ELProperty.create("meme4"), meme4v, org.jdesktop.beansbinding.BeanProperty.create("name"));
        bindingGroup.addBinding(binding);

        meme5v.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/meme5.jpg"))); // NOI18N
        meme5v.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        memeButtonGroup.add(meme5v);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, meme5v, org.jdesktop.beansbinding.ELProperty.create("meme5"), meme5v, org.jdesktop.beansbinding.BeanProperty.create("name"));
        bindingGroup.addBinding(binding);

        meme6v.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/meme6.jpg"))); // NOI18N
        meme6v.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        memeButtonGroup.add(meme6v);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, meme6v, org.jdesktop.beansbinding.ELProperty.create("meme6"), meme6v, org.jdesktop.beansbinding.BeanProperty.create("name"));
        bindingGroup.addBinding(binding);

        meme7v.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/meme7.jpg"))); // NOI18N
        meme7v.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        memeButtonGroup.add(meme7v);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, meme7v, org.jdesktop.beansbinding.ELProperty.create("meme7"), meme7v, org.jdesktop.beansbinding.BeanProperty.create("name"));
        bindingGroup.addBinding(binding);

        meme8v.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/meme8.jpg"))); // NOI18N
        meme8v.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        memeButtonGroup.add(meme8v);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, meme8v, org.jdesktop.beansbinding.ELProperty.create("meme8"), meme8v, org.jdesktop.beansbinding.BeanProperty.create("name"));
        bindingGroup.addBinding(binding);

        meme9v.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/meme9.jpg"))); // NOI18N
        meme9v.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        memeButtonGroup.add(meme9v);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, meme9v, org.jdesktop.beansbinding.ELProperty.create("meme9"), meme9v, org.jdesktop.beansbinding.BeanProperty.create("name"));
        bindingGroup.addBinding(binding);

        meme10v.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/meme10.jpg"))); // NOI18N
        meme10v.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        memeButtonGroup.add(meme10v);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, meme10v, org.jdesktop.beansbinding.ELProperty.create("meme10"), meme10v, org.jdesktop.beansbinding.BeanProperty.create("name"));
        bindingGroup.addBinding(binding);

        meme11v.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/meme11.jpg"))); // NOI18N
        meme11v.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        memeButtonGroup.add(meme11v);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, meme11v, org.jdesktop.beansbinding.ELProperty.create("meme11"), meme11v, org.jdesktop.beansbinding.BeanProperty.create("name"));
        bindingGroup.addBinding(binding);

        meme12v.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/meme12.jpg"))); // NOI18N
        meme12v.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        memeButtonGroup.add(meme12v);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, meme12v, org.jdesktop.beansbinding.ELProperty.create("meme12"), meme12v, org.jdesktop.beansbinding.BeanProperty.create("name"));
        bindingGroup.addBinding(binding);

        iPanel.setBackground(new java.awt.Color(255, 255, 255));
        iPanel.setMaximumSize(new java.awt.Dimension(550, 400));
        iPanel.setMinimumSize(new java.awt.Dimension(550, 400));

        javax.swing.GroupLayout iPanelLayout = new javax.swing.GroupLayout(iPanel);
        iPanel.setLayout(iPanelLayout);
        iPanelLayout.setHorizontalGroup(
            iPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );
        iPanelLayout.setVerticalGroup(
            iPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/templates.jpg"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/toptext.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/bottomtext.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 803, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 799, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bottomTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
                            .addComponent(topTextField)))
                    .addComponent(iPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(resetButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveButton)
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(meme1v)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(meme2v)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(meme3v))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(meme7v)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(meme8v)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(meme9v)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(meme4v)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(meme5v)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(meme6v)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(meme10v)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(meme11v)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(meme12v)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(meme1v)
                            .addComponent(meme2v)
                            .addComponent(meme3v))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(meme4v)
                            .addComponent(meme5v)
                            .addComponent(meme6v))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(meme7v)
                            .addComponent(meme8v)
                            .addComponent(meme9v))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(meme10v)
                            .addComponent(meme11v)
                            .addComponent(meme12v)))
                    .addComponent(iPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(saveButton)
                        .addComponent(resetButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(topTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bottomTextField)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jLabel2))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MemeatorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MemeatorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MemeatorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MemeatorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MemeatorForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bottomTextField;
    private javax.swing.JPanel iPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton meme10v;
    private javax.swing.JButton meme11v;
    private javax.swing.JButton meme12v;
    private javax.swing.JButton meme1v;
    private javax.swing.JButton meme2v;
    private javax.swing.JButton meme3v;
    private javax.swing.JButton meme4v;
    private javax.swing.JButton meme5v;
    private javax.swing.JButton meme6v;
    private javax.swing.JButton meme7v;
    private javax.swing.JButton meme8v;
    private javax.swing.JButton meme9v;
    private javax.swing.ButtonGroup memeButtonGroup;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField topTextField;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

}
