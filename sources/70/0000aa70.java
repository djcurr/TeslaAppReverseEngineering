package p70;

import java.security.spec.KeySpec;

/* loaded from: classes5.dex */
public class b implements KeySpec {

    /* renamed from: a  reason: collision with root package name */
    private short[][] f46384a;

    /* renamed from: b  reason: collision with root package name */
    private short[][] f46385b;

    /* renamed from: c  reason: collision with root package name */
    private short[] f46386c;

    /* renamed from: d  reason: collision with root package name */
    private int f46387d;

    public b(int i11, short[][] sArr, short[][] sArr2, short[] sArr3) {
        this.f46387d = i11;
        this.f46384a = sArr;
        this.f46385b = sArr2;
        this.f46386c = sArr3;
    }

    public short[][] a() {
        return this.f46384a;
    }

    public short[] b() {
        return this.f46386c;
    }

    public short[][] c() {
        return this.f46385b;
    }

    public int d() {
        return this.f46387d;
    }
}