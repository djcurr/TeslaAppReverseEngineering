package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.slf4j.Marker;

/* loaded from: classes5.dex */
public abstract class d implements Iterable<Byte> {

    /* renamed from: a  reason: collision with root package name */
    public static final d f34970a = new n(new byte[0]);

    /* loaded from: classes5.dex */
    public interface a extends Iterator<Byte> {
        byte nextByte();
    }

    private static d b(Iterator<d> it2, int i11) {
        if (i11 == 1) {
            return it2.next();
        }
        int i12 = i11 >>> 1;
        return b(it2, i12).c(b(it2, i11 - i12));
    }

    public static d d(Iterable<d> iterable) {
        Collection collection;
        if (!(iterable instanceof Collection)) {
            collection = new ArrayList();
            for (d dVar : iterable) {
                collection.add(dVar);
            }
        } else {
            collection = (Collection) iterable;
        }
        if (collection.isEmpty()) {
            return f34970a;
        }
        return b(collection.iterator(), collection.size());
    }

    public static d e(byte[] bArr) {
        return f(bArr, 0, bArr.length);
    }

    public static d f(byte[] bArr, int i11, int i12) {
        byte[] bArr2 = new byte[i12];
        System.arraycopy(bArr, i11, bArr2, 0, i12);
        return new n(bArr2);
    }

