package com.ga.modules.monitor;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Explain:监控中心
 * Author: linjianhai
 * Date: 2022/5/24 18:13
 */
@EnableAdminServer
@SpringBootApplication
public class GaMonitorApplication {
    public static void main(String[] args)
    {
        SpringApplication.run(GaMonitorApplication.class, args);
        System.out.println("监控中心启动成功\n" +
                "                                                       _   _                                                                   \n" +
                "                                                      (_) | |                                                                  \n" +
                "   __ _    __ _   ______   _ __ ___     ___    _ __    _  | |_    ___    _ __     ___   _   _    ___    ___    ___   ___   ___ \n" +
                "  / _` |  / _` | |______| | '_ ` _ \\   / _ \\  | '_ \\  | | | __|  / _ \\  | '__|   / __| | | | |  / __|  / __|  / _ \\ / __| / __|\n" +
                " | (_| | | (_| |          | | | | | | | (_) | | | | | | | | |_  | (_) | | |      \\__ \\ | |_| | | (__  | (__  |  __/ \\__ \\ \\__ \\\n" +
                "  \\__, |  \\__,_|          |_| |_| |_|  \\___/  |_| |_| |_|  \\__|  \\___/  |_|      |___/  \\__,_|  \\___|  \\___|  \\___| |___/ |___/\n" +
                "   __/ |                                                                                                                       \n" +
                "  |___/                                                                                                                        ");
    }
}
