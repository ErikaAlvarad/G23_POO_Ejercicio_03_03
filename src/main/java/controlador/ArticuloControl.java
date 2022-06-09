/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import modelo.Articulo;
import servicio.ArticuloServicio;
import servicio.AutorPrincipalServicio;
import servicio.RevistaServicio;

/**
 *
 * @author erika
 */
public class ArticuloControl {
    
    private final ArticuloServicio articuloServicio = new ArticuloServicio();
    private final AutorPrincipalServicio autorPrincipalServicio = new AutorPrincipalServicio();
    private final RevistaServicio revistaServicio = new RevistaServicio();
    
    public Articulo crear(String [] args){
        var autorPrincipal = this.autorPrincipalServicio.buscarPorCodigo(Integer.valueOf(args[4]));
        var revista = this.revistaServicio.buscarPorCodigo(Integer.valueOf(args[6]));
        
        var articulo= new Articulo(Integer.valueOf(args[0]),args[1],args[2],
                Integer.valueOf(args[3]),autorPrincipal,revista);
        this.articuloServicio.crear(articulo);
        return articulo;
    }
    
    public List<Articulo> listar(){
        return this.articuloServicio.listar();
    }
    
}
