
package gutierrezrodriguez.interfaz;

import gutierrezrodriguez.dominio.Cliente;
import gutierrezrodriguez.dominio.Sistema;
import gutierrezrodriguez.dominio.Sorteo;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PanelRealizarSorteo extends javax.swing.JPanel {
    
    private PanelMenuRestaurante panelMenuRestaurante;
    private Sistema sistema;

    public PanelRealizarSorteo() {
        initComponents();
    }
    
    public PanelRealizarSorteo(Sistema sistema){
        initComponents();
        this.sistema = sistema;
    }
    
    public void setPredecesor(PanelMenuRestaurante panelMenuRestaurante){
        this.panelMenuRestaurante = panelMenuRestaurante;    
    }
    
    public void actualizarListaSorteos(){
        ArrayList <Sorteo> sorteos= sistema.getRestaurante().getSorteos();
        sorteos.removeIf(Sorteo.fueRealizado());
        listaSorteos.setListData(sorteos.toArray());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelRealizarSorteo = new javax.swing.JLabel();
        labelElegirSorteo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaSorteos = new javax.swing.JList();
        botonRealizarSorteo = new javax.swing.JButton();
        botonVolver = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(500, 300));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelRealizarSorteo.setText("Realizar sorteo");
        add(labelRealizarSorteo, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, -1, -1));

        labelElegirSorteo.setText("Elegir sorteo");
        add(labelElegirSorteo, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 63, -1, -1));

        listaSorteos.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listaSorteos);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 90, 476, 100));

        botonRealizarSorteo.setBackground(new java.awt.Color(255, 255, 255));
        botonRealizarSorteo.setText("Realizar sorteo");
        botonRealizarSorteo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRealizarSorteoActionPerformed(evt);
            }
        });
        add(botonRealizarSorteo, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 255, -1, -1));

        botonVolver.setBackground(new java.awt.Color(255, 255, 255));
        botonVolver.setText("Volver");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });
        add(botonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 12, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void botonRealizarSorteoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRealizarSorteoActionPerformed
        if(listaSorteos.isSelectionEmpty()){
            JOptionPane.showMessageDialog(null, "Debe seleccionar el sorteo", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            Sorteo sorteo = (Sorteo) listaSorteos.getSelectedValue();
            ArrayList<Cliente> ganadores = sorteo.realizarSorteo();
            String strGanadores = "";
            for(int i=0; i<ganadores.size(); i++){
                strGanadores += "\t- " + ganadores.get(i).toString() + '\n';
            }
            String mensaje = "Sorteo realizado con éxito\nLos ganadores son:\n" + strGanadores +"Todos fueron notificados por email";
            JOptionPane.showMessageDialog(null, mensaje, "Éxito", JOptionPane.PLAIN_MESSAGE);
            botonVolver.doClick();
        }
    }//GEN-LAST:event_botonRealizarSorteoActionPerformed

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        this.setVisible(false);
        this.panelMenuRestaurante.setVisible(true);
    }//GEN-LAST:event_botonVolverActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRealizarSorteo;
    private javax.swing.JButton botonVolver;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelElegirSorteo;
    private javax.swing.JLabel labelRealizarSorteo;
    private javax.swing.JList listaSorteos;
    // End of variables declaration//GEN-END:variables
}
