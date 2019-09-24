package com.kiran.spring.model;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;

@SuppressWarnings("deprecation")
@Entity
public class User {
	@Id
    private Long id;

    @NotEmpty(message = "Username is required.")
    private String username;

    @NotEmpty(message = "Email is required.")
    private String email;
    
    private String password;

    private Calendar created = Calendar.getInstance();

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Calendar getCreated() {
        return this.created;
    }

    public void setCreated(Calendar created) {
        this.created = created;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
