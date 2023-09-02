/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package drws.library.swing;

import drws.library.BancoDados;

/**
 *
 * @author drws
 */
public class MainFrame extends javax.swing.JFrame {
    private BancoDados bancoDados = new BancoDados();

    /**
     * Creates new form FrameMain
     */
    public MainFrame(BancoDados bancoDados) {
        this.bancoDados = bancoDados;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCadastro = new javax.swing.JPanel();
        panelNorth = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        panelSouth = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelWest = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        panelEast = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        panelCenter = new javax.swing.JPanel();
        buttonCadastrarAutor = new javax.swing.JButton();
        buttonCadastrarLeitor = new javax.swing.JButton();
        buttonCadastrarLivroBiblioteca = new javax.swing.JButton();
        buttonCadastrarLivroLoja = new javax.swing.JButton();
        panelPesquisa = new javax.swing.JPanel();
        panelNorth1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        panelSouth1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        panelWest1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        panelEast1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        panelCenter1 = new javax.swing.JPanel();
        buttonPesquisarAutor = new javax.swing.JButton();
        buttonPesquisarLeitor = new javax.swing.JButton();
        buttonPesquisarLivroAcervo = new javax.swing.JButton();
        buttonPesquisarLivroVenda = new javax.swing.JButton();
        panelRelatorios = new javax.swing.JPanel();
        panelNorth2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        panelSouth2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        panelWest2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        panelEast2 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        panelCenter2 = new javax.swing.JPanel();
        buttonRelatorioEmprestimos = new javax.swing.JButton();
        buttonRelatorioVendas = new javax.swing.JButton();
        buttonRelatorioLivrosEmprestados = new javax.swing.JButton();
        buttonRelatorioLivrosAtraso = new javax.swing.JButton();
        panelOperacoes = new javax.swing.JPanel();
        panelNorth3 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        panelSouth3 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        panelWest3 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        panelEast3 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        panelCenter3 = new javax.swing.JPanel();
        buttonEmprestar = new javax.swing.JButton();
        buttonVender = new javax.swing.JButton();
        buttonDevolver = new javax.swing.JButton();
        buttonConfigurar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Biblioteca TDS");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setPreferredSize(new java.awt.Dimension(765, 400));
        getContentPane().setLayout(new java.awt.GridLayout(2, 2, 5, 5));

        panelCadastro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastrar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 13))); // NOI18N
        panelCadastro.setLayout(new java.awt.BorderLayout());

        panelNorth.setLayout(new java.awt.GridLayout(2, 1));

        jLabel2.setText("     ");
        jLabel2.setEnabled(false);
        panelNorth.add(jLabel2);

        panelCadastro.add(panelNorth, java.awt.BorderLayout.NORTH);

        panelSouth.setLayout(new java.awt.GridLayout(2, 1));

        jLabel1.setText("     ");
        jLabel1.setEnabled(false);
        panelSouth.add(jLabel1);

        panelCadastro.add(panelSouth, java.awt.BorderLayout.SOUTH);

        panelWest.setLayout(new java.awt.GridLayout(1, 2));

        jLabel3.setText("     ");
        jLabel3.setEnabled(false);
        panelWest.add(jLabel3);

        jLabel6.setText("     ");
        jLabel6.setEnabled(false);
        panelWest.add(jLabel6);

        panelCadastro.add(panelWest, java.awt.BorderLayout.WEST);

        panelEast.setLayout(new java.awt.GridLayout(1, 2));

        jLabel4.setText("     ");
        jLabel4.setEnabled(false);
        panelEast.add(jLabel4);

        jLabel5.setText("     ");
        jLabel5.setEnabled(false);
        panelEast.add(jLabel5);

        panelCadastro.add(panelEast, java.awt.BorderLayout.EAST);

        panelCenter.setLayout(new java.awt.GridLayout(2, 2, 5, 5));

        buttonCadastrarAutor.setText("Autor");
        buttonCadastrarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadastrarAutorActionPerformed(evt);
            }
        });
        panelCenter.add(buttonCadastrarAutor);

        buttonCadastrarLeitor.setText("Leitor");
        buttonCadastrarLeitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadastrarLeitorActionPerformed(evt);
            }
        });
        panelCenter.add(buttonCadastrarLeitor);

        buttonCadastrarLivroBiblioteca.setText("Livro - Biblioteca");
        buttonCadastrarLivroBiblioteca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadastrarLivroBibliotecaActionPerformed(evt);
            }
        });
        panelCenter.add(buttonCadastrarLivroBiblioteca);

        buttonCadastrarLivroLoja.setText("Livro - Loja");
        buttonCadastrarLivroLoja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadastrarLivroLojaActionPerformed(evt);
            }
        });
        panelCenter.add(buttonCadastrarLivroLoja);

        panelCadastro.add(panelCenter, java.awt.BorderLayout.CENTER);

        getContentPane().add(panelCadastro);

        panelPesquisa.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 13))); // NOI18N
        panelPesquisa.setLayout(new java.awt.BorderLayout());

        panelNorth1.setLayout(new java.awt.GridLayout(2, 1));

        jLabel7.setText("     ");
        jLabel7.setEnabled(false);
        panelNorth1.add(jLabel7);

        panelPesquisa.add(panelNorth1, java.awt.BorderLayout.NORTH);

        panelSouth1.setLayout(new java.awt.GridLayout(2, 1));

        jLabel8.setText("     ");
        jLabel8.setEnabled(false);
        panelSouth1.add(jLabel8);

        panelPesquisa.add(panelSouth1, java.awt.BorderLayout.SOUTH);

        panelWest1.setLayout(new java.awt.GridLayout(1, 2));

        jLabel9.setText("     ");
        jLabel9.setEnabled(false);
        panelWest1.add(jLabel9);

        jLabel10.setText("     ");
        jLabel10.setEnabled(false);
        panelWest1.add(jLabel10);

        panelPesquisa.add(panelWest1, java.awt.BorderLayout.WEST);

        panelEast1.setLayout(new java.awt.GridLayout(1, 2));

        jLabel11.setText("     ");
        jLabel11.setEnabled(false);
        panelEast1.add(jLabel11);

        jLabel12.setText("     ");
        jLabel12.setEnabled(false);
        panelEast1.add(jLabel12);

        panelPesquisa.add(panelEast1, java.awt.BorderLayout.EAST);

        panelCenter1.setLayout(new java.awt.GridLayout(2, 2, 5, 5));

        buttonPesquisarAutor.setText("Autores");
        buttonPesquisarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPesquisarAutorActionPerformed(evt);
            }
        });
        panelCenter1.add(buttonPesquisarAutor);

        buttonPesquisarLeitor.setText("Leitores");
        buttonPesquisarLeitor.setEnabled(false);
        panelCenter1.add(buttonPesquisarLeitor);

        buttonPesquisarLivroAcervo.setText("Acervo");
        buttonPesquisarLivroAcervo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPesquisarLivroAcervoActionPerformed(evt);
            }
        });
        panelCenter1.add(buttonPesquisarLivroAcervo);

        buttonPesquisarLivroVenda.setText("Livros - Venda");
        buttonPesquisarLivroVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPesquisarLivroVendaActionPerformed(evt);
            }
        });
        panelCenter1.add(buttonPesquisarLivroVenda);

        panelPesquisa.add(panelCenter1, java.awt.BorderLayout.CENTER);

        getContentPane().add(panelPesquisa);

        panelRelatorios.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Relatórios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 13))); // NOI18N
        panelRelatorios.setLayout(new java.awt.BorderLayout());

        panelNorth2.setLayout(new java.awt.GridLayout(2, 1));

        jLabel13.setText("     ");
        jLabel13.setEnabled(false);
        panelNorth2.add(jLabel13);

        panelRelatorios.add(panelNorth2, java.awt.BorderLayout.NORTH);

        panelSouth2.setLayout(new java.awt.GridLayout(2, 1));

        jLabel14.setText("     ");
        jLabel14.setEnabled(false);
        panelSouth2.add(jLabel14);

        panelRelatorios.add(panelSouth2, java.awt.BorderLayout.SOUTH);

        panelWest2.setLayout(new java.awt.GridLayout(1, 2));

        jLabel15.setText("     ");
        jLabel15.setEnabled(false);
        panelWest2.add(jLabel15);

        jLabel16.setText("     ");
        jLabel16.setEnabled(false);
        panelWest2.add(jLabel16);

        panelRelatorios.add(panelWest2, java.awt.BorderLayout.WEST);

        panelEast2.setLayout(new java.awt.GridLayout(1, 2));

        jLabel17.setText("     ");
        jLabel17.setEnabled(false);
        panelEast2.add(jLabel17);

        jLabel18.setText("     ");
        jLabel18.setEnabled(false);
        panelEast2.add(jLabel18);

        panelRelatorios.add(panelEast2, java.awt.BorderLayout.EAST);

        panelCenter2.setLayout(new java.awt.GridLayout(2, 2, 5, 5));

        buttonRelatorioEmprestimos.setText("Empréstimos");
        buttonRelatorioEmprestimos.setEnabled(false);
        panelCenter2.add(buttonRelatorioEmprestimos);

        buttonRelatorioVendas.setText("Vendas");
        buttonRelatorioVendas.setEnabled(false);
        panelCenter2.add(buttonRelatorioVendas);

        buttonRelatorioLivrosEmprestados.setText("Livros Emprestados");
        buttonRelatorioLivrosEmprestados.setEnabled(false);
        panelCenter2.add(buttonRelatorioLivrosEmprestados);

        buttonRelatorioLivrosAtraso.setText("Livro em Atraso");
        buttonRelatorioLivrosAtraso.setEnabled(false);
        panelCenter2.add(buttonRelatorioLivrosAtraso);

        panelRelatorios.add(panelCenter2, java.awt.BorderLayout.CENTER);

        getContentPane().add(panelRelatorios);

        panelOperacoes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Operações ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 13))); // NOI18N
        panelOperacoes.setLayout(new java.awt.BorderLayout());

        panelNorth3.setLayout(new java.awt.GridLayout(2, 1));

        jLabel19.setText("     ");
        jLabel19.setEnabled(false);
        panelNorth3.add(jLabel19);

        panelOperacoes.add(panelNorth3, java.awt.BorderLayout.NORTH);

        panelSouth3.setLayout(new java.awt.GridLayout(2, 1));

        jLabel20.setText("     ");
        jLabel20.setEnabled(false);
        panelSouth3.add(jLabel20);

        panelOperacoes.add(panelSouth3, java.awt.BorderLayout.SOUTH);

        panelWest3.setLayout(new java.awt.GridLayout(1, 2));

        jLabel21.setText("     ");
        jLabel21.setEnabled(false);
        panelWest3.add(jLabel21);

        jLabel22.setText("     ");
        jLabel22.setEnabled(false);
        panelWest3.add(jLabel22);

        panelOperacoes.add(panelWest3, java.awt.BorderLayout.WEST);

        panelEast3.setLayout(new java.awt.GridLayout(1, 2));

        jLabel23.setText("     ");
        jLabel23.setEnabled(false);
        panelEast3.add(jLabel23);

        jLabel24.setText("     ");
        jLabel24.setEnabled(false);
        panelEast3.add(jLabel24);

        panelOperacoes.add(panelEast3, java.awt.BorderLayout.EAST);

        panelCenter3.setLayout(new java.awt.GridLayout(2, 2, 5, 5));

        buttonEmprestar.setText("Empréstimo");
        buttonEmprestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEmprestarActionPerformed(evt);
            }
        });
        panelCenter3.add(buttonEmprestar);

        buttonVender.setText("Venda");
        buttonVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVenderActionPerformed(evt);
            }
        });
        panelCenter3.add(buttonVender);

        buttonDevolver.setText("Devolução");
        buttonDevolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDevolverActionPerformed(evt);
            }
        });
        panelCenter3.add(buttonDevolver);

        buttonConfigurar.setText("Customizar");
        buttonConfigurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonConfigurarActionPerformed(evt);
            }
        });
        panelCenter3.add(buttonConfigurar);

        panelOperacoes.add(panelCenter3, java.awt.BorderLayout.CENTER);

        getContentPane().add(panelOperacoes);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCadastrarLeitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadastrarLeitorActionPerformed
        CadastrarLeitorDialog cadastrarLeitorDialog = new CadastrarLeitorDialog(this, true, this.bancoDados);
        cadastrarLeitorDialog.setVisible(true);
    }//GEN-LAST:event_buttonCadastrarLeitorActionPerformed

    private void buttonCadastrarLivroBibliotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadastrarLivroBibliotecaActionPerformed
        CadastrarLivroDialog cadastrarLivroDialog = new CadastrarLivroDialog(this, true, this.bancoDados);
        cadastrarLivroDialog.setVisible(true);
    }//GEN-LAST:event_buttonCadastrarLivroBibliotecaActionPerformed

    private void buttonCadastrarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadastrarAutorActionPerformed
        CadastrarAutorDialog cadastrarAutorDialog = new CadastrarAutorDialog(this, true, this.bancoDados);
        cadastrarAutorDialog.setVisible(true);
    }//GEN-LAST:event_buttonCadastrarAutorActionPerformed

    private void buttonPesquisarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPesquisarAutorActionPerformed
        AutoresFrame autoresFrame = new AutoresFrame(bancoDados);
        autoresFrame.setVisible(true);
    }//GEN-LAST:event_buttonPesquisarAutorActionPerformed

    private void buttonPesquisarLivroAcervoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPesquisarLivroAcervoActionPerformed
        AcervoFrame acervoFrame = new AcervoFrame(this.bancoDados);
        acervoFrame.setVisible(true);
        
    }//GEN-LAST:event_buttonPesquisarLivroAcervoActionPerformed

    private void buttonEmprestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEmprestarActionPerformed
        EmprestimoFrame emprestimoFrame = new EmprestimoFrame(this.bancoDados);
        emprestimoFrame.setVisible(true);
    }//GEN-LAST:event_buttonEmprestarActionPerformed

    private void buttonDevolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDevolverActionPerformed
        DevolucaoFrame devolucaoFrame = new DevolucaoFrame(bancoDados);
        devolucaoFrame.setVisible(true);
    }//GEN-LAST:event_buttonDevolverActionPerformed

    private void buttonConfigurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonConfigurarActionPerformed
        CustomizarDialog customizarDialog = new CustomizarDialog(this, rootPaneCheckingEnabled);
        customizarDialog.setVisible(true);
    }//GEN-LAST:event_buttonConfigurarActionPerformed

    private void buttonCadastrarLivroLojaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadastrarLivroLojaActionPerformed
        CadastrarLivroVendaDialog cadastrarLivroVendaDialog = new CadastrarLivroVendaDialog(this, rootPaneCheckingEnabled, bancoDados);
        cadastrarLivroVendaDialog.setVisible(true);
    }//GEN-LAST:event_buttonCadastrarLivroLojaActionPerformed

    private void buttonPesquisarLivroVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPesquisarLivroVendaActionPerformed
        CatalogoFrame catalogoFrame = new CatalogoFrame(bancoDados);
        catalogoFrame.setVisible(true);
    }//GEN-LAST:event_buttonPesquisarLivroVendaActionPerformed

    private void buttonVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVenderActionPerformed
        VendaFrame vendaFrame = new VendaFrame(bancoDados);
        vendaFrame.setVisible(true);
    }//GEN-LAST:event_buttonVenderActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCadastrarAutor;
    private javax.swing.JButton buttonCadastrarLeitor;
    private javax.swing.JButton buttonCadastrarLivroBiblioteca;
    private javax.swing.JButton buttonCadastrarLivroLoja;
    private javax.swing.JButton buttonConfigurar;
    private javax.swing.JButton buttonDevolver;
    private javax.swing.JButton buttonEmprestar;
    private javax.swing.JButton buttonPesquisarAutor;
    private javax.swing.JButton buttonPesquisarLeitor;
    private javax.swing.JButton buttonPesquisarLivroAcervo;
    private javax.swing.JButton buttonPesquisarLivroVenda;
    private javax.swing.JButton buttonRelatorioEmprestimos;
    private javax.swing.JButton buttonRelatorioLivrosAtraso;
    private javax.swing.JButton buttonRelatorioLivrosEmprestados;
    private javax.swing.JButton buttonRelatorioVendas;
    private javax.swing.JButton buttonVender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel panelCadastro;
    private javax.swing.JPanel panelCenter;
    private javax.swing.JPanel panelCenter1;
    private javax.swing.JPanel panelCenter2;
    private javax.swing.JPanel panelCenter3;
    private javax.swing.JPanel panelEast;
    private javax.swing.JPanel panelEast1;
    private javax.swing.JPanel panelEast2;
    private javax.swing.JPanel panelEast3;
    private javax.swing.JPanel panelNorth;
    private javax.swing.JPanel panelNorth1;
    private javax.swing.JPanel panelNorth2;
    private javax.swing.JPanel panelNorth3;
    private javax.swing.JPanel panelOperacoes;
    private javax.swing.JPanel panelPesquisa;
    private javax.swing.JPanel panelRelatorios;
    private javax.swing.JPanel panelSouth;
    private javax.swing.JPanel panelSouth1;
    private javax.swing.JPanel panelSouth2;
    private javax.swing.JPanel panelSouth3;
    private javax.swing.JPanel panelWest;
    private javax.swing.JPanel panelWest1;
    private javax.swing.JPanel panelWest2;
    private javax.swing.JPanel panelWest3;
    // End of variables declaration//GEN-END:variables
}