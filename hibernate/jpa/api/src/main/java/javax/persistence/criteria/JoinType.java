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

package javax.persistence.criteria;

/**
 * Defines the three types of joins.
 *
 * Right outer joins and right outer fetch joins are not required
 * to be supported. Applications that use <code>RIGHT</code> join
 * types will not be portable.
 *
 * @since 2.0
 */
public enum JoinType {

    /** Inner join. */
    INNER, 

    /** Left outer join. */
    LEFT, 

    /** Right outer join. */
    RIGHT
}
