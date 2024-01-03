package com.maxi.bookregist.domains;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "books")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Book {

    @Id
    private String id = UUID.randomUUID().toString();

    private String name;
    private String isbn;
    private String edition;
    private Integer pageMunber;
    private Integer qty;

    @ManyToOne()
    private Autor autor;

    private String status;

}
