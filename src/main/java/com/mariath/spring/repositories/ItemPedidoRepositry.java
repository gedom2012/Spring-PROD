package com.mariath.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mariath.spring.domain.ItemPedido;

@Repository
public interface ItemPedidoRepositry extends JpaRepository<ItemPedido, Integer> {

}
