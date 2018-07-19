package olv.petp.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.time.Duration;
import java.time.LocalDateTime;

@RestController
public class RestControllerFromDatesToSeconds {

    @GetMapping("/calculate")
    public Long ConverterToSeconds (@RequestParam ("d1") LocalDateTime d1,
                                    @RequestParam ("d2") LocalDateTime d2){
        long diff = Duration.between(d1, d2).toMillis();
        long seconds = diff / 100;
        return seconds;
    }

}
