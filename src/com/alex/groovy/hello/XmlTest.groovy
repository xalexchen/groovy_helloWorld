package com.alex.groovy.hello

public class XmlTest{
  static void main(args){
	def persons = new XmlParser().parse("test.xml");
    def allRecords = persons.person.size()
    println("Number of person is: $allRecords")
    def person = persons.person[0]
    // name is the name of the XML tag
    println("Name of the person tag is:" + person.name())
    // text gets the text of the node firstname
    println(person.firstname.text())
    
    // Lets print out all important information 
    for (p in persons.person){
      println "${p.firstname.text()}  ${p.lastname.text()}"
    } 
  }
  
} 
