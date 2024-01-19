package com.blackbucks.bookmyshow.repositories;

import com.blackbucks.bookmyshow.models.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Integer> {

}
