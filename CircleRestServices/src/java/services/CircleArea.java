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

/**
 * REST Web Service
 *
 * @author YUME
 */
@Path("circleArea")
public class CircleArea {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of CircleArea
     */
    public CircleArea() {
    }

    /**
     * Retrieves representation of an instance of services.CircleArea
     * @return an instance of java.lang.String
     */
    @GET
    @Path("{radius}")
    @Produces("application/xml")
    public String getXml(@PathParam("radius") double radius) {
        double area = Math.PI * Math.pow(radius, 2);
        StringWriter writer = new StringWriter();
        JAXB.marshal(area, writer);
        return writer.toString();
    }

    /**
     * PUT method for updating or creating an instance of CircleArea
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/xml")
    public void putXml(String content) {
    }
}
