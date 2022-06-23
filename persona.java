package app.Tarea;

public class persona
{
    private String nombres;
    private String apellidos;
    private int dni;
    private int edad;

    persona(String nombres,String apellidos,int dni, int edad)
    {
        this.nombres=nombres;
        this.apellidos=apellidos;
        this.dni=dni;
        this.edad=edad;
    }

    public String mostrarNombres()
    {
        return nombres;
    }
    public String mostrarApellidos()
    {
        return apellidos;
    }
    public int mostrarDni()
    {
        return dni;
    }
    public int getEdad()
    {
        return edad;
    }
}