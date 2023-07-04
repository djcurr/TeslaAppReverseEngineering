package x60;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Arrays;

/* loaded from: classes5.dex */
class f implements r70.c {

    /* renamed from: a  reason: collision with root package name */
    private final e f57157a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f57158b;

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f57159c;

    public f(e eVar, byte[] bArr, byte[] bArr2) {
        this.f57157a = eVar;
        this.f57158b = bArr;
        this.f57159c = bArr2;
    }

    public static f a(Object obj) {
        DataInputStream dataInputStream;
        if (obj instanceof f) {
            return (f) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream2 = (DataInputStream) obj;
            e e11 = e.e(dataInputStream2.readInt());
            byte[] bArr = new byte[e11.c()];
            dataInputStream2.readFully(bArr);
            byte[] bArr2 = new byte[e11.d() * e11.c()];
            dataInputStream2.readFully(bArr2);
            return new f(e11, bArr, bArr2);
        } else if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return a(t70.a.c((InputStream) obj));
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
                f a11 = a(dataInputStream);
                dataInputStream.close();
                return a11;
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

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        e eVar = this.f57157a;
        if (eVar == null ? fVar.f57157a == null : eVar.equals(fVar.f57157a)) {
            if (Arrays.equals(this.f57158b, fVar.f57158b)) {
                return Arrays.equals(this.f57159c, fVar.f57159c);
            }
            return false;
        }
        return false;
    }

    @Override // r70.c
    public byte[] getEncoded() {
        return a.f().i(this.f57157a.f()).d(this.f57158b).d(this.f57159c).b();
    }

    public int hashCode() {
        e eVar = this.f57157a;
        return ((((eVar != null ? eVar.hashCode() : 0) * 31) + Arrays.hashCode(this.f57158b)) * 31) + Arrays.hashCode(this.f57159c);
    }
}