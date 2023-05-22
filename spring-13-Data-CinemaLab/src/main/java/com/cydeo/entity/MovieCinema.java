package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@Table(name = "movie_cinema")
public class MovieCinema extends BaseEntity {

    @Column(columnDefinition = "DATE", name = "date_time")
    private LocalDate dateTime;

    @ManyToOne(fetch = FetchType.LAZY)
    private Movie movie;
    @ManyToOne(fetch = FetchType.LAZY)
    private  Cinema cinema;


    public MovieCinema(LocalDate dateTime) {
        this.dateTime = dateTime;
    }
}
