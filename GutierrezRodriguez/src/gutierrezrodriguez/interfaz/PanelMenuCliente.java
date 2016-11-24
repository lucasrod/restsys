
package gutierrezrodriguez.interfaz;

import gutierrezrodriguez.dominio.Cliente;
import gutierrezrodriguez.dominio.Sistema;
import gutierrezrodriguez.dominio.Sorteo;
import java.util.ArrayList;
import javax.swing.JOptionPane;

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
        return (listaClientes.isSelectionEmpty() ? new Cliente() : (Cliente)listaClientes.getSelectedValue());
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

        setMinimumSize(new java.awt.Dimension(500, 300));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(500, 300));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelYaSeRegistro.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        labelYaSeRegistro.setText("¿Ya se registró?");
        add(labelYaSeRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 12, -1, -1));

        labelSi.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        labelSi.setText("Si");
        add(labelSi, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 51, -1, -1));

        labelNo.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        labelNo.setText("No");
        add(labelNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 51, -1, -1));

        labelCliente.setText("Rol: Cliente");
        add(labelCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, -1, -1));

        botonVolver.setBackground(new java.awt.Color(255, 255, 255));
        botonVolver.setText("Volver");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });
        add(botonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, -1, -1));

        labelQuienSos.setText("¿Quién sos?");
        add(labelQuienSos, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 85, -1, -1));

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 118, 124, 131));

        botonRegistrarme.setBackground(new java.awt.Color(255, 255, 255));
        botonRegistrarme.setText("Registrarme");
        botonRegistrarme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarmeActionPerformed(evt);
            }
        });
        add(botonRegistrarme, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 118, 264, -1));

        botonPremio.setBackground(new java.awt.Color(255, 255, 255));
        botonPremio.setText("Consultar premio");
        botonPremio.setEnabled(false);
        botonPremio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPremioActionPerformed(evt);
            }
        });
        add(botonPremio, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 163, 264, -1));

        botonEvaluar.setBackground(new java.awt.Color(255, 255, 255));
        botonEvaluar.setText("Evaluar el restaurante");
        botonEvaluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEvaluarActionPerformed(evt);
            }
        });
        add(botonEvaluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 208, 264, -1));

        botonAnonimo.setBackground(new java.awt.Color(255, 255, 255));
        botonAnonimo.setText("Anónimo");
        botonAnonimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAnonimoActionPerformed(evt);
            }
        });
        add(botonAnonimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 255, 124, -1));

        botonVerEvaluaciones.setBackground(new java.awt.Color(255, 255, 255));
        botonVerEvaluaciones.setText("Ver evaluaciones");
        botonVerEvaluaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerEvaluacionesActionPerformed(evt);
            }
        });
        add(botonVerEvaluaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 253, 264, -1));
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
        Cliente cliente = (Cliente) listaClientes.getSelectedValue();
        ArrayList <Sorteo> sorteosGanados = cliente.getSorteosGanados();
        if(sorteosGanados.isEmpty()){
            JOptionPane.showMessageDialog(null, "No ganaste nada", "La próxima sale", JOptionPane.ERROR_MESSAGE);
        }else{
            String mensaje = "Ganaste ";
            for(int i=0; i<sorteosGanados.size(); i++){
                mensaje += sorteosGanados.get(i).getPremio() + (i+1 == sorteosGanados.size() ? "" : ", ");
            }
            JOptionPane.showMessageDialog(null, mensaje, "Ganaste", JOptionPane.PLAIN_MESSAGE);
        }
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
