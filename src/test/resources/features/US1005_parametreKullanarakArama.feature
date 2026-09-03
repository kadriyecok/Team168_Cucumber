
  Feature: US1005 Kullanici parametre kullanarak istedigi kelimeyi aratir


    Scenario: TC11 Kullanici istedigi kelimeyi aratabilmeli
      Given kullanici testotomasyonu anasayfaya gider
      When arama kutusuna "baby" yazip aratir
      Then arama sonucunda urun bulunabildigini test eder
      And kodlari 2 saniye bekler



      Scenario: TC12 kullanici bazi kelimeleri bulamamali
        Given kullanici testotomasyonu anasayfaya gider
        When arama kutusuna "cokoprens" yazip aratir
        Then arama sonucunda urun bulunamadigini test eder
        And kodlari 1 saniye bekler
