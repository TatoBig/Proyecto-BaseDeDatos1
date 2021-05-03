/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectobasededatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aleja
 */
public class ventaItem extends javax.swing.JInternalFrame {

    Conexion conexion = new Conexion();
    PreparedStatement ps = null;
    ResultSet rs = null;
    Integer total = 0, subtotal = 0, totalProductos = 0;
    ArrayList<Venta> queryActualizar = new ArrayList<Venta>();
    ArrayList<VentaHasProducto> ventasIndividuales = new ArrayList<VentaHasProducto>();
    DefaultTableModel model;

    /**
     * Creates new form ventaItem
     */
    public ventaItem() {
        initComponents();
        model = (DefaultTableModel) jTable1.getModel();
        jComboBox1.addItem("Seleccionar producto");
        try (Connection cnx = conexion.getConnection()) {
            String query = "SELECT * FROM producto INNER JOIN categor�a ON producto.Categor�a_id=categor�a.id";
            ps = cnx.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                jComboBox1.addItem(rs.getString("producto.nombre"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        panelDatosCliente = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        getNit = new javax.swing.JTextField();
        getNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        getApellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        getDireccion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        autoCompletar = new javax.swing.JButton();
        getCliente = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        agregar = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        finalizar = new javax.swing.JButton();
        getCantidadVendida = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        textSubtotal = new javax.swing.JTextField();
        textTotal = new javax.swing.JTextField();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        setBackground(new java.awt.Color(82, 97, 107));
        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("VENTAS");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelDatosCliente.setBackground(new java.awt.Color(240, 245, 249));
        panelDatosCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(82, 97, 107), 2));
        panelDatosCliente.setForeground(new java.awt.Color(82, 97, 107));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(30, 32, 34));
        jLabel1.setText("DATOS DEL CLIENTE");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(30, 32, 34));
        jLabel2.setText("NIT:");

