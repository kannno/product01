package beans;

import java.io.Serializable;



public class User implements Serializable {
	private String password;
	private String userName;
	private String email;
	private String birthday;
	private String gender;

	public User(){}

	public User(String password, String userName, String email, String birthday, String gender){
		this.password = password;
		this.userName = userName;
		this.email = email;
		this.birthday = birthday;
		this.gender = gender;

	}


	/**
	 * 取得メソッド
	 * @author YU UEMATSU
	 * @return password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * 格納メソッド
	 * @author YU UEMATSU
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * 取得メソッド
	 * @author YU UEMATSU
	 * @return userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * 格納メソッド
	 * @author YU UEMATSU
	 * @param userName
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * 取得メソッド
	 * @author YU UEMATSU
	 * @return email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * 格納メソッド
	 * @author YU UEMATSU
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * 取得メソッド
	 * @author YU UEMATSU
	 * @return birthday
	 */
	public String getBirthday() {
		return birthday;
	}
	/**
	 * 格納メソッド
	 * @author YU UEMATSU
	 * @param birthday
	 */
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	/**
	 * 取得メソッド
	 * @author YU UEMATSU
	 * @return gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * 格納メソッド
	 * @author YU UEMATSU
	 * @param gender
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}



}



