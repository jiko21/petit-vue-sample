package com.jiko21.petitesample.repository

import com.jiko21.petitesample.entity.Cart

interface CartRepository {
    fun findAll(): List<Cart>

    fun add(cart: Cart)

    fun delete(ids: List<Int>)
}