        getNit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getNitActionPerformed(evt);
            }
        });

        getNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getNombreActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(30, 32, 34));
        jLabel3.setText("Nombre:");

        getApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getApellidoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(30, 32, 34));
        jLabel4.setText("Apellido:");

        getDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getDireccionActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(30, 32, 34));
        jLabel5.setText("Direcci�n:");

        autoCompletar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        autoCompletar.setForeground(new java.awt.Color(30, 32, 34));
        autoCompletar.setText("Autocompletar ");
        autoCompletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autoCompletarActionPerformed(evt);
            }
        });

        getCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getCliente.setForeground(new java.awt.Color(30, 32, 34));
        getCliente.setText("Guardar");
        getCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDatosClienteLayout = new javax.swing.GroupLayout(panelDatosCliente);
        panelDatosCliente.setLayout(panelDatosClienteLayout);
        panelDatosClienteLayout.setHorizontalGroup(
            panelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosClienteLayout.createSequentialGroup()
                .addGroup(panelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosClienteLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(panelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelDatosClienteLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(40, 40, 40)
                                .addComponent(getDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelDatosClienteLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(40, 40, 40)
                                .addComponent(getApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelDatosClienteLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(40, 40, 40)
                                .addComponent(getNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelDatosClienteLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(40, 40, 40)
                                .addComponent(getNit, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(autoCompletar))
                    .addGroup(panelDatosClienteLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(getCliente))
                    .addGroup(panelDatosClienteLayout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(jLabel1)))
                .addContainerGap(163, Short.MAX_VALUE))
        );
        panelDatosClienteLayout.setVerticalGroup(
            panelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDatosClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(panelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(getNit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(autoCompletar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(getNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(getApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(getDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(getCliente)
                .addGap(20, 20, 20))
        );

        getContentPane().add(panelDatosCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 23, 532, -1));

        jPanel2.setBackground(new java.awt.Color(201, 214, 223));

        jTable1.setBackground(new java.awt.Color(201, 214, 223));
        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(82, 97, 107), 2));
        jTable1.setForeground(new java.awt.Color(201, 214, 223));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No. ", "Producto", "Cantidad", "Subtotal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable1);

        jPanel1.setBackground(new java.awt.Color(240, 245, 249));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(82, 97, 107), 2));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(30, 32, 34));
        jLabel7.setText("Producto:");

        agregar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        agregar.setForeground(new java.awt.Color(30, 32, 34));
        agregar.setText("Agregar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(30, 32, 34));
        jLabel6.setText("AGREGAR ARTICULOS VENDIDOS");

        finalizar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        finalizar.setForeground(new java.awt.Color(30, 32, 34));
        finalizar.setText("Confirmar Factura");
        finalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(30, 32, 34));
        jLabel8.setText("Cantidad:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(30, 32, 34));
        jLabel9.setText("Total:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(30, 32, 34));
        jLabel10.setText("Subtotal:");

        textSubtotal.setText("Subtotal");
        textSubtotal.setToolTipText("");
        textSubtotal.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        textSubtotal.setEnabled(false);

        textTotal.setText("Total");
        textTotal.setToolTipText("");
        textTotal.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        textTotal.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel7))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(getCantidadVendida, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(67, 67, 67)
                            .addComponent(agregar))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(32, 32, 32)
                            .addComponent(jLabel10)
                            .addGap(18, 18, 18)
                            .addComponent(textSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(finalizar)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(textTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(getCantidadVendida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(agregar)
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addComponent(finalizar)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void getNitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getNitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getNitActionPerformed

    private void getNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getNombreActionPerformed

    private void getApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getApellidoActionPerformed

    private void getDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getDireccionActionPerformed

    private void getClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getClienteActionPerformed
        try (Connection cnx = conexion.getConnection()) {
            String query = "INSERT INTO cliente (NIT,Nombre,Apellido,Direccion) VALUES (?,?,?,?)";
            ps = cnx.prepareStatement(query);
            ps.setString(1, getNit.getText());
            ps.setString(2, getNombre.getText());
            ps.setString(3, getApellido.getText());
            ps.setString(4, getDireccion.getText());
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_getClienteActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        Venta venta = new Venta();
        String productoNombre = String.valueOf(jComboBox1.getSelectedItem());
        jComboBox1.removeItemAt(jComboBox1.getSelectedIndex());
        Integer cantidad = Integer.parseInt(getCantidadVendida.getText());
        try (Connection cnx = conexion.getConnection()) {
            System.out.println(productoNombre);
            String query = "SELECT * FROM producto WHERE producto.Nombre='" + productoNombre + "'";
            venta.setQuery1(query);
            ps = cnx.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                if (cantidad <= rs.getInt("producto.cantidad")) {
                    this.subtotal = rs.getInt("producto.Precio_Venta") * cantidad;
                    this.total = total + subtotal;
                    textSubtotal.setText(subtotal.toString());
                    textTotal.setText(total.toString());
                    String query2 = "UPDATE producto SET Cantidad ='" + (rs.getInt("producto.cantidad") - cantidad) + "' WHERE producto.Nombre='" + productoNombre + "'" + " AND producto.id='" + rs.getInt("producto.id") + "'";
                    venta.setQuery2(query2);
                    venta.setCantidad(cantidad);
                    queryActualizar.add(venta);
                    //ps = cnx.prepareStatement(query2);
                    //ps.setInt(1, (rs.getInt("producto.cantidad") - cantidad));
                    //ps.setInt(2, rs.getInt("producto.id"));
                    //ps.executeUpdate();
                    totalProductos++;
                    model.addRow(new Object[]{totalProductos, rs.getString("producto.Nombre"), cantidad, subtotal});
                    VentaHasProducto nuevaVenta = new VentaHasProducto(1, 1, totalProductos, (subtotal / cantidad), subtotal, rs.getString("producto.Nombre"));
                    ventasIndividuales.add(nuevaVenta);
                    getCantidadVendida.setText("");

                    System.out.println("Vendido!");
                } else {
                    JOptionPane.showMessageDialog(this, "No hay suficientes unidades en el inventario", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_agregarActionPerformed

    private void autoCompletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autoCompletarActionPerformed
        try (Connection cnx = conexion.getConnection()) {
            String query = "SELECT * FROM cliente WHERE cliente.NIT='" + getNit.getText() + "'";
            ps = cnx.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                getNit.setText(rs.getString("cliente.NIT"));
                getNombre.setText(rs.getString("cliente.Nombre"));
                getApellido.setText(rs.getString("cliente.Apellido"));
                getDireccion.setText(rs.getString("cliente.Direccion"));
                getCliente.setVisible(false);
                getNit.disable();
                getNombre.disable();
                getApellido.disable();
                getDireccion.disable();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "No existe el usuario en la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_autoCompletarActionPerformed

    private void finalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizarActionPerformed
        String queryIndividual;
        try (Connection cnx = conexion.getConnection()) {
            for (int i = 0; i < queryActualizar.size(); i++) {
                ps = cnx.prepareStatement(queryActualizar.get(i).getQuery1());
                rs = ps.executeQuery();
                while (rs.next()) {
                    textSubtotal.setText(subtotal.toString());
                    textTotal.setText(total.toString());
                    ps = cnx.prepareStatement(queryActualizar.get(i).getQuery2());
                    //ps.setInt(1, (rs.getInt("producto.cantidad") - cantidad));
                    //ps.setInt(2, rs.getInt("producto.id"));
                    ps.executeUpdate();
                    System.out.println("Vendido!");
                }
            }
            String query = "call insertarVenta(" + total + ",1,'" + getNit.getText() + "')";
            System.out.println(query);
            ps = cnx.prepareStatement(query);
            ps.executeUpdate();
            for (int i = 0; i < ventasIndividuales.size(); i++) {
                queryIndividual = "call insertarVentaHasProducto ('" + ventasIndividuales.get(i).getNombre() + "', " + ventasIndividuales.get(i).getCantidad_Vendida() + ", " + ventasIndividuales.get(i).getPrecio() + ", " + ventasIndividuales.get(i).getSubtotal() + ")";
                System.out.println(queryIndividual);
                ps = cnx.prepareStatement(queryIndividual);
                ps.executeUpdate();
            }
            JOptionPane.showMessageDialog(this, "Venta realizada exitosamente");
        } catch (Exception e) {
            System.out.println(e);
        }
        this.dispose();
    }//GEN-LAST:event_finalizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JButton autoCompletar;
    private javax.swing.JButton finalizar;
    private javax.swing.JTextField getApellido;
    private javax.swing.JTextField getCantidadVendida;
    private javax.swing.JButton getCliente;
    private javax.swing.JTextField getDireccion;
    private javax.swing.JTextField getNit;
    private javax.swing.JTextField getNombre;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JPanel panelDatosCliente;
    private javax.swing.JTextField textSubtotal;
    private javax.swing.JTextField textTotal;
    // End of variables declaration//GEN-END:variables
}
