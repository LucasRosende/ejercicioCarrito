Comentarios:

- El proyecto se ejecuta desde la clase TestRunner.java. (/EjercicioCarrito/src/test/java/StepDefinitions/TestRunner.java)

- Además, el mismo genera reportes en formatos Html, JSON y JUnit. Los mismos se encuentran en la ruta /EjercicioCarrito/target

- En cuanto a la relaización del ejercicio, tuve probalemas a la hora de manejar las alertas nativas del navegador.
	* Por lo que investigué, las mismas se aceptan con el método driver.SwitchTo().alert().accept()
	* Sin embargo no encontré la forma de aceptar la alerta que se encuentra en el escenario de compra, aún incluyendo distintos Thread.sleep() para darle al navegador tiempo para cargar
	* Lo mismo me ocurrió con el escenario de registro de un usuario
	
- Otro problema que tuve, es el de manipular el orden en el que se ejecutaban los features
	* Investigando encontré que esto se puede cambiar en el TestRunner, especificandolo en CucumberOptions, sin embargo por algún motivo no me fucionó y me ví obligado a renombrar los features para lograr el orden deseado
