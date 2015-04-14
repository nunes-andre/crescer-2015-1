import java.util.HashMap;

/**
 * Abstração para um exército de Elfos.
 * 
 * @author CWI Software
 */
public class ExercitoDeElfos
{
    private HashMap<String, Elfo> exercito = new HashMap<>();
    
    public HashMap<String, Elfo> getExercito() {
        return this.exercito;
    }
    
    public void alistar(Elfo elfo) {
        
        boolean podeAlistar = elfo instanceof ElfoVerde || elfo instanceof ElfoNoturno;
        
        if (podeAlistar) {
            exercito.put(elfo.getNome(), elfo);
        }   
    }
    
    public Elfo buscar(String nome) {
        return exercito.get(nome);
    }
}
