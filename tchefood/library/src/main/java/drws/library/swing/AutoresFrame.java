/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package drws.library.swing;

import drws.library.BancoDados;
import drws.library.model.Autor;
import java.util.List;
import javax.swing.table.TableModel;

/**
 *
 * @author drws
 */
public class AutoresFrame extends javax.swing.JFrame {
    private BancoDados bancoDados;
    /**
     * Creates new form AutoresFrame
     */
    public AutoresFrame(BancoDados bancoDados) {
        this.bancoDados = bancoDados;
        initComponents();
        this.textFieldNome.requestFocus();
        tableAutores.setModel(initTable());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelNome = new javax.swing.JLabel();
        labelPais = new javax.swing.JLabel();
        textFieldNome = new javax.swing.JTextField();
        textFieldPais = new javax.swing.JTextField();
        buttonCancelar = new javax.swing.JButton();
        buttonVerLivros = new javax.swing.JButton();
        buttonEditar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAutores = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista de Autores");
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        labelNome.setText("Nome:");

        labelPais.setText("País:");

        textFieldNome.setColumns(20);
        textFieldNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldNomeFocusLost(evt);
            }
        });

        textFieldPais.setColumns(20);
        textFieldPais.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldPaisFocusLost(evt);
            }
        });

        buttonCancelar.setText("Cancelar");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });

        buttonVerLivros.setText("Ver Livros");
        buttonVerLivros.setEnabled(false);

        buttonEditar.setText("Editar");
        buttonEditar.setMaximumSize(new java.awt.Dimension(76, 23));
        buttonEditar.setMinimumSize(new java.awt.Dimension(76, 23));
        buttonEditar.setPreferredSize(new java.awt.Dimension(76, 23));
        buttonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarActionPerformed(evt);
            }
        });

        tableAutores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "País", "Qtde Livros"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableAutores.setShowGrid(true);
        jScrollPane1.setViewportView(tableAutores);
        tableAutores.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tableAutores.getColumnModel().getColumnCount() > 0) {
            tableAutores.getColumnModel().getColumn(0).setPreferredWidth(20);
            tableAutores.getColumnModel().getColumn(3).setPreferredWidth(30);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNome)
                    .addComponent(labelPais))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textFieldNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                    .addComponent(textFieldPais, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(90, 90, 90))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(buttonVerLivros)
                .addGap(18, 18, 18)
                .addComponent(buttonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonCancelar)
                .addGap(45, 45, 45))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {buttonCancelar, buttonEditar, buttonVerLivros});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNome)
                    .addComponent(textFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPais)
                    .addComponent(textFieldPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(89, 89, 89)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCancelar)
                    .addComponent(buttonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonVerLivros))
                .addGap(25, 25, 25))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {buttonCancelar, buttonEditar, buttonVerLivros});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void buttonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarActionPerformed
        int linha = tableAutores.getSelectedRow();
        
        if(linha != -1) {
            Object codigo = tableAutores.getValueAt(linha, 0);
            int indexAutor = this.bancoDados.getIndexAutorPeloCodigo((int) codigo);
            EditarAutorDialog editarAutorDialog = new EditarAutorDialog(this, true, bancoDados, indexAutor);
            editarAutorDialog.setTitle("Editar Autor");
            editarAutorDialog.setVisible(true);            
        }
    }//GEN-LAST:event_buttonEditarActionPerformed

    private void textFieldPaisFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldPaisFocusLost
        this.filtrar();
    }//GEN-LAST:event_textFieldPaisFocusLost

    private void textFieldNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldNomeFocusLost
        this.filtrar();
    }//GEN-LAST:event_textFieldNomeFocusLost

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        tableAutores.setModel(initTable());
        this.filtrar();
    }//GEN-LAST:event_formWindowGainedFocus
    
    
    private TableModel initTable() {
        return new AutorTableModel(bancoDados.getAutores());
    }
    
    public void limparTela() {
        this.textFieldNome.setText(null);
        this.textFieldPais.setText(null);
        //this.tableAutores.setModel(initTable());
        this.tableAutores.clearSelection();
    }
    
    private void filtrar() {
        String nome = this.textFieldNome.getText().toLowerCase(); //deixar como atributos e ir trocando ou é melhor criar dinamicamente as variaveis?
        nome.trim().replaceAll("\\s+", "");
        String pais = this.textFieldPais.getText().toLowerCase();
        AutorTableModel tableModel = new AutorTableModel(bancoDados.filtrarAutores(nome, pais));
        tableAutores.setModel(tableModel);
    }
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
            java.util.logging.Logger.getLogger(AutoresFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AutoresFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AutoresFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AutoresFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonEditar;
    private javax.swing.JButton buttonVerLivros;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelPais;
    private javax.swing.JTable tableAutores;
    private javax.swing.JTextField textFieldNome;
    private javax.swing.JTextField textFieldPais;
    // End of variables declaration//GEN-END:variables
}