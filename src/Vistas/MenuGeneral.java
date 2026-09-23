
package Vistas;

import Clases.Categoria;
import Clases.Producto;
import java.awt.Component;
import java.util.TreeSet;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class MenuGeneral extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MenuGeneral.class.getName());

    private static TreeSet<Producto> productos = new TreeSet<>();
    
    public MenuGeneral() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuAdm = new javax.swing.JMenu();
        mniProductos = new javax.swing.JMenuItem();
        mnuConsultas = new javax.swing.JMenu();
        mniPorNombre = new javax.swing.JMenuItem();
        mniPorPrecio = new javax.swing.JMenuItem();
        mniPorRubro = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 787, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 667, Short.MAX_VALUE)
        );

        mnuAdm.setText("Administración");

        mniProductos.setText("Productos");
        mniProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniProductosActionPerformed(evt);
            }
        });
        mnuAdm.add(mniProductos);

        jMenuBar1.add(mnuAdm);

        mnuConsultas.setText("Consultas");

        mniPorNombre.setText("Consulta por Nombre");
        mnuConsultas.add(mniPorNombre);

        mniPorPrecio.setText("Consulta por Precio");
        mnuConsultas.add(mniPorPrecio);

        mniPorRubro.setText("Consulta por Rubro");
        mnuConsultas.add(mniPorRubro);

        jMenuBar1.add(mnuConsultas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mniProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniProductosActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        iFrmGestion gestion = new iFrmGestion();
        gestion.setVisible(true);
        escritorio.add(gestion);
        gestion.moveToFront();
    }//GEN-LAST:event_mniProductosActionPerformed

    public static void borraFilasTabla(DefaultTableModel modelo) {
        int filas = modelo.getRowCount() -1;
        for (int i = filas; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }
    
    public static void limpiarCampos(JPanel  jPanel) {
        JComboBox combo = null;
        for (int i = 0; i < jPanel.getComponents().length; i++) {
            if (jPanel.getComponents()[i] instanceof JTextField) {
                JTextField caja = (JTextField) jPanel.getComponents()[i];
                caja.setText("");
            }
            
            if (jPanel.getComponents()[i] instanceof JSpinner) {
                JSpinner spinner = (JSpinner) jPanel.getComponents()[i];
                spinner.setValue(0);
            }
            
            if (jPanel.getComponents()[i] instanceof JComboBox) {
                combo = (JComboBox) jPanel.getComponents()[i];
                combo.setSelectedIndex(-1);
            }
        }
    }
    
    public static TreeSet<Producto> getProductos() {
        return productos;
    }
    
    public static void cargarTablaProductos(Categoria categoria, JTable jTable) {
        DefaultTableModel modelo = (DefaultTableModel) jTable.getModel();
        MenuGeneral.borraFilasTabla(modelo);
        
        for (Producto prod : productos) {
            if (categoria == null || prod.getRubro() == categoria) {
                modelo.addRow(new Object[] {
                    prod.getCodigo(),
                    prod.getDescripcion(),
                    prod.getPrecio(),
                    prod.getRubro(),
                    prod.getStock()
                });
            }
        }
    }
    
    public static void validarEnteros(java.awt.event.KeyEvent evt, JTextField jText) {
        char caracter = evt.getKeyChar();

        if (!Character.isDigit(caracter)) {
            evt.consume();
        }
    }
    
    public static boolean validarPrecio(JTextField jText) {
        String precio = jText.getText();
        
        if (!precio.matches("^(0|[1-9]\\d*)(\\.\\d+)?$")) {
            return false;
        }
        
        return true;
    }
    
    public static void desActivarCampos(JPanel panel, boolean valor) {
        for (Component comp : panel.getComponents()) {
            if (comp instanceof JTextField 
                || comp instanceof JComboBox 
                || comp instanceof JSpinner) {
            comp.setEnabled(valor);
            }
        }
    }
    
    public static void camposEditables(JPanel panel, boolean valor) {
        for (Component comp : panel.getComponents()) {
            if (comp instanceof JTextField) {
                ((JTextField) comp).setEditable(valor);
            }
            
            if (comp instanceof JComboBox) {
                ((JComboBox) comp).setEnabled(valor);
            }
            
            if (comp instanceof JSpinner) {
               ((JSpinner) comp).setEnabled(valor);
            }
        }
    }
    
    public static void cargarComboBox(JComboBox cboBox) {
        cboBox.removeAllItems();
        cboBox.addItem("");
        
        for (Categoria cat : Categoria.values()) {
            cboBox.addItem(cat.name());
        }
    }
    
    public static boolean validarCamposVacios(JPanel jPanel, JTextField txtPrecio) {
        
        for (int i = 0; i < jPanel.getComponents().length; i++) {
            
            if (jPanel.getComponents()[i] instanceof JTextField) {
                JTextField caja = (JTextField) jPanel.getComponents()[i];
                if (caja.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Debe completar todos los campos.", "Atención!", JOptionPane.WARNING_MESSAGE);
                    return false;
                }
                
                if (caja == txtPrecio && !validarPrecio(caja)) {
                    JOptionPane.showMessageDialog(null, "Debe ingresar un precio válido.", "Atención!", JOptionPane.ERROR_MESSAGE);
                    txtPrecio.setText("");
                    return false;
                }
            }
            
            if (jPanel.getComponents()[i] instanceof JComboBox) {
                JComboBox combo = (JComboBox) jPanel.getComponents()[i];
                if (combo.getSelectedItem() == null || !combo.isEnabled() || combo.getSelectedItem().toString().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Debe seleccionar una cateegoría.", "Atención!", JOptionPane.WARNING_MESSAGE);
                    return false;
                }
            }
            
            if (jPanel.getComponents()[i] instanceof JSpinner) {
                JSpinner spin = (JSpinner) jPanel.getComponents()[i];
                if ((int) spin.getValue() < 0) {
                    JOptionPane.showMessageDialog(null, "El stock no puede ser negativo.", "Atención!", JOptionPane.WARNING_MESSAGE);
                    return false;
                }
            }

        }
        return true;
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new MenuGeneral().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mniPorNombre;
    private javax.swing.JMenuItem mniPorPrecio;
    private javax.swing.JMenuItem mniPorRubro;
    private javax.swing.JMenuItem mniProductos;
    private javax.swing.JMenu mnuAdm;
    private javax.swing.JMenu mnuConsultas;
    // End of variables declaration//GEN-END:variables
}
