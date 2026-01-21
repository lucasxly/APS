/*
 * View Jardim
 * View usada para ensinar como criar um jardim
 */
package src.Views;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Guilherme Sbizero
 */
public class Jardim_View extends javax.swing.JFrame implements Interatividade_Interface {

    private int paginasJardim = 1;
    private int paginasPlanta = 1;

    public Jardim_View() {
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
        btn_Prev1 = new javax.swing.JLabel();
        btn_Next1 = new javax.swing.JLabel();
        btn_Back = new javax.swing.JLabel();
        txt_baseJardim = new javax.swing.JLabel();
        txt_estilosPlantas = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1068, 470));
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
        jPanel1.add(btn_Next, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, -1, -1));

        btn_Prev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Horta/prev.png"))); // NOI18N
        btn_Prev.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Prev.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_PrevMouseClicked(evt);
            }
        });
        jPanel1.add(btn_Prev, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        btn_Prev1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Horta/prev.png"))); // NOI18N
        btn_Prev1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Prev1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_Prev1MouseClicked(evt);
            }
        });
        jPanel1.add(btn_Prev1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 380, -1, -1));

        btn_Next1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Horta/next.png"))); // NOI18N
        btn_Next1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Next1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_Next1MouseClicked(evt);
            }
        });
        jPanel1.add(btn_Next1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 380, -1, -1));

        btn_Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Horta/Back.png"))); // NOI18N
        btn_Back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_BackMouseClicked(evt);
            }
        });
        jPanel1.add(btn_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        txt_baseJardim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Jardim/TextosJardimBase.png"))); // NOI18N
        jPanel1.add(txt_baseJardim, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        txt_estilosPlantas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Jardim/TextosEstiloPlantaCactos.png"))); // NOI18N
        jPanel1.add(txt_estilosPlantas, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 500, 400));

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

        if (paginasJardim == 1) {

            paginasJardim = 2;
            mudarIcone("/Images/Jardim/TextosJardimBase2.png", 2);

        } else if (paginasJardim == 2) {

            paginasJardim = 3;
            mudarIcone("/Images/Jardim/TextosJardimBase3.png", 2);

        }


    }//GEN-LAST:event_btn_NextMouseClicked

    private void btn_PrevMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_PrevMouseClicked

        if (paginasJardim == 3) {

            paginasJardim = 2;
            mudarIcone("/Images/Jardim/TextosJardimBase2.png", 1);

        } else if (paginasJardim == 2) {

            paginasJardim = 1;
            mudarIcone("/Images/Jardim/TextosJardimBase.png", 1);

        }


    }//GEN-LAST:event_btn_PrevMouseClicked

    private void btn_BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_BackMouseClicked
        chamarView(1);
    }//GEN-LAST:event_btn_BackMouseClicked

    private void btn_Next1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Next1MouseClicked

        if (paginasPlanta == 1) {

            paginasPlanta = 2;

            mudarIcone("/Images/Jardim/TextosEstiloPlantaClusia.png", 4);

        } else if (paginasPlanta == 2) {

            paginasPlanta = 3;
            mudarIcone("/Images/Jardim/TextosEstiloPlantaLuca.png", 4);

        }

    }//GEN-LAST:event_btn_Next1MouseClicked

    private void btn_Prev1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Prev1MouseClicked

        if (paginasPlanta == 3) {

            paginasPlanta = 2;
            mudarIcone("/Images/Jardim/TextosEstiloPlantaClusia.png", 3);

        } else if (paginasPlanta == 2) {

            paginasPlanta = 1;
            mudarIcone("/Images/Jardim/TextosEstiloPlantaCactos.png", 3);

        }
    }//GEN-LAST:event_btn_Prev1MouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jardim_View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_Back;
    private javax.swing.JLabel btn_Next;
    private javax.swing.JLabel btn_Next1;
    private javax.swing.JLabel btn_Prev;
    private javax.swing.JLabel btn_Prev1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txt_baseJardim;
    private javax.swing.JLabel txt_estilosPlantas;
    // End of variables declaration//GEN-END:variables


    public void mudarIcone(String enderecoImg, int botao) {

        ImageIcon img = new ImageIcon(getClass().getResource(enderecoImg));
        Image icone = img.getImage();

        switch (botao) {

            case 1:

                /*início do algoritmo de alteração dos estados dos botões das páginas 
                                 "base para ter um jardim" 
                 */
                txt_baseJardim.setIcon(new ImageIcon(icone));

                if (paginasJardim == 2) {
                    btn_Next.setVisible(true);
                } else if (paginasJardim == 1) {

                    btn_Prev.setVisible(false);

                }

                break;

            case 2:
                txt_baseJardim.setIcon(new ImageIcon(icone));

                if (paginasJardim == 2) {

                    btn_Prev.setVisible(true);

                } else if (paginasJardim == 3) {

                    btn_Next.setVisible(false);

                }

                break;

            /*fim do algoritmo de alteração dos estados dos botões das páginas 
                              "base para ter um jardim" 
             */
            case 3:

                /*início do algoritmo de alteração dos estados dos botões das páginas 
                                 "alguns estilos de plantas" 
                 */
                txt_estilosPlantas.setIcon(new ImageIcon(icone));

                if (paginasPlanta == 2) {
                    btn_Next1.setVisible(true);
                } else if (paginasPlanta == 1) {

                    btn_Prev1.setVisible(false);

                }

                break;

            case 4:
                txt_estilosPlantas.setIcon(new ImageIcon(icone));

                if (paginasPlanta == 2) {

                    btn_Prev1.setVisible(true);

                } else if (paginasPlanta == 3) {

                    btn_Next1.setVisible(false);

                }

                break;

            /*fim do algoritmo de alteração dos estados dos botões das páginas 
                                 "alguns estilos de plantas" 
             */
        }

    }

    public void chamarView(int view) {

        new JardimHorta_View();
        super.dispose();

    }

    public void inicializarComponentes() {
        btn_Prev.setVisible(false);
        btn_Prev1.setVisible(false);
    }
}
