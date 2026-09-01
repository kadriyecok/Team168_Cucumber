
  Feature: US1003 Kullanici ortak baglangic adimlarini background ile calistirir

    Background:Testotomasyonu anasayfaya gidis
      Given kullanici testotomasyonu anasayfaya gider

    Scenario: TC07 parametre ile phone arama testi
      When arama kutusuna "baby" yazip aratir
      Then arama sonucunda urun bulunabildigini test eder
      And sayfayi kapatir



    Scenario: TC08 parametre ile backpack arama testi
      When arama kutusuna "backpack" yazip aratir
      Then arama sonucunda urun bulunabildigini test eder
      And sayfayi kapatir


    Scenario: TC09 parametre ile nutella arama testi
      When arama kutusuna "nutella" yazip aratir
      And senkronizasyon icin 3 saniye bekler
      Then arama sonucunda urun bulunamadigini test eder
      And sayfayi kapatir