package h60;

import javax.crypto.spec.IvParameterSpec;

/* loaded from: classes5.dex */
public class a extends IvParameterSpec {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f28921a;

    /* renamed from: b  reason: collision with root package name */
    private final int f28922b;

    public a(byte[] bArr, int i11) {
        this(bArr, i11, null);
    }

    public a(byte[] bArr, int i11, byte[] bArr2) {
        super(bArr);
        this.f28922b = i11;
        this.f28921a = org.bouncycastle.util.a.h(bArr2);
    }

    public byte[] a() {
        return org.bouncycastle.util.a.h(this.f28921a);
    }

    public int b() {
        return this.f28922b;
    }

    public byte[] c() {
        return getIV();
    }
}