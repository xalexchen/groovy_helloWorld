
class LoopTest {

	public static void main(args){
      5.times {println "Times + $it "}
      1.upto(3) {println "Up + $it "}
      4.downto(1) {println "Down - $it "}
      def sum = 0
      1.upto(100) {sum += 1}
      println "sum = " + sum
	  // additional datatype
      (1..6).each {println "Range $it"}
  }

}
