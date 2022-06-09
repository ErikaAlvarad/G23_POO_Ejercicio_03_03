/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import java.util.List;
import modelo.Revista;

/**
 *
 * @author erika
 */
public interface IRevistaServicio {
    public Revista crear(Revista revista);
    public List<Revista> listar();
    public Revista buscarPorCodigo(int codigo);
    public Revista eliminar(int codigo);
    
}
