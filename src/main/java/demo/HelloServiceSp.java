package demo;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Sp")
public class HelloServiceSp implements HelloService{
    @Override
    public String Hello(String name) {
        return "Hola, " + name+ "!";
    }
}
