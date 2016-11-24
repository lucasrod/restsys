
package gutierrezrodriguez.interfaz;

import gutierrezrodriguez.dominio.Sistema;

public class PanelMenuCliente extends javax.swing.JPanel {
    
    private PanelMenuPrincipal panelmenuprincipal;
    private Sistema sistema;

    public PanelMenuCliente() {
        initComponents();
    }

    public PanelMenuCliente(PanelMenuPrincipal panelmenuprincipal, Sistema sistema){
        initComponents();
        this.panelmenuprincipal = panelmenuprincipal;
        this.sistema = sistema;
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
        listaClientes = new javax.swing.JList<>();
        botonRegistrarme = new javax.swing.JButton();
        botonPremio = new javax.swing.JButton();
        botonEvaluar = new javax.swing.JButton();
        botonAnonimo = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(500, 300));

        labelYaSeRegistro.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        labelYaSeRegistro.setText("Ya se registro?");

        labelSi.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        labelSi.setText("Si");

        labelNo.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        labelNo.setText("No");

        labelCliente.setText("Rol: Cliente");

        botonVolver.setText("Volver");

        labelQuienSos.setText("¿Quién sos?");

        listaClientes.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
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
                                        .addComponent(botonVolver)))))))
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
                        .addGap(0, 39, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(7, 7, 7)
                .addComponent(botonAnonimo))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegistrarmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarmeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonRegistrarmeActionPerformed

    private void botonPremioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPremioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonPremioActionPerformed

    private void botonEvaluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEvaluarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonEvaluarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAnonimo;
    private javax.swing.JButton botonEvaluar;
    private javax.swing.JButton botonPremio;
    private javax.swing.JButton botonRegistrarme;
    private javax.swing.JButton botonVolver;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCliente;
    private javax.swing.JLabel labelNo;
    private javax.swing.JLabel labelQuienSos;
    private javax.swing.JLabel labelSi;
    private javax.swing.JLabel labelYaSeRegistro;
    private javax.swing.JList<String> listaClientes;
    // End of variables declaration//GEN-END:variables
}
