/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.driver.orchestration.spring.namespace.handler;

import org.apache.shardingsphere.driver.orchestration.spring.namespace.constants.EncryptDataSourceBeanDefinitionParserTag;
import org.apache.shardingsphere.driver.orchestration.spring.namespace.constants.InstanceBeanDefinitionParserTag;
import org.apache.shardingsphere.driver.orchestration.spring.namespace.constants.MasterSlaveDataSourceBeanDefinitionParserTag;
import org.apache.shardingsphere.driver.orchestration.spring.namespace.constants.ShardingDataSourceBeanDefinitionParserTag;
import org.apache.shardingsphere.driver.orchestration.spring.namespace.parser.DataSourceBeanDefinitionParser;
import org.apache.shardingsphere.driver.orchestration.spring.namespace.parser.InstanceBeanDefinitionParser;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * Orchestration spring namespace handler for sharding.
 */
public final class OrchestrationNamespaceHandler extends NamespaceHandlerSupport {
    
    @Override
    public void init() {
        registerBeanDefinitionParser(InstanceBeanDefinitionParserTag.ROOT_TAG, new InstanceBeanDefinitionParser());
        registerBeanDefinitionParser(ShardingDataSourceBeanDefinitionParserTag.ROOT_TAG, new DataSourceBeanDefinitionParser());
        registerBeanDefinitionParser(MasterSlaveDataSourceBeanDefinitionParserTag.ROOT_TAG, new DataSourceBeanDefinitionParser());
        registerBeanDefinitionParser(EncryptDataSourceBeanDefinitionParserTag.ROOT_TAG, new DataSourceBeanDefinitionParser());
    }
}
