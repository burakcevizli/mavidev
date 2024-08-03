package com.mavidev.mavidev.controller;

import com.mavidev.mavidev.entity.SehirIlce;
import com.mavidev.mavidev.service.SehirIlceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class SehirIlceController {

    @Autowired
    private SehirIlceService sehirIlceService;

    @PostMapping("/sehir-ilce-ekle")
    public SehirIlce ekleSehirIlce(@RequestBody SehirIlce sehirIlce){
        return sehirIlceService.ekleSehirIlce(sehirIlce);
    }

    @GetMapping("/sehir-listele")
    public List<SehirIlce> getirSehirIlce(){
        return sehirIlceService.getirSehirIlce();
    }

}
