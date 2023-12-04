package fr.craft.kata;

record Card(Rank rank, Suit suit) {
  enum Rank {
    AS, ROI, DAME, VALET, DIX, NEUF, HUIT, SEPT, SIX, CINQ, QUATRE, TROIS, DEUX
  }

  enum Suit {
    PIQUE, COEUR, CARREAU, TREFLE
  }
}
