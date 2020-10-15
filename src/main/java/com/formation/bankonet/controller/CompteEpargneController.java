package com.formation.bankonet.controller;

import com.formation.bankonet.models.CompteEpargne;
import com.formation.bankonet.repositories.CompteEpargneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller // This means that this class is a Controller
@RequestMapping(path="/compteEpargne")
public class CompteEpargneController {
    @Autowired

    private CompteEpargneRepository compteEpargneRepository;

    /*
            CompteEpargne Handling

            addNewCompteEpargne -> POST

            getCompteEpargneList -> GET
     */
    @PostMapping(path="/addCompteEpargne") // Map ONLY POST Requests
    public @ResponseBody
    String addNewCompteEpargne (@RequestParam String p_intitule
            , @RequestParam int p_solde
            , @RequestParam int p_montantDecouvertAutorise) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        CompteEpargne n = new CompteEpargne();
        n.setIntitule(p_intitule);
        n.setSolde(p_solde);
        n.setMontantDecouvertAutorise(p_montantDecouvertAutorise);
        compteEpargneRepository.save(n);
        return "compte épargne Saved";
    }

    @GetMapping(path="/allCompteEpargen")
    public @ResponseBody Iterable<CompteEpargne> getCompteEpargneList() {
        // This returns a JSON or XML with the users
        return compteEpargneRepository.findAll();
    }


}
