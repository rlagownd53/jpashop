package jpabook.jpashop.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Delivery {

    @Id
    @GeneratedValue
    @Column(name="delivery_id")
    private Long id;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "delivery")
    private Order order;

    private Address address;

    //EnumType.ORDINAL 로 쓰면 추후 다른 status 가 추가되면 번호가 밀리기 때문에 큰일난다.
    //string으로 써주자
    @Enumerated(EnumType.STRING)
    private DeliveryStatus status; //READY, COMP
}
