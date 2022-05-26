package com.ga.gen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.ga.common.security.annotation.EnableCustomConfig;
import com.ga.common.security.annotation.EnableRyFeignClients;
import com.ga.common.swagger.annotation.EnableCustomSwagger2;

/**
 * 代码生成
 *
 * @author linjianhai
 */
@EnableCustomConfig
@EnableCustomSwagger2
@EnableRyFeignClients
@SpringBootApplication
public class GaGenApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(GaGenApplication.class, args);
        System.out.println("文件服务模块启动成功\n" +
                "                                                                                                 \n" +
                "                                                                                                 \n" +
                "   __ _    __ _   ______    __ _    ___   _ __      ___   _   _    ___    ___    ___   ___   ___ \n" +
                "  / _` |  / _` | |______|  / _` |  / _ \\ | '_ \\    / __| | | | |  / __|  / __|  / _ \\ / __| / __|\n" +
                " | (_| | | (_| |          | (_| | |  __/ | | | |   \\__ \\ | |_| | | (__  | (__  |  __/ \\__ \\ \\__ \\\n" +
                "  \\__, |  \\__,_|           \\__, |  \\___| |_| |_|   |___/  \\__,_|  \\___|  \\___|  \\___| |___/ |___/\n" +
                "   __/ |                    __/ |                                                                \n" +
                "  |___/                    |___/                                                                 ");
    }
}
