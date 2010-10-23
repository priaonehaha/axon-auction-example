/*
 * Copyright (c) 2010. Axon Auction Example
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.fuin.auction.command.api.base;

import org.fuin.auction.command.api.support.AggregateIdResult;
import org.fuin.auction.command.api.support.Command;
import org.fuin.auction.command.api.support.CommandResult;
import org.fuin.auction.command.api.support.VoidExceptionResult;
import org.fuin.auction.command.api.support.VoidSuccessResult;

/**
 * Service for sending commands to the command server - This is implemented
 * directly by the command server.<br>
 * <br>
 * CAUTION: The {@link CommandResult} is NOT meant to be a way to return
 * arbitrary results.<br>
 * <br>
 * Sending a command should be in most cases a fire-and-forget affair returning
 * simply a {@link VoidExceptionResult} or a {@link VoidSuccessResult}. The only
 * other use case that may include a return value is a command that creates a
 * new aggregate and then returns a {@link AggregateIdResult}. If the client
 * side creates the aggregate IDs there is even no need for that.
 */
public interface AuctionCommandService {

	/**
	 * Sends a command to the server.
	 * 
	 * @param command
	 *            Command.
	 * 
	 * @return Result.
	 */
	public CommandResult send(Command command);

}
