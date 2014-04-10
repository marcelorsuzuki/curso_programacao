import br.com.model.Aluno;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Marcelo Suzuki
 */
@ManagedBean(name="exe01C")
public class Exercicio01Controller {
   
    private Aluno aluno = new Aluno();
    private Float media;

    /**
     * Ação do botão calcular
     * 
     * @return Retorno para a mesma página
     */
    public String calculaAction(){  
        media = aluno.calculaMedia();
        return"";
    }

    
    
    // Através dos getters obtém os valores dos campos digitados no xhtml e setam no objeto,
    // e através do setters obtém os valores do objeto e setam nos campos do xhtml.
    public Float getNota1() {
        return aluno.getNota1();
    }

    public void setNota1(Float nota1) {
        aluno.setNota1(nota1);
    }

    public Float getNota2() {
        return aluno.getNota2();
    }

    public void setNota2(Float nota2) {
        aluno.setNota2(nota2);
    }

    public Float getNota3() {
        return aluno.getNota3();
    }

    public void setNota3(Float nota3) {
        aluno.setNota3(nota3);
    }

    public Float getNota4() {
        return aluno.getNota4();
    }

    public void setNota4(Float nota4) {
        aluno.setNota4(nota4);
    }

    public Float getMedia() {
        return media;
    }

    public String getNomeAluno() {
        return aluno.getNome();
    }

    public void setNomeAluno(String nomeAluno) {
        aluno.setNome(nomeAluno);
    }
}

