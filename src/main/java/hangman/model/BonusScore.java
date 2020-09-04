package hangman.model;

public class BonusScore implements GameScore {
	/**
	 * @pre correctCount: numero entero,incorrectCount:numero entero
	 * @pos :Calcula es resultado de los puntos segun los parametros
	 * @param: correctCount:es l numero de respuestas correctas que tuvo el participante
	 * @param: incorrectCount:es el numero de respuestas incorrectas que tuvo el participante
	 * @throws :hangman.exceptions.ExceptionValorInvalido
	 * @return retorna el resultado de los puntos obtenidos
	 */
	private final int negativos = 5;
	private final int positivos = 10;
	private int puntos;

	public int calculateScore(int correctCount,int incorrectCount){
		puntos = 0;
		if(correctCount< 0 || incorrectCount<0){
			System.out.println("Dato invalido");
			return -1;
		}
		calcularPalabrasCorrectas(correctCount);
		calcularPalabrasIncorrectas(incorrectCount);
		return puntos;
	}
   private void calcularPalabrasCorrectas(int correctCount){
		for(int i = 0; i<correctCount; i++){
			puntos += positivos;
		}
   }
   private void calcularPalabrasIncorrectas(int incorrectCount){
		while(puntos > 0 && incorrectCount>0){
			puntos -= negativos;
			incorrectCount -= 1;
		}
   }
}