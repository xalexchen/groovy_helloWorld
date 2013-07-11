package com.alex.groovy.test.listmap

class MapTest {
	public static void main(args){
		Map map = [:]
		def map2 = ["Alex":"Chen", "Age":3]
		println map2["Alex"]
		println map2["Age"]
		map2["Test"] = "Tester"
		map["a"]=4;
		println map2["Test"]
		println map["a"]
		
	  }
}
