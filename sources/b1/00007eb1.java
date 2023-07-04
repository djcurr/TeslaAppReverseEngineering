package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.NoSuchElementException;
import kotlin.reflect.jvm.internal.impl.protobuf.d;
import org.slf4j.Marker;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class c extends n {

    /* renamed from: d  reason: collision with root package name */
    private final int f34965d;

    /* renamed from: e  reason: collision with root package name */
    private final int f34966e;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public class b implements d.a {

        /* renamed from: a  reason: collision with root package name */
        private int f34967a;

        /* renamed from: b  reason: collision with root package name */
        private final int f34968b;

        @Override // java.util.Iterator
        /* renamed from: a */
        public Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f34967a < this.f34968b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.d.a
        public byte nextByte() {
            int i11 = this.f34967a;
            if (i11 < this.f34968b) {
                byte[] bArr = c.this.f35030b;
                this.f34967a = i11 + 1;
                return bArr[i11];
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private b() {
            int B = c.this.B();
            this.f34967a = B;
            this.f34968b = B + c.this.size();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(byte[] bArr, int i11, int i12) {
        super(bArr);
        if (i11 < 0) {
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append("Offset too small: ");
            sb2.append(i11);
            throw new IllegalArgumentException(sb2.toString());
        } else if (i12 >= 0) {
            if (i11 + i12 <= bArr.length) {
                this.f34965d = i11;
                this.f34966e = i12;
                return;
            }
            StringBuilder sb3 = new StringBuilder(48);
            sb3.append("Offset+Length too large: ");
            sb3.append(i11);
            sb3.append(Marker.ANY_NON_NULL_MARKER);
            sb3.append(i12);
            throw new IllegalArgumentException(sb3.toString());
        } else {
            StringBuilder sb4 = new StringBuilder(29);
            sb4.append("Length too small: ");
            sb4.append(i11);
            throw new IllegalArgumentException(sb4.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    public int B() {
        return this.f34965d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n, kotlin.reflect.jvm.internal.impl.protobuf.d
    public void j(byte[] bArr, int i11, int i12, int i13) {
        System.arraycopy(this.f35030b, B() + i11, bArr, i12, i13);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n, kotlin.reflect.jvm.internal.impl.protobuf.d, java.lang.Iterable
    /* renamed from: o */
    public d.a iterator() {
        return new b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n, kotlin.reflect.jvm.internal.impl.protobuf.d
    public int size() {
        return this.f34966e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    public byte z(int i11) {
        if (i11 >= 0) {
            if (i11 < size()) {
                return this.f35030b[this.f34965d + i11];
            }
            int size = size();
            StringBuilder sb2 = new StringBuilder(41);
            sb2.append("Index too large: ");
            sb2.append(i11);
            sb2.append(", ");
            sb2.append(size);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(28);
        sb3.append("Index too small: ");
        sb3.append(i11);
        throw new ArrayIndexOutOfBoundsException(sb3.toString());
    }
}