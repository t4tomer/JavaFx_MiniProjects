package PhoneBook;



public class Person implements Comparable<Person>{

    String name;
    int phone_number;

    public Person()
    {
        System.out.println("empty constructor");
    }

    public Person(String name,int phone_number)
    {
        this.name = name;
        this.phone_number = phone_number;

    }

    public String getName()//method that is used to get brith_year  of student
    {
        return name ;
    }    
    public void setName(String name) // method that is used to set brith_year  of student
    {
        this.name=name;
        
    }
    
    public int getPhone()//method that is used to get id number of student
    {
        return phone_number;
    }    

    public void setPhoneNumber(int phone_number) // method that is used to set id number of student
    {
        this.phone_number=phone_number;        
    }


    @Override
    public String toString()
    {
        return "Name:"+name+",Phone Number:"+phone_number;
    }

	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return 0;
	}



//    @Override //! use this compareTo, inorder to sort the MapTree by  id of students
//    public int compareTo(Person otherPerson) // used to compare id numbers of students
//     {
//        //* explaining in : https://www.baeldung.com/java-comparator-comparable
//        return Integer.compare(getName(),otherPerson.getName());
//    }

/*     @Override //! use this compareTo, inorder to sort the MapTree by birth year of students
    public int compareTo(Student otherStudent) // used to compare birth years of students 
     {
        //* explaining in : https://www.baeldung.com/java-comparator-comparable
        //* onther explaining :https://www.youtube.com/watch?v=HlpWrH3CcoM
        return Integer.compare(getBrithYear(),otherStudent.getBrithYear());
    }
 */



}

