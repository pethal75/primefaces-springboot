package com.javaservices.primefaces.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@RestController
public class FileController {

    private final static Logger log = LoggerFactory.getLogger(FileController.class);

    @PostMapping("/")
    public ResponseEntity<String> handleFileUpload(@RequestParam("file") MultipartFile file, RedirectAttributes redirectAttributes) {

        log.debug("Uploaded files size : {}", file.getName());

        return ResponseEntity.ok().build();
    }

    @PostMapping("/uploadMultipleFile")
    public ResponseEntity<String> handleFilesUpload(@RequestParam("name") String[] names,
                                                    @RequestParam("file") MultipartFile[] files) {

        log.debug("Uploaded files size : {}", files.length);

        return ResponseEntity.ok().build();
    }
}
