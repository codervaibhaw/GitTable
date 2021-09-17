package gittable;
import java.util.*;
import java.util.Scanner;

public class GitTable {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter value of n");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=0;i<10;i++) {
			System.out.println(n*(i+1));
		}
	}

}
