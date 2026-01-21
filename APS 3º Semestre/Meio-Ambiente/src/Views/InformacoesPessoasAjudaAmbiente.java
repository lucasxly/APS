/*
 * View InformacoesPessoasAjudaAmbiente
 * View usada para exibir informações dos heróis da natureza
 */
package src.Views;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Guilherme Sbizero
 */
public class InformacoesPessoasAjudaAmbiente extends javax.swing.JFrame {

    // variável static para definir qual héroi que deverá ser exibido 
    private static int heroi = 0;

    public InformacoesPessoasAjudaAmbiente() {
        initComponents();
        inicializarComponentes();
        setVisible(true);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_Back = new javax.swing.JLabel();
        pessoa_lbl = new javax.swing.JLabel();
        fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Horta/Back.png"))); // NOI18N
        btn_Back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_BackMouseClicked(evt);
            }
        });
        jPanel1.add(btn_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        pessoa_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/InformacoesPessoaAjudaAmbiente/Leonardo.png"))); // NOI18N
        jPanel1.add(pessoa_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, -1));

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/InformacoesPessoaAjudaAmbiente/Fundo.png"))); // NOI18N
        jPanel1.add(fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btn_BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_BackMouseClicked
        new PessoasAjudaAmbiente();
        super.dispose();
    }//GEN-LAST:event_btn_BackMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformacoesPessoasAjudaAmbiente().setVisible(true);
            }
        });
    }

    // Métodos get e set para definir qual herói deverá ser exibido    
    public static int getHeroi() {
        return heroi;
    }

    public static void setHeroi(int heroi) {
        InformacoesPessoasAjudaAmbiente.heroi = heroi;
    }

    // Método para escolher o herói a ser exibido, dependendo do valor do atributo static herói 
    private void inicializarComponentes() {

        if (heroi == 1) {
            mostrarInformacoesHeroi("/Images/InformacoesPessoaAjudaAmbiente/Leonardo.png");
        } else if (heroi == 2) {
            mostrarInformacoesHeroi("/Images/InformacoesPessoaAjudaAmbiente/Angelina.png");
        } else if (heroi == 3) {
            mostrarInformacoesHeroi("/Images/InformacoesPessoaAjudaAmbiente/Gisele.png");
        }

    }

    // Método para setar o herói
    private void mostrarInformacoesHeroi(String enderecoImg) {

        ImageIcon img = new ImageIcon(getClass().getResource(enderecoImg));
        Image icone = img.getImage();

        pessoa_lbl.setIcon(new ImageIcon(icone));

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_Back;
    private javax.swing.JLabel fundo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel pessoa_lbl;
    // End of variables declaration//GEN-END:variables
}
