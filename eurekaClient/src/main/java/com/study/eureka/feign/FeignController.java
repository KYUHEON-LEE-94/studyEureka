package com.study.eureka.feign;

import com.study.eureka.StatusResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * packageName    : com.study.eureka.feign
 * fileName       : FeignController
 * author         : heon
 * date           : 2024-03-21
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-21           heon               최초 생성
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/test")
public class FeignController {
    private final FeignService service;

    @GetMapping("/feign")
    public String feignTest() {
        StatusResponse response = service.feignTest();
        return response.getStatus();
    }
}
