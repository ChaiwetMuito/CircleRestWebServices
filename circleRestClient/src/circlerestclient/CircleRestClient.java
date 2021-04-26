/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circlerestclient;

import java.io.StringReader;
import javax.xml.bind.JAXB;
import model.Result;
import util.CircleCalculatorClient;
import util.CircleCircumferenceClient;
import util.circleAreaClient;

/**
 *
 * @author YUME
 */
public class CircleRestClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CircleCalculatorClient client = new CircleCalculatorClient();
        String xmlCal = client.getXml("10");
        System.out.println("======================CircleCalculatorClient======================");
        System.out.println(xmlCal);
        Result result = JAXB.unmarshal(new StringReader(xmlCal), Result.class);
        System.out.println("Area :" + result.getArea());
        System.out.println("Circumference :" + result.getCircumference());
        
        // CircleCalculatorClient
        System.out.println("======================CircleCircumferenceClient======================");
        CircleCircumferenceClient client2 = new CircleCircumferenceClient();
        String xmlCir = client2.getXml("10");
        System.out.println(xmlCir);
        double circumference = (double)JAXB.unmarshal(new StringReader(xmlCir), double.class); 
        System.out.println("Circumference :" + circumference);
        
        //CircleAreaClient
        System.out.println("======================CircleAreaClient======================");
        circleAreaClient client3 = new circleAreaClient();
        String xmlArea = client3.getXml("10");
        System.out.println(xmlArea);
        double area = (double)JAXB.unmarshal(new StringReader(xmlArea), double.class); 
        System.out.println("Area :" + area);
        
    }
    
}
