package com.example.redditClone.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.Instant;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postId;
    @NotBlank(message = "Please Enter PostName")
    private String postName;
    @Nullable
    private String url;
    @Nullable
    @Lob
    private String description;
    private Integer voteCount;
    private Users user;
    private Instant createdTime;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id",referencedColumnName = "id")
    private Subreddit subreddit;



}
