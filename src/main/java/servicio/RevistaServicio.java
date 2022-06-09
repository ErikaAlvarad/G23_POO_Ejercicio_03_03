/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Revista;

/**
 *
 * @author erika
 */
public class RevistaServicio implements IRevistaServicio{

    private static List<Revista> revistaList = new ArrayList<>();
    
    @Override
    public Revista crear(Revista revista) {
        this.revistaList.add(revista);
        return revista;
    }

    @Override
    public List<Revista> listar() {
        return this.revistaList;
    }

   
    @Override
    public Revista buscarPorCodigo(int codigo) {
        var revista = new Revista(codigo,"Hogar",20,12,2018);
        for(Revista rev:this.revistaList){
            if(rev.getCodigo()==codigo){
                revista=rev;
                break;
            }
        }
        return revista;}

    @Override
    public Revista eliminar(int codigo) {
        var revista = this.buscarPorCodigo(codigo);
        this.revistaList.remove(revista);
        return revista;
    }
    
    
}
