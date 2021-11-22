import java.util.ArrayList;

public class Sensor{
    public static int posAnadir=0;
     private String tipo;
    private double valor;
    
    public Sensor(){
    }
    
    public Sensor(String t, double v){
        this.tipo = t;
        this.valor = v;
        
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    public double getValor(){
        return this.valor;
    }
    
    public void setTipo(String t){
        this.tipo = t;
    }
    
    public void setValor(double v){
        this.valor = v;
    }
    
    
    public String toString(){
    return "\nTipo: " + this.tipo + "\nValor: " + this.valor + "\n";
    }
    
    public String toString2(){
        return "\nTipo: "  + this.tipo + "\nValor: " + this.valor;
    }
    
    public String toString3(){
        String sensoresT="";
        if(this.tipo.equals("Temperatura") || this.tipo.equals("temperatura")){
        
            sensoresT+= "\nTipo: "  + this.tipo + "\nValor: " + this.valor;
        }
        return sensoresT;
    }
    
    public static String ordenarSensor(ArrayList<Sensor> arr){
        
        for(int j=0; j<arr.size()-1; j++){
            for (int i = 0; i < arr.size()-1; i++) {
                if (arr.get(i).getValor() > arr.get(i+1).getValor()) {
                    // Intercambiamos los valores 
                    Sensor aux = arr.get(i);
                    arr.set(i , arr.get(i+1));
                    arr.set(i+1, aux);
                    
                }
            }
        }
        
        String con = "";

        for(int a=0; a<arr.size(); a++){
            con += arr.get(a).toString3();
        }

        return con;
    }
}


