package com.google.zxing;

import java.util.EnumMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private final String f17431a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f17432b;

    /* renamed from: c  reason: collision with root package name */
    private l[] f17433c;

    /* renamed from: d  reason: collision with root package name */
    private final a f17434d;

    /* renamed from: e  reason: collision with root package name */
    private Map<k, Object> f17435e;

    public j(String str, byte[] bArr, l[] lVarArr, a aVar) {
        this(str, bArr, lVarArr, aVar, System.currentTimeMillis());
    }

    public void a(l[] lVarArr) {
        l[] lVarArr2 = this.f17433c;
        if (lVarArr2 == null) {
            this.f17433c = lVarArr;
        } else if (lVarArr == null || lVarArr.length <= 0) {
        } else {
            l[] lVarArr3 = new l[lVarArr2.length + lVarArr.length];
            System.arraycopy(lVarArr2, 0, lVarArr3, 0, lVarArr2.length);
            System.arraycopy(lVarArr, 0, lVarArr3, lVarArr2.length, lVarArr.length);
            this.f17433c = lVarArr3;
        }
    }

    public a b() {
        return this.f17434d;
    }

    public byte[] c() {
        return this.f17432b;
    }

    public Map<k, Object> d() {
        return this.f17435e;
    }

    public l[] e() {
        return this.f17433c;
    }

    public String f() {
        return this.f17431a;
    }

    public void g(Map<k, Object> map) {
        if (map != null) {
            Map<k, Object> map2 = this.f17435e;
            if (map2 == null) {
                this.f17435e = map;
            } else {
                map2.putAll(map);
            }
        }
    }

    public void h(k kVar, Object obj) {
        if (this.f17435e == null) {
            this.f17435e = new EnumMap(k.class);
        }
        this.f17435e.put(kVar, obj);
    }

    public String toString() {
        return this.f17431a;
    }

    public j(String str, byte[] bArr, l[] lVarArr, a aVar, long j11) {
        this(str, bArr, bArr == null ? 0 : bArr.length * 8, lVarArr, aVar, j11);
    }

    public j(String str, byte[] bArr, int i11, l[] lVarArr, a aVar, long j11) {
        this.f17431a = str;
        this.f17432b = bArr;
        this.f17433c = lVarArr;
        this.f17434d = aVar;
        this.f17435e = null;
    }
}