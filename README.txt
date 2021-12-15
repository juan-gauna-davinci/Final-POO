Alumno : Juan Manuel Gauna
DNI : 43817276
Materia : Programacion Orientada a Objetos
Comision : ACM2B
Turno : Mañana
Profesor: Abelardo Jose Lugo

Trabajo Final de Programacion Orientada a objetos
Defina una clase llamada Punto3D con los siguientes atributos: x (double), y (double), z (double).
Tres constructores: el primer constructor recibe tres parámetros para asignar como valor a cada
atributo, el segundo recibe un solo parámetro (double w) para asignar como valor a cada atributo, y
el tercer constructor no recibe parámetro, en este caso asigna el valor de cero (0) a cada atributo del
objeto Punto3D. Defina dos métodos: un método llamado calcularDistanciaOrigen (que no reciba
parámetros) y retorne un double igual al valor de la distancia del objeto Punto3D al origen, otro
método llamado calcularDistanciaOtroPunto que reciba como parámetros las tres coordenadas
(double x, double y, double z) de un punto y retorne un double igual al valor de la distancia entre
los dos puntos. Sobrecargue el método anterior para que solo reciba un objeto Punto3D y retorne
un double igual al valor de la distancia entre los dos puntos. Sobre escriba el método toString en la
clase Punto3D para que retorne la siguiente cadena de caracteres formada con los atributos de la
clase: `(x,y,z) ́.
Defina una clase llamada Vector3D con los siguientes atributos: puntoInicial (Punto3D), y
puntoFinal (Punto3D). Dos constructores: el primer constructor recibe dos parámetros para asignar
como valor a cada atributo, el segundo recibe un solo parámetro para asignar como valor al atributo
puntoFinal, en dicho caso al atributo PuntoInicial asigne el origen (punto con coordenadas todas
cero). Defina dos métodos: un método llamado calcularMagnitud (que no reciba parámetros) y
retorne un double igual al valor de la magnitud del vector, otro método llamado
mostrarComponentes (que no reciba parámetros) y muestre en tres líneas cada componente del
vector. Sobre escriba el método toString en la clase Vector3D para que retorne la siguiente cadena
de caracteres formada con los atributos de la clase: `El vector comienza en el punto puntoInicial y
termina en el punto puntoFinal ́.
Cree una clase Main, con un método main e instancie tres objetos Punto3D con los siguientes
identificadores: primerPunto (tres últimos números del DNI), segundoPunto (tres últimos números
del DNI invertidos), tercerPunto (segundo número del DNI), e imprima los puntos. Usando el objeto
segundoPunto invoque a los métodos calcularDistanciaOrigen, calcularDistanciaOtroPunto(0, 0, 0) y
calcularDistanciaOtroPunto(primerPunto).
Instancie dos objetos Vector3D con los siguientes identificadores: primerVector (primerPunto,
segundoPunto), segundoVector (tercerPunto). Imprima el objeto primerVector y el objeto
segundoVector, sus magnitudes, e invoque a su método mostrarComponentes en ambos objetos.
Sugerencias: Defina todos los métodos con acceso público. Comente el código. Deje línea por medio
si va a instanciar un objetos de distinta clases.