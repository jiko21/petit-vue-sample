package com.jiko21.petitesample.service

import com.jiko21.petitesample.entity.Cart
import com.jiko21.petitesample.repository.CartRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CartServiceImpl(@Autowired
                      private val cartReadable: CartRepository) : CartService {

    override fun getAll(): List<Cart> = cartReadable.findAll()

    override fun add(cart: Cart) {
        cartReadable.add(cart)
    }

    override fun remove(ids: List<Int>) {
        cartReadable.delete(ids)
    }
}