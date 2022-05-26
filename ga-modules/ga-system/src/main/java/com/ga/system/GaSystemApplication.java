package com.ga.system;

import com.ga.common.security.annotation.EnableCustomConfig;
import com.ga.common.security.annotation.EnableRyFeignClients;
import com.ga.common.swagger.annotation.EnableCustomSwagger2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Explain:系统模块
 * Author: linjianhai
 * Date: 2022/5/24 17:35
 */
@EnableCustomConfig
@EnableCustomSwagger2
@EnableRyFeignClients
@SpringBootApplication
public class GaSystemApplication {
    public static void main(String[] args)
    {
        SpringApplication.run(GaSystemApplication.class, args);
        System.out.println("系统模块启动成功\n" +
                "                                               _                                                                       \n" +
                "                                              | |                                                                      \n" +
                "   __ _    __ _   ______   ___   _   _   ___  | |_    ___   _ __ ___      ___   _   _    ___    ___    ___   ___   ___ \n" +
                "  / _` |  / _` | |______| / __| | | | | / __| | __|  / _ \\ | '_ ` _ \\    / __| | | | |  / __|  / __|  / _ \\ / __| / __|\n" +
                " | (_| | | (_| |          \\__ \\ | |_| | \\__ \\ | |_  |  __/ | | | | | |   \\__ \\ | |_| | | (__  | (__  |  __/ \\__ \\ \\__ \\\n" +
                "  \\__, |  \\__,_|          |___/  \\__, | |___/  \\__|  \\___| |_| |_| |_|   |___/  \\__,_|  \\___|  \\___|  \\___| |___/ |___/\n" +
                "   __/ |                          __/ |                                                                                \n" +
                "  |___/                          |___/                                                                                 ");
    }
}
