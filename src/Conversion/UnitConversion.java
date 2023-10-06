/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conversion;

import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author Administrator
 */
public class UnitConversion {
    public String unitConversion(String unit,String from,String to,String getText){
        double value = Double.parseDouble(getText);
        double fromtext = Double.parseDouble(getText);
        double n;
         
        String pair = from +"-"+to;
        System.out.println(" this is pair "+pair);
        n = getPair(pair);
        value = fromtext * n;
        
        
      /* 
        }else if(unit1.equalsIgnoreCase("Temperature")){
            if(from.equalsIgnoreCase("kelvin")&& to.equalsIgnoreCase("celcius")){
                 n = 1.11111;
                
            }else if(from.equalsIgnoreCase("kelvin") && to.equalsIgnoreCase("kelvin")){
                return getText;
            }else if(from.equalsIgnoreCase("kelvin") && to.equalsIgnoreCase("fahrenheit")){
                 n = 0.0174532925199433;
                
            }else if(from.equalsIgnoreCase("celcius") && to.equalsIgnoreCase("kelvin")){
                 n = 0.9;
                
            }else if(from.equalsIgnoreCase("celcius") && to.equalsIgnoreCase("fahrenheit")){
                 n = 0.015707963267949;
                
            }else if(from.equalsIgnoreCase("celcius") && to.equalsIgnoreCase("celcius")){
                return getText;
            }else if(from.equalsIgnoreCase("fahrenheit") && to.equalsIgnoreCase("kelvin")){
                 n = 57.29577951308233;
                
            }else if(from.equalsIgnoreCase("fahrenheit") && to.equalsIgnoreCase("fahrenheit")){
                return getText;
            }else if(from.equalsIgnoreCase("fahrenheit") && to.equalsIgnoreCase("celcius")){
                 n = 63.66197723675814;
                
            }else{}
            value = fromtext * n;
        }else if(unit1.equalsIgnoreCase("power")){
            if(from.equalsIgnoreCase("watt") && to.equalsIgnoreCase("Kilowatt")){
                 n = 0.001;
                
            }else if(from.equalsIgnoreCase("watt") && to.equalsIgnoreCase("BTU/minute")){
                 n = 0.0568690192748063;                
                
            }else if(from.equalsIgnoreCase("watt") && to.equalsIgnoreCase("Foot-Pound/minute")){
                 n = 44.25372895663593;                
                
            }else if(from.equalsIgnoreCase("watt") && to.equalsIgnoreCase("HorsePower")){
                 n = 0.001341022089595;                
                
            }else if(from.equalsIgnoreCase("Kilowatt") && to.equalsIgnoreCase("watt")){
                 n = 1000;
                
            }else if(from.equalsIgnoreCase("Kilowatt") && to.equalsIgnoreCase("HorsePower")){
                 n = 1.341022089595028;                
                
            }else if(from.equalsIgnoreCase("Kilowatt") && to.equalsIgnoreCase("Foot-Pound/minute")){
                 n = 44253.72895663593;                
                
            }else if(from.equalsIgnoreCase("Kilowatt") && to.equalsIgnoreCase("BTU/minute")){
                 n = 56.86901927480627;                
                
            }else if(from.equalsIgnoreCase("BTU/minute") && to.equalsIgnoreCase("watt")){
                 n = 17.58426666666667;
                
            }else if(from.equalsIgnoreCase("BTU/minute") && to.equalsIgnoreCase("Kilowatt")){
                 n = 0.0175842666666667;                
                
            }else if(from.equalsIgnoreCase("BTU/minute") && to.equalsIgnoreCase("Foot-Pound/minute")){
                 n = 778.1693709678747;                
                
            }else if(from.equalsIgnoreCase("BTU/minute") && to.equalsIgnoreCase("HorsePower")){
                 n = 0.0235808900293295;                
                
            }else if(from.equalsIgnoreCase("Foot-Pound/minute") && to.equalsIgnoreCase("watt")){
                 n = 7;
                
            }else if(from.equalsIgnoreCase("Foot-Pound/minute") && to.equalsIgnoreCase("Kilowatt")){
                 n = 0.0225969658055233;                
                
            }else if(from.equalsIgnoreCase("Foot-Pound/minute") && to.equalsIgnoreCase("BTU/minute")){
                 n = 0.0225969658055233;                
                
            }else if(from.equalsIgnoreCase("Foot-Pound/minute") && to.equalsIgnoreCase("HorsePower")){
                 n = 3.030303030303029e-5;                
                
            }else if(from.equalsIgnoreCase("HorsePower") && to.equalsIgnoreCase("watt")){
                 n = 745.6998715822702;
                
            }else if(from.equalsIgnoreCase("HorsePower") && to.equalsIgnoreCase("Kilowatt")){
                 n = 0.7456998715822702;                
                
            }else if(from.equalsIgnoreCase("HorsePower") && to.equalsIgnoreCase("BTU/minute")){
                 n = 42.40722037023268;                
                
            }else if(from.equalsIgnoreCase("HorsePower") && to.equalsIgnoreCase("Foot-Pound/minute")){
                 n = 33000.00000000001;                
                
            }else{}
            value = fromtext * n;
        }*/
        return ""+value;
    }
    public double getPair(String pair){
        
    // Create a hash map
      HashMap hm = new HashMap();
      double n= 0.0;
      // Put elements to the map
      hm.put("Degree-Gradian", new Double(1.11111));
      hm.put("Degree-Radian", new Double(0.0174532925199433));
      hm.put("Gradian-Degree", new Double(0.9));
      hm.put("Gradian-Radian", new Double(0.015707963267949));
      hm.put("Radian-Degree", new Double(57.29577951308233));
      hm.put("Radian-Gradian", new Double(63.66197723675814));
      
      hm.put("Day-Week", new Double(0.1428571428571429));
      hm.put("Day-Hour", new Double(24));
      hm.put("Day-Minutes", new Double(1440));
      hm.put("Day-Seconds", new Double(86400));
      hm.put("Day-Milliseconds", new Double(86400000));
      hm.put("Day-Microseconds", new Double(86400 * 1000000));
  
      hm.put("Week-Day", new Double(7));
      hm.put("Week-Hour", new Double(168));
      hm.put("Week-Minutes", new Double(10080));
      hm.put("Week-Seconds", new Double(604800));
      hm.put("Week-Milliseconds", new Double(604800000));
      hm.put("Week-Microseconds", new Double(604800 * 1000000));
      
      hm.put("Hour-Day", new Double(0.0416666666666667));
      hm.put("Hour-Week", new Double(0.005952380952381));
      hm.put("Hour-Minutes", new Double(60));
      hm.put("Hour-Seconds", new Double(3600));
      hm.put("Hour-Milliseconds", new Double(3600000));
      hm.put("Hour-Microseconds", new Double(3600 * 1000000));
      
      hm.put("Minutes-Day", new Double(6.944444444444444e-4));
      hm.put("Minutes-Week", new Double(9.920634920634921e-5));
      hm.put("Minutes-Hour", new Double(0.0166666666666667));
      hm.put("Minutes-Seconds", new Double(60));
      hm.put("Minutes-Milliseconds", new Double(60000));
      hm.put("Minutes-Microseconds", new Double(60000000));
      
      hm.put("Seconds-Day", new Double(1.157407407407407e-5));
      hm.put("Seconds-Week", new Double(1.653439153439153e-6));
      hm.put("Seconds-Minutes", new Double(0.0166666666666667));
      hm.put("Seconds-Hour", new Double(2.777777777777778e-4));
      hm.put("Seconds-Milliseconds", new Double(1000));
      hm.put("Seconds-Microseconds", new Double(1000000));
      
      hm.put("Milliseconds-Day", new Double(1.157407407407407e-8));
      hm.put("Milliseconds-Week", new Double(1.653439153439153e-9));
      hm.put("Milliseconds-Minutes", new Double(1.666666666666667e-5));
      hm.put("Milliseconds-Seconds", new Double(0.001));
      hm.put("Milliseconds-Hour", new Double(2.777777777777778e-7));
      hm.put("Milliseconds-Microseconds", new Double(1000));
      
      hm.put("Microseconds-Day", new Double(1.157407407407407e-11));
      hm.put("Microseconds-Week", new Double(1.653439153439153e-12));
      hm.put("Microseconds-Minutes", new Double(1.666666666666667e-8));
      hm.put("Microseconds-Seconds", new Double(0.000001));
      hm.put("Microseconds-Milliseconds", new Double(0.001));
      hm.put("Microseconds-Hour", new Double(2.777777777777778e-10));
      
      // Get a set of the entries
      Set set = hm.entrySet();
      
      n = Double.parseDouble(hm.get(pair).toString());
      System.out.println(" value : "+hm.get(pair) +"\nvalue of n: "+n);
      return n;
    }
  
}

