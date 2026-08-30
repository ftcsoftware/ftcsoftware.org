/*
 * Copyright 2026 FTCSoftware
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */


// [pairClass]
public class Pair<A, B> {
  private final A first;
  private final B second;

  Pair(A first, B second) {
    this.first = first;
    this.second = second;
  }

  public A getFirst() {
    return first;
  }

  public B getSecond() {
    return second;
  }
}
// [/pairClass]