package testingprojectpackage;

public class FirstTesting {
	
	public static void main(String[] args) {
		
	      byte varbyte = 111;
	      short varshort = 10000;
	      int varinteger = 50;
	      long varlong = 500;
	      float varfloat = 25/10;
	      double vardouble = 256002364;
	     
	      char vchar = 'a';
	      boolean varbol = false;
	     
	      System.out.print("Hello \n I am \r \"Here\" where are \t you ");
	     
	  //--------------  Type casting -- > widing (automatically conversion) and narrow/ explicit conversion
	   //byte --> short --> int --> long --> float --> double
	  // double --> float --> long --> int --> short --> byte
	     
//	    byte b =  (byte) varshort;
//	    System.out.println(b);
//	   
//	    double d = varbyte;
//	   byte bb = (byte) vardouble;
//	   
//	    System.out.println("\n" + bb);
	  byte b = 10;
	  short s = 10;
	  int i = 5;
	  float f = 2.6f;
	  double d = 35.36;
	  byte bb= 10;
	 
	  // double  result  =(b*s) + (f/d) - (i*s);
	  //System.out.println(result);
	   	  
	   int ss =  (s) + (s);
	   int x = i + i ;
	   float ff = i + f;
	  
	   int z = 10;
	   int y = 10;
	   int n = -10;
	   System.out.println(~n);
	   System.out.println(~z);
	   //System.out.println(z++  +  ++z);
	  // System.out.println(y++ + y++);
	   
			  
	   System.out.println(--z);
	   System.out.println(z);
	  
	   
	   int year = 2022;
	   double a = year%4;
	   boolean isleapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 ==0);
	   
	   System.out.println("Leap year info: " + isleapYear);
	}
	

}
