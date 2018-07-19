package olv.petp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PetApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(PetApplication.class, args);

        System.out.println("something");

    }
}
