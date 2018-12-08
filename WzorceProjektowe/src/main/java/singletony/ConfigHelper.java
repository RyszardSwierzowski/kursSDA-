package singletony;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ConfigHelper {
    private static ConfigHelper instance;
    private Map<String,String> config;
    // KONSTRUKTOR
    private ConfigHelper() throws IOException {
        config = new HashMap<>();
        Files.lines(Paths.get("src/main/resources/config.txt"))
                .forEach(line->{
                    String[] split = line.split("=");
                    config.put(split[0], split[1]);
                });
    }

    public static ConfigHelper getInstance() throws IOException {
        if (instance == null)
            instance = new ConfigHelper();
        return instance;
    }



    public String getConfig(String key) {
        return config.get(key);
    }

    public String getConfigValue(String key) {
        return config.get(key);
    }
}
