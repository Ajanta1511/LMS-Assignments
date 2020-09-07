package com.mage1;

class Test2 {
	 public static void main(String [] args){
	 int x= 2;
	 int y= 1;
	 for (int z = 0; z < 5; z++){
	  if (( ++x > 2 ) || (++y > 2)){
	   x++;
	 }}
	 System.out.println(x + "" "" + y); //syntax error, so doesn't compile
	 }
	}