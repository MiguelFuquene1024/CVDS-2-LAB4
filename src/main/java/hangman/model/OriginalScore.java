package hangman.model;

public class OriginalScore implements GameScore {
	/**
	 * @pre correctCount: numero entero,incorrectCount:numero entero
	 * @pos :Calcula es resultado de los puntos segun los parametros y las reglas del tipo GameScore.
	 * @param: correctCount:es el numero de respuestas correctas que tuvo el participante
	 * @param: incorrectCount:es el numero de respuestas incorrectas que tuvo el participante
	 * @throws :hangman.exceptions.ExceptionValorInvalido
	 * @return retorna el resultado de los puntos obtenidos
	 */
	private final int negativos = 10;
	private int puntos;

	public int calculateScore(int correctCount,int incorrectCount){
		if(correctCount< 0 || incorrectCount<0){
			System.out.println("Dato invalido");
			return -1;
		}
		puntos = 100;
		 return calculoPalabrasIncorrectas(incorrectCount);

	}
	private int calculoPalabrasIncorrectas(int incorrectCount){
		while(puntos >0 && incorrectCount>0){
			puntos -= negativos;
			incorrectCount--;
		}
		return puntos;
	}
}