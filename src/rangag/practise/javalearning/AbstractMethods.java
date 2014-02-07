package rangag.practise.javalearning;

import java.io.FileNotFoundException;
import java.io.IOException;

public class AbstractMethods
{
	public static void main(String[] args)
	{
		try
		{
			int k = 5 / 0;
		} catch (Exception e)
		{
			System.out.println("dd");
		} finally
		{
			System.out.println("ff");
		}

	}
}

abstract class Vehicle
{
	public String type;

	public abstract void goUpHill();

	public String getType()
	{
		return type;
	}
}

abstract class Car extends Vehicle
{
	public Car(String s)
	{
		// TODO Auto-generated constructor stub
	}
	
	public abstract void goUpHill();

	public void doCarThings() throws IOException
	{

	}
}

class Mini extends Car
{
	int i;
	public Mini(String s)
	{
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void goUpHill()
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void doCarThings() throws FileNotFoundException
	{

	}

}
