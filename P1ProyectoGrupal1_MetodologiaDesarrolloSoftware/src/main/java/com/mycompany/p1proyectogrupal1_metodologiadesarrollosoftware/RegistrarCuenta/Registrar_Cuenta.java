
package com.mycompany.p1proyectogrupal1_metodologiadesarrollosoftware.RegistrarCuenta;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mycompany.p1proyectogrupal1_metodologiadesarrollosoftware.Repartidor.Panel_Repartidor;
import java.awt.Color;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import org.bson.Document;

public class Registrar_Cuenta extends javax.swing.JFrame {

    public Registrar_Cuenta() {
        initComponents();
        nombreTxt.setOpaque(false);
        nombreTxt.setBackground(new Color (0,0,0,0));
        emailTxt.setOpaque(false);
        emailTxt.setBackground(new Color (0,0,0,0));
        contraseñaTxt.setOpaque(false);
        contraseñaTxt.setBackground(new Color (0,0,0,0));
        fechaNacimientoTxt.setOpaque(false);
        fechaNacimientoTxt.setBackground(new Color (0,0,0,0));
        cedulaTxt.setOpaque(false);
        cedulaTxt.setBackground(new Color (0,0,0,0));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cedulaTxt = new javax.swing.JTextField();
        fechaNacimientoTxt = new javax.swing.JTextField();
        emailTxt = new javax.swing.JTextField();
        nombreTxt = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        contraseñaTxt = new javax.swing.JPasswordField();
        idGeneradoLb = new javax.swing.JLabel();
        usuarioGeneradoLb = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();
        panelBtt = new javax.swing.JButton();
        almacenBodega = new javax.swing.JButton();
        envioPaqueteBtt = new javax.swing.JButton();
        rastreoEnvioBtt = new javax.swing.JButton();
        cuentaBtt = new javax.swing.JButton();
        mostrarContraBtt = new javax.swing.JButton();
        historialEnvioBtt = new javax.swing.JButton();
        registrarBtt = new javax.swing.JButton();
        salirBtt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cedulaTxt.setBorder(null);
        getContentPane().add(cedulaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 640, 240, 40));

