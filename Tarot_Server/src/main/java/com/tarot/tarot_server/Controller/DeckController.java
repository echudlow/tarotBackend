package com.tarot.tarot_server.Controller;

import com.tarot.tarot_server.DAO.DeckDAO;
import com.tarot.tarot_server.Model.Card;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeckController {

    private final DeckDAO deckDAO;

    public DeckController(DeckDAO deckDAO){
        this.deckDAO = deckDAO;
    }

    @RequestMapping(path = "/reading/{selection}", method = RequestMethod.GET)
    public List<Card> getReading(@PathVariable int selection){
        return null;
    }

    @GetMapping(path = "/allCards")
    public List<Card> allCards(){
        return deckDAO.allCards();
    }
}
