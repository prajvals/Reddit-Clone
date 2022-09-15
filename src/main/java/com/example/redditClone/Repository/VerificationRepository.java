package com.example.redditClone.Repository;

import com.example.redditClone.Entity.VerificationToken;
import org.springframework.boot.autoconfigure.security.saml2.Saml2RelyingPartyProperties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VerificationRepository extends JpaRepository<VerificationToken,Long> {
}
