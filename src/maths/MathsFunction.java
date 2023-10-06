/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package maths;

/**
 *
 * @author server
 */
public class MathsFunction {
    
    double secondnum;
    double result;
    private Object math;
    
    public String plusminus(String val){
        double ops = Double.parseDouble(String.valueOf(val));
        ops = ops * (-1);
      
       return  String.valueOf(ops);
    }
    public String equal(String val,double firstnum,String operations){
        String answer = "0.0";
        secondnum = Double.parseDouble(val);
        if(operations == "+"){
            result = firstnum + secondnum;
            answer = String.format("%.2f",result);
            return answer;
            
        }else if(operations == "-"){
            result = firstnum - secondnum;
            answer = String.format("%.2f",result);
            return answer;
            
        }else if(operations == "*"){
            result = firstnum * secondnum;
            answer = String.format("%.2f",result);
            return answer;
            
        }else if(operations == "/"){
            result = firstnum / secondnum;
            answer = String.format("%.2f",result);
            return answer;
            
        }else if(operations == "%"){
            result = firstnum % secondnum;
            answer = String.format("%.2f",result);
            return answer;
           
            
        }else{}
        
        return answer;
    }
    public String getiNum(String val,String number){
        String iNum = "";
        if(val.equals("0")){
            iNum = number;
            return iNum;
        }else{
            iNum = val + number;
            return iNum;
        }
        
       
    }
    public String backButton(String val){
        String bsp = null;
        
        if(val.length() > 0){
            StringBuilder strb = new StringBuilder(val);
            strb.deleteCharAt(val.length() - 1);
            bsp = strb.toString();
            return bsp;
        }
        return bsp;
    }
    public String dotButton(String val,String val1){
        String dot = null;
        if(!val.contains(".")){
            dot = val + val1;
            return dot;
        }
        return dot;
    }
    public String sqrt(String val){
        double ops = Double.parseDouble(String.valueOf(val));
        ops = Math.sqrt(ops);
        return String.valueOf(ops);
    }
    /*
    public void itemChanged(String unit1,String from,String to){
        String unit = unit1.toString();
        String angleList[] = new String[] {"Radian","Degree","Gradian"};
        String timeList[] = new String[] {"Day","Hour","Microsecond","Millisecond","Week","Minute","Second"};
        String energyList[] = new String[] {"British Thermal unit","Calorie","Electron-volts","Joule","KiloJoule","KiloCalorie","Foot-Pound"};
        if(unit.equalsIgnoreCase("Angle")){
            fromcomboBox.setModel(new javax.swing.DefaultComboBoxModel<>(angleList));
            tocomboBox.setModel(new javax.swing.DefaultComboBoxModel<>(angleList));
        }else if(unit.equalsIgnoreCase("Time")){
            fromcomboBox.setModel(new javax.swing.DefaultComboBoxModel<>(timeList));
            tocomboBox.setModel(new javax.swing.DefaultComboBoxModel<>(timeList));
        }else if(unit.equalsIgnoreCase("Energy")){
            fromcomboBox.setModel(new javax.swing.DefaultComboBoxModel<>(energyList));
            tocomboBox.setModel(new javax.swing.DefaultComboBoxModel<>(energyList));
        }else if(unit.equalsIgnoreCase("Area")){
            fromcomboBox.setModel(new javax.swing.DefaultComboBoxModel<>(energyList));
            tocomboBox.setModel(new javax.swing.DefaultComboBoxModel<>(energyList));
        }else if(unit.equalsIgnoreCase("Volume")){
            fromcomboBox.setModel(new javax.swing.DefaultComboBoxModel<>(energyList));
            tocomboBox.setModel(new javax.swing.DefaultComboBoxModel<>(energyList));
        }else if(unit.equalsIgnoreCase("Weight/Mass")){
            fromcomboBox.setModel(new javax.swing.DefaultComboBoxModel<>(energyList));
            tocomboBox.setModel(new javax.swing.DefaultComboBoxModel<>(energyList));
        }else if(unit.equalsIgnoreCase("Lenght")){
            fromcomboBox.setModel(new javax.swing.DefaultComboBoxModel<>(energyList));
            tocomboBox.setModel(new javax.swing.DefaultComboBoxModel<>(energyList));
        }else if(unit.equalsIgnoreCase("Power")){
            fromcomboBox.setModel(new javax.swing.DefaultComboBoxModel<>(energyList));
            tocomboBox.setModel(new javax.swing.DefaultComboBoxModel<>(energyList));
        }else if(unit.equalsIgnoreCase("Pressure")){
            fromcomboBox.setModel(new javax.swing.DefaultComboBoxModel<>(energyList));
            tocomboBox.setModel(new javax.swing.DefaultComboBoxModel<>(energyList));
        }else if(unit.equalsIgnoreCase("Velocity")){
            fromcomboBox.setModel(new javax.swing.DefaultComboBoxModel<>(energyList));
            tocomboBox.setModel(new javax.swing.DefaultComboBoxModel<>(energyList));
        }else if(unit.equalsIgnoreCase("Temperature")){
            fromcomboBox.setModel(new javax.swing.DefaultComboBoxModel<>(energyList));
            tocomboBox.setModel(new javax.swing.DefaultComboBoxModel<>(energyList));
        }
    }*/
}
