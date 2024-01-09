package owner;

import org.aeonbits.owner.Config;

@Config.Sources(value = "file:${user.dir}/src/test/resources/config.properties")
public interface ConfigReader extends Config {
    String BROWSER(); // variable names should be same like in .properties file
    @DefaultValue("") // this annotation define default value
    String URL();

    String USERNAME();

    String PASSWORD();

    @Key("SLEEP_TIME") // or use @Key annotation
    int sleepTime();

}
