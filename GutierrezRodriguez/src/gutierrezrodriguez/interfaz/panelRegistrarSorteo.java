/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gutierrezrodriguez.interfaz;

/**
 *
 * @author lucasrod
 */
public class PanelRegistrarSorteo extends javax.swing.JPanel {

    /**
     * Creates new form panelRegistrarSorteo
     */
    public PanelRegistrarSorteo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelRegistrarSorteo = new javax.swing.JLabel();
        spinnerGanadores = new javax.swing.JSpinner();
        labelCantidadGanadores = new javax.swing.JLabel();
        labelPremio = new javax.swing.JLabel();
        textFieldPremio = new javax.swing.JTextField();
        botonRegistrar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(500, 300));

        labelRegistrarSorteo.setText("Registrar sorteo");

        spinnerGanadores.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));

        labelCantidadGanadores.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        labelCantidadGanadores.setText("Cantidad de ganadores");

        labelPremio.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        labelPremio.setText("Premio");

        textFieldPremio.setText("TV 55\"");

        botonRegistrar.setText("Registrar");

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
                        .addGap(0, 0, Short.MAX_VALUE))
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
                .addComponent(labelRegistrarSorteo)
                .addGap(58, 58, 58)
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRegistrar;
    private javax.swing.JLabel labelCantidadGanadores;
    private javax.swing.JLabel labelPremio;
    private javax.swing.JLabel labelRegistrarSorteo;
    private javax.swing.JSpinner spinnerGanadores;
    private javax.swing.JTextField textFieldPremio;
    // End of variables declaration//GEN-END:variables
}
