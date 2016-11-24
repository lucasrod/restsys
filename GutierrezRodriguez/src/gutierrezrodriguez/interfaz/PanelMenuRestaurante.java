
package gutierrezrodriguez.interfaz;

import gutierrezrodriguez.dominio.Sistema;

public class PanelMenuRestaurante extends javax.swing.JPanel {
    
    PanelMenuPrincipal panelMenuPrincipal;
    PanelRealizarSorteo panelRealizarSorteo;
    PanelRegistrarSorteo panelRegistrarSorteo;
    Sistema sistema;

    public PanelMenuRestaurante() {
        initComponents();
    }

    public PanelMenuRestaurante(PanelMenuPrincipal panelMenuPrincipal, PanelRealizarSorteo panelRealizarSorteo, PanelRegistrarSorteo panelRegistrarSorteo, Sistema sistema){
        initComponents();
        this.panelMenuPrincipal = panelMenuPrincipal;
        this.panelRealizarSorteo = panelRealizarSorteo;
        this.panelRegistrarSorteo = panelRegistrarSorteo;
        this.sistema = sistema;
    }
    
    public void setPredecesor(PanelMenuPrincipal panelMenuPrincipal) {
        this.panelMenuPrincipal = panelMenuPrincipal;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelRestaurante = new javax.swing.JLabel();
        botonRegistrarSorteo = new javax.swing.JButton();
        botonRealizarSorteo = new javax.swing.JButton();
        botonVolver = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(500, 300));

        labelRestaurante.setText("Rol: Restaurante");

        botonRegistrarSorteo.setText("Registrar sorteo");
        botonRegistrarSorteo.setMaximumSize(new java.awt.Dimension(210, 50));
        botonRegistrarSorteo.setMinimumSize(new java.awt.Dimension(210, 50));
        botonRegistrarSorteo.setPreferredSize(new java.awt.Dimension(210, 50));
        botonRegistrarSorteo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarSorteoActionPerformed(evt);
            }
        });

        botonRealizarSorteo.setText("Sortear");
        botonRealizarSorteo.setMaximumSize(new java.awt.Dimension(210, 50));
        botonRealizarSorteo.setMinimumSize(new java.awt.Dimension(210, 50));
        botonRealizarSorteo.setPreferredSize(new java.awt.Dimension(210, 50));
        botonRealizarSorteo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRealizarSorteoActionPerformed(evt);
            }
        });

        botonVolver.setText("Volver");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelRestaurante)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonVolver))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonRegistrarSorteo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonRealizarSorteo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 136, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelRestaurante)
                    .addComponent(botonVolver))
                .addGap(22, 22, 22)
                .addComponent(botonRegistrarSorteo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(botonRealizarSorteo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegistrarSorteoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarSorteoActionPerformed
        this.setVisible(false);
        this.panelRegistrarSorteo.setVisible(true);
    }//GEN-LAST:event_botonRegistrarSorteoActionPerformed

    private void botonRealizarSorteoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRealizarSorteoActionPerformed
        this.setVisible(false);
        this.panelRealizarSorteo.setVisible(true);
    }//GEN-LAST:event_botonRealizarSorteoActionPerformed

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        this.setVisible(false);
        panelMenuPrincipal.setVisible(true);
    }//GEN-LAST:event_botonVolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRealizarSorteo;
    private javax.swing.JButton botonRegistrarSorteo;
    private javax.swing.JButton botonVolver;
    private javax.swing.JLabel labelRestaurante;
    // End of variables declaration//GEN-END:variables
}
