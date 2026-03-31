package com.hms.hospital_management.entity;


import com.hms.hospital_management.entity.Block;
import com.hms.hospital_management.entity.Nurse;
import com.hms.hospital_management.entity.On_Call_Id;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "On_Call")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class On_Call {

    @EmbeddedId
    private On_Call_Id id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("nurse")
    @JoinColumn(name = "Nurse", referencedColumnName = "EmployeeID", nullable = false)
    private Nurse nurse;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("block")
    @JoinColumns({
            @JoinColumn(name = "BlockFloor", referencedColumnName = "BlockFloor"),
            @JoinColumn(name = "BlockCode", referencedColumnName = "BlockCode")
    })
    private Block block;



    @Column(name = "OnCallStart")
    private LocalDateTime onCallStart;

    @Column(name = "OnCallEnd")
    private LocalDateTime onCallEnd;
}