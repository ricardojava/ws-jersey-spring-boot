package com;

import com.avianca.asl.rest.SecurityController;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

/**
 * Created by wallace on 17/06/16.
 */
@Component
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        packages("com.avianca.asl.rest");
    }

}
