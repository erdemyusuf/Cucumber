
  Feature: Parametre kullanimi
    Scenario: Parametre kullaniminda ConfigReader kullanimi
      Given kullanici "amazonUrl" sayfasina gider
      When kullanici "Nutella" icin arama yapar
      Then  kullanici 3 sn bekler
      Then sonuclarin "Nutella" icerdigini test eder
      And sayfayi kapatir

      @grup2
      Scenario: TC01 Parametre kullaniminda ConfigReader kullanimi
        Given kullanici "facebookUrl" sayfasina gider
        Then  kullanici 3 sn bekler
        When url nin "facebook" icerdigini test edin
        And sayfayi kapatir

    Scenario: TC02 Parametre kullaniminda ConfigReader kullanimi
      Given kullanici "brcUrl" sayfasina gider
      Then  kullanici 3 sn bekler
      When url nin "blue" icerdigini test edin
      And sayfayi kapatir

      #parametre icin integer kullancaksak " " icine almaya gerek yoktur
      #diger adimlar aynidir. stepDefinitionda metot olstururarak dinamik hale getiririz