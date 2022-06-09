/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import java.util.List;
import modelo.AutorPrincipal;

/**
 *
 * @author erika
 */
public interface IAutorPrincipalServicio {
    public AutorPrincipal crear(AutorPrincipal autorPrincipal);
    public List<AutorPrincipal> listar();
    public AutorPrincipal buscarPorCodigo(int codigo);
    public AutorPrincipal eliminar(int codigo);
    
}
