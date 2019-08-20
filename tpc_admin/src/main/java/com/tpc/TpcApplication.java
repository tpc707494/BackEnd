package com.tpc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
* 启动程序
* @author TPC
* $data 2019-08-19 23:31
*/
@SpringBootApplication
public class TpcApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(TpcApplication.class, args);
        System.out.println("项目启动成功");
    }
}
