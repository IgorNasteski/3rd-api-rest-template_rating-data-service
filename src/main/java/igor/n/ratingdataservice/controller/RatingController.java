package igor.n.ratingdataservice.controller;

import igor.n.ratingdataservice.model.Rating;
import igor.n.ratingdataservice.model.RatingResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@RestController
@RequestMapping("/ratings")
public class RatingController {

    //@Autowired
    //private RestTemplate restTemplate;

    @GetMapping("users/{userId}")
    public RatingResponse getRatings(@PathVariable("userId")String userId) {
        RatingResponse ratingResponse = new RatingResponse();

        ratingResponse.setRatings(
                Arrays.asList(
                        new Rating("100", 3),
                        new Rating("200", 4)
                )
        );

        return ratingResponse;
    }

}
