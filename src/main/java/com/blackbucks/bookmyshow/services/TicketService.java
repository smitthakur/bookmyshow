package com.blackbucks.bookmyshow.services;

import com.blackbucks.bookmyshow.exceptions.InvalidUser;
import com.blackbucks.bookmyshow.exceptions.SeatsAlreadyBookedException;
import com.blackbucks.bookmyshow.models.Ticket;

import java.util.List;

public interface TicketService {

    public Ticket bookTicket(List<Integer> showSeatIds, int userId) throws SeatsAlreadyBookedException, InvalidUser;
}
