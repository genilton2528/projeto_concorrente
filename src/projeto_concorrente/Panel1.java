package projeto_concorrente;

import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author genilton
 */
public class Panel1 extends javax.swing.JFrame {

    private Numbers numbers;
    private Numbers sortNumbers;

    public Panel1() {
        initComponents();
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        Table.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        TableSort.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sort = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        TableSort = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        QtdThreads = new javax.swing.JTextField();
        random = new javax.swing.JButton();
        sortS = new javax.swing.JButton();
        sortT = new javax.swing.JButton();
        time2 = new javax.swing.JLabel();
        time1 = new javax.swing.JLabel();
        max = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        quick = new javax.swing.JRadioButton();
        insert = new javax.swing.JRadioButton();
        rows = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] { },
            new String [] {
                "Numeros"
            }
        ));
        jScrollPane1.setViewportView(Table);

        TableSort.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] { },
            new String [] {
                "Numeros Ordenados"
            }
        ));
        jScrollPane3.setViewportView(TableSort);

        jLabel4.setText("=>");

        jToolBar1.setRollover(true);

        jButton1.setText("Menu");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        jLabel1.setText("Quantidade:");

        QtdThreads.setText("2");

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

        time2.setText("Tempo Concorrente:");

        time1.setText("Tempo Sequencial:");

        jLabel2.setText("Threads:");

        sort.add(quick);
        quick.setText("QuickSort");

        sort.add(insert);
        insert.setSelected(true);
        insert.setText("InsertSort");

        rows.setText("Linhas:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rows, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(time1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(max, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(random)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(time2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sortS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(quick, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(insert))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(4, 4, 4)
                                .addComponent(QtdThreads, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sortT, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(71, 71, 71))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(random)
                            .addComponent(max, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(quick)
                            .addComponent(insert))
                        .addGap(18, 18, 18)
                        .addComponent(sortS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(time1)
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sortT)
                            .addComponent(QtdThreads, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(time2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rows))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 655, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void randomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_randomActionPerformed
        this.numbers = null;
        this.numbers = new Numbers(Convert.converteInt(this.max.getText()));
        this.numbers.random();
        this.refresh();
    }//GEN-LAST:event_randomActionPerformed

    private void sortSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortSActionPerformed
        if (this.numbers == null) {
            return;
        }
        this.sortNumbers = null;
        this.sortNumbers = new Numbers(this.numbers);
        double startTime, endTime;

        if (this.insert.isSelected()) {
            startTime = System.currentTimeMillis();
            new InsertSort(this.sortNumbers).insertionSort();
            endTime = System.currentTimeMillis();
        } else {
            startTime = System.currentTimeMillis();
            new QuickSort(this.sortNumbers).quickSort(0, this.sortNumbers.getMax() - 1);
            endTime = System.currentTimeMillis();
        }

        this.time1.setText("Tempo Sequencial: " + (endTime - startTime) + "ms");
        System.out.println("Tempo Sequencial: " + (endTime - startTime) + "ms");
        this.refresh();
    }//GEN-LAST:event_sortSActionPerformed

    private void sortTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortTActionPerformed
        if (this.numbers == null) {
            return;
        }
        this.sortNumbers = null;
        this.sortNumbers = new Numbers(this.numbers);
        double startTime, endTime;

        int qtdThreads = Convert.converteInt(this.QtdThreads.getText());

        Thread[] threads = new Thread[qtdThreads];
        int fist = 0;
        int last = (this.sortNumbers.getMax() - 1) / qtdThreads;
        int step = (this.sortNumbers.getMax() / qtdThreads);

        //Inicio
        if (this.insert.isSelected()) {
            startTime = System.currentTimeMillis();

            for (int i = 0; i < qtdThreads; i++) {
                threads[i] = new Thread(new InsertSort(fist, last, this.sortNumbers));
                threads[i].start();
                fist = last + 1;
                last += step;
            }
            for (int i = 0; i < qtdThreads; i++) {
                try {
                    threads[i].join();
                } catch (InterruptedException ex) {
                    System.err.println(ex.getMessage());
                }
            }
            new InsertSort(0, this.sortNumbers.getMax() - 1, this.sortNumbers).run();

            endTime = System.currentTimeMillis();
        }else{
            startTime = System.currentTimeMillis();

            for (int i = 0; i < qtdThreads; i++) {
                threads[i] = new Thread(new QuickSort(fist, last, this.sortNumbers));
                threads[i].start();
                fist = last + 1;
                last += (this.sortNumbers.getMax() / qtdThreads);
            }
            for (int i = 0; i < qtdThreads; i++) {
                try {
                    threads[i].join();
                } catch (InterruptedException ex) {
                    System.err.println(ex.getMessage());
                }
            }
            new QuickSort(0, this.sortNumbers.getMax() - 1, this.sortNumbers).run();

            endTime = System.currentTimeMillis();        
        }
        //Fim

        this.time2.setText("Tempo Concorrente: " + (endTime - startTime) + "ms");
        System.out.println("Threads: " + qtdThreads + ", Tempo Concorrente: " + (endTime - startTime) + "ms");
        this.refresh();
    }//GEN-LAST:event_sortTActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Menu().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void refresh() {
        DefaultTableModel table = (DefaultTableModel) this.Table.getModel();
        table.setNumRows(0);
        String[] str = new String[1];
        for (int i : this.numbers.getVector()) {
            str[0] = " " + i + " ";
            table.addRow(str);
        }

        if(table.getRowCount()>=1000000){
            this.rows.setText("Linhas: " + table.getRowCount()/1000000 + " milhão");
        }else{
            this.rows.setText("Linhas: " + table.getRowCount());
        }     

        if (this.sortNumbers == null) {
            return;
        }        
        table = (DefaultTableModel) this.TableSort.getModel();
        table.setNumRows(0);
        str = new String[1];
        for (int i : this.sortNumbers.getVector()) {
            str[0] = " " + i + " ";
            table.addRow(str);
        }
//        System.out.println(", " + table.getRowCount());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField QtdThreads;
    private javax.swing.JTable Table;
    private javax.swing.JTable TableSort;
    private javax.swing.JRadioButton insert;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextField max;
    private javax.swing.JRadioButton quick;
    private javax.swing.JButton random;
    private javax.swing.JLabel rows;
    private javax.swing.ButtonGroup sort;
    private javax.swing.JButton sortS;
    private javax.swing.JButton sortT;
    private javax.swing.JLabel time1;
    private javax.swing.JLabel time2;
    // End of variables declaration//GEN-END:variables
}
