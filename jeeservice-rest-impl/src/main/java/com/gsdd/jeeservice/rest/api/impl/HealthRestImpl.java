package com.gsdd.jeeservice.rest.api.impl;

import javax.ws.rs.core.Response;
import com.gsdd.jeeservice.rest.api.HealthRest;

public class HealthRestImpl implements HealthRest {

    @Override
    public Response checkHealth() {
        return Response.ok().build();
    }

}
