/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author erika
 */
public class Articulo {
    private String titulo;
    private String idioma;
    private int codigo;
    private int numPublicaiones;
    private AutorPrincipal autorP;
    private Revista revista;

    public Articulo(int codigo,String titulo, String idioma,  
            int numPublicaiones, AutorPrincipal autorP, Revista revista) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.idioma = idioma;
        
        this.numPublicaiones = numPublicaiones;
        this.autorP = autorP;
        this.revista = revista;
    }

    public Articulo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNumPublicaiones() {
        return numPublicaiones;
    }

    public void setNumPublicaiones(int numPublicaiones) {
        this.numPublicaiones = numPublicaiones;
    }

    public AutorPrincipal getAutorP() {
        return autorP;
    }

    public void setAutorP(AutorPrincipal autorP) {
        this.autorP = autorP;
    }

    public Revista getRevista() {
        return revista;
    }

    public void setRevista(Revista revista) {
        this.revista = revista;
    }

    @Override
    public String toString() {
        return "Articulo{" + "titulo=" + titulo + ", idioma=" + idioma 
                + ", codigo=" + codigo + ", numPublicaiones=" + numPublicaiones 
                + ", autorP=" + autorP + ", revista=" + revista + '}';
    }

    
    
}
