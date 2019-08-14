package com.capgemini.test.dao;

import java.util.HashMap;
import java.util.Map;

import com.capgemini.test.bean.Person;

public interface DaoInterface {
	
	
	void storeIntoMap(Person person);
	Map<Integer,Person> displayPersons();
}
