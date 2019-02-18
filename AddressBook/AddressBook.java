package com.bridgelabz.AddressBook;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.fasterxml.jackson.core.JsonGenerationException;

/**
 * @author admin1
 *
 */
public class AddressBook {
	public static Scanner sc1=new Scanner(System.in);
	public static Scanner sc2=new Scanner(System.in);
	List<Person> book_name;
	public AddressBook()
	{
		super();
	}
	public AddressBook(List<Person> name)
	{
		super();
		this.book_name=name;
	}
	public List<Person> getBook_name() {
		return book_name;
	}
	public void setBook_name(List<Person> book_name) {
		this.book_name = book_name;
	}
	@Override
	public String toString() {
		return "AddressBook [book_name=" + book_name + "]";
	}
	
	/**
	 * @param name is Address book name
	 * @return success if Address book create else it return null
	 */
	public static String createAddressBook(String name)
	{
		String path=ConstantValue.PATH+name+ConstantValue.EXTENSION;
		try(BufferedWriter bw=new BufferedWriter(new FileWriter(path,false)))
		{
			return "success";
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
	//show the address book name
	public static String[] showAddressBookName()
	{
		File file=new File(ConstantValue.PATH);
		return file.list();
	}
	//check whether given name present in address book or not
	public static  boolean check(String addressbookname)
	{	File file=new File(ConstantValue.PATH);
		String[] array=file.list();
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==addressbookname)
				return true;
		}
		 return false;
	}
	/**
	 * @param filePath address of the json file that exist to read the contents
	 * @return Array of the AddressBook Object that are in the json file
	 */
	public static  AddressBook[] readAddressBook(String filePath)
	{	File file=new File(filePath);// path to read
		try
		{	
			ObjectMapper mapper=new ObjectMapper();
			if(file.length()>0)
			{
			AddressBook[] book=mapper.readValue(file,AddressBook[].class);
			return book;// returns array of address object
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
	/**
	 * @param filePath address of the json file to write
	 * @param Obj list of Address Object to write to the json file
	 */
	public static void writeToAddressBook(String filePath, List<AddressBook> Obj) 
	{
		ObjectMapper mapper=new ObjectMapper();
		File file=new File(filePath);// path to write
		try {
			mapper.writeValue(file,Obj);// writing address book object to json file
		} catch(JsonGenerationException e) {
			e.printStackTrace();
		} catch(JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * To create a person details 
	 * @return a person object that is created
	 */
	public static Person addAPerson()
	{
		System.out.println("Enter FirstName ");
		String firstName=sc1.next(); // firstName
		System.out.println("Enter LastName");
		String lastName=sc1.next(); // lastName
		System.out.println("Enter Address ");
		String address=sc1.next(); // address
		System.out.println("Enter State ");
		String state=sc1.next(); // state
		System.out.println("Enter City ");
		String city=sc1.next(); // city
		System.out.println("Enter Zip ");
		String zip=sc1.next(); // zip
		System.out.println("Enter Phone Number ");
		String phoneNumber=sc1.next(); // phoneNumber
		Person person = new Person(firstName, lastName, address, state, city, zip, phoneNumber);
		sc1.close();
		return person;// returns person object created

	}

	/**
	 * @param toEditperson holds the person data to edit
	 * @return edited person details
	 */
	public static Person editAPerson(Person toEditperson) {
		Scanner sc2=new Scanner(System.in);
		int choice=0;
		Person editPerson=toEditperson;
		do {

			System.out.println("Enter 1 to edit LastName");
			System.out.println("Enter 2 to edit Address");
			System.out.println("Enter 3 to edit State");
			System.out.println("Enter 4 to edit City");
			System.out.println("Enter 5 to edit Zip");
			System.out.println("Enter 6 to edit Phone Number");
			System.out.println("Enter 7 to exit");

			choice = sc2.nextInt();
			switch (choice) 
			{
			case 1:
				System.out.println("Enter LastName");
				String lastName=sc1.next(); // lastName
				editPerson.setLastname(lastName);// editing lastName
				break;
			case 2:
				System.out.println("Enter Address ");
				String address=sc1.next() ; // address
				editPerson.setAddress(address);// editing address
				break;
			case 3:
				System.out.println("Enter State ");
				String state=sc1.next(); // state
				editPerson.setState(state);// editing state
				break;
			case 4:
				System.out.println("Enter City ");
				String city=sc1.next(); // city
				editPerson.setCity(city);// editing city
				break;
			case 5:
				System.out.println("Enter Zip ");
				String zip=sc1.next(); // zip
				editPerson.setZip(zip);// editing zip
				break;
			case 6:
				System.out.println("Enter Phone Number ");
				String phoneNumber=sc1.next(); // phoneNumber
				editPerson.setPhone_num(phoneNumber);// editing phoneNumber
				break;
			case 7:
				System.out.println("******thankyou********");
				break;
			}
			
			
		}while(choice<7);
		sc2.close();
		return editPerson;
	}

	/**
	 * @param textFileName   holds text file name to write for text file
	 * @param txtFileContent holds the json file contents to write
	 */
	public static void writeToTextFile(String textFileName, String txtFileContent){
		String path="/home/admin1/eclipse-workspace/Java Programs/ResourcesTextFile/"+textFileName+ ".txt";
		try (BufferedWriter bw=new BufferedWriter(new FileWriter(path, true))){
			bw.write(txtFileContent);
			System.out.println("success");
		} catch (IOException e){
			e.printStackTrace();
		}

	}

}