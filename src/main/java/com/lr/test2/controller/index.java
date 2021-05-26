package com.lr.test2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author LR
 * @date 2021/5/26
 */
@Controller
public class index {

  @GetMapping("/hello")
  public String Index1() {
    return "hello";
  }
}
