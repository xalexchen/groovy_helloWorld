package com.alex.groovy.hello

class StringTesting {
// Strings which are quoted in by "" are so-called GStrings (short for Groovy Strings). 
// In GStrings you can directly use variables which will then be evaluated and included in the text.
  public static void main(String[] args) {
    def name = "Groovy"
    def s1 = "Hello $name" // $name will be replaced
    def s2 = 'Hello $name' // $name will not be replaced
    println s1
    println s2
    println s1.getClass().getName();
    println s2.getClass().getName();
  }

}
