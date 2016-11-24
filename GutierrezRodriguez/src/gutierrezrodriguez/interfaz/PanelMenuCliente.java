
package gutierrezrodriguez.interfaz;

import gutierrezrodriguez.dominio.Cliente;
import gutierrezrodriguez.dominio.Sistema;

public class PanelMenuCliente extends javax.swing.JPanel {
    
    private PanelMenuPrincipal panelMenuPrincipal;
    private PanelRegistrarCliente panelRegistrarCliente;
    private PanelEvaluar panelEvaluacion;
    private PanelEvaluaciones panelEvaluaciones;
    private Sistema sistema;

    public PanelMenuCliente() {
        initComponents();
    }

    public PanelMenuCliente(PanelRegistrarCliente panelRegistrarCliente, PanelEvaluar panelEvaluacion, PanelEvaluaciones panelEvaluaciones, Sistema sistema){
        initComponents();
        this.panelRegistrarCliente = panelRegistrarCliente;
        this.panelEvaluacion = panelEvaluacion;
        this.panelEvaluaciones = panelEvaluaciones;
        this.sistema = sistema;
    }
    
    public void setPredecesor(PanelMenuPrincipal panelMenuPrincipal) {
        this.panelMenuPrincipal = panelMenuPrincipal;
    }
    
    public void actualizarListaClientes(){
        listaClientes.setListData(sistema.getClientes().toArray());
    }
    
    public void seleccionarElUltimo(){
        listaClientes.setSelectedIndex(listaClientes.getModel().getSize()-1);
    }
    
    Cliente clienteSeleccionado() {
        return (listaClientes.isSelectionEmpty() ? new Cliente("Anónimo", "") : (Cliente)listaClientes.getSelectedValue());
    }    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelYaSeRegistro = new javax.swing.JLabel();
        labelSi = new javax.swing.JLabel();
        labelNo = new javax.swing.JLabel();
        labelCliente = new javax.swing.JLabel();
        botonVolver = new javax.swing.JButton();
        labelQuienSos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaClientes = new javax.swing.JList();
        botonRegistrarme = new javax.swing.JButton();
        botonPremio = new javax.swing.JButton();
        botonEvaluar = new javax.swing.JButton();
        botonAnonimo = new javax.swing.JButton();
        botonVerEvaluaciones = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(500, 300));

        labelYaSeRegistro.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        labelYaSeRegistro.setText("Ya se registro?");

        labelSi.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        labelSi.setText("Si");

        labelNo.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        labelNo.setText("No");

        labelCliente.setText("Rol: Cliente");

        botonVolver.setText("Volver");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        labelQuienSos.setText("¿Quién sos?");

        listaClientes.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        listaClientes.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaClientesValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listaClientes);

        botonRegistrarme.setText("Registrarme");
        botonRegistrarme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarmeActionPerformed(evt);
            }
        });

        botonPremio.setText("Consultar premio");
        botonPremio.setEnabled(false);
        botonPremio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPremioActionPerformed(evt);
            }
        });

        botonEvaluar.setText("Evaluar el restaurante");
        botonEvaluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEvaluarActionPerformed(evt);
            }
        });

        botonAnonimo.setText("Anónimo");
        botonAnonimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAnonimoActionPerformed(evt);
            }
        });

        botonVerEvaluaciones.setText("Ver evaluaciones");
        botonVerEvaluaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerEvaluacionesActionPerformed(evt);
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
                        .addComponent(labelCliente)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(botonAnonimo, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                            .addComponent(labelQuienSos, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(labelSi))
                            .addComponent(jScrollPane1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonPremio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonRegistrarme, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonEvaluar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 27, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(labelNo)
                                        .addGap(49, 49, 49))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(labelYaSeRegistro)
                                        .addGap(97, 97, 97)
                                        .addComponent(botonVolver))))
                            .addComponent(botonVerEvaluaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCliente)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelYaSeRegistro)
                        .addComponent(botonVolver)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSi)
                    .addComponent(labelNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelQuienSos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonRegistrarme)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonPremio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonEvaluar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonVerEvaluaciones)
                        .addGap(0, 20, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonAnonimo)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        this.setVisible(false);
        panelMenuPrincipal.setVisible(true);
    }//GEN-LAST:event_botonVolverActionPerformed

    private void botonRegistrarmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarmeActionPerformed
        this.setVisible(false);
        panelRegistrarCliente.setVisible(true);
    }//GEN-LAST:event_botonRegistrarmeActionPerformed

    private void botonPremioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPremioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonPremioActionPerformed

    private void botonEvaluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEvaluarActionPerformed
        this.setVisible(false);
        panelEvaluacion.setVisible(true);
    }//GEN-LAST:event_botonEvaluarActionPerformed

    private void botonVerEvaluacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerEvaluacionesActionPerformed
        this.setVisible(false);
        panelEvaluaciones.setPredecesor(this);
        panelEvaluaciones.setPredecesorEsRestaurante(false);
        panelEvaluaciones.setVisible(true);
    }//GEN-LAST:event_botonVerEvaluacionesActionPerformed

    private void botonAnonimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAnonimoActionPerformed
        listaClientes.clearSelection();
    }//GEN-LAST:event_botonAnonimoActionPerformed

    private void listaClientesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaClientesValueChanged
        if(listaClientes.isSelectionEmpty())
            botonPremio.setEnabled(false);
        else
            botonPremio.setEnabled(true);
    }//GEN-LAST:event_listaClientesValueChanged



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAnonimo;
    private javax.swing.JButton botonEvaluar;
    private javax.swing.JButton botonPremio;
    private javax.swing.JButton botonRegistrarme;
    private javax.swing.JButton botonVerEvaluaciones;
    private javax.swing.JButton botonVolver;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCliente;
    private javax.swing.JLabel labelNo;
    private javax.swing.JLabel labelQuienSos;
    private javax.swing.JLabel labelSi;
    private javax.swing.JLabel labelYaSeRegistro;
    private javax.swing.JList listaClientes;
    // End of variables declaration//GEN-END:variables

}
