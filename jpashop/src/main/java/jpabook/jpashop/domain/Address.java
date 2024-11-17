package jpabook.jpashop.domain;

import jakarta.persistence.Embeddable;
import lombok.Getter;

@Embeddable
@Getter
public class Address {
    private String city;
    private String street;
    private String zipCode;

    protected Address() {}

    //값 타입은 변경 불가능하게 설계해야 하므로 생성자에서 값을 초기화하도록 하자
    public Address(String city, String street, String zipCode) {
        this.city = city;
        this.street = street;
        this.zipCode = zipCode;
    }
}
