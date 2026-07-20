package Ejercicio4_7;

public class Perro extends Canido {

    @Override
    public String getSonido() {
        return "Ladrido";
    }

    @Override
    public String getAlimentos() {
        return "Carnívoro";
    }

    @Override
    public String getHabitat() {
        return "Doméstico";
    }

    @Override
    public String getNombreCientifico() {
        return "Canis lupus familiaris";
    }
}
