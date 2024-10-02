package exercise_1.creational.singleton;

public class ConfigManager {
    private static ConfigManager instance;
    private String config;

    private ConfigManager() {
        
    }

    public static ConfigManager getInstance() {
        if (instance == null) {
            instance = new ConfigManager();
        }
        return instance;
    }

    public void setConfig(String config) {
        this.config = config;
    }

    public String getConfig() {
        return config;
    }
}