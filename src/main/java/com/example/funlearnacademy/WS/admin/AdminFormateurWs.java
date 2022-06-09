package com.example.funlearnacademy.WS.admin;

import com.example.funlearnacademy.bean.Formateur;
import com.example.funlearnacademy.service.FormateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;


@RestController
@RequestMapping("admin/formateur")
public class AdminFormateurWs {
    @Autowired
    private FormateurService formateurService;

    @GetMapping("/ref/{ref}")
    public Formateur findByRef(@PathVariable String ref) {
        return formateurService.findByRef(ref);
    }

    @PostMapping("/")
    public Formateur save(@RequestBody Formateur formateur) throws Exception {
        return formateurService.save(formateur);
    }

    @PostMapping("/update")
    public Formateur update(@RequestBody Formateur formateur) {
        return formateurService.update(formateur);
    }

    @GetMapping("/")
    public List<Formateur> findAll() {
        return formateurService.findAll();
    }

    @DeleteMapping("/ref/{ref}")
    public int deleteByRef(@PathVariable String ref) {
        return formateurService.deleteByRef(ref);
    }


    @DeleteMapping("/id/{aLong}")
    public void deleteById(@PathVariable Long aLong) {
        formateurService.deleteById(aLong);
    }
}
