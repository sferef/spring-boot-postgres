package com.fluxdatareactor.moneymanager.router;/*
 * @project: spring-boot-postgres
 * @created: 2022/01/05 - 23:04
 * @author:  Luis Kevin Huaman Bolanger
 * @email:   lk.huaman@gmail.com
 */

import com.fluxdatareactor.moneymanager.handler.ExpenseHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.RequestPredicates;


@Configuration
public class RouterConfig {

    @Bean
    public RouterFunction<ServerResponse> expesnseRoutes (ExpenseHandler handler){
        return RouterFunctions.route(RequestPredicates.GET("/expenses"), handler:: getAll);
    }
}
