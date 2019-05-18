# 21707 – PROGRAMACIÓN II



## Curso 2018 - 2019

### SEGUNDO TALLER EVALUABLE



##### OBJETIVOS



Los objetivos de este taller son los de trabajar con estructuras matriciales y con un entorno gráfico e interactivo utilizando las prestaciones que ofrecen las librerías gráficas de JAVA aplicando los conceptos de objetos y de tipos abstractos de datos.

##### ENUNCIADO



Implementación de un programa JAVA que visualice el juego de ***LA HORMIGA COME HOJAS***
El juego se fundamenta en un tablero de 20x20 casillas en el que una casilla presentacomo contenido la imagen de una hormiga y, en el resto de casillas se visualizará la imagen de una hoja:

![5cdffbefcd8dc66605](https://i.loli.net/2019/05/18/5cdffbefcd8dc66605.png)

La hormiga podrá cambiar de dirección a través de la interacción del usuario con las
teclas de dirección (izquierda, arriba, derecha y abajo), de manera que al pulsar el
usuario una de estas teclas se cambiará la dirección de la hormiga acorde a la tecla
pulsada, y se visualizará la imagen de la hormiga correspondiente a la dirección
seleccionada.

Para visualizar la hormiga se dispondrá de 4 imágenes:

| ![5cdffc86c4c9532375](https://i.loli.net/2019/05/18/5cdffc86c4c9532375.png) | ![5cdffc90a611f41930](https://i.loli.net/2019/05/18/5cdffc90a611f41930.png) | ![5cdffca980ab560897](https://i.loli.net/2019/05/18/5cdffca980ab560897.png) |![5cdffcb72f55232787](https://i.loli.net/2019/05/18/5cdffcb72f55232787.png) |
| --- | --- | --- | --- |
| hormiga_o.png | hormiga_n.png | hormiga_e.png | hormiga_s.png |

que representarán a la hormiga en cada una de las direcciones de avance posible:

hormiga_o.png → oeste (izquierda)

hormiga_n.png → norte (arriba)

hormiga_e.png → este (derecha)

hormiga_s.png → sur (abajo).

El avance de la hormiga, a través de las casillas del tablero, se implementará al pulsar la tecla de espacio del teclado, siguiendo la dirección seleccionada. El avance de la hormiga conllevará la visualización de la imagen de la hormiga correspondiente en la nueva casilla resultante del avance, dejándose de visualizar a la hormiga en la casilla anterior al avance. Si en la casilla resultante del avance hubiese una hoja, ésta desaparecerá. Las casillas que no presenten hoja debido al paso anterior por ellas de la hormiga visualizarán un espacio blanco representado por la imagen nada.png. Si al avanzar la hormiga sobrepasa los límites del tablero, la casilla que deberá ocupar será la primera de lado opuesto.

La hoja será visualizada utilizando para ello la imagen hoja.png:

![5cdffce01012796917](https://i.loli.net/2019/05/18/5cdffce01012796917.png)

Una vez que la hormiga haya acabado con todas las hojas deberá aparecer una ventana
de información en la que se visualice el siguiente mensaje:

ENHORABUENA

¡¡¡has completado el juego!!!

LA HORMIGA SE HA COMIDO TODAS LAS HOJAS

![5cdffb31e0b1999820](https://i.loli.net/2019/05/18/5cdffb31e0b1999820.png)

Cuando el usuario confirme haber leído el mensaje anterior, la ejecución del programa finalizará. También el usuario tendrá la posibilidad de acabar la ejecución utilizando la salida de la ventana de Windows en cualquier momento.

![5cdffb7ab038f67913](https://i.loli.net/2019/05/18/5cdffb7ab038f67913.png)

El proyecto netbeans deberá ser depositado en el nodo correspondiente, habilitado para ello en Campus Extens, no más tarde de las 24:00 del día 19 de mayo. El taller tiene caracter individual.
