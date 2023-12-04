package fr.craft.kata;

public record HighCard(Card card) implements PokerHand {
  @Override
  public int compareTo(PokerHand otherHand) {
    return switch(otherHand) {
      case Pair otherPair -> -1;
      case HighCard highCard -> card.rank().compareTo(highCard.card.rank());
      default -> throw new IllegalArgumentException("Cannot compare a pair with " + otherHand);
    };
  }
}