        fechaNacimientoTxt.setBorder(null);
        getContentPane().add(fechaNacimientoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 470, 240, 40));

        emailTxt.setBorder(null);
        getContentPane().add(emailTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 320, 240, 40));

        nombreTxt.setBorder(null);
        getContentPane().add(nombreTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 240, 240, 40));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Administrador", "Operario Logistico", "Repartidor" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 550, 230, 50));

        contraseñaTxt.setBorder(null);
        getContentPane().add(contraseñaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 390, 230, 40));
        getContentPane().add(idGeneradoLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 220, 40));
        getContentPane().add(usuarioGeneradoLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, 220, 40));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/RegistrarCuenta.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 800));

        panelBtt.setText("panel");
        panelBtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelBttActionPerformed(evt);
            }
        });
        getContentPane().add(panelBtt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 200, 50));

        almacenBodega.setText("Almacen de bodega");
        getContentPane().add(almacenBodega, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 230, 50));

        envioPaqueteBtt.setText("envio paquete");
        getContentPane().add(envioPaqueteBtt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 230, 30));

        rastreoEnvioBtt.setText("rastreo de envio");
        rastreoEnvioBtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rastreoEnvioBttActionPerformed(evt);
            }
        });
        getContentPane().add(rastreoEnvioBtt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 230, 30));

        cuentaBtt.setText("cuenta");
        getContentPane().add(cuentaBtt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 120, 30));

        mostrarContraBtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarContraBttActionPerformed(evt);
            }
        });
        getContentPane().add(mostrarContraBtt, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 393, 40, 30));

        historialEnvioBtt.setText("cuenta");
        getContentPane().add(historialEnvioBtt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, 160, 50));

        registrarBtt.setText("registrar");
        registrarBtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarBttActionPerformed(evt);
            }
        });
        getContentPane().add(registrarBtt, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 720, 210, 30));

        salirBtt.setText("salir");
        salirBtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirBttActionPerformed(evt);
            }
        });
        getContentPane().add(salirBtt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 720, 120, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rastreoEnvioBttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rastreoEnvioBttActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rastreoEnvioBttActionPerformed

    private void registrarBttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarBttActionPerformed
     String nombre = nombreTxt.getText().trim();
    String email = emailTxt.getText().trim();
    String contraseña = contraseñaTxt.getText().trim();
    String fechaNacimiento = fechaNacimientoTxt.getText().trim();
    String cedula = cedulaTxt.getText().trim();
    String rol = (String) jComboBox1.getSelectedItem();
    String numeroPlaca = null;

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

    if ("Seleccionar".equals(rol)) {
        JOptionPane.showMessageDialog(this, "Debe seleccionar un rol válido.");
        return;
    }

    // Solicitar número de placa si el rol es "Repartidor"
    if ("Repartidor".equals(rol)) {
        numeroPlaca = JOptionPane.showInputDialog(this, "Ingrese el número de placa (formato: ABC-1234):");
        if (numeroPlaca == null || !validarNumeroPlaca(numeroPlaca)) {
            JOptionPane.showMessageDialog(this, "El número de placa no es válido. Debe estar en el formato ABC-1234.");
            return;
        }
    }

    // Conectar a MongoDB y obtener la base de datos y colección
    String connectionString = "mongodb://localhost:27017";
    try (MongoClient mongoClient = MongoClients.create(connectionString)) {
        MongoDatabase database = mongoClient.getDatabase("Paqueteria");
        MongoCollection<Document> collection = database.getCollection("usuarios");

        // Verificar si ya existe un usuario con la misma cédula o correo electrónico
        if (existeCedula(collection, cedula)) {
            JOptionPane.showMessageDialog(this, "Ya existe un usuario con esta cédula.");
            return;
        }

        if (existeEmail(collection, email)) {
            JOptionPane.showMessageDialog(this, "Ya existe un usuario con este correo electrónico.");
            return;
        }

        // Generar usuario
        String usuarioGenerado = generarUsuario(nombre, fechaNacimiento);
        usuarioGeneradoLb.setText(usuarioGenerado);

        // Generar ID
        String idGenerado = generarId(cedula, fechaNacimiento);
        idGeneradoLb.setText(idGenerado);

        // Crear el documento a insertar
        Document usuario = new Document("nombre", nombre)
                                .append("email", email)
                                .append("contraseña", contraseña)
                                .append("fecha_nacimiento", fechaNacimiento)
                                .append("cedula", cedula)
                                .append("rol", rol)
                                .append("usuario", usuarioGenerado)
                                .append("id", idGenerado);

        if (numeroPlaca != null) {
            usuario.append("numeroPlaca", numeroPlaca);
        }

        // Insertar el documento en la colección
        collection.insertOne(usuario);
        JOptionPane.showMessageDialog(this, "Cuenta registrada exitosamente.");
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al registrar la cuenta.");
    }
}
    
        public boolean existeCedula(MongoCollection<Document> collection, String cedula) {
        return collection.find(Filters.eq("cedula", cedula)).first() != null;
    }

    public boolean existeEmail(MongoCollection<Document> collection, String email) {
        return collection.find(Filters.eq("email", email)).first() != null;
    }

    private boolean validarNumeroPlaca(String numeroPlaca) {
    // Expresión regular para validar el formato de placa ABC-1234
    String regex = "^[A-Z]{3}-\\d{4}$";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(numeroPlaca);
    return matcher.matches();
    }
    
    private boolean validarContraseña(String contraseña) {
        // Expresión regular para validar que la contraseña contenga al menos una letra y un número
        // y tenga una longitud mínima de 8 caracteres
        String regex = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(contraseña);
        return matcher.matches();
    }

    private String generarId(String cedula, String fechaNacimiento) {
        // Obtener los primeros 5 dígitos de la cédula
        String primerosCincoDigitos = cedula.substring(0, 5);

        // Obtener el año de nacimiento
        String añoNacimiento = fechaNacimiento.substring(6, 10);

        // Concatenar para formar el ID
        return primerosCincoDigitos + añoNacimiento;
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
    }//GEN-LAST:event_registrarBttActionPerformed

    private void salirBttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirBttActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirBttActionPerformed

    private void panelBttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelBttActionPerformed
        Panel_Repartidor R1 = new Panel_Repartidor ();
        R1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_panelBttActionPerformed
    
    private boolean mostrarContraseña = false;
    private void mostrarContraBttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarContraBttActionPerformed
       
    mostrarContraseña = !mostrarContraseña;
    if (mostrarContraseña) {
        contraseñaTxt.setEchoChar((char) 0); // Mostrar la contraseña
    } else {
        contraseñaTxt.setEchoChar('*'); // Ocultar la contraseña
    }
    }//GEN-LAST:event_mostrarContraBttActionPerformed
    
    private String generarUsuario(String nombre, String fechaNacimiento) {
    // Dividir el nombre completo en partes
    String[] nombres = nombre.split("\\s+");
    if (nombres.length < 4) {
        throw new IllegalArgumentException("Debe ingresar al menos 4 nombres.");
    }

    // Obtener la primera inicial del primer nombre, la primera inicial del segundo nombre y el primer apellido
    String inicial1 = nombres[0].substring(0, 1).toLowerCase();
    String inicial2 = nombres[1].substring(0, 1).toLowerCase();
    String primerApellido = nombres[2].toLowerCase();

    // Obtener el día de nacimiento
    String diaNacimiento = fechaNacimiento.substring(0, 2);

    // Concatenar para formar el nombre de usuario
    return inicial1 + inicial2 + primerApellido + diaNacimiento;
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
            java.util.logging.Logger.getLogger(Registrar_Cuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrar_Cuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrar_Cuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrar_Cuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrar_Cuenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton almacenBodega;
    private javax.swing.JTextField cedulaTxt;
    private javax.swing.JPasswordField contraseñaTxt;
    private javax.swing.JButton cuentaBtt;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JButton envioPaqueteBtt;
    private javax.swing.JTextField fechaNacimientoTxt;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton historialEnvioBtt;
    private javax.swing.JLabel idGeneradoLb;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JButton mostrarContraBtt;
    private javax.swing.JTextField nombreTxt;
    private javax.swing.JButton panelBtt;
    private javax.swing.JButton rastreoEnvioBtt;
    private javax.swing.JButton registrarBtt;
    private javax.swing.JButton salirBtt;
    private javax.swing.JLabel usuarioGeneradoLb;
    // End of variables declaration//GEN-END:variables
}
