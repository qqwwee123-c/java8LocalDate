package com.ywb.fileupload;

import java.io.File;
import java.io.RandomAccessFile;

public class test1 {

    public static void main(String[] args) throws Exception{
        String resourcePath = "G:\\file\\lucene.mp4";
        String toPath = "G:\\filechunk\\";
        File resource = new File(resourcePath);
        File chunk = new File(toPath);
        if(!chunk.exists()){
            chunk.mkdirs();
        }
        long chunkSize = 1024*1024*1;
        long chunkNum =(long)Math.ceil(resource.length()*1.0/chunkSize);
        if(chunkNum<=0){
             chunkNum = 1;
        }
        byte[] b = new byte[1024];
        RandomAccessFile read = new RandomAccessFile(resource,"r");
        for (int i=0 ;i<chunkNum;i++){
            File chunkfile = new File(toPath+i);
            boolean newFile = chunkfile.createNewFile();
            if(newFile){
                RandomAccessFile write = new RandomAccessFile(chunkfile,"rw");
                int len=-1;
                while ((len =read.read(b) )!= -1){
                    write.write(b,0,len);
                    if(chunkfile.length()>=chunkSize){
                        break;
                    }
                }
                write.close();
            }
        }
        read.close();
    }

}
