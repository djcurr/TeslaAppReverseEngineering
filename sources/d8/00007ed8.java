package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Stack;
import kotlin.reflect.jvm.internal.impl.protobuf.d;

/* loaded from: classes5.dex */
public class s extends kotlin.reflect.jvm.internal.impl.protobuf.d {

    /* renamed from: h */
    private static final int[] f35035h;

    /* renamed from: b */
    private final int f35036b;

    /* renamed from: c */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f35037c;

    /* renamed from: d */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f35038d;

    /* renamed from: e */
    private final int f35039e;

    /* renamed from: f */
    private final int f35040f;

    /* renamed from: g */
    private int f35041g;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class b {

        /* renamed from: a */
        private final Stack<kotlin.reflect.jvm.internal.impl.protobuf.d> f35042a;

        private b() {
            this.f35042a = new Stack<>();
        }

        public kotlin.reflect.jvm.internal.impl.protobuf.d b(kotlin.reflect.jvm.internal.impl.protobuf.d dVar, kotlin.reflect.jvm.internal.impl.protobuf.d dVar2) {
            c(dVar);
            c(dVar2);
            kotlin.reflect.jvm.internal.impl.protobuf.d pop = this.f35042a.pop();
            while (!this.f35042a.isEmpty()) {
                pop = new s(this.f35042a.pop(), pop);
            }
            return pop;
        }

        private void c(kotlin.reflect.jvm.internal.impl.protobuf.d dVar) {
            if (dVar.m()) {
                e(dVar);
            } else if (dVar instanceof s) {
                s sVar = (s) dVar;
                c(sVar.f35037c);
                c(sVar.f35038d);
            } else {
                String valueOf = String.valueOf(dVar.getClass());
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 49);
                sb2.append("Has a new type of ByteString been created? Found ");
                sb2.append(valueOf);
                throw new IllegalArgumentException(sb2.toString());
            }
        }

        private int d(int i11) {
            int binarySearch = Arrays.binarySearch(s.f35035h, i11);
            return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
        }

