package com.ga.auth;

import com.ga.common.security.annotation.EnableRyFeignClients;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * Explain:认证授权中心
 * Author: linjianhai
 * Date: 2022/5/25 14:37
 */
@EnableRyFeignClients
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class GaAuthApplication {
    public static void main(String[] args)
    {
        SpringApplication.run(GaAuthApplication.class, args);
        System.out.println("认证授权中心启动成功ﾞ  \n" +
                "                                           _     _                                                      \n" +
                "                                          | |   | |                                                     \n" +
                "   __ _    __ _   ______    __ _   _   _  | |_  | |__      ___   _   _    ___    ___    ___   ___   ___ \n" +
                "  / _` |  / _` | |______|  / _` | | | | | | __| | '_ \\    / __| | | | |  / __|  / __|  / _ \\ / __| / __|\n" +
                " | (_| | | (_| |          | (_| | | |_| | | |_  | | | |   \\__ \\ | |_| | | (__  | (__  |  __/ \\__ \\ \\__ \\\n" +
                "  \\__, |  \\__,_|           \\__,_|  \\__,_|  \\__| |_| |_|   |___/  \\__,_|  \\___|  \\___|  \\___| |___/ |___/\n" +
                "   __/ |                                                                                                \n" +
                "  |___/                                                                                                 ");
    }
}
