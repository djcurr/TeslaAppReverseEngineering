package x60;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Arrays;

/* loaded from: classes5.dex */
class j implements r70.c {

    /* renamed from: a  reason: collision with root package name */
    private final int f57177a;

    /* renamed from: b  reason: collision with root package name */
    private final f f57178b;

    /* renamed from: c  reason: collision with root package name */
    private final k f57179c;

    /* renamed from: d  reason: collision with root package name */
    private final byte[][] f57180d;

    public j(int i11, f fVar, k kVar, byte[][] bArr) {
        this.f57177a = i11;
        this.f57178b = fVar;
        this.f57179c = kVar;
        this.f57180d = bArr;
    }

    public static j a(Object obj) {
        DataInputStream dataInputStream;
        if (obj instanceof j) {
            return (j) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream2 = (DataInputStream) obj;
            int readInt = dataInputStream2.readInt();
            f a11 = f.a(obj);
            k e11 = k.e(dataInputStream2.readInt());
            int c11 = e11.c();
            byte[][] bArr = new byte[c11];
            for (int i11 = 0; i11 < c11; i11++) {
                bArr[i11] = new byte[e11.d()];
                dataInputStream2.readFully(bArr[i11]);
            }
            return new j(readInt, a11, e11, bArr);
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
                j a12 = a(dataInputStream);
                dataInputStream.close();
                return a12;
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
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f57177a != jVar.f57177a) {
            return false;
        }
        f fVar = this.f57178b;
        if (fVar == null ? jVar.f57178b == null : fVar.equals(jVar.f57178b)) {
            k kVar = this.f57179c;
            if (kVar == null ? jVar.f57179c == null : kVar.equals(jVar.f57179c)) {
                return Arrays.deepEquals(this.f57180d, jVar.f57180d);
            }
            return false;
        }
        return false;
    }

    @Override // r70.c
    public byte[] getEncoded() {
        return a.f().i(this.f57177a).d(this.f57178b.getEncoded()).i(this.f57179c.f()).e(this.f57180d).b();
    }

    public int hashCode() {
        int i11 = this.f57177a * 31;
        f fVar = this.f57178b;
        int hashCode = (i11 + (fVar != null ? fVar.hashCode() : 0)) * 31;
        k kVar = this.f57179c;
        return ((hashCode + (kVar != null ? kVar.hashCode() : 0)) * 31) + Arrays.deepHashCode(this.f57180d);
    }
}