package com.java;

public class ConvertStringtoNumber{
        public static int stringToNumber(String str) {
            //opción 1
             int number= Integer.parseInt(str);
            //opción2
            int number2= Integer.valueOf(str);
            //opcion3
            int number3=new  Integer(str).intValue();
return number;
            }
        }
