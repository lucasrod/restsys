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

        labelRegistrarse.setText("Registrarse como cliente");

        botonVolver.setText("Volver");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        labelNombre.setText("Nombre");

        labelEmail.setText("Email");

        botonRegistrarse.setText("Registrarse");
        botonRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarseActionPerformed(evt);
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
                        .addComponent(labelRegistrarse)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonVolver))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(210, 210, 210)
                                .addComponent(botonRegistrarse))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelNombre)
                                    .addComponent(labelEmail))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textFieldNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                                    .addComponent(textFieldEmail))))
                        .addGap(0, 106, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonVolver)
                            .addComponent(labelRegistrarse))
                        .addGap(52, 52, 52)
                        .addComponent(labelNombre))
                    .addComponent(textFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEmail)
                    .addComponent(textFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(botonRegistrarse)
                .addContainerGap())
        );
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
