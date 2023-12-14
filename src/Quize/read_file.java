package Quize;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;




public class read_file implements Comparable {
	
	private int N_line;
	public read_file()
	{
		System.out.println("empty constructor(read_file class)");
	}
	public read_file(int N_line)
	{
		this.N_line=N_line;
	}
	

	public String New_Line(int N_line) throws FileNotFoundException
	{
	
		int counter=0;
		File file =new File ("C:\\Users\\tomer\\eclipse-workspace\\A18\\bin\\application\\quize.txt");
		Scanner input=new Scanner(file);
		List<String> list = new ArrayList<String>();

		for (int i=0;i<20;i=i+5)
		{
			while (input.hasNext()){
				counter++;
				String st=input.nextLine();					
						if(counter == N_line)
						{
							return st;
						}					
					}
		}
		
		input.close(); 
		return "answer";
	} 
	
	public String New_Question(int i) throws FileNotFoundException
	{
	
		
		int counter=0;
		File file =new File ("C:\\Users\\tomer\\eclipse-workspace\\A18\\bin\\application\\quize.txt");
		Scanner input=new Scanner(file);
//    	System.out.println("value of i :"+i);

			String test="";
			while (input.hasNext()){
				
				counter++;
				String st=input.nextLine();					
						if(counter == i)
						{
							test+=st;
						}					
					}
		
		
		input.close(); 
		return test;
	} 
	
	
	  public static Comparable Cheack_Solution(Comparable a, Comparable b) // cheack solution 
	  {
	        if (a.compareTo(b) > 0)
	        	return "Wrong Answer";
	        else if(b.compareTo(a) > 0)
	        	return "Wrong Answer";
	        else
	            return "Correct Answer";
	    }
	
	
	    public ArrayList<Integer> integerArray() // create ArrayList of integers
	    {
	          ArrayList<Integer> integerArray = new ArrayList<Integer>();
	          for (int i=2; i<=5; i++)
	                integerArray.add(i);
	        return integerArray;
	    }

	    public  ArrayList<Integer> integerArrayRemove(ArrayList<Integer> integerArray,int num1) // remove from list the num1
	    {
	        integerArray.remove(integerArray.indexOf(num1));    
	            return integerArray;                                         
	    }
	

	
    public int[] Random_Line_Numbers() // method that is used to get a random array with the numbers 2 to 5 
    {
	
	read_file r1=new read_file();
    Random r = new Random();
    ArrayList<Integer> integerArray = new ArrayList<Integer>();
    for (int i=2; i<=3; i++)
        integerArray.add(i); // WHY DO I NEED THIS FOR LOOP	
    
    ArrayList<Integer> ArrayList11 = r1.integerArray();
    
//    System.out.println("\n ArrayList11:"+ArrayList11);// print ArrayList of Integers
    int num12=ArrayList11.get(r.nextInt(integerArray.size())); // random number from array list
//    System.out.println("num12:"+num12);       
    ArrayList<Integer> ArrayList12 = r1.integerArrayRemove(ArrayList11,num12);
//    System.out.println("ArrayList12:"+ArrayList12);  
    
    int num13=ArrayList12.get(r.nextInt(integerArray.size())); // random number from array list
//    System.out.println("num13:"+num13);
    ArrayList<Integer> ArrayList13 = r1.integerArrayRemove(ArrayList11,num13);
//    System.out.println("ArrayList13:"+ArrayList13);
    
    int randnum1=(int)Math.round(Math.random());
    
//    System.out.println("randnum1:"+randnum1);

    int num14=ArrayList13.get(randnum1); // random number from array list

//    System.out.println("num14:"+num14);

     int num15=ArrayList13.get(1-randnum1); // random number from array list
     
//    System.out.println("num15:"+num15);
    
    int[] arr={num12,num13,num14,num15};  //initializing array  

    return arr;
    }

	
	
	
	

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
