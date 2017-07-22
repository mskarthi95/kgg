# Mapinterface 
** A map contains values on the basis of key i.e. key and value pair. Each key and value pair is known as an entry. Map contains only unique keys.

Map is useful if you have to search, update or delete elements on the basis of key.**

# Useful methods of Map interface

1. Object put(Object key, Object value).	
2. void putAll(Map map).	
3. Object remove(Object key).	
4. Object get(Object key).	
5. boolean containsKey(Object key)	.
6. Set keySet().	
7. Set entrySet().
  
  ** Map.Entry Interface

Entry is the sub interface of Map. So we will be accessed it by Map.Entry name. It provides methods to get key and value. **

# Java Map Example: Generic 
```
import java.util.*;  
class MapInterfaceExample{  
 public static void main(String args[]){  
  Map<Integer,String> map=new HashMap<Integer,String>();  
  map.put(100,"Amit");  
  map.put(101,"Vijay");  
  map.put(102,"Rahul");  
  for(Map.Entry m:map.entrySet()){  
   System.out.println(m.getKey()+" "+m.getValue());  
  }  
 }  
}  



```
# Java HashMap class

Java HashMap class implements the map interface by using a hashtable. It inherits AbstractMap class and implements Map interface.

The important points about Java HashMap class are:

A HashMap contains values based on the key.
It contains only unique elements.
It may have one null key and multiple null values.
It maintains no order.
# Hierarchy of HashMap class
HashMap class extends AbstractMap class and implements Map interface.

# HashMap class declaration
```
public class HashMap<K,V> extends AbstractMap<K,V> implements Map<K,V>, Cloneable, Serializable  

```
# Example
```
import java.util.*;  
class TestCollection13{  
 public static void main(String args[]){  
  HashMap<Integer,String> hm=new HashMap<Integer,String>();  
  hm.put(100,"Amit");  
  hm.put(101,"Vijay");  
  hm.put(102,"Rahul");  
  for(Map.Entry m:hm.entrySet()){  
   System.out.println(m.getKey()+" "+m.getValue());  
  }  
 }  
} 
```

# Java LinkedHashMap class
Java LinkedHashMap class is Hash table and Linked list implementation of the Map interface, with predictable iteration order. It inherits HashMap class and implements the Map interface.

The important points about Java LinkedHashMap class are:

1. A LinkedHashMap contains values based on the key.
2. It contains only unique elements.
3. It may have one null key and multiple null values.
4. It is same as HashMap instead maintains insertion order.

# LinkedHashMap class declaration
``` 
public class LinkedHashMap<K,V> extends HashMap<K,V> implements Map<K,V>  

```
Constructor

1. LinkedHashMap()	
2. LinkedHashMap(int capacity)	
3. LinkedHashMap(int capacity, float fillRatio)	
4. LinkedHashMap(Map m)
# Example
```
import java.util.*;  
class TestCollection14{  
 public static void main(String args[]){  
   
  LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();  
  
  hm.put(100,"Amit");  
  hm.put(101,"Vijay");  
  hm.put(102,"Rahul");  
  
for(Map.Entry m:hm.entrySet()){  
   System.out.println(m.getKey()+" "+m.getValue());  
  }  
 }  
}  
```
 # Java TreeMap class

 Java TreeMap class implements the Map interface by using a tree. It provides an efficient means of storing key/value pairs in sorted order.
 The important points about Java TreeMap class are:

1. A TreeMap contains values based on the key. It implements the NavigableMap interface and extends AbstractMap class.
2. It contains only unique elements.
3. It cannot have null key but can have multiple null values.
4. It is same as HashMap instead maintains ascending order.
# TreeMap class declaration
```public class TreeMap<K,V> extends AbstractMap<K,V> implements NavigableMap<K,V>, Cloneable, Serializable  

```
# Constructors of Java TreeMap class
1. TreeMap()	
2. TreeMap(Comparator comp)	
3. TreeMap(Map m)	
4. TreeMap(SortedMap sm)

# Example
```
import java.util.*;  
class TestCollection15{  
 public static void main(String args[]){  
  TreeMap<Integer,String> hm=new TreeMap<Integer,String>();  
  hm.put(100,"Amit");  
  hm.put(102,"Ravi");  
  hm.put(101,"Vijay");  
  hm.put(103,"Rahul");  
  for(Map.Entry m:hm.entrySet()){  
   System.out.println(m.getKey()+" "+m.getValue());  
  }  
 }  
}  
```
# Java Hashtable class
Java Hashtable class implements a hashtable, which maps keys to values. It inherits Dictionary class and implements the Map interface.

The important points about Java Hashtable class are:

1. A Hashtable is an array of list. Each list is known as a bucket. The position of bucket is identified by calling the hashcode() method. A Hashtable contains values based on the key.
2. It contains only unique elements.
3. It may have not have any null key or value.
4. It is synchronized.
# Hashtable class declaration
```
public class Hashtable<K,V> extends Dictionary<K,V> implements Map<K,V>, Cloneable, Serializable
```
# Constructors of Java Hashtable class
1. Hashtable()	
2. Hashtable(int size)	
3. Hashtable(int size, float fillRatio)
 
 ```
 import java.util.*;  
class TestCollection16{  
 public static void main(String args[]){  
  Hashtable<Integer,String> hm=new Hashtable<Integer,String>();  
  
  hm.put(100,"Amit");  
  hm.put(102,"Ravi");  
  hm.put(101,"Vijay");  
  hm.put(103,"Rahul");  
  
  for(Map.Entry m:hm.entrySet()){  
   System.out.println(m.getKey()+" "+m.getValue());  
  }  
 }  
}  
```
![img](https://www.google.co.in/url?sa=i&rct=j&q=&esrc=s&source=images&cd=&cad=rja&uact=8&ved=0ahUKEwiLmt6P_YXVAhWMqY8KHecHCukQjRwIBw&url=http%3A%2F%2Feasyjavase.blogspot.com%2F2016%2F07%2Fmap-interface.html&psig=AFQjCNFQL1mmvywFTErtGoLM2Ke9cGOWQQ&ust=1500025594728390)