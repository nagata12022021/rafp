package com.example.rafp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class RafpApplication {



    public static void main(String[] args) {
        SpringApplication.run(RafpApplication.class, args);


        try {

            Downloader.downloadZip(Constans.url);
            Parser.parsXml(Downloader.unZip(Constans.path+"out.zip"));


        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

}
