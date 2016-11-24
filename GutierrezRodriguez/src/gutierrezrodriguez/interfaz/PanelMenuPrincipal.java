package gutierrezrodriguez.interfaz;

import gutierrezrodriguez.dominio.Sistema;

public class PanelMenuPrincipal extends javax.swing.JPanel {

    private Sistema sistema;
    private PanelMenuCliente panelmenucliente;
    private PanelMenuRestaurante panelmenurestaurante;

    public PanelMenuPrincipal() {
        initComponents();
    }

    public PanelMenuPrincipal(Sistema sistema, PanelMenuCliente panelmenucliente, PanelMenuRestaurante panelmenurestaurante) {
        initComponents();
        this.sistema = sistema;
        this.panelmenucliente = panelmenucliente;
        this.panelmenurestaurante = panelmenurestaurante;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonRestaurante = new javax.swing.JButton();
        labelRol = new javax.swing.JLabel();
        botonCliente = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(500, 300));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonRestaurante.setBackground(new java.awt.Color(255, 255, 255));
        botonRestaurante.setText("Restaurante");
        botonRestaurante.setMaximumSize(new java.awt.Dimension(210, 50));
        botonRestaurante.setMinimumSize(new java.awt.Dimension(210, 50));
        botonRestaurante.setPreferredSize(new java.awt.Dimension(210, 50));
        botonRestaurante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRestauranteActionPerformed(evt);
            }
        });
        add(botonRestaurante, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 81, -1, -1));

        labelRol.setText("Elija su rol");
        add(labelRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, -1, -1));

        botonCliente.setBackground(new java.awt.Color(255, 255, 255));
        botonCliente.setText("Cliente");
        botonCliente.setMaximumSize(new java.awt.Dimension(210, 50));
        botonCliente.setMinimumSize(new java.awt.Dimension(210, 50));
        botonCliente.setPreferredSize(new java.awt.Dimension(210, 50));
        botonCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonClienteActionPerformed(evt);
            }
        });
        add(botonCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 174, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void botonRestauranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRestauranteActionPerformed
        this.setVisible(false);
        this.panelmenurestaurante.setVisible(true);
    }//GEN-LAST:event_botonRestauranteActionPerformed

    private void botonClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonClienteActionPerformed
        this.panelmenucliente.actualizarListaClientes();
        this.setVisible(false);
        this.panelmenucliente.setVisible(true);
    }//GEN-LAST:event_botonClienteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCliente;
    private javax.swing.JButton botonRestaurante;
    private javax.swing.JLabel labelRol;
    // End of variables declaration//GEN-END:variables
}
