

public class Ejercicio5_Cadena{
    public String ordenarLetras (int letraA, int letraB, int letraC){
       int aux1 = letraA; 
       letraA = letraB;
       letraB = aux1;
       
       int aux2 = letraB;
       letraB = letraC;
       letraC = aux2;
       
       int aux3 = letraC;
       letraC = letraA;
       letraA = aux3;
       
       String respuesta = "";
       
       respuesta = letraC+" "+letraB+" "+letraA;
       return respuesta;
    }
}
