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
package show

@main
def show() =
  val foo = Foo("bar")
  println(foo.showOrToString)
  println(foo.show)

  val baz = Baz("qux")
  println(baz.showOrToString)
//  println(baz.show)

final case class Foo(bar: String)

object Foo:
  given Show[Foo] with
    extension (foo: Foo)
      override def show: String =
        import foo._
        s"Foo { bar=$bar }"

final case class Baz(qux: String)
