package com.bridgelabz.designpattern;

import java.util.Date;
//step 1 Create Mediator design pattern
class ChatRoom {
   public static void showMessage(User user, String message){
      System.out.println(new Date().toString()+" [" + user.getName() + "] : " + message);
   }
}

//step 2 create user class
class User {
   private String name;

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public User(String name){
      this.name  = name;
   }

   public void sendMessage(String message){
      ChatRoom.showMessage(this,message);
   }
}
//step 3 Use the User object to show communications between them
public class MediatorDesignPattern {
	public static void main(String[] args) {
		User vidya = new User("vidya");
	      User chandu = new User("chandu");

	      vidya.sendMessage("Hi good morning");
	      chandu.sendMessage("Hello! ");

	}

}