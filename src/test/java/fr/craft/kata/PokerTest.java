package fr.craft.kata;

import net.jqwik.api.*;
import net.jqwik.api.constraints.UseType;
import net.jqwik.api.domains.Domain;
import net.jqwik.api.domains.DomainContextBase;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assumptions.assumeThat;

class PokerTest {

//  class Providers extends DomainContextBase {
//    @Provide
//    Arbitrary<Card> cards() {
//      return Arbitraries.of(Card.Rank.class)
//        .flatMap(rank -> Arbitraries.of(Card.Suit.class)
//          .map(suit -> new Card(rank, suit)));
//    }
//  }

//  class CardProvider implements ArbitrarySupplier<Card> {
//    @Override
//    public Arbitrary<Card> get() {
//      return Arbitraries.of(Card.Rank.class)
//        .flatMap(rank -> Arbitraries.of(Card.Suit.class)
//          .map(suit -> new Card(rank, suit)));
//    }
//  }

//  class PairProvider implements ArbitrarySupplier<Pair> {
//    @Override
//    public Arbitrary<Pair> get() {
//      Arbitrary<Card.Suit> suit1 = Arbitraries.defaultFor(Card.Suit.class);
//      Arbitrary<Card.Suit> suit2 = Arbitraries.of(Card.Suit.class).;
//      Arbitrary<Card.Rank> rank = Arbitraries.of(Card.Rank.class);
//      return Combinators.combine(rank, suit1, suit2).as((rank1, suit, suit21) -> );
//    }
//  }

  @Property
//  @Domain(Providers.class)
  void pairWinsOverHighCard(@ForAll @UseType Card card1, @ForAll Card.Suit suit, @ForAll @UseType Card card2) {
    assumeThat(card1.suit()).isNotEqualTo(suit);

    Pair pair = new Pair(card1, new Card(card1.rank(), suit));
    HighCard highCard = new HighCard(card2);
    assertThat(pair.compareTo(highCard)).isEqualTo(1);
  }

}
