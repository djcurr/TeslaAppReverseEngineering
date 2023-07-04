package kotlinx.coroutines.internal;

import java.util.Objects;

/* loaded from: classes5.dex */
public class a<T> {

    /* renamed from: a  reason: collision with root package name */
    private Object[] f35445a = new Object[16];

    /* renamed from: b  reason: collision with root package name */
    private int f35446b;

    /* renamed from: c  reason: collision with root package name */
    private int f35447c;

    private final void b() {
        Object[] objArr = this.f35445a;
        int length = objArr.length;
        Object[] objArr2 = new Object[length << 1];
        wz.o.o(objArr, objArr2, 0, this.f35446b, 0, 10, null);
        Object[] objArr3 = this.f35445a;
        int length2 = objArr3.length;
        int i11 = this.f35446b;
        wz.o.o(objArr3, objArr2, length2 - i11, 0, i11, 4, null);
        this.f35445a = objArr2;
        this.f35446b = 0;
        this.f35447c = length;
    }

    public final void a(T t11) {
        Object[] objArr = this.f35445a;
        int i11 = this.f35447c;
        objArr[i11] = t11;
        int length = (objArr.length - 1) & (i11 + 1);
        this.f35447c = length;
        if (length == this.f35446b) {
            b();
        }
    }

    public final boolean c() {
        return this.f35446b == this.f35447c;
    }

    public final T d() {
        int i11 = this.f35446b;
        if (i11 == this.f35447c) {
            return null;
        }
        Object[] objArr = this.f35445a;
        T t11 = (T) objArr[i11];
        objArr[i11] = null;
        this.f35446b = (i11 + 1) & (objArr.length - 1);
        Objects.requireNonNull(t11, "null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue");
        return t11;
    }
}