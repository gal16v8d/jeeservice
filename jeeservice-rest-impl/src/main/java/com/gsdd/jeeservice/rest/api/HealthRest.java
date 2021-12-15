package com.gsdd.jeeservice.rest.api;

import javax.ws.rs.HEAD;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/health")
public interface HealthRest {

    @HEAD
    Response checkHealth();
}
