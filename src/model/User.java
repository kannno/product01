package model;

import java.io.Serializable;



public class User implements Serializable {
  
  private String id;
  private String name;
  private String pass;

  
  
public User(){}
 
  public User(String name,String id,String pass);
  
  this.name = name;
  this.id = id;
  this.pass = pass;
}


public String getId() { return id; }
public String getpass() { return pass; }
public String getname() {return name; }