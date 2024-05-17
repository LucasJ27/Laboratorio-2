import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.ThreadContext;



public class MiLog {
    private static final Logger logger = LogManager.getLogger(MiLog.class);

    public static void main(String[] args) {


        // Ejercicio 1
        // logger.info("La aplicación MiLog se ha iniciado.");


        // Ejercicio 2
        // Este nuevo nivel de logging se crea desde el archivo de configuracion utilizando la etiqueta <CustomLevels>
        // logger.log(Level.getLevel("MiLogLevel"), "Mensaje con nivel personalizado (MiLogLevel).");


        // Ejercicio 3
        // Realizamos una solicitud HTTP (GET) a Google y la respuesta la mostramos por consola y archivo log.txt
        // (Para esto modificamos el archivo de configuracion)
        // try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            // HttpGet httpGet = new HttpGet("https://www.google.com");

            // try (CloseableHttpResponse response = httpClient.execute(httpGet)) {
                // int statusCode = response.getStatusLine().getStatusCode();
                // logger.info("Código de estado HTTP: " + statusCode);

                // String responseBody = EntityUtils.toString(response.getEntity());
                // logger.info("Respuesta HTTP: " + responseBody);
            // } catch (Exception e) {
                // logger.error("Error al leer la respuesta HTTP: " + e.getMessage());
            // }
        // } catch (Exception e) {
            // logger.error("Error al realizar la petición HTTP: " + e.getMessage());
        // }


        // Ejercicio 4
        // Este diseño de Appender formatea los mensajes en un formato HTML (util para integrar registros en una pagina web)
        // Dado el siguiente log:
        // logger.info("Este es un mensaje de nivel INFO");
        // La respuesta seria similar a la que se encuentra en el archivo appender-response.html


        // Ejercicio 5
        // Se define un RolllingFile en el archivo de configuracion, en el archivo especificado se iran guardando logs, y al
        // cabo de 2 minutos se rotara el archivo. Log de ejemplo:
        // logger.info("Este es un mensaje de nivel INFO");


        // Ejercicio 6
        // Lo unico que se modifica en el RollingFile del archivo de configuracion es la etiqueta <TimeBasedTriggeringPolicy>,
        // que se cambia por <CronTriggeringPolicy>, en este caso, el archivo rota cada 2 minutos (expresado en formato cron)
        // Log de ejemplo:
        // logger.info("Este es un mensaje de nivel INFO");


        // Ejercicio 7
        // Se definen cuatro patrones diferentes en el archivo de configuracion (Console, ConsoleJson, ConsoleCustom, ConsoleShort)
        // Log de ejemplo para observarlos:
        // logger.info("Este es un mensaje de nivel INFO");


        // Ejercicio 8
        // a- El patron %d [%-6p] %c{1} - %m%n produce el siguiente resultado:
        // 2024-04-17 22:07:44,159 [INFO  ] MiLog - Este es un mensaje de nivel INFO

        // b- El patron %sn %d{yyyy/MM/dd HH:mm:ss,SSS} %r [%-6p] [%t] %c{3} %C{3}.%M(%F:%L) - %m%n produce el siguiente resultado:
        // 1 2024/04/17 22:08:42,525 440 [INFO  ] [main] MiLog MiLog.main(MiLog.java:69) - Este es un mensaje de nivel INFO

        // Los resultados se obtuvieron utilizando el siguiente log:
        // logger.info("Este es un mensaje de nivel INFO");


        // Ejercicio 9
        // La clase ThreadContext en Log4j proporciona un mecanismo para almacenar y recuperar información específica
        // de cada hilo de ejecución. Esto es útil cuando necesitas asociar ciertos datos con un hilo, como identificadores
        // de sesión, identificadores de usuario, etc. Estos datos pueden luego ser incluidos en los mensajes de logging para un seguimiento más detallado.

        // El siguiente es un ejemplo aplicando ThreadContext:
        // ThreadContext.put("sessionId", "ABC123");
        // ThreadContext.put("userId", "john_doe");

        // logger.info("Mensaje de prueba");

        // ThreadContext.clearAll();
    }
}