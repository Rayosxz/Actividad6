package Ejercicio2_11;

public class ArticuloCientifico {

    private String titulo;
    private String autor;
    private String[] palabrasClaves;
    private String publicacion;
    private int ano;
    private String resumen;

    // Primer constructor: título y autor
    public ArticuloCientifico(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    // Segundo constructor: llama al primero
    public ArticuloCientifico(
            String titulo,
            String autor,
            String[] palabrasClaves,
            String publicacion,
            int ano) {

        this(titulo, autor);

        this.palabrasClaves = palabrasClaves;
        this.publicacion = publicacion;
        this.ano = ano;
    }

    // Tercer constructor: llama al segundo
    public ArticuloCientifico(
            String titulo,
            String autor,
            String[] palabrasClaves,
            String publicacion,
            int ano,
            String resumen) {

        this(titulo, autor, palabrasClaves, publicacion, ano);

        this.resumen = resumen;
    }

    public void imprimir() {

        System.out.println("Título del artículo = " + titulo);
        System.out.println("Autor del artículo = " + autor);
        System.out.println("Palabras clave =");

        for (int i = 0; i < palabrasClaves.length; i++) {
            System.out.println(palabrasClaves[i]);
        }

        System.out.println("Publicación = " + publicacion);
        System.out.println("Año = " + ano);
        System.out.println("Resumen = " + resumen);
    }

    public static void main(String[] args) {

        String[] palabras = {
                "Física",
                "Espacio",
                "Tiempo"
        };

        ArticuloCientifico articulo = new ArticuloCientifico(
                "La teoría especial de la relatividad",
                "Albert Einstein",
                palabras,
                "Anales de Física",
                1913,
                "Las leyes de la física son las mismas en todos los sistemas de referencia inerciales."
        );

        articulo.imprimir();
    }
}
