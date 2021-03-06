/*
 * Copyright 2013-2014 the original author or authors
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.data.cassandra.mapping;

import java.util.Comparator;

/**
 * {@link Comparator} implementation that uses {@link Column#value()}.
 * 
 * @author Matthew T. Adams
 */
public enum CassandraColumnAnnotationComparator implements Comparator<Column> {

	/**
	 * The sole instance of this class.
	 */
	IT;

	@Override
	public int compare(Column left, Column right) {
		return left.value().compareTo(right.value());
	}
}
