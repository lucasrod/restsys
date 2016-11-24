
package gutierrezrodriguez.interfaz;

import gutierrezrodriguez.dominio.Sistema;
import gutierrezrodriguez.dominio.Sorteo;
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
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelRealizarSorteo = new javax.swing.JLabel();
        labelElegirSorteo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaSorteos = new javax.swing.JList();
        botonRealizarSorteo = new javax.swing.JButton();
        botonVolver = new javax.swing.JButton();

        labelRealizarSorteo.setText("Realizar sorteo");

        labelElegirSorteo.setText("Elegir sorteo");

        listaSorteos.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listaSorteos);

        botonRealizarSorteo.setText("Realizar sorteo");
        botonRealizarSorteo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRealizarSorteoActionPerformed(evt);
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
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelElegirSorteo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelRealizarSorteo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonVolver)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(176, Short.MAX_VALUE)
                .addComponent(botonRealizarSorteo)
                .addGap(195, 195, 195))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelRealizarSorteo)
                    .addComponent(botonVolver))
                .addGap(18, 18, 18)
                .addComponent(labelElegirSorteo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(botonRealizarSorteo)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonRealizarSorteoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRealizarSorteoActionPerformed
        if(listaSorteos.isSelectionEmpty()){
            JOptionPane.showMessageDialog(null, "Debe seleccionar el sorteo", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            Sorteo sorteo = (Sorteo) listaSorteos.getSelectedValue();
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
