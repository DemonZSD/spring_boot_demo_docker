package org.demonzsd.springbootdemo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * MiddleProperties associated with application.yaml: middle Config
 *
 * @author by DemonZSD
 */

@Component
@ConfigurationProperties("middle")
@Setter
@Getter
public class MiddleProperties {

    private String server;
    private Etcd etcd;

    @Setter
    @Getter
    @ToString(exclude = "password")
    public static class Etcd {
        private String port;
        private String password;
        private String timeout;
        private String host;

    }

}