    public static d h(String str) {
        try {
            return new n(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e11) {
            throw new RuntimeException("UTF-8 not supported?", e11);
        }
    }

    public static b q() {
        return new b(128);
    }

    public d c(d dVar) {
        int size = size();
        int size2 = dVar.size();
        if (size + size2 < 2147483647L) {
            return s.C(this, dVar);
        }
        StringBuilder sb2 = new StringBuilder(53);
        sb2.append("ByteString would be too long: ");
        sb2.append(size);
        sb2.append(Marker.ANY_NON_NULL_MARKER);
        sb2.append(size2);
        throw new IllegalArgumentException(sb2.toString());
    }

    public void i(byte[] bArr, int i11, int i12, int i13) {
        if (i11 < 0) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Source offset < 0: ");
            sb2.append(i11);
            throw new IndexOutOfBoundsException(sb2.toString());
        } else if (i12 < 0) {
            StringBuilder sb3 = new StringBuilder(30);
            sb3.append("Target offset < 0: ");
            sb3.append(i12);
            throw new IndexOutOfBoundsException(sb3.toString());
        } else if (i13 >= 0) {
            int i14 = i11 + i13;
            if (i14 <= size()) {
                int i15 = i12 + i13;
                if (i15 <= bArr.length) {
                    if (i13 > 0) {
                        j(bArr, i11, i12, i13);
                        return;
                    }
                    return;
                }
                StringBuilder sb4 = new StringBuilder(34);
                sb4.append("Target end offset < 0: ");
                sb4.append(i15);
                throw new IndexOutOfBoundsException(sb4.toString());
            }
            StringBuilder sb5 = new StringBuilder(34);
            sb5.append("Source end offset < 0: ");
            sb5.append(i14);
            throw new IndexOutOfBoundsException(sb5.toString());
        } else {
            StringBuilder sb6 = new StringBuilder(23);
            sb6.append("Length < 0: ");
            sb6.append(i13);
            throw new IndexOutOfBoundsException(sb6.toString());
        }
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void j(byte[] bArr, int i11, int i12, int i13);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int k();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract boolean m();

    public abstract boolean n();

    @Override // java.lang.Iterable
    /* renamed from: o */
    public abstract a iterator();

    public abstract e p();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int r(int i11, int i12, int i13);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int s(int i11, int i12, int i13);

    public abstract int size();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int t();

    public String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    public byte[] u() {
        int size = size();
        if (size == 0) {
            return i.f35020a;
        }
        byte[] bArr = new byte[size];
        j(bArr, 0, 0, size);
        return bArr;
    }

    public abstract String v(String str);

    public String w() {
        try {
            return v("UTF-8");
        } catch (UnsupportedEncodingException e11) {
            throw new RuntimeException("UTF-8 not supported?", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void x(OutputStream outputStream, int i11, int i12) {
        if (i11 < 0) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Source offset < 0: ");
            sb2.append(i11);
            throw new IndexOutOfBoundsException(sb2.toString());
        } else if (i12 >= 0) {
            int i13 = i11 + i12;
            if (i13 <= size()) {
                if (i12 > 0) {
                    y(outputStream, i11, i12);
                    return;
                }
                return;
            }
            StringBuilder sb3 = new StringBuilder(39);
            sb3.append("Source end offset exceeded: ");
            sb3.append(i13);
            throw new IndexOutOfBoundsException(sb3.toString());
        } else {
            StringBuilder sb4 = new StringBuilder(23);
            sb4.append("Length < 0: ");
            sb4.append(i12);
            throw new IndexOutOfBoundsException(sb4.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void y(OutputStream outputStream, int i11, int i12);

    /* loaded from: classes5.dex */
    public static final class b extends OutputStream {

        /* renamed from: f  reason: collision with root package name */
        private static final byte[] f34971f = new byte[0];

        /* renamed from: a  reason: collision with root package name */
        private final int f34972a;

        /* renamed from: b  reason: collision with root package name */
        private final ArrayList<d> f34973b;

        /* renamed from: c  reason: collision with root package name */
        private int f34974c;

        /* renamed from: d  reason: collision with root package name */
        private byte[] f34975d;

        /* renamed from: e  reason: collision with root package name */
        private int f34976e;

        b(int i11) {
            if (i11 >= 0) {
                this.f34972a = i11;
                this.f34973b = new ArrayList<>();
                this.f34975d = new byte[i11];
                return;
            }
            throw new IllegalArgumentException("Buffer size < 0");
        }

        private byte[] a(byte[] bArr, int i11) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i11));
            return bArr2;
        }

        private void g(int i11) {
            this.f34973b.add(new n(this.f34975d));
            int length = this.f34974c + this.f34975d.length;
            this.f34974c = length;
            this.f34975d = new byte[Math.max(this.f34972a, Math.max(i11, length >>> 1))];
            this.f34976e = 0;
        }

        private void j() {
            int i11 = this.f34976e;
            byte[] bArr = this.f34975d;
            if (i11 >= bArr.length) {
                this.f34973b.add(new n(this.f34975d));
                this.f34975d = f34971f;
            } else if (i11 > 0) {
                this.f34973b.add(new n(a(bArr, i11)));
            }
            this.f34974c += this.f34976e;
            this.f34976e = 0;
        }

        public synchronized d l() {
            j();
            return d.d(this.f34973b);
        }

        public synchronized int size() {
            return this.f34974c + this.f34976e;
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
        }

        @Override // java.io.OutputStream
        public synchronized void write(int i11) {
            if (this.f34976e == this.f34975d.length) {
                g(1);
            }
            byte[] bArr = this.f34975d;
            int i12 = this.f34976e;
            this.f34976e = i12 + 1;
            bArr[i12] = (byte) i11;
        }

        @Override // java.io.OutputStream
        public synchronized void write(byte[] bArr, int i11, int i12) {
            byte[] bArr2 = this.f34975d;
            int length = bArr2.length;
            int i13 = this.f34976e;
            if (i12 <= length - i13) {
                System.arraycopy(bArr, i11, bArr2, i13, i12);
                this.f34976e += i12;
            } else {
                int length2 = bArr2.length - i13;
                System.arraycopy(bArr, i11, bArr2, i13, length2);
                int i14 = i12 - length2;
                g(i14);
                System.arraycopy(bArr, i11 + length2, this.f34975d, 0, i14);
                this.f34976e = i14;
            }
        }
    }
}