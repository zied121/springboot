package tnesprit3csde1.tpcafeziedbensalah.ResController;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tnesprit3csde1.tpcafeziedbensalah.Services.IClientService;
import tnesprit3csde1.tpcafeziedbensalah.entite.Client;

import  java.util.List;
@RestController
//ou bien  @componenet  ou bien @controller ou bien @respones Body

@AllArgsConstructor
@RequestMapping("client")

public class ArticleResController {
    IClientService  service;
   @GetMapping

    public List<Client> findAll(){
       return service.selectAllClients();
   }

}
