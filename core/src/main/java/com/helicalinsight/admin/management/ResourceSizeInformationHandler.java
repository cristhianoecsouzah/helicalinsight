/**
 *    Copyright (C) 2013-2017 Helical IT Solutions (http://www.helicalinsight.com) - All rights reserved.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.helicalinsight.admin.management;

import com.helicalinsight.efw.resourcecache.IResourceManager;
import com.helicalinsight.efw.resourcecache.ResourceManager;
import com.helicalinsight.efw.serviceframework.IComponent;
import net.sf.json.JSONObject;

/**
 * Created by Author on 13/05/2015
 *
 * @author Somen
 */
public class ResourceSizeInformationHandler implements IComponent {

    @Override
    public boolean isThreadSafeToCache() {
        return true;
    }

    @Override
    public String executeComponent(String jsonFormData) {
        JSONObject responseJson;
        responseJson = new JSONObject();
        IResourceManager resourceManager = ResourceManager.getInstance();
        responseJson.accumulate("size", resourceManager.getSize());
        return responseJson.toString();
    }
}