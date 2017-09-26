/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant_management_system;

/**
 *
 * @author Ashwith
 */
public class DoorBoy extends Restaurant_Management_System  {
    char wish;
    void greeting()
    {
        if (wish=='Y')
        System.out.println(".................................WELCOME................................");
        System.out.println("...............Customer Enters In To Restaurant...........................");
    }
    
}
