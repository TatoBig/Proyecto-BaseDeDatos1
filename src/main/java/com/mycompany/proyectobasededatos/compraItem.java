/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectobasededatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author aleja
 */
public class compraItem extends javax.swing.JInternalFrame {

    /**
     * Creates new form compraItem
     */
    DefaultTableModel model;
    int subtotal; //guardar el total de la venta al agregar un producto
    Conexion conexion = new Conexion();
    PreparedStatement ps = null;
    ResultSet rs = null;
    String usid;
    String proid;
    int total;
    String hora;
    int compraID;

    public compraItem() {
        initComponents();
        cargarProductos();
        cargarProveedores();
        ajustarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbxProducto = new javax.swing.JComboBox<>();
        btnAgregarProducto = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblPrecioVenta = new javax.swing.JLabel();
        lblCosto = new javax.swing.JLabel();
        lblCategoria = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        spnCantidad = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        cbxProveedor = new javax.swing.JComboBox<>();
        btnAgregarProveedor = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lbTotal = new javax.swing.JLabel();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(890, 900));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Seleccione un producto");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 25, -1, -1));

        cbxProducto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxProductoItemStateChanged(evt);
            }
        });
        cbxProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxProductoActionPerformed(evt);
            }
        });
        jPanel1.add(cbxProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 21, 204, -1));

        btnAgregarProducto.setText("AGREGAR");
        btnAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProductoActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(636, 21, 92, 22));

        jLabel2.setText("Si el producto es nuevo lo puede agregar");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 25, -1, -1));

        jLabel3.setText("Especificaciones del producto");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 54, -1, -1));

        jLabel4.setText("Precio venta:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 71, -1, -1));

        jLabel5.setText("Costo:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 71, -1, -1));

        jLabel6.setText("Categoria:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(631, 71, -1, -1));
        jPanel1.add(lblPrecioVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 71, 93, 14));
        jPanel1.add(lblCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 71, 112, 14));
        jPanel1.add(lblCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(692, 71, 105, 14));

        jLabel7.setText("Cantidad a comprar:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 114, -1, -1));
        jPanel1.add(spnCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 111, -1));

        jButton1.setText("AGREGAR A COMPRA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 137, 152, -1));

        jLabel11.setText("Id:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 71, -1, -1));
        jPanel1.add(lblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 71, 26, 14));

        jLabel12.setText("Nombre:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 71, -1, -1));
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 71, 74, 14));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 840, 165));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setText("Seleccione el proveedor de la compra:");

        btnAgregarProveedor.setText("AGREGAR");
        btnAgregarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProveedorActionPerformed(evt);
            }
        });

        jLabel10.setText("Agregar un nuevo proveedor");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(btnAgregarProveedor)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbxProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarProveedor)
                    .addComponent(jLabel10))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 182, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 299, 812, 117));

        jButton2.setText("CONFIRMAR COMPRA");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(656, 447, -1, 36));

        jLabel9.setText("DESCRIPCION DE LA COMPRA");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 274, -1, -1));

        jLabel13.setText("Total:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 447, -1, -1));
        getContentPane().add(lbTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 112, 14));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProductoActionPerformed
        // TODO add your handling code here:
        Nuevoproduc p = new Nuevoproduc();
        p.setVisible(true);


    }//GEN-LAST:event_btnAgregarProductoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Producto p = new Producto();
        p.setId(Integer.parseInt(this.lblID.getText()));
        p.setNombre(this.lblNombre.getText());
        p.setCosto(Integer.parseInt(this.lblCosto.getText()));
        p.setCrecio_Venta(Integer.parseInt(this.lblPrecioVenta.getText()));
        p.setCantidad(Integer.parseInt(this.spnCantidad.getValue().toString()));
        p.setCategoria_id(Integer.parseInt(this.lblCategoria.getText()));
        Object item[] = new Object[6];
        item[0] = p.getId();
        item[1] = p.getCosto();
        item[2] = p.getNombre();
        item[3] = p.getCrecio_Venta();
        item[4] = p.getCantidad();
        item[5] = p.getCategoria_id();
        model.addRow(item);
        subtotal = subtotal + (p.getCosto() * p.getCantidad());
        this.lbTotal.setText(String.valueOf(subtotal));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         // TODO add your handling code here:
        String id, cantidad;
        //actualizar los productos
        for (int i = 0; i < jTable1.getRowCount(); i++) {
            //busco los datos que se van a actualizar en la tabla
            id = String.valueOf(jTable1.getValueAt(i, 0));
            cantidad = String.valueOf(jTable1.getValueAt(i, 4));
            //ejecutar sentencia 

            try (Connection cnx = conexion.getConnection()) {

                String query = "UPDATE producto SET Cantidad =Cantidad + " + cantidad + " WHERE producto.id='" + id + "'";

                ps = cnx.prepareStatement(query);
                ps.executeUpdate();

            } catch (Exception e) {

            }

        }
        //insertar la venta 
        insertarVenta();
        //actualizar la tabla intermedia 
        descripcionCompra();
       // JOptionPane.showMessageDialog(null, "COMPRA REALIZADA", "EXITO", JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

     public void descripcionCompra() {
        compraID = idCompra(hora, total);
        Conexion conexion = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        int id, cantidad, precio, subtotal;
        for (int i = 0; i < jTable1.getRowCount(); i++) {
            id = Integer.parseInt(jTable1.getValueAt(i, 0).toString());
            cantidad = Integer.parseInt(jTable1.getValueAt(i, 4).toString());
            precio = Integer.parseInt(jTable1.getValueAt(i, 1).toString());
            subtotal = cantidad * precio;
            try (Connection cnx = conexion.getConnection()) {
                String sql = "INSERT INTO compra_has_producto(Compra_id, Producto_id, Cantidad_Comprada, Precio,Subtotal) VALUES(?,?,?,?,?)";
                ps = cnx.prepareStatement(sql);
                ps.setInt(1, compraID);
                ps.setInt(2, id);
                ps.setInt(3, cantidad);
                ps.setInt(4, precio);
                ps.setInt(5, subtotal);
                ps.execute();
                ps.close();
                System.out.println("compra ingresada");

            } catch (Exception e) {

            }

        }
    }
     
     public void insertarVenta() {
        //id del usuario
        Login v = new Login();
        usid = v.usuarioID;
        //id el proveedor
        proid = idProvedor();
        //total de la compra
        total = Integer.parseInt(lbTotal.getText());
        //hora
        hora = fecha();

        Conexion conexion = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try (Connection cnx = conexion.getConnection()) {
            String sql = "INSERT INTO compra(Fecha, Total, Proveedor_id, Usuario_id) VALUES(?,?,?,?)";
            ps = cnx.prepareStatement(sql);
            ps.setString(1, hora);
            ps.setInt(2, total);
            ps.setInt(3, Integer.parseInt(proid));
            ps.setInt(4, Integer.parseInt(usid));

            ps.execute();
            ps.close();
            System.out.println("compra ingresado");

        } catch (Exception e) {

        }
    }

    public int idCompra(String fecha, int total) {
        int id = 0;
        Conexion conexion = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try (Connection cnx = conexion.getConnection()) {
            String query = "SELECT id FROM compra WHERE Fecha='" + fecha + "' AND Total=" + String.valueOf(total);
            ps = cnx.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {

                id = rs.getInt("id");

            }
        } catch (Exception e) {
        }

        return id;
    }
    
    public String idProvedor() {
        String id = new String();
        Conexion conexion = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        int index = this.cbxProveedor.getSelectedIndex();
        String nombre = this.cbxProveedor.getItemAt(index);
        try (Connection cnx = conexion.getConnection()) {
            String query = "SELECT id FROM Proveedor WHERE Nombre='" + nombre + "'";
            ps = cnx.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {

                id = rs.getString("id").toString();

            }
        } catch (Exception e) {
        }
        return id;
    }
    
    public String fecha() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        return dtf.format(LocalDateTime.now());
    }
    
    private void btnAgregarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProveedorActionPerformed
        // TODO add your handling code here:
        NuevoProveedor p = new NuevoProveedor();
        p.setVisible(true);
    }//GEN-LAST:event_btnAgregarProveedorActionPerformed

    private void cbxProductoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxProductoItemStateChanged
        // TODO add your handling code here:
        /* int index=this.cbxProducto.getSelectedIndex();
        String nombre=this.cbxProducto.getItemAt(index);
        Conexion conexion = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try(Connection cnx = conexion.getConnection()) {
            String sql="SELECT * FROM producto WHERE Nombre=?";
            ps.setString(1, nombre);
            rs=ps.executeQuery();
            while(rs.next()){
                System.out.println("encontro algo");
                this.lblID.setText(String.valueOf(rs.getInt("id")));
                this.lblPrecioVenta.setText(String.valueOf(rs.getInt("Precio_Venta")));
                this.lblCosto.setText(String.valueOf(rs.getInt("Costo")));
                this.lblCategoria.setText(String.valueOf(rs.getInt("Cstegoria")));
                
            }
            ps.close();
        } catch (Exception e) {
        }*/

    }//GEN-LAST:event_cbxProductoItemStateChanged

    private void cbxProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxProductoActionPerformed
        int index = this.cbxProducto.getSelectedIndex();
        String nombre = this.cbxProducto.getItemAt(index);
        System.out.println(nombre);
        Conexion conexion = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try (Connection cnx = conexion.getConnection()) {
            String sql = "SELECT * FROM producto WHERE Nombre=?";
            ps = cnx.prepareStatement(sql);
            ps.setString(1, nombre);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("encontro algo");
                this.lblID.setText(String.valueOf(rs.getInt("id")));
                this.lblNombre.setText(rs.getString("Nombre"));
                this.lblPrecioVenta.setText(String.valueOf(rs.getInt("Precio_Venta")));
                this.lblCosto.setText(String.valueOf(rs.getInt("Costo")));
                this.lblCategoria.setText(String.valueOf(rs.getInt("Categoria_id")));

            }
            ps.close();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_cbxProductoActionPerformed

    public void cargarProductos() {
        this.cbxProducto.removeAllItems();
        Conexion conexion = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try (Connection cnx = conexion.getConnection()) {
            String query = "SELECT Nombre FROM Producto";
            ps = cnx.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {

                this.cbxProducto.addItem(rs.getString("Nombre"));

            }
        } catch (Exception e) {
        }

    }

    public void cargarProveedores() {
        this.cbxProveedor.removeAllItems();
        Conexion conexion = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try (Connection cnx = conexion.getConnection()) {
            String query = "SELECT Nombre FROM Proveedor";
            ps = cnx.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {

                this.cbxProveedor.addItem(rs.getString("Nombre"));

            }
        } catch (Exception e) {
        }
    }

    public void ajustarTabla() {

        model = new DefaultTableModel();
        model.addColumn("Id Producto");
        model.addColumn("Costo");
        model.addColumn("Nombre");
        model.addColumn("Precio_Venta");
        model.addColumn("Cantidad");
        model.addColumn("Categoria_id");
        this.jTable1.setModel(model);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarProducto;
    private javax.swing.JButton btnAgregarProveedor;
    private javax.swing.JComboBox<String> cbxProducto;
    private javax.swing.JComboBox<String> cbxProveedor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbTotal;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblCosto;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecioVenta;
    private javax.swing.JSpinner spnCantidad;
    // End of variables declaration//GEN-END:variables
}
