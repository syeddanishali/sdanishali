package com.prac;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;




import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;



public class Test implements Serializable {

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		
//		String finalValue= doubleChar("The");  //to print the in tthhee format
//		System.out.println("finalValue=="+finalValue);
//	int count=	countHi("abc hi ho"); // to count "hi" in a given string
//	System.out.println("count"+count);
//	boolean countSame=	catDog("1cat1cadodog");
//	System.out.println("Animal count="+countSame);
//	int codeCount=	countCode("codexxcode") ;  // count code here it could be coze .cone 
//	System.out.println("codeCount"+codeCount);
//	boolean value=	endOther("ab", "ab12"); // return true if either of the strings appears at the very end of the other string, ignoring upper/lower case
//	System.out.println("value"+value);
//		boolean value=	xyzThere("abc.xyzxyz"); //Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not. 
//		System.out.println("value"+value);
//	String value=	mixString("", "Hello") ; //Given two strings, A and B, create a bigger string made of the first char of A, the first char of B, the second char of A, the second char of B, and so on. Any leftover chars go at the end of the result.
//	System.out.println("value=== "+value);
//		String value=repeatSeparator("Word", "X", 3);//Given two strings, word and a separator, return a big string made of count occurences of the word, separated by the separator string. 
//		System.out.println("value=== "+value);
	//	byte b = 5;
	//	go(b,b);

	/*	 try {
             List<GarbageCollectorMXBean> gcMxBeans = ManagementFactory.getGarbageCollectorMXBeans();

             for (GarbageCollectorMXBean gcMxBean : gcMxBeans) {
                     System.out.println(gcMxBean.getName());
                     System.out.println(gcMxBean.getObjectName());

             }

     } catch (RuntimeException re) {
             throw re;
     } catch (Exception exp) {
             throw new RuntimeException(exp);
     }*/
		
		
	
	//	int value=	fibonacci(12);
	//	int value=	bunnyEars2(2); recursion
	//	int value=	sumDigits(4);//Given a non-negative int n, return the sum of its digits recursively
   //		int value=	count7(17717);
	//	int value= powerN(3, 2);//powerN(3, 2) is 9 (3 squared). 
  // 	System.out.println("value=== "+value);
	List arr = new ArrayList();
	arr.add("sdf");
	arr.add("hfg");
	arr.add("632");	
	arr.add("ADfsd");
	arr.add("Adfsd");
//	Collections.binarySearch(arr,"hfg");
	System.out.println(Collections.binarySearch(arr,"hfg"));

	}
	
	
	private static int powerN(int i, int j) {
		int result;
		if(j==1){
			return result=i;
		}
			
		result= i*powerN(i,j-1);
		
		return result;
	}

	private static int count7(int i) {
		int result = 0;
		if(i/10>0){
			int abc=(i%10);
			if(abc==7)
			result=1;	
		}
		if(i<10 && i>0){
			if(i==7)
				return result=1;	
			else 
				return result;
		}
		
		return result=result+count7(i/10);
			
		}
		

	private static int sumDigits(int n) {
		  int Count=0;

		  if(n/10<10){

		  Count=(n%10)+(n/10);

		  }

		  else{

		  Count=sumDigits(n/10)+sumDigits(n%10);

		  }

		  return Count;
	}

	private static int bunnyEars2(int i) {
		int result;
		
		
			if((i%2)==0){
				result= 3;
		//		System.out.println("for 3 value"+result);
			}
			else{
			result= 2;
		//	System.out.println("for 2 value"+result);
			}
			if(i==0){
	//			System.out.println("for zero"+result);
				return 0;
				
			}
		
		else 
			
		 result=bunnyEars2(i-1)+result;
		//	System.out.println("result"+result);
			return result;
	}

	private void writeObject(ObjectOutputStream out) throws IOException {
out.defaultWriteObject();

}
	
	public static int fibonacci(int i) {
		int result;
		if(i==1 || i==2){
			return 1;
		}
		
		else
			return result=fibonacci(i-1)+fibonacci(i-2);
			
		}
	
private static int factorial(int i) {
	int result;
	if(i==0){
		return 1;
	}	
	else{
		result=factorial(i-1)*i;
	}
		return result;
	}
//	static void go(byte x, byte y) { System.out.println("byte... "); }
//	static void go(int x, int y) { System.out.println("int,int");}
	
	
	private static String repeatSeparator(String string, String string2, int i) {
	String str=null;
		if(i>1){
			for(int j=0;j<i;j++){
				if(j!=0){
				str=str+string2;
				}
				if(j==0){
					str=string;
				}
				if(j!=0){
				str=str+string;
			}
			}
		}
		if(i==1){
			str=string;
		}
		return str;
	}

	private static String mixString(String string, String string2) {
	String str=null;
	for(int i =0;i<string.length();i++){
		int a =string.length();
		int b= string2.length();
		if(i==0 && b>i){
		str=string.substring(i,i+1)+string2.substring(i,i+1);	
		}
		else if(i==0 && b<=i){
			str=string.substring(i,i+1);
		}
		if(i>0 && b>i){
			str=str+string.substring(i,i+1)+string2.substring(i,i+1);
		}
		else if(i>0 && b<=i){
			str=str+string.substring(i,i+1);
		}
		if(i==a-1){
			if(b>a){
				str=str+string2.substring(i+1);
			}
		}
		
	}
	if(string.length()==0){
		str=string2;
	}
		return str;
	}

	private static boolean xyzThere(String string) {
		boolean value=false;
		for(int i=0;i<string.length()-2;i++){
			String substr=string.substring(i, i+3);
			if(substr.equals("xyz")){
		if (i>0 && string.charAt(i-1)!='.' ){
			value=true;
		}
		if(i==0){
			value=true;
		}
		
		}
		}
		return value;
		
	}

	private static boolean endOther(String string, String string2) {
		boolean value=false;
	String	stringNew= string.toLowerCase();
	String string2New= string2.toLowerCase();
	if(stringNew.contains(string2New) || string2New.contains(stringNew)){
		value=true;
	}
	
		return value;
	}

	private static int countCode(String string) {
		int codeCount=0;
		for(int i=0;i<string.length()-3;i++){
			String str=string.substring(i,i+4);
			
			if(str.charAt(0)=='c' && str.charAt(1)=='o'&& str.charAt(3)=='e'){
				++codeCount;
			}
		}
		
		return codeCount;
	}

	private static boolean catDog(String string) {
		boolean countSame;
		int dog=0,cat=0;
		for(int i=0; i<string.length()-2;i++){
			String animal= string.substring(i, i+3);
			if(animal.equals("cat"))
				++cat;
			if(animal.equals("dog"))
				++dog;
			
		}
		if(cat==dog)
		return true;
		else return false;
		
	}

	private static int countHi(String str) {
		int count=0;
		for(int i=0; i<str.length()-1;i++){
			String sbu= str.substring(i, i+2);
		
				if(sbu.equals("hi")){
					++count;
				}
			
		}
		return count;
	}

	private static String doubleChar(String doubleChar) {	
		String test=null;
		for(int i=0;i<doubleChar.length();i++){			
			char c = doubleChar.charAt(i);			
			test=test+c+c;
		}		
return test;		
	}

}
