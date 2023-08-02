package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
        @Autowired
        @Qualifier("En")
        private HelloService helloService;
        public void  Hello(String name){
            String msg = helloService.Hello(name);
            System.out.println(msg);
        }

}
