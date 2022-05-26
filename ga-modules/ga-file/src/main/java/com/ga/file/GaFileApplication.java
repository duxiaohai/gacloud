package com.ga.file;

import com.ga.common.swagger.annotation.EnableCustomSwagger2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * Explain:文件服务
 * Author: linjianhai
 * Date: 2022/5/24 14:54
 */
@EnableCustomSwagger2
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class GaFileApplication {
    public static void main(String[] args)
    {
        SpringApplication.run(GaFileApplication.class, args);
        System.out.println("文件服务模块启动成功\n" +
                "                            __   _   _                                                         \n" +
                "                           / _| (_) | |                                                        \n" +
                "   __ _    __ _   ______  | |_   _  | |   ___     ___   _   _    ___    ___    ___   ___   ___ \n" +
                "  / _` |  / _` | |______| |  _| | | | |  / _ \\   / __| | | | |  / __|  / __|  / _ \\ / __| / __|\n" +
                " | (_| | | (_| |          | |   | | | | |  __/   \\__ \\ | |_| | | (__  | (__  |  __/ \\__ \\ \\__ \\\n" +
                "  \\__, |  \\__,_|          |_|   |_| |_|  \\___|   |___/  \\__,_|  \\___|  \\___|  \\___| |___/ |___/\n" +
                "   __/ |                                                                                       \n" +
                "  |___/                                                                                        ");
    }
}
