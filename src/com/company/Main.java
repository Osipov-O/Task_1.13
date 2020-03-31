package com.company;

public class Main {

    public static void main(String[] args) {
	double a=0;
	double b=10;
	double h=1;
	double x=a;
	double y=0;

	while ( x<=b ){
	    if ( x>2 ) y = x;
	    else if (x<=2) y = -x;
	    x+= h;
	    System.out.println(y);


    }

    }
}
