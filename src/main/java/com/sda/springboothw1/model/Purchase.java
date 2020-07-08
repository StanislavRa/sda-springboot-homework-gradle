package com.sda.springboothw1.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author StanislavR
 */
@Data
@NoArgsConstructor
@Entity
@Table(name = "purchase")
@Component
public class Purchase implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "item")
    private String item;

    @Column(name = "value")
    private Long value;

    public Purchase(String item, Long value) {
        this.item = item;
        this.value = value;
    }
}
