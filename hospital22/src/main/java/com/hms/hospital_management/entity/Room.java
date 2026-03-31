package com.hms.hospital_management.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Room")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Room {

    @Id
    @Column(name = "RoomNumber")
    private Integer roomNumber;

    @Column(name = "RoomType", nullable = false)
    private String roomType;


    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "BlockFloor", referencedColumnName = "BlockFloor"),
            @JoinColumn(name = "BlockCode", referencedColumnName = "BlockCode")
    })
    private Block block;

    @Column(name = "Unavailable", nullable = false)
    private boolean unavailable;
}