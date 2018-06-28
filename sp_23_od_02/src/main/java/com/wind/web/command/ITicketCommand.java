package com.wind.web.command;

import com.wind.web.dto.TicketDto;

public interface ITicketCommand {

	public void execute(TicketDto ticketDto);
	
}
