package gutierrezrodriguez.interfaz;

import gutierrezrodriguez.dominio.Cliente;
import gutierrezrodriguez.dominio.Sistema;
import javax.swing.JOptionPane;

public class PanelRegistrarCliente extends javax.swing.JPanel {

    private PanelMenuCliente panelMenuCliente;
    private Sistema sistema;

    public PanelRegistrarCliente() {
        initComponents();
    }

    public PanelRegistrarCliente(Sistema sistema) {
        initComponents();
        this.sistema = sistema;
    }

    public void setPredecesor(PanelMenuCliente panelMenuCliente) {
        this.panelMenuCliente = panelMenuCliente;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelRegistrarse = new javax.swing.JLabel();
        botonVolver = new javax.swing.JButton();
        labelNombre = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        botonRegistrarse = new javax.swing.JButton();
        textFieldNombre = new javax.swing.JTextField();
        textFieldEmail = new javax.swing.JTextField();

        setMinimumSize(new java.awt.Dimension(500, 300));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelRegistrarse.setText("Registrarse como cliente");
        add(labelRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, -1, -1));

        botonVolver.setBackground(new java.awt.Color(255, 255, 255));
        botonVolver.setText("Volver");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });
        add(botonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 12, -1, -1));

        labelNombre.setText("Nombre");
        add(labelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        labelEmail.setText("Email");
        add(labelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));

        botonRegistrarse.setBackground(new java.awt.Color(255, 255, 255));
        botonRegistrarse.setText("Registrarse");
        botonRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarseActionPerformed(evt);
            }
        });
        add(botonRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 255, -1, -1));
        add(textFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 87, 233, -1));
        add(textFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 136, 233, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        panelMenuCliente.actualizarListaClientes();
        this.setVisible(false);
        this.panelMenuCliente.setVisible(true);
    }//GEN-LAST:event_botonVolverActionPerformed

    private void botonRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarseActionPerformed
        if (textFieldNombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar su nombre", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            Cliente cliente = new Cliente(textFieldNombre.getText(), textFieldEmail.getText());
            sistema.setClientes(cliente);
            JOptionPane.showMessageDialog(null, "Se ha registrado con éxito", "Éxito", JOptionPane.PLAIN_MESSAGE);
            botonVolver.doClick();
            panelMenuCliente.seleccionarElUltimo();
        }
    }//GEN-LAST:event_botonRegistrarseActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRegistrarse;
    private javax.swing.JButton botonVolver;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelRegistrarse;
    private javax.swing.JTextField textFieldEmail;
    private javax.swing.JTextField textFieldNombre;
    // End of variables declaration//GEN-END:variables
}
