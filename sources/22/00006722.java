package e40;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import org.bouncycastle.asn1.m;
import org.bouncycastle.asn1.n;

/* loaded from: classes5.dex */
public abstract class c implements b, r70.c {
    public void b(OutputStream outputStream) {
        m.a(outputStream).s(this);
    }

    public void c(OutputStream outputStream, String str) {
        m.b(outputStream, str).s(this);
    }

    public byte[] d(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        c(byteArrayOutputStream, str);
        return byteArrayOutputStream.toByteArray();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return toASN1Primitive().j(((b) obj).toASN1Primitive());
        }
        return false;
    }

    @Override // r70.c
    public byte[] getEncoded() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        b(byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public int hashCode() {
        return toASN1Primitive().hashCode();
    }

    @Override // e40.b
    public abstract n toASN1Primitive();
}