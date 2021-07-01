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

import munit.FunSuite
import scala.language.strictEquality

final class StrictEqualityTests extends FunSuite:
  import StrictEqualityTests.*

  test("cannot be compared") {
    assert(compileErrors("Foo() == Bar()").contains("cannot be compared"))
  }

object StrictEqualityTests:
  final class Foo
  final class Bar
