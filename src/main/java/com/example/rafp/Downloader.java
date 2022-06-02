package com.example.rafp;

import java.io.*;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class Downloader {


    public static  void downloadZip(String url1) {

        try {
            URL url = new URL(url1);
            BufferedInputStream bis = new BufferedInputStream(url.openStream());
            FileOutputStream fis = new FileOutputStream(Constans.path + "out.zip");
            byte[] buffer = new byte[1024];
            int count = 0;
            while ((count = bis.read(buffer, 0, 1024)) != -1) {
                fis.write(buffer, 0, count);
            }
            fis.close();
            bis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public static File unZip(String path) {

        try {
            InputStream is = Files.newInputStream(Paths.get(path));
            ZipInputStream zis = new ZipInputStream(new BufferedInputStream(is));
            ZipEntry ze;

            while ((ze = zis.getNextEntry()) != null) {
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                byte[] buff = new byte[1024];
                int counter;

                String filename = ze.getName();
                FileOutputStream fout = new FileOutputStream(Constans.path + "out");

                while ((counter = zis.read(buff)) != -1) {
                    baos.write(buff, 0, counter);
                    byte[] bytes = baos.toByteArray();
                    fout.write(bytes);
                    baos.reset();
                }

                fout.close();
                zis.closeEntry();

            }
            zis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return new File(Constans.path + "out");

    }
}

