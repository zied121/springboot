package tnesprit3csde1.tpcafeziedbensalah.schedular;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Slf4j
public class schedularMethods {

     @Scheduled( fixedRate = 2000 )// fixed reate  / fixed delay // cron
          public void scheduledTask(){
            log.info("Scheduled task executed");

            /// implementaer  la methode ici
        }
    }

