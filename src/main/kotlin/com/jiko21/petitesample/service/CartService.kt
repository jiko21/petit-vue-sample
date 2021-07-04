package com.jiko21.petitesample.service

import com.jiko21.petitesample.entity.Cart

interface CartService {
    fun getAll(): List<Cart>

    fun add(cart: Cart)

    fun remove(ids: List<Int>)
}