


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.Test;


public class Week2 {

	// Assignment 1
	// Made sure to add "
	@Test
	public void Writing_Sometext_Backwards() {
		
		StringBuilder str = new StringBuilder("Jag");
		String reversed = str.reverse().toString();
		
		assertEquals("checking reverse",
				"gaJ", reversed);
		
		}
	
	// Assignment 2
	// Made sure to add void
	@Test
	public void JustASimpleAssert() {
	String Name = "My name";
	assertEquals("My name", Name);
	}
	
	
	
	// Assignment 3
	// Made sure to create individual methods
	public class Person {
		String firstname = "first name";
		String lastname = "last name";
		int phonenumber = 0701111111;
		String streetaddress = "my cool street";
	}
	
	Person person = new Person();
	
	@Test
	public void TestingFirstName() {
		assertEquals("first name", person.firstname);
	}
	@Test
	public void TestingLastName() {
		assertEquals("last name", person.lastname);
	}
	@Test
	public void TestingPhoneNumber() {
		assertEquals(0701111111, person.phonenumber);
	}
	@Test
	public void TestingStreetAdress() {
		assertEquals("my cool street", person.streetaddress);
	}
	
	// Assignment 4
	// Result passes when there is not a reason to fail
	@Test
	public void  testingAsSimpleAsPossible() {
	
	 System.out.println("Junit 5");
	
	String str = "Junit 5";
	assertEquals("String length",
			7, str.length());
	}
	
	// Assignment 5
	// Made sure to add @test
	
	@Test
	public void GiveMeASimpleVerification() {
		assertEquals(100, 100);
		}
	
	// Assignment 6
	
	@Test
	public void CheckingSame() {
	String s1 = new String("S1");
	String s2 = s1;
	assertSame(s1, s2);
	}
	
	// Assignment 7 
	@Test
	public void CheckingBytes() {
	byte smallByte1 = 100;
	byte smallByte2 = smallByte1;
	assertTrue(smallByte1 == smallByte2);
	}
	
	// Assignment 9 
	
	@Test
	public void CheckingTrue() {
	Object obj1 = new Object();
	Object obj2 = obj1;
	assertTrue(obj1 == obj2);
	
	}
	
	// Assignment 10
	
	@Test
	public void CheckingFalse() {
	Object obj1 = new Object();
	Object obj2 = new Object();
	assertFalse(obj1 == obj2);
	}
	
}
