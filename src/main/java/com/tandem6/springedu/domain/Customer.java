package com.tandem6.springedu.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*
 * ORM - DB TABLE - JAVA Object 간 매칭
 * CRUD를 해당 객체를 이용해서 수행하게 됨 -> 단순한 작업 수행시에는 별도의 쿼리가 필요하지 않음.
 * 조회나 DB를 Access할 때는 Repository를 구현해서 수행함.
 * 
 * 여기서는 DB TABLE에 대한 모델링 만을 수행함.  
 *  
 */

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private String firstName;
    private String lastName;
    
    public String getFirstName(){
        return this.firstName;
    }
    
    public String getLastName(){
        return this.lastName;
    }
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    protected Customer() {}

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    
    
    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, firstName='%s', lastName='%s']",
                id, firstName, lastName);
    }

}