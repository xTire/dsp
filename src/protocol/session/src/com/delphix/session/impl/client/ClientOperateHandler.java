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

package com.delphix.session.impl.client;

import com.delphix.session.impl.common.SessionTransportHandler;
import com.delphix.session.impl.common.SessionTransportManager;
import com.delphix.session.impl.frame.RequestFrame;
import com.delphix.session.impl.frame.ResponseFrame;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.channel.MessageEvent;

/**
 * Netty channel handler for the normal operation after successful login.
 */
public class ClientOperateHandler extends SessionTransportHandler {

    private static final String HANDLER_NAME = "operate";

    private final ClientTransport xport;

    public ClientOperateHandler(SessionTransportManager manager, ClientTransport xport) {
        super(manager, HANDLER_NAME);
        this.xport = xport;
    }

    @Override
    public void messageReceived(ChannelHandlerContext ctx, MessageEvent e) throws Exception {
        Object message = e.getMessage();

        if (message instanceof RequestFrame) {
            xport.receiveRequest((RequestFrame) message);
        } else if (message instanceof ResponseFrame) {
            xport.receiveResponse((ResponseFrame) message);
        } else {
            throw new IllegalStateException("invalid message " + message);
        }
    }
}
