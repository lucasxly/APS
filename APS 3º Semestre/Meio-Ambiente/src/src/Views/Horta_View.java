/*
 * View Horta
 * View usada para ensinar como criar uma horta
 */
package src.Views;

import java.awt.Image;
import javax.swing.ImageIcon;
import src.Models.Interatividade_Interface;

/**
 *
 * @author Guilherme Sbizero
 */
public class Horta_View extends javax.swing.JFrame implements Interatividade_Interface {

    /*
     * Construtor com diferencial de inicializar componentes com propriedades de componentes GUI definidas pelo programador
     */
    public Horta_View() {
        initComponents();
        inicializarComponentes();
        setVisible(true);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_Next = new javax.swing.JLabel();
        btn_Prev = new javax.swing.JLabel();
        btn_Back = new javax.swing.JLabel();
        txt_espacoEscolherHorta = new javax.swing.JLabel();
        txt_ManterHorta = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1068, 470));
        setMinimumSize(new java.awt.Dimension(1068, 470));
        setPreferredSize(new java.awt.Dimension(1068, 470));
        setResizable(false);
        setSize(new java.awt.Dimension(1068, 470));

        jPanel1.setBackground(new java.awt.Color(131, 66, 5));
        jPanel1.setPreferredSize(new java.awt.Dimension(1068, 470));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Horta/next.png"))); // NOI18N
        btn_Next.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_NextMouseClicked(evt);
            }
        });
        jPanel1.add(btn_Next, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, -1, -1));

        btn_Prev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Horta/prev.png"))); // NOI18N
        btn_Prev.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Prev.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_PrevMouseClicked(evt);
            }
        });
        jPanel1.add(btn_Prev, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));

        btn_Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Horta/Back.png"))); // NOI18N
        btn_Back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_BackMouseClicked(evt);
            }
        });
        jPanel1.add(btn_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        txt_espacoEscolherHorta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Horta/TextosHortaEspaco.png"))); // NOI18N
        jPanel1.add(txt_espacoEscolherHorta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        txt_ManterHorta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Horta/TextosHortaManter.png"))); // NOI18N
        jPanel1.add(txt_ManterHorta, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 500, 400));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/JardimHorta/madeira_1068_470.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 11, 515, 420));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/JardimHorta/madeira_1068_470.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 11, 520, 420));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_NextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_NextMouseClicked
        mudarIcone("/Images/Horta/TextosHortaEscolherPlantar.png", 2);
    }//GEN-LAST:event_btn_NextMouseClicked

    private void btn_PrevMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_PrevMouseClicked
        mudarIcone("/Images/Horta/TextosHortaEspaco.png", 1);
    }//GEN-LAST:event_btn_PrevMouseClicked

    private void btn_BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_BackMouseClicked
        chamarView(1);
    }//GEN-LAST:event_btn_BackMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Horta_View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_Back;
    private javax.swing.JLabel btn_Next;
    private javax.swing.JLabel btn_Prev;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txt_ManterHorta;
    private javax.swing.JLabel txt_espacoEscolherHorta;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mudarIcone(String enderecoImg, int botao) {

        ImageIcon img = new ImageIcon(getClass().getResource(enderecoImg));
        Image icone = img.getImage();

        switch (botao) {

            case 1:
                txt_espacoEscolherHorta.setIcon(new ImageIcon(icone));
                btn_Prev.setVisible(false);
                btn_Next.setVisible(true);
                break;

            case 2:
                txt_espacoEscolherHorta.setIcon(new ImageIcon(icone));
                btn_Prev.setVisible(true);
                btn_Next.setVisible(false);
                break;

        }

    }

    @Override
    public void chamarView(int view) {

        new JardimHorta_View();
        super.dispose();

    }

    @Override
    public void inicializarComponentes() {
        btn_Prev.setVisible(false);
    }
}
