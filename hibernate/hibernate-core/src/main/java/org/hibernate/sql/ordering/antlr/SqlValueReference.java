/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later.
 * See the lgpl.txt file in the root directory or <http://www.gnu.org/licenses/lgpl-2.1.html>.
 */
package org.hibernate.sql.ordering.antlr;

/**
 * Unifying interface between column and formula references mainly to give more strictly typed result
 * to {@link org.hibernate.sql.ordering.antlr.ColumnMapper#map(String)}
 *
 * @see org.hibernate.sql.ordering.antlr.ColumnReference
 * @see org.hibernate.sql.ordering.antlr.FormulaReference
 *
 * @author Steve Ebersole
 */
public interface SqlValueReference {
}
