/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */
package Entidades;

/**
 *
 * @author German
 */
public class Libro {
    
    private int isbn;
    private String titulo;
    private String autor;
    private int numPaginas;
    private boolean alta;
    private int ejemplares;

    public Libro(int _isbn, String titulo, String autor, int numPaginas, boolean alta, int ejemplares) {
        isbn = _isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.alta = true;
    }
    
    public Libro(){
        
    
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
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

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    
    
    
    
    
    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", numPaginas=" + numPaginas + '}';
    }
    
    
    
}
