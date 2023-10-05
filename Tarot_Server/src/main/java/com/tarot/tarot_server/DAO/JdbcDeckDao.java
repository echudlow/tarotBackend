package com.tarot.tarot_server.DAO;

import com.tarot.tarot_server.Model.Card;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcDeckDao implements DeckDAO {

    private final JdbcTemplate jdbcTemplate;

    public JdbcDeckDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Card> allCards() {
        List<Card> deck = new ArrayList<>();

        String sql = "select * from tarot_cards";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
        while (results.next()) {
            deck.add(mapRowToCards(results));
        }
        return deck;
    }


    private Card mapRowToCards(SqlRowSet rs) {
        Card card = new Card();

        card.setId(rs.getLong("tarot_id"));
        card.setCardName(rs.getString("card_name"));
        card.setMeaning(rs.getString("meaning"));
        card.setReversed(rs.getString("reversed"));

        return card;
    }
}
