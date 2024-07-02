package leaveapp;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;

public class MongoDBConnection {

    private static MongoClient mongoClient;
    private static MongoDatabase database;

    static {
        // Créez une connexion MongoDB
        mongoClient = MongoClients.create("mongodb://localhost:27017");
        database = mongoClient.getDatabase("mydatabase");
    }

    public static MongoDatabase getDatabase() {
        return database;
    }
}

