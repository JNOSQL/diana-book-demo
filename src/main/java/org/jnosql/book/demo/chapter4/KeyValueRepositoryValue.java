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


import java.time.Duration;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class KeyValueRepositoryValue {

    public static void main(String[] args) {
        UserRepository userRepository = null;
        User user = new User("ada", "Ada Lovelace", 30);
        List<User> users = Collections.singletonList(user);
        userRepository.put(user);
        userRepository.put(user, Duration.ofHours(1));
        userRepository.put(users);
        userRepository.put(users, Duration.ofHours(1));

        Optional<User> userOptional = userRepository.get("ada");
        Iterable<User> usersFound = userRepository.get(Collections.singletonList("ada"));

    }


}

