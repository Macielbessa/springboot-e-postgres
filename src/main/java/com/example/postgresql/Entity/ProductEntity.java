package com.example.postgresql.Entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

        private Long numbering;

        @Column(name = "nome", nullable = false)
        private  String nome;

        @Column(name = "email")
        private  String email;

        @Column(name = "cpf")
        private  String cpf;

}
