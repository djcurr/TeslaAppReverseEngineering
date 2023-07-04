package rp;

import com.facebook.react.bridge.Dynamic;

/* loaded from: classes2.dex */
public abstract class k<T> {

    /* renamed from: a  reason: collision with root package name */
    private T f49635a;

    public k() {
    }

    public T a() {
        return this.f49635a;
    }

    public void b(Dynamic dynamic) {
        this.f49635a = c(dynamic);
    }

    abstract T c(Dynamic dynamic);

    public k(T t11) {
        this.f49635a = t11;
    }
}