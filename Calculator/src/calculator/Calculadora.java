
package calculator;

/**
 *
 * @author José Mario Naranjo Leiva
 */
public class Calculadora {
    
    //Suma de dos números
    public static int sumar(int pNum1, int pNum2)
    {
        return pNum1 + pNum2;
    }
    
    //Resta de dos números
    public int restar(int pNum1, int pNum2)
    {
        return pNum1 - pNum2;
    }
    
    //División de dos números: Devuelve el valor truncado
    public int dividirEntero(int pNum1, int pNum2)
    {
        if (pNum2 == 0)
        {
            throw new IllegalArgumentException("NO se puede dividir por cero");
        }
        return pNum1 / pNum2;
    }
    
    //División de dos números: Devuelve el resultado decimal
    public double dividirReal(int pNum1, int pNum2)
    {
        if (pNum2 == 0)
        {
            throw new IllegalArgumentException("NO se puede dividir por cero");
        }
        return (double) pNum1 / pNum2;
    }
}
