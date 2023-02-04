import java.io.*;
import java.lang.*;

public class Throw1{

	public static void validate(int age){

		if(age<18){

			throw new ArithmeticException("Vaaipu illa Raja!");
		}else{
			System.out.println("Nee Kalaku Sithappu!");
			}
		}

	public static void main(String args[]){
		
		Throw1 obj=new Throw1();
		obj.validate(20);
		System.out.println("Varrata!");
	}
     }