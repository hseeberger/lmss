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
package instances
package semigroup

given SemiGroup[Int] with
  extension (lhs: Int)
    override def combine(rhs: Int): Int =
      lhs + rhs

given [A]: SemiGroup[Seq[A]] with
  extension (lhs: Seq[A])
    override def combine(rhs: Seq[A]): Seq[A] =
      lhs ++ rhs
