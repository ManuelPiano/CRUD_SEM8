
package estudiantecrud;

import java.sql.SQLException;
import java.util.Scanner;

public class Update {
    Update() throws SQLException {
        Scanner leer = new Scanner (System.in);
        Estudiante student = new Estudiante ();
        ConexionCRUD utilerias = new ConexionCRUD ();
        System.out.println("___ACTUALIZAR REGISTROS___");
        
        System.out.println("ingresar id del registro a modificar ");
        student.setId_Estudiante(Integer.parseInt(leer.nextLine()));
        
        //reingreso de datos para actualizar
        String tablaBuscar = "tb_estudiante";
        String campoBuscar = "id_estudiante; carnet_estudiante; nom_estudiante; ape_estudiante; edad_estudiante";
        String condicionBuscar= "id_estudiante = " + student.getId_Estudiante();
        utilerias.desplegarRegistros(tablaBuscar, campoBuscar, condicionBuscar);
        
        System.out.println("carnet estudiante");
        student.setCarnet_estudiante(leer.next());
        
        System.out.println("nom_estudiante");
        student.setNom_estudiante(leer.nextLine());
        
        System.out.println("ape_estudiante");
        student.setApe_estudiante(leer.nextLine());
        
        System.out.println("edad_estudiante");
        student.setEdad_estudiante(Integer.parseInt(leer.next()));
        
        String tabla = "tb_estudiante";
        String camposValoresNuevos = "id_estudiante = '" + student.getId_Estudiante()+ "',carnet_estudiante = '" + student.getCarnet_estudiante()+ "',ape_estudiante = '" + student.getApe_estudiante() +"',nom_estudiante = '" + student.getNom_estudiante()+"'";
        
        utilerias.actualizarEliminarRegistro(tabla, camposValoresNuevos, condicionBuscar);
        System.out.println("MODIFICADO CORRECTAMENTE");
        
        MenuPrincipal.desplegarmenu();                
        
    }
    
}
