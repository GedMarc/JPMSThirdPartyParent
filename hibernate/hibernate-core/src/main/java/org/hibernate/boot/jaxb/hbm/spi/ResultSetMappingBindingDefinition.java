/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later.
 * See the lgpl.txt file in the root directory or <http://www.gnu.org/licenses/lgpl-2.1.html>.
 */
package org.hibernate.boot.jaxb.hbm.spi;

import java.util.List;

/**
 * @author Steve Ebersole
 */
public interface ResultSetMappingBindingDefinition {
	/**
	 * The ResultSet mapping name
	 *
	 * @return The name.
	 */
	String getName();

	/**
	 * Get the JAXB mappings for each defined value return in the ResultSet mapping.
	 *
	 * Needs to be a "grab bag", as opposed to individual Lists per return type, in
	 * order to maintain the defined order.  And atm there is (unfortunately) not
	 * a common type for all the JAXB return mappings.  But the list elements
	 * will be one of:<ul>
	 *     <li>{@link org.hibernate.boot.jaxb.hbm.spi.JaxbHbmNativeQueryScalarReturnType}</li>
	 *     <li>{@link org.hibernate.boot.jaxb.hbm.spi.JaxbHbmNativeQueryReturnType}</li>
	 *     <li>{@link org.hibernate.boot.jaxb.hbm.spi.JaxbHbmNativeQueryJoinReturnType}</li>
	 *     <li>{@link org.hibernate.boot.jaxb.hbm.spi.JaxbHbmNativeQueryCollectionLoadReturnType}</li>
	 * </ul>
	 *
	 * @return The value return JAXB mappings.
	 */
	List getValueMappingSources();
}
