package x60;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;

/* loaded from: classes5.dex */
public class d extends g {

    /* renamed from: b  reason: collision with root package name */
    private final int f57145b;

    /* renamed from: c  reason: collision with root package name */
    private final i f57146c;

    public d(int i11, i iVar) {
        super(false);
        this.f57145b = i11;
        this.f57146c = iVar;
    }

    public static d b(Object obj) {
        DataInputStream dataInputStream;
        if (obj instanceof d) {
            return (d) obj;
        }
        if (obj instanceof DataInputStream) {
            return new d(((DataInputStream) obj).readInt(), i.b(obj));
        }
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return b(t70.a.c((InputStream) obj));
            }
            throw new IllegalArgumentException("cannot parse " + obj);
        }
        DataInputStream dataInputStream2 = null;
        try {
            dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            d b11 = b(dataInputStream);
            dataInputStream.close();
            return b11;
        } catch (Throwable th3) {
            th = th3;
            dataInputStream2 = dataInputStream;
            if (dataInputStream2 != null) {
                dataInputStream2.close();
            }
            throw th;
        }
    }

    public int c() {
        return this.f57145b;
    }

    public i d() {
        return this.f57146c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f57145b != dVar.f57145b) {
            return false;
        }
        return this.f57146c.equals(dVar.f57146c);
    }

    @Override // x60.g, r70.c
    public byte[] getEncoded() {
        return a.f().i(this.f57145b).d(this.f57146c.getEncoded()).b();
    }

    public int hashCode() {
        return (this.f57145b * 31) + this.f57146c.hashCode();
    }
}