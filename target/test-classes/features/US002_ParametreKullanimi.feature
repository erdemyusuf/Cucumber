

Feature: US002 Parametre Kullanimi

  Background: ortak adim
    Given kullanici amazon sayfasina gider

  @parametre
  Scenario: TC01 Kullanici amazonda parametreli arama yapar
    Then kullanici "Nutella" icin arama yapar
    And sonuclarin "Nutella" icerdigini test eder
    And sayfayi kapatir

    @grup2
    Scenario: TC02 kullanici amazonda parametreli arama yapar
      Then kullanici "Selenium" icin arama yapar
      And  sonuclarin "Selenium" icerdigini test eder
      And sayfayi kapatir

  Scenario: TC03 kullanici amazonda parametreli arama yapar
    Then kullanici "SQL" icin arama yapar
    And  sonuclarin "SQL" icerdigini test eder
    And sayfayi kapatir

  Scenario: TC04 kullanici amazonda parametreli arama yapar
    Then kullanici "java" icin arama yapar
    And  sonuclarin "java" icerdigini test eder
    And sayfayi kapatir

      # feature dosyasinda parametreli arama yaptigimizda " ..." icine aldigimiz deger icin stepDEfinition da
      # bir kere parametreli metot olustururuz ve yeni arama yapmak istedigimizde sadece stringi degistimek yeterli olur
