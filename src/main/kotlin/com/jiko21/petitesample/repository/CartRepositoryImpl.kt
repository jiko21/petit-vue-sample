package com.jiko21.petitesample.repository

import com.jiko21.petitesample.entity.Cart
import org.springframework.stereotype.Repository

@Repository
class CartRepositoryImpl: CartRepository {
    private var lists: MutableList<Cart>
    private var id: Int = 0;

    init {
        lists = ArrayList();
    }

    override fun findAll(): List<Cart> {
        return lists
    }

    override fun add(cart: Cart) {
        cart.id = id++
        lists.add(cart)
    }

    override fun delete(ids: List<Int>) {
        lists = lists.filter {
            ids.contains(it.id)
        }.toList() as MutableList<Cart>
    }
}
