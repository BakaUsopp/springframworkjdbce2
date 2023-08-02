package demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("En")
public class HelloServiceEn implements HelloService{
    @Override
    public String Hello(String name) {
        return "Hello, "+name+"!";
    }
}
