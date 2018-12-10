package co.com.bancolombia.certificacion.curiosity.school.builder.model;

public class Alumno {

    private String id;
    private String nombre;
    private double carnet;
    private boolean activo;
    private String carrera;

    public Alumno(String id, String nombre, double carnet, boolean activo, String carrera) {
        this.id = id;
        this.nombre = nombre;
        this.carnet = carnet;
        this.activo = activo;
        this.carrera = carrera;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCarnet() {
        return carnet;
    }

    public void setCarnet(double carnet) {
        this.carnet = carnet;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}
