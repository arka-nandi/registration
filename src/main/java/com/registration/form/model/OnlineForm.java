package com.registration.form.model;

import java.sql.Date;
import java.util.Arrays;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.SequenceGenerator;

@Entity
public class OnlineForm {
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="seq_post")
	@SequenceGenerator(name="seq_post",initialValue = 10,  allocationSize=5)
    private Integer id;
	private String name;
	private String email;
	private String phone;
	private String dob;
	private String gender;
	private String subject;
	private String  material;

	@ElementCollection
	@CollectionTable(name="ADDRESS",joinColumns= @JoinColumn(name="ID"))
	private List<Address>address;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String[] material) {
		this.material =Arrays.toString( material);
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "OnlineForm [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", dob=" + dob
				+ ", gender=" + gender + ", subject=" + subject + ", material=" + material + ", address=" + address
				+ "]";
	}

	
	
	
	
	
	
	
}
