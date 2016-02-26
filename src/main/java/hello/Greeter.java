package hello;


/**
 * Created by ricardo.pacheco on 2/26/16.
 */
public class Greeter {
        public String sayHello() {
            return "Hello world!";
        }

        public void launchAnException() {
            throw new RuntimeException();
        }
}
