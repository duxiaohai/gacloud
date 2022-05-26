package com.ga.job;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.ga.common.security.annotation.EnableCustomConfig;
import com.ga.common.security.annotation.EnableRyFeignClients;
import com.ga.common.swagger.annotation.EnableCustomSwagger2;

/**
 * 定时任务
 *
 * @author linjianhai
 */
@EnableCustomConfig
@EnableCustomSwagger2
@EnableRyFeignClients
@SpringBootApplication
public class GaJobApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(GaJobApplication.class, args);
        System.out.println("定时任务模块启动成功\n" +
                "                             _           _                                                      \n" +
                "                            (_)         | |                                                     \n" +
                "   __ _    __ _   ______     _    ___   | |__      ___   _   _    ___    ___    ___   ___   ___ \n" +
                "  / _` |  / _` | |______|   | |  / _ \\  | '_ \\    / __| | | | |  / __|  / __|  / _ \\ / __| / __|\n" +
                " | (_| | | (_| |            | | | (_) | | |_) |   \\__ \\ | |_| | | (__  | (__  |  __/ \\__ \\ \\__ \\\n" +
                "  \\__, |  \\__,_|            | |  \\___/  |_.__/    |___/  \\__,_|  \\___|  \\___|  \\___| |___/ |___/\n" +
                "   __/ |                   _/ |                                                                 \n" +
                "  |___/                   |__/                                                                  ");
    }
}
