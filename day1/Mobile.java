package week1.day1;

public class Mobile {
      
	public void makecall(String mobilemodel,float mobileweight) {
	  System.out.println("model=" +mobilemodel);
	  System.out.println("weight=" +mobileweight);
	}
	    public void sendmsg(boolean fullcharged, int mobilecost) {
	    System.out.println("charge=" +fullcharged);
	    System.out.println("cost=" +mobilecost);
	    
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method s
     Mobile r=new Mobile();
    r.makecall("Realme2pro",35.65f);
    r.sendmsg(true, 15000);
    System.out.println("This is my mobile");
    
     
   
      
	}

}
