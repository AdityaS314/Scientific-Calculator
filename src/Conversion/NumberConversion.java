/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conversion;

/**
 *
 * @author Administrator
 */
public class NumberConversion {
    public void conversion(boolean hex, boolean dec, boolean bin, boolean oct,boolean A, boolean B, boolean C, boolean D, boolean E, boolean F,boolean two,boolean three,boolean four,boolean five,boolean six, boolean seven, boolean eight,boolean nine ){
        if(dec){
           A = false;
           B = false;
           C = false;
           D = false;
           E = false;
           F = false;
           nine = true;
           eight = true;
           seven = true;
           six = true;
           five = true;
           four = true;
           three = true;
           two = true;
            
        }else if(bin){
           A = false;
           B = false;
           C = false;
           D = false;
           E = false;
           F = false;
           nine = false;
           eight = false;
           seven = false;
           six = false;
           five = false;
           four = false;
           three = false;
           two = false;
 
        }else if(hex){
           A = true;
           B = true;
           C = true;
           D = true;
           E = true;
           F = true;
           nine = true;
           eight = true;
           seven = true;
           six = true;
           five = true;
           four = true;
           three = true;
           two = true;
           }else if(oct){
           A = false;
           B = false;
           C = false;
           D = false;
           E = false;
           F = false;
           nine = false;
           eight = false;
           seven = true;
           six = true;
           five = true;
           four = true;
           three = true;
           two = true;
           
        }
        
    }
    public String BinaryToDecimal(String getValue){
        String setValue = ""+Integer.parseInt(getValue,2);
        return setValue;
    }
    public String OctToDecimal(String getValue){
        String setValue = ""+Integer.parseInt(getValue,8);
        return setValue;
    }
    public String HexToDecimal(String getValue){
        String setValue = ""+Integer.parseInt(getValue,16);
        return setValue;
    }
    public String DecimalToBinary(String getValue){
        int getVal = Integer.parseInt(getValue);
        String setValue = Integer.toBinaryString(getVal);
        return setValue;
    }
    public String DecimalToHex(String getValue){
        int getVal = Integer.parseInt(getValue);
        String setValue = Integer.toHexString(getVal);
        
        return setValue.toUpperCase();
    }
    public String DecimalToOct(String getValue){
        int getVal = Integer.parseInt(getValue);
        String setValue = Integer.toOctalString(getVal);
        return setValue;
    }
    public String BinaryToOctal(String getValue){
        String getVal = ""+Integer.parseInt(getValue,2);//toDecimal
        int getintVal = Integer.parseInt(getVal);//to Octal
        String setValue = Integer.toOctalString(getintVal);
        return setValue;
    }
    public String BinaryToHex(String getValue){
        String getVal = ""+Integer.parseInt(getValue,2);//toDecimal
        int getintVal = Integer.parseInt(getVal);//to Hex
        String setValue = Integer.toHexString(getintVal);
        return setValue.toUpperCase();
    }
    public String OctalToBinary(String getValue){
        String getVal = ""+Integer.parseInt(getValue,8);//toDecimal
        int getintVal = Integer.parseInt(getVal);//to Bin
        String setValue = Integer.toBinaryString(getintVal);
        return setValue;
    }
    public String OctalToHex(String getValue){
        String getVal = ""+Integer.parseInt(getValue,8);//toDecimal
        int getintVal = Integer.parseInt(getVal);//to Hex
        String setValue = Integer.toHexString(getintVal);
        return setValue.toUpperCase();
    }
    public String HexToBinary(String getValue){
        String getVal = ""+Integer.parseInt(getValue,16);//toDecimal
        int getintVal = Integer.parseInt(getVal);//to Bin
        String setValue = Integer.toBinaryString(getintVal);
        return setValue;
    }
    public String HexToOct(String getValue){
        String getVal = ""+Integer.parseInt(getValue,16);//toDecimal
        int getintVal = Integer.parseInt(getVal);//to Octal
        String setValue = Integer.toOctalString(getintVal);
        return setValue;
    }
    public String bitValue(String getText){
        String setText = "";
        if(getText.equals("0")){
            setText = "1";
        }
        if(getText.equals("1")){
            setText = "0";
        }
        return setText;
    }
  }
 
  

