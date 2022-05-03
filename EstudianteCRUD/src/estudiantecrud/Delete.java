
package estudiantecrud;

import java.sql.SQLException;
import java.util.Scanner;

public class Delete {
     Delete() throws SQLException{
        Scanner leer  = new Scanner(System.in);
        ConexionCRUD utilerias = new ConexionCRUD();
        System.out.println("<< ELIMINAR REGISTRO >>");
        
        System.out.println("Ingresar el id del registro: ");
        String id_estudianteEliminar = leer.next();
        
        //Reingreso de datos para actualizar 
        String tabla = "tb_estudiante";
        String campos = "*";
        String condicion = "id_estudiantte " + id_estudianteEliminar;
        utilerias.desplegarRegistros(tabla, campos, condicion);
        
        System.out.println("Presionar << Y >> para confirmar: ");
        String confirmarBorrar = leer.next();
        
        if("Y".equals(confirmarBorrar)){
            /*
            Se le deja vacio para el metodo actualizarEliminarRegistro
            envie solamente los parametros de tabla y condicion y poder eliminar
            */
            String valoresCamposNuevos = "";
            
            utilerias.actualizarEliminarRegistro(tabla, valoresCamposNuevos, condicion);
            System.out.println("Registro borrado satisfactoriamente!");
        }
        MenuPrincipal.desplegarMenu();
    }
}
