
package gutierrezrodriguez.interfaz;

import gutierrezrodriguez.dominio.Sistema;

public class PanelRegistrarCliente extends javax.swing.JPanel {

    private PanelMenuCliente panelMenuCliente;
    private Sistema sistema;
    
    public PanelRegistrarCliente() {
        initComponents();
    }
    
    public PanelRegistrarCliente(PanelMenuCliente panelMenuCliente, Sistema sistema){
        initComponents();
        this.panelMenuCliente = panelMenuCliente;
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

        textFieldNombre.setText("jTextField1");

        textFieldEmail.setText("jTextField2");

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
        this.setVisible(false);
        this.panelMenuCliente.setVisible(true);
    }//GEN-LAST:event_botonVolverActionPerformed


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
