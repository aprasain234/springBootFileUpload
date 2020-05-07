package com.ashishprasain.fileupload;

import java.io.File;

//import org.apache.tomcat.jni.File;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import com.ashishprasain.fileupload.controller.FileUploadController;

@SpringBootApplication
@ComponentScan({"com.ashishprasain.fileupload", "controller"})
public class SpringBootFileUploadApplication {

	public static void main(String[] args) {
		new File(FileUploadController.uploadDirectory).mkdir();
		SpringApplication.run(SpringBootFileUploadApplication.class, args);
	}

}
