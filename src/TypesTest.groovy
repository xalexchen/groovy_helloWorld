
class TypesTest {
// All variables in Groovy are reference variables (objects), 
// Groovy does not use primitive variables. Groovy still allows to use the primitives 
// types as a short form but always translates this into the object.
	
	
  public static void main(args){
    int i = 1 // Short form for Integer i = new Integer(1)
    int j = i +3 
    int k = i.plus(3); // Same as above
    // Make sure this worked
    assert(k==4);
    println i.getClass().getName()
    println j.getClass().getName()
    println k.getClass().getName()
    
    // Automatic type assignement
	// Groovy allow static and dynamic typed variables.
	// If you want to use dynamic typed variables you can use the keyword def.
    def value = 1.0F
    println value.getClass().getName()
    def value2 = 1;
    println value2.getClass().getName()
    value2 = value2 / 2;
    println value2
    println value2.getClass().getName()
  } 

}
