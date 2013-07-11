package com.alex.groovy.test.listmap

class ListMapTest {
	public static void main(args){
		List<Integer> list = [1,2,3,4]
		println list[0]
		println list[1]
		println list[2]
		List<Employer> employer = list[]
		Employer p = new Employer(name:"Alex", age:24)
		employer[0] = p
		println employer.size()
		println employer[0].name
		println employer.get(0).age
	  }
}
