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
    
    
    public Articulo crear(String [] args){
        
        
        var articulo= new Articulo(Integer.valueOf(args[0]),args[1],args[2],
                Integer.valueOf(args[3]));
        this.articuloServicio.crear(articulo);
        return articulo;
    }
    
    public List<Articulo> listar(){
        return this.articuloServicio.listar();
    }
    
}
