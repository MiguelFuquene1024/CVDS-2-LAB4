package hangman.model;

class OriginalScore implements GameScore {
	/**
	 * @pre correctCount: numero entero,incorrectCount:numero entero
	 * @pos :Calcula es resultado de los puntos segun los parametros y las reglas del tipo GameScore.
	 * @param correctCount:es el numero de respuestas correctas que tuvo el participante
	 * @param incorrectCount:es el numero de respuestas incorrectas que tuvo el participante
	 * @throws :hangman.exceptions.ExceptionValorInvalido
	 * @return retorna el resultado de los puntos obtenidos
	 */
	public int calculateScore(int correctCount,int incorrectCount){
		return 8;
	}
   
}