
package com.mycompany.p1proyectogrupal1_metodologiadesarrollosoftware.RegistrarCuenta;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;

public class GestionarCuentas extends javax.swing.JFrame {

    public GestionarCuentas() {
        initComponents();
        cargarDatos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        cuentasTb = new javax.swing.JTable();
        editarCuentaBtt = new javax.swing.JButton();
        eliminarBtt = new javax.swing.JButton();
        buscarNombreBtt = new javax.swing.JButton();
        buscarCedulaBtt = new javax.swing.JButton();
        desabilitarCuentaBtt = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cuentasTb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Email", "Contraseña", "nacimiento", "Cedula", "Rol"
            }
        ));
        jScrollPane1.setViewportView(cuentasTb);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 660, -1));

        editarCuentaBtt.setText("editar");
        editarCuentaBtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarCuentaBttActionPerformed(evt);
            }
        });
        getContentPane().add(editarCuentaBtt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 190, 200, 40));

        eliminarBtt.setText("eliminar");
        eliminarBtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarBttActionPerformed(evt);
            }
        });
        getContentPane().add(eliminarBtt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 270, 200, 50));

        buscarNombreBtt.setText("buscar nombre");
        buscarNombreBtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarNombreBttActionPerformed(evt);
            }
        });
        getContentPane().add(buscarNombreBtt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 350, 200, 50));

        buscarCedulaBtt.setText("buscar cedula");
        buscarCedulaBtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarCedulaBttActionPerformed(evt);
            }
        });
        getContentPane().add(buscarCedulaBtt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 430, 220, 50));

        desabilitarCuentaBtt.setText("jButton5");
        desabilitarCuentaBtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desabilitarCuentaBttActionPerformed(evt);
            }
        });
        getContentPane().add(desabilitarCuentaBtt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 500, 210, 50));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/GestionCuentas.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editarCuentaBttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarCuentaBttActionPerformed
        int selectedRow = cuentasTb.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Seleccione un usuario para editar.");
        return;
    }

    DefaultTableModel model = (DefaultTableModel) cuentasTb.getModel();
    String nombreActual = (String) model.getValueAt(selectedRow, 0);
    String emailActual = (String) model.getValueAt(selectedRow, 1);
    String contraseñaActual = (String) model.getValueAt(selectedRow, 2);
    String fechaNacimientoActual = (String) model.getValueAt(selectedRow, 3);
    String cedulaActual = (String) model.getValueAt(selectedRow, 4);
    String rolActual = (String) model.getValueAt(selectedRow, 5);

    // Crear campos para editar
    JTextField nombreTxt = new JTextField(nombreActual);
    JTextField emailTxt = new JTextField(emailActual);
    JPasswordField contraseñaTxt = new JPasswordField(contraseñaActual);
    JTextField fechaNacimientoTxt = new JTextField(fechaNacimientoActual);
    JTextField cedulaTxt = new JTextField(cedulaActual);
    JComboBox<String> rolComboBox = new JComboBox<>(new String[]{"Administrador", "Operario Logistico", "Repartidor"});

    rolComboBox.setSelectedItem(rolActual);

    Object[] message = {
        "Nombre:", nombreTxt,
        "Email:", emailTxt,
        "Contraseña:", contraseñaTxt,
        "Fecha de Nacimiento (dd/mm/yyyy):", fechaNacimientoTxt,
        "Cédula:", cedulaTxt,
        "Rol:", rolComboBox
    };

    int option = JOptionPane.showConfirmDialog(this, message, "Editar Usuario", JOptionPane.OK_CANCEL_OPTION);
    if (option == JOptionPane.OK_OPTION) {
        String nombre = nombreTxt.getText().trim();
        String email = emailTxt.getText().trim();
        String contraseña = new String(contraseñaTxt.getPassword()).trim();
        String fechaNacimiento = fechaNacimientoTxt.getText().trim();
        String cedula = cedulaTxt.getText().trim();
        String rol = (String) rolComboBox.getSelectedItem();

        // Validaciones
        if (nombre.split("\\s+").length < 4) {
            JOptionPane.showMessageDialog(this, "Debe ingresar al menos 4 nombres.");
            return;
        }

        if (!email.endsWith("@gmail.com") && !email.endsWith("@hotmail.com")) {
            JOptionPane.showMessageDialog(this, "El email debe ser @gmail.com o @hotmail.com.");
            return;
        }

        if (!validarContraseña(contraseña)) {
            JOptionPane.showMessageDialog(this, "La contraseña debe contener números y letras, y tener al menos 8 caracteres.");
            return;
        }

        if (!validarFecha(fechaNacimiento)) {
            JOptionPane.showMessageDialog(this, "La fecha de nacimiento debe estar en el formato dd/mm/aaaa y debe ser mayor de edad.");
            return;
        }

        if (!cedula.matches("\\d{10}")) {
            JOptionPane.showMessageDialog(this, "La cédula debe tener 10 dígitos.");
            return;
        }

        // Actualizar en la base de datos
        String connectionString = "mongodb://localhost:27017";
        try (MongoClient mongoClient = MongoClients.create(connectionString)) {
            MongoDatabase database = mongoClient.getDatabase("Paqueteria");
            MongoCollection<Document> collection = database.getCollection("usuarios");

            Document query = new Document("cedula", cedulaActual);
            Document newData = new Document("$set", new Document("nombre", nombre)
                                                    .append("email", email)
                                                    .append("contraseña", contraseña)
                                                    .append("fecha_nacimiento", fechaNacimiento)
                                                    .append("cedula", cedula)
                                                    .append("rol", rol));
            collection.updateOne(query, newData);

            // Actualizar la tabla
            model.setValueAt(nombre, selectedRow, 0);
            model.setValueAt(email, selectedRow, 1);
            model.setValueAt(contraseña, selectedRow, 2);
            model.setValueAt(fechaNacimiento, selectedRow, 3);
            model.setValueAt(cedula, selectedRow, 4);
            model.setValueAt(rol, selectedRow, 5);

            JOptionPane.showMessageDialog(this, "Usuario actualizado exitosamente.");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al actualizar el usuario en la base de datos.");
        }
    }
    }//GEN-LAST:event_editarCuentaBttActionPerformed

    private void eliminarBttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarBttActionPerformed
        int selectedRow = cuentasTb.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Seleccione un usuario para eliminar.");
        return;
    }

    DefaultTableModel model = (DefaultTableModel) cuentasTb.getModel();
    String cedula = (String) model.getValueAt(selectedRow, 4);

    int confirm = JOptionPane.showConfirmDialog(this, "¿Está seguro que desea eliminar este usuario?", "Confirmar Eliminación", JOptionPane.YES_NO_OPTION);
    if (confirm == JOptionPane.YES_OPTION) {
        String connectionString = "mongodb://localhost:27017";
        try (MongoClient mongoClient = MongoClients.create(connectionString)) {
            MongoDatabase database = mongoClient.getDatabase("Paqueteria");
            MongoCollection<Document> collection = database.getCollection("usuarios");

            Document query = new Document("cedula", cedula);
            collection.deleteOne(query);

            // Eliminar la fila de la tabla
            model.removeRow(selectedRow);

            JOptionPane.showMessageDialog(this, "Usuario eliminado exitosamente.");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al eliminar el usuario de la base de datos.");
        }
    }
    }//GEN-LAST:event_eliminarBttActionPerformed

    private void buscarNombreBttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarNombreBttActionPerformed
         String nombreBuscar = JOptionPane.showInputDialog(this, "Ingrese el nombre a buscar:");

    if (nombreBuscar != null && !nombreBuscar.trim().isEmpty()) {
        String connectionString = "mongodb://localhost:27017";
        try (MongoClient mongoClient = MongoClients.create(connectionString)) {
            MongoDatabase database = mongoClient.getDatabase("Paqueteria");
            MongoCollection<Document> collection = database.getCollection("usuarios");

            // Crear una consulta para buscar nombres que contengan la cadena de búsqueda
            MongoCursor<Document> cursor = collection.find(Filters.regex("nombre", nombreBuscar, "i")).iterator();
            DefaultTableModel model = (DefaultTableModel) cuentasTb.getModel();
            model.setRowCount(0); // Limpiar la tabla antes de agregar los datos

            while (cursor.hasNext()) {
                Document doc = cursor.next();
                Object[] rowData = {
                    doc.getString("nombre"),
                    doc.getString("email"),
                    doc.getString("contraseña"),
                    doc.getString("fecha_nacimiento"),
                    doc.getString("cedula"),
                    doc.getString("rol")
                };
                model.addRow(rowData);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al buscar el nombre en la base de datos.");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Debe ingresar un nombre para buscar.");
    }
    }//GEN-LAST:event_buscarNombreBttActionPerformed

    private void buscarCedulaBttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarCedulaBttActionPerformed
             String nombreBuscar = JOptionPane.showInputDialog(this, "Ingrese la cedula a buscar:");

    if (nombreBuscar != null && !nombreBuscar.trim().isEmpty()) {
        String connectionString = "mongodb://localhost:27017";
        try (MongoClient mongoClient = MongoClients.create(connectionString)) {
            MongoDatabase database = mongoClient.getDatabase("Paqueteria");
            MongoCollection<Document> collection = database.getCollection("usuarios");

            // Crear una consulta para buscar nombres que contengan la cadena de búsqueda
            MongoCursor<Document> cursor = collection.find(Filters.regex("cedula", nombreBuscar, "i")).iterator();
            DefaultTableModel model = (DefaultTableModel) cuentasTb.getModel();
            model.setRowCount(0); // Limpiar la tabla antes de agregar los datos

            while (cursor.hasNext()) {
                Document doc = cursor.next();
                Object[] rowData = {
                    doc.getString("nombre"),
                    doc.getString("email"),
                    doc.getString("contraseña"),
                    doc.getString("fecha_nacimiento"),
                    doc.getString("cedula"),
                    doc.getString("rol")
                };
                model.addRow(rowData);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al buscar el nombre en la base de datos.");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Debe ingresar un nombre para buscar.");
    }
    }//GEN-LAST:event_buscarCedulaBttActionPerformed

    private void desabilitarCuentaBttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desabilitarCuentaBttActionPerformed
         int selectedRow = cuentasTb.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Seleccione un usuario para deshabilitar.");
        return;
    }

    DefaultTableModel model = (DefaultTableModel) cuentasTb.getModel();
    String cedula = (String) model.getValueAt(selectedRow, 4);

    int confirm = JOptionPane.showConfirmDialog(this, "¿Está seguro que desea deshabilitar esta cuenta?", "Confirmar Deshabilitación", JOptionPane.YES_NO_OPTION);
    if (confirm == JOptionPane.YES_OPTION) {
        String connectionString = "mongodb://localhost:27017";
        try (MongoClient mongoClient = MongoClients.create(connectionString)) {
            MongoDatabase database = mongoClient.getDatabase("Paqueteria");
            MongoCollection<Document> usuariosCollection = database.getCollection("usuarios");
            MongoCollection<Document> exEmpleadosCollection = database.getCollection("ex_empleados");

            // Encontrar el documento del usuario
            Document query = new Document("cedula", cedula);
            Document usuario = usuariosCollection.find(query).first();

            if (usuario != null) {
                // Insertar el documento en la colección "ex_empleados"
                exEmpleadosCollection.insertOne(usuario);

                // Eliminar el documento de la colección "usuarios"
                usuariosCollection.deleteOne(query);

                // Eliminar la fila de la tabla
                model.removeRow(selectedRow);

                JOptionPane.showMessageDialog(this, "Cuenta deshabilitada exitosamente.");
            } else {
                JOptionPane.showMessageDialog(this, "Error al encontrar el usuario en la base de datos.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al deshabilitar la cuenta en la base de datos.");
        }
    }
    }//GEN-LAST:event_desabilitarCuentaBttActionPerformed
    
    private boolean validarContraseña(String contraseña) {
    // Expresión regular para validar que la contraseña contenga al menos una letra y un número
    // y tenga una longitud mínima de 8 caracteres
    String regex = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(contraseña);
    return matcher.matches();
}

