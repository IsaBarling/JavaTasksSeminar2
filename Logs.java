import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
    
    class Test {
        public static void main(String arg[]) {
            PrintWriter log;
            FileWriter logFile;
            
            try {
                logFile = new FileWriter("exceptions.log", true);
                log = new PrintWriter((java.io.Writer)logFile);
            } catch (IOException ex) {
                ex.printStackTrace();
                return;
            }
            try {
            /*  тут должен быть наверно код калькулятора, но он выдает 30+ ошибок
            но работает отдельно facepalm
            */
                throw new Exception();
            } catch (Exception ex) {
            /*  пишем ошибки, но все пошло не так.
            */
                log.printf("\n%s: %s\n", LocalDateTime.now(), ex.getMessage());
                ex.printStackTrace(log);
                log.flush();
            }
        }
    } 

