package com.megastallion.Megastallion.entities;


import jakarta.persistence.*;
import lombok.*;
//
//import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "post")
public class Post extends BaseEntity{

    private String title;
    private String content;
    private String imageUrl;

    @ManyToOne(cascade = CascadeType.ALL)
    private Category category;

    @OneToMany(mappedBy = "post", orphanRemoval = true, fetch = FetchType.EAGER)
    private Set<Comment> comments;
}
