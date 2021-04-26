/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.io.StringWriter;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.xml.bind.JAXB;
import model.Result;

/**
 * REST Web Service
 *
 * @author YUME
 */
@Path("circleCalculator")
public class CircleCalculator {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of CircleCalculator
     */
    public CircleCalculator() {
    }

    /**
     * Retrieves representation of an instance of services.CircleCalculator
     * @return an instance of java.lang.String
     */
    @GET
    @Path("{radius}")
    @Produces("application/xml")
    public String getXml(@PathParam("radius") double radius) {
        double area = Math.PI * Math.pow(radius, 2);
        double circumference  = 2 * Math.PI * radius;
        Result result = new Result();
        result.setArea(area);
        result.setCircumference(circumference);
        StringWriter writer = new StringWriter();
        JAXB.marshal(result, writer);
        return writer.toString();
    }

    /**
     * PUT method for updating or creating an instance of CircleCalculator
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/xml")
    public void putXml(String content) {
    }
}
