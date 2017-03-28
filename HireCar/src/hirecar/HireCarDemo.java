/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hirecar;

/**
 *
 * @author ruw12gbu
 */
public class HireCarDemo
{
    public String manufacturer;
    public String registration;
    public int mileage;
    public int serviceInterval;
    public int lastService;
    /**
     * Program to process information about it's fleet of cars.
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
    }
    
    public HireCarDemo(String maker, String reg, int miles, int service,
            int last)
    {
        manufacturer = maker;
        registration = reg;
        mileage = miles;
        serviceInterval = service;
        lastService = last;
    }
    
    public HireCarDemo ()
    {
        manufacturer = null;
        registration = null;
        mileage = 0;
        serviceInterval = 0;
        lastService = 0;
    }
    
    public String getManufacturer()
    {
        return manufacturer;
    }
    
    public String getRegistration()
    {
        return registration;
    }
    
    public int getMileage()
    {
        return mileage;
    }
    
    public int 
}
