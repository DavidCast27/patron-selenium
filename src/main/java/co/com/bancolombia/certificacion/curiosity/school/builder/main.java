package co.com.bancolombia.certificacion.curiosity.school.builder;

import co.com.bancolombia.certificacion.curiosity.school.builder.builder.AlumnoBuilder;
import co.com.bancolombia.certificacion.curiosity.school.builder.builder.Builder;
import co.com.bancolombia.certificacion.curiosity.school.builder.model.Alumno;

import static co.com.bancolombia.certificacion.curiosity.school.builder.builder.AlumnoBuilder.alumnoBuilder;

public class main {

    public static void main(String[] args) {

        Alumno alumno = alumnoBuilder().crearAlumno("david").conId(1234).conCarnet("1234").enLaCarrera("ing sistemas").build();
    }
}
