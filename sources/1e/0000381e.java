package com.google.crypto.tink.shaded.protobuf;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Objects;

/* loaded from: classes3.dex */
public abstract class i implements Iterable<Byte>, Serializable {

    /* renamed from: b  reason: collision with root package name */
    public static final i f16278b = new j(a0.f16231b);

    /* renamed from: c  reason: collision with root package name */
    private static final f f16279c;

    /* renamed from: a  reason: collision with root package name */
    private int f16280a = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a extends c {

        /* renamed from: a  reason: collision with root package name */
        private int f16281a = 0;

        /* renamed from: b  reason: collision with root package name */
        private final int f16282b;

        a() {
            this.f16282b = i.this.size();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f16281a < this.f16282b;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i.g
        public byte nextByte() {
            int i11 = this.f16281a;
            if (i11 < this.f16282b) {
                this.f16281a = i11 + 1;
                return i.this.k(i11);
            }
            throw new NoSuchElementException();
        }
    }

    /* loaded from: classes3.dex */
    class b implements Comparator<i> {
        b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(i iVar, i iVar2) {
            g it2 = iVar.iterator();
            g it3 = iVar2.iterator();
            while (it2.hasNext() && it3.hasNext()) {
                int compare = Integer.compare(i.u(it2.nextByte()), i.u(it3.nextByte()));
                if (compare != 0) {
                    return compare;
                }
            }
            return Integer.compare(iVar.size(), iVar2.size());
        }
    }

    /* loaded from: classes3.dex */
    static abstract class c implements g {
        c() {
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public final Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes3.dex */
    private static final class d implements f {
        private d() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i.f
        public byte[] copyFrom(byte[] bArr, int i11, int i12) {
            return Arrays.copyOfRange(bArr, i11, i12 + i11);
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class e extends j {

        /* renamed from: e  reason: collision with root package name */
        private final int f16284e;

        /* renamed from: f  reason: collision with root package name */
        private final int f16285f;

        e(byte[] bArr, int i11, int i12) {
            super(bArr);
            i.e(i11, i11 + i12, bArr.length);
            this.f16284e = i11;
            this.f16285f = i12;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i.j
        protected int D() {
            return this.f16284e;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i.j, com.google.crypto.tink.shaded.protobuf.i
        public byte c(int i11) {
            i.d(i11, size());
            return this.f16288d[this.f16284e + i11];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i.j, com.google.crypto.tink.shaded.protobuf.i
        protected void j(byte[] bArr, int i11, int i12, int i13) {
            System.arraycopy(this.f16288d, D() + i11, bArr, i12, i13);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i.j, com.google.crypto.tink.shaded.protobuf.i
        byte k(int i11) {
            return this.f16288d[this.f16284e + i11];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i.j, com.google.crypto.tink.shaded.protobuf.i
        public int size() {
            return this.f16285f;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public interface f {
        byte[] copyFrom(byte[] bArr, int i11, int i12);
    }

    /* loaded from: classes3.dex */
    public interface g extends Iterator<Byte> {
        byte nextByte();
    }

    /* loaded from: classes3.dex */
    static final class h {

        /* renamed from: a  reason: collision with root package name */
        private final CodedOutputStream f16286a;

        /* renamed from: b  reason: collision with root package name */
        private final byte[] f16287b;

        /* synthetic */ h(int i11, a aVar) {
            this(i11);
        }

        public i a() {
            this.f16286a.c();
            return new j(this.f16287b);
        }

        public CodedOutputStream b() {
            return this.f16286a;
        }

        private h(int i11) {
            byte[] bArr = new byte[i11];
            this.f16287b = bArr;
            this.f16286a = CodedOutputStream.d0(bArr);
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.i$i  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static abstract class AbstractC0299i extends i {
        AbstractC0299i() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class j extends AbstractC0299i {

        /* renamed from: d  reason: collision with root package name */
        protected final byte[] f16288d;

        j(byte[] bArr) {
            Objects.requireNonNull(bArr);
            this.f16288d = bArr;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        final void B(com.google.crypto.tink.shaded.protobuf.h hVar) {
            hVar.a(this.f16288d, D(), size());
        }

        final boolean C(i iVar, int i11, int i12) {
            if (i12 <= iVar.size()) {
                int i13 = i11 + i12;
                if (i13 <= iVar.size()) {
                    if (iVar instanceof j) {
                        j jVar = (j) iVar;
                        byte[] bArr = this.f16288d;
                        byte[] bArr2 = jVar.f16288d;
                        int D = D() + i12;
                        int D2 = D();
                        int D3 = jVar.D() + i11;
                        while (D2 < D) {
                            if (bArr[D2] != bArr2[D3]) {
                                return false;
                            }
                            D2++;
                            D3++;
                        }
                        return true;
                    }
                    return iVar.s(i11, i13).equals(s(0, i12));
                }
                throw new IllegalArgumentException("Ran off end of other: " + i11 + ", " + i12 + ", " + iVar.size());
            }
            throw new IllegalArgumentException("Length too large: " + i12 + size());
        }

        protected int D() {
            return 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public byte c(int i11) {
            return this.f16288d[i11];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof i) && size() == ((i) obj).size()) {
                if (size() == 0) {
                    return true;
                }
                if (obj instanceof j) {
                    j jVar = (j) obj;
                    int r11 = r();
                    int r12 = jVar.r();
                    if (r11 == 0 || r12 == 0 || r11 == r12) {
                        return C(jVar, 0, size());
                    }
                    return false;
                }
                return obj.equals(this);
            }
            return false;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        protected void j(byte[] bArr, int i11, int i12, int i13) {
            System.arraycopy(this.f16288d, i11, bArr, i12, i13);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        byte k(int i11) {
            return this.f16288d[i11];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public final boolean m() {
            int D = D();
            return q1.n(this.f16288d, D, size() + D);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public final com.google.crypto.tink.shaded.protobuf.j p() {
            return com.google.crypto.tink.shaded.protobuf.j.h(this.f16288d, D(), size(), true);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        protected final int q(int i11, int i12, int i13) {
            return a0.i(i11, this.f16288d, D() + i12, i13);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public final i s(int i11, int i12) {
            int e11 = i.e(i11, i12, size());
            if (e11 == 0) {
                return i.f16278b;
            }
            return new e(this.f16288d, D() + i11, e11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int size() {
            return this.f16288d.length;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        protected final String w(Charset charset) {
            return new String(this.f16288d, D(), size(), charset);
        }
    }

    /* loaded from: classes3.dex */
    private static final class k implements f {
        private k() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i.f
        public byte[] copyFrom(byte[] bArr, int i11, int i12) {
            byte[] bArr2 = new byte[i12];
            System.arraycopy(bArr, i11, bArr2, 0, i12);
            return bArr2;
        }

        /* synthetic */ k(a aVar) {
            this();
        }
    }

    static {
        f16279c = com.google.crypto.tink.shaded.protobuf.d.c() ? new k(null) : new d(null);
        new b();
    }

    i() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static i A(byte[] bArr, int i11, int i12) {
        return new e(bArr, i11, i12);
    }

    static void d(int i11, int i12) {
        if (((i12 - (i11 + 1)) | i11) < 0) {
            if (i11 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i11);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i11 + ", " + i12);
        }
    }

    static int e(int i11, int i12, int i13) {
        int i14 = i12 - i11;
        if ((i11 | i12 | i14 | (i13 - i12)) < 0) {
            if (i11 < 0) {
                throw new IndexOutOfBoundsException("Beginning index: " + i11 + " < 0");
            } else if (i12 < i11) {
                throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i11 + ", " + i12);
            } else {
                throw new IndexOutOfBoundsException("End index: " + i12 + " >= " + i13);
            }
        }
        return i14;
    }

    public static i f(byte[] bArr) {
        return h(bArr, 0, bArr.length);
    }

    public static i h(byte[] bArr, int i11, int i12) {
        e(i11, i11 + i12, bArr.length);
        return new j(f16279c.copyFrom(bArr, i11, i12));
    }

    public static i i(String str) {
        return new j(str.getBytes(a0.f16230a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static h o(int i11) {
        return new h(i11, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int u(byte b11) {
        return b11 & 255;
    }

    private String y() {
        if (size() <= 50) {
            return k1.a(this);
        }
        return k1.a(s(0, 47)) + "...";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static i z(byte[] bArr) {
        return new j(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void B(com.google.crypto.tink.shaded.protobuf.h hVar);

    public abstract byte c(int i11);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i11 = this.f16280a;
        if (i11 == 0) {
            int size = size();
            i11 = q(size, 0, size);
            if (i11 == 0) {
                i11 = 1;
            }
            this.f16280a = i11;
        }
        return i11;
    }

    protected abstract void j(byte[] bArr, int i11, int i12, int i13);

    abstract byte k(int i11);

    public abstract boolean m();

    @Override // java.lang.Iterable
    /* renamed from: n */
    public g iterator() {
        return new a();
    }

    public abstract com.google.crypto.tink.shaded.protobuf.j p();

    protected abstract int q(int i11, int i12, int i13);

    protected final int r() {
        return this.f16280a;
    }

    public abstract i s(int i11, int i12);

    public abstract int size();

    public final byte[] t() {
        int size = size();
        if (size == 0) {
            return a0.f16231b;
        }
        byte[] bArr = new byte[size];
        j(bArr, 0, 0, size);
        return bArr;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), y());
    }

    public final String v(Charset charset) {
        return size() == 0 ? "" : w(charset);
    }

    protected abstract String w(Charset charset);

    public final String x() {
        return v(a0.f16230a);
    }
}