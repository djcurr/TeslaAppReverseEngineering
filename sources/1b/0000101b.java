package ch;

import com.fasterxml.jackson.core.a;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: e  reason: collision with root package name */
    static final c f9122e = new c();

    /* renamed from: a  reason: collision with root package name */
    protected String[] f9123a;

    /* renamed from: b  reason: collision with root package name */
    protected a[] f9124b;

    /* renamed from: c  reason: collision with root package name */
    protected int f9125c;

    /* renamed from: d  reason: collision with root package name */
    protected int f9126d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a {
    }

    private c() {
        this.f9126d = 0;
        d(64);
    }

    private static int a(int i11) {
        return i11 - (i11 >> 2);
    }

    public static c b() {
        long currentTimeMillis = System.currentTimeMillis();
        return c((((int) currentTimeMillis) + ((int) (currentTimeMillis >>> 32))) | 1);
    }

    protected static c c(int i11) {
        return f9122e.e(i11);
    }

    private void d(int i11) {
        this.f9123a = new String[i11];
        this.f9124b = new a[i11 >> 1];
        this.f9125c = 0;
        this.f9126d = 0;
        a(i11);
    }

    private c e(int i11) {
        return new c(null, -1, this.f9123a, this.f9124b, this.f9125c, i11, this.f9126d);
    }

    private c(c cVar, int i11, String[] strArr, a[] aVarArr, int i12, int i13, int i14) {
        a.EnumC0242a.CANONICALIZE_FIELD_NAMES.enabledIn(i11);
        this.f9123a = strArr;
        this.f9124b = aVarArr;
        this.f9125c = i12;
        a(strArr.length);
        this.f9126d = i14;
    }
}