package com.codeclan.example.filesandfolders.controllers;

import com.codeclan.example.filesandfolders.models.Folders;
import com.codeclan.example.filesandfolders.repositories.FolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FoldersController {

    @Autowired
    FolderRepository folderRepository;

    @GetMapping(value = "/folder")
    public ResponseEntity<List<Folders>> ShowFolder(){
        List<Folders> folders = folderRepository.findAll();
        return new ResponseEntity<>(folders, HttpStatus.OK) ;
    }
    @PostMapping(value = "/folder/new")
    public ResponseEntity<Folders> createFolder(@RequestBody Folders folder){
        folderRepository.save(folder);
        return new ResponseEntity<>(folder, HttpStatus.CREATED);
    }
}
