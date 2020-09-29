package jpabook.jpashopProject.repository;

import jpabook.jpashopProject.domain.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class OrderRepository {

    private final EntityManager entityManager;

    public void save(Order order) {
        entityManager.persist(order);
    }

    public Order findOne(Long id) {
        return entityManager.find(Order.class, id);
    }

    // 동적쿼리 필요해서 나중에 사용하는 걸로
//    public List<Order> findAll(OrderSearch orderSearch) {
//
//    }


}
