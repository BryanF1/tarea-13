package app.Tarea;

public class estudiante extends persona 
{
    private int codigo;
    private String facultad;
    private String universidad;

    estudiante(String nombres,String apellidos,int dni, int edad, int codigo,String facultad,String universidad)
    {
        super(nombres, apellidos, dni, edad);

        this.codigo=codigo;
        this.facultad=facultad;
        this.universidad=universidad;
    }
    
    public void mostrarDatos()
    {
        System.out.println("Nombres: "+mostrarNombres()+ 
        "\nApellido: "+mostrarApellidos()+ 
        "\nDni: "+mostrarDni()+ 
         "\nEdad del Alumno: "+getEdad()+
         "\nCodigo de Alumno: " +codigo+
        "\nCarrera en la que se encuentra: "+facultad+
        "\nUniversidad : "+universidad);
    }
}