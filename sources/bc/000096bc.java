package org.bson.types;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.util.Date;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.internal.http2.Http2Connection;
import x70.a;

/* loaded from: classes5.dex */
public final class ObjectId implements Comparable<ObjectId>, Serializable {

    /* renamed from: e  reason: collision with root package name */
    private static final int f43227e;

    /* renamed from: f  reason: collision with root package name */
    private static final short f43228f;

    /* renamed from: g  reason: collision with root package name */
    private static final AtomicInteger f43229g = new AtomicInteger(new SecureRandom().nextInt());

    /* renamed from: h  reason: collision with root package name */
    private static final char[] f43230h = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a  reason: collision with root package name */
    private final int f43231a;

    /* renamed from: b  reason: collision with root package name */
    private final int f43232b;

    /* renamed from: c  reason: collision with root package name */
    private final int f43233c;

    /* renamed from: d  reason: collision with root package name */
    private final short f43234d;

    static {
        try {
            SecureRandom secureRandom = new SecureRandom();
            f43227e = secureRandom.nextInt(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
            f43228f = (short) secureRandom.nextInt(32768);
        } catch (Exception e11) {
            throw new RuntimeException(e11);
        }
    }

    public ObjectId() {
        this(new Date());
    }

    private static int b(Date date) {
        return (int) (date.getTime() / 1000);
    }

    private static byte c(int i11) {
        return (byte) i11;
    }

    private static byte d(int i11) {
        return (byte) (i11 >> 8);
    }

    private static byte e(int i11) {
        return (byte) (i11 >> 16);
    }

    private static byte f(int i11) {
        return (byte) (i11 >> 24);
    }

    public static boolean g(String str) {
        if (str != null) {
            int length = str.length();
            if (length != 24) {
                return false;
            }
            for (int i11 = 0; i11 < length; i11++) {
                char charAt = str.charAt(i11);
                if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'f') && (charAt < 'A' || charAt > 'F'))) {
                    return false;
                }
            }
            return true;
        }
        throw new IllegalArgumentException();
    }

    private static byte[] h(int i11, int i12, int i13) {
        return new byte[]{f(i11), e(i11), d(i11), c(i11), f(i12), e(i12), d(i12), c(i12), f(i13), e(i13), d(i13), c(i13)};
    }

    private static int i(byte b11, byte b12, byte b13, byte b14) {
        return (b11 << 24) | ((b12 & 255) << 16) | ((b13 & 255) << 8) | (b14 & 255);
    }

    private static short k(byte b11, byte b12) {
        return (short) (((b11 & 255) << 8) | (b12 & 255));
    }

    private static byte[] l(String str) {
        if (!g(str)) {
            throw new IllegalArgumentException("invalid hexadecimal representation of an ObjectId: [" + str + "]");
        }
        byte[] bArr = new byte[12];
        for (int i11 = 0; i11 < 12; i11++) {
            int i12 = i11 * 2;
            bArr[i11] = (byte) Integer.parseInt(str.substring(i12, i12 + 2), 16);
        }
        return bArr;
    }

    private static byte o(short s11) {
        return (byte) s11;
    }

    private static byte q(short s11) {
        return (byte) (s11 >> 8);
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(ObjectId objectId) {
        Objects.requireNonNull(objectId);
        byte[] r11 = r();
        byte[] r12 = objectId.r();
        for (int i11 = 0; i11 < 12; i11++) {
            if (r11[i11] != r12[i11]) {
                return (r11[i11] & 255) < (r12[i11] & 255) ? -1 : 1;
            }
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ObjectId.class != obj.getClass()) {
            return false;
        }
        ObjectId objectId = (ObjectId) obj;
        return this.f43232b == objectId.f43232b && this.f43231a == objectId.f43231a && this.f43233c == objectId.f43233c && this.f43234d == objectId.f43234d;
    }

    public int hashCode() {
        return (((((this.f43231a * 31) + this.f43232b) * 31) + this.f43233c) * 31) + this.f43234d;
    }

    public void n(ByteBuffer byteBuffer) {
        a.c("buffer", byteBuffer);
        a.b("buffer.remaining() >=12", byteBuffer.remaining() >= 12);
        byteBuffer.put(f(this.f43231a));
        byteBuffer.put(e(this.f43231a));
        byteBuffer.put(d(this.f43231a));
        byteBuffer.put(c(this.f43231a));
        byteBuffer.put(e(this.f43233c));
        byteBuffer.put(d(this.f43233c));
        byteBuffer.put(c(this.f43233c));
        byteBuffer.put(q(this.f43234d));
        byteBuffer.put(o(this.f43234d));
        byteBuffer.put(e(this.f43232b));
        byteBuffer.put(d(this.f43232b));
        byteBuffer.put(c(this.f43232b));
    }

    public byte[] r() {
        ByteBuffer allocate = ByteBuffer.allocate(12);
        n(allocate);
        return allocate.array();
    }

    public String s() {
        byte[] r11;
        char[] cArr = new char[24];
        int i11 = 0;
        for (byte b11 : r()) {
            int i12 = i11 + 1;
            char[] cArr2 = f43230h;
            cArr[i11] = cArr2[(b11 >> 4) & 15];
            i11 = i12 + 1;
            cArr[i12] = cArr2[b11 & 15];
        }
        return new String(cArr);
    }

    public String toString() {
        return s();
    }

    public ObjectId(Date date) {
        this(b(date), f43229g.getAndIncrement() & 16777215, false);
    }

    public ObjectId(Date date, int i11) {
        this(b(date), i11, true);
    }

    @Deprecated
    public ObjectId(Date date, int i11, short s11, int i12) {
        this(b(date), i11, s11, i12);
    }

    @Deprecated
    public ObjectId(int i11, int i12, short s11, int i13) {
        this(i11, i12, s11, i13, true);
    }

    public ObjectId(int i11, int i12) {
        this(i11, i12, true);
    }

    private ObjectId(int i11, int i12, boolean z11) {
        this(i11, f43227e, f43228f, i12, z11);
    }

    private ObjectId(int i11, int i12, short s11, int i13, boolean z11) {
        if ((i12 & (-16777216)) != 0) {
            throw new IllegalArgumentException("The machine identifier must be between 0 and 16777215 (it must fit in three bytes).");
        }
        if (z11 && (i13 & (-16777216)) != 0) {
            throw new IllegalArgumentException("The counter must be between 0 and 16777215 (it must fit in three bytes).");
        }
        this.f43231a = i11;
        this.f43232b = 16777215 & i13;
        this.f43233c = i12;
        this.f43234d = s11;
    }

    public ObjectId(String str) {
        this(l(str));
    }

    public ObjectId(byte[] bArr) {
        this(ByteBuffer.wrap((byte[]) a.a("bytes has length of 12", bArr, ((byte[]) a.c("bytes", bArr)).length == 12)));
    }

    ObjectId(int i11, int i12, int i13) {
        this(h(i11, i12, i13));
    }

    public ObjectId(ByteBuffer byteBuffer) {
        a.c("buffer", byteBuffer);
        a.b("buffer.remaining() >=12", byteBuffer.remaining() >= 12);
        this.f43231a = i(byteBuffer.get(), byteBuffer.get(), byteBuffer.get(), byteBuffer.get());
        this.f43233c = i((byte) 0, byteBuffer.get(), byteBuffer.get(), byteBuffer.get());
        this.f43234d = k(byteBuffer.get(), byteBuffer.get());
        this.f43232b = i((byte) 0, byteBuffer.get(), byteBuffer.get(), byteBuffer.get());
    }
}