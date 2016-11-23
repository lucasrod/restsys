package gutierrezrodriguez.interfaz;

import gutierrezrodriguez.dominio.Sistema;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class Frame extends javax.swing.JFrame {

    GridBagLayout layout = new GridBagLayout();
    private PanelMenuPrincipal panelmenuprincipal;
    private Sistema sistema;

    public Frame() {
        initComponents();
    }

    public Frame(Sistema sistema) {
        this.sistema = sistema;
        initComponents();
        panelmenuprincipal = new PanelMenuPrincipal(sistema);
        panelDinamico.setLayout(layout);
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        panelDinamico.add(panelmenuprincipal, c);
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
