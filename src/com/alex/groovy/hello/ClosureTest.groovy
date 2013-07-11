package com.alex.groovy.hello

// A closure is defined via {para1, para2 -> code of the closure}.
// The values before the -> sign define the parameters of the closure.
// For the case that only one parameter is used you can use the implicit defined variable it.
public class ClosureTest{
  public static void main(args){
    List<Integer> list = [5,6,7,8]
    list.each({line -> println line})
	// The groovy collections have several methods which accept a closure as parameter, for example the each method.
    list.each({println it})
  }
}
