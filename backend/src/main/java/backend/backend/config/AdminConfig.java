package backend.backend.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@ConfigurationProperties(prefix = "ui")
public class AdminConfig {
    private String title;
    private List<Map<String, Object>> sections;

    // Getters and setters

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Map<String, Object>> getSections() {
        return sections;
    }

    public void setSections(List<Map<String, Object>> sections) {
        this.sections = sections;
    }
}