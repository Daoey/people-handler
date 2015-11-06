import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * This class holds the person data and provides setter and getter methods
 *
 * 
 * @version 1.1
 */
public class PersonBean {
	
	private StringProperty name = new SimpleStringProperty();
	private StringProperty firstName = new SimpleStringProperty() ;
	private StringProperty lastName = new SimpleStringProperty() ;
	private StringProperty email = new SimpleStringProperty() ;
	private StringProperty gender = new SimpleStringProperty() ;
	private IntegerProperty age = new SimpleIntegerProperty() ;
	
	/**
	 * Default constructor for PersonBean. Use in combination with the setter methods to create a new person.
	 */
	public PersonBean () {
		;
	}
	
	/**Creates a new person and initializes all the fields of this person.
	 * 		
	 * @param firstName		First name of the person
	 * @param lastName		Last name of the person
	 * @param email			Email address of person
	 * @param gender		Gender of person
	 * @param age			Age of person
	 */
	public PersonBean(String firstName,String lastName, String email, String gender, Integer age) {
		setFirstName(firstName);
		setLastName(lastName);
		setEmail(email);
		setGender(gender);
		setAge(age);
		setName(firstName, lastName);
	}
	
	/**
	 * 
	 * @return 	The String property of the first name
	 */
	public final StringProperty firstNameProperty() {
        return this.firstName;
    }
	
	/**
	 *  
	 * @return	First name as String
	 */
    public final String getFirstName() {
        return this.firstNameProperty().get();
    }
    
    /**
     * 
     * @param name	First name of person
     */
    public final void setFirstName(final String name) {
        this.firstNameProperty().set(name);
    }
    
    /**    
     * 
	 * @return 	The String property of the name
     */
    public final StringProperty nameProperty(){
    	return this.name;
    }
    
	/**
	 * 
	 * @return	Name as String
	 */
    public final String getName(){
    	String name = nameProperty().get();
    	name = name.replace(' ', ',');
    	//This check ensures that a person is properly saved with two names
    	if(!name.contains(","))
    		name = name+",";
    	return name;
    }
    
    /**
     * 
     * @param firstName		First name of person
     * @param lastName		Last name of person
     */
    public final void setName(final String firstName, final String lastName){
    	this.nameProperty().set(firstName + " " + lastName);
    }
    
    /**
     * 
     * @param name			Complete name of person
     */
    public final void setName(final String name){
    	this.nameProperty().set(name);
    }
	
    /**
     * 
     * @return	The String property of the last name
     */
	public final StringProperty lastNameProperty() {
        return this.lastName;
    }

	/**
	 * 
	 * @return	Last name as a String
	 */
    public final String getLastName() {
        return this.lastNameProperty().get();
    }
    
    /**
     * 
     * @param name	Last name of person
     */
    public final void setLastName(final String name) {
        this.lastNameProperty().set(name);
    }
	
    /**
     * 
     * @return The String property of the email
     */
	public final StringProperty emailProperty() {
        return this.email;
    }
	
	/**
	 * 
	 * @return	Email as a String
	 */
    public final String getEmail() {
        return this.emailProperty().get();
    }
    
    /**
     * 
     * @param email	Email of person
     */
    public final void setEmail(final String email) {
        this.emailProperty().set(email);
    }
	
    /**
     * 
     * @return 	The String property of the gender
     */
    public final StringProperty genderProperty() {
        return this.gender;
    }
    
    /**
     * 
     * @return 	The gender as a String
     */
    public final String getGender() {
        return this.genderProperty().get();
    }

    /**
     * 
     * @param gender	Gender of person
     */
    public final void setGender(final String gender) {
		this.genderProperty().set(gender);
    }
	
    /**
     * 
     * @return 	The String property of the age
     */
	public final IntegerProperty ageProperty() {
        return this.age;
    }
	
	/**
	 * 
	 * @return	The age as a String
	 */
    public final Integer getAge() {
        return this.ageProperty().get();
    }

    /**
     * 
     * @param age	Age of person
     */
    public final void setAge(final Integer age) {
    	this.ageProperty().set(age);
    }

 }