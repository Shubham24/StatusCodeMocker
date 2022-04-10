package io.github.shubham24.StatusCodeMocker.Controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest(webEnvironment =  WebEnvironment.RANDOM_PORT)
public class StatusCodeControllerTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;


//    @Test
//    public void get100() {
//        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/100", String.class))
//                .isEqualTo("100 CONTINUE");
//        assertThat(this.restTemplate.getForEntity("http://localhost:" + port + "/100", String.class).
//                getStatusCode()).isEqualTo(HttpStatus.CONTINUE);
//    }
//
//    @Test
//    public void get101() {
//        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/101", String.class))
//                .isEqualTo("101 SWITCHING_PROTOCOLS");
//        assertThat(this.restTemplate.getForEntity("http://localhost:" + port + "/101", String.class).
//                getStatusCode()).isEqualTo(HttpStatus.SWITCHING_PROTOCOLS);
//    }
//
//    @Test
//    public void get102() {
//        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/102", String.class))
//                .isEqualTo("101 SWITCHING_PROTOCOLS");
//        assertThat(this.restTemplate.getForEntity("http://localhost:" + port + "/102", String.class).
//                getStatusCode()).isEqualTo(HttpStatus.SWITCHING_PROTOCOLS);
//    }

    @Test
    public void get200() {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/200", String.class))
                .isEqualTo("200 OK");
        assertThat(this.restTemplate.getForEntity("http://localhost:" + port + "/200", String.class).
                getStatusCode()).isEqualTo(HttpStatus.OK);
    }

    @Test
    public void get201() {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/201", String.class))
                .isEqualTo("201 CREATED");
        assertThat(this.restTemplate.getForEntity("http://localhost:" + port + "/201", String.class).
                getStatusCode()).isEqualTo(HttpStatus.CREATED);
    }

    @Test
    public void get202() {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/202", String.class))
                .isEqualTo("202 ACCEPTED");
        assertThat(this.restTemplate.getForEntity("http://localhost:" + port + "/202", String.class).
                getStatusCode()).isEqualTo(HttpStatus.ACCEPTED);
    }

    @Test
    public void get203() {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/203", String.class))
                .isEqualTo("203 NON_AUTHORITATIVE_INFORMATION");
        assertThat(this.restTemplate.getForEntity("http://localhost:" + port + "/203", String.class).
                getStatusCode()).isEqualTo(HttpStatus.NON_AUTHORITATIVE_INFORMATION);
    }

    @Test
    public void get204() {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/204", String.class))
                .isEqualTo(null);
        assertThat(this.restTemplate.getForEntity("http://localhost:" + port + "/204", String.class).
                getStatusCode()).isEqualTo(HttpStatus.NO_CONTENT);
    }

    @Test
    public void get205() {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/205", String.class))
                .isEqualTo(null);
        assertThat(this.restTemplate.getForEntity("http://localhost:" + port + "/205", String.class).
                getStatusCode()).isEqualTo(HttpStatus.RESET_CONTENT);
    }

    @Test
    public void get206() {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/206", String.class))
                .isEqualTo("206 PARTIAL_CONTENT");
        assertThat(this.restTemplate.getForEntity("http://localhost:" + port + "/206", String.class).
                getStatusCode()).isEqualTo(HttpStatus.PARTIAL_CONTENT);
    }

    @Test
    public void get207() {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/207", String.class))
                .isEqualTo("207 MULTI_STATUS");
        assertThat(this.restTemplate.getForEntity("http://localhost:" + port + "/207", String.class).
                getStatusCode()).isEqualTo(HttpStatus.MULTI_STATUS);
    }

    @Test
    public void get208() {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/208", String.class))
                .isEqualTo("208 ALREADY_REPORTED");
        assertThat(this.restTemplate.getForEntity("http://localhost:" + port + "/208", String.class).
                getStatusCode()).isEqualTo(HttpStatus.ALREADY_REPORTED);
    }

    @Test
    public void get226() {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/226", String.class))
                .isEqualTo("226 IM_USED");
        assertThat(this.restTemplate.getForEntity("http://localhost:" + port + "/226", String.class).
                getStatusCode()).isEqualTo(HttpStatus.IM_USED);
    }

    @Test
    public void get300() {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/300", String.class))
                .isEqualTo("300 MULTIPLE_CHOICES");
        assertThat(this.restTemplate.getForEntity("http://localhost:" + port + "/300", String.class).
                getStatusCode()).isEqualTo(HttpStatus.MULTIPLE_CHOICES);
    }

    @Test
    public void get301() {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/301", String.class))
                .isEqualTo("301 MOVED_PERMANENTLY");
        assertThat(this.restTemplate.getForEntity("http://localhost:" + port + "/301", String.class).
                getStatusCode()).isEqualTo(HttpStatus.MOVED_PERMANENTLY);
    }

    @Test
    public void get302() {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/302", String.class))
                .isEqualTo("302 FOUND");
        assertThat(this.restTemplate.getForEntity("http://localhost:" + port + "/302", String.class).
                getStatusCode()).isEqualTo(HttpStatus.FOUND);
    }

    @Test
    public void get303() {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/303", String.class))
                .isEqualTo("303 SEE_OTHER");
        assertThat(this.restTemplate.getForEntity("http://localhost:" + port + "/303", String.class).
                getStatusCode()).isEqualTo(HttpStatus.SEE_OTHER);
    }

    @Test
    public void get304() {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/304", String.class))
                .isEqualTo(null);
        assertThat(this.restTemplate.getForEntity("http://localhost:" + port + "/304", String.class).
                getStatusCode()).isEqualTo(HttpStatus.NOT_MODIFIED);
    }

    @Test
    public void get305() {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/305", String.class))
                .isEqualTo("305 USE_PROXY");
        assertThat(this.restTemplate.getForEntity("http://localhost:" + port + "/305", String.class).
                getStatusCode()).isEqualTo(HttpStatus.USE_PROXY);
    }

    @Test
    public void get307() {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/307", String.class))
                .isEqualTo("307 TEMPORARY_REDIRECT");
        assertThat(this.restTemplate.getForEntity("http://localhost:" + port + "/307", String.class).
                getStatusCode()).isEqualTo(HttpStatus.TEMPORARY_REDIRECT);
    }

    @Test
    public void get308() {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/308", String.class))
                .isEqualTo("308 PERMANENT_REDIRECT");
        assertThat(this.restTemplate.getForEntity("http://localhost:" + port + "/308", String.class).
                getStatusCode()).isEqualTo(HttpStatus.PERMANENT_REDIRECT);
    }

    @Test
    public void get400() {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/400", String.class))
                .isEqualTo("400 BAD_REQUEST");
        assertThat(this.restTemplate.getForEntity("http://localhost:" + port + "/400", String.class).
                getStatusCode()).isEqualTo(HttpStatus.BAD_REQUEST);
    }

    @Test
    public void get401() {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/401", String.class))
                .isEqualTo("401 UNAUTHORIZED");
        assertThat(this.restTemplate.getForEntity("http://localhost:" + port + "/401", String.class).
                getStatusCode()).isEqualTo(HttpStatus.UNAUTHORIZED);
    }

    @Test
    public void get402() {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/402", String.class))
                .isEqualTo("402 PAYMENT_REQUIRED");
        assertThat(this.restTemplate.getForEntity("http://localhost:" + port + "/402", String.class).
                getStatusCode()).isEqualTo(HttpStatus.PAYMENT_REQUIRED);
    }

    @Test
    public void get403() {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/403", String.class))
                .isEqualTo("403 FORBIDDEN");
        assertThat(this.restTemplate.getForEntity("http://localhost:" + port + "/403", String.class).
                getStatusCode()).isEqualTo(HttpStatus.FORBIDDEN);
    }

    @Test
    public void get404() {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/404", String.class))
                .isEqualTo("404 NOT_FOUND");
        assertThat(this.restTemplate.getForEntity("http://localhost:" + port + "/404", String.class).
                getStatusCode()).isEqualTo(HttpStatus.NOT_FOUND);
    }

    @Test
    public void get405() {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/405", String.class))
                .isEqualTo("405 METHOD_NOT_ALLOWED");
        assertThat(this.restTemplate.getForEntity("http://localhost:" + port + "/405", String.class).
                getStatusCode()).isEqualTo(HttpStatus.METHOD_NOT_ALLOWED);
    }

    @Test
    public void get406() {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/406", String.class))
                .isEqualTo("406 NOT_ACCEPTABLE");
        assertThat(this.restTemplate.getForEntity("http://localhost:" + port + "/406", String.class).
                getStatusCode()).isEqualTo(HttpStatus.NOT_ACCEPTABLE);
    }

    @Test
    public void get407() {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/407", String.class))
                .isEqualTo("407 PROXY_AUTHENTICATION_REQUIRED");
        assertThat(this.restTemplate.getForEntity("http://localhost:" + port + "/407", String.class).
                getStatusCode()).isEqualTo(HttpStatus.PROXY_AUTHENTICATION_REQUIRED);
    }

    @Test
    public void get408() {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/408", String.class))
                .isEqualTo("408 REQUEST_TIMEOUT");
        assertThat(this.restTemplate.getForEntity("http://localhost:" + port + "/408", String.class).
                getStatusCode()).isEqualTo(HttpStatus.REQUEST_TIMEOUT);
    }

    @Test
    public void get409() {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/409", String.class))
                .isEqualTo("409 CONFLICT");
        assertThat(this.restTemplate.getForEntity("http://localhost:" + port + "/409", String.class).
                getStatusCode()).isEqualTo(HttpStatus.CONFLICT);
    }

    @Test
    public void get410() {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/410", String.class))
                .isEqualTo("410 GONE");
        assertThat(this.restTemplate.getForEntity("http://localhost:" + port + "/410", String.class).
                getStatusCode()).isEqualTo(HttpStatus.GONE);
    }

    @Test
    public void get411() {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/411", String.class))
                .isEqualTo("411 LENGTH_REQUIRED");
        assertThat(this.restTemplate.getForEntity("http://localhost:" + port + "/411", String.class).
                getStatusCode()).isEqualTo(HttpStatus.LENGTH_REQUIRED);
    }

    @Test
    public void get412() {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/412", String.class))
                .isEqualTo("412 PRECONDITION_FAILED");
        assertThat(this.restTemplate.getForEntity("http://localhost:" + port + "/412", String.class).
                getStatusCode()).isEqualTo(HttpStatus.PRECONDITION_FAILED);
    }

    @Test
    public void get413() {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/413", String.class))
                .isEqualTo("413 REQUEST_ENTITY_TOO_LARGE");
        assertThat(this.restTemplate.getForEntity("http://localhost:" + port + "/413", String.class).
                getStatusCode()).isEqualTo(HttpStatus.PAYLOAD_TOO_LARGE);
    }

    @Test
    public void get414() {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/414", String.class))
                .isEqualTo("414 REQUEST_URI_TOO_LONG");
        assertThat(this.restTemplate.getForEntity("http://localhost:" + port + "/414", String.class).
                getStatusCode()).isEqualTo(HttpStatus.URI_TOO_LONG);
    }

    @Test
    public void get415() {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/415", String.class))
                .isEqualTo("415 UNSUPPORTED_MEDIA_TYPE");
        assertThat(this.restTemplate.getForEntity("http://localhost:" + port + "/415", String.class).
                getStatusCode()).isEqualTo(HttpStatus.UNSUPPORTED_MEDIA_TYPE);
    }

    @Test
    public void get416() {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/416", String.class))
                .isEqualTo("416 REQUESTED_RANGE_NOT_SATISFIABLE");
        assertThat(this.restTemplate.getForEntity("http://localhost:" + port + "/416", String.class).
                getStatusCode()).isEqualTo(HttpStatus.REQUESTED_RANGE_NOT_SATISFIABLE);
    }

    @Test
    public void get417() {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/417", String.class))
                .isEqualTo("417 EXPECTATION_FAILED");
        assertThat(this.restTemplate.getForEntity("http://localhost:" + port + "/417", String.class).
                getStatusCode()).isEqualTo(HttpStatus.EXPECTATION_FAILED);
    }


    @Test
    public void get418() {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/418", String.class))
                .isEqualTo("418 I_AM_A_TEAPOT");
        assertThat(this.restTemplate.getForEntity("http://localhost:" + port + "/418", String.class).
                getStatusCode()).isEqualTo(HttpStatus.I_AM_A_TEAPOT);
    }

    @Test
    public void get422() {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/422", String.class))
                .isEqualTo("422 UNPROCESSABLE_ENTITY");
        assertThat(this.restTemplate.getForEntity("http://localhost:" + port + "/422", String.class).
                getStatusCode()).isEqualTo(HttpStatus.UNPROCESSABLE_ENTITY);
    }

    @Test
    public void get423() {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/423", String.class))
                .isEqualTo("423 LOCKED");
        assertThat(this.restTemplate.getForEntity("http://localhost:" + port + "/423", String.class).
                getStatusCode()).isEqualTo(HttpStatus.LOCKED);
    }

    @Test
    public void get424() {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/424", String.class))
                .isEqualTo("424 FAILED_DEPENDENCY");
        assertThat(this.restTemplate.getForEntity("http://localhost:" + port + "/424", String.class).
                getStatusCode()).isEqualTo(HttpStatus.FAILED_DEPENDENCY);
    }

    @Test
    public void get426() {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/426", String.class))
                .isEqualTo("426 UPGRADE_REQUIRED");
        assertThat(this.restTemplate.getForEntity("http://localhost:" + port + "/426", String.class).
                getStatusCode()).isEqualTo(HttpStatus.UPGRADE_REQUIRED);
    }

    @Test
    public void get428() {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/428", String.class))
                .isEqualTo("428 PRECONDITION_REQUIRED");
        assertThat(this.restTemplate.getForEntity("http://localhost:" + port + "/428", String.class).
                getStatusCode()).isEqualTo(HttpStatus.PRECONDITION_REQUIRED);
    }

    @Test
    public void get429() {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/429", String.class))
                .isEqualTo("429 TOO_MANY_REQUESTS");
        assertThat(this.restTemplate.getForEntity("http://localhost:" + port + "/429", String.class).
                getStatusCode()).isEqualTo(HttpStatus.TOO_MANY_REQUESTS);
    }

    @Test
    public void get431() {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/431", String.class))
                .isEqualTo("431 REQUEST_HEADER_FIELDS_TOO_LARGE");
        assertThat(this.restTemplate.getForEntity("http://localhost:" + port + "/431", String.class).
                getStatusCode()).isEqualTo(HttpStatus.REQUEST_HEADER_FIELDS_TOO_LARGE);
    }

    @Test
    public void get451() {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/451", String.class))
                .isEqualTo("451 UNAVAILABLE_FOR_LEGAL_REASONS");
        assertThat(this.restTemplate.getForEntity("http://localhost:" + port + "/451", String.class).
                getStatusCode()).isEqualTo(HttpStatus.UNAVAILABLE_FOR_LEGAL_REASONS);
    }

    @Test
    public void get500() {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/500", String.class))
                .isEqualTo("500 INTERNAL_SERVER_ERROR");
        assertThat(this.restTemplate.getForEntity("http://localhost:" + port + "/500", String.class).
                getStatusCode()).isEqualTo(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @Test
    public void get501() {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/501", String.class))
                .isEqualTo("501 NOT_IMPLEMENTED");
        assertThat(this.restTemplate.getForEntity("http://localhost:" + port + "/501", String.class).
                getStatusCode()).isEqualTo(HttpStatus.NOT_IMPLEMENTED);
    }

    @Test
    public void get502() {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/502", String.class))
                .isEqualTo("502 BAD_GATEWAY");
        assertThat(this.restTemplate.getForEntity("http://localhost:" + port + "/502", String.class).
                getStatusCode()).isEqualTo(HttpStatus.BAD_GATEWAY);
    }

    @Test
    public void get503() {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/503", String.class))
                .isEqualTo("503 SERVICE_UNAVAILABLE");
        assertThat(this.restTemplate.getForEntity("http://localhost:" + port + "/503", String.class).
                getStatusCode()).isEqualTo(HttpStatus.SERVICE_UNAVAILABLE);
    }

    @Test
    public void get504() {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/504", String.class))
                .isEqualTo("504 GATEWAY_TIMEOUT");
        assertThat(this.restTemplate.getForEntity("http://localhost:" + port + "/504", String.class).
                getStatusCode()).isEqualTo(HttpStatus.GATEWAY_TIMEOUT);
    }

    @Test
    public void get505() {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/505", String.class))
                .isEqualTo("505 HTTP_VERSION_NOT_SUPPORTED");
        assertThat(this.restTemplate.getForEntity("http://localhost:" + port + "/505", String.class).
                getStatusCode()).isEqualTo(HttpStatus.HTTP_VERSION_NOT_SUPPORTED);
    }

    @Test
    public void get506() {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/506", String.class))
                .isEqualTo("506 VARIANT_ALSO_NEGOTIATES");
        assertThat(this.restTemplate.getForEntity("http://localhost:" + port + "/506", String.class).
                getStatusCode()).isEqualTo(HttpStatus.VARIANT_ALSO_NEGOTIATES);
    }

    @Test
    public void get507() {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/507", String.class))
                .isEqualTo("507 INSUFFICIENT_STORAGE");
        assertThat(this.restTemplate.getForEntity("http://localhost:" + port + "/507", String.class).
                getStatusCode()).isEqualTo(HttpStatus.INSUFFICIENT_STORAGE);
    }

    @Test
    public void get508() {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/508", String.class))
                .isEqualTo("508 LOOP_DETECTED");
        assertThat(this.restTemplate.getForEntity("http://localhost:" + port + "/508", String.class).
                getStatusCode()).isEqualTo(HttpStatus.LOOP_DETECTED);
    }

    @Test
    public void get510() {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/510", String.class))
                .isEqualTo("510 NOT_EXTENDED");
        assertThat(this.restTemplate.getForEntity("http://localhost:" + port + "/510", String.class).
                getStatusCode()).isEqualTo(HttpStatus.NOT_EXTENDED);
    }

    @Test
    public void get511() {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/511", String.class))
                .isEqualTo("511 NETWORK_AUTHENTICATION_REQUIRED");
        assertThat(this.restTemplate.getForEntity("http://localhost:" + port + "/511", String.class).
                getStatusCode()).isEqualTo(HttpStatus.NETWORK_AUTHENTICATION_REQUIRED);
    }

}
