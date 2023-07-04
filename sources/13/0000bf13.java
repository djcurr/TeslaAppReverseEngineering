package x60;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;

/* loaded from: classes5.dex */
public class i extends g {

    /* renamed from: b  reason: collision with root package name */
    private final k f57173b;

    /* renamed from: c  reason: collision with root package name */
    private final e f57174c;

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f57175d;

    /* renamed from: e  reason: collision with root package name */
    private final byte[] f57176e;

    public i(k kVar, e eVar, byte[] bArr, byte[] bArr2) {
        super(false);
        this.f57173b = kVar;
        this.f57174c = eVar;
        this.f57175d = org.bouncycastle.util.a.h(bArr2);
        this.f57176e = org.bouncycastle.util.a.h(bArr);
    }

    public static i b(Object obj) {
        DataInputStream dataInputStream;
        if (obj instanceof i) {
            return (i) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream2 = (DataInputStream) obj;
            k e11 = k.e(dataInputStream2.readInt());
            e e12 = e.e(dataInputStream2.readInt());
            byte[] bArr = new byte[16];
            dataInputStream2.readFully(bArr);
            byte[] bArr2 = new byte[e11.d()];
            dataInputStream2.readFully(bArr2);
            return new i(e11, e12, bArr2, bArr);
        } else if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return b(t70.a.c((InputStream) obj));
            }
            throw new IllegalArgumentException("cannot parse " + obj);
        } else {
            DataInputStream dataInputStream3 = null;
            try {
                dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                i b11 = b(dataInputStream);
                dataInputStream.close();
                return b11;
            } catch (Throwable th3) {
                th = th3;
                dataInputStream3 = dataInputStream;
                if (dataInputStream3 != null) {
                    dataInputStream3.close();
                }
                throw th;
            }
        }
    }

    byte[] c() {
        return a.f().i(this.f57173b.f()).i(this.f57174c.f()).d(this.f57175d).d(this.f57176e).b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f57173b.equals(iVar.f57173b) && this.f57174c.equals(iVar.f57174c) && org.bouncycastle.util.a.c(this.f57175d, iVar.f57175d)) {
            return org.bouncycastle.util.a.c(this.f57176e, iVar.f57176e);
        }
        return false;
    }

    @Override // x60.g, r70.c
    public byte[] getEncoded() {
        return c();
    }

    public int hashCode() {
        return (((((this.f57173b.hashCode() * 31) + this.f57174c.hashCode()) * 31) + org.bouncycastle.util.a.F(this.f57175d)) * 31) + org.bouncycastle.util.a.F(this.f57176e);
    }
}