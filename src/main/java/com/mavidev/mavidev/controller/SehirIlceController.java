package com.mavidev.mavidev.controller;

import com.mavidev.mavidev.entity.SehirIlce;
import com.mavidev.mavidev.service.SehirIlceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SehirIlceController {

    @Autowired
    private SehirIlceService sehirIlceService;

    @PostMapping("/ekle")
    public SehirIlce ekleSehirIlce(@RequestBody SehirIlce sehirIlce){
        return sehirIlceService.ekleSehirIlce(sehirIlce);
    }

    @GetMapping("/getir")
    public List<SehirIlce> getirSehirIlce(){
        return sehirIlceService.getirSehirIlce();
    }

}
