package com.dheepak.learning.java.random.interview;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;
import java.util.stream.Collectors;

import static com.dheepak.learning.java.random.interview.WissenInterview.rankMap;
import static com.dheepak.learning.java.random.interview.WissenInterview.suitMap;
import static java.util.Map.entry;

//heart 10
//spade K by Prabodh Gupta
//Prabodh Gupta
//3:40 pm
//spade K
//suit (heart, spade, club, diamond)  rank (a... by Prabodh Gupta
//Prabodh Gupta
//3:41 pm
//suit (heart, spade, club, diamond)
//rank (ace, king, queen jack, 10, 9, 8, 7, 6, 5, 4, 3, 2)
//4 suites of 13 ranks by Prabodh Gupta
//Prabodh Gupta
//3:41 pm
//4 suites of 13 ranks
public class WissenInterview {
    static Map<String, Integer> rankMap = Map.ofEntries(entry("ace", 14),   entry("king", 13), entry("queen", 12), entry("jack", 11), entry("10", 10), entry("9", 9), entry("8", 8), entry("7", 7), entry("6", 6), entry("5", 5), entry("4", 4), entry("3", 3), entry("2", 2), entry("1", 1));
    static Map<String, Integer> suitMap = Map.of("heart", 4, "spade", 3, "club", 2, "diamond", 1);

    private static boolean compareCards(Card card1, Card card2) {
        if(rankMap.get(card1.getRank()) > rankMap.get(card2.getRank())) {
            return true;
        } else if(rankMap.get(card1.getRank()) < rankMap.get(card2.getRank())) {
            return false;
        } else if (rankMap.get(card1.getRank()) == rankMap.get(card2.getRank())) {
            if(suitMap.get(card1.getSuit()) > suitMap.get(card2.getSuit())) {
                return true;
            } else if(suitMap.get(card1.getSuit()) < suitMap.get(card2.getSuit())) {
                return false;
        }
        }
        return false;

    }

    private static List<Card> getListOfCards() {
        List<Card> cardsList = new ArrayList<>();
        cardsList.add(new Card("club", "3"));
        cardsList.add(new Card("heart", "king"));
        cardsList.add(new Card("heart", "9"));
        cardsList.add(new Card("heart", "2"));
        cardsList.add(new Card("diamond", "8"));
        cardsList.add(new Card("heart", "4"));
        cardsList.add(new Card("heart", "ace"));
        cardsList.add(new Card("diamond", "4"));
        cardsList.add(new Card("diamond", "3"));
        cardsList.add(new Card("diamond", "10"));
        cardsList.add(new Card("heart", "queen"));
        cardsList.add(new Card("diamond", "queen"));
        cardsList.add(new Card("heart", "10"));
        cardsList.add(new Card("diamond", "ace"));
        cardsList.add(new Card("heart", "8"));
        cardsList.add(new Card("diamond", "2"));
        cardsList.add(new Card("diamond", "king"));
        cardsList.add(new Card("diamond", "5"));
        cardsList.add(new Card("spade", "7"));
        cardsList.add(new Card("spade", "8"));
        cardsList.add(new Card("spade", "6"));
        cardsList.add(new Card("heart", "5"));
        cardsList.add(new Card("heart", "jack"));
        cardsList.add(new Card("heart", "6"));
        cardsList.add(new Card("heart", "3"));
        cardsList.add(new Card("heart", "7"));
        cardsList.add(new Card("diamond", "9"));
        cardsList.add(new Card("diamond", "7"));
        cardsList.add(new Card("club", "queen"));
        cardsList.add(new Card("diamond", "jack"));
        cardsList.add(new Card("spade", "9"));
        cardsList.add(new Card("club", "4"));
        cardsList.add(new Card("club", "5"));
        cardsList.add(new Card("club", "6"));
        cardsList.add(new Card("club", "7"));
        cardsList.add(new Card("club", "2"));
        cardsList.add(new Card("club", "jack"));
        cardsList.add(new Card("club", "9"));
        cardsList.add(new Card("club", "10"));
        cardsList.add(new Card("spade", "queen"));
        cardsList.add(new Card("spade", "jack"));
        cardsList.add(new Card("spade", "ace"));
        cardsList.add(new Card("club", "8"));
        cardsList.add(new Card("club", "king"));
        cardsList.add(new Card("club", "ace"));
        cardsList.add(new Card("diamond", "6"));
        cardsList.add(new Card("spade", "3"));
        cardsList.add(new Card("spade", "5"));
        cardsList.add(new Card("spade", "10"));
        cardsList.add(new Card("spade", "4"));
        cardsList.add(new Card("spade", "2"));
        cardsList.add(new Card("spade", "king"));
        return cardsList;
    }

    private static void sortCards(List<Card> cardsList) {
//        Collections.sort(cardsList, new RankComparator());
//        Collections.sort(cardsList, new SuitComparator().reversed());

        cardsList.sort(Comparator.comparing(Card::getRankRank).thenComparing(Card::getSuitRank));

        System.out.println(cardsList);
    }
    public static void main(String[] args) {
//        Card card1 = new Card("heart", "10");
//        Card card2 = new Card("diamond", "ace");
//
//        if(compareCards(card1, card2)) {
//            System.out.println("card1 is greater");
//        } else {
//            System.out.println("card2 is greater");
//        }

        sortCards(getListOfCards());

    }
}

// Select * from Employee a where a.id ==  (Select id, max(salary) from employee b group by department)


@NoArgsConstructor
@AllArgsConstructor
@Data
class Card {
    String suit;
    String rank;
    Integer suitRank;
    Integer rankRank;

    public Card(String suit, String rank) {
        this.suitRank = Suit.valueOf(suit.toUpperCase()).value;
        this.rankRank = Rank.valueOf(rank.toUpperCase()).value;
    }
}

class SuitComparator implements Comparator<Card>{
    @Override
    public int compare(Card card1, Card card2) {
        return Integer.compare(suitMap.get(card1.getSuit()), suitMap.get(card2.getSuit()));
    }
}

class RankComparator implements Comparator<Card>{
    @Override
    public int compare(Card card1, Card card2) {
        return Integer.compare(rankMap.get(card1.getRank()), rankMap.get(card2.getRank()));
    }
}

enum Suit {
    HEART("heart", 4),
    SPADE("spade", 3),
    CLUB("club", 2),
    DIAMOND("diamond", 1);

    final String key;
    final Integer value;

    Suit(String key, Integer value) {
        this.key = key;
        this.value = value;
    }
}

enum Rank {
    TWO("2", 2),
    THREE("3", 3),
    FOUR("4", 4),
    FIVE("5", 5),
    SIX("6", 6),
    SEVEN("7", 7),
    EIGHT("8", 8),
    NINE("9", 9),
    TEN("10", 10),
    JACK("jack", 11),
    QUEEN("queen", 12),
    KING("king", 1),
    ACE("ace", 14);


    final String key;
    final Integer value;

    Rank(String key, Integer value) {
        this.key = key;
        this.value = value;
    }
}


