Feature: US004 Parametre kullanimi
  Scenario: TC01 parametre kullanimi
    Given kullanici "https://www.hepsiburada.com/" sayfasinda
    Then kullanici 3 sn bekler
    And sayfayi kapatir


  Scenario:TC02 Parametre Kullanimi
    Given kullanici "https://www.trendyol.com" sayfasinda
    Then kullanici 3 sn bekler
    When url nin "trend" icerdigini test edin
    And sayfayi kapatir
