package projeto_concorrente;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author genilton
 */
public class Panel2 extends javax.swing.JFrame {

    private Numbers[] numbers;
    private Numbers[] sortNumbers;

    public Panel2() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        time2 = new javax.swing.JLabel();
        time1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        max = new javax.swing.JTextField();
        random = new javax.swing.JButton();
        sortS = new javax.swing.JButton();
        sortT = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TableSort = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        time2.setText("Tempo Concorrente:");

        time1.setText("Tempo Sequencial:");

        jLabel1.setText("Quantidade:");

        random.setText("Gerar");
        random.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                randomActionPerformed(evt);
            }
        });

        sortS.setText("Ordena Sequencial");
        sortS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortSActionPerformed(evt);
            }
        });

        sortT.setText("Ordena Thread");
        sortT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortTActionPerformed(evt);
            }
        });

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] { },
            new String [] {
                "Numeros"
            }
        ));
        jScrollPane1.setViewportView(Table);

        jLabel4.setText("=>");

        TableSort.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] { },
            new String [] {
                "Numeros Ordenados"
            }
        ));
        jScrollPane3.setViewportView(TableSort);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(max, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(random))
                            .addComponent(sortS, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(time1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(time2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sortT, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(max, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(random))
                        .addGap(50, 50, 50)
                        .addComponent(sortS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(time1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addComponent(jLabel4))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sortT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(time2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void randomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_randomActionPerformed
        int qtdVectors = Convert.converteInt(JOptionPane.showInputDialog("Quantos vetores?"));
        this.numbers = null;
        this.numbers = new Numbers[qtdVectors];
        for (int i = 0; i < qtdVectors; i++) {
            this.numbers[i] = new Numbers(Convert.converteInt(this.max.getText()));
            this.numbers[i].random();
        }

        this.refresh();
    }//GEN-LAST:event_randomActionPerformed

    private void sortSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortSActionPerformed
        this.sortNumbers = null;
        this.sortNumbers = new Numbers[this.numbers.length];
        
        for (int i = 0; i < this.numbers.length; i++) {
            this.sortNumbers[i] = new Numbers(this.numbers[i]);
        }
        
        double startTime = System.currentTimeMillis();        
        for (int i = 0; i < this.numbers.length; i++) {           
            new InsertSort(this.sortNumbers[i]).insertionSort();
        }        
        double endTime = System.currentTimeMillis();

        
        this.time1.setText("Tempo Sequencial: " + (endTime-startTime) + "ms");
        this.refresh();
    }//GEN-LAST:event_sortSActionPerformed

    private void sortTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortTActionPerformed
        Thread[] threads = new Thread[this.numbers.length];

        this.sortNumbers = null;
        this.sortNumbers = new Numbers[this.numbers.length];

        for (int i = 0; i < this.numbers.length; i++) {
            this.sortNumbers[i] = new Numbers(this.numbers[i]);
        }
        
        double startTime = System.currentTimeMillis();        
        for (int i = 0; i < this.numbers.length; i++) {
            threads[i] = new Thread(new InsertSort(0, this.sortNumbers[i].getMax() - 1, this.sortNumbers[i]));
            threads[i].start();
        }
        for (int i = 0; i < this.numbers.length; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException ex) {
                System.err.println(ex.getMessage());
            }
        }
        double endTime = System.currentTimeMillis();
        
        this.time2.setText("Tempo Concorrente: " + (endTime-startTime) + "ms");
        this.refresh();
    }//GEN-LAST:event_sortTActionPerformed

    private void refresh() {
        //Centraliza texto na coluna
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        //Limpa a tabela
        DefaultTableModel table = (DefaultTableModel) this.Table.getModel();
        table.setNumRows(0);
        table.setColumnCount(0);

        //Preenche a tabela
        for (int i = 0; i < this.numbers.length; i++) {
            String[] str = new String[this.numbers[i].getMax()];
            for (int j = 0; j < this.numbers[i].getMax(); j++) {
                str[j] = " " + this.numbers[i].getVector()[j];
            }
            table.addColumn(i + 1, str);
            Table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }

        if (this.sortNumbers == null) {
            return;
        }

        table = (DefaultTableModel) this.TableSort.getModel();
        table.setNumRows(0);
        table.setColumnCount(0);

        for (int i = 0; i < this.sortNumbers.length; i++) {
            String[] str = new String[this.sortNumbers[i].getMax()];
            for (int j = 0; j < this.sortNumbers[i].getMax(); j++) {
                str[j] = " " + this.sortNumbers[i].getVector()[j];
            }
            table.addColumn(i + 1, str);
            Table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table;
    private javax.swing.JTable TableSort;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField max;
    private javax.swing.JButton random;
    private javax.swing.JButton sortS;
    private javax.swing.JButton sortT;
    private javax.swing.JLabel time1;
    private javax.swing.JLabel time2;
    // End of variables declaration//GEN-END:variables
}
