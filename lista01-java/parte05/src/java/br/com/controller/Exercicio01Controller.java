import br.com.model.Aluno;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Marcelo Suzuki
 */
@ManagedBean(name="exe01E")
@SessionScoped
public class Exercicio01Controller {
   
    private List<Aluno> alunoList = new ArrayList<Aluno>();
    private String nome;
    private Float nota1;
    private Float nota2;
    private Float nota3;
    private Float nota4;

    /**
     * Adiciona um aluno na lista de alunos (alunoList)
     * 
     * @return Página a ser carregada
     */
    public String adiciona() {
        
        //Cria o objeto aluno
        Aluno aluno = new Aluno();
        
        //Seta os valores do objeto aluno
        aluno.setNome(this.nome);
        aluno.setNota1(this.nota1);
        aluno.setNota2(this.nota2);
        aluno.setNota3(this.nota3);
        aluno.setNota4(this.nota4);
        
        //Adiciona o objeto aluno na lista
        alunoList.add(aluno);

        return "";
    }
    
    
    /**
     * Calcula a média de todos os alunos da lista
     * 
     * @return O resultado do cálculo da média
     */
    public Float mediaDaTurma() {
        Float media = 0.0f;
        
        for (Aluno a : alunoList) {
            media += a.calculaMedia();
        }
        
        return (media / alunoList.size());
    }
    
    
    //Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getNota1() {
        return nota1;
    }

    public void setNota1(Float nota1) {
        this.nota1 = nota1;
    }

    public Float getNota2() {
        return nota2;
    }

    public void setNota2(Float nota2) {
        this.nota2 = nota2;
    }

    public Float getNota3() {
        return nota3;
    }

    public void setNota3(Float nota3) {
        this.nota3 = nota3;
    }

    public Float getNota4() {
        return nota4;
    }

    public void setNota4(Float nota4) {
        this.nota4 = nota4;
    }
    
    public List<Aluno> getAlunoList() {
        return alunoList;
    }

}

