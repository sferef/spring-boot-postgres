package router;/*
 * @project: spring-boot-postgres
 * @created: 2022/01/05 - 23:04
 * @author:  Luis Kevin Huaman Bolanger
 * @email:   lk.huaman@gmail.com
 */

import handler.ExpenseHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class RouterConfig {

    @Bean
    public RouterFunction<ServerResponse> expesnseRoutes (ExpenseHandler handler){
        return route(GET("/expenses")
                .and(accept(MediaType.APPLICATION_JSON)), handler:: getAll);
    }
}
