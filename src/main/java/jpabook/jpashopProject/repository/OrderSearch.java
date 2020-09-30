package jpabook.jpashopProject.repository;

import jpabook.jpashopProject.domain.OrderStatus;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderSearch {

    private String MemberName;
    private OrderStatus orderStatus; // 주문 상태 : ORDER, CANCEL
}
