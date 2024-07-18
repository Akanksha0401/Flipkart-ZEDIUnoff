package com.flipkart.app;

import com.flipkart.bean.User;
import com.flipkart.business.GymCustomerInterface;

import java.util.Scanner;

public class GymFlipFitCustomerMenu {
    private GymCustomerInterface gymCustomerService;

    public GymFlipFitCustomerMenu(GymCustomerInterface gymCustomerService) {
        this.gymCustomerService = gymCustomerService;
    }

   

	public void displayMenu(User user, Scanner in) {
        int menuOption = 1;
        do {
            System.out.println("\n\n ------ Customer Menu Options ------ ");
            System.out.println("1. View available gyms");
            System.out.println("2. Book a slot");
            System.out.println("3. Cancel Booking");
            System.out.println("4. View my bookings");
            System.out.println("5. View Profile");
            System.out.println("6. Quit");
            System.out.print("Enter your choice: ");
            menuOption = in.nextInt();
            in.nextLine(); // Consume newline

            switch (menuOption) {
                case 1:
                    // Ensure gymCustomerService is initialized
                    if (gymCustomerService != null) {
                        gymCustomerService.displayAvailableGyms();
                    } else {
                        System.out.println("Gym service is not initialized!");
                    }
                    break;
                case 2:
                    if (gymCustomerService != null) {
                        gymCustomerService.bookSlot();
                    } else {
                        System.out.println("Gym service is not initialized!");
                    }
                    break;
                case 3:
                    if (gymCustomerService != null) {
                        gymCustomerService.cancelBooking();
                    } else {
                        System.out.println("Gym service is not initialized!");
                    }
                    break;
                case 4:
                    if (gymCustomerService != null) {
                        gymCustomerService.displayBookings();
                    } else {
                        System.out.println("Gym service is not initialized!");
                    }
                    break;
                case 5:
                    if (gymCustomerService != null) {
                        gymCustomerService.displayProfile(user);
                    } else {
                        System.out.println("Gym service is not initialized!");
                    }
                    break;
                case 6:
                    System.out.println("You have exited the customer menu");
                    break;
                default:
                    System.out.println("You have selected an invalid option, please try again!!");
                    break;
            }
        } while (menuOption != 6);
    }
}
