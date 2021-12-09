package com.example.postgresql.Tables;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "tb_spring")
public class ProductTable implements Serializable {
            private static final long serialVersionUID = 1L;

            @Id
            @GeneratedValue(strategy = GenerationType.AUTO)
            private String ownerRef;
            private String emailFrom;
            private String emailTo;
            private String Subject;
            @Column(columnDefinition = "TEXT")
            private String text; //atribuito
            private LocalDateTime sendDateEmail; //atribuito
 }
