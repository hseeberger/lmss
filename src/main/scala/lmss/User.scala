/*
 * Copyright 2021 Heiko Seeberger
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

package lmss

final case class User(firstName: User.FirstName, lastName: User.LastName)

object User:
  opaque type FirstName = String

  object FirstName:
    def apply(value: String): FirstName =
      value

  opaque type LastName = String

  object LastName:
    def apply(value: String): LastName =
      value

@main
def userMain() =
  println(User(User.FirstName("Heiko"), User.LastName("Seeberger")))
