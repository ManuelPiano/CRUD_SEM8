
package estudiantecrud;

import java.sql.SQLException;
import java.util.Scanner;

public class Delete {
     Delete() throws SQLException{
        Scanner leer  = new Scanner(System.in);
        ConexionCRUD utilerias = new ConexionCRUD();
        System.out.println("___ ELIMINAR REGISTRO___");
        
        System.out.println("Ingresar el id del registro que desea ELIMINAR: ");
        String id_estudianteEliminar = leer.next();
        
        //Reingreso de datos para actualizar 
        String tabla = "tb_estudiante";
        String campos = "";
        String condicion = "id_estudiante=" + id_estudianteEliminar;
        utilerias.actualizarEliminarRegistro(tabla, campos, condicion);
        
        System.out.println("Presionar << Y >> para confirmar: ");
        String confirmarBorrar = leer.next();
        
        if("Y".equals(confirmarBorrar)){
             System.out.println("Registro borrado satisfactoriamente!");
            String valoresCamposNuevos = "";

            utilerias.actualizarEliminarRegistro(tabla, valoresCamposNuevos, condicion);
        }
        MenuPrincipal.desplegarmenu();
    }
}
