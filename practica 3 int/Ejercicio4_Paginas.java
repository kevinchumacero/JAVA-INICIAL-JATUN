

public class Ejercicio4_Paginas{
   public int calcularPaginas(int paginas){
    int hoja = 2;
    int dividir = paginas / hoja;
    int residuo = paginas % hoja;
    int respuesta = dividir + residuo;
    
    return respuesta;
    }
   
}
