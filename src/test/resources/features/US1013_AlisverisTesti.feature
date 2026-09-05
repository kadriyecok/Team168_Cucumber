
Feature: US1013 kullanici alisveris yapar

  @wip @paralel2
  Scenario: TC22 Kullanici istedigi urunu sepete ekledigini test eder

    Given kullanici "sauceUrl" anasayfaya gider
    And kodlari 2 saniye bekler
    Then saucedemo username kutusuna "standard_user" yazar
    And saucedemo password kutusuna "secret_sauce" yazar
    And kodlari 2 saniye bekler
    Then saucedemo login tusuna basar
    And ilk urunun ismini kaydeder ve bu urunun sayfasina gider
    When saucedemo add to Cart butonuna basar
    Then saucedemo alisveris sepetine tiklar
    And kodlari 1 saniye bekler
    And sectigi urunun basarili olarak sepete eklendigini test eder
    And kodlari 2 saniye bekler