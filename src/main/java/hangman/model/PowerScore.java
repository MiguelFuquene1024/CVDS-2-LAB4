package hangman.model;
import java.lang.Math;
public class PowerScore implements GameScore{
    /**
     * @pre correctCount: numero entero,incorrectCount:numero entero
     * @pos :Calcula es resultado de los puntos segun los parametros y las reglas del tipo GameScore.
     * @param correctCount:es el numero de respuestas correctas que tuvo el participante
     * @param incorrectCount:es el numero de respuestas incorrectas que tuvo el participante
     * @throws :hangman.exceptions.ExceptionValorInvalido
     * @return retorna el resultado de los puntos obtenidos
     */
    private final int negativos = 8;
    private int puntos;
    public int calculateScore(int correctCount,int incorrectCount){
        if(correctCount< 0 || incorrectCount<0){
            System.out.println("Dato invalido");
            return -1;
        }
        puntos = 0;
        calcularPalabrasCorrectas(correctCount);
        calcularPalabrasIncorrectas(incorrectCount);
        if(puntos > 500){
            puntos = 500;
        }
        return puntos;

    }
    private void calcularPalabrasCorrectas(int correctCount){
        for(int i = 1; i<=correctCount; i++){
            puntos += (int) Math.pow(5,i);
        }
    }
    private void calcularPalabrasIncorrectas(int incorrectCount){
        while(puntos > 0 && incorrectCount > 0){
            puntos -= negativos;
            incorrectCount -= 1;
        }
    }
}
