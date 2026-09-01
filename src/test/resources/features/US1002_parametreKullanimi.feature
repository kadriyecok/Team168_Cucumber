
  Feature: US1002 parametre ile arama testleri

    Scenario: TC04 parametre ile phone arama testi
      Given kullanici testotomasyonu anasayfaya gider
      When arama kutusuna "baby" yazip aratir
      Then arama sonucunda urun bulunabildigini test eder
      And sayfayi kapatir



    Scenario: TC05 parametre ile backpack arama testi
      Given kullanici testotomasyonu anasayfaya gider
      When arama kutusuna "backpack" yazip aratir
      Then arama sonucunda urun bulunabildigini test eder
      And sayfayi kapatir

      @wip
    Scenario: TC06 parametre ile nutella arama testi
      Given kullanici testotomasyonu anasayfaya gider
      When arama kutusuna "nutella" yazip aratir
      And senkronizasyon icin 3 saniye bekler
      Then arama sonucunda urun bulunamadigini test eder
      And sayfayi kapatir