Feature: US1001 testotomasyonu urun arama testleri


    Scenario: TC01 testotomasyonu sayfasinda phone arama testi

      Given kullanici testotomasyonu anasayfaya gider
      When arama kutusuna phone yazip aratir
      Then arama sonucunda urun bulunabildigini test eder
      And sayfayi kapatir

      @wip
      Scenario: TC02 testotomasyonu sayfasinda dress arama testi
        Given kullanici testotomasyonu anasayfaya gider
        When arama kutusuna dress yazip aratir
        Then arama sonucunda urun bulunabildigini test eder
        And sayfayi kapatir