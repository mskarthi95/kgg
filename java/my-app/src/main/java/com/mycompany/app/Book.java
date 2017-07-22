package com.mycompany.app;
import java.util.ArrayList;
import java.util.List;


class Book {
public int id;
public String name, author, publiser;
public int quantity;
public Book(int id, String name,String author,String publiser,int quantity){
this.id = id;
this.name = name;
this.author=author;
this.publiser=publiser;
this.quantity =quantity;
}
public boolean equals(Object obj){
Book emp = (Book) obj;
boolean status = false;
if(this.name.equalsIgnoreCase(emp.name)
&& this.id == emp.id &&
this.author==emp.author&&
this.publiser==emp.publiser
&& this.quantity == emp.quantity){
status = true;
}
return status;
}
public static List<Book> getBookList(){
List<Book> emps = new ArrayList<Book>();
emps.add(new Book(1, "Nats","xyz","aaa", 15000));
emps.add(new Book(2, "Kalid","abc","bbb", 25000));
emps.add(new Book(3, "Krish","mno","ccc", 5000));
return emps;
}

/*public int hashCode(){
return this.empId;
}

public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public int getEmpId() {
return empId;
}
public void setEmpId(int empId) {
this.empId = empId;
}
public int getSalary() {
return salary;
}
public void setSalary(int salary) {
this.salary = salary;
}
}*/
// Constructor 
// Getter and Setter
// Methods
 //ReflectionAssert.assertReflectionEquals(user1, user2);
@Override
public String toString() {
return "id : " + id + ", name : " + name + ", author : " + author + ", publiser : " + publiser + ", quantity : "
+ quantity;
}
}