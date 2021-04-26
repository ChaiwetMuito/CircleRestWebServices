/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author YUME
 */
@XmlRootElement 
public class Result {

    
    
    private double circumference;

    /**
     * Get the value of circumference
     *
     * @return the value of circumference
     */
    public double getCircumference() {
        return circumference;
    }

    /**
     * Set the value of circumference
     *
     * @param circumference new value of circumference
     */
    @XmlElement
    public void setCircumference(double circumference) {
        this.circumference = circumference;
    }

    private double area;

    /**
     * Get the value of area
     *
     * @return the value of area
     */
    public double getArea() {
        return area;
    }

    /**
     * Set the value of area
     *
     * @param area new value of area
     */
    @XmlElement
    public void setArea(double area) {
        this.area = area;
    }

}
