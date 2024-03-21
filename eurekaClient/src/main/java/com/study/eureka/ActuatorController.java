package com.study.eureka;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * packageName    : com.study.eureka
 * fileName       : ActuatorController
 * author         : heon
 * date           : 2024-03-21
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-21           heon               최초 생성
 */
@RestController
@RequestMapping("/actuator")
public class ActuatorController {
    @GetMapping("/info")
    public StatusResponse statusResponse(){
        StatusResponse response = new StatusResponse();
        response.setStatus("OK");
        return response;
    }
}
