package com.cc.timeTask;

import com.cc.controller.FileController;
import com.cc.service.CrawlerService;
import com.cc.service.FileService;
import org.apache.log4j.Logger;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by cc on 2017/4/19.
 */

@Component
public class MyTimeTaskImpl implements MyTimeTask{
    @Resource
    private FileService fileService;
    @Resource
    private CrawlerService crawlerService;

    private static Logger log =Logger.getLogger(MyTimeTaskImpl.class);//    @Scheduled(cron="0/9 * * * * ?")
    // 每月2号凌晨两点执行
//    @Scheduled(cron="0 1 0 1 * ? ")
    @Scheduled(cron="0 0/3 * * * ? ")
    @Override
    public void upload_data20() {
        System.out.println("start time task");
        String filepath1=null;
        String filepath2=null;
        String filepath3=null;
        String filepath4=null;
        String upload_url = null;
        String info = null;
        Properties prop = new Properties();
        try {
            prop.load(MyTimeTaskImpl.class.getClassLoader().getResourceAsStream("file.properties"));
            filepath1=prop.getProperty("filepath1");
            filepath2=prop.getProperty("filepath2");
            filepath3=prop.getProperty("filepath3");
            filepath4=prop.getProperty("trianRPath20");
            upload_url=prop.getProperty("upload_url20");
            info=prop.getProperty("info");
        } catch(IOException e) {
            e.printStackTrace();
        }
        File file1 = new File(filepath1);
        File file2 = new File(filepath2);
        File file3 = new File(filepath3);
        File file4 = new File(filepath4);
        fileService.uploadFile(file1,upload_url,info);
        fileService.uploadFile(file2,upload_url,info);
        fileService.uploadFile(file3,upload_url,info);
        fileService.uploadFile(file4,upload_url,info);
        System.out.println("upload success20");
        log.info("upload success 20");

    }


//    @Scheduled(cron="0 1 0 1 * ? ")
    @Scheduled(cron="0 0/3 * * * ? ")
    @Override
    public void upload_data90() {
        System.out.println("start time task");
        String filepath1=null;
        String filepath2=null;
        String filepath3=null;
        String filepath4=null;
        String upload_url = null;
        String info = null;
        Properties prop = new Properties();
        try {
            prop.load(MyTimeTaskImpl.class.getClassLoader().getResourceAsStream("file.properties"));
            filepath1=prop.getProperty("filepath1");
            filepath2=prop.getProperty("filepath2");
            filepath3=prop.getProperty("filepath3");
            filepath4=prop.getProperty("trianRPath90");
            upload_url=prop.getProperty("upload_url90");
            info=prop.getProperty("info");
        } catch(IOException e) {
            e.printStackTrace();
        }
        File file1 = new File(filepath1);
        File file2 = new File(filepath2);
        File file3 = new File(filepath3);
        File file4 = new File(filepath4);
        fileService.uploadFile(file1,upload_url,info);
        fileService.uploadFile(file2,upload_url,info);
        fileService.uploadFile(file3,upload_url,info);
        fileService.uploadFile(file4,upload_url,info);
        System.out.println("upload success 90");
        log.info("upload success 90");
    }


    // 每月1号凌晨两点执行
//    @Scheduled(cron="0 0 0 1 * ? ")
    @Scheduled(cron="0 0/2 * * * ? ")
    public void crawlerData(){
        crawlerService.DataCrawler();
        log.info("Crawler data success");
    }


}
