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
package org.fuin.auction.command.server.handler;

import javax.inject.Inject;
import javax.inject.Named;

import org.axonframework.domain.AggregateIdentifier;
import org.axonframework.repository.Repository;
import org.fuin.auction.command.server.domain.User;
import org.fuin.axon.support.base.AggregateIdentifierFactory;
import org.fuin.axon.support.base.IllegalAggregateIdentifierException;
import org.fuin.axon.support.base.UUIDFactory;

// GENERATED CODE - DO NOT EDIT!

/**
 * Base class for operations on a {@link User}.
 */
public abstract class AbstractUserCommandHandler {
	@Inject
	@Named("userRepository")
	private Repository<User> repository;
	@Inject
	@UUIDFactory
	private AggregateIdentifierFactory aggregateIdFactory;

	/**
	 * Returns the repository.
	 * 
	 * @return Repository.
	 */
	protected final Repository<User> getRepository() {
		return repository;
	}

	/**
	 * Sets the repository to a new value.
	 * 
	 * @param repository
	 *            Repository to set.
	 */
	protected final void setRepository(final Repository<User> repository) {
		this.repository = repository;
	}

	/**
	 * Returns the aggregate identifier factory.
	 * 
	 * @return Factory.
	 */
	protected final AggregateIdentifierFactory getAggregateIdFactory() {
		return aggregateIdFactory;
	}

	/**
	 * Converts the string into an aggregate identifier.
	 * 
	 * @param aggregateId
	 *            Aggregate identifier that is supposed to be valid or a runtime
	 *            exception will be thrown.
	 */
	protected final AggregateIdentifier toAggregateId(final String aggregateId) {
		try {
			return aggregateIdFactory.fromString(aggregateId);
		} catch (final IllegalAggregateIdentifierException ex) {
			throw new RuntimeException("The aggregate id in the command was invalid!", ex);
		}
	}

	/**
	 * Sets the aggregate identifier factory.
	 * 
	 * @param aggregateIdFactory
	 *            Factory to set.
	 */
	protected final void setAggregateIdFactory(final AggregateIdentifierFactory aggregateIdFactory) {
		this.aggregateIdFactory = aggregateIdFactory;
	}
}
