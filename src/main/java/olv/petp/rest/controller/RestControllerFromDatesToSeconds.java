package olv.petp.rest.controller;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.Duration;
import java.time.LocalDateTime;

@RestController
public class RestControllerFromDatesToSeconds {

    @GetMapping("/calculate")
    public Long converterToSeconds(@RequestParam("d1") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime d1,
                                   @RequestParam("d2") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime d2) {
        long diff = Duration.between(d1, d2).toMillis();
        long seconds = diff / 100;
        return seconds;
    }
//http://localhost:8080/calculate
}
