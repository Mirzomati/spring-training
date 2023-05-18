package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@Table(name = "movieCinemas")
public class MovieCinema {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "DATE", name = "date_time")
    private LocalDate dateTime;

    @ManyToOne
    private Movie movieId;


    public MovieCinema(LocalDate dateTime) {
        this.dateTime = dateTime;
    }
}
