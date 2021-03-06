package model;

import java.time.LocalDate;

public class Passport {

	private String passport_number;
	private String father_name;
	private String mother_name;
	private String place_of_birth;
	private LocalDate date_of_birth;
	private LocalDate issue_date, expiry_date;
	private String type;
	private String issuing_state_code;
	private String profession;
	private int passenger_id;
	private String nationality;
	private String gender;
	

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(LocalDate date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	

	public Passport() {

	}

	public Passport(int passenger_id, String passport_number, String father_name, String mother_name, String place_of_birth,
			String gender, String nationality, LocalDate date_of_birth, String profession, LocalDate issue_date, LocalDate expiry_date, String type, String issuing_state_code) {
		super();
		this.passenger_id = passenger_id;
		this.passport_number = passport_number;
		this.father_name = father_name;
		this.mother_name = mother_name;
		this.place_of_birth = place_of_birth;
		this.issue_date = issue_date;
		this.expiry_date = expiry_date;
		this.type = type;
		this.issuing_state_code = issuing_state_code;
		this.profession = profession;
		this.gender = gender;
		this.nationality = nationality;
		this.date_of_birth = date_of_birth;
	}

	public int getPassenger_id() {
		return passenger_id;
	}

	public void setPassenger_id(int passenger_id) {
		this.passenger_id = passenger_id;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getPassport_number() {
		return passport_number;
	}

	public void setPassport_number(String passport_number) {
		this.passport_number = passport_number;
	}

	public String getFather_name() {
		return father_name;
	}

	public void setFather_name(String father_name) {
		this.father_name = father_name;
	}

	public String getMother_name() {
		return mother_name;
	}

	public void setMother_name(String mother_name) {
		this.mother_name = mother_name;
	}

	public String getPlace_of_birth() {
		return place_of_birth;
	}

	public void setPlace_of_birth(String place_of_birth) {
		this.place_of_birth = place_of_birth;
	}

	public LocalDate getIssue_date() {
		return issue_date;
	}

	public void setIssue_date(LocalDate issue_date) {
		this.issue_date = issue_date;
	}

	public LocalDate getExpiry_date() {
		return expiry_date;
	}

	public void setExpiry_date(LocalDate expiry_date) {
		this.expiry_date = expiry_date;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getIssuing_state_code() {
		return issuing_state_code;
	}

	public void setIssuing_state_code(String issuing_state_code) {
		this.issuing_state_code = issuing_state_code;
	}

}
