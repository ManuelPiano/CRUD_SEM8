
package EstudianteCrud;

import java.sql.SQLException;
import java.util.Scanner;
public class Create {
    Create() throws SQLException {
        Scanner leer = new Scanner(System.in);
        Estudiante student = new Estudiante();
        System.out.println("<<Crear Registro>>");
        
        System.out.println("Nombre: ");
        student.setNomEstudiante(leer.nextLine());
        System.out.println("Apellido: ");
        student.setApeEstudiante(leer.nextLine());
        System.out.println("Edad: ");
        student.setEdadEstudiante(leer.nextLine());
        
        String tabla = "tb_estudiante";
        String camposTabla = "nom_estudiante, ape_estudiante,edad_estudiante";
        String valoresCampos = "'" + student.getNomEstudiante() + "','" + student.getApeEstudiante() + "','" + student.getEdadEstudiante() + "'";
        ConexionCrud utilerias = new ConexionCrud();
        
        MenuPrincipal.desplegarMenu();
        
    }
}
