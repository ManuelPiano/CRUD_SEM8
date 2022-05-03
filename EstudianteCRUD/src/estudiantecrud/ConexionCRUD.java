
package estudiantecrud;

import java.sql.*;

public class ConexionCRUD {
    private final String servidor = "jdbc:mysql://127.0.0.1:3306/bd_estudiantecrud";
    private final String usuario = "root";
    private final String clave = "";
    private final String driverConector = "com.mysql.jdbc.Driver";
    private static Connection conexion;
    
    public ConexionCRUD(){
    try{
    Class.forName(driverConector);
    conexion = DriverManager.getConnection(servidor, usuario, clave);
    }catch (ClassNotFoundException  | SQLException e){
        System.out.println("Conexion fallida! Error! : " + e.getMessage());
    }
    }
    public Connection getConnection(){
    return conexion;
    }
    
    public void guardarRegistros(String tabla, String camposTabla, String valoresCampos){
    ConexionCRUD conectar = new ConexionCRUD();
    Connection cone = conectar.getConnection();
    try{
    String sqlQueryStmt = "INSERT INTO " + tabla + " (" + camposTabla + ") VALUES (" + valoresCampos + ")";
    Statement stmt;
    stmt = cone.createStatement();
    
    }
    }
}
