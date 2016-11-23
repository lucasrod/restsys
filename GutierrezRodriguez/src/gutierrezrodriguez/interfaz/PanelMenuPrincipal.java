package gutierrezrodriguez.interfaz;

import gutierrezrodriguez.dominio.Sistema;

public class PanelMenuPrincipal extends javax.swing.JPanel {

    Sistema sistema;

    public PanelMenuPrincipal() {
        initComponents();
    }

    public PanelMenuPrincipal(Sistema sistema) {
        this.sistema = sistema;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonRestaurante = new javax.swing.JButton();
        labelRol = new javax.swing.JLabel();
        botonCliente = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(500, 300));

        botonRestaurante.setText("Restaurante");
        botonRestaurante.setMaximumSize(new java.awt.Dimension(210, 50));
        botonRestaurante.setMinimumSize(new java.awt.Dimension(210, 50));
        botonRestaurante.setPreferredSize(new java.awt.Dimension(210, 50));
        botonRestaurante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRestauranteActionPerformed(evt);
            }
        });

        labelRol.setText("Elija su rol");

        botonCliente.setText("Cliente");
        botonCliente.setMaximumSize(new java.awt.Dimension(210, 50));
        botonCliente.setMinimumSize(new java.awt.Dimension(210, 50));
        botonCliente.setPreferredSize(new java.awt.Dimension(210, 50));
        botonCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonClienteActionPerformed(evt);
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
                        .addComponent(labelRol))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelRol)
                .addGap(35, 35, 35)
                .addComponent(botonRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(botonCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonRestauranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRestauranteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonRestauranteActionPerformed

    private void botonClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonClienteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCliente;
    private javax.swing.JButton botonRestaurante;
    private javax.swing.JLabel labelRol;
    // End of variables declaration//GEN-END:variables
}
