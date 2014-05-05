/*
 * Copyright (C) 2007-2013 Crafter Software Corporation.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.craftercms.core.util;

import java.util.Collection;
import java.util.Iterator;

/**
 * Utility methods for collections.
 *
 * @author Alfonso Vásquez
 */
public class CollectionUtils {

    public static <T> void move(Collection<T> fromCollection, Collection<T> toCollection) {
        for (Iterator<T> i = fromCollection.iterator(); i.hasNext(); ) {
            T element = i.next();
            i.remove();

            toCollection.add(element);
        }
    }

}
