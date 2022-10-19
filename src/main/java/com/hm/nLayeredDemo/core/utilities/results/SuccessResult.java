package com.hm.nLayeredDemo.core.utilities.results;

// ErrorResult sınıfı base aldığımız Result sınıfı içerisinde tanımlananan işlem sonucu döndüren constructor' ın varsayılan değerini true olarak
// tanımladık. İşlem başarılı ise direkt bu sınıfta tanımlı metodu tetikleyeceğiz.

public class SuccessResult extends Result {
    public SuccessResult() {
        super(true);
    }

    public SuccessResult(String message) {
        super(true, message);
    }
}
