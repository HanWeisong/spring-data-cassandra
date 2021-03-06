/*
 * Copyright 2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.cassandra.core.cql.generator;

import static org.springframework.cassandra.core.cql.CqlStringUtils.*;

import org.springframework.cassandra.core.keyspace.RenameColumnSpecification;

/**
 * CQL generator for generating an {@code RENAME} column clause of an {@code ALTER TABLE} statement.
 *
 * @author Mark Paluch
 * @since 1.5
 * @see ColumnChangeCqlGenerator
 * @see RenameColumnSpecification
 * @see org.springframework.cassandra.core.keyspace.AlterTableSpecification
 */
public class RenameColumnCqlGenerator extends ColumnChangeCqlGenerator<RenameColumnSpecification> {

	RenameColumnCqlGenerator(RenameColumnSpecification specification) {
		super(specification);
	}

	/* (non-Javadoc)
	 * @see org.springframework.cassandra.core.cql.generator.ColumnChangeCqlGenerator#toCql(java.lang.StringBuilder)
	 */
	public StringBuilder toCql(StringBuilder cql) {
		return noNull(cql).append("RENAME ").append(spec().getName()).append(" TO ").append(spec().getTargetName());
	}
}
