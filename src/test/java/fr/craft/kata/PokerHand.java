package fr.craft.kata;

public sealed interface PokerHand extends Comparable<PokerHand> permits Pair, HighCard {

}
