package om;

import java.io.OutputStream;

/* loaded from: classes3.dex */
final class b extends OutputStream {

    /* renamed from: a  reason: collision with root package name */
    private long f42751a = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public long a() {
        return this.f42751a;
    }

    @Override // java.io.OutputStream
    public void write(int i11) {
        this.f42751a++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.f42751a += bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i11, int i12) {
        int i13;
        if (i11 >= 0 && i11 <= bArr.length && i12 >= 0 && (i13 = i11 + i12) <= bArr.length && i13 >= 0) {
            this.f42751a += i12;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}