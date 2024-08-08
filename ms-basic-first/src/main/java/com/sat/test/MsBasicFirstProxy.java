package com.sat.test;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@FeignClient(name="MS-BASIC-SECOND")
public interface MsBasicFirstProxy {
	@GetMapping("/second")
    public String getSecondMS();
}
