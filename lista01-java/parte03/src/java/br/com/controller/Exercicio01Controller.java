import br.com.model.Filme;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Marcelo Suzuki
 */
@ManagedBean(name="exe01C")
public class Exercicio01Controller {
   
    private Filme filme1 = new Filme();
    private Filme filme2 = new Filme();
    private Filme melhorFilme = new Filme();

    
    /**
     * Verifica quais dos dois filmes tem mais estrelas, e seta o objeto
     * melhorFilme com o filme com mais estrelas.
     * 
     * @return Retorna para a mesma página
     */
    public String melhorAction() {
        if (filme1.getEstrela() > filme2.getEstrela()) {
            melhorFilme = filme1;
        }
        else {
            melhorFilme = filme2;
        }
        return "";
    }
    
    
    // Através dos getters obtém os valores dos campos digitados no xhtml e setam no objeto filme1,
    // e através do setters obtém os valores do objeto filme1 e setam nos campos do xhtml.
    
    public int getOscarFilme1() {
        return filme1.getOscar();
    }

    public void setOscarFilme1(int oscar) {
        filme1.setOscar(oscar);
    }

    public int getEstrelaFilme1() {
        return filme1.getEstrela();
    }

    public void setEstrelaFilme1(int estrela) {
        filme1.setEstrela(estrela);
    }

    public String getNomeFilme1() {
        return filme1.getNome();
    }

    public void setNomeFilme1(String nome) {
        filme1.setNome(nome);
    }
    

    
    // Através dos getters obtém os valores dos campos digitados no xhtml e setam no objeto filme2,
    // e através do setters obtém os valores do objeto filme2 e setam nos campos do xhtml.
    
    public int getOscarFilme2() {
        return filme2.getOscar();
    }

    public void setOscarFilme2(int oscar) {
        filme2.setOscar(oscar);
    }

    public int getEstrelaFilme2() {
        return filme2.getEstrela();
    }

    public void setEstrelaFilme2(int estrela) {
        filme2.setEstrela(estrela);
    }

    public String getNomeFilme2() {
        return filme2.getNome();
    }

    public void setNomeFilme2(String nome) {
        filme2.setNome(nome);
    }
    

    
    // Getters e Setters
    public Filme getMelhorFilme() {
        return melhorFilme;
    }

    public void setMelhorFilme(Filme melhorFilme) {
        this.melhorFilme = melhorFilme;
    }
    
}

