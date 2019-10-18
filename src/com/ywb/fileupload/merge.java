package com.ywb.fileupload;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.*;

public class merge {
    public static void main(String[] args) throws Exception{
        String resourceList = "G:\\filechunk\\";
        String mergPath = "G:\\merge\\haha.mp4";
        File resourceL = new File(resourceList);
        File mergeFile = new File(mergPath);
        if(mergeFile.exists()){
            mergeFile.delete();
        }
        boolean newFile = mergeFile.createNewFile();
        if(newFile){
            RandomAccessFile write =  new RandomAccessFile(mergeFile,"rw");
            write.seek(0);
            byte[] b = new byte[1024];
            File[] files = resourceL.listFiles();
            List<File> fileList = new ArrayList<>(Arrays.asList(files));
            Collections.sort(fileList, new Comparator<File>() {
                @Override
                public int compare(File o1, File o2) {
                    if(Integer.parseInt(o1.getName())<Integer.parseInt(o2.getName())){
                        return -1;
                    }
                    return 1;
                }
            });
            int len = -1;
            for (File f:fileList) {
                RandomAccessFile read = new RandomAccessFile(f,"r");
                while((len = read.read(b))!=-1){
                    write.write(b,0,len);
                }
                read.close();
            }
            write.close();
        }

    }
}
