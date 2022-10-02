Feature: Kullanici A101 sitesine uye olmadan alisveris yapabilir
  @a101
  Scenario: TC01 Kullanici A101 sitesine uye olmadan alisveris yapabilir

    Given Kullanici "a101Url" sitesine gider
    And  Kullanici Kategoriler butonunu tiklar
    And Kullanici Giyim & Aksesuar butonuna tiklar
    And Kullanici "Kadın İç Giyim" butonuna tiklar
    And Kullanici "Dizaltı Çorap" butonuna tiklar
    Then Kullanici ilk urune tiklar
    And Kullanici urun renginin siyah oldugunu dogrular
    When Kullanici urunu sepete ekler
    And Kullanici "Sepeti Görüntüle" butonuna tiklar
    And Kullanici "Sepeti Onayla" butonuna tiklar
    Then Kullanici Uye olmadan Devam et butonuna tiklar
    And Kullanici gecerli bir e-posta girer ve devam et butonuna tiklar
    And Kullanici gerekli teslimat bilgilerini doldurur ve kaydet butonuna tiklar
    And Kullanici kargo firmasini secer ve kaydet ve Devam et butonuna tiklar
    When Kullanici odeme ekraninda oldugunu dogrular
