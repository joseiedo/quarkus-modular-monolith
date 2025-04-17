package com.github.bgizdov

import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces
import jakarta.ws.rs.core.MediaType

@Path("/customers")
class ExampleResources {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    fun hello() = "Hello, my friend!"
}