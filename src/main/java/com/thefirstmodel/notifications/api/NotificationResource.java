package com.thefirstmodel.notifications.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationResource {

  @PostMapping("/notifications")
  public String notification() {
    return null;
  }

}
