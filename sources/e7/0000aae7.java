package pl;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import javax.crypto.AEADBadTagException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class k implements hl.a {

    /* renamed from: a  reason: collision with root package name */
    private final i f46667a;

    /* renamed from: b  reason: collision with root package name */
    private final i f46668b;

    public k(byte[] bArr) {
        this.f46667a = f(bArr, 1);
        this.f46668b = f(bArr, 0);
    }

    private byte[] b(ByteBuffer byteBuffer, byte[] bArr) {
        if (byteBuffer.remaining() >= this.f46667a.f() + 16) {
            int position = byteBuffer.position();
            byte[] bArr2 = new byte[16];
            byteBuffer.position(byteBuffer.limit() - 16);
            byteBuffer.get(bArr2);
            byteBuffer.position(position);
            byteBuffer.limit(byteBuffer.limit() - 16);
            byte[] bArr3 = new byte[this.f46667a.f()];
            byteBuffer.get(bArr3);
            if (bArr == null) {
                bArr = new byte[0];
            }
            try {
                q.f(d(bArr3), e(bArr, byteBuffer), bArr2);
                byteBuffer.position(position);
                return this.f46667a.d(byteBuffer);
            } catch (GeneralSecurityException e11) {
                throw new AEADBadTagException(e11.toString());
            }
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    private void c(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        if (byteBuffer.remaining() >= bArr.length + this.f46667a.f() + 16) {
            int position = byteBuffer.position();
            this.f46667a.e(byteBuffer, bArr);
            byteBuffer.position(position);
            byte[] bArr3 = new byte[this.f46667a.f()];
            byteBuffer.get(bArr3);
            byteBuffer.limit(byteBuffer.limit() - 16);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            byte[] a11 = q.a(d(bArr3), e(bArr2, byteBuffer));
            byteBuffer.limit(byteBuffer.limit() + 16);
            byteBuffer.put(a11);
            return;
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }

    private byte[] d(byte[] bArr) {
        byte[] bArr2 = new byte[32];
        this.f46668b.b(bArr, 0).get(bArr2);
        return bArr2;
    }

    private static byte[] e(byte[] bArr, ByteBuffer byteBuffer) {
        int length = bArr.length % 16 == 0 ? bArr.length : (bArr.length + 16) - (bArr.length % 16);
        int remaining = byteBuffer.remaining();
        int i11 = remaining % 16;
        int i12 = (i11 == 0 ? remaining : (remaining + 16) - i11) + length;
        ByteBuffer order = ByteBuffer.allocate(i12 + 16).order(ByteOrder.LITTLE_ENDIAN);
        order.put(bArr);
        order.position(length);
        order.put(byteBuffer);
        order.position(i12);
        order.putLong(bArr.length);
        order.putLong(remaining);
        return order.array();
    }

    @Override // hl.a
    public byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length <= (Integer.MAX_VALUE - this.f46667a.f()) - 16) {
            ByteBuffer allocate = ByteBuffer.allocate(bArr.length + this.f46667a.f() + 16);
            c(allocate, bArr, bArr2);
            return allocate.array();
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    @Override // hl.a
    public byte[] decrypt(byte[] bArr, byte[] bArr2) {
        return b(ByteBuffer.wrap(bArr), bArr2);
    }

    abstract i f(byte[] bArr, int i11);
}