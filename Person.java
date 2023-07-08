
package com.mycompany.mavenproject1;

public class Person {
  private long id;
  private String name;
  private String surname;
  private int age;
  private String occupation;

    @Override
    public int hashCode() {
        return (int) (id*System.currentTimeMillis()+name.length()+surname.length()+age+occupation.length());
        
    }

    @Override
    public boolean equals(Object obj) {
        return (Object)((id*System.currentTimeMillis()+name.length()+surname.length()+age+occupation.length())==obj); 
        
    }
    

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
  
  
}
