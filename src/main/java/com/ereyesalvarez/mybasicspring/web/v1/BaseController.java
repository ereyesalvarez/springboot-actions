package com.ereyesalvarez.mybasicspring.web.v1;

import com.ereyesalvarez.mybasicspring.dto.common.CommonOut;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class BaseController {
    @GetMapping
    public ResponseEntity<CommonOut> baseEndpoint(){
        return ResponseEntity.status(HttpStatus.OK).body(new CommonOut("OK"));
    }
}
