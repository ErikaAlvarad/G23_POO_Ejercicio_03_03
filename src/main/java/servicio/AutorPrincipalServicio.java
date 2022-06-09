/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.AutorPrincipal;

/**
 *
 * @author erika
 */
public class AutorPrincipalServicio implements IAutorPrincipalServicio{

    private static List<AutorPrincipal> autorPrincipalList = new ArrayList<>();
    
    @Override
    public AutorPrincipal crear(AutorPrincipal autorPrincipal) {
        this.autorPrincipalList.add(autorPrincipal);
        return autorPrincipal;
    }

    @Override
    public List<AutorPrincipal> listar() {
        return this.autorPrincipalList;
    }

   
    @Override
    public AutorPrincipal buscarPorCodigo(int codigo) {
        var autorPrincipal = new AutorPrincipal(codigo,"Juan","Ecuador",1987,1200);
        for(AutorPrincipal aup:this.autorPrincipalList){
            if(aup.getCodigo()==codigo){
                autorPrincipal=aup;
                break;
            }
        }
        return autorPrincipal;}

    @Override
    public AutorPrincipal eliminar(int codigo) {
        var autorPrincipal = this.buscarPorCodigo(codigo);
        this.autorPrincipalList.remove(autorPrincipal);
        return autorPrincipal;
    }
    
    
}
