package igor.n.ratingdataservice.controller;

import igor.n.ratingdataservice.model.Rating;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {

    @GetMapping("/{userId}")
    public Rating getRatings(@PathVariable("userId")String userId){
        ratingList.add(rating1);
        ratingList.add(rating2);
        ratingList.add(rating3);
        ratingList.add(rating4);
        ratingList.add(rating5);

        /*for(int i=0; i<ratingList.size(); i++){
            if(ratingList.get(i).getMovieId().equalsIgnoreCase(movieId)){
                return ratingList.get(i);
            }

        }*/

        return ratingList.get(Integer.parseInt(userId)-1);  //isao -1 da bih kad ukucam 1 dobio
        //return null;                      //LOTR a ne HP, jer je LOTR nulti clan niza a ne prvi
    }                                       //jer korisnik u requestu ne zna da kad ukuca 1, da meni daje drugi clan niza
                                            //jer pocinju od 0
    List<Rating> ratingList = new ArrayList<Rating>();
    Rating rating1 = new Rating("1", 1);
    Rating rating2 = new Rating("2", 2);
    Rating rating3 = new Rating("3", 3);
    Rating rating4 = new Rating("4", 4);
    Rating rating5 = new Rating("5", 5);

}
