package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.OutputStream;
import java.util.NoSuchElementException;
import kotlin.reflect.jvm.internal.impl.protobuf.d;

/* loaded from: classes5.dex */
public class n extends d {

    /* renamed from: b */
    protected final byte[] f35030b;

    /* renamed from: c */
    private int f35031c = 0;

    /* loaded from: classes5.dex */
    public class b implements d.a {

        /* renamed from: a */
        private int f35032a;

        /* renamed from: b */
        private final int f35033b;

        @Override // java.util.Iterator
        /* renamed from: a */
        public Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f35032a < this.f35033b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.d.a
        public byte nextByte() {
            try {
                byte[] bArr = n.this.f35030b;
                int i11 = this.f35032a;
                this.f35032a = i11 + 1;
                return bArr[i11];
            } catch (ArrayIndexOutOfBoundsException e11) {
                throw new NoSuchElementException(e11.getMessage());
            }
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private b() {
            n.this = r2;
            this.f35032a = 0;
            this.f35033b = r2.size();
        }
    }

    public n(byte[] bArr) {
        this.f35030b = bArr;
    }

    static int C(int i11, byte[] bArr, int i12, int i13) {
        for (int i14 = i12; i14 < i12 + i13; i14++) {
            i11 = (i11 * 31) + bArr[i14];
        }
        return i11;
    }

    public boolean A(n nVar, int i11, int i12) {
        if (i12 <= nVar.size()) {
            if (i11 + i12 <= nVar.size()) {
                byte[] bArr = this.f35030b;
                byte[] bArr2 = nVar.f35030b;
                int B = B() + i12;
                int B2 = B();
                int B3 = nVar.B() + i11;
                while (B2 < B) {
                    if (bArr[B2] != bArr2[B3]) {
                        return false;
                    }
                    B2++;
                    B3++;
                }
                return true;
            }
            int size = nVar.size();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: ");
            sb2.append(i11);
            sb2.append(", ");
            sb2.append(i12);
            sb2.append(", ");
            sb2.append(size);
            throw new IllegalArgumentException(sb2.toString());
        }
        int size2 = size();
        StringBuilder sb3 = new StringBuilder(40);
        sb3.append("Length too large: ");
        sb3.append(i12);
        sb3.append(size2);
        throw new IllegalArgumentException(sb3.toString());
    }

    public int B() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof d) && size() == ((d) obj).size()) {
            if (size() == 0) {
                return true;
            }
            if (obj instanceof n) {
                return A((n) obj, 0, size());
            }
            if (obj instanceof s) {
                return obj.equals(this);
            }
            String valueOf = String.valueOf(obj.getClass());
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 49);
            sb2.append("Has a new type of ByteString been created? Found ");
            sb2.append(valueOf);
            throw new IllegalArgumentException(sb2.toString());
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.f35031c;
        if (i11 == 0) {
            int size = size();
            i11 = r(size, 0, size);
            if (i11 == 0) {
                i11 = 1;
            }
            this.f35031c = i11;
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public void j(byte[] bArr, int i11, int i12, int i13) {
        System.arraycopy(this.f35030b, i11, bArr, i12, i13);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public int k() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public boolean m() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public boolean n() {
        int B = B();
        return v.f(this.f35030b, B, size() + B);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d, java.lang.Iterable
    /* renamed from: o */
    public d.a iterator() {
        return new b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public e p() {
        return e.h(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public int r(int i11, int i12, int i13) {
        return C(i11, this.f35030b, B() + i12, i13);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public int s(int i11, int i12, int i13) {
        int B = B() + i12;
        return v.g(i11, this.f35030b, B, i13 + B);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public int size() {
        return this.f35030b.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public int t() {
        return this.f35031c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public String v(String str) {
        return new String(this.f35030b, B(), size(), str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public void y(OutputStream outputStream, int i11, int i12) {
        outputStream.write(this.f35030b, B() + i11, i12);
    }

    public byte z(int i11) {
        return this.f35030b[i11];
    }
}