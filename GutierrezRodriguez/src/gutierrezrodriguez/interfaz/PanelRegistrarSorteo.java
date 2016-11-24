
package gutierrezrodriguez.interfaz;

import gutierrezrodriguez.dominio.Sistema;
import gutierrezrodriguez.dominio.Sorteo;
import javax.swing.JOptionPane;

public class PanelRegistrarSorteo extends javax.swing.JPanel {
    
    private PanelMenuRestaurante panelMenuRestaurante;
    private Sistema sistema;

    public PanelRegistrarSorteo() {
        initComponents();
    }
    
    public PanelRegistrarSorteo(Sistema sistema){
        initComponents();
        this.sistema = sistema;
    }
    
    public void setPredecesor(PanelMenuRestaurante panelMenuRestaurante){
        this.panelMenuRestaurante = panelMenuRestaurante;    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelRegistrarSorteo = new javax.swing.JLabel();
        spinnerGanadores = new javax.swing.JSpinner();
        labelCantidadGanadores = new javax.swing.JLabel();
        labelPremio = new javax.swing.JLabel();
        textFieldPremio = new javax.swing.JTextField();
        botonRegistrar = new javax.swing.JButton();
        botonVolver = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(500, 300));

        labelRegistrarSorteo.setText("Registrar sorteo");

        spinnerGanadores.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));

        labelCantidadGanadores.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        labelCantidadGanadores.setText("Cantidad de ganadores");

        labelPremio.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        labelPremio.setText("Premio");

        textFieldPremio.setText("TV 55\"");

        botonRegistrar.setText("Registrar");
        botonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarActionPerformed(evt);
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelPremio)
                        .addGap(18, 18, 18)
                        .addComponent(textFieldPremio))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelRegistrarSorteo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonVolver))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelCantidadGanadores)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                        .addComponent(spinnerGanadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(botonRegistrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelRegistrarSorteo)
                    .addComponent(botonVolver))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spinnerGanadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCantidadGanadores))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPremio)
                    .addComponent(textFieldPremio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(botonRegistrar)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarActionPerformed
        Sorteo sorteo = new Sorteo((int) spinnerGanadores.getValue(), textFieldPremio.getText(), sistema.getRestaurante());
        if(sistema.getRestaurante().setSorteo(sorteo)){
            JOptionPane.showMessageDialog(null, "Sorteo registrado con éxito", "Éxito", JOptionPane.PLAIN_MESSAGE);
            botonVolver.doClick();
        }else{
            JOptionPane.showMessageDialog(null, "Debe definir el premio", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonRegistrarActionPerformed

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        this.setVisible(false);
        this.panelMenuRestaurante.setVisible(true);
    }//GEN-LAST:event_botonVolverActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRegistrar;
    private javax.swing.JButton botonVolver;
    private javax.swing.JLabel labelCantidadGanadores;
    private javax.swing.JLabel labelPremio;
    private javax.swing.JLabel labelRegistrarSorteo;
    private javax.swing.JSpinner spinnerGanadores;
    private javax.swing.JTextField textFieldPremio;
    // End of variables declaration//GEN-END:variables
}
