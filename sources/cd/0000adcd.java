package qd;

import java.lang.ref.SoftReference;

/* loaded from: classes.dex */
public class f<T> {

    /* renamed from: a  reason: collision with root package name */
    SoftReference<T> f48060a = null;

    /* renamed from: b  reason: collision with root package name */
    SoftReference<T> f48061b = null;

    /* renamed from: c  reason: collision with root package name */
    SoftReference<T> f48062c = null;

    public void a() {
        SoftReference<T> softReference = this.f48060a;
        if (softReference != null) {
            softReference.clear();
            this.f48060a = null;
        }
        SoftReference<T> softReference2 = this.f48061b;
        if (softReference2 != null) {
            softReference2.clear();
            this.f48061b = null;
        }
        SoftReference<T> softReference3 = this.f48062c;
        if (softReference3 != null) {
            softReference3.clear();
            this.f48062c = null;
        }
    }

    public T b() {
        SoftReference<T> softReference = this.f48060a;
        if (softReference == null) {
            return null;
        }
        return softReference.get();
    }

    public void c(T t11) {
        this.f48060a = new SoftReference<>(t11);
        this.f48061b = new SoftReference<>(t11);
        this.f48062c = new SoftReference<>(t11);
    }
}