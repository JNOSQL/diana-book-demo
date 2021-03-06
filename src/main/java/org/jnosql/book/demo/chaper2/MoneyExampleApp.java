/*
 * Copyright (c) 2017 Otávio Santana and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Apache License v2.0 which accompanies this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Apache License v2.0 is available at http://www.opensource.org/licenses/apache2.0.php.
 *
 * You may elect to redistribute this code under either of these licenses.
 *
 * Contributors:
 *
 * Otavio Santana
 */

package org.jnosql.book.demo.chaper2;


import org.jnosql.diana.api.TypeReference;
import org.jnosql.diana.api.Value;

import java.util.List;
import java.util.Set;

public class MoneyExampleApp {

    public static void main(String[] args) {
        Value value = Value.of("BRL 10.0");
        Money money = value.get(Money.class);
        List<Money> list = value.get(new TypeReference<List<Money>>() {});
        Set<Money> set = value.get(new TypeReference<Set<Money>>() {});
    }

    private MoneyExampleApp() {}
}
