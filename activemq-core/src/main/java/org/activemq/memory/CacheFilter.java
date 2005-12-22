
/**
 *
 * Copyright 2004 The Apache Software Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.activemq.memory;


/**
 * Filters another Cache implementation.
 * 
 * @version $Revision$
 */
public class CacheFilter implements Cache {
    
    protected final Cache next;
    
    public CacheFilter(Cache next) {
        this.next = next;
    }

    public Object put(Object key, Object value) {
        return next.put(key, value);
    }

    public Object get(Object key) {
        return next.get(key);
    }

    public Object remove(Object key) {
        return next.remove(key);
    }
    
    public void close() {
        next.close();
    }

    public int size() {
        return next.size();
    }
}
