package resource;

import com.codahale.metrics.annotation.Timed;
import config.AppConfig;
import entity.PersonEntity;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.Optional;

/**
 * @Author Hariom Yadav
 * @create 5/21/2021
 */
@Path("/test-api")
@Produces(MediaType.APPLICATION_JSON)
@RequiredArgsConstructor
@Slf4j
public class MyResource {
    private final AppConfig config;

    @Timed //http://localhost:8081/metrics open and we can see how many times this end point is called and other imp info
    @GET
    public PersonEntity getResource(@QueryParam("name")Optional<String> name) {
        log.info("name = " + name);
        final String fetchName = name.orElseGet(() -> "hello stranger");
        return PersonEntity.builder().name(fetchName).address(config.getLocation()).build();
    }
}
