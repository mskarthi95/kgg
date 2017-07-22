package com.mycompany.app;
import java.util.ArrayList;
import java.util.List;

public class Exams {

private String name;
private int empId;
private int salary;

public Exams(int id, String name, int sal){
this.empId = id;
this.name = name;
this.salary = sal;
}

public boolean equals(Object obj){
Exams emp = (Exams) obj;
boolean status = false;
if(this.name.equalsIgnoreCase(emp.name)
&& this.empId == emp.empId
&& this.salary == emp.salary){
status = true;
}
return status;
}

public static List<Exams> getEmpList(){
List<Exams> emps = new ArrayList<Exams>();
emps.add(new Exams(1, "Nats", 15000));
emps.add(new Exams(2, "Kalid", 25000));
emps.add(new Exams(3, "Krish", 5000));
return emps;
}

public int hashCode(){
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
}
