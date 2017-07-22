package com.mycompany.app;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class BookTest {

Object[] expectedEmps = new Object[3];

@Before
public void initInputs(){
expectedEmps[0] = new Book(1, "Nats","xyz","aaa", 15000);
expectedEmps[1] =new Book(2, "Kalid","abc","bbb", 25000);
expectedEmps[2] = new Book(3, "Krish","mno","ccc", 5000);
}

@Test
public void compareExams(){
/**
* convert List of objects to array of objects
*/


Object[] testOutput = Book.getBookList().toArray();
assertReflectionEquals(expectedEmps, testOutput);
//assertArrayEquals(expectedEmps, testOutput);
}
}


//User user1 = new User(1, "John", "Doe");
//User user2 = new User(1, "John", "Doe");
//ReflectionAssert.assertReflectionEquals(user1, user2);