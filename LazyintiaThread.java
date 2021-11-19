
class Counter{
  int count ;
  public synchronized void increament()
//  using synchronized keyword
  {  
	  count ++;
  }
}     
                                                                                                                                                                                                                                                                                                                                                                    
public class LazyintiaThread {

	
	public static void main(String[] args) throws Exception
	{				
		
	    Counter x = new Counter();
			
		Thread t1 = new Thread (new Runnable(){
	    	   public void run(){
	    		   for (int i = 1 ; i<=1000;i++)
	    		   {
	    			   x.increament();
	    		   }
	    	   }
	       });
		Thread t2 = new Thread (new Runnable(){
		    	   public void run()
		    	   {
		    		   for (int i = 1 ; i<=1000;i++)
		    		   {
		    			   x.increament();
		    		   }
		    	   }
		       });
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
	}

}
