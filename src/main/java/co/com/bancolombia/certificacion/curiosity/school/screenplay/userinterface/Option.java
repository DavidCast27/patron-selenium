package co.com.bancolombia.certificacion.curiosity.school.screenplay.userinterface;

public enum Option {

    GOOGLE_TRANSLATE_IN_ENGLISH("https://translate.google.com/?hl=en");

    private final String url;

    Option(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }
}
