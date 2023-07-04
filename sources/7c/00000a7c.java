package atd.e0;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.util.Arrays;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.m;
import org.bouncycastle.asn1.w0;

/* loaded from: classes.dex */
final class a extends c {
    static {
        atd.s0.a.a(-798338594957888L);
    }

    private Signature b() {
        return Signature.getInstance(atd.s0.a.a(-798510393649728L));
    }

    @Override // atd.b0.a
    public String a() {
        return atd.s0.a.a(-798501803715136L);
    }

    @Override // atd.e0.c
    public boolean a(byte[] bArr, byte[] bArr2, PublicKey publicKey) {
        Signature b11 = b();
        b11.initVerify(publicKey);
        b11.update(bArr2);
        return b11.verify(a(bArr));
    }

    private byte[] a(byte[] bArr) {
        if (bArr.length == 64) {
            int length = bArr.length / 2;
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, length);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, length, bArr.length);
            org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d();
            dVar.a(new i(new BigInteger(1, copyOfRange)));
            dVar.a(new i(new BigInteger(1, copyOfRange2)));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                m.b(byteArrayOutputStream, atd.s0.a.a(-798304235219520L)).t(new w0(dVar));
                return byteArrayOutputStream.toByteArray();
            } catch (IOException e11) {
                throw new SignatureException(atd.s0.a.a(-798321415088704L), e11);
            }
        }
        return bArr;
    }
}