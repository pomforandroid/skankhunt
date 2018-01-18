package com.swz.skankhunt.web;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private Logger logger = LogManager.getLogger(HelloController.class);

    @RequestMapping("/hello")
    public String index(){
        showLog();
        return "大吉大利，今晚吃鸡!";

    }

    //测试异常处理
    @RequestMapping("/json")
    public String json() throws Exception {
        throw new Exception("发生错误2");
    }

    public void showLog() {
       // for(int i=0;i<100000000;i++) {
            logger.debug("我是DEBUG日志");
            logger.info("我是INFO日志");
            logger.warn("我是WARN日志");
            logger.error("我是ERROR日志");
            //Marker marker = MarkerManager.getMarker("test");
//        logger.error(marker,"我是ERROR日志");

            logger.fatal("我是FATAL日志");
        //}
    }

}
