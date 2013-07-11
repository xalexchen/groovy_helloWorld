package com.alex.groovy.hello

class HelloGroovy {

	static main(args) {
		println 'Hello Groovy'
		def mylist=[1,3,"hello","6"]
		// using a variable assignment
		mylist.each{item->
		  println item
		}
		// using the it variable
		mylist.each{println it}
	
		mylist.each {println it}
	}

}
