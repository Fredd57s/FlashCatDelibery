/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p1proyectogrupal1_metodologiadesarrollosoftware.Administrador;

import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author USER
 */
public class CalculatePrice {
    public void valor(JComboBox DimentionsComboBox, JTextField Weight, JComboBox PlaceCombo, JTextField Tarifa){
        String Item=DimentionsComboBox.getSelectedItem().toString();
        String Place=PlaceCombo.getSelectedItem().toString();
        Double peso;
        if(Weight.getText().isEmpty()){
            peso=0.0;
        }else{
            peso=Double.valueOf(Weight.getText());
        }
        Double price;
        Double placeprice;
        Double pesoprice;
        
        if(Item.equals("30x30x30")){
            price=5.0;
        }else
            if(Item.equals("50x50x50")){
                price=10.0;
            }else
                if(Item.equals("70x70x70")){
                    price=20.0;
                }else
                    if(Item.equals("90x90x90")){
                        price=30.0;
                    }else{
                        price=50.0;
                    }
                    
        if(peso>0 && peso<=10){
            pesoprice=5.0;
        }else
            if(peso>10 && peso<=20){
                pesoprice=10.0;
            }else
                if(peso>20 && peso<=40){
                    pesoprice=30.0;
                }else{
                    pesoprice=50.0;
                }
            
        
  
        if (Place.equals("Quito")) {
            placeprice = 20.0;
        } else if (Place.equals("Guayaquil")) {
            placeprice = 30.0;
        } else if (Place.equals("Cuenca")) {
            placeprice = 25.0;
        } else if (Place.equals("Ibarra")) {
            placeprice = 15.0;
        } else if (Place.equals("Manta")) {
            placeprice = 35.0;
        } else if (Place.equals("Loja")) {
            placeprice = 22.0;
        } else if (Place.equals("Ambato")) {
            placeprice = 18.0;
        } else if (Place.equals("Riobamba")) {
            placeprice = 28.0;
        } else if (Place.equals("Santo Domingo")) {
            placeprice = 32.0;
        } else if (Place.equals("Quevedo")) {
            placeprice = 40.0;
        } else {
            // Si no coincide con ninguna ciudad dada, asignar un precio por defecto
            placeprice = 50.0;
        }
        String tarifa=String.valueOf(pesoprice+price+placeprice);
        Tarifa.setText(tarifa);
    }
}
