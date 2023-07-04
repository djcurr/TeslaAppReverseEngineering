package com.google.common.base;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
abstract class b<T> implements Iterator<T> {

    /* renamed from: a  reason: collision with root package name */
    private EnumC0286b f15904a = EnumC0286b.NOT_READY;

    /* renamed from: b  reason: collision with root package name */
    private T f15905b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f15906a;

        static {
            int[] iArr = new int[EnumC0286b.values().length];
            f15906a = iArr;
            try {
                iArr[EnumC0286b.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15906a[EnumC0286b.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.common.base.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public enum EnumC0286b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    private boolean c() {
        this.f15904a = EnumC0286b.FAILED;
        this.f15905b = a();
        if (this.f15904a != EnumC0286b.DONE) {
            this.f15904a = EnumC0286b.READY;
            return true;
        }
        return false;
    }

    protected abstract T a();

    /* JADX INFO: Access modifiers changed from: protected */
    public final T b() {
        this.f15904a = EnumC0286b.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        u.u(this.f15904a != EnumC0286b.FAILED);
        int i11 = a.f15906a[this.f15904a.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                return c();
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (hasNext()) {
            this.f15904a = EnumC0286b.NOT_READY;
            T t11 = (T) p.a(this.f15905b);
            this.f15905b = null;
            return t11;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}