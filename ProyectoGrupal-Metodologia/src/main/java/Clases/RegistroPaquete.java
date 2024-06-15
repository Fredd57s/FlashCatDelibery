/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import org.bson.Document;

/**
 *
 * @author USER
 */
public class RegistroPaquete extends MongoConnection{
    public void RegisterPack(JTextField NameR,JTextField DirectionR, JTextField CellR, JTextField ID_R, JTextField NameD,JTextField DirectionD, JTextField CellD, JTextField ID_D, JTextArea DescriptionP, JTextField DimentionsP, JTextField WeightP, JTextField Tarifa, JTextField CodeC){
        String Code=generateCode();
        Connect("InfoRemitentes");
        Document document=new Document()
                .append("Remitente",NameR.getText())
                .append("Direccion",DirectionR.getText())
                .append("Telefono",CellR.getText())
                .append("Cedula", ID_R.getText())
                .append("Codigo del paquete", Code);
        getCollection().insertOne(document);
        //JOptionPane.showMessageDialog(null, "Pedido agregado a la cocina correctamente");
        Connect("InfoDestinatario");
        Document document2=new Document()
                .append("Destinatario",NameD.getText())
                .append("Direccion",DirectionD.getText())
                .append("Telefono",CellD.getText())
                .append("Cedula", ID_D.getText())
                .append("Codigo del paquete", Code);
        getCollection().insertOne(document2);
        Connect("InfoPaquete");
        Document document3=new Document()
                .append("Codigo del paquete", Code)
                .append("Descripcion",DescriptionP.getText())
                .append("Dimensiones",DimentionsP.getText())
                .append("Peso",Double.valueOf(WeightP.getText()))
                .append("Tarifa",Double.valueOf(Tarifa.getText()))
                .append("Estado", "Bodega");
        getCollection().insertOne(document3);
        JOptionPane.showMessageDialog(null, "Paquete registrado");
        CodeC.setText(Code);
        //CuadroCode.setVisible(true);
    }
    public String generateCode() {
        Random random = new Random();   
        // Generar 2 letras mayúsculas aleatorias
        char letra1 = (char) (random.nextInt(26) + 'A');
        char letra2 = (char) (random.nextInt(26) + 'A'); 
        // Generar 5 números aleatorios
        int numero = random.nextInt(90000) + 10000; // Asegura que el número tenga 5 dígitos
        // Combinar letras y números en el formato deseado
        return "" + letra1 + letra2 + numero;
    }
}
