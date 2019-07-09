package br.edu.usj.ads.lpii;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class BeanCalculadora {

    private int a;
    private int b;    
    private int a2;
    private int b2;
    private int a3;
    private int b3;
    private int a4;
    private int b4;
    
    private int resultado;

    public int getA2() {
        return a2;
    }

    public void setA2(int a2) {
        this.a2 = a2;
    }

    public int getB2() {
        return b2;
    }

    public void setB2(int b2) {
        this.b2 = b2;
    }

    public int getA3() {
        return a3;
    }

    public void setA3(int a3) {
        this.a3 = a3;
    }

    public int getB3() {
        return b3;
    }

    public void setB3(int b3) {
        this.b3 = b3;
    }

    public int getA4() {
        return a4;
    }

    public void setA4(int a4) {
        this.a4 = a4;
    }

    public int getB4() {
        return b4;
    }

    public void setB4(int b4) {
        this.b4 = b4;
    }
    
    public void setA (int a) { this.a = a; }
    public void setB (int b) { this.b = b; }
    public void setResultado (int resultado) { this.resultado = resultado; }
    
    public int getA() { return a; }
    public int getB() { return b; }
    public int getResultado() { return resultado; }
    
    public String somar() {
        resultado = a + b;
        return "resultado";
    }        
     public String subtrair() {
        resultado = a2 + b2;
        return "resultado";
    }    
      public String multiplicar() {
        resultado = (a3 * b3);
        return "resultado";
    }    
       public String dividir() {
        resultado = (a4 / b4);
        return "resultado";
    }    
}
