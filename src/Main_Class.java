import java.util.Scanner;

public class Main_Class {

           	public static void main(String[] args) {


                          	
                    Scanner sc = new Scanner(System.in);
           	
                    System.out.println("Enter number to be converted to words: ");
                          	
                    int num=sc.nextInt();
                    
                    //object of a class that convert a number to words and return a string
                    //calling a static method fig_to_words by using the class name
           	    	String result=Fig_to_words.fig_to_words(num);
           	    	System.out.println(result);
                          	
                          	
                    //Calling a java class to read n numbers from key board and display all the numbers, sort the number, and do search.
           	    	KeyRead_Line2 Obj1 = new KeyRead_Line2();
           	    	Obj1.read();
           	    	Obj1.display();
           	    	Obj1.sort();
           	    	// display after sorting
           	    	Obj1.display();
           	    	//function to search a number
           	    	Obj1.find();
                    
                          	
                          	
                    // calling java class to read n numbers from command line argument for displaying sum, avg, biggest and smallest number
                          	int length = Obj1.arr.length;
                          	
                          	Command_Line1 obj2 = new Command_Line1();
                          	int[] Numbers = new int[length];
                          	for(int i=0; i<length; i++) {
                                         	Numbers[i] = Obj1.arr[i];
                          	}
                          	
                          	obj2.calData(Numbers);
                          	obj2.displayData();
                          	
           	}


}
