/*
 * View PessoasAjudaAmbiente
 * View usada para seleção das 3 pessoa que mais ajudaram o meio ambiente
 */
package src.Views;

/**
 *
 * @author Guilherme Sbizero
 */
public class PessoasAjudaAmbiente extends javax.swing.JFrame implements Interatividade_Interface {

    /**
     * Construtor
     */
    public PessoasAjudaAmbiente() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        leonardo_lbl = new javax.swing.JLabel();
        gisele_lbl = new javax.swing.JLabel();
        angelina_lbl = new javax.swing.JLabel();
        btn_Back = new javax.swing.JLabel();
        Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(840, 840));
        setMinimumSize(new java.awt.Dimension(840, 470));
        setResizable(false);
        setSize(new java.awt.Dimension(840, 470));

        jPanel1.setMaximumSize(new java.awt.Dimension(840, 840));
        jPanel1.setMinimumSize(new java.awt.Dimension(840, 470));
        jPanel1.setPreferredSize(new java.awt.Dimension(840, 840));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/PessoasAjudaAmbiente/TituloPessosAjudaAmbiente.png"))); // NOI18N
        jPanel1.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, -1, 140));

        leonardo_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/PessoasAjudaAmbiente/Leonardo.png"))); // NOI18N
        leonardo_lbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        leonardo_lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                leonardo_lblMouseClicked(evt);
            }
        });
        jPanel1.add(leonardo_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        gisele_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/PessoasAjudaAmbiente/Gisele.png"))); // NOI18N
        gisele_lbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gisele_lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gisele_lblMouseClicked(evt);
            }
        });
        jPanel1.add(gisele_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, -1, -1));

        angelina_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/PessoasAjudaAmbiente/Angelina.png"))); // NOI18N
        angelina_lbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        angelina_lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                angelina_lblMouseClicked(evt);
            }
        });
        jPanel1.add(angelina_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 140, -1, -1));

        btn_Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Horta/Back.png"))); // NOI18N
        btn_Back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_BackMouseClicked(evt);
            }
        });
        jPanel1.add(btn_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/PessoasAjudaAmbiente/madeira_1068_470.png"))); // NOI18N
        jPanel1.add(Fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 0, 950, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 922, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_BackMouseClicked
        new Principal_View();
        super.dispose();
    }//GEN-LAST:event_btn_BackMouseClicked

    private void leonardo_lblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leonardo_lblMouseClicked
        chamarView(1);
    }//GEN-LAST:event_leonardo_lblMouseClicked

    private void angelina_lblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_angelina_lblMouseClicked
        chamarView(2);
    }//GEN-LAST:event_angelina_lblMouseClicked

    private void gisele_lblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gisele_lblMouseClicked
        chamarView(3);
    }//GEN-LAST:event_gisele_lblMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PessoasAjudaAmbiente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fundo;
    private javax.swing.JLabel angelina_lbl;
    private javax.swing.JLabel btn_Back;
    private javax.swing.JLabel gisele_lbl;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel leonardo_lbl;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables

    public void mudarIcone(String enderecoImg, int botao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void chamarView(int view) {
        InformacoesPessoasAjudaAmbiente.setHeroi(view);
        new InformacoesPessoasAjudaAmbiente();
        super.dispose();
    }

    public void inicializarComponentes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
