package com.hm.nLayeredDemo.core.utilities.results;

// ErrorDataResult sınıfımızda  işlemin başarılı olma durumunu varsayılan olarak false ayarladık.
// Başarılı işlemlerde direkt bu sınıfımızın constructor metodumuzu kullanma işlemi yapacağız.
// Bİrden fazla constructor tanımlayarak metodumuzun farklı parametrelere alarak istenilen parametrenin gönderilmesi çeşitlendirilebiliriz.

public class ErrorDataResult<T> extends DataResult<T> {

    public ErrorDataResult(T data, String message) {
        super(data, false, message);
    }

    public ErrorDataResult(T data) {
        super(data, false);
    }

    public ErrorDataResult(String message) {
        super(null, false, message);
    }

    public ErrorDataResult() {
        super(null, false);
    }

}