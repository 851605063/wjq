package com.wjq.getfile;


import com.wjq.getfile.serverices.FtpUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

@SpringBootTest
class GetfileApplicationTests {

    @Test
    void contextLoads()  {
        //ftp服务器IP地址
        String ftpHost = "192.168.148.135";
        //ftp服务器端口
        int ftpPort = 21;
        //ftp服务器用户名
        String ftpUserName = "wjq";
        //ftp服务器密码
        String ftpPassword = "wjq";
        //ftp服务器路径
        String ftpPath = "//home//wjq//test//";
        //本地路径
        String localPath = "D://test//";
        //文件名
        String fileName = "王家琪.txt";


        //下载
        //将ftp根目录下的文件下载至E盘
        FtpUtil.downloadFtpFile(ftpHost, ftpUserName, ftpPassword, ftpPort, ftpPath, localPath, fileName);

        //上传
        //将E盘的文件上传至ftp根目录
//        try {
//            FileInputStream in=new FileInputStream(new File(localPath + fileName));
//            FtpUtil.uploadFile(ftpHost, ftpPort, ftpUserName, ftpPassword,  ftpPath, fileName, in);
//        }
//        catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
        //删除
        //删除ftp根目录下的文件
        //FtpUtil.deleteFile(ftpHost, ftpPort, ftpUserName, ftpPassword, "ftpdir/", "2.docx");

    }

}
