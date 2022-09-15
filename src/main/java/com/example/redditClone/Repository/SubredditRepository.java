package com.example.redditClone.Repository;

import com.example.redditClone.Entity.Subreddit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubredditRepository extends JpaRepository<Subreddit,Long> {
}
