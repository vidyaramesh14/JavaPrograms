package com.bridgelabz.designpattern;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class TestSerializationSingleton 
{
  public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException
  {
    	SingletonSerialization serial1 =SingletonSerialization.getNewInstance();
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("vidya"));
        out.writeObject(serial1);
        out.close();
        
        //deserailize from file to object
        ObjectInput in = new ObjectInputStream(new FileInputStream("vidya"));
        SingletonSerialization serial2= (SingletonSerialization) in.readObject();
        in.close();
        
        System.out.println("instanceOne = "+serial1.hashCode());
        System.out.println("instanceTwo = "+serial2.hashCode());
        
    }

}


