package co.com.bancolombia.certificacion.curiosity.school.examen.userinterfaces;

public enum Option {

    TODOMVC_APP("http://todomvc.com/examples/dojo/");

    private final String url;

    Option(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }
}
