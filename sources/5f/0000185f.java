package com.facebook.react.common.mapbuffer;

import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class ReadableMapBuffer implements Iterable<c> {

    /* renamed from: a  reason: collision with root package name */
    ByteBuffer f11820a;

    /* renamed from: b  reason: collision with root package name */
    private int f11821b;
    @xf.a
    private HybridData mHybridData;

    /* loaded from: classes3.dex */
    class a implements Iterator<c> {

        /* renamed from: a  reason: collision with root package name */
        int f11822a = 0;

        /* renamed from: b  reason: collision with root package name */
        final int f11823b;

        a() {
            this.f11823b = ReadableMapBuffer.this.getCount() - 1;
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public c next() {
            ReadableMapBuffer readableMapBuffer = ReadableMapBuffer.this;
            int i11 = this.f11822a;
            this.f11822a = i11 + 1;
            return new c(readableMapBuffer, ReadableMapBuffer.k(i11), null);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f11822a <= this.f11823b;
        }
    }

    /* loaded from: classes3.dex */
    public enum b {
        BOOL,
        INT,
        DOUBLE,
        STRING,
        MAP
    }

    /* loaded from: classes3.dex */
    public class c {

        /* renamed from: a  reason: collision with root package name */
        private final int f11825a;

        /* synthetic */ c(ReadableMapBuffer readableMapBuffer, int i11, a aVar) {
            this(i11);
        }

        private void a(b bVar) {
            b h11 = h();
            if (bVar == h11) {
                return;
            }
            throw new IllegalStateException("Expected " + bVar + " for key: " + e() + " found " + h11.toString() + " instead.");
        }

        public boolean b() {
            a(b.BOOL);
            return ReadableMapBuffer.this.s(this.f11825a + 4);
        }

        public double c() {
            a(b.DOUBLE);
            return ReadableMapBuffer.this.u(this.f11825a + 4);
        }

        public int d() {
            a(b.INT);
            return ReadableMapBuffer.this.w(this.f11825a + 4);
        }

        public int e() {
            return ReadableMapBuffer.this.z(this.f11825a);
        }

        public ReadableMapBuffer f() {
            a(b.MAP);
            return ReadableMapBuffer.this.x(this.f11825a + 4);
        }

        public String g() {
            a(b.STRING);
            return ReadableMapBuffer.this.y(this.f11825a + 4);
        }

        public b h() {
            return b.values()[ReadableMapBuffer.this.z(this.f11825a + 2)];
        }

        private c(int i11) {
            this.f11825a = i11;
        }
    }

    static {
        zf.a.a();
    }

    @xf.a
    private ReadableMapBuffer(HybridData hybridData) {
        this.f11820a = null;
        this.f11821b = 0;
        this.mHybridData = hybridData;
    }

    private native ByteBuffer importByteBuffer();

    private int j(int i11) {
        r();
        int count = getCount() - 1;
        int i12 = 0;
        while (i12 <= count) {
            int i13 = (i12 + count) >>> 1;
            int z11 = z(k(i13));
            if (z11 < i11) {
                i12 = i13 + 1;
            } else if (z11 <= i11) {
                return i13;
            } else {
                count = i13 - 1;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int k(int i11) {
        return (i11 * 12) + 8;
    }

    private int n() {
        return k(this.f11821b);
    }

    private int p(int i11, b bVar) {
        int j11 = j(i11);
        b t11 = t(j11);
        if (j11 == -1) {
            throw new IllegalArgumentException("Key not found: " + i11);
        } else if (t11 == bVar) {
            return k(j11) + 4;
        } else {
            throw new IllegalStateException("Expected " + bVar + " for key: " + i11 + " found " + t11.toString() + " instead.");
        }
    }

    private ByteBuffer r() {
        ByteBuffer byteBuffer = this.f11820a;
        if (byteBuffer != null) {
            return byteBuffer;
        }
        this.f11820a = importByteBuffer();
        v();
        return this.f11820a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean s(int i11) {
        return w(i11) == 1;
    }

    private b t(int i11) {
        return b.values()[z(k(i11) + 2)];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public double u(int i11) {
        return this.f11820a.getDouble(i11);
    }

    private void v() {
        if (this.f11820a.getShort() != 254) {
            this.f11820a.order(ByteOrder.LITTLE_ENDIAN);
        }
        this.f11821b = z(this.f11820a.position());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int w(int i11) {
        return this.f11820a.getInt(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ReadableMapBuffer x(int i11) {
        int n11 = n() + this.f11820a.getInt(i11);
        int i12 = this.f11820a.getInt(n11);
        byte[] bArr = new byte[i12];
        this.f11820a.position(n11 + 4);
        this.f11820a.get(bArr, 0, i12);
        return new ReadableMapBuffer(ByteBuffer.wrap(bArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String y(int i11) {
        int n11 = n() + this.f11820a.getInt(i11);
        int i12 = this.f11820a.getInt(n11);
        byte[] bArr = new byte[i12];
        this.f11820a.position(n11 + 4);
        this.f11820a.get(bArr, 0, i12);
        return new String(bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int z(int i11) {
        return this.f11820a.getShort(i11) & 65535;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ReadableMapBuffer) {
            ByteBuffer r11 = r();
            ByteBuffer r12 = ((ReadableMapBuffer) obj).r();
            if (r11 == r12) {
                return true;
            }
            r11.rewind();
            r12.rewind();
            return r11.equals(r12);
        }
        return false;
    }

    public boolean getBoolean(int i11) {
        return s(p(i11, b.BOOL));
    }

    public int getCount() {
        r();
        return this.f11821b;
    }

    public double getDouble(int i11) {
        return u(p(i11, b.DOUBLE));
    }

    public int getInt(int i11) {
        return w(p(i11, b.INT));
    }

    public int hashCode() {
        ByteBuffer r11 = r();
        r11.rewind();
        return r11.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator<c> iterator() {
        return new a();
    }

    public ReadableMapBuffer m(int i11) {
        return x(p(i11, b.MAP));
    }

    public String o(int i11) {
        return y(p(i11, b.STRING));
    }

    public boolean q(int i11) {
        return j(i11) != -1;
    }

    private ReadableMapBuffer(ByteBuffer byteBuffer) {
        this.f11820a = null;
        this.f11821b = 0;
        this.f11820a = byteBuffer;
        v();
    }
}