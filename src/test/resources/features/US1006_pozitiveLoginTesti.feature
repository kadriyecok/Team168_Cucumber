
  Feature: US1006 Kullanici gecerli bilgilerle sisteme giris yapar


    Scenario: TC13 kullanici gecerli bilgilerle sisteme giris yapabilmeli

      Given kullanici testotomasyonu anasayfaya gider
      When account linkine basar
      Then email olarak "toGecerliMail" girer
      And password olarak "toGecerliPassword" girer
      And signIn butonuna basar
      Then basarili olarak giris yapilabildigini test eder
      And kodlari 2 saniye bekler
      Then logout butonuna basarak cikis yapar
