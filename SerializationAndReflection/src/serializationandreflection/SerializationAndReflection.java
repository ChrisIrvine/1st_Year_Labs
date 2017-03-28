/*
 * 1. Download and save object.ser file, load it into an object and print it out
 */
package serializationandreflection;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.lang.Class;
import java.lang.reflect.*;
import java.util.ArrayList;

/**
 *
 * @author ruw12gbu
 */
public class SerializationAndReflection {

    /**
     * @param args the command line arguments
     */
    //Final variable to hold the filePath
    private static final String filePath = "\\\\ueahome4\\stusci3\\ruw12gbu\\data\\Documents\\NetbeansProjects\\SerializationAndReflection\\object.ser";
    private static final String newArg = "ARSENAL";
    public static void main(String[] args) 
    {
        SerializationAndReflection object = new SerializationAndReflection();
        
        //Read File from Object
        Object obj = (Object) object.ReadObjectFromFile(filePath);
        System.out.println(obj);
        
        object.ObjectType(obj);
    }
    public Object ReadObjectFromFile(String filePath)
    {
        try
        {
            //try to read the file
            FileInputStream fileIn = new FileInputStream(filePath);
            //try to take the read file and read it into an object
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            //Read the readied file into an object, obj
            Object obj = objectIn.readObject();
            //Notify that the object has been read from the file
            System.out.println("The Object has been read from the file");
            return obj;
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            return null;
        }
    }
    
    public void ObjectType(Object obj)
    {
        Class c = obj.getClass();
        System.out.println(c);
        Method m = c.getDeclaredMethods()[1];
        System.out.println(m);
        try
        {
            //ArrayList<String> newArray = (ArrayList<String>)obj;
            //obj = c.newInstance();
            System.out.println(obj);
            //m.invoke(obj, 1, "ARSENAL");
            m.invoke(obj,  1, "ARSENAL")
            System.out.println("Method name is " + m.getName() + "return is =" + m.invoke(obj, newArg));
        }
        catch (Exception e)
        {
            System.out.println("Exception = " + e);
        }
    }
}
