package hello;

import java.io.IOException;

/**
 * Created by ricardo.pacheco on 2/26/16.
 */

public class HelloWorld {
    public static void main(String[] args) throws IOException {
        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
    }
}