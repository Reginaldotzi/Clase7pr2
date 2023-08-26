package pkgAlumnos;

import java.util.ArrayList;

public class Alumno {
    private String carnet;
    public String nombre;

    public String telefono;

    public String dirección;



    private ArrayList <CursoAsignado> cursoAsignados;

    public double getTotalCursos(){
        double t = 0;
        for (CursoAsignado c : cursoAsignados){
            t = t + c.getCostoCurso();
        }
        return t;
    }
    //Constructor
    public Alumno(String carnet, String nombre, String telefono, String dirección) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.telefono = telefono;
        this.dirección = dirección;
        this.cursoAsignados = new ArrayList<>();
    }

    public void  agregarCursoAsignad(CursoAsignado curso){
        cursoAsignados.add(curso);
    }

    @Override
    public String toString(){
        return "Carnet:"+this.carnet+"Nombre:"+this.nombre+"Direccion:"+this.dirección;
    }

    public void mostrarInformacion(){
        System.out.println("nombre:"+nombre);
        System.out.println("Cursos Asignados");
        for (CursoAsignado curso: cursoAsignados){
            System.out.println("Curso:"+curso.getNombreCurso());
            System.out.println("precio:"+curso.getCostoCurso());


        }

    }

    //getters and setters


    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public ArrayList<CursoAsignado> getCursoAsignados() {
        return cursoAsignados;
    }

    public void setCursoAsignados(ArrayList<CursoAsignado> cursoAsignados) {
        this.cursoAsignados = cursoAsignados;
    }

}


