package org.apache.maven.archiva.repository.project;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import org.apache.maven.archiva.model.ArchivaProjectModel;

/**
 * Generic Filtering interface for {@link ArchivaProjectModel} objects.  
 *
 * @author <a href="mailto:joakime@apache.org">Joakim Erdfelt</a>
 * @version $Id$
 */
public interface ProjectModelFilter
{
    /**
     * Filter a model and return the results of the filtering.
     * 
     * @param model the model to filter.
     * @return a new model representing the filtered state of the model.
     * @throws ProjectModelException if there was a problem executing the filter.
     */
    public ArchivaProjectModel filter( final ArchivaProjectModel model ) throws ProjectModelException;
}
