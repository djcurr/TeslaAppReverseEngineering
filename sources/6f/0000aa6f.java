package p70;

import java.security.spec.KeySpec;

/* loaded from: classes5.dex */
public class a implements KeySpec {

    /* renamed from: a  reason: collision with root package name */
    private short[][] f46378a;

    /* renamed from: b  reason: collision with root package name */
    private short[] f46379b;

    /* renamed from: c  reason: collision with root package name */
    private short[][] f46380c;

    /* renamed from: d  reason: collision with root package name */
    private short[] f46381d;

    /* renamed from: e  reason: collision with root package name */
    private int[] f46382e;

    /* renamed from: f  reason: collision with root package name */
    private b70.a[] f46383f;

    public a(short[][] sArr, short[] sArr2, short[][] sArr3, short[] sArr4, int[] iArr, b70.a[] aVarArr) {
        this.f46378a = sArr;
        this.f46379b = sArr2;
        this.f46380c = sArr3;
        this.f46381d = sArr4;
        this.f46382e = iArr;
        this.f46383f = aVarArr;
    }

    public short[] a() {
        return this.f46379b;
    }

    public short[] b() {
        return this.f46381d;
    }

    public short[][] c() {
        return this.f46378a;
    }

    public short[][] d() {
        return this.f46380c;
    }

    public b70.a[] e() {
        return this.f46383f;
    }

    public int[] f() {
        return this.f46382e;
    }
}