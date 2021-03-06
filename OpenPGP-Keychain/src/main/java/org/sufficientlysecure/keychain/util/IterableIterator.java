/*
 * Copyright (C) 2010 Thialfihar <thi@thialfihar.org>
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

package org.sufficientlysecure.keychain.util;

import java.util.ArrayList;
import java.util.Iterator;

public class IterableIterator<T> implements Iterable<T> {
    private Iterator<T> mIter;

    public IterableIterator(Iterator<T> iter, boolean failsafe) {
        mIter = iter;
        if(failsafe && mIter == null) {
            // is there a better way?
            mIter = new ArrayList<T>().iterator();
        }
    }
    public IterableIterator(Iterator<T> iter) {
        this(iter, false);
    }

    public Iterator<T> iterator() {
        return mIter;
    }
}
