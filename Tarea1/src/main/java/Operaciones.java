
public class Operaciones {
    private double cantidad, resultado;
    private int lista1, lista2;

    //Cree los getter and setter
    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public int getLista1() {
        return lista1;
    }

    public void setLista1(int lista1) {
        this.lista1 = lista1;
    }

    public int getLista2() {
        return lista2;
    }

    public void setLista2(int lista2) {
        this.lista2 = lista2;
    }
    
    //Cree el contructor

    public Operaciones() {
        
    }
    
    //Operaciones
  public double convertir(){
      //moneda a convertir
      if (lista1==0 && lista2==1){//dolar
          resultado = cantidad*0.11;
      }else if(lista1==0 && lista2==0){//euro
          resultado = cantidad*0.13;
      }else if (lista1==0 && lista2==2){//yuan
          resultado=cantidad*0.85;
      }
      return resultado;
  }
  
    
    
    
}
