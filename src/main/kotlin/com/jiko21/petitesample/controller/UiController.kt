package com.jiko21.petitesample.controller

import com.jiko21.petitesample.entity.Cart
import com.jiko21.petitesample.service.CartService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class UiController(@Autowired val cartService: CartService) {
    @GetMapping("/")
    fun index(model: Model): String {
        model.addAttribute("carts", cartService.getAll())
        return "index"
    }

    @PostMapping("/")
    fun post(@ModelAttribute cart: Cart): String {
        cartService.add(cart)
        return "redirect:/"
    }
}
