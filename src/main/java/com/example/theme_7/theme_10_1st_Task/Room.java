package com.example.theme_7.theme_10_1st_Task;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author Saydali Murodullayev, Sun 12:59 PM. 3/13/2022
 */
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer number;

    private Short floor;

    private Short size;

    @ManyToOne
    private Hotel hotel;
}
