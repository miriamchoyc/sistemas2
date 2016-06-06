package test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Server {

    public static void main(String[] args) {
        System.getProperties().put("server.port", 8081);
        SpringApplication.run(Server.class, args);
        System.out.println("Server started correctly.");
    }

}
