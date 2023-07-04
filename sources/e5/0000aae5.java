package pl;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* loaded from: classes3.dex */
abstract class i implements p {

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f46664c = l(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    /* renamed from: a  reason: collision with root package name */
    int[] f46665a;

    /* renamed from: b  reason: collision with root package name */
    private final int f46666b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(byte[] bArr, int i11) {
        if (bArr.length == 32) {
            this.f46665a = l(bArr);
            this.f46666b = i11;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    private void g(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int remaining = byteBuffer2.remaining();
        int i11 = (remaining / 64) + 1;
        for (int i12 = 0; i12 < i11; i12++) {
            ByteBuffer b11 = b(bArr, this.f46666b + i12);
            if (i12 == i11 - 1) {
                g.c(byteBuffer, byteBuffer2, b11, remaining % 64);
            } else {
                g.c(byteBuffer, byteBuffer2, b11, 64);
            }
        }
    }

    static void h(int[] iArr, int i11, int i12, int i13, int i14) {
        iArr[i11] = iArr[i11] + iArr[i12];
        iArr[i14] = i(iArr[i14] ^ iArr[i11], 16);
        iArr[i13] = iArr[i13] + iArr[i14];
        iArr[i12] = i(iArr[i12] ^ iArr[i13], 12);
        iArr[i11] = iArr[i11] + iArr[i12];
        iArr[i14] = i(iArr[i11] ^ iArr[i14], 8);
        iArr[i13] = iArr[i13] + iArr[i14];
        iArr[i12] = i(iArr[i12] ^ iArr[i13], 7);
    }

    private static int i(int i11, int i12) {
        return (i11 >>> (-i12)) | (i11 << i12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void j(int[] iArr, int[] iArr2) {
        int[] iArr3 = f46664c;
        System.arraycopy(iArr3, 0, iArr, 0, iArr3.length);
        System.arraycopy(iArr2, 0, iArr, iArr3.length, 8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void k(int[] iArr) {
        for (int i11 = 0; i11 < 10; i11++) {
            h(iArr, 0, 4, 8, 12);
            h(iArr, 1, 5, 9, 13);
            h(iArr, 2, 6, 10, 14);
            h(iArr, 3, 7, 11, 15);
            h(iArr, 0, 5, 10, 15);
            h(iArr, 1, 6, 11, 12);
            h(iArr, 2, 7, 8, 13);
            h(iArr, 3, 4, 9, 14);
        }
    }

    static int[] l(byte[] bArr) {
        IntBuffer asIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[asIntBuffer.remaining()];
        asIntBuffer.get(iArr);
        return iArr;
    }

    @Override // pl.p
    public byte[] a(byte[] bArr) {
        return d(ByteBuffer.wrap(bArr));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ByteBuffer b(byte[] bArr, int i11) {
        int[] c11 = c(l(bArr), i11);
        int[] iArr = (int[]) c11.clone();
        k(iArr);
        for (int i12 = 0; i12 < c11.length; i12++) {
            c11[i12] = c11[i12] + iArr[i12];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(c11, 0, 16);
        return order;
    }

    abstract int[] c(int[] iArr, int i11);

    /* JADX INFO: Access modifiers changed from: package-private */
    public byte[] d(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() >= f()) {
            byte[] bArr = new byte[f()];
            byteBuffer.get(bArr);
            ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
            g(bArr, allocate, byteBuffer);
            return allocate.array();
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(ByteBuffer byteBuffer, byte[] bArr) {
        if (byteBuffer.remaining() - f() >= bArr.length) {
            byte[] c11 = u.c(f());
            byteBuffer.put(c11);
            g(c11, byteBuffer, ByteBuffer.wrap(bArr));
            return;
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }

    @Override // pl.p
    public byte[] encrypt(byte[] bArr) {
        if (bArr.length <= Integer.MAX_VALUE - f()) {
            ByteBuffer allocate = ByteBuffer.allocate(f() + bArr.length);
            e(allocate, bArr);
            return allocate.array();
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int f();
}