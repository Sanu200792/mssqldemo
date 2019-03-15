package com.mssql.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import javax.persistence.Id;

@Entity
@Table(name = "`user`")
public class user {
	  @Id
	  @Column(name="id")
	  private int id;
	  @Column(name="login")
	  private String login;
	  @Column(name="password_hash")
	  private String password_hash;
	  @Column(name="first_name")
	  private String first_name;
	  @Column(name="last_name")
	  private String last_name;
	  @Column(name="email")
	  private String email;
	  @Column(name="activated")
 	  private int activated;
	  @Column(name="lang_key")
      private String lang_key;
	  @Column(name="activation_key")
      private String activation_key;
	  @Column(name="reset_key")
      private String reset_key;
	  @Column(name="created_by")
      private String created_by;
	  @Column(name="created_date")
      private String created_date;
	  @Column(name="reset_date")
      private String reset_date;
	  @Column(name="last_modified_by")
      private String last_modified_by;
	  @Column(name="last_modified_date")
  	  private String last_modified_date;
	  @Column(name="using_2fa")
      private int using_2fa;
	  @Column(name="user_secret_hash")
      private String user_secret_hash;
      
      public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword_hash() {
		return password_hash;
	}
	public void setPassword_hash(String password_hash) {
		this.password_hash = password_hash;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getActivated() {
		return activated;
	}
	public void setActivated(int activated) {
		this.activated = activated;
	}
	public String getLang_key() {
		return lang_key;
	}
	public void setLang_key(String lang_key) {
		this.lang_key = lang_key;
	}
	public String getActivation_key() {
		return activation_key;
	}
	public void setActivation_key(String activation_key) {
		this.activation_key = activation_key;
	}
	public String getReset_key() {
		return reset_key;
	}
	public void setReset_key(String reset_key) {
		this.reset_key = reset_key;
	}
	public String getCreated_by() {
		return created_by;
	}
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}
	public String getCreated_date() {
		return created_date;
	}
	public void setCreated_date(String created_date) {
		this.created_date = created_date;
	}
	public String getReset_date() {
		return reset_date;
	}
	public void setReset_date(String reset_date) {
		this.reset_date = reset_date;
	}
	public String getLast_modified_by() {
		return last_modified_by;
	}
	public void setLast_modified_by(String last_modified_by) {
		this.last_modified_by = last_modified_by;
	}
	public String getLast_modified_date() {
		return last_modified_date;
	}
	public void setLast_modified_date(String last_modified_date) {
		this.last_modified_date = last_modified_date;
	}
	public int getUsing_2fa() {
		return using_2fa;
	}
	public void setUsing_2fa(int using_2fa) {
		this.using_2fa = using_2fa;
	}
	public String getUser_secret_hash() {
		return user_secret_hash;
	}
	public void setUser_secret_hash(String user_secret_hash) {
		this.user_secret_hash = user_secret_hash;
	}

	@Override
	public String toString() {
		return "user [id=" + id + ", login=" + login + ", password_hash=" + password_hash + ", first_name=" + first_name
				+ ", last_name=" + last_name + ", email=" + email + ", activated=" + activated + ", lang_key="
				+ lang_key + ", activation_key=" + activation_key + ", reset_key=" + reset_key + ", created_by="
				+ created_by + ", created_date=" + created_date + ", reset_date=" + reset_date + ", last_modified_by="
				+ last_modified_by + ", last_modified_date=" + last_modified_date + ", using_2fa=" + using_2fa
				+ ", user_secret_hash=" + user_secret_hash + "]";
	}
}
