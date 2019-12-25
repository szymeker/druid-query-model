/*
 * Copyright 2018-present Red Brick Lane Marketing Solutions Pvt. Ltd.
 *
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

package in.zapr.druid.druidry.filter;

import java.util.Optional;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;

@Getter
@EqualsAndHashCode(callSuper = true)
public class SelectorFilter extends DruidFilter {

    private static String SELECTOR_DRUID_FILTER_TYPE = "selector";

    private String dimension;
    private Object value;

    private SelectorFilter(@NonNull String dimension) {
        this.type = SELECTOR_DRUID_FILTER_TYPE;
        this.dimension = dimension;
    }

    @Deprecated
    public SelectorFilter(@NonNull String dimension, String value) {
        this(dimension);
        this.value = value;
    }

    @Deprecated
    public SelectorFilter(@NonNull String dimension, Integer value) {
        this(dimension);
        this.value = value;
    }

    @Deprecated
    public SelectorFilter(@NonNull String dimension, Long value) {
        this(dimension);
        this.value = value;
    }

    public SelectorFilter(@NonNull String dimension, Optional<Object> value) {
        this(dimension);
        if (value.isPresent()) {
            this.value = value.get();
        }
    }
}