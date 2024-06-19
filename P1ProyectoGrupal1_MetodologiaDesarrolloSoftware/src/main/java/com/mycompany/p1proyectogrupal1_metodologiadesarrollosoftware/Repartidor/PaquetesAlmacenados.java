
package com.mycompany.p1proyectogrupal1_metodologiadesarrollosoftware.Repartidor;

import com.mongodb.MongoClientSettings;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.result.UpdateResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;

/**
 *
 * @author jenni
 */
public class PaquetesAlmacenados extends javax.swing.JFrame {

    private MongoClient mongoClient;
    private MongoDatabase database;
    private MongoCollection<Document> collection;
    
    public PaquetesAlmacenados() {
        initComponents();
        conectarMongoDB();
         cargarDatos();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        paquetesTransporteTb = new javax.swing.JTable();
        fondo = new javax.swing.JLabel();
        cuentaBtt = new javax.swing.JButton();
        salirBtt = new javax.swing.JButton();
        despacharEnvioBtt = new javax.swing.JButton();
        editarEnvioBtt = new javax.swing.JButton();
        buscarRastreoBtt = new javax.swing.JButton();
        buscarNombreBtt = new javax.swing.JButton();
        panelBtt = new javax.swing.JButton();
        mostrarTablaBtt = new javax.swing.JButton();
        devolverPaqueteBtt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        paquetesTransporteTb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Remitente", "Destinatario", "Paquete"
            }
        ));
        jScrollPane1.setViewportView(paquetesTransporteTb);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 630, 490));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/11.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 800));

        cuentaBtt.setText("cuenta");
        getContentPane().add(cuentaBtt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, 120, 30));

        salirBtt.setText("salir");
        salirBtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirBttActionPerformed(evt);
            }
        });
        getContentPane().add(salirBtt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 720, -1, -1));

        despacharEnvioBtt.setText("despachar envio");
        despacharEnvioBtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                despacharEnvioBttActionPerformed(evt);
            }
        });
        getContentPane().add(despacharEnvioBtt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 190, 210, 50));

        editarEnvioBtt.setText("editar envio");
        editarEnvioBtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarEnvioBttActionPerformed(evt);
            }
        });
        getContentPane().add(editarEnvioBtt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 330, 210, 50));

        buscarRastreoBtt.setText("buscar por rastreo");
        buscarRastreoBtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarRastreoBttActionPerformed(evt);
            }
        });
        getContentPane().add(buscarRastreoBtt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 400, 210, 50));

        buscarNombreBtt.setText("buscar por nombre ");
        buscarNombreBtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarNombreBttActionPerformed(evt);
            }
        });
        getContentPane().add(buscarNombreBtt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 480, 210, 60));

        panelBtt.setText("PANEL");
        panelBtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelBttActionPerformed(evt);
            }
        });
        getContentPane().add(panelBtt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 220, 50));

        mostrarTablaBtt.setText("mostrar");
        mostrarTablaBtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarTablaBttActionPerformed(evt);
            }
        });
        getContentPane().add(mostrarTablaBtt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 560, 210, 50));

        devolverPaqueteBtt.setText("devolver paquete");
        devolverPaqueteBtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                devolverPaqueteBttActionPerformed(evt);
            }
        });
        getContentPane().add(devolverPaqueteBtt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 270, 210, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private MongoClient conectarMongoDB() {
        return MongoClients.create(
            MongoClientSettings.builder()
                .applyToClusterSettings(builder -> 
                    builder.hosts(Arrays.asList(new ServerAddress("localhost", 27017))))
                .build());
    }
     
   private void cargarDatos() {
        MongoClient mongoClient = conectarMongoDB();
        MongoDatabase database = mongoClient.getDatabase("Paqueteria");
        MongoCollection<Document> collection = database.getCollection("EnvioPaquete");

        DefaultTableModel model = (DefaultTableModel) paquetesTransporteTb.getModel();
        model.setRowCount(0); // Limpiar filas existentes

        List<Document> documentos = (List<Document>) collection.find().into(new ArrayList<>());

        for (Document doc : documentos) {
            Document remitente = (Document) doc.get("remitente");
            Document destinatario = (Document) doc.get("destinatario");
            Document paquete = (Document) doc.get("paquete");

            String remitenteInfo = remitente.getString("nombre") + ", " + remitente.getString("cedula") + ", " + remitente.getString("telefono");
            String destinatarioInfo = destinatario.getString("nombre") + ", " + destinatario.getString("cedula") + ", " + destinatario.getString("telefono");
            String paqueteInfo = paquete.getString("ciudadEnvio") + ", " + paquete.getString("direccion") + ", " +
                    paquete.getString("dimensiones") + ", " + paquete.getString("peso")+", " + paquete.getString("codigoRastreo");

            model.addRow(new Object[]{remitenteInfo, destinatarioInfo, paqueteInfo});
        } 

        
    }

    
    private void salirBttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirBttActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirBttActionPerformed

    private void despacharEnvioBttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_despacharEnvioBttActionPerformed
   int selectedRow = paquetesTransporteTb.getSelectedRow();
    if (selectedRow == -1) {
        javax.swing.JOptionPane.showMessageDialog(this, "Seleccione un envío para despachar.");
        return;
    }

    DefaultTableModel model = (DefaultTableModel) paquetesTransporteTb.getModel();
    String remitenteInfo = (String) model.getValueAt(selectedRow, 0);
    String destinatarioInfo = (String) model.getValueAt(selectedRow, 1);
    String paqueteInfo = (String) model.getValueAt(selectedRow, 2);
    String codigoRastreo = paqueteInfo.split(", ")[4]; // Asumiendo que codigoRastreo está en la quinta posición

    try (MongoClient mongoClient = conectarMongoDB()) {
        MongoDatabase database = mongoClient.getDatabase("Paqueteria");
        MongoCollection<Document> collection = database.getCollection("EnvioPaquete");
        MongoCollection<Document> despachadosCollection = database.getCollection("EnviosDespachados");

        Document query = new Document("remitente.cedula", remitenteInfo.split(", ")[1])
            .append("destinatario.cedula", destinatarioInfo.split(", ")[1])
            .append("paquete.codigoRastreo", codigoRastreo);

        Document paqueteDoc = collection.findOneAndDelete(query);

        if (paqueteDoc != null) {
            despachadosCollection.insertOne(paqueteDoc);
            javax.swing.JOptionPane.showMessageDialog(this, "Envío despachado exitosamente.");
            model.removeRow(selectedRow);
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "No se pudo despachar el envío.");
        }
    }
    }//GEN-LAST:event_despacharEnvioBttActionPerformed
    
 
    private void editarEnvioBttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarEnvioBttActionPerformed
       int selectedRow = paquetesTransporteTb.getSelectedRow();
    if (selectedRow == -1) {
        javax.swing.JOptionPane.showMessageDialog(this, "Seleccione un envío para editar.");
        return;
    }

    DefaultTableModel model = (DefaultTableModel) paquetesTransporteTb.getModel();
    String remitenteInfo = (String) model.getValueAt(selectedRow, 0);
    String destinatarioInfo = (String) model.getValueAt(selectedRow, 1);
    String paqueteInfo = (String) model.getValueAt(selectedRow, 2);

    String[] remitenteData = remitenteInfo.split(", ");
    String[] destinatarioData = destinatarioInfo.split(", ");
    String[] paqueteData = paqueteInfo.split(", ");

    JTextField remitenteNombreField = new JTextField(remitenteData[0]);
    JTextField remitenteCedulaField = new JTextField(remitenteData[1]);
    JTextField remitenteTelefonoField = new JTextField(remitenteData[2]);
    JTextField destinatarioNombreField = new JTextField(destinatarioData[0]);
    JTextField destinatarioCedulaField = new JTextField(destinatarioData[1]);
    JTextField destinatarioTelefonoField = new JTextField(destinatarioData[2]);
    JTextField direccionField = new JTextField(paqueteData[1]);
    JTextField codigoRastreoField = new JTextField(paqueteData[4]);

    // Inicialización de combos dentro del método editar
    String[] ciudades = {"Quito", "Guayaquil", "Cuenca", "Ibarra", "Manta", "Loja", "Ambato", "Riobamba", "Santo Domingo", "Quevedo"};
    JComboBox<String> ciudadEnvioCombo = new JComboBox<>(ciudades);

    String[] dimensiones = {"30x30x30", "40x40x40", "50x50x50", "60x60x60"};
    JComboBox<String> dimensionesCombo = new JComboBox<>(dimensiones);

    String[] pesos = {"1kg", "2kg", "3kg", "4kg", "5kg"};
    JComboBox<String> pesoCombo = new JComboBox<>(pesos);

    // Paneles para los campos
    JPanel panel = new JPanel(new java.awt.GridLayout(12, 2));
    panel.add(new JLabel("Nombre Remitente:"));
    panel.add(remitenteNombreField);
    panel.add(new JLabel("Cédula Remitente:"));
    panel.add(remitenteCedulaField);
    panel.add(new JLabel("Teléfono Remitente:"));
    panel.add(remitenteTelefonoField);
    panel.add(new JLabel("Nombre Destinatario:"));
    panel.add(destinatarioNombreField);
    panel.add(new JLabel("Cédula Destinatario:"));
    panel.add(destinatarioCedulaField);
    panel.add(new JLabel("Teléfono Destinatario:"));
    panel.add(destinatarioTelefonoField);
    panel.add(new JLabel("Ciudad Envío:"));
    panel.add(ciudadEnvioCombo);
    panel.add(new JLabel("Dirección:"));
    panel.add(direccionField);
    panel.add(new JLabel("Dimensiones:"));
    panel.add(dimensionesCombo);
    panel.add(new JLabel("Peso:"));
    panel.add(pesoCombo);
    panel.add(new JLabel("Código de Rastreo:"));
    panel.add(codigoRastreoField);

    int result = JOptionPane.showConfirmDialog(null, panel, "Editar Envío", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
    if (result == JOptionPane.OK_OPTION) {
        String nuevoRemitenteNombre = remitenteNombreField.getText();
        String nuevoRemitenteCedula = remitenteCedulaField.getText();
        String nuevoRemitenteTelefono = remitenteTelefonoField.getText();
        String nuevoDestinatarioNombre = destinatarioNombreField.getText();
        String nuevoDestinatarioCedula = destinatarioCedulaField.getText();
        String nuevoDestinatarioTelefono = destinatarioTelefonoField.getText();
        String nuevaCiudadEnvio = (String) ciudadEnvioCombo.getSelectedItem();
        String nuevaDireccion = direccionField.getText();
        String nuevasDimensiones = (String) dimensionesCombo.getSelectedItem();
        String nuevoPeso = (String) pesoCombo.getSelectedItem();
        String nuevoCodigoRastreo = codigoRastreoField.getText();

        // Validar datos
        if (!validarNombre(nuevoRemitenteNombre) || !validarNombre(nuevoDestinatarioNombre)) {
            JOptionPane.showMessageDialog(panel, "Ingrese un nombre válido para remitente y destinatario (4 nombres separados por espacios).", "Error", JOptionPane.ERROR_MESSAGE);
            editarEnvioBttActionPerformed(evt); // Llama recursivamente para volver a mostrar la ventana
            return;
        }
        if (!validarCedula(nuevoRemitenteCedula) || !validarCedula(nuevoDestinatarioCedula)) {
            JOptionPane.showMessageDialog(panel, "Ingrese una cédula válida (10 dígitos).", "Error", JOptionPane.ERROR_MESSAGE);
            editarEnvioBttActionPerformed(evt); // Llama recursivamente para volver a mostrar la ventana
            return;
        }
        if (!validarTelefono(nuevoRemitenteTelefono) || !validarTelefono(nuevoDestinatarioTelefono)) {
            JOptionPane.showMessageDialog(panel, "Ingrese un teléfono válido (comience con 09 y tenga 10 dígitos en total).", "Error", JOptionPane.ERROR_MESSAGE);
            editarEnvioBttActionPerformed(evt); // Llama recursivamente para volver a mostrar la ventana
            return;
        }

        // Actualizar documento en la base de datos
        Document nuevoRemitente = new Document("nombre", nuevoRemitenteNombre)
                .append("cedula", nuevoRemitenteCedula)
                .append("telefono", nuevoRemitenteTelefono);
        Document nuevoDestinatario = new Document("nombre", nuevoDestinatarioNombre)
                .append("cedula", nuevoDestinatarioCedula)
                .append("telefono", nuevoDestinatarioTelefono);
        Document nuevoPaquete = new Document("ciudadEnvio", nuevaCiudadEnvio)
                .append("direccion", nuevaDireccion)
                .append("dimensiones", nuevasDimensiones)
                .append("peso", nuevoPeso)
                .append("codigoRastreo", nuevoCodigoRastreo);

        Document query = new Document("remitente.cedula", remitenteData[1])
                .append("destinatario.cedula", destinatarioData[1])
                .append("paquete.codigoRastreo", paqueteData[4]);

        Document update = new Document("$set", new Document("remitente", nuevoRemitente)
                .append("destinatario", nuevoDestinatario)
                .append("paquete", nuevoPaquete));

        try (MongoClient mongoClient = conectarMongoDB()) {
            MongoDatabase database = mongoClient.getDatabase("Paqueteria");
            MongoCollection<Document> collection = database.getCollection("EnvioPaquete");

            UpdateResult resultUpdate = collection.updateOne(query, update);

            if (resultUpdate.getMatchedCount() > 0) {
                model.setValueAt(nuevoRemitenteNombre + ", " + nuevoRemitenteCedula + ", " + nuevoRemitenteTelefono, selectedRow, 0);
                model.setValueAt(nuevoDestinatarioNombre + ", " + nuevoDestinatarioCedula + ", " + nuevoDestinatarioTelefono, selectedRow, 1);
                model.setValueAt(nuevaCiudadEnvio + ", " + nuevaDireccion + ", " + nuevasDimensiones + ", " + nuevoPeso + ", " + nuevoCodigoRastreo, selectedRow, 2);
                javax.swing.JOptionPane.showMessageDialog(this, "Envío editado exitosamente.");
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "No se pudo editar el envío en la base de datos.");
            }
        }
    }
    }//GEN-LAST:event_editarEnvioBttActionPerformed
    
        // Métodos de validación
    private boolean validarNombre(String nombre) {
        String[] nombres = nombre.split(" ");
        return nombres.length == 4;
    }

    private boolean validarCedula(String cedula) {
    // Validación básica de formato numérico y longitud
    if (!cedula.matches("\\d{10}")) {
        return false;
    }

    // Validación específica de cédula ecuatoriana según algoritmo
    int suma = 0;
    int[] coeficientes = {2, 1, 2, 1, 2, 1, 2, 1, 2};
    int verificador = Integer.parseInt(cedula.substring(9, 10));

    for (int i = 0; i < 9; i++) {
        int valor = Integer.parseInt(cedula.substring(i, i + 1)) * coeficientes[i];
        suma += (valor >= 10) ? valor - 9 : valor;
    }

    int resultado = 10 - (suma % 10);

    if ((resultado == 10 && verificador == 0) || (resultado == verificador)) {
        return true;
    } else {
        return false;
    }
}

    private boolean validarTelefono(String telefono) {
        return telefono.matches("^09\\d{8}$");
    }

    private void buscarRastreoBttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarRastreoBttActionPerformed
       // Pedir al usuario que ingrese el código de rastreo
    String codigoRastreo = JOptionPane.showInputDialog(this, "Ingrese el código de rastreo:");

    if (codigoRastreo != null && !codigoRastreo.trim().isEmpty()) {
        try (MongoClient mongoClient = conectarMongoDB()) {
            MongoDatabase database = mongoClient.getDatabase("Paqueteria");
            MongoCollection<Document> collection = database.getCollection("EnvioPaquete");

            // Buscar el documento por código de rastreo
            Document query = new Document("paquete.codigoRastreo", codigoRastreo);
            Document resultado = collection.find(query).first();

            if (resultado != null) {
                Document remitente = (Document) resultado.get("remitente");
                Document destinatario = (Document) resultado.get("destinatario");
                Document paquete = (Document) resultado.get("paquete");

                String remitenteInfo = remitente.getString("nombre") + ", " + remitente.getString("cedula") + ", " + remitente.getString("telefono");
                String destinatarioInfo = destinatario.getString("nombre") + ", " + destinatario.getString("cedula") + ", " + destinatario.getString("telefono");
                String paqueteInfo = paquete.getString("ciudadEnvio") + ", " + paquete.getString("direccion") + ", " +
                        paquete.getString("dimensiones") + ", " + paquete.getString("peso") + ", " + paquete.getString("codigoRastreo");

                DefaultTableModel model = (DefaultTableModel) paquetesTransporteTb.getModel();
                model.setRowCount(0); // Limpiar filas existentes
                model.addRow(new Object[]{remitenteInfo, destinatarioInfo, paqueteInfo});
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró ningún envío con el código de rastreo proporcionado.");
            }
        }
    } else {
        JOptionPane.showMessageDialog(this, "El código de rastreo no puede estar vacío.");
    }
    }//GEN-LAST:event_buscarRastreoBttActionPerformed

    private void buscarNombreBttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarNombreBttActionPerformed
       String nombre = JOptionPane.showInputDialog(this, "Ingrese el código de rastreo:");

    if (nombre != null && !nombre.trim().isEmpty()) {
        try (MongoClient mongoClient = conectarMongoDB()) {
            MongoDatabase database = mongoClient.getDatabase("Paqueteria");
            MongoCollection<Document> collection = database.getCollection("EnvioPaquete");

            // Buscar el documento por código de rastreo
            Document query = new Document("destinatario.nombre", nombre);
            Document resultado = collection.find(query).first();

            if (resultado != null) {
                Document remitente = (Document) resultado.get("remitente");
                Document destinatario = (Document) resultado.get("destinatario");
                Document paquete = (Document) resultado.get("paquete");

                String remitenteInfo = remitente.getString("nombre") + ", " + remitente.getString("cedula") + ", " + remitente.getString("telefono");
                String destinatarioInfo = destinatario.getString("nombre") + ", " + destinatario.getString("cedula") + ", " + destinatario.getString("telefono");
                String paqueteInfo = paquete.getString("ciudadEnvio") + ", " + paquete.getString("direccion") + ", " +
                        paquete.getString("dimensiones") + ", " + paquete.getString("peso") + ", " + paquete.getString("codigoRastreo");

                DefaultTableModel model = (DefaultTableModel) paquetesTransporteTb.getModel();
                model.setRowCount(0); // Limpiar filas existentes
                model.addRow(new Object[]{remitenteInfo, destinatarioInfo, paqueteInfo});
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró ningún envío con el código de rastreo proporcionado.");
            }
        }
    } else {
        JOptionPane.showMessageDialog(this, "El código de rastreo no puede estar vacío.");
    }
    }//GEN-LAST:event_buscarNombreBttActionPerformed

    private void mostrarTablaBttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarTablaBttActionPerformed
        cargarDatos();
    }//GEN-LAST:event_mostrarTablaBttActionPerformed

    private void devolverPaqueteBttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_devolverPaqueteBttActionPerformed
         String nombreDestinatario = JOptionPane.showInputDialog(this, "Ingrese el nombre del destinatario:");

    if (nombreDestinatario != null && !nombreDestinatario.trim().isEmpty()) {
        try (MongoClient mongoClient = conectarMongoDB()) {
            MongoDatabase database = mongoClient.getDatabase("Paqueteria");
            MongoCollection<Document> despachadosCollection = database.getCollection("EnviosDespachados");
            MongoCollection<Document> collection = database.getCollection("EnvioPaquete");

            Document query = new Document("destinatario.nombre", nombreDestinatario);
            Document paqueteDoc = despachadosCollection.find(query).first();

            if (paqueteDoc != null) {
                // Mostrar detalles en una ventana emergente antes de devolver
                String remitenteInfo = paqueteDoc.get("remitente").toString();
                String destinatarioInfo = paqueteDoc.get("destinatario").toString();
                String paqueteInfo = paqueteDoc.get("paquete").toString();

                int confirmacion = JOptionPane.showConfirmDialog(this, 
                        "¿Desea devolver el siguiente paquete?\n\n" +
                        "Remitente:\n" + remitenteInfo + "\n\n" +
                        "Destinatario:\n" + destinatarioInfo + "\n\n" +
                        "Paquete:\n" + paqueteInfo,
                        "Confirmación de devolución", JOptionPane.YES_NO_OPTION);

                if (confirmacion == JOptionPane.YES_OPTION) {
                    despachadosCollection.deleteOne(query);
                    collection.insertOne(paqueteDoc);
                    JOptionPane.showMessageDialog(this, "Paquete devuelto exitosamente.");
                    cargarDatos(); // Actualizar tabla de paquetes mostrados
                }
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró ningún envío con el nombre de destinatario proporcionado en la colección de Envíos Despachados.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al devolver el paquete: " + e.getMessage());
        }
    } else {
        JOptionPane.showMessageDialog(this, "Por favor ingrese un nombre de destinatario válido.");
    }
    }//GEN-LAST:event_devolverPaqueteBttActionPerformed

    private void panelBttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelBttActionPerformed
        Panel_Repartidor R1 = new Panel_Repartidor ();
        R1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_panelBttActionPerformed

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
            java.util.logging.Logger.getLogger(PaquetesAlmacenados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaquetesAlmacenados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaquetesAlmacenados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaquetesAlmacenados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaquetesAlmacenados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarNombreBtt;
    private javax.swing.JButton buscarRastreoBtt;
    private javax.swing.JButton cuentaBtt;
    private javax.swing.JButton despacharEnvioBtt;
    private javax.swing.JButton devolverPaqueteBtt;
    private javax.swing.JButton editarEnvioBtt;
    private javax.swing.JLabel fondo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mostrarTablaBtt;
    private javax.swing.JButton panelBtt;
    private javax.swing.JTable paquetesTransporteTb;
    private javax.swing.JButton salirBtt;
    // End of variables declaration//GEN-END:variables
}
