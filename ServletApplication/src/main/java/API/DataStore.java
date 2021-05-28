package API;


import java.util.HashMap;
import java.util.Map;

/**
 * Example DataStore class that provides access to user data.
 * Pretend this class accesses a database.
 */
public class DataStore {

	//Map of names to Person instances.
	private Map<String, Person> personMap = new HashMap<>();
	
	//this class is a singleton and should not be instantiated directly!
	private static DataStore instance = new DataStore();
	public static DataStore getInstance(){
		return instance;
	}

	//private constructor so people know to use the getInstance() function instead
	private DataStore(){
		//dummy data 
		Address a1 = new Address ("Home", "Dubai", "UAE", "chizzy");
		Address a2 = new Address ("Office", "Abu Dhabi", "UAE", "fizzy");
		Address a3 = new Address ("Home", "Ras-Khaima", "UAE", "dizzy");
		Address[] chimaaddresses = new Address[2];
		chimaaddresses [0] = a1;
		chimaaddresses [1] = a2;

		personMap.put("chima", new Person("chima", "Felix", "050301887", "chimafelix@gmail.com", chimaaddresses , "chima is dope", 1999 ));
		//personMap.put("Kevin", new Person("Kevin", "Obike", "050502233", "kelvinobike@gmail.com", "Abu Dhabi, Abu Dhabi, Cornishe", "kelvin is a genius", 2000));
		//personMap.put("Stanley", new Person("Stanley", "fizzy", "050300112", "stanleyfizzy@gmail.com", "Dubai, Dubai, Discovery Gardens", "stanley is cool", 2001));
	}

	public Person getPerson(String name) {
		return personMap.get(name);
	}


	public void putPerson(Person person) {
		personMap.put(person.getFirstname(), person);
	}

	
}
