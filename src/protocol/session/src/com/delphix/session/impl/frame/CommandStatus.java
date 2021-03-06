/**
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

/**
 * Copyright (c) 2013 by Delphix. All rights reserved.
 */

package com.delphix.session.impl.frame;

/**
 * Command status enumeration.
 */
public enum CommandStatus {

    SUCCESS("command successful"),
    SLOT_ID_INVALID("invalid slot ID"),
    SLOT_MAX_INVALID("invalid max slot ID"),
    SLOT_SEQ_MISORDERED("sequence misordered"),
    SLOT_FALSE_RETRY("false retry"),
    SLOT_UNCACHED("response uncached");

    private final String desc;

    private CommandStatus(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}
