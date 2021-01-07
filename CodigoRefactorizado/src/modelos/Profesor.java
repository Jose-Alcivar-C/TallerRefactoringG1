package modelos;

import java.util.ArrayList;

public class Profesor 
{
    private int añosdeTrabajo;
    private String facultad;
    private double BonoFijo;
    private String codigo;
    private String nombre;
    private String apellido;
    private int edad;
    private String direccion;
    private String telefono;
    private ArrayList<Paralelo> paralelos;

    public Profesor(int añosdeTrabajo, String codigo, String nombre, String apellido, String facultad, int edad, String direccion, 
            String telefono) 
    {
        this.añosdeTrabajo = añosdeTrabajo;
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.paralelos= new ArrayList<>();
    }
    
    // Getters and Setters----------------------------------------------------
    public void anadirParalelos(Paralelo p)
    {
        paralelos.add(p);
    }

    public int getAñosdeTrabajo() 
    {
        return añosdeTrabajo;
    }

    public void setAñosdeTrabajo(int añosdeTrabajo) 
    {
        this.añosdeTrabajo = añosdeTrabajo;
    }

    public String getFacultad() 
    {
        return facultad;
    }

    public void setFacultad(String facultad) 
    {
        this.facultad = facultad;
    }

    public double getBonoFijo() 
    {
        return BonoFijo;
    }

    public void setBonoFijo(double BonoFijo) 
    {
        this.BonoFijo = BonoFijo;
    }

    public String getCodigo() 
    {
        return codigo;
    }

    public void setCodigo(String codigo) 
    {
        this.codigo = codigo;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public String getApellido() 
    {
        return apellido;
    }

    public void setApellido(String apellido) 
    {
        this.apellido = apellido;
    }

    public int getEdad() 
    {
        return edad;
    }

    public void setEdad(int edad) 
    {
        this.edad = edad;
    }

    public String getDireccion() 
    {
        return direccion;
    }

    public void setDireccion(String direccion) 
    {
        this.direccion = direccion;
    }

    public String getTelefono() 
    {
        return telefono;
    }

    public void setTelefono(String telefono) 
    {
        this.telefono = telefono;
    }

    public ArrayList<Paralelo> getParalelos() 
    {
        return paralelos;
    }

    public void setParalelos(ArrayList<Paralelo> paralelos) 
    {
        this.paralelos = paralelos;
    }
}

