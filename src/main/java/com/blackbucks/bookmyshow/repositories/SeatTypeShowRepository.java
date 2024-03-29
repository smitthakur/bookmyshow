package com.blackbucks.bookmyshow.repositories;

import com.blackbucks.bookmyshow.models.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SeatTypeShowRepository extends JpaRepository<SeatTypeShow, Integer> {

    List<SeatTypeShow> findByShow(int showId);
}
