import java.io.*;
import java.util.ArrayList;

public class Vehiculo implements Serializable{
    public static ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
    public static int idActual = 1;
    private int id;
    private int modelo;
    private static ArrayList<Sensor> sensores = new ArrayList<Sensor>();
    private String marca;
    private double valorComercial;
    private String color;
    File fichero= new File("Documentacion.txt");

    public Vehiculo(){
        id = idActual;
        idActual += 1;
        Vehiculo.vehiculos.add(this);
    }

    public Vehiculo(int mo, String ma, double va){   
        this(mo, ma, va,"verde");
    }

    public Vehiculo(int mo, String ma, double va, String co){
        this.modelo = mo;
        this.marca = ma;
        this.valorComercial = va;
        this.color = co;
        id = idActual;
        idActual += 1;
        Vehiculo.vehiculos.add(this);
    }

    public String getSensores(ArrayList<Sensor> arr){
        String n = "" ; 

        for(int i=0; i<arr.size(); i++){
            n+=sensores.get(i);
        }
        return n;
    }

    public void setSensores(ArrayList<Sensor> arr){
        for(int i=0; i<arr.size(); i++){
            sensores.set(i, arr.get(i));
        }
    }

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getModelo(){
        return this.modelo;
    }

    public String getMarca(){
        return this.marca;
    }

    public double getValorComercial(){
        return this.valorComercial;
    }

    public String getColor(){
        return this.color;
    }

    public void setModelo(int mo){
        this.modelo = mo;
    }

    public void setMarca(String ma){
        this.marca = ma;
    }

    public void setValorComercial(double va){
        this.valorComercial = va;
    }

    public void setColor(String co){
        this.color = co;
    }

    public String toString(){
        return "\nID: "+ this.id + "\nModelo: " + this.modelo + "\nMarca: " + this.marca + "\nValor Comercial: " + this.valorComercial + "\nColor: " + this.color + "\n";
    }

    public String toStringFull(){
        String concatenado = "";
        String toStringVehiculo = "\nID: "+ this.id + "\nModelo: " + this.modelo + "\nMarca: " + this.marca + "\nValor Comercial: " + this.valorComercial + "\nColor: " + this.color + "\n";

        for(int i=0; i<sensores.size(); i++){
            concatenado += sensores.get(i).toString();
        }

        return toStringVehiculo + concatenado;
    }

    public int cantidadSensores(){
        return sensores.size();
    }

    public void anadirSensor(Sensor s){
        sensores.add(s);
    }

    public static String toStringVehiculos(){
        String concatenado = "";

        for(int i=0; i<vehiculos.size(); i++){
            concatenado += vehiculos.get(i).toString();
        }

        return concatenado;
    }

    public static int cantidadVehiculos(){
        return vehiculos.size();
    }

    public static String toStringVehiculosVerdes(){
        String concatenado = "";

        for(int i=0; i<vehiculos.size(); i++){
            if(vehiculos.get(i).getColor().equalsIgnoreCase("verde")){
                concatenado += vehiculos.get(i).toString();
            }
        }
        return concatenado;
    } 
    
    public static String obtenerVehiculoPorId(int id){
        int cont=0;
        String conn="";
        for(int i=0; i<vehiculos.size(); i++){
            if(vehiculos.get(i).getId()==id){
                conn+=vehiculos.get(i).toStringFull(); 
                cont+=cont+1;

            }   
        }
        return conn;

    }

    public static int senal(int id){
        int senal=0;

        for(int i=0; i<vehiculos.size(); i++){
            if(vehiculos.get(i).getId()==id){
                senal+=senal+1;
            }   
        }
        return senal;
    }

    public static String caso7(int id){

        return vehiculos.get(id-1).toStringSensores(id);

    }

    public String toStringSensores(int id) {
        String con = "";
        con += sensores.get(id-1).toString2();
        return con;
    }
    
    public static String caso8(int num){
        
        return vehiculos.get(num).toStringSensoresT();
      
    }

    public String toStringSensoresT() {
        String con = "";

        for(int a=0; a<sensores.size(); a++){
            con += sensores.get(a).toString3();
        }

        return con;
    }
    
    public static String temp(){
        String con = "";

        for(int a=0; a<sensores.size(); a++){
            con += sensores.get(a).toString3();
        }

        return con;
    }
    
    //arreglar esto
    // esto seria para el caso 9 pero tampoco me ha dado.

    public static void caso9(){
        int mayor, n=0;
        mayor = vehiculos.get(0).cantidadSensores();
        
        int i=0;
        while(i<vehiculos.size()){
            if(vehiculos.get(i).cantidadSensores() > mayor){
                mayor = vehiculos.get(i).cantidadSensores();
                n++;
            }
            i++;
        }
        System.out.println(vehiculos.get(n).toString());
    }
    // esto seria para el caso 9 pero tampoco me ha dado.
    /*public String cantidadS(){
    String variable="", d="";

    for(int i=0; i<sensores.size(); i++){

    if(variable>= sensores.get(i).size()){
    d=variable;    
    }
    else if(variable<d){
    d=variable;

    }

    }
    String pollo="pollo";
    return pollo;

    }*/

    public static Vehiculo obtenerVehiculoPorId2(int id){
        int coordenada=0;

        for(int i=0; i<vehiculos.size()-1; i++){
            if(vehiculos.get(i).getId()==id){
                coordenada+=vehiculos.get(i).getId();

            }   
        }
        return vehiculos.get(coordenada);
    }

    public static void mostrararchivos(int inicio, int fi)
    {
        try
        {
            FileReader fr=new FileReader("Documentacion.txt");
            BufferedReader br=new BufferedReader(fr);
            String cadena, cadena1="", cadena2="", cadena3="", cadena4="", cadena5="";
            int indice1=0, indice2=0, indice3=0, indice4=0, indice5=0, indice6=0, indice7=0;
            String texto1="", texto2="", texto3="", texto4="";

            while((cadena=br.readLine())!=null) //cuando el la siguiente linea leida no halla nada significa que termino de leer los datos del archivo
            {
                cadena1+=cadena;
            }

            cadena2+=cadena1.substring(inicio,fi);

            indice1+=cadena2.indexOf("<",1);

            indice2+=indice1+5;

            indice3+=cadena2.indexOf("<",indice2);

            texto1+=cadena2.substring(2,indice1);

            int Test = Integer.parseInt(texto1);

            texto2+=cadena2.substring(indice2,indice3);

            indice4+=indice3+5;
            
            indice5+=cadena2.indexOf("<",indice4);
            
            texto3+=cadena2.substring(indice4,indice5);
            
            double Test1 = Double.parseDouble(texto3);
            
            indice6+=indice5+5;
            
            indice7+=cadena2.indexOf("<",indice6);
            
            texto4+=cadena2.substring(indice6,indice7);

            Vehiculo vehiculo= new Vehiculo(Test,texto2,Test1,texto4);

        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
 
    public static String caso666(){
        Sensor.ordenarSensor(sensores);
        
        return Vehiculo.temp();
    }
    
    }
