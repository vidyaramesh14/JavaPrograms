package com.bridgelabz.AddressBook;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.codehaus.jackson.map.ObjectMapper;

public class AddressBookManager {
	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);//for integer 
		Scanner sc2=new Scanner(System.in);//for String
		String addressBookName = "";
		String[] listOfFiles;
		List<Person> listToAddPerson=null;
		String existAddName = "";
		String filePath = "";
		Person personObj = new Person();
		int choice = 0;
		do {
			System.out.println("Enter 1 to Create a AddressBook");
			System.out.println("Enter 2 to show a Address Book");
			System.out.println("Enter 3 to Save a Address Book");
			System.out.println("Enter 4 to SaveAs  Address Book");
			System.out.println("Enter 5 to exit");
			choice=sc1.nextInt();//User input to switch choices
			switch (choice){
			case 1://Create address book
				System.out.println("Enter the AddressBook Name");
				addressBookName=sc2.next();
				System.out.println(AddressBook.createAddressBook(addressBookName));// creating the address book json
			case 2://show address book
					int num;
					do
					{
					System.out.println("Enter 1 to Add a Person");
					System.out.println("Enter 2 to Edit a Person");
					System.out.println("Enter 3 to Delete a Person");
					System.out.println("Enter 4 Sort by LastName");
					System.out.println("Enter 5 Sort by Zip");
					System.out.println("Enter 6 to Print");
					System.out.println("Enter 7 to exit");
					num=sc1.nextInt();
					switch(num){
					case 1://To Add a Person
						listOfFiles=AddressBook.showAddressBookName();
						
						// printing all the address book json
						if (listOfFiles.length > 0){
							System.out.println("Files that are exist");
							for (int i=0;i<listOfFiles.length;i++){
								System.out.println(listOfFiles[i]);
							}
							System.out.println("Enter the Address book file name that exist");
							existAddName=sc2.next();
							filePath=ConstantValue.PATH+existAddName+ConstantValue.EXTENSION;//path of the json file
							ObjectMapper mapper=new ObjectMapper();
							File file=new File(filePath);
							listToAddPerson=new ArrayList<>();
							List<AddressBook> newListOfAdd=new ArrayList<>();
							AddressBook newaddressBookObj=new AddressBook();
							
							
							if (AddressBook.check(existAddName+ConstantValue.EXTENSION)) {
								AddressBook[] addressBookObj=AddressBook.readAddressBook(filePath);
								if (addressBookObj!=null){
									if (addressBookObj.length>0) {
										List<AddressBook> listOfAddObj=new ArrayList<>(Arrays.asList(addressBookObj));
										for (AddressBook b:listOfAddObj) {
											listToAddPerson=b.getBook_name();
											personObj=AddressBook.addAPerson();
											listToAddPerson.add(personObj);
										}
										AddressBook.writeToAddressBook(filePath,listOfAddObj);
										System.out.println("Person is added to the addressBook");
									}
								} else{
									personObj=AddressBook.addAPerson();
									List<Person> listOfPersonObj=new ArrayList<>();
									listOfPersonObj.add(personObj);
									newaddressBookObj.setBook_name(listOfPersonObj);
									newListOfAdd.add(newaddressBookObj);
									// AddressBook.writeToAddressBook(Constants.PATH+existAddName+Constants.EXTENSION,
									// listOfPersonObj);
									try {
										mapper.writeValue(file,newListOfAdd);
									} catch (IOException e){
										e.printStackTrace();
									}
									System.out.println("Person is added to the addressBook");
								}
							} else {
								System.out.println("Enter the Existing Address Book Name or create new AddressBook ");
							}
						}
						else {
							System.out.println(" There is no AddressBook that Exist.....create a new addressBook");
						}

						break;
						/****************************************************************************/
					case 2:
						//This case For Edit a Person
						listOfFiles=AddressBook.showAddressBookName();
						System.out.println("Files that are exist");
						listToAddPerson=new ArrayList<>();

						// printing list of addressBook
						for (int i=0;i<listOfFiles.length;i++) {
							System.out.println(listOfFiles[i]);
						}
						System.out.println("Enter the Address book file name that exist");
						existAddName=sc2.next();
						Person personObjs=new Person();
						filePath=ConstantValue.PATH+existAddName+ConstantValue.EXTENSION;
						if (AddressBook.check(existAddName+ConstantValue.EXTENSION)) {
							AddressBook[] addressBookObj=AddressBook.readAddressBook(filePath);
							if (addressBookObj!=null) {
								if (addressBookObj.length>0) {
									// Printing list of persons
									List<AddressBook> listOfAddObj=new ArrayList<>(Arrays.asList(addressBookObj));
									System.out.println("Printing the Person details that are exist......");
									for (AddressBook book:listOfAddObj) {
										listToAddPerson=book.getBook_name();
									}
									for (Person p:listToAddPerson) {
										System.out.println(p);
									}
									System.out.println("Enter which  Person firstName to edit");
									String firstName=sc2.next();
									System.out.println("Enter which Person LastName to edit");
									String lastName=sc2.next();
									if ((listToAddPerson.stream().filter(i->i.getFirstname().equals(firstName))
											.findFirst().isPresent())
											&& (listToAddPerson.stream().filter(i->i.getFirstname().equals(lastName))
													.findFirst().isPresent())){
										personObjs = listToAddPerson.stream()
												.filter(i -> i.getFirstname().equals(firstName)).findFirst().get();
										Person p2 = listToAddPerson.stream()
												.filter(i -> i.getFirstname().equals(lastName)).findFirst().get();
										if (personObjs==p2){
											personObjs=AddressBook.editAPerson(personObjs);
											System.out.println("Updated person details" + personObjs);
											AddressBook.writeToAddressBook(filePath, listOfAddObj);
										
										System.out.println("Listing the number of person details");
										for (AddressBook book : listOfAddObj) {
											listToAddPerson=book.getBook_name();
										}
										for (Person p:listToAddPerson) {
											System.out.println(p);
										}
										}
										 else {
												System.out.println("Enter the Correct firstName and lastName");
									}
									}
								}
							} else {
								System.out.println("AddressBook is Empty...!add Person details");
							}
						} else {
							System.out.println(" There is no AddressBook that Exist.....create a new addressBook");
						}
						break;
					
					// **************************************************************************************************************
					case 3:
							listOfFiles=AddressBook.showAddressBookName();
							System.out.println("file that are exist");
							// printing list of addressBook
							for (int i=0;i<listOfFiles.length;i++) {
								System.out.println(listOfFiles[i]);
							}
							System.out.println("enter address book name that are exist");
							existAddName=sc2.next();
							if(AddressBook.check(existAddName))
							{
								if(listOfFiles!=null){
									List a=new ArrayList<>();
								}
							}
								
					
					}
								
					}while(num<7);
								
							
						
						
					
			}			
				
					
			}while(choice<7);
		}
	}

		