package com.blackbucks.bookmyshow.dtos;

import com.blackbucks.bookmyshow.models.Ticket;
import lombok.Data;

@Data
public class BookTicketResponseDto {
    private Response response;
    private Ticket ticket;

    public static BookTicketResponseDto getSuccessResponse(Ticket ticket){
        BookTicketResponseDto dto = new BookTicketResponseDto();
        dto.setResponse(Response.getSuccessResponse("Successfully created ticket"));
        dto.setTicket(ticket);
        return dto;
    }

    public static BookTicketResponseDto getFailureResponse(String message){
        BookTicketResponseDto dto = new BookTicketResponseDto();
        dto.setResponse(Response.getFailureResponse(message));
        return dto;
    }
}
