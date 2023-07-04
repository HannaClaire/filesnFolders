package com.codeclan.example.filesandfolders.repositories;

import com.codeclan.example.filesandfolders.models.Folders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folders, Long> {


}
