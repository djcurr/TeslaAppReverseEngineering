package atd.c0;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f6784a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f6785b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr != null) {
            Arrays.copyOf(bArr, bArr.length);
        }
        this.f6784a = bArr2 != null ? Arrays.copyOf(bArr2, bArr2.length) : null;
        this.f6785b = bArr3 != null ? Arrays.copyOf(bArr3, bArr3.length) : null;
    }

    public byte[] a() {
        byte[] bArr = this.f6785b;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public byte[] b() {
        byte[] bArr = this.f6784a;
        return Arrays.copyOf(bArr, bArr.length);
    }
}