package l60;

import java.security.spec.AlgorithmParameterSpec;

/* loaded from: classes5.dex */
public class p implements AlgorithmParameterSpec {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f37088a;

    /* renamed from: b  reason: collision with root package name */
    private byte[] f37089b;

    /* renamed from: c  reason: collision with root package name */
    private int f37090c;

    /* renamed from: d  reason: collision with root package name */
    private int f37091d;

    /* renamed from: e  reason: collision with root package name */
    private byte[] f37092e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f37093f;

    public p(byte[] bArr, byte[] bArr2, int i11) {
        this(bArr, bArr2, i11, -1, null, false);
    }

    public p(byte[] bArr, byte[] bArr2, int i11, int i12, byte[] bArr3) {
        this(bArr, bArr2, i11, i12, bArr3, false);
    }

    public p(byte[] bArr, byte[] bArr2, int i11, int i12, byte[] bArr3, boolean z11) {
        if (bArr != null) {
            byte[] bArr4 = new byte[bArr.length];
            this.f37088a = bArr4;
            System.arraycopy(bArr, 0, bArr4, 0, bArr.length);
        } else {
            this.f37088a = null;
        }
        if (bArr2 != null) {
            byte[] bArr5 = new byte[bArr2.length];
            this.f37089b = bArr5;
            System.arraycopy(bArr2, 0, bArr5, 0, bArr2.length);
        } else {
            this.f37089b = null;
        }
        this.f37090c = i11;
        this.f37091d = i12;
        this.f37092e = org.bouncycastle.util.a.h(bArr3);
        this.f37093f = z11;
    }

    public int a() {
        return this.f37091d;
    }

    public byte[] b() {
        return org.bouncycastle.util.a.h(this.f37088a);
    }

    public byte[] c() {
        return org.bouncycastle.util.a.h(this.f37089b);
    }

    public int d() {
        return this.f37090c;
    }

    public byte[] e() {
        return org.bouncycastle.util.a.h(this.f37092e);
    }

    public boolean f() {
        return this.f37093f;
    }
}