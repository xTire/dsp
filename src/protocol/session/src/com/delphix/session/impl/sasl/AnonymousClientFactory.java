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

package com.delphix.session.impl.sasl;

import com.delphix.session.sasl.SaslMechanism;

import javax.security.auth.callback.CallbackHandler;
import javax.security.sasl.SaslClient;
import javax.security.sasl.SaslClientFactory;
import javax.security.sasl.SaslException;

import java.util.Map;

public class AnonymousClientFactory extends AbstractSaslFactory implements SaslClientFactory {

    public AnonymousClientFactory() {
        super(SaslMechanism.ANONYMOUS);
    }

    @Override
    public SaslClient createSaslClient(String[] mechanisms, String authorizationId, String protocol,
            String serverName, Map<String, ?> props, CallbackHandler cbh) throws SaslException {
        SaslClient sasl;

        if (filter(mechanisms, props)) {
            sasl = new AnonymousSaslClient(protocol, serverName, authorizationId, cbh);
        } else {
            sasl = null;
        }

        return sasl;
    }
}
