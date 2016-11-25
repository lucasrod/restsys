
package gutierrezrodriguez.interfaz;

import gutierrezrodriguez.dominio.Evaluacion;
import gutierrezrodriguez.dominio.Sistema;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class PanelEvaluaciones extends javax.swing.JPanel {
    
    private Sistema sistema;
    private PanelMenuCliente panelmenucliente;
    private PanelMenuRestaurante panelmenurestaurante;
    private boolean predecesorEsRestaurante;

    public PanelEvaluaciones() {
        initComponents();
    }
    
    public PanelEvaluaciones(Sistema sistema){
        initComponents();
        this.sistema = sistema;
    }
    
    public void setPredecesor(PanelMenuCliente panelmenucliente){
        this.panelmenucliente = panelmenucliente;
    }
    
    public void setPredecesor(PanelMenuRestaurante panelmenurestaurante){
        this.panelmenurestaurante = panelmenurestaurante;
    }
    
    public void setPredecesorEsRestaurante(boolean esRestaurante){
        this.predecesorEsRestaurante = esRestaurante;
    }
    
    public void actualizarEvaluaciones(){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Cliente");
        modelo.addColumn("Puntuacion");
        modelo.addColumn("Reseña");
        ArrayList<Evaluacion> evaluaciones = sistema.getRestaurante().getEvaluaciones();
        for(int i = 0; i < evaluaciones.size() ; i++){
            Evaluacion evaluacion = evaluaciones.get(i);
            modelo.addRow(new Object[]{evaluacion.getCliente(), evaluacion.getEstrellas(), evaluacion.getResena()});
            
        }
        tablaEvaluaciones.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonVolver = new javax.swing.JButton();
        labelEvaluaciones = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEvaluaciones = new javax.swing.JTable();

        setMinimumSize(new java.awt.Dimension(500, 300));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonVolver.setBackground(new java.awt.Color(255, 255, 255));
        botonVolver.setText("Volver");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });
        add(botonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 12, -1, -1));

        labelEvaluaciones.setText("Evaluaciones");
        add(labelEvaluaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, -1, -1));

        tablaEvaluaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Cliente", "Puntuacion", "Reseña"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablaEvaluaciones.setEnabled(false);
        jScrollPane1.setViewportView(tablaEvaluaciones);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 63, 476, 225));
    }// </editor-fold>//GEN-END:initComponents

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        this.setVisible(false);
        if(this.predecesorEsRestaurante){
            this.panelmenurestaurante.setVisible(true);
        }else{
            this.panelmenucliente.setVisible(true);
        }
    }//GEN-LAST:event_botonVolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonVolver;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelEvaluaciones;
    private javax.swing.JTable tablaEvaluaciones;
    // End of variables declaration//GEN-END:variables
}
