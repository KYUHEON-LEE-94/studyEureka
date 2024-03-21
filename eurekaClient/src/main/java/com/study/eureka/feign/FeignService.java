package com.study.eureka.feign;

import com.study.eureka.StatusResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * packageName    : com.study.eureka
 * fileName       : FeignService
 * author         : heon
 * date           : 2024-03-21
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-21           heon               최초 생성
 */
@FeignClient(name = "EUREKACLIENT") //eureka에 등록된 Application 이름
public interface FeignService {

    @GetMapping("/actuator/info")
    StatusResponse feignTest();
}