package day1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExceptionHandlingConcepts {
	// 1.compile time exception or checked exception
	// 2.run time exception  or  unchecked

	public void CompileTimeException()
	{
		int i ="govind";

	}
	public void RuntimeException()
	{
		List<String> names =new ArrayList<String>();
		names.add("go");
		names.add("raj");
		System.out.println(names.get(2));

	}
	
	public void RuntimeException1()
	{
		try{
			List<String> names = new ArrayList<String>();
			names.add("go");
			names.add("raj");
			System.out.println(names.get(2));
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println("please enter value less than 2");
		}
	}
	public void multipleCatchBlock()
	{
		try{
			List<String> names = null;
			names.add("go");
			names.add("raj");
			System.out.println(names.get(2));
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println("please enter value less than 2");
		}
		catch(NullPointerException e)
		{
			System.out.println("please create object");
		}
	}
	public void superClass()    //realtime not using
	{
		try{
			List<String> names = new ArrayList<String>();
			names.add("go");
			names.add("raj");
			System.out.println(names.get(2));
		}		
		catch(NullPointerException e)
		{
			System.out.println("please create object");
		}
		catch(Exception e)
		{
			System.out.println("im super class all types of exception");
		}
	}
	public void Finally()   
	{
		try{
			List<String> names = new ArrayList<String>();
			names.add("go");
			names.add("raj");
			System.out.println(names.get(2));
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println("please enter value less than 2");
		}
		catch(NullPointerException e)
		{
			System.out.println("please create object");
		}
		catch(Exception e)
		{
			System.out.println("im super class all types of exception");
		}
		finally
		{
			System.out.println("pass or fail im always run");
		}
	}
	public static void main(String[] args) {

		ExceptionHandlingConcepts obj = new ExceptionHandlingConcepts();
		//obj.CompileTimeException();
		//obj.RuntimeException();
		//obj.RuntimeException1();
		//obj.multipleCatchBlock();
		//obj.superClass();
		obj.Finally();
	}
}
