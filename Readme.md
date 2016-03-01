# Javascript en la JVM 8.0

Proyecto de ejemplo para correr JS en la JVM utilizando los engines de **nashorn**, **rhino** y el framework **avatar-js**.


 **JsRunnerSpec:** Ejecuta un inline script en los engines nashorn y rhino.

 **JsRunnerBrowserifySpec:** Ejecuta un archivo definido con commonjs, utilizando una transformación de browserify,
 en los engines nashorn y rhino.

 **TestNodeWrapper:** Ejecuta un script en avatar-js.



* Avatar.js  : Es una implementación de node para la JVM, utiliza el engine de nashorn.
* Nashorn    : El engine de JS por defecto de la JVM 8.
* Rhino.js   : Engine de JS desarrollado por Mozilla.

Para correr el proyecto:

1. Ejecutar npm en la carpeta /js (esto es para obtener las dependencias necesarias de los ejemplos).
4. Correr grunt en la carpeta /js (aplica browserify).
2. Usar SDK 8
3. En la raiz del proyecto es ejecutar (esto es para exponer los bindigs que requiere avatar-js):
    * Para osx:
       ```bash
        export DYLD_LIBRARY_PATH=$(pwd)/lib:$DYLD_LIBRARY_PATH
       ```

    * otros
      ```bash
        export LD_LIBRARY_PATH=$(pwd):$LD_LIBRARY_PATH
      ```

4. Ejecutar:

    ```bash
      cd js
      npm install
      grunt
      cd ..
      gradle test
    ```


Nota: Solo lo se hicieron pruebas en osx, gradle no tiene soporte completo para JVM 8.

Referencias:

[How to run Node.js on the JVM with Avatar.js](http://strongloop.com/strongblog/how-to-run-node-js-on-the-jvm-with-avatar-js-and-loopback/)

[rhino](https://github.com/mozilla/rhino)

[nashorn](http://openjdk.java.net/projects/nashorn/)


