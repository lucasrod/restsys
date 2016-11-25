
package gutierrezrodriguez.interfaz;

import gutierrezrodriguez.dominio.Evaluacion;
import gutierrezrodriguez.dominio.Ficha;
import gutierrezrodriguez.dominio.Sistema;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PanelFichaRestaurante extends javax.swing.JPanel {

    private Sistema sistema;
    private PanelMenuRestaurante panelMenuRestaurante;
    
    public PanelFichaRestaurante() {
        initComponents();
    }
    
    public PanelFichaRestaurante(Sistema sistema){
        initComponents();
        this.sistema = sistema;
    }
    
    public void setPredecesor(PanelMenuRestaurante panelMenuRestaurante){
        this.panelMenuRestaurante = panelMenuRestaurante;
    }
    
    public void actualizarDatos(){
        Ficha ficha = sistema.getRestaurante().getFicha();
        textFieldNombre.setText(ficha.getNombre());
        textFieldDireccion.setText(ficha.getDireccion());

        limpiarTabla();
        DefaultTableModel modelo = (DefaultTableModel) tablaHorarios.getModel();
        modelo.addRow(ficha.getHorarios());
        tablaHorarios.setModel(modelo);
    }
    
    public void limpiarTabla(){
        DefaultTableModel modelo = (DefaultTableModel) tablaHorarios.getModel();
        while(modelo.getRowCount() > 0){
            modelo.removeRow(0);
        }
        tablaHorarios.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonVolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        textFieldNombre = new javax.swing.JTextField();
        labelDireccion = new javax.swing.JLabel();
        textFieldDireccion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaHorarios = new javax.swing.JTable();
        labelHorarios = new javax.swing.JLabel();
        botonActualizar = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(500, 300));
        setPreferredSize(new java.awt.Dimension(500, 300));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonVolver.setBackground(new java.awt.Color(255, 255, 255));
        botonVolver.setText("Volver");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });
        add(botonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 12, -1, -1));

        jLabel1.setText("Editar ficha");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, -1, -1));

        labelNombre.setText("Nombre");
        add(labelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 62, -1, -1));
        add(textFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 57, 354, -1));

        labelDireccion.setText("Dirección");
        add(labelDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 105, -1, -1));
        add(textFieldDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 100, 354, -1));

        tablaHorarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablaHorarios.setCellSelectionEnabled(true);
        jScrollPane1.setViewportView(tablaHorarios);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 181, 476, 50));

        labelHorarios.setText("Horarios");
        add(labelHorarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 154, -1, -1));

        botonActualizar.setBackground(new java.awt.Color(255, 255, 255));
        botonActualizar.setText("Actualizar datos");
        botonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarActionPerformed(evt);
            }
        });
        add(botonActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 255, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        this.tablaHorarios.clearSelection();
        this.setVisible(false);
        panelMenuRestaurante.setVisible(true);
    }//GEN-LAST:event_botonVolverActionPerformed

    private void botonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarActionPerformed
        Ficha ficha = sistema.getRestaurante().getFicha();
        ficha.setNombre(textFieldNombre.getText());
        ficha.setDireccion(textFieldDireccion.getText());
        DefaultTableModel modelo = (DefaultTableModel) tablaHorarios.getModel();
        for(int i = 0; i < 7 ; i++){
            ficha.setHorario(i+1, (String)modelo.getValueAt(0, i));
        }
        JOptionPane.showMessageDialog(null, "Ficha actualizada con éxito", "Éxito", JOptionPane.PLAIN_MESSAGE);
        botonVolver.doClick();
    }//GEN-LAST:event_botonActualizarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonActualizar;
    private javax.swing.JButton botonVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelDireccion;
    private javax.swing.JLabel labelHorarios;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JTable tablaHorarios;
    private javax.swing.JTextField textFieldDireccion;
    private javax.swing.JTextField textFieldNombre;
    // End of variables declaration//GEN-END:variables
}
