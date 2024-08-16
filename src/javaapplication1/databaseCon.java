package javaapplication1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class databaseCon {
    public static void main(String[] args) {
        try {
            // Établir une connexion
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/idsd2", "root", "");

            // Afficher la connexion
            System.out.println(con);

            if (con != null) {
                System.out.println("Connexion réussie !");
                // Fermer les ressources
                con.close();
            }
        } catch (SQLException e) {
            System.out.println("Il y a un problème dans la connexion : " + e.getMessage());
        }
    }
}
