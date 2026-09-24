
package Vistas;

import Clases.Producto;
import java.util.TreeSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class iFrmListadoPrecio extends javax.swing.JInternalFrame {

    private TreeSet<Producto> productos = MenuGeneral.getProductos();
    
    public iFrmListadoPrecio() {
        initComponents();
        MenuGeneral.cargarTablaProductos(null, tblProductos);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        pnlPrecios = new javax.swing.JPanel();
        txtPrecioMin = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPrecioMax = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Listador por Precio");

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Descripción", "Precio", "Categoría", "Stock"
            }
        ));
        jScrollPane1.setViewportView(tblProductos);

        txtPrecioMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioMinActionPerformed(evt);
            }
        });
        txtPrecioMin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioMinKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Entre $");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("y");

        txtPrecioMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioMaxActionPerformed(evt);
            }
        });
        txtPrecioMax.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioMaxKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pnlPreciosLayout = new javax.swing.GroupLayout(pnlPrecios);
        pnlPrecios.setLayout(pnlPreciosLayout);
        pnlPreciosLayout.setHorizontalGroup(
            pnlPreciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPreciosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPrecioMin, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(txtPrecioMax, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlPreciosLayout.setVerticalGroup(
            pnlPreciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPreciosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPreciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPrecioMin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtPrecioMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlPrecios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(pnlPrecios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPrecioMinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioMinKeyTyped
        // TODO add your handling code here:
//        char c = evt.getKeyChar();
//
//        if (!Character.isDigit(c) && c != '.') {
//            evt.consume();
//        }
//        
//        buscarPrecio();
    }//GEN-LAST:event_txtPrecioMinKeyTyped

    private void txtPrecioMaxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioMaxKeyTyped
        // TODO add your handling code here:
//        char c = evt.getKeyChar();
//
//        if (!Character.isDigit(c) && c != '.') {
//            evt.consume();
//        }
//        
//        buscarPrecio();
    }//GEN-LAST:event_txtPrecioMaxKeyTyped

    private void txtPrecioMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioMinActionPerformed
        // TODO add your handling code here:
        if (txtPrecioMin.getText().trim().isEmpty()) {
            buscarPrecio();
            return;
        }
        
        if (!MenuGeneral.validarPrecio(txtPrecioMin)) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un precio válido.", "Atención", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        buscarPrecio();
    }//GEN-LAST:event_txtPrecioMinActionPerformed

    private void txtPrecioMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioMaxActionPerformed
        // TODO add your handling code here:
        if (txtPrecioMax.getText().trim().isEmpty()) {
            buscarPrecio();
            return;
        }
        
        if (!MenuGeneral.validarPrecio(txtPrecioMax)) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un precio válido.", "Atención", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        buscarPrecio();
    }//GEN-LAST:event_txtPrecioMaxActionPerformed

    private void buscarPrecio() {
        String min = txtPrecioMin.getText().trim();
        String max = txtPrecioMax.getText().trim();
        
        if (min.equals("")) {
            MenuGeneral.cargarTablaProductos(null, tblProductos);
            return;
        }
        
        if (max.equals("")) {
            MenuGeneral.cargarTablaProductos(null, tblProductos);
            return;
        }
        
        Double precioMin = Double.parseDouble(min);
        Double precioMax = Double.parseDouble(max);

        System.out.print("precio minimo: " + precioMin);
        System.out.print("\nprecio maximo: " + precioMax);
        
        DefaultTableModel modelo = (DefaultTableModel) tblProductos.getModel();
        MenuGeneral.borraFilasTabla(modelo);
        
        for (Producto prod : productos) {
            if (prod.getPrecio() >= precioMin && prod.getPrecio() <= precioMax) {
                modelo.addRow(new Object[]{
                    prod.getCodigo(),
                    prod.getDescripcion(),
                    prod.getPrecio(),
                    prod.getRubro(),
                    prod.getStock()
                });
            }
            
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlPrecios;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTextField txtPrecioMax;
    private javax.swing.JTextField txtPrecioMin;
    // End of variables declaration//GEN-END:variables
}
