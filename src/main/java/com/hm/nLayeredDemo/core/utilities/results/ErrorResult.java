package com.hm.nLayeredDemo.core.utilities.results;

// ErrorResult sınıfı base aldığımız Result sınıfı içerisinde tanımlananan işlem sonucu döndüren constructor' ın varsayılan değerini false olarak
// tanımladık. İşlem başarısız ise direkt bu sınıfta tanımlı metodu tetikleyeceğiz.
public class ErrorResult extends Result {
    public ErrorResult() {
        super(false);
    }

    public ErrorResult(String message) {
        super(false, message);
    }
}
