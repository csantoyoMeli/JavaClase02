package ejercicio3;

public class Libro {

    private String titulo;
    private String autor;
    private String editorial;
    private int isbn;

    public Libro() {}

    public Libro(String titulo, String autor, String editorial, int isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void prestamo() {}
    public void devolucion() {}

    public String toString() {
        return "Título: " + this.titulo
                + "Autor: " + this.autor
                + "ISBN: " + this.isbn
                + "Editorial: " + this.editorial;
    }

    //@Override
    public String tostring() {
        return "Título: " + this.titulo
                + "Autor: " + this.autor
                + "ISBN: " + this.isbn
                + "Editorial: " + this.editorial;
    }

}
