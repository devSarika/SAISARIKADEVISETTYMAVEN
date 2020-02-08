package com.epam.assignment;
import java.util.*;
public class newyeargift {
	public static void main(String args[])
	{
		int tot_weight=0,quant=0,wt=0,tot_box_wt=0;
		int i=0,totsum=0;
		String s[]= {"kajukatli","badhusha","munch","perk"};
		int[] a =new int[4];
	
		char n1;
        sweets collect;
        Boolean n=true;
        Scanner sc=new Scanner(System.in);
        System.out.println("select different sweets which you want to enter in gift box");
        while(n)
        {
        	System.out.println("Available Sweets:");
        	System.out.println("1.Munch");
        	System.out.println("2.Perk");
        	System.out.println("3.Kajukatli");
        	System.out.println("4.Bhadhusha");
        	System.out.println("Select from the above sweets");
        	switch(sc.next().charAt(0))
        	{
        	case '1': System.out.println("Enter the quantity of Munch: ");
        			  quant=sc.nextInt();
        			  System.out.println("Enter the weight in grams: ");
        			  wt=sc.nextInt();
        			  collect= new munch();
        			  totsum=quant*wt;
        			  tot_weight=collect.calwt( quant, wt);
        			  tot_box_wt=tot_box_wt+tot_weight;
        			  System.out.println("Total weight of the box:" + tot_weight);
        			  a[0]+=totsum;
        			  
        			  totsum=0;
        			  System.out.println("Total weight of gift box is:"+ tot_box_wt+"grams");
        			  System.out.println("do you want to add any other item (y/n)");
   	        	      n1=sc.next().charAt(0);
   	        	      if(n1=='y'|| n1=='Y')
   	        	        { 
   	        	    	  n=true;
   	        	          break;
   	        	        }
   	        	     else
   	        		    {
   	        	    	 n=false;
   	                     System.out.println("Total weight of gift box is:"+ tot_box_wt+"grams");
   	                     break;
   	                    }
        	case '2': System.out.println("Enter the quantity of Perk: ");
			  quant=sc.nextInt();
			  System.out.println("Enter the weight in grams: ");
			  wt=sc.nextInt();
			  collect= new munch();
			  totsum=quant*wt;
			  tot_weight=collect.calwt( quant, wt);
			  tot_box_wt=tot_box_wt+tot_weight;
			  System.out.println("Total weight of the box:" + tot_weight);
			  a[1]+=totsum;
			  
			  totsum=0;
			  System.out.println("Total weight of gift box is:"+ tot_box_wt+"grams");
			  System.out.println("do you want to add any other item (y/n)");
     	      n1=sc.next().charAt(0);
     	      if(n1=='y'|| n1=='Y')
     	        { 
     	    	  n=true;
     	          break;
     	        }
     	     else
     		    {
     	    	 n=false;
                  System.out.println("Total weight of gift box is:"+ tot_box_wt+"grams");
                  break;
                 }
        	case '3': System.out.println("Enter the quantity of Kajukatli: ");
			  quant=sc.nextInt();
			  System.out.println("Enter the weight in grams: ");
			  wt=sc.nextInt();
			  collect= new munch();
			  totsum=quant*wt;
			  tot_weight=collect.calwt( quant, wt);
			  tot_box_wt=tot_box_wt+tot_weight;
			  System.out.println("Total weight of the box:" + tot_weight);
			  a[2]+=totsum;
			  
			  totsum=0;
			  System.out.println("Total weight of gift box is:"+ tot_box_wt+"grams");
			  System.out.println("do you want to add any other item (y/n)");
   	      n1=sc.next().charAt(0);
   	      if(n1=='y'|| n1=='Y')
   	        { 
   	    	  n=true;
   	          break;
   	        }
   	     else
   		    {
   	    	 n=false;
                System.out.println("Total weight of gift box is:"+ tot_box_wt+"grams");
                break;
               }
        	case '4': System.out.println("Enter the quantity of Bhadhusha: ");
			  quant=sc.nextInt();
			  System.out.println("Enter the weight in grams: ");
			  wt=sc.nextInt();
			  collect= new munch();
			  totsum=quant*wt;
			  tot_weight=collect.calwt( quant, wt);
			  tot_box_wt=tot_box_wt+tot_weight;
			  System.out.println("Total weight of the box:" + tot_weight);
			  a[3]+=totsum;
			  
			  totsum=0;
			  System.out.println("Total weight of gift box is:"+ tot_box_wt+"grams");
			  System.out.println("do you want to add any other item (y/n)");
   	      n1=sc.next().charAt(0);
   	      if(n1=='y'|| n1=='Y')
   	        { 
   	    	  n=true;
   	          break;
   	        }
   	     else
   		    {
   	    	 n=false;
                System.out.println("Total weight of gift box is:"+ tot_box_wt+"grams");
                break;
               }
        	
        }
       
	}
        System.out.println("Enter the range in which you need to have total weights of the sweets");
        int w=sc.nextInt();
        int k=sc.nextInt();
        
        for( i=0;i<=3;i++)
        {
        	if(a[i]<=k && a[i]>=w)
        	{
        		System.out.println(s[i]+" :" + a[i]+"\n");
        	}
        }
        sc.close();
	}
}
