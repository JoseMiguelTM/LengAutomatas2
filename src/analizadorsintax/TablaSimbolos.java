/*
TABLA DE SÍMBOLOS
 */
package analizadorsintax;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author LissetRoman
 */
public class TablaSimbolos {
    ArrayList<Simbolo> ts = new ArrayList<>();
    
    public TablaSimbolos (){
        
    }
    
    public void agregar(Simbolo sim){
        //antes de agregar verificar que la variable no existe
        if(existeVariable(sim.getNombre_var())){
            System.out.println("ERROR!!! La variable ya existe!!!");
        }
        else{
            //si no existe entonces se agrega
            ts.add(sim);
        }
    }
    
    public void recorrido(){
        Iterator<Simbolo> it = ts.iterator();
        // mientras al iterador queda proximo juego
        while(it.hasNext()){
            Simbolo sim=it.next();
        }
    }
    
    public boolean existeVariable(String var){
        boolean existe=true;
        Iterator<Simbolo> it = ts.iterator();
        // mientras al iterador queda proximo juego
        while(it.hasNext()){
            Simbolo sim=it.next();
            if(sim.getNombre_var().equals(var)){
                System.out.println("ERROR!!! LA VARIABLE: "+var+" YA EXISTE!!!");
            }
            else{
                existe=false;
            }
        }
        return existe;
    }
    
    public void imprimir(){
        Iterator<Simbolo> it = ts.iterator();
        // mientras al iterador queda proximo juego
        System.out.println("Lista de Símbolos");
        while(it.hasNext()){
            Simbolo sim=it.next();
            System.out.println(sim.toString());
        }
    }
    
    public String buscarTipo(String variable){
        String tipoDato="";
        Iterator<Simbolo> it = ts.iterator();
        // mientras al iterador queda proximo juego
        
        while(it.hasNext()){
            Simbolo sim=it.next();
            if(sim.getNombre_var().equals(variable)){
                tipoDato=sim.getTipo_dato();
            }
        }
        return tipoDato;
    }
    
    public String buscarValor(String variable){
        String valor="";
        Iterator<Simbolo> it = ts.iterator();
        // mientras al iterador queda proximo juego
        
        while(it.hasNext()){
            Simbolo sim=it.next();
            if(sim.getNombre_var().equals(variable)){
                valor=sim.getValor();
            }
        }
        return valor;
    }
  
    
    
    
}
