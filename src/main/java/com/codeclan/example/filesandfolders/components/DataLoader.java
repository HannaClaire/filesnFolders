package com.codeclan.example.filesandfolders.components;

import com.codeclan.example.filesandfolders.models.Files;
import com.codeclan.example.filesandfolders.models.Folders;
import com.codeclan.example.filesandfolders.models.Person;
import com.codeclan.example.filesandfolders.repositories.FilesRepository;
import com.codeclan.example.filesandfolders.repositories.FolderRepository;
import com.codeclan.example.filesandfolders.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("!Test")
@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FilesRepository filesRepository;
    @Autowired
    FolderRepository folderRepository;
    @Autowired
    PersonRepository personRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {

        Person Jenny = new Person("Jenny");
        personRepository.save(Jenny);
        Person Dory = new Person("Dory");
        personRepository.save(Dory);
        Person Simon = new Person("Simon");
        personRepository.save(Simon);
        Person Sam = new Person("Sam");
        personRepository.save(Sam);
        Person Terry = new Person("Terry");
        personRepository.save(Terry);

        Folders folder1 = new Folders("Folder1", Dory);
        folderRepository.save(folder1);
        Folders folder2 = new Folders("Folder2", Dory);
        folderRepository.save(folder2);
        Folders folder3 = new Folders("Folder3", Dory);
        folderRepository.save(folder3);


        Files file1 = new Files("file1", "txt", 3, folder1);
        filesRepository.save(file1);
        Files file2 = new Files("file2", "txt", 4, folder1);
        filesRepository.save(file2);
        Files file3 = new Files("file3", "txt", 5, folder1);
        filesRepository.save(file3);
        Files file4 = new Files("file4", "txt", 6, folder1);
        filesRepository.save(file4);


    }
}
