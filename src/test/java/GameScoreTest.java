import org.junit.Test;
import hangman.model.*;
import org.junit.Assert;
public class GameScoreTest {
    private GameScore origin = new OriginalScore();
    private GameScore bonus = new BonusScore();
    private GameScore power = new PowerScore();

    /**
     *Clases equivalencia OriginalScore:
     * Se debe iniciar con 100 puntos y el puntaje no puede ser menor a 0
     * El puntaje resultante debe ser multiplo de 10
     * casos de frontera 0<puntos<100
     * Clases equivalencia
     */
    @Test
    public void validarOriginPuntosNegativos(){
        int var = origin.calculateScore(0,12);
        Assert.assertEquals(0,var);
    }
    @Test
    public void validarOriginPuntosPositivos(){
        int var = origin.calculateScore(2,2);
        Assert.assertEquals(80,var);
    }
    @Test
    public void validarOriginPuntosCero(){
        int var = origin.calculateScore(5,10);
        Assert.assertEquals(0,var);
    }
    /**
     *Clases equivalencia BonusScore:
     *Se deber iniciar con 100 puntos y el puntaje no puede ser menos a 0
     *El puntaje resultante deber ser multiplo de 5
     *Casos de frontea 0<puntos<100
     */
    @Test
    public void validarBonusPuntosNegativos(){
        int var = bonus.calculateScore(1,3);
        Assert.assertEquals(0,var);
    }
    @Test
    public void validarBonusPuntosPositivos(){
        int var = bonus.calculateScore(5,1);
        Assert.assertEquals(45,var);
    }
    @Test
    public void validarBonusPuntosCero(){
        int var = bonus.calculateScore(2,4);
        Assert.assertEquals(0,var);
    }
    /**
     *Clases equivalencia PowerBonusScore:
     *Se debe iniciar con 100 puntos y el puntaje no puede ser menor a 0
     *El puntaje resultante debe ser multiplo de 10
     *casos de frontera 0<puntos<100
     */
    @Test
    public void validarPowerPuntosNegativos(){
        int var = power.calculateScore(0,4);
        Assert.assertEquals(0,var);
    }
    @Test
    public void validarPowerPuntosPositivos(){
        int var = power.calculateScore(3,0);
        Assert.assertEquals(155,var);
    }
    @Test
    public void validarPowerPuntosCero(){
        int var = power.calculateScore(8,61035);
        Assert.assertEquals(0,var);
    }
    @Test
    public void validarPowerPuntosMayorQuinientos(){
        int var = power.calculateScore(4,2);
        Assert.assertEquals(500,var);
    }
}
