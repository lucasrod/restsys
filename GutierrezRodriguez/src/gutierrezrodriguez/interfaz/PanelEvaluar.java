
package gutierrezrodriguez.interfaz;

import gutierrezrodriguez.dominio.Evaluacion;
import gutierrezrodriguez.dominio.Sistema;
import javax.swing.JOptionPane;

public class PanelEvaluar extends javax.swing.JPanel {
    
    private Sistema sistema;
    private PanelMenuCliente panelMenuCliente;
    
    public PanelEvaluar() {
        initComponents();
    }
    
    public PanelEvaluar(Sistema sistema){
        initComponents();
        this.sistema = sistema;
    }
    
    public void setPredecesor(PanelMenuCliente panelMenuCliente) {
        this.panelMenuCliente = panelMenuCliente;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelEvaluar = new javax.swing.JLabel();
        botonVolver = new javax.swing.JButton();
        labelPuntuacion = new javax.swing.JLabel();
        labelResena = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaResena = new javax.swing.JTextArea();
        botonEvaluar = new javax.swing.JButton();
        spinnerPuntuacion = new javax.swing.JSpinner();

        setMinimumSize(new java.awt.Dimension(500, 300));
        setPreferredSize(new java.awt.Dimension(500, 300));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelEvaluar.setText("Evaluar el restaurante");
        add(labelEvaluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, -1, -1));

        botonVolver.setBackground(new java.awt.Color(255, 255, 255));
        botonVolver.setText("Volver");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });
        add(botonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, -1, -1));

        labelPuntuacion.setText("Puntuacion [⭐]");
        add(labelPuntuacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 87, -1, -1));

        labelResena.setText("Reseña");
        add(labelResena, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 170, -1, -1));

        textAreaResena.setColumns(20);
        textAreaResena.setRows(5);
        jScrollPane1.setViewportView(textAreaResena);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 126, 340, -1));

        botonEvaluar.setBackground(new java.awt.Color(255, 255, 255));
        botonEvaluar.setText("Evaluar");
        botonEvaluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEvaluarActionPerformed(evt);
            }
        });
        add(botonEvaluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 255, -1, -1));

        spinnerPuntuacion.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));
        add(spinnerPuntuacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 50, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        this.setVisible(false);
        this.panelMenuCliente.setVisible(true);
    }//GEN-LAST:event_botonVolverActionPerformed

    private void botonEvaluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEvaluarActionPerformed
        Evaluacion evaluacion = new Evaluacion((int)spinnerPuntuacion.getValue(), textAreaResena.getText(), panelMenuCliente.clienteSeleccionado());
        sistema.getRestaurante().setEvaluacion(evaluacion);
        JOptionPane.showMessageDialog(null, "Se ha evaluado con éxito", "Éxito", JOptionPane.PLAIN_MESSAGE);
        botonVolver.doClick();
    }//GEN-LAST:event_botonEvaluarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEvaluar;
    private javax.swing.JButton botonVolver;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelEvaluar;
    private javax.swing.JLabel labelPuntuacion;
    private javax.swing.JLabel labelResena;
    private javax.swing.JSpinner spinnerPuntuacion;
    private javax.swing.JTextArea textAreaResena;
    // End of variables declaration//GEN-END:variables
}
