
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
        this.setLayout(null);
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

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(500, 300));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelRegistrarSorteo.setText("Registrar sorteo");
        add(labelRegistrarSorteo, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, -1, -1));

        spinnerGanadores.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));
        add(spinnerGanadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 92, -1, -1));

        labelCantidadGanadores.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        labelCantidadGanadores.setText("Cantidad de ganadores");
        add(labelCantidadGanadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 91, -1, -1));

        labelPremio.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        labelPremio.setText("Premio");
        add(labelPremio, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 142, -1, -1));

        textFieldPremio.setText("TV 55\"");
        add(textFieldPremio, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 143, 379, -1));

        botonRegistrar.setBackground(new java.awt.Color(255, 255, 255));
        botonRegistrar.setText("Registrar");
        botonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarActionPerformed(evt);
            }
        });
        add(botonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 255, -1, -1));

        botonVolver.setBackground(new java.awt.Color(255, 255, 255));
        botonVolver.setText("Volver");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });
        add(botonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 12, -1, -1));
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
