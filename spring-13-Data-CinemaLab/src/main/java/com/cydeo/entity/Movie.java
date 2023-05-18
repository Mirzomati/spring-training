package com.cydeo.entity;

import com.cydeo.enums.MovieState;
import com.cydeo.enums.MovieType;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor

public class Movie extends BaseEntity{


    private String name;
    private BigDecimal price;

    @Enumerated(EnumType.STRING)
    private MovieType type;
    @Enumerated(EnumType.STRING)
    private MovieState state;

    @Column(columnDefinition = "DATE")
    private LocalDate releaseDate;

    private BigDecimal duration;

    @Column(columnDefinition = "text")
    private String summary;

    @ManyToMany(mappedBy = "moviesId")
    private List<Genre> genresId;

    public Movie(String name, BigDecimal price, MovieType type, MovieState state, LocalDate releaseDate, BigDecimal duration, String summary) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.state = state;
        this.releaseDate = releaseDate;
        this.duration = duration;
        this.summary = summary;
    }
}
