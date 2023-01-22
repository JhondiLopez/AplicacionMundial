package datos;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexion {

    private static  final String URL = "jdbc:mysql://localhost:3306/mundial_parcial";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";

    public  static DataSource getDataSource(){
        BasicDataSource ds = new BasicDataSource();
        ds.setUrl(URL);
        ds.setUsername(USERNAME);
        ds.setPassword(PASSWORD);
        ds.setInitialSize(10);
        ds.setMaxTotal(1);
        return ds;
    }

    public  static Connection getConnection() throws SQLException {
        return  getDataSource().getConnection();
    }

    public static void close(ResultSet rs){
        try {
            rs.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void close(PreparedStatement stmt){
        try {
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void close(Connection conn){
        try {
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
