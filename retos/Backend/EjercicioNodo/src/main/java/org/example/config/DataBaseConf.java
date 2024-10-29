package org.example.config;
import io.github.cdimascio.dotenv.Dotenv;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DataBaseConf {


    public static final Dotenv dotenv = Dotenv.configure().load();

    public static Connection getConnection() {
        Connection connection = null;

        try {

            connection = DriverManager.getConnection(
                    dotenv.get("DB_URL"),
                    dotenv.get("DB_USER"),
                    dotenv.get("DB_PASSWORD")

            );

            if (connection != null && connection.isValid(2)){
                System.out.println(" connecttion a database establecida " );

            }else {
                System.out.println(" error en conexion a la databae " );
            }
        } catch (SQLException e) {

            if (e.getSQLState().equals("08001")){
                System.out.println("data base no existe " + dotenv.get("DB_URL"));
            }
            else {
                System.out.println("Error " + e.getMessage());

            }

        }

    return connection;
    }
}
