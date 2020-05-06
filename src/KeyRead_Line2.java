import java.util.Arrays;
import java.util.Scanner;

//java class to read n numbers from key board and display all the numbers, sort the number, and do search.

public class KeyRead_Line2

{

	Scanner sc = new Scanner(System.in);
	int num;
	int arr[];
	int n;

	void read()

	{

		System.out.println("enter the count of numbers to be entered");

		n = sc.nextInt();

		arr = new int[n];

		System.out.println("Enter numers");

		for (int i = 0; i < n; i++)

		{
			arr[i] = sc.nextInt();

		}

	}

	void display()

	{

		System.out.println("display numbers");

		for (int i = 0; i < n; i++)

		{

			System.out.println(arr[i]);

		}

	}

	void sort()

	{
		// using java inbuilt sort method
		Arrays.sort(arr);

	}

	void find()

	{

		System.out.println("Enter the number to be searched");

		int num = sc.nextInt();

		boolean num_found = false;

		for (int i = 0; i < n; i++)

		{

			if (arr[i] == num)

			{

				num_found = true;

			}

		}

		if (num_found == false)

		{

			System.out.println("Number not found");

		}

		else {

			System.out.println("Number is present in the array");

		}

	}

}