        private void e(kotlin.reflect.jvm.internal.impl.protobuf.d dVar) {
            int d11 = d(dVar.size());
            int i11 = s.f35035h[d11 + 1];
            if (!this.f35042a.isEmpty() && this.f35042a.peek().size() < i11) {
                int i12 = s.f35035h[d11];
                kotlin.reflect.jvm.internal.impl.protobuf.d pop = this.f35042a.pop();
                while (!this.f35042a.isEmpty() && this.f35042a.peek().size() < i12) {
                    pop = new s(this.f35042a.pop(), pop);
                }
                s sVar = new s(pop, dVar);
                while (!this.f35042a.isEmpty()) {
                    if (this.f35042a.peek().size() >= s.f35035h[d(sVar.size()) + 1]) {
                        break;
                    }
                    sVar = new s(this.f35042a.pop(), sVar);
                }
                this.f35042a.push(sVar);
                return;
            }
            this.f35042a.push(dVar);
        }
    }

    /* loaded from: classes5.dex */
    public static class c implements Iterator<n> {

        /* renamed from: a */
        private final Stack<s> f35043a;

        /* renamed from: b */
        private n f35044b;

        private n a(kotlin.reflect.jvm.internal.impl.protobuf.d dVar) {
            while (dVar instanceof s) {
                s sVar = (s) dVar;
                this.f35043a.push(sVar);
                dVar = sVar.f35037c;
            }
            return (n) dVar;
        }

        private n b() {
            while (!this.f35043a.isEmpty()) {
                n a11 = a(this.f35043a.pop().f35038d);
                if (!a11.isEmpty()) {
                    return a11;
                }
            }
            return null;
        }

        @Override // java.util.Iterator
        /* renamed from: c */
        public n next() {
            n nVar = this.f35044b;
            if (nVar != null) {
                this.f35044b = b();
                return nVar;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f35044b != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private c(kotlin.reflect.jvm.internal.impl.protobuf.d dVar) {
            this.f35043a = new Stack<>();
            this.f35044b = a(dVar);
        }
    }

    /* loaded from: classes5.dex */
    public class d implements d.a {

        /* renamed from: a */
        private final c f35045a;

        /* renamed from: b */
        private d.a f35046b;

        /* renamed from: c */
        int f35047c;

        @Override // java.util.Iterator
        /* renamed from: a */
        public Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f35047c > 0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.d.a
        public byte nextByte() {
            if (!this.f35046b.hasNext()) {
                this.f35046b = this.f35045a.next().iterator();
            }
            this.f35047c--;
            return this.f35046b.nextByte();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private d(s sVar) {
            c cVar = new c(sVar);
            this.f35045a = cVar;
            this.f35046b = cVar.next().iterator();
            this.f35047c = sVar.size();
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        int i11 = 1;
        int i12 = 1;
        while (i11 > 0) {
            arrayList.add(Integer.valueOf(i11));
            int i13 = i12 + i11;
            i12 = i11;
            i11 = i13;
        }
        arrayList.add(Integer.MAX_VALUE);
        f35035h = new int[arrayList.size()];
        int i14 = 0;
        while (true) {
            int[] iArr = f35035h;
            if (i14 >= iArr.length) {
                return;
            }
            iArr[i14] = ((Integer) arrayList.get(i14)).intValue();
            i14++;
        }
    }

    public static kotlin.reflect.jvm.internal.impl.protobuf.d C(kotlin.reflect.jvm.internal.impl.protobuf.d dVar, kotlin.reflect.jvm.internal.impl.protobuf.d dVar2) {
        s sVar = dVar instanceof s ? (s) dVar : null;
        if (dVar2.size() == 0) {
            return dVar;
        }
        if (dVar.size() != 0) {
            int size = dVar.size() + dVar2.size();
            if (size < 128) {
                return D(dVar, dVar2);
            }
            if (sVar != null && sVar.f35038d.size() + dVar2.size() < 128) {
                dVar2 = new s(sVar.f35037c, D(sVar.f35038d, dVar2));
            } else if (sVar != null && sVar.f35037c.k() > sVar.f35038d.k() && sVar.k() > dVar2.k()) {
                dVar2 = new s(sVar.f35037c, new s(sVar.f35038d, dVar2));
            } else {
                if (size < f35035h[Math.max(dVar.k(), dVar2.k()) + 1]) {
                    return new b().b(dVar, dVar2);
                }
                return new s(dVar, dVar2);
            }
        }
        return dVar2;
    }

    private static n D(kotlin.reflect.jvm.internal.impl.protobuf.d dVar, kotlin.reflect.jvm.internal.impl.protobuf.d dVar2) {
        int size = dVar.size();
        int size2 = dVar2.size();
        byte[] bArr = new byte[size + size2];
        dVar.i(bArr, 0, 0, size);
        dVar2.i(bArr, 0, size, size2);
        return new n(bArr);
    }

    private boolean E(kotlin.reflect.jvm.internal.impl.protobuf.d dVar) {
        c cVar = new c(this);
        n next = cVar.next();
        c cVar2 = new c(dVar);
        n next2 = cVar2.next();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int size = next.size() - i11;
            int size2 = next2.size() - i12;
            int min = Math.min(size, size2);
            if (!(i11 == 0 ? next.A(next2, i12, min) : next2.A(next, i11, min))) {
                return false;
            }
            i13 += min;
            int i14 = this.f35036b;
            if (i13 >= i14) {
                if (i13 == i14) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == size) {
                next = cVar.next();
                i11 = 0;
            } else {
                i11 += min;
            }
            if (min == size2) {
                next2 = cVar2.next();
                i12 = 0;
            } else {
                i12 += min;
            }
        }
    }

    public boolean equals(Object obj) {
        int t11;
        if (obj == this) {
            return true;
        }
        if (obj instanceof kotlin.reflect.jvm.internal.impl.protobuf.d) {
            kotlin.reflect.jvm.internal.impl.protobuf.d dVar = (kotlin.reflect.jvm.internal.impl.protobuf.d) obj;
            if (this.f35036b != dVar.size()) {
                return false;
            }
            if (this.f35036b == 0) {
                return true;
            }
            if (this.f35041g == 0 || (t11 = dVar.t()) == 0 || this.f35041g == t11) {
                return E(dVar);
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.f35041g;
        if (i11 == 0) {
            int i12 = this.f35036b;
            i11 = r(i12, 0, i12);
            if (i11 == 0) {
                i11 = 1;
            }
            this.f35041g = i11;
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public void j(byte[] bArr, int i11, int i12, int i13) {
        int i14 = i11 + i13;
        int i15 = this.f35039e;
        if (i14 <= i15) {
            this.f35037c.j(bArr, i11, i12, i13);
        } else if (i11 >= i15) {
            this.f35038d.j(bArr, i11 - i15, i12, i13);
        } else {
            int i16 = i15 - i11;
            this.f35037c.j(bArr, i11, i12, i16);
            this.f35038d.j(bArr, 0, i12 + i16, i13 - i16);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public int k() {
        return this.f35040f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public boolean m() {
        return this.f35036b >= f35035h[this.f35040f];
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public boolean n() {
        int s11 = this.f35037c.s(0, 0, this.f35039e);
        kotlin.reflect.jvm.internal.impl.protobuf.d dVar = this.f35038d;
        return dVar.s(s11, 0, dVar.size()) == 0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d, java.lang.Iterable
    /* renamed from: o */
    public d.a iterator() {
        return new d();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public kotlin.reflect.jvm.internal.impl.protobuf.e p() {
        return kotlin.reflect.jvm.internal.impl.protobuf.e.g(new e());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public int r(int i11, int i12, int i13) {
        int i14 = i12 + i13;
        int i15 = this.f35039e;
        if (i14 <= i15) {
            return this.f35037c.r(i11, i12, i13);
        }
        if (i12 >= i15) {
            return this.f35038d.r(i11, i12 - i15, i13);
        }
        int i16 = i15 - i12;
        return this.f35038d.r(this.f35037c.r(i11, i12, i16), 0, i13 - i16);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public int s(int i11, int i12, int i13) {
        int i14 = i12 + i13;
        int i15 = this.f35039e;
        if (i14 <= i15) {
            return this.f35037c.s(i11, i12, i13);
        }
        if (i12 >= i15) {
            return this.f35038d.s(i11, i12 - i15, i13);
        }
        int i16 = i15 - i12;
        return this.f35038d.s(this.f35037c.s(i11, i12, i16), 0, i13 - i16);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public int size() {
        return this.f35036b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public int t() {
        return this.f35041g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public String v(String str) {
        return new String(u(), str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public void y(OutputStream outputStream, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.f35039e;
        if (i13 <= i14) {
            this.f35037c.y(outputStream, i11, i12);
        } else if (i11 >= i14) {
            this.f35038d.y(outputStream, i11 - i14, i12);
        } else {
            int i15 = i14 - i11;
            this.f35037c.y(outputStream, i11, i15);
            this.f35038d.y(outputStream, 0, i12 - i15);
        }
    }

    private s(kotlin.reflect.jvm.internal.impl.protobuf.d dVar, kotlin.reflect.jvm.internal.impl.protobuf.d dVar2) {
        this.f35041g = 0;
        this.f35037c = dVar;
        this.f35038d = dVar2;
        int size = dVar.size();
        this.f35039e = size;
        this.f35036b = size + dVar2.size();
        this.f35040f = Math.max(dVar.k(), dVar2.k()) + 1;
    }

    /* loaded from: classes5.dex */
    private class e extends InputStream {

        /* renamed from: a */
        private c f35048a;

        /* renamed from: b */
        private n f35049b;

        /* renamed from: c */
        private int f35050c;

        /* renamed from: d */
        private int f35051d;

        /* renamed from: e */
        private int f35052e;

        /* renamed from: f */
        private int f35053f;

        public e() {
            s.this = r1;
            g();
        }

        private void a() {
            if (this.f35049b != null) {
                int i11 = this.f35051d;
                int i12 = this.f35050c;
                if (i11 == i12) {
                    this.f35052e += i12;
                    this.f35051d = 0;
                    if (this.f35048a.hasNext()) {
                        n next = this.f35048a.next();
                        this.f35049b = next;
                        this.f35050c = next.size();
                        return;
                    }
                    this.f35049b = null;
                    this.f35050c = 0;
                }
            }
        }

        private void g() {
            c cVar = new c(s.this);
            this.f35048a = cVar;
            n next = cVar.next();
            this.f35049b = next;
            this.f35050c = next.size();
            this.f35051d = 0;
            this.f35052e = 0;
        }

        private int j(byte[] bArr, int i11, int i12) {
            int i13 = i12;
            while (true) {
                if (i13 <= 0) {
                    break;
                }
                a();
                if (this.f35049b != null) {
                    int min = Math.min(this.f35050c - this.f35051d, i13);
                    if (bArr != null) {
                        this.f35049b.i(bArr, this.f35051d, i11, min);
                        i11 += min;
                    }
                    this.f35051d += min;
                    i13 -= min;
                } else if (i13 == i12) {
                    return -1;
                }
            }
            return i12 - i13;
        }

        @Override // java.io.InputStream
        public int available() {
            return s.this.size() - (this.f35052e + this.f35051d);
        }

        @Override // java.io.InputStream
        public void mark(int i11) {
            this.f35053f = this.f35052e + this.f35051d;
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i11, int i12) {
            Objects.requireNonNull(bArr);
            if (i11 >= 0 && i12 >= 0 && i12 <= bArr.length - i11) {
                return j(bArr, i11, i12);
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            g();
            j(null, 0, this.f35053f);
        }

        @Override // java.io.InputStream
        public long skip(long j11) {
            if (j11 >= 0) {
                if (j11 > 2147483647L) {
                    j11 = 2147483647L;
                }
                return j(null, 0, (int) j11);
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.io.InputStream
        public int read() {
            a();
            n nVar = this.f35049b;
            if (nVar == null) {
                return -1;
            }
            int i11 = this.f35051d;
            this.f35051d = i11 + 1;
            return nVar.z(i11) & 255;
        }
    }
}