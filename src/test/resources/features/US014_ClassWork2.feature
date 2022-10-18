@web
Feature: US014 Class Work

  Scenario: Kullanici ve Url Testi
    Given kullanici "webUrl" ana sayfasinda
    When kullanici 3 sn bekler
    Then kullanici Login Portala kadar asagi iner
    When kullanici 3 sn bekler
    And kullanici Login Portala tiklar
    When kullanici 3 sn bekler
    And kullanici diger windowa gecer
    When kullanici 3 sn bekler
    And kullanici "username" kutusuna bilgileri girer
    When kullanici 3 sn bekler
    And kullanici "password" bolumune bilgileri girer
    When kullanici 3 sn bekler
    And kullanici login butonuna basar
    When kullanici 3 sn bekler
    And kullanici Popup'ta cikan yazinin validation failed oldugunu test eder
    When kullanici 3 sn bekler
    And kullanici Ok diyerek Popup'i kapatir
    When kullanici 3 sn bekler
    And kullanici ilk sayfaya geri doner
    When kullanici 3 sn bekler
    And kullanici ilk sayfaya donuldugunu test eder
    When kullanici 3 sn bekler
    And sayfayi kapatir