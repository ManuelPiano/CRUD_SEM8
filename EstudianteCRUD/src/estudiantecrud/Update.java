
package estudiantecrud;

import java.sql.SQLException;
import java.util.Scanner;

public class Update {
    Update() throws SQLException {
        Scanner leer = new Scanner (System.in);
        Estudiante student = new Estudiante ();
        ConexionCRUD utilerias = new ConexionCRUD ();
        System.out.println("<<ACTUALIZAR REGISTROS>>");
        
        System.out.println("ingresar id del registro a modificar ");
        student.setId_Estudiante(leer.nextInt());
        
        //reingreso de datos para actualizar
        String tablaBuscar = "tb_contacto";
        String campoBuscar = "id_estudiante; carnet_estudiante; nom_estudiante; ape_estudiante; edad_estudiante";
        String condicionBuscar= "id_estudiante = " + student.getId_Estudiante();
        utilerias.desplegarRegistros(tablaBuscar, campoBuscar, condicionBuscar);
        
        System.out.println("id_estudiante ");
        student.setId_Estudiante(leer.next());
        
        System.out.println("carnet estudiante");
        student.setCarnet_estudiante(leer.next());
        
        System.out.println("nom_estudiante");
        student.setNom_estudiante(leer.next());
        
        System.out.println("ape_estudiante");
        student.setApe_estudiante(leer.next());
        
        System.out.println("edad_estudiante");
        student.setEdad_estudiante(leer.next());
        
        String tabla = "tb_contacto";
        String camposValoresNuevos = "di_estidiante = " + student.getApe_estudiante() + "carnet_estudiante = " + student.getNom_estudiante() + "ape_estudiante = " + student.getEdad_estudiante() + " ";
        
        utilerias.actualizarEliminarRegistro(tabla, camposValoresNuevos, condicionBuscar);
        System.out.println("MODIFICADO CORRECTAMENTE");
        
        MenuPrincipal.desplegarMenu();                
        
    }
    
}
