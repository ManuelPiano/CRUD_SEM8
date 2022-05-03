/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.sql.SQLException;
import java.util.Scanner;
public class Create {
    Create() throws SQLException {
        Scanner leer = new Scanner(System.in);
        Estudiante student = new Estudiante();
        System.out.println("<<Crear Registro>>");
        
        System.out.println("Nombre: ");
        student.setNom_estudiante(leer.nextLine());
        System.out.println("Apellido: ");
        student.setApe_estudiante(leer.nextLine());
        System.out.println("Edad: ");
        student.setEdad_estudiante(Integer.parseInt(leer.nextLine()));
        
        String tabla = "tb_estudiante";
        String camposTabla = "nom_estudiante, ape_estudiante,edad_estudiante";
        String valoresCampos = "'" + student.getNom_estudiante() + "','" + student.getApe_estudiante() + "','" + student.getEdad_estudiante() + "'";
        ConexionCRUD utilerias = new ConexionCRUD();
        
        MenuPrincipal.desplegarMenu();
        
    }
}