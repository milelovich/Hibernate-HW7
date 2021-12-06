package com.geekbrains.spring.web.repositories;

import com.geekbrains.spring.web.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> { // <c какой сущностью мы работаем, тип первичного ключа(лонг)>

}
