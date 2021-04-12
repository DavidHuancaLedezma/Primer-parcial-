
/**
 * Write a description of class calculadora here.
 * 
 * @author ABDUZCAN 
 * @version 2003
 */
public class calculadora
{   private String color;
    private String tamaño;
    private String marca;
    private String version; 
    
    public calculadora(){
    this.color = "negro";
    this.tamaño = "mediano";
    this.marca = "casio";
    this.version = "fx570";
    }
    
    //toda calculadora sabe sumar,retar, multiplicar,dividir
    
    
    public int calcularSuma(int num1, int num2){
    int resultado;
    resultado = num1 + num2;
    return resultado;
    }
    
    public int calcularResta(int num1, int num2){
    int resultado;
    resultado = num1 - num2;
    return resultado;
    }
    
    public int calcularMultiplicacion(int num1, int num2){
    int resultado;
    resultado = num1 * num2;
    return resultado;
    }
    
    public int calcularDivicion(int num1, int num2){
    int resultado;
    resultado = num1 / num2;
    return resultado;
    }
    
    // metodos get y set
    
    public String getColor(){
    return color;
    }
    public void setColor(String color){
    this.color = color;
    }
    public String getTamaño(){
    return tamaño;
    }
    public void setTamaño(String tamaño){
    this.tamaño = tamaño;
    }
    public String getMarca(){
    return marca;
    }
    public void setMarca(String marca){
    this.marca = marca;
    }
    public String getVersion(){
    return version;
    }
    public void setVersion(String version){
    this.version = version;
    }
}

