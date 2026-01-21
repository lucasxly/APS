/*
 * View BoasVindas_View
 * View usada para splash screen do programa
 */
package src.Views;

/*
 * @autor Guilherme Sbizero
 */
public class BoasVindas_View extends javax.swing.JFrame {

    /*
     * Construtor da view: chama o método que iniciliza os componentes GUI
     * Determina a localização da view ao centro da tela
     */
    public BoasVindas_View() {
        initComponents();
        this.setLocationRelativeTo(null);

    }

    // Método que inicializa os componentes GUI
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(423, 423));
        setUndecorated(true);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SplashScreen.png"))); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        // Instância da classe 
        BoasVindas_View splash = new BoasVindas_View();

        /* Instrução try...catch responsável por deixar visível a view.
          * Faz a view ficar ativa por 1,5 segundo
         */
        try {
            splash.setVisible(true);
            Thread.sleep(1500);
        } catch (InterruptedException ex) {

        }

        //chama o método fecharSplash que chama a view Principal_View e fecha a view BoasVindas_View
        splash.fecharSplash();

        //instruções nativas do java para criação da view
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BoasVindas_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BoasVindas_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BoasVindas_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BoasVindas_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });

    }

    //função ao fechar a splash
    public void fecharSplash() {
        //criar a tela de principal, e fechar o splash
        new Principal_View();
        super.dispose();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
