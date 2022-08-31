package PhoneBook;



//package Maman14_q1;
import java.util.*;
public class AssociationTable<E>    implements Comparable<E>  {
 // public class AssociationTable<key extends Comparable<key>,value> extends TreeMap<key,value>{

 private String name;
 private String phone_number;
 private Person p1;
 
 
 TreeMap<String, Person> map=new TreeMap<>();
 TreeMap<String, String> map2=new TreeMap<>();




 public  AssociationTable()
 {
     System.out.println("empty constructor");
 }

 public  AssociationTable(String name)
 {
     System.out.println("Error-can't enter name without phone number");
 }



 public  AssociationTable( String name,Person p1)
 {

     this.name=name;
     this.p1=p1;
 }
 
 public  AssociationTable( String name,String phone_number)
 {
   	 
     
     if(phone_number=="")
         throw new IllegalArgumentException("phonenumber must be provided");
     this.name=name;
     this.phone_number=phone_number;
    	 	

    	 	
 }



 public void PrintName()
 {
     System.out.println("id of student:"+p1.getName());
 }


 public void add( String name,Person p1) 
 {
     map.put(name,p1);
 }

 public String check_NameIsEmpty(String name) // check if name is empty 
 {
	 if(name.isEmpty())
		 return "Error-Name is not provided";				 
	 return "";
 }
 
 
 public String check_PhoneNumber(String phone_number) // check if phone_number is empty or consists of Invalid characters .
 {
	 if(phone_number.isEmpty())
		 return "Error-No phone number provided ";
	 if(phone_number.matches("[0-9]+")==false)
		 return "Error-Invalid characters ";
	 return "";
 }
 
 public String check_IfNameExist(String name) // check if name exists already in the list. 
 {
	 if(map2.containsKey(name)) 
	 {

	 }
	 else
		 return "Error-Name does not exist in the list  ";
	 return "";
 }
 
 public String get_PhoneNumber_ByName(String name) // return phone_number of name 
 {
	 return "Phone number:"+map2.get(name);
 }
 
 public void addPerson( String name,String phone_number) // add person to the list 
 {
		 map2.put(name,phone_number);
 }

 public String addPerson( String name)
 {
     return "Erorr -can't add person without phonenumber";
 }

 public void keyIterator() // used to print people in the list 
 {
     System.out.println(map);
 }
 


 public String  getPhone(String name) // used to return the person with name of Value 
 {
       return map2.get(name);
 }
 public boolean contains(String key) // Check if the key in the treeMap
 {
       return map2.containsValue(key);

 }
 
 public void deleteList()
 {
	 map2.clear();
 }
 

 public TreeMap<String, String> returnMap() // used to return map
 {
	 return map2; 
 }
 
 
 public static String convertWithIteration(Map<String, ?> map,int counter) { // used to convert map to string , used to enable print the map in text field of the JAVAFX 
	 
	 StringBuilder mapAsString = new StringBuilder("List of people and thier phones : (there are "+counter+" people in your list)\n");
     for (String key : map.keySet()) {
         mapAsString.append("Name:"+key + "		Phone-number:" + map.get(key) + " \n");
     }
     mapAsString.delete(mapAsString.length()-2, mapAsString.length()).append("");
     return mapAsString.toString();
 }
 
 

 public String removeName(String name) //remove key from TreeMap
 {
     if(map2.get(name) == null)
         return "Error-Name does not exist";                 
     map2.remove(name);
     return "true";

 }


 @Override
 public int compareTo(Object o) {
     return 0;
     
 }



}
