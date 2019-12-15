
// кдасс со сканером для распознавания входящего потока

import  java.util.*;

public class ScanClass {
    private static String strIn="";

    public static void setStrIn (String str){

        strIn+=str;
    }

    public static String getStrIn (){
        return strIn;
    }

    public String myScanner(){
        Scanner scr=new Scanner(System.in);
       // scr.useDelimiter("\n");
        if(scr.hasNext() )
            setStrIn(scr.nextLine());
//test        System.out.println("message read! "+getStrIn());

/*  test      while (scr.hasNext()){
            setStrIn(scr.nextLine()+" ");
            System.out.println("message read!"+getStrIn());
            if (scr.nextLine().isEmpty()) break;
        }
*/
        return getStrIn();
    }

}
