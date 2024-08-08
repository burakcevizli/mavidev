package com.mavidev.mavidev.service;

import com.mavidev.mavidev.entity.SehirIlce;
import com.mavidev.mavidev.repository.SehirIlceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SehirIlceService {

    @Autowired
    private SehirIlceRepository sehirIlceRepository;

    public SehirIlce ekleSehirIlce(SehirIlce sehirIlce) {
        return sehirIlceRepository.save(sehirIlce);
    }

    public List<SehirIlce> getirSehirIlce() {
        return sehirIlceRepository.findAll();
    }

    public void silSehirIlce(int id) {
        if (sehirIlceRepository.existsById(id)) {
            sehirIlceRepository.deleteById(id);
        } else {
            throw new RuntimeException("Silinecek şehir ve ilçe bulunamadı.");
        }
    }

    public void hepsiniTemizle(){
        sehirIlceRepository.deleteAll();
    }


}
