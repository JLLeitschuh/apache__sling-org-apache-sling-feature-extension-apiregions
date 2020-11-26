/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.sling.feature.extension.apiregions.api.config.validation;

import java.util.ArrayList;
import java.util.List;

/**
 * Validation result for a property
 */
public class PropertyValidationResult {

    private final List<String> errors = new ArrayList<>();

    private final List<String> warnings = new ArrayList<>();

    /**
     * Is the property value valid?
     * @return {@code true} if the value is valid
     */
	public boolean isValid() {
        return errors.isEmpty();
    }

    /**
     * If {@link #isValid()} returns {@code false} this returns
     * a list of human readable errors.
     * @return A list of errors - empty if {@link #isValid()} returns {@code true}
     */
	public List<String> getErrors() {
        return errors;
    }

    /**
     * Return the list of warnings
     * @return The list of warnings - might be empty
     */
    public List<String> getWarnings() {
        return this.warnings;
    }
}