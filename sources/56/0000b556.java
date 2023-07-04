package ti;

import java.util.Arrays;

/* loaded from: classes3.dex */
final class u {

    /* renamed from: a  reason: collision with root package name */
    private final int f52284a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f52285b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f52286c;

    /* renamed from: d  reason: collision with root package name */
    public byte[] f52287d;

    /* renamed from: e  reason: collision with root package name */
    public int f52288e;

    public u(int i11, int i12) {
        this.f52284a = i11;
        byte[] bArr = new byte[i12 + 3];
        this.f52287d = bArr;
        bArr[2] = 1;
    }

    public void a(byte[] bArr, int i11, int i12) {
        if (this.f52285b) {
            int i13 = i12 - i11;
            byte[] bArr2 = this.f52287d;
            int length = bArr2.length;
            int i14 = this.f52288e;
            if (length < i14 + i13) {
                this.f52287d = Arrays.copyOf(bArr2, (i14 + i13) * 2);
            }
            System.arraycopy(bArr, i11, this.f52287d, this.f52288e, i13);
            this.f52288e += i13;
        }
    }

    public boolean b(int i11) {
        if (this.f52285b) {
            this.f52288e -= i11;
            this.f52285b = false;
            this.f52286c = true;
            return true;
        }
        return false;
    }

    public boolean c() {
        return this.f52286c;
    }

    public void d() {
        this.f52285b = false;
        this.f52286c = false;
    }

    public void e(int i11) {
        ak.a.f(!this.f52285b);
        boolean z11 = i11 == this.f52284a;
        this.f52285b = z11;
        if (z11) {
            this.f52288e = 3;
            this.f52286c = false;
        }
    }
}