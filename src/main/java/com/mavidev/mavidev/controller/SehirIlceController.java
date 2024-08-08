package com.mavidev.mavidev.controller;

import com.mavidev.mavidev.entity.SehirIlce;
import com.mavidev.mavidev.service.SehirIlceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/sehir-ilce") // Ekledim
public class SehirIlceController {

    @Autowired
    private SehirIlceService sehirIlceService;

    @PostMapping("/ekle")
    public SehirIlce ekleSehirIlce(@RequestBody SehirIlce sehirIlce) {
        return sehirIlceService.ekleSehirIlce(sehirIlce);
    }

    @GetMapping("/listele")
    public List<SehirIlce> getirSehirIlce() {
        return sehirIlceService.getirSehirIlce();
    }

    @DeleteMapping("/sil/{id}")
    public void sehirIlceSil(@PathVariable int id) {
        sehirIlceService.silSehirIlce(id);
    }

    @DeleteMapping("/sil/hepsi")
    public void hepsiniSil(){
        sehirIlceService.hepsiniTemizle();
    }
}
