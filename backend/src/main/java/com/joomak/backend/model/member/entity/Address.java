package com.joomak.backend.model.member.entity;

import com.joomak.backend.model.common.BaseEntity;
import com.joomak.backend.model.common.YorN;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import static lombok.AccessLevel.PROTECTED;


@Entity
@Getter
@NoArgsConstructor(access = PROTECTED)
public class Address extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;
    private String parcelBasedAddress;
    private String parcelBasedAddressDetail;
    private String roadBasedAddress;
    private String roadBasedAddressDetail;
    private String postCode;
    private YorN isMainDeliveryAddress;

    @Builder
    public Address(Long id, Member member, String parcelBasedAddress, String parcelBasedAddressDetail, String roadBasedAddress, String roadBasedAddressDetail, String postCode, YorN isMainDeliveryAddress) {
        this.id = id;
        this.member = member;
        this.parcelBasedAddress = parcelBasedAddress;
        this.parcelBasedAddressDetail = parcelBasedAddressDetail;
        this.roadBasedAddress = roadBasedAddress;
        this.roadBasedAddressDetail = roadBasedAddressDetail;
        this.postCode = postCode;
        this.isMainDeliveryAddress = isMainDeliveryAddress;
    }
}

