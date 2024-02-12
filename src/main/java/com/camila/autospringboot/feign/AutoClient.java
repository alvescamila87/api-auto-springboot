package com.camila.autospringboot.feign;

import com.camila.autospringboot.domain.Auto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "auto-api", url = "https://auto-example-api.s3.us-east-2.amazonaws.com/")
public interface AutoClient {
    @GetMapping("/autos.json")
    List<Auto> getAutos();

}
