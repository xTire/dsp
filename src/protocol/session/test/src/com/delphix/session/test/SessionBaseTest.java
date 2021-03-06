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

package com.delphix.session.test;

import com.delphix.appliance.server.test.UnitTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

@ContextConfiguration(locations = {
        "/META-INF/spring/platform-external-context.xml",
        "/META-INF/spring/session-context.xml"
})
@UnitTest
public class SessionBaseTest extends AbstractTestNGSpringContextTests {
    protected static final String TEST_USERNAME = "bumblebee";
    protected static final String TEST_PASSWORD = "autobot";
    protected static final String TEST_INVALID_USERNAME = "megatron";
}
