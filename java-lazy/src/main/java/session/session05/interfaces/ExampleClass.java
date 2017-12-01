package session.session05.interfaces;

import java.io.Serializable;

public class ExampleClass implements Interface, Serializable{
    public void sayHello() {
        System.out.println("hello");
    }

    public String getSomeLine() {
        return "Example class impl";
    }
}
