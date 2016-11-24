package gutierrezrodriguez.interfaz;

import gutierrezrodriguez.dominio.Sistema;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class Frame extends javax.swing.JFrame {

    GridBagLayout layout = new GridBagLayout();
    private PanelMenuPrincipal panelMenuPrincipal;
    private PanelMenuCliente panelMenuCliente;
    private PanelMenuRestaurante panelMenuRestaurante;
    private PanelRealizarSorteo panelRealizarSorteo;
    private PanelRegistrarCliente panelRegistrarCliente;
    private PanelRegistrarSorteo panelRegistrarSorteo;
    private PanelEvaluar panelEvaluacion;
    private PanelEvaluaciones panelEvaluaciones;
    private PanelFichaRestaurante panelFichaRestaurante;
    private Sistema sistema;
   
    public Frame() {
        initComponents();
    }

    public Frame(Sistema sistema) {
        this.sistema = sistema;
        initComponents();
        
        //Ambos menues lo comparten
        panelEvaluaciones = new PanelEvaluaciones(sistema);
        
        //Menu Cliente
        panelRegistrarCliente = new PanelRegistrarCliente(sistema);
        panelEvaluacion = new PanelEvaluar(sistema);
        panelMenuCliente = new PanelMenuCliente(panelRegistrarCliente, panelEvaluacion, panelEvaluaciones, sistema);
        panelRegistrarCliente.setPredecesor(panelMenuCliente);
        panelEvaluacion.setPredecesor(panelMenuCliente);
        
        //Menu Restaurante
        panelRealizarSorteo = new PanelRealizarSorteo(sistema);
        panelRegistrarSorteo = new PanelRegistrarSorteo(sistema);
        panelFichaRestaurante = new PanelFichaRestaurante(sistema);
        panelMenuRestaurante = new PanelMenuRestaurante(panelRealizarSorteo, panelRegistrarSorteo, panelEvaluaciones, panelFichaRestaurante, sistema);
        panelRealizarSorteo.setPredecesor(panelMenuRestaurante);
        panelRegistrarSorteo.setPredecesor(panelMenuRestaurante);
        panelFichaRestaurante.setPredecesor(panelMenuRestaurante);
        
        //Menu Principal
        panelMenuPrincipal = new PanelMenuPrincipal(sistema, panelMenuCliente, panelMenuRestaurante);
        panelMenuCliente.setPredecesor(panelMenuPrincipal);
        panelMenuRestaurante.setPredecesor(panelMenuPrincipal);
        
        //Se agregan los paneles al frame
        panelDinamico.setLayout(layout);
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        panelDinamico.add(panelMenuPrincipal, c);
        panelDinamico.add(panelMenuCliente, c);
        panelDinamico.add(panelMenuRestaurante, c);
        panelDinamico.add(panelRegistrarCliente, c);
        panelDinamico.add(panelRegistrarSorteo, c);
        panelDinamico.add(panelRealizarSorteo, c);        
        panelDinamico.add(panelEvaluacion, c);
        panelDinamico.add(panelEvaluaciones, c);
        panelDinamico.add(panelFichaRestaurante, c);
        
        panelMenuPrincipal.setVisible(true);
        panelMenuCliente.setVisible(false);
        panelMenuRestaurante.setVisible(false);
        panelRegistrarCliente.setVisible(false);
        panelEvaluacion.setVisible(false);
        panelRegistrarSorteo.setVisible(false);
        panelRealizarSorteo.setVisible(false);
        panelEvaluaciones.setVisible(false);
        panelFichaRestaurante.setVisible(false);
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
