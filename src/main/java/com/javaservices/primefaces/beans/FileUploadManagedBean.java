package com.javaservices.primefaces.beans;

import jakarta.annotation.PostConstruct;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.file.UploadedFile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author Jan Mach (30/10/2019)
 */
@Component
@ViewScoped
public class FileUploadManagedBean {
    private final transient Logger logger = LoggerFactory.getLogger(getClass());

    UploadedFile file;

    @PostConstruct
    public void load() {
        logger.info(String.format("File Upload Bean initialized"));
    }

    public String getName() {
        return "TestFileUpload";
    }

    public void handleUpload(FileUploadEvent event) {
        logger.info(String.format("Upload event handle called for file %s", event.getFile().getFileName()));

        FacesMessage message = new FacesMessage("Successful", event.getFile().getFileName() + " is uploaded.");
        FacesContext.getCurrentInstance().addMessage(null, message);
    }

    public UploadedFile getFile() {
        return file;
    }

    public void setFile(UploadedFile file) {
        this.file = file;
    }


    public void submitFiles() {
        logger.info(String.format("submitFiles"));

        FacesMessage message = new FacesMessage("submitFiles");
        FacesContext.getCurrentInstance().addMessage(null, message);

    }
}
