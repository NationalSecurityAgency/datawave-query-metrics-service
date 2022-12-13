package datawave.microservice.querymetric.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "datawave.query.metric.timely")
public class TimelyProperties {
    
    private boolean enabled = false;
    private String host = null;
    private int port = 0;
    private Map<String,String> tags = new LinkedHashMap<>();
    private Protocol protocol = Protocol.UDP;
    
    public enum Protocol {
        TCP, UDP
    }
    
    public String getHost() {
        return host;
    }
    
    public void setHost(String host) {
        this.host = host;
    }
    
    public int getPort() {
        return port;
    }
    
    public void setPort(int port) {
        this.port = port;
    }
    
    public Protocol getProtocol() {
        return protocol;
    }
    
    public void setProtocol(Protocol protocol) {
        this.protocol = protocol;
    }
    
    public Map<String,String> getTags() {
        return tags;
    }
    
    public void setTags(Map<String,String> tags) {
        this.tags = tags;
    }
    
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
    
    public boolean isEnabled() {
        return enabled;
    }
}
