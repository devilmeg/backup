package com.hms.hospital_management.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Block")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Block {

    @EmbeddedId
    private Block_Id id;
}