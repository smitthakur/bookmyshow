package com.blackbucks.bookmyshow.repositories;

import com.blackbucks.bookmyshow.models.*;
import jakarta.persistence.LockModeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ShowSeatRepository extends JpaRepository<ShowSeat, Integer> {

    Optional<ShowSeat> findById(int showSeatId);


    @Lock(value = LockModeType.PESSIMISTIC_READ)
    List<ShowSeat> findByIdInAndSeatStatus_Available(List<Integer> showSeatIds);

}
