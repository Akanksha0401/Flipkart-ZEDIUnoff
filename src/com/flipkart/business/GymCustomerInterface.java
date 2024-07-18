package com.flipkart.business;

import com.flipkart.bean.User;

import java.util.Scanner;

public interface GymCustomerInterface {
    void displayAvailableGyms();
    void bookSlot();
    void cancelBooking();
    void displayBookings();
    void displayProfile(User user);
}
