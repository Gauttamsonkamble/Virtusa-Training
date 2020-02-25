// Java program to rotate a matrix by 90 degrees 
import java.io.*;
import java.util.*; 

class Solution
{ 
       


static int N = 2; 

// Function to rotate the matrix 90 degree clockwise 
static void rotate90Clockwise(int a[][]) 
{ 

	// Traverse each cycle 
	for (int i = 0; i < N / 2; i++) 
	{ 
		for (int j = i; j < N - i - 1; j++) 
		{ 

			// Swap elements of each cycle 
			// in clockwise direction 
			int temp = a[i][j]; 
			a[i][j] = a[N - 1 - j][i]; 
			a[N - 1 - j][i] = a[N - 1 - i][N - 1 - j]; 
			a[N - 1 - i][N - 1 - j] = a[j][N - 1 - i]; 
			a[j][N - 1 - i] = temp; 
		} 
	} 
} 

// Function for print matrix 
static void printMatrix(int arr[][]) 
{ 
	for (int i = 0; i < N; i++) 
	{ 
		for (int j = 0; j < N; j++) 
		System.out.print( arr[i][j] + " "); 
		System.out.println(); 
	} 
} 

// Driver code 

	public static void main (String[] args) 
	{ 
			 Scanner in = new Scanner(System.in);
    // System.out.println("Enter the number of rows and columns of first matrix");
    int m = in.nextInt();
    int n = in.nextInt();
    int c,d;
    int arr[][] = new int[m][n];
 
    // System.out.println("Enter elements of first matrix");
 
    for (c = 0; c < m; c++)
      for (d = 0; d < n; d++)
        arr[c][d] = in.nextInt();

	rotate90Clockwise(arr); 
	printMatrix(arr); 
	} 
} 

// This code has been contributed by inder_verma. 
