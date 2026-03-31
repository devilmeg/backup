package com.hms.hospital_management.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Block_Id implements Serializable {

    @Column(name = "BlockFloor")
    private Integer blockFloor;

    @Column(name = "BlockCode")
    private Integer blockCode;
}