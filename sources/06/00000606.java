package androidx.core.util;

import v3.f;

/* loaded from: classes.dex */
public class Pools$SimplePool<T> implements f<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Object[] f4433a;

    /* renamed from: b  reason: collision with root package name */
    private int f4434b;

    public Pools$SimplePool(int i11) {
        if (i11 > 0) {
            this.f4433a = new Object[i11];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    private boolean c(T t11) {
        for (int i11 = 0; i11 < this.f4434b; i11++) {
            if (this.f4433a[i11] == t11) {
                return true;
            }
        }
        return false;
    }

    @Override // v3.f
    public boolean a(T t11) {
        if (!c(t11)) {
            int i11 = this.f4434b;
            Object[] objArr = this.f4433a;
            if (i11 < objArr.length) {
                objArr[i11] = t11;
                this.f4434b = i11 + 1;
                return true;
            }
            return false;
        }
        throw new IllegalStateException("Already in the pool!");
    }

    @Override // v3.f
    public T b() {
        int i11 = this.f4434b;
        if (i11 > 0) {
            int i12 = i11 - 1;
            Object[] objArr = this.f4433a;
            T t11 = (T) objArr[i12];
            objArr[i12] = null;
            this.f4434b = i11 - 1;
            return t11;
        }
        return null;
    }
}