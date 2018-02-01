### Escuela Colombiana de Ingeniería

### Procesos de Desarrollo de Software

### Desarrollo Dirigido por Pruebas + DIP + DI + Contenedores Livianos


Para este taller se va a trabajar sobre el juego del ahorcado del
[primer taller](https://github.com/PDSW-ECI/GoF-CreationalPatterns-FactoryMethod-Hangman).

El sistema actual de puntuación del juego comienza en 100 puntos y va
descontando 10 puntos cada vez que se propone una letra incorrecta.

Algunos usuarios han propuesto diferentes esquemas para realizar la
puntuación, los cuales se describen a continuación:

* OriginalScore: 
    * Es el esquema actual, se inicia con 100 puntos.
    * No se bonifican las letras correctas.
    * Se penaliza con 10 puntos con cada letra incorrecta.
    * El puntaje minimo es 0.

* BonusScore: 
    * El juego inicia en 0 puntos.
    * Se bonifica con 10 puntos cada letra correcta.
    * Se penaliza con 5 puntos cada letra incorrecta.
    * El puntaje mínimo es 0
    
* PowerBonusScore:
    * El juego inicia en 0 puntos.
    * La $i-ésima$ letra correcta se bonifica con $5^i$.
    * Se penaliza con 8 puntos cada letra incorrecta.
    * El puntaje mínimo es 0
    * Si con las reglas anteriores sobrepasa 500 puntos, el puntaje es
      500.

Lo anterior, se traduce en el siguiente modelo, donde se aplica el
principio de inversión de dependencias:


![](img/model.png)


### Parte I

1. Revise y adecue de ser necesario su proyecto de la primera entrega
   para que la creación del diccionario, idioma y estilo visual se
   realize utilizando el patrón Método Fábrica. 
   
2. A partir del código existente, implemente sólo los cascarones del
   modelo antes indicado.

3. Haga la especificación de los métodos calculateScore (de las tres
   variantes de GameScore), a partir de las especificaciones
   generales dadas anteriormente. Recuerde tener en cuenta: @pre,
   @pos, @param, @throws.

4. Haga commit de lo realizado hasta ahora. Desde la terminal:

	```bash		
	git add .			
	git commit -m "especificación métodos"
	```

5. Teniendo en cuenta dichas especificaciones, en la clase donde se
   implementarán las pruebas (GameScoreTest), en los
   comentarios iniciales, especifique las clases de equivalencia para
   las tres variantes de GameScore, e identifique
   condiciones de frontera. 

6. Para cada clase de equivalencia y condición de frontera, implemente
   una prueba utilizando QuickTheories.

7. Haga commit de lo realizado hasta ahora. Desde la terminal:

	```bash		
	git add .			
	git commit -m "implementación pruebas"
	```
8. Realice los ciclos TDD que hagan falta para implementar los
   'cascarones' realizados anteriormente: implementar, correr pruebas,
   agregar casos de prueba (si hace falta), refactorizar, ejecutar
   nuevamente las pruebas, etc.

9. Al finalizar haga un nuevo commit:

	```bash		
	git add .			
	git commit -m "implementación del modelo"
	```

10. Para comprimir el avance y NO PERDER el histórico de commits, use
    el siguiente comando (dentro del directorio que va a comprimir,
    sin olvidar el punto):

```bash	
	zip -r NOMBRE.PROYECTO.zip .	
```


### Parte II

En el primer taller se pedía que se utilizara el patrón FactoryMethod
con el que se desacopla la creación de los objetos, para rediseñar un
juego de ahorcado.

En este taller se va a utilizar un contenedor liviano (lightweight
container) para hacer la creación e inyección de las dependencias.
El contenedor ligero que se va a utilizar

Incorpore el Contenedor Liviano Guice dentro del proyecto:

* Agregue las dependencias necesarias en el pom.xml.
* Configure la aplicación de manera que desde el programa SimpleApp NO
  SE CONSTRUYA el manejador de órdenes directamente, sino a través de
  Guice, y que a través de la configuración de la Inyección de
  Dependencias se pueda cambiar el comportamiento del mismo, por
  ejemplo:
	* Calcular si IVA y sin propinas.
	* Calcular con el IVA del régimen del 2016.
	* Calcualr con el IVA unificado.
	* etc...
* Para lo anterior, [puede basarse en el ejemplo dado como
  referencia](https://github.com/PDSW-ECI/LightweighContainers_DepenendecyInjectionIntro-WordProcessor).