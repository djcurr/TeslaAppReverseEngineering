package f70;

import java.io.Serializable;

/* loaded from: classes5.dex */
public final class u implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    private final int f26021a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f26022b;

    /* JADX INFO: Access modifiers changed from: protected */
    public u(int i11, byte[] bArr) {
        this.f26021a = i11;
        this.f26022b = bArr;
    }

    public int a() {
        return this.f26021a;
    }

    public byte[] b() {
        return a0.c(this.f26022b);
    }
}