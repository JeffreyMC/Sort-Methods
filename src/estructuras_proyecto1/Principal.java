/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras_proyecto1;

import java.util.Random;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jeffrey
 */
public class Principal extends javax.swing.JFrame {

    //arreglo original con los datos desordenados
    int [] arreglo = new int [1000];
    
    public Principal() {
        initComponents();
        btnReiniciar.setEnabled(false);
        btnOrdenar.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaShellSort = new javax.swing.JTable();
        btnArreglo = new javax.swing.JButton();
        btnOrdenar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaArreglo = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaQuickSort = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaBurbuja = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtBurbuja = new javax.swing.JTextField();
        txtQuick = new javax.swing.JTextField();
        txtShell = new javax.swing.JTextField();
        btnReiniciar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("MENÚ PRINCIPAL");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        tablaShellSort.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Índice", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaShellSort.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(tablaShellSort);
        if (tablaShellSort.getColumnModel().getColumnCount() > 0) {
            tablaShellSort.getColumnModel().getColumn(0).setResizable(false);
        }

        btnArreglo.setText("Crear arreglo");
        btnArreglo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArregloActionPerformed(evt);
            }
        });

        btnOrdenar.setText("Ordenar arreglo");
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Bubble Sort");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Quick Sort");

        tablaArreglo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Índice", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaArreglo);
        if (tablaArreglo.getColumnModel().getColumnCount() > 0) {
            tablaArreglo.getColumnModel().getColumn(0).setResizable(false);
            tablaArreglo.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Shell Sort");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        tablaQuickSort.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Índice", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaQuickSort.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tablaQuickSort);
        if (tablaQuickSort.getColumnModel().getColumnCount() > 0) {
            tablaQuickSort.getColumnModel().getColumn(0).setResizable(false);
        }

        tablaBurbuja.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Índice", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaBurbuja.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tablaBurbuja);
        if (tablaBurbuja.getColumnModel().getColumnCount() > 0) {
            tablaBurbuja.getColumnModel().getColumn(0).setResizable(false);
        }

        jLabel5.setText("Tiempo");

        jLabel6.setText("Tiempo");

        jLabel7.setText("Tiempo");

        txtBurbuja.setEditable(false);

        txtQuick.setEditable(false);

        txtShell.setEditable(false);

        btnReiniciar.setText("Reiniciar");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        jLabel8.setText("*tiempo en milisegundos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(263, 263, 263)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(btnReiniciar)))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnArreglo)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtBurbuja, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(btnOrdenar)
                    .addComponent(jLabel6)
                    .addComponent(txtQuick, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(txtShell, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addComponent(jLabel8))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnArreglo)
                            .addComponent(btnOrdenar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtBurbuja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtQuick, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtShell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(btnReiniciar))
                                .addGap(0, 4, Short.MAX_VALUE))
                            .addComponent(jSeparator1))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnArregloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArregloActionPerformed
        Random rnd = new Random();
        
        //se muestra el arreglo en la tabla
        DefaultTableModel dtm = (DefaultTableModel) tablaArreglo.getModel();
        
        //se genera el arreglo con números random del 0 al 10000
        for(int i=0; i<arreglo.length; i++){
            int valor = rnd.nextInt(10001);
            arreglo[i] = valor;

            dtm.addRow(new Object[]{i, arreglo[i]});
        }
        
        //se deshabilita el botón de crear arreglo
        btnArreglo.setEnabled(false);
        //se habilita el botón de reiniciar y ordenar
        btnOrdenar.setEnabled(true);
        
    }//GEN-LAST:event_btnArregloActionPerformed

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
        Funciones fn = new Funciones();
        
        //variables que medirán el tiempo
        long inicio;
        long tiempoTotal;
        float total;        
        
        //MÉTODO DE BURBUJA
        inicio = System.nanoTime();
        //se le pasa por parámetro un clon de arreglo para que no ordene el arreglo original
        int[] burbuja = fn.burbuja((int[]) arreglo.clone());
        tiempoTotal = System.nanoTime()-inicio;
        total = tiempoTotal / 1000000.0f;
        txtBurbuja.setText(String.format("%.9f", total));
 

        //imprime el arreglo ordenado
        DefaultTableModel dtm = (DefaultTableModel) tablaBurbuja.getModel();
        
        for(int i=0; i<arreglo.length; i++){
            dtm.addRow(new Object[]{i, burbuja[i]});
        }
         
        //MÉTODO QUICKSORT
        inicio = System.nanoTime();
        //se llama al método que ordena
        //se le pasan los parámetros arreglo, índice más bajo e índice más alto.
        int[] quick = fn.quickSort((int[])arreglo.clone(), 0, (arreglo.length-1));
        tiempoTotal = System.nanoTime()-inicio;
        total = tiempoTotal / 1000000.0f;
        txtQuick.setText(String.format("%.9f", total));
        
        //imprime el arreglo ordenado
        DefaultTableModel dtm1 = (DefaultTableModel) tablaQuickSort.getModel();
        
        for(int i=0; i<arreglo.length; i++){
            dtm1.addRow(new Object[]{i, quick[i]});
        }
        
        //MÉTODO SHELLSORT
        inicio = System.nanoTime();
        int[] shell = fn.shellSort((int[])arreglo.clone());
        tiempoTotal = System.nanoTime()-inicio;
        total = tiempoTotal / 1000000.0f;
        txtShell.setText(String.format("%.9f", total));
        
        //imprime el arreglo ordenado
        DefaultTableModel dtm2 = (DefaultTableModel) tablaShellSort.getModel();
        
        for(int i=0; i<arreglo.length; i++){
            dtm2.addRow(new Object[]{i, shell[i]});
        }
        
        //se desabilita el botón de ordenar arreglo
        btnOrdenar.setEnabled(false);
        //se habilita el botón de reiniciar
        btnReiniciar.setEnabled(true);
        
    }//GEN-LAST:event_btnOrdenarActionPerformed

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        
        //se vacían las tablas
        DefaultTableModel dtmArreglo = (DefaultTableModel) tablaArreglo.getModel();
        dtmArreglo.setRowCount(0);
        
        DefaultTableModel dtm = (DefaultTableModel) tablaBurbuja.getModel();
        dtm.setRowCount(0);
        
        DefaultTableModel dtm1 = (DefaultTableModel) tablaQuickSort.getModel();
        dtm1.setRowCount(0);
        
        DefaultTableModel dtm2 = (DefaultTableModel) tablaShellSort.getModel();
        dtm2.setRowCount(0);
        
        //se habilita el botón de crear arreglo
        btnArreglo.setEnabled(true);
        
        //se restablecen los tiempos
        txtBurbuja.setText("");
        txtQuick.setText("");
        txtShell.setText("");
    }//GEN-LAST:event_btnReiniciarActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArreglo;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tablaArreglo;
    private javax.swing.JTable tablaBurbuja;
    private javax.swing.JTable tablaQuickSort;
    private javax.swing.JTable tablaShellSort;
    private javax.swing.JTextField txtBurbuja;
    private javax.swing.JTextField txtQuick;
    private javax.swing.JTextField txtShell;
    // End of variables declaration//GEN-END:variables
}
