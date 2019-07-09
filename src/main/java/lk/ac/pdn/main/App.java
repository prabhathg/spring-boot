package lk.ac.pdn.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="lk.ac.pdn")
public class App {
	
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}
