package co.com.bancolombia.certificacion.curiosity.school.builder.builder;

import co.com.bancolombia.certificacion.curiosity.school.builder.model.Alumno;

public class AlumnoBuilder implements Builder <Alumno> {

    private int id;
    private String nombre;
    private String carnet;
    private final boolean ACTIVO = true;
    private String carrera;

    public AlumnoBuilder() {
        id = -1;
        nombre = "";
        carnet = "-1";
        carrera = "";
    }

    public AlumnoBuilder crearAlumno(String nombre){
        this.nombre = nombre;
        return this;
    }

    public AlumnoBuilder conId(int id){
        this.id = id;
        return this;
    }

    public AlumnoBuilder conCarnet(String carnet){
        this.carnet = carnet;
        return  this;
    }

    public AlumnoBuilder enLaCarrera(String carrera){
        this.carrera = carrera;
        return this;
    }

    public static AlumnoBuilder alumnoBuilder (){
        return new AlumnoBuilder();
    }
    @Override
    public Alumno build() {
        return new Alumno(Integer.toString(id),nombre,Double.parseDouble(carnet),ACTIVO,carrera);
    }
}
