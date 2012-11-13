import spock.lang.*

class HelloWorldSpock extends spock.lang.Specification {
	def "a Spock data driven test example"() {
	  expect:
		aJavaString.size() == length
		
		where:
		aJavaString | length
		"hello"     | 5
		"everyone"  | 8
		""          | 0
	}
	def "a JUnit-style alternative"() {
		assertEquals(5, "hello".length)
		assertEquals(8, "everyone.length")
		assertEquals(0, "")
	}
}