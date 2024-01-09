package owner;

import org.aeonbits.owner.ConfigFactory;

public class Examples {

    public static void main(String[] args) {

        ConfigReader cr = ConfigFactory.create(ConfigReader.class);
        // Based on interface related to .properties file call ConfigFactory from Owner library to get access to file

        System.out.println(cr.BROWSER());
        System.out.println(cr.URL());
        System.out.println(cr.USERNAME());
        System.out.println(cr.PASSWORD());
        System.out.println(cr.sleepTime());
    }
}
