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

package org.jnosql.book.demo.chapter4;

import org.jnosql.artemis.key.KeyValueTemplate;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class KeyValueRepositorySample {

    public static void main(String[] args) {

        KeyValueTemplate template = null;
        User user = new User();
        user.setNickname("ada");
        user.setAge(10);
        user.setName("Ada Lovelace");
        List<User> users = Collections.singletonList(user);

        template.put(user);
        template.put(users);

        Optional<Person> ada = template.get("ada", Person.class);
        Iterable<Person> usersFound = template.get(Collections.singletonList("ada"), Person.class);

    }

    private KeyValueRepositorySample() {}
}
