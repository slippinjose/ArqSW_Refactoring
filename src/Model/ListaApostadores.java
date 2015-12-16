package Model;

import java.util.HashMap;
import java.util.Map;

/**
 *  Class whose purpose is to store betters.
 * @author José Cortez
 */
public class ListaApostadores {
    
    private HashMap<String,Apostador> listaApostadores;
    
    
    /**
     * Empty constructor.
     */
    public ListaApostadores () {
        this.listaApostadores = new HashMap<String,Apostador>();
    }
    
    /**Getters*/
    public Map getListaApostadores () { return listaApostadores;}
     
    
    /**
     * Adds a punter to its punter list.
     * @param email E-mail of the punter.
     * @param a Instance of the punter (Apostador) object to be added.
     */
    public void addApostador (String email, Apostador a){
        this.listaApostadores.put(email,a);
    }
    
    public boolean removeApostador (String email, Apostador a){
        return this.listaApostadores.remove(email, a);
    }
}
