package com.codeclan.example.filesandfolders.repositories;

import com.codeclan.example.filesandfolders.models.Files;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilesRepository extends JpaRepository<Files, Long> {
}
