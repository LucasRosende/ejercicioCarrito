Comentarios:

- El proyecto se ejecuta desde la clase TestRunner.java. (/EjercicioCarrito/src/test/java/StepDefinitions/TestRunner.java)

- Adem�s, el mismo genera reportes en formatos Html, JSON y JUnit. Los mismos se encuentran en la ruta /EjercicioCarrito/target

- En cuanto a la relaizaci�n del ejercicio, tuve probalemas a la hora de manejar las alertas nativas del navegador.
	* Por lo que investigu�, las mismas se aceptan con el m�todo driver.SwitchTo().alert().accept()
	* Sin embargo no encontr� la forma de aceptar la alerta que se encuentra en el escenario de compra, a�n incluyendo distintos Thread.sleep() para darle al navegador tiempo para cargar
	* Lo mismo me ocurri� con el escenario de registro de un usuario
	
- Otro problema que tuve, es el de manipular el orden en el que se ejecutaban los features
	* Investigando encontr� que esto se puede cambiar en el TestRunner, especificandolo en CucumberOptions, sin embargo por alg�n motivo no me fucion� y me v� obligado a renombrar los features para lograr el orden deseado
