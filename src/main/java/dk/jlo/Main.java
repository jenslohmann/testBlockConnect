package dk.jlo;

import java.io.IOException;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setProperty("java.security.policy", "file:all.policy");
        System.setSecurityManager(new SecurityManager());

        System.out.println("Forbinder til google.dk");
        new URL("https://www.google.dk").openConnection().connect();

        System.out.println("Forbinder til eb.dk");
        new URL("https://eb.dk").openConnection().connect();

    }
}
