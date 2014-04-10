package br.com.model;

/**
 *
 * @author Marcelo Suzuki
 */
public class Filme {
    
    private String nome;
    private int oscar;
    private int estrela;

    /**
     * Verifica se o filme tem algum Oscar, e mostra uma mensagem.
     * 
     * @return Mensagem se já ganhou ou não algum Oscar.
     */
    public String oscarMensagem() {
        
        if (oscar == 0) {
            return "Este filme nunca ganhou nenhum Oscar";
        }
        else {
            return "Este filme já ganhou algum Oscar";
        }
    }
    
    
    //Getters e Setters
    
    public int getOscar() {
        return oscar;
    }

    public void setOscar(int oscar) {
        this.oscar = oscar;
    }

    public int getEstrela() {
        return estrela;
    }

    public void setEstrela(int estrela) {
        this.estrela = estrela;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
     
    
     
}
