package com.knoldus.validator

import org.scalatest.flatspec.AnyFlatSpec

class passwordvalidatorTest extends AnyFlatSpec {

  val pass = "wasSd"

  val passwordvalidator = new passwordvalidator()

  "a password " should "not contains any spaces" in {
    val res = passwordvalidator.isPasswordisValid(pass)
    assert(res)
  }
}