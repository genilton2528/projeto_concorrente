package projeto_concorrente;

import javax.swing.JOptionPane;

/**
 *
 * @author genilton
 */
public class Menu extends javax.swing.JFrame {
    public Menu() {
        initComponents();    
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cpu1 = new javax.swing.JLabel();
        test2 = new javax.swing.JButton();
        test1 = new javax.swing.JButton();
        cpu2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Trabalho Concorrentes");

        cpu1.setText("I/O Bound:");

        test2.setText("Teste 2");
        test2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                test2ActionPerformed(evt);
            }
        });

        test1.setText("Teste 1");
        test1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                test1ActionPerformed(evt);
            }
        });

        cpu2.setText("CPU Bound:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(test2)
                            .addComponent(test1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cpu2)
                                .addGap(114, 114, 114)
                                .addComponent(cpu1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpu2)
                    .addComponent(cpu1))
                .addGap(18, 18, 18)
                .addComponent(test1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(test2)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void test1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_test1ActionPerformed
        JOptionPane.showMessageDialog( null, 
                  "<html><ul><li>Nesse teste e feito a ordenação de um vertor de forma sequencial e utilizando threads.</li>"
                + "<li>Na parte onde se utiliza thread o vetor e dividido igualmente para as threads.</li>"
                + "<li>A quantidade de threads e definidas pelo usuario.</li></ul></html>"
                , "Informações", JOptionPane.INFORMATION_MESSAGE);
        new Panel1().setVisible(true);  
        dispose();
    }//GEN-LAST:event_test1ActionPerformed

    private void test2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_test2ActionPerformed
        JOptionPane.showMessageDialog( null, 
                  "<html><ul><li>Nesse teste e feito a ordenação de varios vertores de forma sequencial e utilizando threads.</li>"
                + "<li>Na parte onde se utiliza thread cada vetor e ordenado por uma threads.</li>"
                + "<li>A quantidade de vetores e definidas pelo usuario.</li></ul></html>"
                , "Informações", JOptionPane.INFORMATION_MESSAGE);
        new Panel2().setVisible(true);        
        dispose();
    }//GEN-LAST:event_test2ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new Menu().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cpu1;
    private javax.swing.JLabel cpu2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton test1;
    private javax.swing.JButton test2;
    // End of variables declaration//GEN-END:variables
}
