package com.ecommerce.user.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "usuaroio")
public class User {

    @Id
    @Schema(hidden = true)
    private String id;
    private String nome;
    private String email;

}
