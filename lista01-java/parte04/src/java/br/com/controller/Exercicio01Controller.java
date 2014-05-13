import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Marcelo Suzuki
 */
@ManagedBean(name="exe01D")
@SessionScoped
public class Exercicio01Controller {
   
    private List<Integer> lista = new ArrayList<Integer>();
    private Integer numero;
    private Integer resultado;

    
    public String inserir() {
        lista.add(numero);
        numero = null;
        return "";
    }

    
    public String somar() {
        
        resultado = 0;
        for (int i = 0; i < lista.size(); i++) {
            resultado += lista.get(i);
            System.out.println(resultado);
        }
        return "";
    }
    
    
    //Getters e Setters
    
    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    
    public Integer getResultado() {
        return resultado;
    }
    
}

