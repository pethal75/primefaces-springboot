package com.javaservices.primefaces.beans;

import lombok.Getter;
import org.springframework.stereotype.Component;

@Component("applicationInfoView")
@Getter
public class ApplicationInfoView
{
    private String projectName = "Primefaces SpringBoot Application";

}
