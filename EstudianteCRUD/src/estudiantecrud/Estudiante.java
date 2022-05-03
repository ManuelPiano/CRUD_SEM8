
package estudiantecrud;


public class Estudiante {
    private int id_Estudiante;
    private char carnet_estudiante;
    private String nom_estudiante;
    private String ape_estudiante;
    private int edad_estudiante;
    

    public int getId_Estudiante() {
        return id_Estudiante;
    }

    public void setId_Estudiante(int id_Estudiante) {
        this.id_Estudiante = id_Estudiante;
    }

    public char getCarnet_estudiante() {
        return carnet_estudiante;
    }

    public void setCarnet_estudiante(char carnet_estudiante) {
        this.carnet_estudiante = carnet_estudiante;
    }

    public String getNom_estudiante() {
        return nom_estudiante;
    }

    public void setNom_estudiante(String nom_estudiante) {
        this.nom_estudiante = nom_estudiante;
    }

    public String getApe_estudiante() {
        return ape_estudiante;
    }

    public void setApe_estudiante(String ape_estudiante) {
        this.ape_estudiante = ape_estudiante;
    }

    public int getEdad_estudiante() {
        return edad_estudiante;
    }

    public void setEdad_estudiante(int edad_estudiante) {
        this.edad_estudiante = edad_estudiante;
    }
    
}
