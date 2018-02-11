package com.zx.intro.control;

import com.zx.intro.dao.MyDatasource;
import com.zx.intro.mapper.Ka03Mapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Configuration
public class GreetingController {
    private static final Logger logger = LoggerFactory.getLogger(GreetingController.class);
    private static final String template = "Hello, %s!";
    @Autowired
    private MyDatasource datasource;
    @Autowired
    private Ka03Mapper ka03Mapper;

    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) throws Exception {


        int int1 = ka03Mapper.count();
        logger.info("count:" + int1);


        //error<warn<info<debug<trace
        logger.info("转出成功");
        if (logger.isDebugEnabled()) {
            logger.debug("准备转出10000");
        }
        if (logger.isTraceEnabled()) {
            logger.trace("连接数据库");
            logger.trace("查询账户余额为12000");
        }
        if (logger.isDebugEnabled()) {
            logger.debug("检查转出账户...");
            logger.debug("转出检查成功");
            logger.debug("执行转出10000");
            logger.debug("转出成功");
        }
        logger.info("转入成功");
        System.out.println(datasource);
//        if ("World".equals(name)) {
//            throw new Exception();
//        }
        return String.format(template, name);
    }
}