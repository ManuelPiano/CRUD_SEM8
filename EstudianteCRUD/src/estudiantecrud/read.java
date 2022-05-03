
package estudiantecrud;

import java.sql.SQLException;
public class read {
    public read() throws SQLException {
        System.out.println("<<Consulta de registros>>");
        mostrarResultados();
    }

    private void mostrarResultados() throws SQLException {
        try {
            ConexionCRUD utilerias = new ConexionCRUD();
            String tabla = "tb_estudiante";
            String camposTabla = "*";
            String condicionBusqueda="";
            utilerias.desplegarRegistros(tabla, camposTabla, condicionBusqueda);
        } catch (SQLException ex) {
            System.out.println("Ha ocurrido el siguiente error: " + ex.getMessage());
        }finally {
            MenuPrincipal.desplegarmenu();
        }
    }
    
}
