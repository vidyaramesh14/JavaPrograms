package com.bridgelabz.designpattern;
/*we can create a object of singleton by using reflection method 
to avoid that we use enum,it does not allow lazy initialization
* enum value are instantiated only once in java program.hence enum values are globally accessible
*/
public enum SingleTonEnum {
	INSTANCE;

}
