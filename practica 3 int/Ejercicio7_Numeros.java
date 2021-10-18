
public class Ejercicio7_Numeros{
    public int verificarPrimerDigito(int numero){
        while (numero >= 10){
            numero = numero / 10;
        }
        int respuesta = 0;
        respuesta = numero;
        return respuesta;
    }
}