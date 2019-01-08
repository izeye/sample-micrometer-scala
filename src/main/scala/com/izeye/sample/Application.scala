package com.izeye.sample

import org.springframework.util.StringUtils

import io.micrometer.datadog.DatadogConfig

object Application {

  def main(args: Array[String]) {
    println("Hello, world!")

    new DatadogConfig {
      override def get(key: String): String = null
    }

    // @Nullable on a parameter is okay.
    println(StringUtils.isEmpty("test"))

    // @Nullable on a return type causes a warning.
    println(StringUtils.quoteIfString("test"))
  }

}
