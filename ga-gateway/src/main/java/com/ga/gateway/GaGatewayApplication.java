package com.ga.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * Explain:网关启动程序
 * Author: linjianhai
 * Date: 2022/5/24 9:22
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class GaGatewayApplication {
    public static void main(String[] args)
    {
        SpringApplication.run(GaGatewayApplication.class, args);
        System.out.println("GA网关启动成功\n" +
                "                                           _                                                                                      \n" +
                "                                          | |                                                                                     \n" +
                "   __ _    __ _   ______    __ _    __ _  | |_    ___  __      __   __ _   _   _     ___   _   _    ___    ___    ___   ___   ___ \n" +
                "  / _` |  / _` | |______|  / _` |  / _` | | __|  / _ \\ \\ \\ /\\ / /  / _` | | | | |   / __| | | | |  / __|  / __|  / _ \\ / __| / __|\n" +
                " | (_| | | (_| |          | (_| | | (_| | | |_  |  __/  \\ V  V /  | (_| | | |_| |   \\__ \\ | |_| | | (__  | (__  |  __/ \\__ \\ \\__ \\\n" +
                "  \\__, |  \\__,_|           \\__, |  \\__,_|  \\__|  \\___|   \\_/\\_/    \\__,_|  \\__, |   |___/  \\__,_|  \\___|  \\___|  \\___| |___/ |___/\n" +
                "   __/ |                    __/ |                                           __/ |                                                 \n" +
                "  |___/                    |___/                                           |___/                                                  ");
    }
}
