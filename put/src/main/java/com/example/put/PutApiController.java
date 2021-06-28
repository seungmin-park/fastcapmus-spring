package com.example.put;

import com.example.put.dto.PutRequestDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PutApiController {

    @PutMapping("/put/{userId}")
    public PutRequestDto put(@RequestBody PutRequestDto putRequestDto,@PathVariable Long userId){
        System.out.println(userId);
        System.out.println(putRequestDto);
        return putRequestDto;
    }
}
