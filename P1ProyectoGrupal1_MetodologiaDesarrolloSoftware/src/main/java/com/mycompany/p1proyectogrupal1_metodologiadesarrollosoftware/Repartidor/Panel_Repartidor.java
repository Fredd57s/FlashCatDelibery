
package com.mycompany.p1proyectogrupal1_metodologiadesarrollosoftware.Repartidor;


import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.awt.Desktop;
import java.net.URI;
import javax.swing.JOptionPane;
import org.bson.Document;


/**
 *
 * @author jenni
 */
public class Panel_Repartidor extends javax.swing.JFrame {

    /**
     * Creates new form Panel_Repartidor
     */
    public Panel_Repartidor() {
        initComponents();
        mostrarIdyPlacaTransporte();
        actualizarCantidadPaquetes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cantidadPaquetesLb = new javax.swing.JLabel();
        placaTransporteLb = new javax.swing.JLabel();
        ideTransporteLb = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();
        paginaWebBtt = new javax.swing.JButton();
        paquetesChoferBtt = new javax.swing.JButton();
        cuentaBtt = new javax.swing.JButton();
        salirBtt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cantidadPaquetesLb.setText("jLabel1");
        getContentPane().add(cantidadPaquetesLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 540, 130, 40));

        placaTransporteLb.setText("jLabel1");
        getContentPane().add(placaTransporteLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 630, 210, 50));

        ideTransporteLb.setText("jLabel1");
        getContentPane().add(ideTransporteLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 460, 210, 50));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/5.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 800));

        paginaWebBtt.setText("web");
        paginaWebBtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paginaWebBttActionPerformed(evt);
            }
        });
        getContentPane().add(paginaWebBtt, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 170, 40));

        paquetesChoferBtt.setText("paquetes almacenados");
        paquetesChoferBtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paquetesChoferBttActionPerformed(evt);
            }
        });
        getContentPane().add(paquetesChoferBtt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 180, 50));

        cuentaBtt.setText("cuenta");
        getContentPane().add(cuentaBtt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 120, 30));

        salirBtt.setText("salir");
        salirBtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirBttActionPerformed(evt);
            }
        });
        getContentPane().add(salirBtt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 720, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void paginaWebBttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paginaWebBttActionPerformed
        try {
        // Especificar la URL que deseas abrir
        URI url = new URI("file:///C:/Users/jenni/OneDrive/Desktop/myGeolocationApp/Paqueteriaweb.html");

        // Comprobar si Desktop es soportado por el sistema
        if (Desktop.isDesktopSupported()) {
            Desktop desktop = Desktop.getDesktop();
            desktop.browse(url);
        } else {
            System.out.println("Desktop no es soportado por el sistema");
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    }//GEN-LAST:event_paginaWebBttActionPerformed
    
    private void mostrarIdyPlacaTransporte() {
        // Desactivar los logs excesivos de MongoDB
        

        // Conectar a MongoDB
        try (MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017")) {
            // Seleccionar la base de datos
            MongoDatabase database = mongoClient.getDatabase("Paqueteria");

            // Seleccionar la colección
            MongoCollection<Document> collection = database.getCollection("usuarios");

            // Obtener el primer documento de la colección
            Document document = collection.find().first();

            if (document != null) {
                // Extraer el idTransporte
                String idTransporte = document.getString("id");
                String placaTransporte = document.getString("placaTransporte");
                // Mostrar el idTransporte en el JLabel
                ideTransporteLb.setText(idTransporte);
                placaTransporteLb.setText(placaTransporte);
            } else {
                ideTransporteLb.setText("No se encontraron datos.");
                placaTransporteLb.setText("No se encontraron datos.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            ideTransporteLb.setText("Error al conectar a la base de datos.");
        }
    }
    
    private void actualizarCantidadPaquetes() {
    String connectionString = "mongodb://localhost:27017";
    try (MongoClient mongoClient = MongoClients.create(connectionString)) {
            MongoDatabase database = mongoClient.getDatabase("Paqueteria");
        MongoCollection<Document> collection = database.getCollection("EnvioPaquete");

        long count = collection.countDocuments();
        cantidadPaquetesLb.setText("Cantidad de paquetes: " + count);
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al contar los paquetes.");
    }
}
    private void salirBttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirBttActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirBttActionPerformed

    private void paquetesChoferBttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paquetesChoferBttActionPerformed
        PaquetesAlmacenados P1 = new PaquetesAlmacenados();
        P1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_paquetesChoferBttActionPerformed

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
            java.util.logging.Logger.getLogger(Panel_Repartidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Panel_Repartidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Panel_Repartidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Panel_Repartidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Panel_Repartidor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cantidadPaquetesLb;
    private javax.swing.JButton cuentaBtt;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel ideTransporteLb;
    private javax.swing.JButton paginaWebBtt;
    private javax.swing.JButton paquetesChoferBtt;
    private javax.swing.JLabel placaTransporteLb;
    private javax.swing.JButton salirBtt;
    // End of variables declaration//GEN-END:variables
}