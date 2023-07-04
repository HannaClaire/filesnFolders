package com.codeclan.example.filesandfolders.controllers;

import com.codeclan.example.filesandfolders.models.Files;
import com.codeclan.example.filesandfolders.repositories.FilesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class FilesController {

    @Autowired
    FilesRepository filesRepository;

    @GetMapping(value = "/files")
    public ResponseEntity<List<Files>> ShowFiles(){
        List<Files> files = filesRepository.findAll();
        return new ResponseEntity<>(files, HttpStatus.OK) ;
    }

    @PostMapping(value = "/files/new")
    public ResponseEntity<Files> createFiles(@RequestBody Files files){
        filesRepository.save(files);
        return new ResponseEntity<>(files, HttpStatus.CREATED);
    }

    @GetMapping(value = "/files/{id}")
    public Optional<Files> getFile(@PathVariable Long id){
        return filesRepository.findById(id);
    }






}
