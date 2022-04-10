package io.github.shubham24.StatusCodeMocker.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusCodeController {


//    //get mapping of 100 status code
//    @GetMapping("/100")
//    @ResponseStatus(HttpStatus.CONTINUE)
//    public String get100StatusCode(){
//        return HttpStatus.CONTINUE.toString();
//    }
//
//    //get mapping of 101 status code
//    @GetMapping("/101")
//    @ResponseStatus(HttpStatus.SWITCHING_PROTOCOLS)
//    public String get101StatusCode(){
//        return HttpStatus.SWITCHING_PROTOCOLS.toString();
//    }
//
//    //get mapping of 102 status code
//    @GetMapping("/102")
//    @ResponseStatus(HttpStatus.PROCESSING)
//    public String get102StatusCode(){
//        return HttpStatus.PROCESSING.toString();
//    }



    //get mapping of 200 status code
    @GetMapping("/200")
    @ResponseStatus(HttpStatus.OK)
    public String get200StatusCode(){
        return HttpStatus.OK.toString();
    }

    //get mapping of 201 status code
    @GetMapping("/201")
    @ResponseStatus(HttpStatus.CREATED)
    public String get201StatusCode(){
        return HttpStatus.CREATED.toString();
    }

    //get mapping of 202 status code
    @GetMapping("/202")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String get202StatusCode(){
        return HttpStatus.ACCEPTED.toString();
    }

    //get mapping of 203 status code
    @GetMapping("/203")
    @ResponseStatus(HttpStatus.NON_AUTHORITATIVE_INFORMATION)
    public String get203StatusCode(){
        return HttpStatus.NON_AUTHORITATIVE_INFORMATION.toString();
    }

    //get mapping of 204 status code
    @GetMapping("/204")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public String get204StatusCode(){
        return "204 NO_CONTENT";
        //return HttpStatus.NO_CONTENT.toString();
    }

    //get mapping of 205 status code
    @GetMapping("/205")
    @ResponseStatus(HttpStatus.RESET_CONTENT)
    public String get205StatusCode(){
        return HttpStatus.RESET_CONTENT.toString();
    }

    //get mapping of 206 status code
    @GetMapping("/206")
    @ResponseStatus(HttpStatus.PARTIAL_CONTENT)
    public String get206StatusCode(){
        return HttpStatus.PARTIAL_CONTENT.toString();
    }

    //get mapping of 207 status code
    @GetMapping("/207")
    @ResponseStatus(HttpStatus.MULTI_STATUS)
    public String get207StatusCode(){
        return HttpStatus.MULTI_STATUS.toString();
    }

    //get mapping of 208 status code
    @GetMapping("/208")
    @ResponseStatus(HttpStatus.ALREADY_REPORTED)
    public String get208StatusCode(){
        return HttpStatus.ALREADY_REPORTED.toString();
    }

    //get mapping of 226 status code
    @GetMapping("/226")
    @ResponseStatus(HttpStatus.IM_USED)
    public String get226StatusCode(){
        return HttpStatus.IM_USED.toString();
    }

    //get mapping of 300 status code
    @GetMapping("/300")
    @ResponseStatus(HttpStatus.MULTIPLE_CHOICES)
    public String get300StatusCode(){
        return HttpStatus.MULTIPLE_CHOICES.toString();
    }

    //get mapping of 301 status code
    @GetMapping("/301")
    @ResponseStatus(HttpStatus.MOVED_PERMANENTLY)
    public String get301StatusCode(){
        return HttpStatus.MOVED_PERMANENTLY.toString();
    }

    //get mapping of 302 status code
    @GetMapping("/302")
    @ResponseStatus(HttpStatus.FOUND)
    public String get302StatusCode(){
        return HttpStatus.FOUND.toString();
    }

    //get mapping of 303 status code
    @GetMapping("/303")
    @ResponseStatus(HttpStatus.SEE_OTHER)
    public String get303StatusCode(){
        return HttpStatus.SEE_OTHER.toString();
    }

    //get mapping of 304 status code
    @GetMapping("/304")
    @ResponseStatus(HttpStatus.NOT_MODIFIED)
    public String get304StatusCode(){
        return HttpStatus.NOT_MODIFIED.toString();
    }

    //get mapping of 305 status code
    @GetMapping("/305")
    @ResponseStatus(HttpStatus.USE_PROXY)
    public String get305StatusCode(){
        return HttpStatus.USE_PROXY.toString();
    }

    //get mapping of 307 status code
    @GetMapping("/307")
    @ResponseStatus(HttpStatus.TEMPORARY_REDIRECT)
    public String get307StatusCode(){
        return HttpStatus.TEMPORARY_REDIRECT.toString();
    }

    //get mapping of 308 status code
    @GetMapping("/308")
    @ResponseStatus(HttpStatus.PERMANENT_REDIRECT)
    public String get308StatusCode(){
        return HttpStatus.PERMANENT_REDIRECT.toString();
    }

    //get mapping of 400 status code
    @GetMapping("/400")
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String get400StatusCode(){
        return HttpStatus.BAD_REQUEST.toString();
    }

    //get mapping of 401 status code
    @GetMapping("/401")
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public String get401StatusCode(){
        return HttpStatus.UNAUTHORIZED.toString();
    }

    //get mapping of 402 status code
    @GetMapping("/402")
    @ResponseStatus(HttpStatus.PAYMENT_REQUIRED)
    public String get402StatusCode(){
        return HttpStatus.PAYMENT_REQUIRED.toString();
    }

    //get mapping of 403 status code
    @GetMapping("/403")
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public String get403StatusCode(){
        return HttpStatus.FORBIDDEN.toString();
    }

    //get mapping of 404 status code
    @GetMapping("/404")
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String get404StatusCode(){
        return HttpStatus.NOT_FOUND.toString();
    }

    //get mapping of 405 status code
    @GetMapping("/405")
    @ResponseStatus(HttpStatus.METHOD_NOT_ALLOWED)
    public String get405StatusCode(){
        return HttpStatus.METHOD_NOT_ALLOWED.toString();
    }

    //get mapping of 406 status code
    @GetMapping("/406")
    @ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
    public String get406StatusCode(){
        return HttpStatus.NOT_ACCEPTABLE.toString();
    }

    //get mapping of 407 status code
    @GetMapping("/407")
    @ResponseStatus(HttpStatus.PROXY_AUTHENTICATION_REQUIRED)
    public String get407StatusCode(){
        return HttpStatus.PROXY_AUTHENTICATION_REQUIRED.toString();
    }

    //get mapping of 408 status code
    @GetMapping("/408")
    @ResponseStatus(HttpStatus.REQUEST_TIMEOUT)
    public String get408StatusCode(){
        return HttpStatus.REQUEST_TIMEOUT.toString();
    }

    //get mapping of 409 status code
    @GetMapping("/409")
    @ResponseStatus(HttpStatus.CONFLICT)
    public String get409StatusCode(){
        return HttpStatus.CONFLICT.toString();
    }

    //get mapping of 410 status code
    @GetMapping("/410")
    @ResponseStatus(HttpStatus.GONE)
    public String get410StatusCode(){
        return HttpStatus.GONE.toString();
    }

    //get mapping of 411 status code
    @GetMapping("/411")
    @ResponseStatus(HttpStatus.LENGTH_REQUIRED)
    public String get411StatusCode(){
        return HttpStatus.LENGTH_REQUIRED.toString();
    }

    //get mapping of 412 status code
    @GetMapping("/412")
    @ResponseStatus(HttpStatus.PRECONDITION_FAILED)
    public String get412StatusCode(){
        return HttpStatus.PRECONDITION_FAILED.toString();
    }

    //get mapping of 413 status code
    @GetMapping("/413")
    @ResponseStatus(HttpStatus.REQUEST_ENTITY_TOO_LARGE)
    public String get413StatusCode(){
        return HttpStatus.REQUEST_ENTITY_TOO_LARGE.toString();
    }

    //get mapping of 414 status code
    @GetMapping("/414")
    @ResponseStatus(HttpStatus.REQUEST_URI_TOO_LONG)
    public String get414StatusCode(){
        return HttpStatus.REQUEST_URI_TOO_LONG.toString();
    }

    //get mapping of 415 status code
    @GetMapping("/415")
    @ResponseStatus(HttpStatus.UNSUPPORTED_MEDIA_TYPE)
    public String get415StatusCode(){
        return HttpStatus.UNSUPPORTED_MEDIA_TYPE.toString();
    }

    //get mapping of 416 status code
    @GetMapping("/416")
    @ResponseStatus(HttpStatus.REQUESTED_RANGE_NOT_SATISFIABLE)
    public String get416StatusCode(){
        return HttpStatus.REQUESTED_RANGE_NOT_SATISFIABLE.toString();
    }

    //get mapping of 417 status code
    @GetMapping("/417")
    @ResponseStatus(HttpStatus.EXPECTATION_FAILED)
    public String get417StatusCode(){
        return HttpStatus.EXPECTATION_FAILED.toString();
    }

    //get mapping of 418 status code
    @GetMapping("/418")
    @ResponseStatus(HttpStatus.I_AM_A_TEAPOT)
    public String get418StatusCode(){
        return HttpStatus.I_AM_A_TEAPOT.toString();
    }

    //get mapping of 422 status code
    @GetMapping("/422")
    @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
    public String get422StatusCode(){
        return HttpStatus.UNPROCESSABLE_ENTITY.toString();
    }

    //get mapping of 423 status code
    @GetMapping("/423")
    @ResponseStatus(HttpStatus.LOCKED)
    public String get423StatusCode(){
        return HttpStatus.LOCKED.toString();
    }

    //get mapping of 424 status code
    @GetMapping("/424")
    @ResponseStatus(HttpStatus.FAILED_DEPENDENCY)
    public String get424StatusCode(){
        return HttpStatus.FAILED_DEPENDENCY.toString();
    }

    //get mapping of 425 status code
    @GetMapping("/425")
    @ResponseStatus(HttpStatus.TOO_EARLY)
    public String get425StatusCode(){
        return HttpStatus.TOO_EARLY.toString();
    }

    //get mapping of 426 status code
    @GetMapping("/426")
    @ResponseStatus(HttpStatus.UPGRADE_REQUIRED)
    public String get426StatusCode(){
        return HttpStatus.UPGRADE_REQUIRED.toString();
    }

    //get mapping of 428 status code
    @GetMapping("/428")
    @ResponseStatus(HttpStatus.PRECONDITION_REQUIRED)
    public String get428StatusCode(){
        return HttpStatus.PRECONDITION_REQUIRED.toString();
    }

    //get mapping of 429 status code
    @GetMapping("/429")
    @ResponseStatus(HttpStatus.TOO_MANY_REQUESTS)
    public String get429StatusCode(){
        return HttpStatus.TOO_MANY_REQUESTS.toString();
    }

    //get mapping of 431 status code
    @GetMapping("/431")
    @ResponseStatus(HttpStatus.REQUEST_HEADER_FIELDS_TOO_LARGE)
    public String get431StatusCode(){
        return HttpStatus.REQUEST_HEADER_FIELDS_TOO_LARGE.toString();
    }

    //get mapping of 451 status code
    @GetMapping("/451")
    @ResponseStatus(HttpStatus.UNAVAILABLE_FOR_LEGAL_REASONS)
    public String get451StatusCode(){
        return HttpStatus.UNAVAILABLE_FOR_LEGAL_REASONS.toString();
    }

    //get mapping of 500 status code
    @GetMapping("/500")
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public String get500StatusCode(){
        return HttpStatus.INTERNAL_SERVER_ERROR.toString();
    }

    //get mapping of 501 status code
    @GetMapping("/501")
    @ResponseStatus(HttpStatus.NOT_IMPLEMENTED)
    public String get501StatusCode(){
        return HttpStatus.NOT_IMPLEMENTED.toString();
    }

    //get mapping of 502 status code
    @GetMapping("/502")
    @ResponseStatus(HttpStatus.BAD_GATEWAY)
    public String get502StatusCode(){
        return HttpStatus.BAD_GATEWAY.toString();
    }

    //get mapping of 503 status code
    @GetMapping("/503")
    @ResponseStatus(HttpStatus.SERVICE_UNAVAILABLE)
    public String get503StatusCode(){
        return HttpStatus.SERVICE_UNAVAILABLE.toString();
    }

    //get mapping of 504 status code
    @GetMapping("/504")
    @ResponseStatus(HttpStatus.GATEWAY_TIMEOUT)
    public String get504StatusCode(){
        return HttpStatus.GATEWAY_TIMEOUT.toString();
    }

    //get mapping of 505 status code
    @GetMapping("/505")
    @ResponseStatus(HttpStatus.HTTP_VERSION_NOT_SUPPORTED)
    public String get505StatusCode(){
        return HttpStatus.HTTP_VERSION_NOT_SUPPORTED.toString();
    }

    //get mapping of 506 status code
    @GetMapping("/506")
    @ResponseStatus(HttpStatus.VARIANT_ALSO_NEGOTIATES)
    public String get506StatusCode(){
        return HttpStatus.VARIANT_ALSO_NEGOTIATES.toString();
    }

    //get mapping of 507 status code
    @GetMapping("/507")
    @ResponseStatus(HttpStatus.INSUFFICIENT_STORAGE)
    public String get507StatusCode(){
        return HttpStatus.INSUFFICIENT_STORAGE.toString();
    }

    //get mapping of 508 status code
    @GetMapping("/508")
    @ResponseStatus(HttpStatus.LOOP_DETECTED)
    public String get508StatusCode(){
        return HttpStatus.LOOP_DETECTED.toString();
    }

    //get mapping of 510 status code
    @GetMapping("/510")
    @ResponseStatus(HttpStatus.NOT_EXTENDED)
    public String get510StatusCode(){
        return HttpStatus.NOT_EXTENDED.toString();
    }

    //get mapping of 511 status code
    @GetMapping("/511")
    @ResponseStatus(HttpStatus.NETWORK_AUTHENTICATION_REQUIRED)
    public String get511StatusCode(){
        return HttpStatus.NETWORK_AUTHENTICATION_REQUIRED.toString();
    }









}
