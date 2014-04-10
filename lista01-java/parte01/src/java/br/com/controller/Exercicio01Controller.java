package br.com.controller;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author Marcelo Suzuki
 */
@ManagedBean(name="exe01C")
public class Exercicio01Controller {
    
    private float valor1;
    private float valor2;
    private float result;
    
    /**
     * Ação do botão Somar
     * 
     * @return Retorna para a mesma página.
     */
    public String somaAction() {
        result = valor1 + valor2;
        return "";
    }

    public String subtraiAction() {
        result = valor1 - valor2;
        return "";
    }
    
    public String multiplicaAction() {
        result = valor1 * valor2;
        return "";
    }
    
    public String divideAction() {
        result = valor1 / valor2;
        return "";
    }

    
    //Getters e Setters
    
    public float getValor1() {
        return valor1;
    }

    public void setValor1(float valor1) {
        this.valor1 = valor1;
    }

    public float getValor2() {
        return valor2;
    }

    public void setValor2(float valor2) {
        this.valor2 = valor2;
    }

    public float getResult() {
        return result;
    }

    public void setResult(float result) {
        this.result = result;
    }
    
    
    
}
