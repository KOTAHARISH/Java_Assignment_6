
class Odd extends Thread
{   
	
	public void run()
	{
		for (int i=1 ; i<=100; i++) //logic for odd number
		{
			if ( i%2 !=0)
			{
		        System.out.println("Odd number is "+ i);	
		        try{Thread.sleep(100);}catch(Exception e){}
		    }
		}
	}
}
class Even extends Thread
{   
	
	public void run()
	{
		for (int i=1 ; i<=100; i++)//logic for even number
		{
			if ( i%2 ==0)
			{
		        System.out.println("Even number is " + i);
		        try{Thread.sleep(100);}catch(Exception e){}
		    }
		}
	}
}


public class EvenOddNumber {
     
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Odd object1 = new Odd();
		Even object2 = new Even();
		object1.start();
		try{Thread.sleep(10);}catch(Exception e){}// it stops thread one for some time
		object2.start();

	}

}
