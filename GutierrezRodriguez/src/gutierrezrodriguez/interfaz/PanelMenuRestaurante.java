
package gutierrezrodriguez.interfaz;

import gutierrezrodriguez.dominio.Sistema;

public class PanelMenuRestaurante extends javax.swing.JPanel {
    
    private PanelMenuPrincipal panelMenuPrincipal;
    private PanelRealizarSorteo panelRealizarSorteo;
    private PanelRegistrarSorteo panelRegistrarSorteo;
    private PanelEvaluaciones panelEvaluaciones;
    private PanelFichaRestaurante panelFichaRestaurante;
    private Sistema sistema;

    public PanelMenuRestaurante() {
        initComponents();
    }

    public PanelMenuRestaurante(PanelRealizarSorteo panelRealizarSorteo, PanelRegistrarSorteo panelRegistrarSorteo, PanelEvaluaciones panelEvaluaciones, PanelFichaRestaurante panelFichaRestaurante, Sistema sistema){
        initComponents();
        this.panelRealizarSorteo = panelRealizarSorteo;
        this.panelRegistrarSorteo = panelRegistrarSorteo;
        this.panelEvaluaciones = panelEvaluaciones;
        this.panelFichaRestaurante = panelFichaRestaurante;
        this.sistema = sistema;
    }
    
    public void setPredecesor(PanelMenuPrincipal panelMenuPrincipal) {
        this.panelMenuPrincipal = panelMenuPrincipal;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonVerEvaluaciones1 = new javax.swing.JButton();
        labelRestaurante = new javax.swing.JLabel();
        botonRegistrarSorteo = new javax.swing.JButton();
        botonRealizarSorteo = new javax.swing.JButton();
        botonVolver = new javax.swing.JButton();
        botonVerEvaluaciones = new javax.swing.JButton();
        botonEditarFicha = new javax.swing.JButton();

        botonVerEvaluaciones1.setText("Ver evaluaciones");
        botonVerEvaluaciones1.setMaximumSize(new java.awt.Dimension(210, 50));
        botonVerEvaluaciones1.setMinimumSize(new java.awt.Dimension(210, 50));
        botonVerEvaluaciones1.setPreferredSize(new java.awt.Dimension(210, 50));
        botonVerEvaluaciones1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerEvaluaciones1ActionPerformed(evt);
            }
        });

        setMinimumSize(new java.awt.Dimension(500, 300));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(500, 300));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelRestaurante.setText("Rol: Restaurante");
        add(labelRestaurante, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, -1, -1));

        botonRegistrarSorteo.setBackground(new java.awt.Color(255, 255, 255));
        botonRegistrarSorteo.setText("Registrar sorteo");
        botonRegistrarSorteo.setMaximumSize(new java.awt.Dimension(210, 50));
        botonRegistrarSorteo.setMinimumSize(new java.awt.Dimension(210, 50));
        botonRegistrarSorteo.setPreferredSize(new java.awt.Dimension(210, 50));
        botonRegistrarSorteo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarSorteoActionPerformed(evt);
            }
        });
        add(botonRegistrarSorteo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 51, -1, 40));

        botonRealizarSorteo.setBackground(new java.awt.Color(255, 255, 255));
        botonRealizarSorteo.setText("Sortear");
        botonRealizarSorteo.setMaximumSize(new java.awt.Dimension(210, 50));
        botonRealizarSorteo.setMinimumSize(new java.awt.Dimension(210, 50));
        botonRealizarSorteo.setPreferredSize(new java.awt.Dimension(210, 50));
        botonRealizarSorteo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRealizarSorteoActionPerformed(evt);
            }
        });
        add(botonRealizarSorteo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 109, -1, 40));

        botonVolver.setBackground(new java.awt.Color(255, 255, 255));
        botonVolver.setText("Volver");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });
        add(botonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 12, -1, -1));

        botonVerEvaluaciones.setBackground(new java.awt.Color(255, 255, 255));
        botonVerEvaluaciones.setText("Ver evaluaciones");
        botonVerEvaluaciones.setMaximumSize(new java.awt.Dimension(210, 50));
        botonVerEvaluaciones.setMinimumSize(new java.awt.Dimension(210, 50));
        botonVerEvaluaciones.setPreferredSize(new java.awt.Dimension(210, 50));
        botonVerEvaluaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerEvaluacionesActionPerformed(evt);
            }
        });
        add(botonVerEvaluaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 167, -1, 40));

        botonEditarFicha.setBackground(new java.awt.Color(255, 255, 255));
        botonEditarFicha.setText("Editar ficha");
        botonEditarFicha.setMaximumSize(new java.awt.Dimension(210, 50));
        botonEditarFicha.setMinimumSize(new java.awt.Dimension(210, 50));
        botonEditarFicha.setPreferredSize(new java.awt.Dimension(210, 50));
        botonEditarFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarFichaActionPerformed(evt);
            }
        });
        add(botonEditarFicha, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 225, -1, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegistrarSorteoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarSorteoActionPerformed
        this.setVisible(false);
        this.panelRegistrarSorteo.setVisible(true);
    }//GEN-LAST:event_botonRegistrarSorteoActionPerformed

    private void botonRealizarSorteoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRealizarSorteoActionPerformed
        this.panelRealizarSorteo.actualizarListaSorteos();
        this.setVisible(false);
        this.panelRealizarSorteo.setVisible(true);
    }//GEN-LAST:event_botonRealizarSorteoActionPerformed

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        this.setVisible(false);
        panelMenuPrincipal.setVisible(true);
    }//GEN-LAST:event_botonVolverActionPerformed

    private void botonVerEvaluacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerEvaluacionesActionPerformed
        panelEvaluaciones.actualizarEvaluaciones();
        this.setVisible(false);
        panelEvaluaciones.setPredecesor(this);
        panelEvaluaciones.setPredecesorEsRestaurante(true);
        panelEvaluaciones.setVisible(true);
    }//GEN-LAST:event_botonVerEvaluacionesActionPerformed

    private void botonVerEvaluaciones1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerEvaluaciones1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonVerEvaluaciones1ActionPerformed

    private void botonEditarFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarFichaActionPerformed
        panelFichaRestaurante.actualizarDatos();
        this.setVisible(false);
        panelFichaRestaurante.setVisible(true);
    }//GEN-LAST:event_botonEditarFichaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEditarFicha;
    private javax.swing.JButton botonRealizarSorteo;
    private javax.swing.JButton botonRegistrarSorteo;
    private javax.swing.JButton botonVerEvaluaciones;
    private javax.swing.JButton botonVerEvaluaciones1;
    private javax.swing.JButton botonVolver;
    private javax.swing.JLabel labelRestaurante;
    // End of variables declaration//GEN-END:variables
}
