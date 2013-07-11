package com.alex.groovy.hello

class Person {
// In Groovy all fields of a class have by default the access modifier "private" 
// and Groovy provides automatically getter and setter methods for the fields
  String firstName
  String lastName
  int age
  def address
  
  static void main(def args) {
    Person p = new Person()
    // Use the generated access methods
    p.setFirstName("Alex")
    // This will still use the generated access method, it is not a direct access!
    p.lastName = "Chen" 
	p.age  = 24;
    p.address = ("Liftcore");
    println(p.firstName + " " + p.lastName + " "+p.age);
    // Use the generated constructor
    p = new Person(firstName: "Tom", lastName:"Cat");
    println(p.firstName + " " + p.lastName);
  }

}
