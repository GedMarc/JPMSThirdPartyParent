/*
 * Copyright (c) 2008, 2019 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0,
 * or the Eclipse Distribution License v. 1.0 which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: EPL-2.0 OR BSD-3-Clause
 */

// Contributors:
//     Linda DeMichiel - 2.1
//     Linda DeMichiel - 2.0

package javax.persistence;

import java.lang.annotation.Target;
import java.lang.annotation.Retention;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Specifies a column that is used to maintain the persistent order of
 * a list. The persistence provider is responsible for maintaining the
 * order upon retrieval and in the database.  The persistence provider
 * is responsible for updating the ordering upon flushing to the
 * database to reflect any insertion, deletion, or reordering
 * affecting the list.
 *
 * <p> The <code>OrderColumn</code> annotation is specified on a
 * OneToMany or ManyToMany relationship or on an element
 * collection. The <code>OrderColumn</code> annotation is specified on
 * the side of the relationship that references the collection that is
 * to be ordered. The order column is not visible as part of the state
 * of the entity or embeddable class.
 *
 * <p> The {@link OrderBy} annotation should be used for ordering that
 * is visible as persistent state and maintained by the
 * application. The <code>OrderBy</code> annotation is not used when
 * <code>OrderColumn</code> is specified.
 * 
 * <p> The order column must be of integral type.  The persistence
 * provider maintains a contiguous (non-sparse) ordering of the values
 * of the order column when updating the association or element collection.
 * The order column value for the first element is 0.
 *
 * <pre>
 *
 *    Example:
 *
 *    &#064;Entity
 *    public class CreditCard {
 *
 *       &#064;Id long ccNumber;
 *
 *       &#064;OneToMany  // unidirectional
 *       &#064;OrderColumn
 *       List&#060;CardTransaction&#062; transactionHistory;
 *       ...
 *    }
 *
 * </pre>
 *
 * @see OrderBy
 *
 * @since 2.0
 */
@Target( { METHOD, FIELD })
@Retention(RUNTIME)
public @interface OrderColumn {

	/** (Optional) The name of the ordering column. 
         *  Defaults to the concatenation of the name of the 
         *  referencing property or field; "_"; "ORDER".
         */
	String name() default "";

	/** (Optional) Whether the database column is nullable. */
	boolean nullable() default true;

	/**
	 * (Optional) Whether the column is included in SQL INSERT statements
	 * generated by the persistence provider.
	 */
	boolean insertable() default true;

	/**
	 * (Optional) Whether the column is included in SQL UPDATE statements
	 * generated by the persistence provider.
	 */
	boolean updatable() default true;

	/**
	 * (Optional) The SQL fragment that is used when generating the DDL for the
	 * column.  Defaults to generated SQL to create a column of the inferred type.
	 */
	String columnDefinition() default "";
}
