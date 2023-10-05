package com.tarot.tarot_server.DAO;

import com.tarot.tarot_server.Model.Card;

import java.util.List;

public interface DeckDAO {

    List<Card> allCards();
}
