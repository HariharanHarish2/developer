package day9;

import java.util.ArrayList;

public class CollectionProblems {
	 public static void main(String[] args) {
	        ArrayList<Integer> name = new ArrayList<Integer>();//ArrayList create
	        
	        name.add(10);//add elements
	        name.add(20);
	        name.add(30);
	       
	      
	        System.out.println(name.get(0));//access elements
	        System.out.println(name.get(1));
	        System.out.println(name.get(2));
	      
	        System.out.println("Before Modidification :"+name);
	        
	        //modify elements
	        name.set(1, 50);
	        name.set(2, 80);
	        
	        System.out.println("After Modidification index 2&3:"+name);
	        
	        //remove elements
	        name.remove(Integer.valueOf(10));
	        System.out.println("remove elements:"+name);
	   
	        name.remove(0);
	        System.out.println("remove index :"+name);
	        //array Size
	        System.out.println("Array Size: " + name.size());
	        //Search elements contains(object) have true,otherwise false
	        System.out.println(name.contains(80));
	        System.out.println(name.contains(50));
	        // Search elements indexOf
	        System.out.println(name.indexOf(80));
	        System.out.println(name.indexOf(50));
	        //lastIndexOf
	        
	        System.out.println(name.lastIndexOf(80));
	        //iterate using for-loop
	        for(int i:name) {
	        	System.out.print(i + " ");
	        	
	        }
	        //for-each or Iterator all same space give values
	        for (int j : name) {
	            System.out.println(j);
	        }
	      //clear the list (clear())
	        
	    	name.clear();
	        System.out.println("Before Modidification :"+name);
	        
	        //	Check if empty (isEmpty())
	        System.out.println(name.isEmpty());
	 }
       
	        
	        
	 }

