/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p1proyectogrupal1_metodologiadesarrollosoftware.Administrador;


import java.util.Random;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import org.bson.Document;

/**
 *
 * @author USER
 */
public class RegistrarPaquete extends MongoConnection{
    public void RegistroEnvio (JTextField NameR, JTextField ID_R, JTextField CellR, JTextField NameD, JTextField ID_D, JTextField CellD, JComboBox PlaceCombo, JTextField Direction, JComboBox DimentionsComboBox, JTextField Weight,JTextField Tarifa, JTextField NameT, JTextField ID_T,JTextField PlacaT){
        String Code=generateCode();
        Connect("PaquetesBodega");
         // Crear documento anidado para el remitente
        Document remitente = new Document("nombre", NameR.getText())
                .append("cedula", ID_R.getText())
                .append("telefono", CellR.getText());

        // Crear documento anidado para el destinatario
        Document destinatario = new Document("nombre", NameD.getText())
                .append("cedula", ID_D.getText())
                .append("telefono", CellD.getText());

        // Crear documento anidado para el paquete
        Document paquete = new Document("ciudadEnvio", PlaceCombo.getSelectedItem().toString())
                .append("direccion", Direction.getText())
                .append("dimensiones", DimentionsComboBox.getSelectedItem().toString())
                .append("peso", Weight.getText())
                .append("Tarifa",Tarifa.getText())
                .append("CodigoRastreo", Code);

        Document repartidor=new Document("nombre",NameT.getText())
                .append("ID",ID_T.getText())
                .append("Placa",PlacaT.getText());
        // Crear documento principal y agregar los documentos anidados
        Document document = new Document("remitente", remitente)
                .append("destinatario", destinatario)
                .append("paquete", paquete)
                .append("repartidor", repartidor);
                //.append("codigo del paquete", code);
        // Insertar documento en la colección
        getCollection().insertOne(document);
    }
    public static String generateCode() {
        Random random = new Random();

        // Arreglo de letras iniciales permitidas
        String[] letrasIniciales = {"SH", "SQ", "SO"};
        String letraInicial = letrasIniciales[random.nextInt(letrasIniciales.length)];

        // Generar 4 números aleatorios
        int numero = random.nextInt(9000) + 1000; // Asegura que el número tenga 4 dígitos

        // Combinar letras y números en el formato deseado
        return letraInicial + numero;
    }
}
