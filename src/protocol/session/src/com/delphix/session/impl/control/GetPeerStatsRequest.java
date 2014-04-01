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

package com.delphix.session.impl.control;

import com.delphix.session.service.ServiceNexus;
import com.delphix.session.service.ServiceResponse;

public class GetPeerStatsRequest extends AbstractControlRequest {

    public GetPeerStatsRequest() {
        super(GetPeerStatsRequest.class.getSimpleName());
    }

    @Override
    public ServiceResponse execute(ServiceNexus nexus) {
        GetPeerStatsResponse response = new GetPeerStatsResponse();
        response.setStats(nexus.getStats());
        return response;
    }
}
