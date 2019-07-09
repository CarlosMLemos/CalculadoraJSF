package br.edu.usj.ads.lpii;


import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


@ManagedBean(name = "BeanCalculadora2", eager = true)
@RequestScoped

public class BeanCalculadora2 implements Serializable {
    private static final long serialVersionUID = 1L;
    public String data = "1";
    private int a;
    private int b; 

    public String getData() {
        return data;       
      
   }
    
     public void setData(String data) {
      this.data = data;
   }

    
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    private int resultado;
      
 
     public String calcular(){
       if(this.getData().equals("1")){
            resultado = a + b;
       }
        if(this.getData().equals("2")){
            resultado = a - b;
       }
    
         if(this.getData().equals("3")){
            resultado = (a * b);
       }
         
            if(this.getData().equals("4")){
            resultado = (a / b);
       }
         
       return "resultado";
     }
     
     
     
}