private boolean validarFecha(String fecha) {
    // Expresión regular para validar el formato de fecha dd/mm/aaaa
    String regex = "^([0-2][0-9]|(3)[0-1])\\/((0)[1-9]|(1)[0-2])\\/\\d{4}$";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(fecha);
    if (!matcher.matches()) {
        return false;
    }

    // Verificar si la persona es mayor de 18 años
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    try {
        LocalDate fechaNacimiento = LocalDate.parse(fecha, formatter);
        LocalDate hoy = LocalDate.now();
        Period edad = Period.between(fechaNacimiento, hoy);
        return edad.getYears() >= 18;
    } catch (DateTimeParseException e) {
        return false;
    }
}

    private void cargarDatos() {
        String connectionString = "mongodb://localhost:27017";
        try (MongoClient mongoClient = MongoClients.create(connectionString)) {
            MongoDatabase database = mongoClient.getDatabase("Paqueteria");
            MongoCollection<Document> collection = database.getCollection("usuarios");

            MongoCursor<Document> cursor = collection.find().iterator();
            DefaultTableModel model = (DefaultTableModel) cuentasTb.getModel();
            model.setRowCount(0); // Limpiar la tabla antes de agregar los datos

            while (cursor.hasNext()) {
                Document doc = cursor.next();
                Object[] rowData = {
                    doc.getString("nombre"),
                    doc.getString("email"),
                    doc.getString("contraseña"),
                    doc.getString("fecha_nacimiento"),
                    doc.getString("cedula"),
                    doc.getString("rol")
                };
                model.addRow(rowData);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al cargar los datos de la base de datos.");
        }
    }

    /**
     * @param args the command line arguments
     */
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GestionarCuentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionarCuentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionarCuentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionarCuentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionarCuentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarCedulaBtt;
    private javax.swing.JButton buscarNombreBtt;
    private javax.swing.JTable cuentasTb;
    private javax.swing.JButton desabilitarCuentaBtt;
    private javax.swing.JButton editarCuentaBtt;
    private javax.swing.JButton eliminarBtt;
    private javax.swing.JLabel fondo;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
