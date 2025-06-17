/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ZY LAPTOP
 */
public class user {
      private  String email;
   private  String password;
   
          public user(String email,String password) {
              this.email=email;
              this.password=password;
          } 
    
          public boolean validate(){
              return this.email.equals("malak@gmail.com")&&
                      this.password.equals("azerty");
          }
}
