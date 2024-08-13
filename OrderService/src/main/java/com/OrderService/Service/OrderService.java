package com.OrderService.Service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import javax.lang.model.element.Name;

@FeignClient(name = "userService")
public interface OrderService {

    @GetMapping("/users")
    String getUsers();
}
