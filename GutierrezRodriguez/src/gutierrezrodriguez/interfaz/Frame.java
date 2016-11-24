package gutierrezrodriguez.interfaz;

import gutierrezrodriguez.dominio.Sistema;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class Frame extends javax.swing.JFrame {

    GridBagLayout layout = new GridBagLayout();
    private PanelMenuPrincipal panelmenuprincipal;
    private PanelMenuCliente panelmenucliente;
    private PanelMenuRestaurante panelmenurestaurante;
    private PanelRealizarSorteo panelrealizarsorteo;
    private PanelRegistrarCliente panelregistrarcliente;
    private PanelRegistrarSorteo panelregistrarsorteo;
    private PanelEvaluacion panelevaluacion;
    private Sistema sistema;
   
    public Frame() {
        initComponents();
    }

    public Frame(Sistema sistema) {
        this.sistema = sistema;
        initComponents();
        
        panelregistrarcliente = new PanelRegistrarCliente(panelmenucliente, sistema);
        panelevaluacion = new PanelEvaluacion(panelmenucliente, sistema);
        panelmenucliente = new PanelMenuCliente(panelmenuprincipal, panelregistrarcliente, panelevaluacion, sistema);
        panelregistrarcliente.setPredecesor(panelmenucliente);
        panelevaluacion.setPredecesor(panelmenucliente);
        
        panelrealizarsorteo = new PanelRealizarSorteo(panelmenurestaurante, sistema);
        panelregistrarsorteo = new PanelRegistrarSorteo(panelmenurestaurante, sistema);
        panelmenurestaurante = new PanelMenuRestaurante(panelmenuprincipal, panelrealizarsorteo, panelregistrarsorteo, sistema);
        panelrealizarsorteo.setPredecesor(panelmenurestaurante);
        panelregistrarsorteo.setPredecesor(panelmenurestaurante);
        
        panelmenuprincipal = new PanelMenuPrincipal(sistema, panelmenucliente, panelmenurestaurante);
        panelmenucliente.setPredecesor(panelmenuprincipal);
        panelmenurestaurante.setPredecesor(panelmenuprincipal);
        
        panelDinamico.setLayout(layout);
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        panelDinamico.add(panelmenuprincipal, c);
        c.gridx = 0;
        c.gridy = 0;
        panelDinamico.add(panelmenucliente, c);
        c.gridx = 0;
        c.gridy = 0;
        panelDinamico.add(panelmenurestaurante, c);
        c.gridx = 0;
        c.gridy = 0;
        panelDinamico.add(panelregistrarcliente, c);
        c.gridx = 0;
        c.gridy = 0;
        panelDinamico.add(panelregistrarsorteo, c);
        c.gridx = 0;
        c.gridy = 0;
        panelDinamico.add(panelrealizarsorteo, c);
        c.gridx = 0;
        c.gridy = 0;
        
        panelDinamico.add(panelevaluacion, c);
        panelmenuprincipal.setVisible(true);
        panelmenucliente.setVisible(false);
        panelmenurestaurante.setVisible(false);
        panelregistrarcliente.setVisible(false);
        panelevaluacion.setVisible(false);
        panelregistrarsorteo.setVisible(false);
        panelrealizarsorteo.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDinamico = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(524, 324));
        setResizable(false);

        panelDinamico.setPreferredSize(new java.awt.Dimension(500, 300));

        javax.swing.GroupLayout panelDinamicoLayout = new javax.swing.GroupLayout(panelDinamico);
        panelDinamico.setLayout(panelDinamicoLayout);
        panelDinamicoLayout.setHorizontalGroup(
            panelDinamicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        panelDinamicoLayout.setVerticalGroup(
            panelDinamicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDinamico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDinamico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String[] args) {

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panelDinamico;
    // End of variables declaration//GEN-END:variables
}
