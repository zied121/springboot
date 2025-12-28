package tnesprit3csde1.tpcafeziedbensalah.schedular;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import tnesprit3csde1.tpcafeziedbensalah.Services.IClientService;
import tnesprit3csde1.tpcafeziedbensalah.entite.Client;

@Component
@AllArgsConstructor
@Slf4j
public class schedularMethods {
IClientService iClientService;

     @Scheduled(cron = "0 0 0 * * *") // exécution chaque jour à minuit
          public void scheduledTask(){
            log.info("Scheduled task executed");
            for (Client c : iClientService.incrementerPts()){
                String points = c.getCarteFidelite() != null ? String.valueOf(c.getCarteFidelite().getPointsAccumules()) : "N/A";
                log.info("Client: {} {}, Points de fidélité: {}", c.getNom(), c.getPrenom(), points);
            }

        }
    }
