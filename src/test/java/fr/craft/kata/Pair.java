package fr.craft.kata;

record Pair(Card card1, Card card2) implements PokerHand {

  Pair {
    if (card1.rank() != card2.rank()) {
      throw new IllegalArgumentException("A pair must have two cards with identical ranks");
    }

    if (card1.equals(card2)) {
      throw new IllegalArgumentException("A pair must have two different cards");
    }
  }

  @Override
  public int compareTo(PokerHand otherHand) {
    return switch(otherHand) {
      case Pair otherPair -> card1.rank().compareTo(otherPair.card1.rank());
      case HighCard highCard -> 1;
      default -> throw new IllegalArgumentException("Cannot compare a pair with " + otherHand);
    };
  }
}
