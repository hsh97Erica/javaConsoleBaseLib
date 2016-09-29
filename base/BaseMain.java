package base;
import java.util.*;
import java.io.*;
public class BaseMain  {
	private static BaseInput binput = new BaseInput();
	
public static Scanner getScanner(){
	return binput.getScanner();
	
}
public static void print(Object s){
	System.out.print(s);
}
public static void printLine(String s){
	System.out.println(s);
}
public static void printf(String format,Object...objects){
	System.out.printf(format, objects);
}
}
