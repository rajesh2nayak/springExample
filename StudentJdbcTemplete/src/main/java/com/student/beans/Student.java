package com.student.beans;

/**
 * The Class Student.
 */
public class Student {

	/**
	 * Instantiates a new student.
	 */
	public Student() {
		super();
	}

	/** The id. */
	private Integer id;
	
	/** The name. */
	private String name;
	
	/** The age. */
	private Integer age;

	/**
	 * Instantiates a new student.
	 *
	 * @param name the name
	 * @param age the age
	 */
	public Student(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the age.
	 *
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * Sets the age.
	 *
	 * @param age the new age
	 */
	public void setAge(Integer age) {
		this.age = age;
	}

}
