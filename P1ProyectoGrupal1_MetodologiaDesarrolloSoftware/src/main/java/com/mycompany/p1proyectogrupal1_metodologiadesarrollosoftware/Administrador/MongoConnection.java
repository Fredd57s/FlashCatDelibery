package com.mycompany.p1proyectogrupal1_metodologiadesarrollosoftware.Administrador;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class MongoConnection {
    private MongoClient mongoClient;
    private MongoDatabase database;
    private MongoCollection<Document> collection;

    public MongoCollection<Document> getCollection() {
        return collection;
    }
    
public void Connect(String collectName) {
            mongoClient = MongoClients.create("mongodb://localhost:27017");
            database = mongoClient.getDatabase("Paqueteria");
            //database = mongoClient.getDatabase("FlashCatDelibery");
            collection=database.getCollection(collectName);
    }
    }



