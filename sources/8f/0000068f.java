package androidx.exifinterface.media;

import android.content.res.AssetManager;
import android.location.Location;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import androidx.exifinterface.media.b;
import ch.qos.logback.core.net.SyslogConstants;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import ezvcard.property.Gender;
import j$.util.DesugarTimeZone;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import okhttp3.internal.ws.WebSocketProtocol;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import org.spongycastle.crypto.tls.CipherSuite;

/* loaded from: classes.dex */
public class a {
    private static SimpleDateFormat S;
    private static SimpleDateFormat T;
    private static final e[] X;
    private static final e[] Y;
    private static final e[] Z;

    /* renamed from: a0  reason: collision with root package name */
    private static final e[] f4659a0;

    /* renamed from: b0  reason: collision with root package name */
    private static final e[] f4660b0;

    /* renamed from: c0  reason: collision with root package name */
    private static final e f4661c0;

    /* renamed from: d0  reason: collision with root package name */
    private static final e[] f4662d0;

    /* renamed from: e0  reason: collision with root package name */
    private static final e[] f4663e0;

    /* renamed from: f0  reason: collision with root package name */
    private static final e[] f4664f0;

    /* renamed from: g0  reason: collision with root package name */
    private static final e[] f4665g0;

    /* renamed from: h0  reason: collision with root package name */
    static final e[][] f4666h0;

    /* renamed from: i0  reason: collision with root package name */
    private static final e[] f4667i0;

    /* renamed from: j0  reason: collision with root package name */
    private static final HashMap<Integer, e>[] f4668j0;

    /* renamed from: k0  reason: collision with root package name */
    private static final HashMap<String, e>[] f4669k0;

    /* renamed from: l0  reason: collision with root package name */
    private static final HashSet<String> f4670l0;

    /* renamed from: m0  reason: collision with root package name */
    private static final HashMap<Integer, Integer> f4671m0;

    /* renamed from: n0  reason: collision with root package name */
    static final Charset f4672n0;

    /* renamed from: o0  reason: collision with root package name */
    static final byte[] f4673o0;

    /* renamed from: p0  reason: collision with root package name */
    private static final byte[] f4674p0;

    /* renamed from: q0  reason: collision with root package name */
    private static final Pattern f4675q0;

    /* renamed from: r0  reason: collision with root package name */
    private static final Pattern f4676r0;

    /* renamed from: s0  reason: collision with root package name */
    private static final Pattern f4677s0;

    /* renamed from: a  reason: collision with root package name */
    private String f4684a;

    /* renamed from: b  reason: collision with root package name */
    private FileDescriptor f4685b;

    /* renamed from: c  reason: collision with root package name */
    private AssetManager.AssetInputStream f4686c;

    /* renamed from: d  reason: collision with root package name */
    private int f4687d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f4688e;

    /* renamed from: f  reason: collision with root package name */
    private final HashMap<String, d>[] f4689f;

    /* renamed from: g  reason: collision with root package name */
    private Set<Integer> f4690g;

    /* renamed from: h  reason: collision with root package name */
    private ByteOrder f4691h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f4692i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f4693j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f4694k;

    /* renamed from: l  reason: collision with root package name */
    private int f4695l;

    /* renamed from: m  reason: collision with root package name */
    private int f4696m;

    /* renamed from: n  reason: collision with root package name */
    private byte[] f4697n;

    /* renamed from: o  reason: collision with root package name */
    private int f4698o;

    /* renamed from: p  reason: collision with root package name */
    private int f4699p;

    /* renamed from: q  reason: collision with root package name */
    private int f4700q;

    /* renamed from: r  reason: collision with root package name */
    private int f4701r;

    /* renamed from: s  reason: collision with root package name */
    private int f4702s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f4703t;

    /* renamed from: u  reason: collision with root package name */
    private static final boolean f4678u = Log.isLoggable("ExifInterface", 3);

    /* renamed from: v  reason: collision with root package name */
    private static final List<Integer> f4679v = Arrays.asList(1, 6, 3, 8);

    /* renamed from: w  reason: collision with root package name */
    private static final List<Integer> f4680w = Arrays.asList(2, 7, 4, 5);

    /* renamed from: x  reason: collision with root package name */
    public static final int[] f4681x = {8, 8, 8};

    /* renamed from: y  reason: collision with root package name */
    public static final int[] f4682y = {8};

    /* renamed from: z  reason: collision with root package name */
    static final byte[] f4683z = {-1, -40, -1};
    private static final byte[] A = {102, 116, 121, 112};
    private static final byte[] B = {109, 105, 102, 49};
    private static final byte[] C = {104, 101, 105, 99};
    private static final byte[] D = {79, 76, 89, 77, 80, 0};
    private static final byte[] E = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    private static final byte[] F = {-119, 80, 78, 71, 13, 10, 26, 10};
    private static final byte[] G = {101, 88, 73, 102};
    private static final byte[] H = {73, 72, 68, 82};
    private static final byte[] I = {73, 69, 78, 68};
    private static final byte[] J = {82, 73, 70, 70};
    private static final byte[] K = {87, 69, 66, 80};
    private static final byte[] L = {69, 88, 73, 70};
    private static final byte[] M = {-99, 1, 42};
    private static final byte[] N = "VP8X".getBytes(Charset.defaultCharset());
    private static final byte[] O = "VP8L".getBytes(Charset.defaultCharset());
    private static final byte[] P = "VP8 ".getBytes(Charset.defaultCharset());
    private static final byte[] Q = "ANIM".getBytes(Charset.defaultCharset());
    private static final byte[] R = "ANMF".getBytes(Charset.defaultCharset());
    static final String[] U = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    static final int[] V = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    static final byte[] W = {65, 83, 67, 73, 73, 0, 0, 0};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.exifinterface.media.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0078a extends MediaDataSource {

        /* renamed from: a  reason: collision with root package name */
        long f4704a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g f4705b;

        C0078a(a aVar, g gVar) {
            this.f4705b = gVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // android.media.MediaDataSource
        public long getSize() {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public int readAt(long j11, byte[] bArr, int i11, int i12) {
            if (i12 == 0) {
                return 0;
            }
            if (j11 < 0) {
                return -1;
            }
            try {
                long j12 = this.f4704a;
                if (j12 != j11) {
                    if (j12 >= 0 && j11 >= j12 + this.f4705b.available()) {
                        return -1;
                    }
                    this.f4705b.m(j11);
                    this.f4704a = j11;
                }
                if (i12 > this.f4705b.available()) {
                    i12 = this.f4705b.available();
                }
                int read = this.f4705b.read(bArr, i11, i12);
                if (read >= 0) {
                    this.f4704a += read;
                    return read;
                }
            } catch (IOException unused) {
            }
            this.f4704a = -1L;
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b extends InputStream implements DataInput {

        /* renamed from: e  reason: collision with root package name */
        private static final ByteOrder f4706e = ByteOrder.LITTLE_ENDIAN;

        /* renamed from: f  reason: collision with root package name */
        private static final ByteOrder f4707f = ByteOrder.BIG_ENDIAN;

        /* renamed from: a  reason: collision with root package name */
        final DataInputStream f4708a;

        /* renamed from: b  reason: collision with root package name */
        private ByteOrder f4709b;

        /* renamed from: c  reason: collision with root package name */
        int f4710c;

        /* renamed from: d  reason: collision with root package name */
        private byte[] f4711d;

        b(byte[] bArr) {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
        }

        public int a() {
            return this.f4710c;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f4708a.available();
        }

        public long g() {
            return readInt() & 4294967295L;
        }

        public void j(ByteOrder byteOrder) {
            this.f4709b = byteOrder;
        }

        public void l(int i11) {
            int i12 = 0;
            while (i12 < i11) {
                int i13 = i11 - i12;
                int skip = (int) this.f4708a.skip(i13);
                if (skip <= 0) {
                    if (this.f4711d == null) {
                        this.f4711d = new byte[PKIFailureInfo.certRevoked];
                    }
                    skip = this.f4708a.read(this.f4711d, 0, Math.min((int) PKIFailureInfo.certRevoked, i13));
                    if (skip == -1) {
                        throw new EOFException("Reached EOF while skipping " + i11 + " bytes.");
                    }
                }
                i12 += skip;
            }
            this.f4710c += i12;
        }

        @Override // java.io.InputStream
        public void mark(int i11) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        @Override // java.io.InputStream
        public int read() {
            this.f4710c++;
            return this.f4708a.read();
        }

        @Override // java.io.DataInput
        public boolean readBoolean() {
            this.f4710c++;
            return this.f4708a.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() {
            this.f4710c++;
            int read = this.f4708a.read();
            if (read >= 0) {
                return (byte) read;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() {
            this.f4710c += 2;
            return this.f4708a.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i11, int i12) {
            this.f4710c += i12;
            this.f4708a.readFully(bArr, i11, i12);
        }

        @Override // java.io.DataInput
        public int readInt() {
            this.f4710c += 4;
            int read = this.f4708a.read();
            int read2 = this.f4708a.read();
            int read3 = this.f4708a.read();
            int read4 = this.f4708a.read();
            if ((read | read2 | read3 | read4) >= 0) {
                ByteOrder byteOrder = this.f4709b;
                if (byteOrder == f4706e) {
                    return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                }
                if (byteOrder == f4707f) {
                    return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                }
                throw new IOException("Invalid byte order: " + this.f4709b);
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public String readLine() {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() {
            this.f4710c += 8;
            int read = this.f4708a.read();
            int read2 = this.f4708a.read();
            int read3 = this.f4708a.read();
            int read4 = this.f4708a.read();
            int read5 = this.f4708a.read();
            int read6 = this.f4708a.read();
            int read7 = this.f4708a.read();
            int read8 = this.f4708a.read();
            if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                ByteOrder byteOrder = this.f4709b;
                if (byteOrder == f4706e) {
                    return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                }
                if (byteOrder == f4707f) {
                    return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
                }
                throw new IOException("Invalid byte order: " + this.f4709b);
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public short readShort() {
            this.f4710c += 2;
            int read = this.f4708a.read();
            int read2 = this.f4708a.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.f4709b;
                if (byteOrder == f4706e) {
                    return (short) ((read2 << 8) + read);
                }
                if (byteOrder == f4707f) {
                    return (short) ((read << 8) + read2);
                }
                throw new IOException("Invalid byte order: " + this.f4709b);
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public String readUTF() {
            this.f4710c += 2;
            return this.f4708a.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() {
            this.f4710c++;
            return this.f4708a.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() {
            this.f4710c += 2;
            int read = this.f4708a.read();
            int read2 = this.f4708a.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.f4709b;
                if (byteOrder == f4706e) {
                    return (read2 << 8) + read;
                }
                if (byteOrder == f4707f) {
                    return (read << 8) + read2;
                }
                throw new IOException("Invalid byte order: " + this.f4709b);
            }
            throw new EOFException();
        }

        @Override // java.io.InputStream
        public void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        @Override // java.io.DataInput
        public int skipBytes(int i11) {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        b(InputStream inputStream) {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        b(InputStream inputStream, ByteOrder byteOrder) {
            this.f4709b = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f4708a = dataInputStream;
            dataInputStream.mark(0);
            this.f4710c = 0;
            this.f4709b = byteOrder;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i11, int i12) {
            int read = this.f4708a.read(bArr, i11, i12);
            this.f4710c += read;
            return read;
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) {
            this.f4710c += bArr.length;
            this.f4708a.readFully(bArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c extends FilterOutputStream {

        /* renamed from: a  reason: collision with root package name */
        final OutputStream f4712a;

        /* renamed from: b  reason: collision with root package name */
        private ByteOrder f4713b;

        public c(OutputStream outputStream, ByteOrder byteOrder) {
            super(outputStream);
            this.f4712a = outputStream;
            this.f4713b = byteOrder;
        }

        public void a(ByteOrder byteOrder) {
            this.f4713b = byteOrder;
        }

        public void g(int i11) {
            this.f4712a.write(i11);
        }

        public void j(int i11) {
            ByteOrder byteOrder = this.f4713b;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f4712a.write((i11 >>> 0) & 255);
                this.f4712a.write((i11 >>> 8) & 255);
                this.f4712a.write((i11 >>> 16) & 255);
                this.f4712a.write((i11 >>> 24) & 255);
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f4712a.write((i11 >>> 24) & 255);
                this.f4712a.write((i11 >>> 16) & 255);
                this.f4712a.write((i11 >>> 8) & 255);
                this.f4712a.write((i11 >>> 0) & 255);
            }
        }

        public void l(short s11) {
            ByteOrder byteOrder = this.f4713b;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f4712a.write((s11 >>> 0) & 255);
                this.f4712a.write((s11 >>> 8) & 255);
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f4712a.write((s11 >>> 8) & 255);
                this.f4712a.write((s11 >>> 0) & 255);
            }
        }

        public void m(long j11) {
            j((int) j11);
        }

        public void p(int i11) {
            l((short) i11);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr) {
            this.f4712a.write(bArr);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i11, int i12) {
            this.f4712a.write(bArr, i11, i12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final int f4714a;

        /* renamed from: b  reason: collision with root package name */
        public final int f4715b;

        /* renamed from: c  reason: collision with root package name */
        public final long f4716c;

        /* renamed from: d  reason: collision with root package name */
        public final byte[] f4717d;

        d(int i11, int i12, byte[] bArr) {
            this(i11, i12, -1L, bArr);
        }

        public static d a(String str) {
            if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
                return new d(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
            }
            byte[] bytes = str.getBytes(a.f4672n0);
            return new d(1, bytes.length, bytes);
        }

        public static d b(double[] dArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.V[12] * dArr.length]);
            wrap.order(byteOrder);
            for (double d11 : dArr) {
                wrap.putDouble(d11);
            }
            return new d(12, dArr.length, wrap.array());
        }

        public static d c(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.V[9] * iArr.length]);
            wrap.order(byteOrder);
            for (int i11 : iArr) {
                wrap.putInt(i11);
            }
            return new d(9, iArr.length, wrap.array());
        }

        public static d d(f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.V[10] * fVarArr.length]);
            wrap.order(byteOrder);
            for (f fVar : fVarArr) {
                wrap.putInt((int) fVar.f4722a);
                wrap.putInt((int) fVar.f4723b);
            }
            return new d(10, fVarArr.length, wrap.array());
        }

        public static d e(String str) {
            byte[] bytes = (str + (char) 0).getBytes(a.f4672n0);
            return new d(2, bytes.length, bytes);
        }

        public static d f(long j11, ByteOrder byteOrder) {
            return g(new long[]{j11}, byteOrder);
        }

        public static d g(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.V[4] * jArr.length]);
            wrap.order(byteOrder);
            for (long j11 : jArr) {
                wrap.putInt((int) j11);
            }
            return new d(4, jArr.length, wrap.array());
        }

        public static d h(f fVar, ByteOrder byteOrder) {
            return i(new f[]{fVar}, byteOrder);
        }

        public static d i(f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.V[5] * fVarArr.length]);
            wrap.order(byteOrder);
            for (f fVar : fVarArr) {
                wrap.putInt((int) fVar.f4722a);
                wrap.putInt((int) fVar.f4723b);
            }
            return new d(5, fVarArr.length, wrap.array());
        }

        public static d j(int i11, ByteOrder byteOrder) {
            return k(new int[]{i11}, byteOrder);
        }

        public static d k(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.V[3] * iArr.length]);
            wrap.order(byteOrder);
            for (int i11 : iArr) {
                wrap.putShort((short) i11);
            }
            return new d(3, iArr.length, wrap.array());
        }

        public double l(ByteOrder byteOrder) {
            Object o11 = o(byteOrder);
            if (o11 != null) {
                if (o11 instanceof String) {
                    return Double.parseDouble((String) o11);
                }
                if (o11 instanceof long[]) {
                    long[] jArr = (long[]) o11;
                    if (jArr.length == 1) {
                        return jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (o11 instanceof int[]) {
                    int[] iArr = (int[]) o11;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (o11 instanceof double[]) {
                    double[] dArr = (double[]) o11;
                    if (dArr.length == 1) {
                        return dArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (o11 instanceof f[]) {
                    f[] fVarArr = (f[]) o11;
                    if (fVarArr.length == 1) {
                        return fVarArr[0].a();
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a double value");
                }
            }
            throw new NumberFormatException("NULL can't be converted to a double value");
        }

        public int m(ByteOrder byteOrder) {
            Object o11 = o(byteOrder);
            if (o11 != null) {
                if (o11 instanceof String) {
                    return Integer.parseInt((String) o11);
                }
                if (o11 instanceof long[]) {
                    long[] jArr = (long[]) o11;
                    if (jArr.length == 1) {
                        return (int) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (o11 instanceof int[]) {
                    int[] iArr = (int[]) o11;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a integer value");
                }
            }
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }

        public String n(ByteOrder byteOrder) {
            Object o11 = o(byteOrder);
            if (o11 == null) {
                return null;
            }
            if (o11 instanceof String) {
                return (String) o11;
            }
            StringBuilder sb2 = new StringBuilder();
            int i11 = 0;
            if (o11 instanceof long[]) {
                long[] jArr = (long[]) o11;
                while (i11 < jArr.length) {
                    sb2.append(jArr[i11]);
                    i11++;
                    if (i11 != jArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else if (o11 instanceof int[]) {
                int[] iArr = (int[]) o11;
                while (i11 < iArr.length) {
                    sb2.append(iArr[i11]);
                    i11++;
                    if (i11 != iArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else if (o11 instanceof double[]) {
                double[] dArr = (double[]) o11;
                while (i11 < dArr.length) {
                    sb2.append(dArr[i11]);
                    i11++;
                    if (i11 != dArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else if (o11 instanceof f[]) {
                f[] fVarArr = (f[]) o11;
                while (i11 < fVarArr.length) {
                    sb2.append(fVarArr[i11].f4722a);
                    sb2.append('/');
                    sb2.append(fVarArr[i11].f4723b);
                    i11++;
                    if (i11 != fVarArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else {
                return null;
            }
        }

        /* JADX WARN: Not initialized variable reg: 3, insn: 0x019c: MOVE  (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:152:0x019c */
        /* JADX WARN: Removed duplicated region for block: B:176:0x019f A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        java.lang.Object o(java.nio.ByteOrder r11) {
            /*
                Method dump skipped, instructions count: 452
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.d.o(java.nio.ByteOrder):java.lang.Object");
        }

        public int p() {
            return a.V[this.f4714a] * this.f4715b;
        }

        public String toString() {
            return "(" + a.U[this.f4714a] + ", data length:" + this.f4717d.length + ")";
        }

        d(int i11, int i12, long j11, byte[] bArr) {
            this.f4714a = i11;
            this.f4715b = i12;
            this.f4716c = j11;
            this.f4717d = bArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public final long f4722a;

        /* renamed from: b  reason: collision with root package name */
        public final long f4723b;

        f(double d11) {
            this((long) (d11 * 10000.0d), AbstractComponentTracker.LINGERING_TIMEOUT);
        }

        public double a() {
            return this.f4722a / this.f4723b;
        }

        public String toString() {
            return this.f4722a + "/" + this.f4723b;
        }

        f(long j11, long j12) {
            if (j12 == 0) {
                this.f4722a = 0L;
                this.f4723b = 1L;
                return;
            }
            this.f4722a = j11;
            this.f4723b = j12;
        }
    }

    static {
        e[] eVarArr;
        e[] eVarArr2 = {new e("NewSubfileType", 254, 4), new e("SubfileType", 255, 4), new e("ImageWidth", 256, 3, 4), new e("ImageLength", 257, 3, 4), new e("BitsPerSample", 258, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", 270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", 273, 3, 4), new e("Orientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", 301, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", 513, 4), new e("JPEGInterchangeFormatLength", SyslogConstants.SYSLOG_PORT, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("SensorTopBorder", 4, 4), new e("SensorLeftBorder", 5, 4), new e("SensorBottomBorder", 6, 4), new e("SensorRightBorder", 7, 4), new e("ISO", 23, 3), new e("JpgFromRaw", 46, 7), new e("Xmp", 700, 1)};
        X = eVarArr2;
        e[] eVarArr3 = {new e("ExposureTime", 33434, 5), new e("FNumber", 33437, 5), new e("ExposureProgram", 34850, 3), new e("SpectralSensitivity", 34852, 2), new e("PhotographicSensitivity", 34855, 3), new e("OECF", 34856, 7), new e("SensitivityType", 34864, 3), new e("StandardOutputSensitivity", 34865, 4), new e("RecommendedExposureIndex", 34866, 4), new e("ISOSpeed", 34867, 4), new e("ISOSpeedLatitudeyyy", 34868, 4), new e("ISOSpeedLatitudezzz", 34869, 4), new e("ExifVersion", 36864, 2), new e("DateTimeOriginal", 36867, 2), new e("DateTimeDigitized", 36868, 2), new e("OffsetTime", 36880, 2), new e("OffsetTimeOriginal", 36881, 2), new e("OffsetTimeDigitized", 36882, 2), new e("ComponentsConfiguration", 37121, 7), new e("CompressedBitsPerPixel", 37122, 5), new e("ShutterSpeedValue", 37377, 10), new e("ApertureValue", 37378, 5), new e("BrightnessValue", 37379, 10), new e("ExposureBiasValue", 37380, 10), new e("MaxApertureValue", 37381, 5), new e("SubjectDistance", 37382, 5), new e("MeteringMode", 37383, 3), new e("LightSource", 37384, 3), new e("Flash", 37385, 3), new e("FocalLength", 37386, 5), new e("SubjectArea", 37396, 3), new e("MakerNote", 37500, 7), new e("UserComment", 37510, 7), new e("SubSecTime", 37520, 2), new e("SubSecTimeOriginal", 37521, 2), new e("SubSecTimeDigitized", 37522, 2), new e("FlashpixVersion", 40960, 7), new e("ColorSpace", 40961, 3), new e("PixelXDimension", 40962, 3, 4), new e("PixelYDimension", 40963, 3, 4), new e("RelatedSoundFile", 40964, 2), new e("InteroperabilityIFDPointer", 40965, 4), new e("FlashEnergy", 41483, 5), new e("SpatialFrequencyResponse", 41484, 7), new e("FocalPlaneXResolution", 41486, 5), new e("FocalPlaneYResolution", 41487, 5), new e("FocalPlaneResolutionUnit", 41488, 3), new e("SubjectLocation", 41492, 3), new e("ExposureIndex", 41493, 5), new e("SensingMethod", 41495, 3), new e("FileSource", 41728, 7), new e("SceneType", 41729, 7), new e("CFAPattern", 41730, 7), new e("CustomRendered", 41985, 3), new e("ExposureMode", 41986, 3), new e("WhiteBalance", 41987, 3), new e("DigitalZoomRatio", 41988, 5), new e("FocalLengthIn35mmFilm", 41989, 3), new e("SceneCaptureType", 41990, 3), new e("GainControl", 41991, 3), new e("Contrast", 41992, 3), new e("Saturation", 41993, 3), new e("Sharpness", 41994, 3), new e("DeviceSettingDescription", 41995, 7), new e("SubjectDistanceRange", 41996, 3), new e("ImageUniqueID", 42016, 2), new e("CameraOwnerName", 42032, 2), new e("BodySerialNumber", 42033, 2), new e("LensSpecification", 42034, 5), new e("LensMake", 42035, 2), new e("LensModel", 42036, 2), new e("Gamma", 42240, 5), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        Y = eVarArr3;
        e[] eVarArr4 = {new e("GPSVersionID", 0, 1), new e("GPSLatitudeRef", 1, 2), new e("GPSLatitude", 2, 5, 10), new e("GPSLongitudeRef", 3, 2), new e("GPSLongitude", 4, 5, 10), new e("GPSAltitudeRef", 5, 1), new e("GPSAltitude", 6, 5), new e("GPSTimeStamp", 7, 5), new e("GPSSatellites", 8, 2), new e("GPSStatus", 9, 2), new e("GPSMeasureMode", 10, 2), new e("GPSDOP", 11, 5), new e("GPSSpeedRef", 12, 2), new e("GPSSpeed", 13, 5), new e("GPSTrackRef", 14, 2), new e("GPSTrack", 15, 5), new e("GPSImgDirectionRef", 16, 2), new e("GPSImgDirection", 17, 5), new e("GPSMapDatum", 18, 2), new e("GPSDestLatitudeRef", 19, 2), new e("GPSDestLatitude", 20, 5), new e("GPSDestLongitudeRef", 21, 2), new e("GPSDestLongitude", 22, 5), new e("GPSDestBearingRef", 23, 2), new e("GPSDestBearing", 24, 5), new e("GPSDestDistanceRef", 25, 2), new e("GPSDestDistance", 26, 5), new e("GPSProcessingMethod", 27, 7), new e("GPSAreaInformation", 28, 7), new e("GPSDateStamp", 29, 2), new e("GPSDifferential", 30, 3), new e("GPSHPositioningError", 31, 5)};
        Z = eVarArr4;
        e[] eVarArr5 = {new e("InteroperabilityIndex", 1, 2)};
        f4659a0 = eVarArr5;
        e[] eVarArr6 = {new e("NewSubfileType", 254, 4), new e("SubfileType", 255, 4), new e("ThumbnailImageWidth", 256, 3, 4), new e("ThumbnailImageLength", 257, 3, 4), new e("BitsPerSample", 258, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", 270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", 273, 3, 4), new e("ThumbnailOrientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", 301, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", 513, 4), new e("JPEGInterchangeFormatLength", SyslogConstants.SYSLOG_PORT, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Xmp", 700, 1), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        f4660b0 = eVarArr6;
        f4661c0 = new e("StripOffsets", 273, 3);
        e[] eVarArr7 = {new e("ThumbnailImage", 256, 7), new e("CameraSettingsIFDPointer", 8224, 4), new e("ImageProcessingIFDPointer", 8256, 4)};
        f4662d0 = eVarArr7;
        e[] eVarArr8 = {new e("PreviewImageStart", 257, 4), new e("PreviewImageLength", 258, 4)};
        f4663e0 = eVarArr8;
        e[] eVarArr9 = {new e("AspectFrame", 4371, 3)};
        f4664f0 = eVarArr9;
        e[] eVarArr10 = {new e("ColorSpace", 55, 3)};
        f4665g0 = eVarArr10;
        e[][] eVarArr11 = {eVarArr2, eVarArr3, eVarArr4, eVarArr5, eVarArr6, eVarArr2, eVarArr7, eVarArr8, eVarArr9, eVarArr10};
        f4666h0 = eVarArr11;
        f4667i0 = new e[]{new e("SubIFDPointer", 330, 4), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("InteroperabilityIFDPointer", 40965, 4), new e("CameraSettingsIFDPointer", 8224, 1), new e("ImageProcessingIFDPointer", 8256, 1)};
        f4668j0 = new HashMap[eVarArr11.length];
        f4669k0 = new HashMap[eVarArr11.length];
        f4670l0 = new HashSet<>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f4671m0 = new HashMap<>();
        Charset forName = Charset.forName("US-ASCII");
        f4672n0 = forName;
        f4673o0 = "Exif\u0000\u0000".getBytes(forName);
        f4674p0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        S = simpleDateFormat;
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        T = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        int i11 = 0;
        while (true) {
            e[][] eVarArr12 = f4666h0;
            if (i11 < eVarArr12.length) {
                f4668j0[i11] = new HashMap<>();
                f4669k0[i11] = new HashMap<>();
                for (e eVar : eVarArr12[i11]) {
                    f4668j0[i11].put(Integer.valueOf(eVar.f4718a), eVar);
                    f4669k0[i11].put(eVar.f4719b, eVar);
                }
                i11++;
            } else {
                HashMap<Integer, Integer> hashMap = f4671m0;
                e[] eVarArr13 = f4667i0;
                hashMap.put(Integer.valueOf(eVarArr13[0].f4718a), 5);
                hashMap.put(Integer.valueOf(eVarArr13[1].f4718a), 1);
                hashMap.put(Integer.valueOf(eVarArr13[2].f4718a), 2);
                hashMap.put(Integer.valueOf(eVarArr13[3].f4718a), 3);
                hashMap.put(Integer.valueOf(eVarArr13[4].f4718a), 7);
                hashMap.put(Integer.valueOf(eVarArr13[5].f4718a), 8);
                Pattern.compile(".*[1-9].*");
                f4675q0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                f4676r0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                f4677s0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
        }
    }

    public a(String str) {
        e[][] eVarArr = f4666h0;
        this.f4689f = new HashMap[eVarArr.length];
        this.f4690g = new HashSet(eVarArr.length);
        this.f4691h = ByteOrder.BIG_ENDIAN;
        Objects.requireNonNull(str, "filename cannot be null");
        B(str);
    }

    private void A(b bVar, HashMap hashMap) {
        d dVar = (d) hashMap.get("StripOffsets");
        d dVar2 = (d) hashMap.get("StripByteCounts");
        if (dVar == null || dVar2 == null) {
            return;
        }
        long[] d11 = androidx.exifinterface.media.b.d(dVar.o(this.f4691h));
        long[] d12 = androidx.exifinterface.media.b.d(dVar2.o(this.f4691h));
        if (d11 != null && d11.length != 0) {
            if (d12 != null && d12.length != 0) {
                if (d11.length != d12.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j11 = 0;
                for (long j12 : d12) {
                    j11 += j12;
                }
                int i11 = (int) j11;
                byte[] bArr = new byte[i11];
                this.f4694k = true;
                this.f4693j = true;
                this.f4692i = true;
                int i12 = 0;
                int i13 = 0;
                for (int i14 = 0; i14 < d11.length; i14++) {
                    int i15 = (int) d11[i14];
                    int i16 = (int) d12[i14];
                    if (i14 < d11.length - 1 && i15 + i16 != d11[i14 + 1]) {
                        this.f4694k = false;
                    }
                    int i17 = i15 - i12;
                    if (i17 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    long j13 = i17;
                    if (bVar.skip(j13) != j13) {
                        Log.d("ExifInterface", "Failed to skip " + i17 + " bytes.");
                        return;
                    }
                    int i18 = i12 + i17;
                    byte[] bArr2 = new byte[i16];
                    if (bVar.read(bArr2) != i16) {
                        Log.d("ExifInterface", "Failed to read " + i16 + " bytes.");
                        return;
                    }
                    i12 = i18 + i16;
                    System.arraycopy(bArr2, 0, bArr, i13, i16);
                    i13 += i16;
                }
                this.f4697n = bArr;
                if (this.f4694k) {
                    this.f4695l = (int) d11[0];
                    this.f4696m = i11;
                    return;
                }
                return;
            }
            Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
            return;
        }
        Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
    }

    private void B(String str) {
        FileInputStream fileInputStream;
        Objects.requireNonNull(str, "filename cannot be null");
        FileInputStream fileInputStream2 = null;
        this.f4686c = null;
        this.f4684a = str;
        try {
            fileInputStream = new FileInputStream(str);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            if (K(fileInputStream.getFD())) {
                this.f4685b = fileInputStream.getFD();
            } else {
                this.f4685b = null;
            }
            P(fileInputStream);
            androidx.exifinterface.media.b.c(fileInputStream);
        } catch (Throwable th3) {
            th = th3;
            fileInputStream2 = fileInputStream;
            androidx.exifinterface.media.b.c(fileInputStream2);
            throw th;
        }
    }

    private static boolean C(BufferedInputStream bufferedInputStream) {
        byte[] bArr = f4673o0;
        bufferedInputStream.mark(bArr.length);
        byte[] bArr2 = new byte[bArr.length];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i11 = 0;
        while (true) {
            byte[] bArr3 = f4673o0;
            if (i11 >= bArr3.length) {
                return true;
            }
            if (bArr2[i11] != bArr3[i11]) {
                return false;
            }
            i11++;
        }
    }

    private boolean E(byte[] bArr) {
        b bVar;
        long readInt;
        byte[] bArr2;
        b bVar2 = null;
        try {
            try {
                bVar = new b(bArr);
                try {
                    readInt = bVar.readInt();
                    bArr2 = new byte[4];
                    bVar.read(bArr2);
                } catch (Exception e11) {
                    e = e11;
                    bVar2 = bVar;
                    if (f4678u) {
                        Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                    }
                    if (bVar2 != null) {
                        bVar2.close();
                    }
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    bVar2 = bVar;
                    if (bVar2 != null) {
                        bVar2.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e12) {
            e = e12;
        }
        if (!Arrays.equals(bArr2, A)) {
            bVar.close();
            return false;
        }
        long j11 = 16;
        if (readInt == 1) {
            readInt = bVar.readLong();
            if (readInt < 16) {
                bVar.close();
                return false;
            }
        } else {
            j11 = 8;
        }
        if (readInt > bArr.length) {
            readInt = bArr.length;
        }
        long j12 = readInt - j11;
        if (j12 < 8) {
            bVar.close();
            return false;
        }
        byte[] bArr3 = new byte[4];
        boolean z11 = false;
        boolean z12 = false;
        for (long j13 = 0; j13 < j12 / 4; j13++) {
            if (bVar.read(bArr3) != 4) {
                bVar.close();
                return false;
            }
            if (j13 != 1) {
                if (Arrays.equals(bArr3, B)) {
                    z11 = true;
                } else if (Arrays.equals(bArr3, C)) {
                    z12 = true;
                }
                if (z11 && z12) {
                    bVar.close();
                    return true;
                }
            }
        }
        bVar.close();
        return false;
    }

    private static boolean F(byte[] bArr) {
        int i11 = 0;
        while (true) {
            byte[] bArr2 = f4683z;
            if (i11 >= bArr2.length) {
                return true;
            }
            if (bArr[i11] != bArr2[i11]) {
                return false;
            }
            i11++;
        }
    }

    private boolean G(byte[] bArr) {
        b bVar;
        boolean z11 = false;
        b bVar2 = null;
        try {
            bVar = new b(bArr);
        } catch (Exception unused) {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            ByteOrder S2 = S(bVar);
            this.f4691h = S2;
            bVar.j(S2);
            short readShort = bVar.readShort();
            z11 = (readShort == 20306 || readShort == 21330) ? true : true;
            bVar.close();
            return z11;
        } catch (Exception unused2) {
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            return false;
        } catch (Throwable th3) {
            th = th3;
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            throw th;
        }
    }

    private boolean H(byte[] bArr) {
        int i11 = 0;
        while (true) {
            byte[] bArr2 = F;
            if (i11 >= bArr2.length) {
                return true;
            }
            if (bArr[i11] != bArr2[i11]) {
                return false;
            }
            i11++;
        }
    }

    private boolean I(byte[] bArr) {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i11 = 0; i11 < bytes.length; i11++) {
            if (bArr[i11] != bytes[i11]) {
                return false;
            }
        }
        return true;
    }

    private boolean J(byte[] bArr) {
        b bVar;
        b bVar2 = null;
        try {
            bVar = new b(bArr);
        } catch (Exception unused) {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            ByteOrder S2 = S(bVar);
            this.f4691h = S2;
            bVar.j(S2);
            boolean z11 = bVar.readShort() == 85;
            bVar.close();
            return z11;
        } catch (Exception unused2) {
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            return false;
        } catch (Throwable th3) {
            th = th3;
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            throw th;
        }
    }

    private static boolean K(FileDescriptor fileDescriptor) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                b.a.c(fileDescriptor, 0L, OsConstants.SEEK_CUR);
                return true;
            } catch (Exception unused) {
                if (f4678u) {
                    Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                }
            }
        }
        return false;
    }

    private boolean L(HashMap hashMap) {
        d dVar;
        int m11;
        d dVar2 = (d) hashMap.get("BitsPerSample");
        if (dVar2 != null) {
            int[] iArr = (int[]) dVar2.o(this.f4691h);
            int[] iArr2 = f4681x;
            if (Arrays.equals(iArr2, iArr)) {
                return true;
            }
            if (this.f4687d == 3 && (dVar = (d) hashMap.get("PhotometricInterpretation")) != null && (((m11 = dVar.m(this.f4691h)) == 1 && Arrays.equals(iArr, f4682y)) || (m11 == 6 && Arrays.equals(iArr, iArr2)))) {
                return true;
            }
        }
        if (f4678u) {
            Log.d("ExifInterface", "Unsupported data type value");
            return false;
        }
        return false;
    }

    private static boolean M(int i11) {
        return i11 == 4 || i11 == 13 || i11 == 14 || i11 == 3 || i11 == 0;
    }

    private boolean N(HashMap hashMap) {
        d dVar = (d) hashMap.get("ImageLength");
        d dVar2 = (d) hashMap.get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            return false;
        }
        return dVar.m(this.f4691h) <= 512 && dVar2.m(this.f4691h) <= 512;
    }

    private boolean O(byte[] bArr) {
        int i11 = 0;
        while (true) {
            byte[] bArr2 = J;
            if (i11 >= bArr2.length) {
                int i12 = 0;
                while (true) {
                    byte[] bArr3 = K;
                    if (i12 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[J.length + i12 + 4] != bArr3[i12]) {
                        return false;
                    }
                    i12++;
                }
            } else if (bArr[i11] != bArr2[i11]) {
                return false;
            } else {
                i11++;
            }
        }
    }

    private void P(InputStream inputStream) {
        Objects.requireNonNull(inputStream, "inputstream shouldn't be null");
        for (int i11 = 0; i11 < f4666h0.length; i11++) {
            try {
                try {
                    this.f4689f[i11] = new HashMap<>();
                } catch (IOException | UnsupportedOperationException e11) {
                    boolean z11 = f4678u;
                    if (z11) {
                        Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e11);
                    }
                    a();
                    if (!z11) {
                        return;
                    }
                }
            } finally {
                a();
                if (f4678u) {
                    R();
                }
            }
        }
        if (!this.f4688e) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            this.f4687d = n(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        if (h0(this.f4687d)) {
            g gVar = new g(inputStream);
            if (this.f4688e) {
                u(gVar);
            } else {
                int i12 = this.f4687d;
                if (i12 == 12) {
                    k(gVar);
                } else if (i12 == 7) {
                    o(gVar);
                } else if (i12 == 10) {
                    t(gVar);
                } else {
                    r(gVar);
                }
            }
            gVar.m(this.f4699p);
            g0(gVar);
        } else {
            b bVar = new b(inputStream);
            int i13 = this.f4687d;
            if (i13 == 4) {
                l(bVar, 0, 0);
            } else if (i13 == 13) {
                p(bVar);
            } else if (i13 == 9) {
                q(bVar);
            } else if (i13 == 14) {
                x(bVar);
            }
        }
    }

    private void Q(b bVar) {
        ByteOrder S2 = S(bVar);
        this.f4691h = S2;
        bVar.j(S2);
        int readUnsignedShort = bVar.readUnsignedShort();
        int i11 = this.f4687d;
        if (i11 != 7 && i11 != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
        }
        int readInt = bVar.readInt();
        if (readInt < 8) {
            throw new IOException("Invalid first Ifd offset: " + readInt);
        }
        int i12 = readInt - 8;
        if (i12 > 0) {
            bVar.l(i12);
        }
    }

    private void R() {
        for (int i11 = 0; i11 < this.f4689f.length; i11++) {
            Log.d("ExifInterface", "The size of tag group[" + i11 + "]: " + this.f4689f[i11].size());
            for (Map.Entry<String, d> entry : this.f4689f[i11].entrySet()) {
                d value = entry.getValue();
                Log.d("ExifInterface", "tagName: " + entry.getKey() + ", tagType: " + value.toString() + ", tagValue: '" + value.n(this.f4691h) + "'");
            }
        }
    }

    private ByteOrder S(b bVar) {
        short readShort = bVar.readShort();
        if (readShort == 18761) {
            if (f4678u) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        } else if (readShort == 19789) {
            if (f4678u) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        } else {
            throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
        }
    }

    private void T(byte[] bArr, int i11) {
        g gVar = new g(bArr);
        Q(gVar);
        U(gVar, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0282  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void U(androidx.exifinterface.media.a.g r30, int r31) {
        /*
            Method dump skipped, instructions count: 927
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.U(androidx.exifinterface.media.a$g, int):void");
    }

    private void V(String str) {
        for (int i11 = 0; i11 < f4666h0.length; i11++) {
            this.f4689f[i11].remove(str);
        }
    }

    private void W(int i11, String str, String str2) {
        if (this.f4689f[i11].isEmpty() || this.f4689f[i11].get(str) == null) {
            return;
        }
        HashMap<String, d>[] hashMapArr = this.f4689f;
        hashMapArr[i11].put(str2, hashMapArr[i11].get(str));
        this.f4689f[i11].remove(str);
    }

    private void X(g gVar, int i11) {
        d dVar = this.f4689f[i11].get("ImageLength");
        d dVar2 = this.f4689f[i11].get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            d dVar3 = this.f4689f[i11].get("JPEGInterchangeFormat");
            d dVar4 = this.f4689f[i11].get("JPEGInterchangeFormatLength");
            if (dVar3 == null || dVar4 == null) {
                return;
            }
            int m11 = dVar3.m(this.f4691h);
            int m12 = dVar3.m(this.f4691h);
            gVar.m(m11);
            byte[] bArr = new byte[m12];
            gVar.read(bArr);
            l(new b(bArr), m11, i11);
        }
    }

    private void Z(InputStream inputStream, OutputStream outputStream) {
        if (f4678u) {
            Log.d("ExifInterface", "saveJpegAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        b bVar = new b(inputStream);
        c cVar = new c(outputStream, ByteOrder.BIG_ENDIAN);
        if (bVar.readByte() == -1) {
            cVar.g(-1);
            if (bVar.readByte() == -40) {
                cVar.g(-40);
                d dVar = null;
                if (g("Xmp") != null && this.f4703t) {
                    dVar = this.f4689f[0].remove("Xmp");
                }
                cVar.g(-1);
                cVar.g(-31);
                l0(cVar);
                if (dVar != null) {
                    this.f4689f[0].put("Xmp", dVar);
                }
                byte[] bArr = new byte[4096];
                while (bVar.readByte() == -1) {
                    byte readByte = bVar.readByte();
                    if (readByte == -39 || readByte == -38) {
                        cVar.g(-1);
                        cVar.g(readByte);
                        androidx.exifinterface.media.b.e(bVar, cVar);
                        return;
                    } else if (readByte != -31) {
                        cVar.g(-1);
                        cVar.g(readByte);
                        int readUnsignedShort = bVar.readUnsignedShort();
                        cVar.p(readUnsignedShort);
                        int i11 = readUnsignedShort - 2;
                        if (i11 < 0) {
                            throw new IOException("Invalid length");
                        }
                        while (i11 > 0) {
                            int read = bVar.read(bArr, 0, Math.min(i11, 4096));
                            if (read >= 0) {
                                cVar.write(bArr, 0, read);
                                i11 -= read;
                            }
                        }
                    } else {
                        int readUnsignedShort2 = bVar.readUnsignedShort() - 2;
                        if (readUnsignedShort2 >= 0) {
                            byte[] bArr2 = new byte[6];
                            if (readUnsignedShort2 >= 6) {
                                if (bVar.read(bArr2) == 6) {
                                    if (Arrays.equals(bArr2, f4673o0)) {
                                        bVar.l(readUnsignedShort2 - 6);
                                    }
                                } else {
                                    throw new IOException("Invalid exif");
                                }
                            }
                            cVar.g(-1);
                            cVar.g(readByte);
                            cVar.p(readUnsignedShort2 + 2);
                            if (readUnsignedShort2 >= 6) {
                                readUnsignedShort2 -= 6;
                                cVar.write(bArr2);
                            }
                            while (readUnsignedShort2 > 0) {
                                int read2 = bVar.read(bArr, 0, Math.min(readUnsignedShort2, 4096));
                                if (read2 >= 0) {
                                    cVar.write(bArr, 0, read2);
                                    readUnsignedShort2 -= read2;
                                }
                            }
                        } else {
                            throw new IOException("Invalid length");
                        }
                    }
                }
                throw new IOException("Invalid marker");
            }
            throw new IOException("Invalid marker");
        }
        throw new IOException("Invalid marker");
    }

    private void a() {
        String g11 = g("DateTimeOriginal");
        if (g11 != null && g("DateTime") == null) {
            this.f4689f[0].put("DateTime", d.e(g11));
        }
        if (g("ImageWidth") == null) {
            this.f4689f[0].put("ImageWidth", d.f(0L, this.f4691h));
        }
        if (g("ImageLength") == null) {
            this.f4689f[0].put("ImageLength", d.f(0L, this.f4691h));
        }
        if (g("Orientation") == null) {
            this.f4689f[0].put("Orientation", d.f(0L, this.f4691h));
        }
        if (g("LightSource") == null) {
            this.f4689f[1].put("LightSource", d.f(0L, this.f4691h));
        }
    }

    private void a0(InputStream inputStream, OutputStream outputStream) {
        if (f4678u) {
            Log.d("ExifInterface", "savePngAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        b bVar = new b(inputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        c cVar = new c(outputStream, byteOrder);
        byte[] bArr = F;
        androidx.exifinterface.media.b.f(bVar, cVar, bArr.length);
        int i11 = this.f4699p;
        if (i11 == 0) {
            int readInt = bVar.readInt();
            cVar.j(readInt);
            androidx.exifinterface.media.b.f(bVar, cVar, readInt + 4 + 4);
        } else {
            androidx.exifinterface.media.b.f(bVar, cVar, ((i11 - bArr.length) - 4) - 4);
            bVar.l(bVar.readInt() + 4 + 4);
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                c cVar2 = new c(byteArrayOutputStream2, byteOrder);
                l0(cVar2);
                byte[] byteArray = ((ByteArrayOutputStream) cVar2.f4712a).toByteArray();
                cVar.write(byteArray);
                CRC32 crc32 = new CRC32();
                crc32.update(byteArray, 4, byteArray.length - 4);
                cVar.j((int) crc32.getValue());
                androidx.exifinterface.media.b.c(byteArrayOutputStream2);
                androidx.exifinterface.media.b.e(bVar, cVar);
            } catch (Throwable th2) {
                th = th2;
                byteArrayOutputStream = byteArrayOutputStream2;
                androidx.exifinterface.media.b.c(byteArrayOutputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private String b(double d11) {
        long j11 = (long) d11;
        double d12 = d11 - j11;
        long j12 = (long) (d12 * 60.0d);
        long round = Math.round((d12 - (j12 / 60.0d)) * 3600.0d * 1.0E7d);
        return j11 + "/1," + j12 + "/1," + round + "/10000000";
    }

    private void b0(InputStream inputStream, OutputStream outputStream) {
        int i11;
        int i12;
        int i13;
        int i14;
        if (f4678u) {
            Log.d("ExifInterface", "saveWebpAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        b bVar = new b(inputStream, byteOrder);
        c cVar = new c(outputStream, byteOrder);
        byte[] bArr = J;
        androidx.exifinterface.media.b.f(bVar, cVar, bArr.length);
        byte[] bArr2 = K;
        bVar.l(bArr2.length + 4);
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    c cVar2 = new c(byteArrayOutputStream2, byteOrder);
                    int i15 = this.f4699p;
                    if (i15 != 0) {
                        androidx.exifinterface.media.b.f(bVar, cVar2, ((i15 - ((bArr.length + 4) + bArr2.length)) - 4) - 4);
                        bVar.l(4);
                        bVar.l(bVar.readInt());
                        l0(cVar2);
                    } else {
                        byte[] bArr3 = new byte[4];
                        if (bVar.read(bArr3) == 4) {
                            byte[] bArr4 = N;
                            boolean z11 = true;
                            if (Arrays.equals(bArr3, bArr4)) {
                                int readInt = bVar.readInt();
                                byte[] bArr5 = new byte[readInt % 2 == 1 ? readInt + 1 : readInt];
                                bVar.read(bArr5);
                                bArr5[0] = (byte) (8 | bArr5[0]);
                                if (((bArr5[0] >> 1) & 1) != 1) {
                                    z11 = false;
                                }
                                cVar2.write(bArr4);
                                cVar2.j(readInt);
                                cVar2.write(bArr5);
                                if (z11) {
                                    d(bVar, cVar2, Q, null);
                                    while (true) {
                                        byte[] bArr6 = new byte[4];
                                        inputStream.read(bArr6);
                                        if (!Arrays.equals(bArr6, R)) {
                                            break;
                                        }
                                        e(bVar, cVar2, bArr6);
                                    }
                                    l0(cVar2);
                                } else {
                                    d(bVar, cVar2, P, O);
                                    l0(cVar2);
                                }
                            } else {
                                byte[] bArr7 = P;
                                if (Arrays.equals(bArr3, bArr7) || Arrays.equals(bArr3, O)) {
                                    int readInt2 = bVar.readInt();
                                    int i16 = readInt2 % 2 == 1 ? readInt2 + 1 : readInt2;
                                    byte[] bArr8 = new byte[3];
                                    if (Arrays.equals(bArr3, bArr7)) {
                                        bVar.read(bArr8);
                                        byte[] bArr9 = new byte[3];
                                        if (bVar.read(bArr9) == 3 && Arrays.equals(M, bArr9)) {
                                            i11 = bVar.readInt();
                                            i12 = (i11 << 18) >> 18;
                                            i13 = (i11 << 2) >> 18;
                                            i16 -= 10;
                                            i14 = 0;
                                        } else {
                                            throw new IOException("Encountered error while checking VP8 signature");
                                        }
                                    } else if (!Arrays.equals(bArr3, O)) {
                                        i11 = 0;
                                        i12 = 0;
                                        i13 = 0;
                                        i14 = 0;
                                    } else if (bVar.readByte() == 47) {
                                        i11 = bVar.readInt();
                                        i14 = i11 & 8;
                                        i16 -= 5;
                                        i13 = ((i11 << 4) >> 18) + 1;
                                        i12 = ((i11 << 18) >> 18) + 1;
                                    } else {
                                        throw new IOException("Encountered error while checking VP8L signature");
                                    }
                                    cVar2.write(bArr4);
                                    cVar2.j(10);
                                    byte[] bArr10 = new byte[10];
                                    bArr10[0] = (byte) (bArr10[0] | 8);
                                    bArr10[0] = (byte) (bArr10[0] | (i14 << 4));
                                    int i17 = i12 - 1;
                                    int i18 = i13 - 1;
                                    bArr10[4] = (byte) i17;
                                    bArr10[5] = (byte) (i17 >> 8);
                                    bArr10[6] = (byte) (i17 >> 16);
                                    bArr10[7] = (byte) i18;
                                    bArr10[8] = (byte) (i18 >> 8);
                                    bArr10[9] = (byte) (i18 >> 16);
                                    cVar2.write(bArr10);
                                    cVar2.write(bArr3);
                                    cVar2.j(readInt2);
                                    if (Arrays.equals(bArr3, bArr7)) {
                                        cVar2.write(bArr8);
                                        cVar2.write(M);
                                        cVar2.j(i11);
                                    } else if (Arrays.equals(bArr3, O)) {
                                        cVar2.write(47);
                                        cVar2.j(i11);
                                    }
                                    androidx.exifinterface.media.b.f(bVar, cVar2, i16);
                                    l0(cVar2);
                                }
                            }
                        } else {
                            throw new IOException("Encountered invalid length while parsing WebP chunk type");
                        }
                    }
                    androidx.exifinterface.media.b.e(bVar, cVar2);
                    int size = byteArrayOutputStream2.size();
                    byte[] bArr11 = K;
                    cVar.j(size + bArr11.length);
                    cVar.write(bArr11);
                    byteArrayOutputStream2.writeTo(cVar);
                    androidx.exifinterface.media.b.c(byteArrayOutputStream2);
                } catch (Exception e11) {
                    e = e11;
                    throw new IOException("Failed to save WebP file", e);
                } catch (Throwable th2) {
                    th = th2;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    androidx.exifinterface.media.b.c(byteArrayOutputStream);
                    throw th;
                }
            } catch (Exception e12) {
                e = e12;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private static double c(String str, String str2) {
        try {
            String[] split = str.split(",", -1);
            String[] split2 = split[0].split("/", -1);
            String[] split3 = split[1].split("/", -1);
            String[] split4 = split[2].split("/", -1);
            double parseDouble = (Double.parseDouble(split2[0].trim()) / Double.parseDouble(split2[1].trim())) + ((Double.parseDouble(split3[0].trim()) / Double.parseDouble(split3[1].trim())) / 60.0d) + ((Double.parseDouble(split4[0].trim()) / Double.parseDouble(split4[1].trim())) / 3600.0d);
            if (!str2.equals("S") && !str2.equals("W")) {
                if (!str2.equals(Gender.NONE) && !str2.equals("E")) {
                    throw new IllegalArgumentException();
                }
                return parseDouble;
            }
            return -parseDouble;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused) {
            throw new IllegalArgumentException();
        }
    }

    private void d(b bVar, c cVar, byte[] bArr, byte[] bArr2) {
        Charset charset;
        String str;
        while (true) {
            byte[] bArr3 = new byte[4];
            if (bVar.read(bArr3) != 4) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Encountered invalid length while copying WebP chunks up tochunk type ");
                sb2.append(new String(bArr, f4672n0));
                if (bArr2 == null) {
                    str = "";
                } else {
                    str = " or " + new String(bArr2, charset);
                }
                sb2.append(str);
                throw new IOException(sb2.toString());
            }
            e(bVar, cVar, bArr3);
            if (Arrays.equals(bArr3, bArr)) {
                return;
            }
            if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                return;
            }
        }
    }

    private void e(b bVar, c cVar, byte[] bArr) {
        int readInt = bVar.readInt();
        cVar.write(bArr);
        cVar.j(readInt);
        if (readInt % 2 == 1) {
            readInt++;
        }
        androidx.exifinterface.media.b.f(bVar, cVar, readInt);
    }

    private void g0(b bVar) {
        HashMap<String, d> hashMap = this.f4689f[4];
        d dVar = hashMap.get("Compression");
        if (dVar != null) {
            int m11 = dVar.m(this.f4691h);
            this.f4698o = m11;
            if (m11 != 1) {
                if (m11 == 6) {
                    z(bVar, hashMap);
                    return;
                } else if (m11 != 7) {
                    return;
                }
            }
            if (L(hashMap)) {
                A(bVar, hashMap);
                return;
            }
            return;
        }
        this.f4698o = 6;
        z(bVar, hashMap);
    }

    private static boolean h0(int i11) {
        return (i11 == 4 || i11 == 9 || i11 == 13 || i11 == 14) ? false : true;
    }

    private void i0(int i11, int i12) {
        if (!this.f4689f[i11].isEmpty() && !this.f4689f[i12].isEmpty()) {
            d dVar = this.f4689f[i11].get("ImageLength");
            d dVar2 = this.f4689f[i11].get("ImageWidth");
            d dVar3 = this.f4689f[i12].get("ImageLength");
            d dVar4 = this.f4689f[i12].get("ImageWidth");
            if (dVar == null || dVar2 == null) {
                if (f4678u) {
                    Log.d("ExifInterface", "First image does not contain valid size information");
                }
            } else if (dVar3 != null && dVar4 != null) {
                int m11 = dVar.m(this.f4691h);
                int m12 = dVar2.m(this.f4691h);
                int m13 = dVar3.m(this.f4691h);
                int m14 = dVar4.m(this.f4691h);
                if (m11 >= m13 || m12 >= m14) {
                    return;
                }
                HashMap<String, d>[] hashMapArr = this.f4689f;
                HashMap<String, d> hashMap = hashMapArr[i11];
                hashMapArr[i11] = hashMapArr[i12];
                hashMapArr[i12] = hashMap;
            } else if (f4678u) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
            }
        } else if (f4678u) {
            Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
        }
    }

    private d j(String str) {
        Objects.requireNonNull(str, "tag shouldn't be null");
        if ("ISOSpeedRatings".equals(str)) {
            if (f4678u) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i11 = 0; i11 < f4666h0.length; i11++) {
            d dVar = this.f4689f[i11].get(str);
            if (dVar != null) {
                return dVar;
            }
        }
        return null;
    }

    private void j0(g gVar, int i11) {
        d j11;
        d j12;
        d dVar = this.f4689f[i11].get("DefaultCropSize");
        d dVar2 = this.f4689f[i11].get("SensorTopBorder");
        d dVar3 = this.f4689f[i11].get("SensorLeftBorder");
        d dVar4 = this.f4689f[i11].get("SensorBottomBorder");
        d dVar5 = this.f4689f[i11].get("SensorRightBorder");
        if (dVar == null) {
            if (dVar2 != null && dVar3 != null && dVar4 != null && dVar5 != null) {
                int m11 = dVar2.m(this.f4691h);
                int m12 = dVar4.m(this.f4691h);
                int m13 = dVar5.m(this.f4691h);
                int m14 = dVar3.m(this.f4691h);
                if (m12 <= m11 || m13 <= m14) {
                    return;
                }
                d j13 = d.j(m12 - m11, this.f4691h);
                d j14 = d.j(m13 - m14, this.f4691h);
                this.f4689f[i11].put("ImageLength", j13);
                this.f4689f[i11].put("ImageWidth", j14);
                return;
            }
            X(gVar, i11);
            return;
        }
        if (dVar.f4714a == 5) {
            f[] fVarArr = (f[]) dVar.o(this.f4691h);
            if (fVarArr != null && fVarArr.length == 2) {
                j11 = d.h(fVarArr[0], this.f4691h);
                j12 = d.h(fVarArr[1], this.f4691h);
            } else {
                Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(fVarArr));
                return;
            }
        } else {
            int[] iArr = (int[]) dVar.o(this.f4691h);
            if (iArr != null && iArr.length == 2) {
                j11 = d.j(iArr[0], this.f4691h);
                j12 = d.j(iArr[1], this.f4691h);
            } else {
                Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                return;
            }
        }
        this.f4689f[i11].put("ImageWidth", j11);
        this.f4689f[i11].put("ImageLength", j12);
    }

    private void k(g gVar) {
        String str;
        String str2;
        if (Build.VERSION.SDK_INT >= 28) {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                try {
                    b.C0079b.a(mediaMetadataRetriever, new C0078a(this, gVar));
                    String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
                    String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
                    String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
                    String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
                    String str3 = null;
                    if ("yes".equals(extractMetadata3)) {
                        str3 = mediaMetadataRetriever.extractMetadata(29);
                        str = mediaMetadataRetriever.extractMetadata(30);
                        str2 = mediaMetadataRetriever.extractMetadata(31);
                    } else if ("yes".equals(extractMetadata4)) {
                        str3 = mediaMetadataRetriever.extractMetadata(18);
                        str = mediaMetadataRetriever.extractMetadata(19);
                        str2 = mediaMetadataRetriever.extractMetadata(24);
                    } else {
                        str = null;
                        str2 = null;
                    }
                    if (str3 != null) {
                        this.f4689f[0].put("ImageWidth", d.j(Integer.parseInt(str3), this.f4691h));
                    }
                    if (str != null) {
                        this.f4689f[0].put("ImageLength", d.j(Integer.parseInt(str), this.f4691h));
                    }
                    if (str2 != null) {
                        int i11 = 1;
                        int parseInt = Integer.parseInt(str2);
                        if (parseInt == 90) {
                            i11 = 6;
                        } else if (parseInt == 180) {
                            i11 = 3;
                        } else if (parseInt == 270) {
                            i11 = 8;
                        }
                        this.f4689f[0].put("Orientation", d.j(i11, this.f4691h));
                    }
                    if (extractMetadata != null && extractMetadata2 != null) {
                        int parseInt2 = Integer.parseInt(extractMetadata);
                        int parseInt3 = Integer.parseInt(extractMetadata2);
                        if (parseInt3 > 6) {
                            gVar.m(parseInt2);
                            byte[] bArr = new byte[6];
                            if (gVar.read(bArr) == 6) {
                                int i12 = parseInt2 + 6;
                                int i13 = parseInt3 - 6;
                                if (Arrays.equals(bArr, f4673o0)) {
                                    byte[] bArr2 = new byte[i13];
                                    if (gVar.read(bArr2) == i13) {
                                        this.f4699p = i12;
                                        T(bArr2, 0);
                                    } else {
                                        throw new IOException("Can't read exif");
                                    }
                                } else {
                                    throw new IOException("Invalid identifier");
                                }
                            } else {
                                throw new IOException("Can't read identifier");
                            }
                        } else {
                            throw new IOException("Invalid exif length");
                        }
                    }
                    if (f4678u) {
                        Log.d("ExifInterface", "Heif meta: " + str3 + "x" + str + ", rotation " + str2);
                    }
                    return;
                } catch (RuntimeException unused) {
                    throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
                }
            } finally {
                mediaMetadataRetriever.release();
            }
        }
        throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
    }

    private void k0() {
        i0(0, 5);
        i0(0, 4);
        i0(5, 4);
        d dVar = this.f4689f[1].get("PixelXDimension");
        d dVar2 = this.f4689f[1].get("PixelYDimension");
        if (dVar != null && dVar2 != null) {
            this.f4689f[0].put("ImageWidth", dVar);
            this.f4689f[0].put("ImageLength", dVar2);
        }
        if (this.f4689f[4].isEmpty() && N(this.f4689f[5])) {
            HashMap<String, d>[] hashMapArr = this.f4689f;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        if (!N(this.f4689f[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        W(0, "ThumbnailOrientation", "Orientation");
        W(0, "ThumbnailImageLength", "ImageLength");
        W(0, "ThumbnailImageWidth", "ImageWidth");
        W(5, "ThumbnailOrientation", "Orientation");
        W(5, "ThumbnailImageLength", "ImageLength");
        W(5, "ThumbnailImageWidth", "ImageWidth");
        W(4, "Orientation", "ThumbnailOrientation");
        W(4, "ImageLength", "ThumbnailImageLength");
        W(4, "ImageWidth", "ThumbnailImageWidth");
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x019a, code lost:
        r22.j(r21.f4691h);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x019f, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ba A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0184 A[LOOP:0: B:10:0x0038->B:63:0x0184, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x018e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void l(androidx.exifinterface.media.a.b r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.l(androidx.exifinterface.media.a$b, int, int):void");
    }

    private int l0(c cVar) {
        e[][] eVarArr = f4666h0;
        int[] iArr = new int[eVarArr.length];
        int[] iArr2 = new int[eVarArr.length];
        for (e eVar : f4667i0) {
            V(eVar.f4719b);
        }
        if (this.f4692i) {
            if (this.f4693j) {
                V("StripOffsets");
                V("StripByteCounts");
            } else {
                V("JPEGInterchangeFormat");
                V("JPEGInterchangeFormatLength");
            }
        }
        for (int i11 = 0; i11 < f4666h0.length; i11++) {
            for (Object obj : this.f4689f[i11].entrySet().toArray()) {
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getValue() == null) {
                    this.f4689f[i11].remove(entry.getKey());
                }
            }
        }
        if (!this.f4689f[1].isEmpty()) {
            this.f4689f[0].put(f4667i0[1].f4719b, d.f(0L, this.f4691h));
        }
        if (!this.f4689f[2].isEmpty()) {
            this.f4689f[0].put(f4667i0[2].f4719b, d.f(0L, this.f4691h));
        }
        if (!this.f4689f[3].isEmpty()) {
            this.f4689f[1].put(f4667i0[3].f4719b, d.f(0L, this.f4691h));
        }
        if (this.f4692i) {
            if (this.f4693j) {
                this.f4689f[4].put("StripOffsets", d.j(0, this.f4691h));
                this.f4689f[4].put("StripByteCounts", d.j(this.f4696m, this.f4691h));
            } else {
                this.f4689f[4].put("JPEGInterchangeFormat", d.f(0L, this.f4691h));
                this.f4689f[4].put("JPEGInterchangeFormatLength", d.f(this.f4696m, this.f4691h));
            }
        }
        for (int i12 = 0; i12 < f4666h0.length; i12++) {
            int i13 = 0;
            for (Map.Entry<String, d> entry2 : this.f4689f[i12].entrySet()) {
                int p11 = entry2.getValue().p();
                if (p11 > 4) {
                    i13 += p11;
                }
            }
            iArr2[i12] = iArr2[i12] + i13;
        }
        int i14 = 8;
        for (int i15 = 0; i15 < f4666h0.length; i15++) {
            if (!this.f4689f[i15].isEmpty()) {
                iArr[i15] = i14;
                i14 += (this.f4689f[i15].size() * 12) + 2 + 4 + iArr2[i15];
            }
        }
        if (this.f4692i) {
            if (this.f4693j) {
                this.f4689f[4].put("StripOffsets", d.j(i14, this.f4691h));
            } else {
                this.f4689f[4].put("JPEGInterchangeFormat", d.f(i14, this.f4691h));
            }
            this.f4695l = i14;
            i14 += this.f4696m;
        }
        if (this.f4687d == 4) {
            i14 += 8;
        }
        if (f4678u) {
            for (int i16 = 0; i16 < f4666h0.length; i16++) {
                Log.d("ExifInterface", String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", Integer.valueOf(i16), Integer.valueOf(iArr[i16]), Integer.valueOf(this.f4689f[i16].size()), Integer.valueOf(iArr2[i16]), Integer.valueOf(i14)));
            }
        }
        if (!this.f4689f[1].isEmpty()) {
            this.f4689f[0].put(f4667i0[1].f4719b, d.f(iArr[1], this.f4691h));
        }
        if (!this.f4689f[2].isEmpty()) {
            this.f4689f[0].put(f4667i0[2].f4719b, d.f(iArr[2], this.f4691h));
        }
        if (!this.f4689f[3].isEmpty()) {
            this.f4689f[1].put(f4667i0[3].f4719b, d.f(iArr[3], this.f4691h));
        }
        int i17 = this.f4687d;
        if (i17 == 4) {
            cVar.p(i14);
            cVar.write(f4673o0);
        } else if (i17 == 13) {
            cVar.j(i14);
            cVar.write(G);
        } else if (i17 == 14) {
            cVar.write(L);
            cVar.j(i14);
        }
        cVar.l(this.f4691h == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        cVar.a(this.f4691h);
        cVar.p(42);
        cVar.m(8L);
        for (int i18 = 0; i18 < f4666h0.length; i18++) {
            if (!this.f4689f[i18].isEmpty()) {
                cVar.p(this.f4689f[i18].size());
                int size = iArr[i18] + 2 + (this.f4689f[i18].size() * 12) + 4;
                for (Map.Entry<String, d> entry3 : this.f4689f[i18].entrySet()) {
                    int i19 = f4669k0[i18].get(entry3.getKey()).f4718a;
                    d value = entry3.getValue();
                    int p12 = value.p();
                    cVar.p(i19);
                    cVar.p(value.f4714a);
                    cVar.j(value.f4715b);
                    if (p12 > 4) {
                        cVar.m(size);
                        size += p12;
                    } else {
                        cVar.write(value.f4717d);
                        if (p12 < 4) {
                            while (p12 < 4) {
                                cVar.g(0);
                                p12++;
                            }
                        }
                    }
                }
                if (i18 == 0 && !this.f4689f[4].isEmpty()) {
                    cVar.m(iArr[4]);
                } else {
                    cVar.m(0L);
                }
                for (Map.Entry<String, d> entry4 : this.f4689f[i18].entrySet()) {
                    byte[] bArr = entry4.getValue().f4717d;
                    if (bArr.length > 4) {
                        cVar.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        if (this.f4692i) {
            cVar.write(w());
        }
        if (this.f4687d == 14 && i14 % 2 == 1) {
            cVar.g(0);
        }
        cVar.a(ByteOrder.BIG_ENDIAN);
        return i14;
    }

    private int n(BufferedInputStream bufferedInputStream) {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (F(bArr)) {
            return 4;
        }
        if (I(bArr)) {
            return 9;
        }
        if (E(bArr)) {
            return 12;
        }
        if (G(bArr)) {
            return 7;
        }
        if (J(bArr)) {
            return 10;
        }
        if (H(bArr)) {
            return 13;
        }
        return O(bArr) ? 14 : 0;
    }

    private void o(g gVar) {
        r(gVar);
        d dVar = this.f4689f[1].get("MakerNote");
        if (dVar != null) {
            g gVar2 = new g(dVar.f4717d);
            gVar2.j(this.f4691h);
            byte[] bArr = D;
            byte[] bArr2 = new byte[bArr.length];
            gVar2.readFully(bArr2);
            gVar2.m(0L);
            byte[] bArr3 = E;
            byte[] bArr4 = new byte[bArr3.length];
            gVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                gVar2.m(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                gVar2.m(12L);
            }
            U(gVar2, 6);
            d dVar2 = this.f4689f[7].get("PreviewImageStart");
            d dVar3 = this.f4689f[7].get("PreviewImageLength");
            if (dVar2 != null && dVar3 != null) {
                this.f4689f[5].put("JPEGInterchangeFormat", dVar2);
                this.f4689f[5].put("JPEGInterchangeFormatLength", dVar3);
            }
            d dVar4 = this.f4689f[8].get("AspectFrame");
            if (dVar4 != null) {
                int[] iArr = (int[]) dVar4.o(this.f4691h);
                if (iArr != null && iArr.length == 4) {
                    if (iArr[2] <= iArr[0] || iArr[3] <= iArr[1]) {
                        return;
                    }
                    int i11 = (iArr[2] - iArr[0]) + 1;
                    int i12 = (iArr[3] - iArr[1]) + 1;
                    if (i11 < i12) {
                        int i13 = i11 + i12;
                        i12 = i13 - i12;
                        i11 = i13 - i12;
                    }
                    d j11 = d.j(i11, this.f4691h);
                    d j12 = d.j(i12, this.f4691h);
                    this.f4689f[0].put("ImageWidth", j11);
                    this.f4689f[0].put("ImageLength", j12);
                    return;
                }
                Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
            }
        }
    }

    private void p(b bVar) {
        if (f4678u) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.j(ByteOrder.BIG_ENDIAN);
        byte[] bArr = F;
        bVar.l(bArr.length);
        int length = bArr.length + 0;
        while (true) {
            try {
                int readInt = bVar.readInt();
                int i11 = length + 4;
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) == 4) {
                    int i12 = i11 + 4;
                    if (i12 == 16 && !Arrays.equals(bArr2, H)) {
                        throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                    }
                    if (Arrays.equals(bArr2, I)) {
                        return;
                    }
                    if (Arrays.equals(bArr2, G)) {
                        byte[] bArr3 = new byte[readInt];
                        if (bVar.read(bArr3) == readInt) {
                            int readInt2 = bVar.readInt();
                            CRC32 crc32 = new CRC32();
                            crc32.update(bArr2);
                            crc32.update(bArr3);
                            if (((int) crc32.getValue()) == readInt2) {
                                this.f4699p = i12;
                                T(bArr3, 0);
                                k0();
                                g0(new b(bArr3));
                                return;
                            }
                            throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                        }
                        throw new IOException("Failed to read given length for given PNG chunk type: " + androidx.exifinterface.media.b.a(bArr2));
                    }
                    int i13 = readInt + 4;
                    bVar.l(i13);
                    length = i12 + i13;
                } else {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    private void q(b bVar) {
        boolean z11 = f4678u;
        if (z11) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.l(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.read(bArr);
        bVar.read(bArr2);
        bVar.read(bArr3);
        int i11 = ByteBuffer.wrap(bArr).getInt();
        int i12 = ByteBuffer.wrap(bArr2).getInt();
        int i13 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i12];
        bVar.l(i11 - bVar.a());
        bVar.read(bArr4);
        l(new b(bArr4), i11, 5);
        bVar.l(i13 - bVar.a());
        bVar.j(ByteOrder.BIG_ENDIAN);
        int readInt = bVar.readInt();
        if (z11) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i14 = 0; i14 < readInt; i14++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == f4661c0.f4718a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                d j11 = d.j(readShort, this.f4691h);
                d j12 = d.j(readShort2, this.f4691h);
                this.f4689f[0].put("ImageLength", j11);
                this.f4689f[0].put("ImageWidth", j12);
                if (f4678u) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            bVar.l(readUnsignedShort2);
        }
    }

    private void r(g gVar) {
        d dVar;
        Q(gVar);
        U(gVar, 0);
        j0(gVar, 0);
        j0(gVar, 5);
        j0(gVar, 4);
        k0();
        if (this.f4687d != 8 || (dVar = this.f4689f[1].get("MakerNote")) == null) {
            return;
        }
        g gVar2 = new g(dVar.f4717d);
        gVar2.j(this.f4691h);
        gVar2.l(6);
        U(gVar2, 9);
        d dVar2 = this.f4689f[9].get("ColorSpace");
        if (dVar2 != null) {
            this.f4689f[1].put("ColorSpace", dVar2);
        }
    }

    private void t(g gVar) {
        if (f4678u) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + gVar);
        }
        r(gVar);
        d dVar = this.f4689f[0].get("JpgFromRaw");
        if (dVar != null) {
            l(new b(dVar.f4717d), (int) dVar.f4716c, 5);
        }
        d dVar2 = this.f4689f[0].get("ISO");
        d dVar3 = this.f4689f[1].get("PhotographicSensitivity");
        if (dVar2 == null || dVar3 != null) {
            return;
        }
        this.f4689f[1].put("PhotographicSensitivity", dVar2);
    }

    private void u(g gVar) {
        byte[] bArr = f4673o0;
        gVar.l(bArr.length);
        byte[] bArr2 = new byte[gVar.available()];
        gVar.readFully(bArr2);
        this.f4699p = bArr.length;
        T(bArr2, 0);
    }

    private void x(b bVar) {
        if (f4678u) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.j(ByteOrder.LITTLE_ENDIAN);
        bVar.l(J.length);
        int readInt = bVar.readInt() + 8;
        byte[] bArr = K;
        bVar.l(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) == 4) {
                    int readInt2 = bVar.readInt();
                    int i11 = length + 4 + 4;
                    if (Arrays.equals(L, bArr2)) {
                        byte[] bArr3 = new byte[readInt2];
                        if (bVar.read(bArr3) == readInt2) {
                            this.f4699p = i11;
                            T(bArr3, 0);
                            g0(new b(bArr3));
                            return;
                        }
                        throw new IOException("Failed to read given length for given PNG chunk type: " + androidx.exifinterface.media.b.a(bArr2));
                    }
                    if (readInt2 % 2 == 1) {
                        readInt2++;
                    }
                    length = i11 + readInt2;
                    if (length == readInt) {
                        return;
                    }
                    if (length <= readInt) {
                        bVar.l(readInt2);
                    } else {
                        throw new IOException("Encountered WebP file with invalid chunk size");
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    private static Pair<Integer, Integer> y(String str) {
        if (str.contains(",")) {
            String[] split = str.split(",", -1);
            Pair<Integer, Integer> y11 = y(split[0]);
            if (((Integer) y11.first).intValue() == 2) {
                return y11;
            }
            for (int i11 = 1; i11 < split.length; i11++) {
                Pair<Integer, Integer> y12 = y(split[i11]);
                int intValue = (((Integer) y12.first).equals(y11.first) || ((Integer) y12.second).equals(y11.first)) ? ((Integer) y11.first).intValue() : -1;
                int intValue2 = (((Integer) y11.second).intValue() == -1 || !(((Integer) y12.first).equals(y11.second) || ((Integer) y12.second).equals(y11.second))) ? -1 : ((Integer) y11.second).intValue();
                if (intValue == -1 && intValue2 == -1) {
                    return new Pair<>(2, -1);
                }
                if (intValue == -1) {
                    y11 = new Pair<>(Integer.valueOf(intValue2), -1);
                } else if (intValue2 == -1) {
                    y11 = new Pair<>(Integer.valueOf(intValue), -1);
                }
            }
            return y11;
        } else if (str.contains("/")) {
            String[] split2 = str.split("/", -1);
            if (split2.length == 2) {
                try {
                    long parseDouble = (long) Double.parseDouble(split2[0]);
                    long parseDouble2 = (long) Double.parseDouble(split2[1]);
                    if (parseDouble >= 0 && parseDouble2 >= 0) {
                        if (parseDouble <= 2147483647L && parseDouble2 <= 2147483647L) {
                            return new Pair<>(10, 5);
                        }
                        return new Pair<>(5, -1);
                    }
                    return new Pair<>(10, -1);
                } catch (NumberFormatException unused) {
                }
            }
            return new Pair<>(2, -1);
        } else {
            try {
                try {
                    Long valueOf = Long.valueOf(Long.parseLong(str));
                    if (valueOf.longValue() >= 0 && valueOf.longValue() <= WebSocketProtocol.PAYLOAD_SHORT_MAX) {
                        return new Pair<>(3, 4);
                    }
                    if (valueOf.longValue() < 0) {
                        return new Pair<>(9, -1);
                    }
                    return new Pair<>(4, -1);
                } catch (NumberFormatException unused2) {
                    Double.parseDouble(str);
                    return new Pair<>(12, -1);
                }
            } catch (NumberFormatException unused3) {
                return new Pair<>(2, -1);
            }
        }
    }

    private void z(b bVar, HashMap hashMap) {
        d dVar = (d) hashMap.get("JPEGInterchangeFormat");
        d dVar2 = (d) hashMap.get("JPEGInterchangeFormatLength");
        if (dVar == null || dVar2 == null) {
            return;
        }
        int m11 = dVar.m(this.f4691h);
        int m12 = dVar2.m(this.f4691h);
        if (this.f4687d == 7) {
            m11 += this.f4700q;
        }
        if (m11 > 0 && m12 > 0) {
            this.f4692i = true;
            if (this.f4684a == null && this.f4686c == null && this.f4685b == null) {
                byte[] bArr = new byte[m12];
                bVar.skip(m11);
                bVar.read(bArr);
                this.f4697n = bArr;
            }
            this.f4695l = m11;
            this.f4696m = m12;
        }
        if (f4678u) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + m11 + ", length: " + m12);
        }
    }

    public boolean D() {
        int i11 = i("Orientation", 1);
        return i11 == 2 || i11 == 7 || i11 == 4 || i11 == 5;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ff A[Catch: Exception -> 0x012b, all -> 0x0150, TryCatch #1 {Exception -> 0x012b, blocks: (B:74:0x00fb, B:76:0x00ff, B:78:0x0103, B:81:0x011a, B:79:0x0112), top: B:123:0x00fb }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0112 A[Catch: Exception -> 0x012b, all -> 0x0150, TryCatch #1 {Exception -> 0x012b, blocks: (B:74:0x00fb, B:76:0x00ff, B:78:0x0103, B:81:0x011a, B:79:0x0112), top: B:123:0x00fb }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void Y() {
        /*
            Method dump skipped, instructions count: 399
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.Y():void");
    }

    public void c0(double d11) {
        String str = d11 >= 0.0d ? "0" : "1";
        d0("GPSAltitude", new f(Math.abs(d11)).toString());
        d0("GPSAltitudeRef", str);
    }

    public void d0(String str, String str2) {
        e eVar;
        int i11;
        int i12;
        Matcher matcher;
        String str3 = str;
        String str4 = str2;
        Objects.requireNonNull(str3, "tag shouldn't be null");
        if (("DateTime".equals(str3) || "DateTimeOriginal".equals(str3) || "DateTimeDigitized".equals(str3)) && str4 != null) {
            boolean find = f4676r0.matcher(str4).find();
            boolean find2 = f4677s0.matcher(str4).find();
            if (str2.length() != 19 || (!find && !find2)) {
                Log.w("ExifInterface", "Invalid value for " + str3 + " : " + str4);
                return;
            } else if (find2) {
                str4 = str4.replaceAll("-", ":");
            }
        }
        if ("ISOSpeedRatings".equals(str3)) {
            if (f4678u) {
                Log.d("ExifInterface", "setAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str3 = "PhotographicSensitivity";
        }
        int i13 = 2;
        int i14 = 1;
        if (str4 != null && f4670l0.contains(str3)) {
            if (str3.equals("GPSTimeStamp")) {
                if (!f4675q0.matcher(str4).find()) {
                    Log.w("ExifInterface", "Invalid value for " + str3 + " : " + str4);
                    return;
                }
                str4 = Integer.parseInt(matcher.group(1)) + "/1," + Integer.parseInt(matcher.group(2)) + "/1," + Integer.parseInt(matcher.group(3)) + "/1";
            } else {
                try {
                    str4 = new f(Double.parseDouble(str4)).toString();
                } catch (NumberFormatException unused) {
                    Log.w("ExifInterface", "Invalid value for " + str3 + " : " + str4);
                    return;
                }
            }
        }
        int i15 = 0;
        int i16 = 0;
        while (i16 < f4666h0.length) {
            if ((i16 != 4 || this.f4692i) && (eVar = f4669k0[i16].get(str3)) != null) {
                if (str4 == null) {
                    this.f4689f[i16].remove(str3);
                } else {
                    Pair<Integer, Integer> y11 = y(str4);
                    int i17 = -1;
                    if (eVar.f4720c != ((Integer) y11.first).intValue() && eVar.f4720c != ((Integer) y11.second).intValue()) {
                        int i18 = eVar.f4721d;
                        if (i18 != -1 && (i18 == ((Integer) y11.first).intValue() || eVar.f4721d == ((Integer) y11.second).intValue())) {
                            i11 = eVar.f4721d;
                        } else {
                            int i19 = eVar.f4720c;
                            if (i19 == i14 || i19 == 7 || i19 == i13) {
                                i11 = i19;
                            } else if (f4678u) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Given tag (");
                                sb2.append(str3);
                                sb2.append(") value didn't match with one of expected formats: ");
                                String[] strArr = U;
                                sb2.append(strArr[eVar.f4720c]);
                                sb2.append(eVar.f4721d == -1 ? "" : ", " + strArr[eVar.f4721d]);
                                sb2.append(" (guess: ");
                                sb2.append(strArr[((Integer) y11.first).intValue()]);
                                sb2.append(((Integer) y11.second).intValue() != -1 ? ", " + strArr[((Integer) y11.second).intValue()] : "");
                                sb2.append(")");
                                Log.d("ExifInterface", sb2.toString());
                            }
                        }
                    } else {
                        i11 = eVar.f4720c;
                    }
                    switch (i11) {
                        case 1:
                            i12 = i14;
                            this.f4689f[i16].put(str3, d.a(str4));
                            break;
                        case 2:
                        case 7:
                            i12 = i14;
                            this.f4689f[i16].put(str3, d.e(str4));
                            break;
                        case 3:
                            i12 = i14;
                            String[] split = str4.split(",", -1);
                            int[] iArr = new int[split.length];
                            for (int i21 = 0; i21 < split.length; i21++) {
                                iArr[i21] = Integer.parseInt(split[i21]);
                            }
                            this.f4689f[i16].put(str3, d.k(iArr, this.f4691h));
                            break;
                        case 4:
                            i12 = i14;
                            String[] split2 = str4.split(",", -1);
                            long[] jArr = new long[split2.length];
                            for (int i22 = 0; i22 < split2.length; i22++) {
                                jArr[i22] = Long.parseLong(split2[i22]);
                            }
                            this.f4689f[i16].put(str3, d.g(jArr, this.f4691h));
                            break;
                        case 5:
                            String[] split3 = str4.split(",", -1);
                            f[] fVarArr = new f[split3.length];
                            int i23 = 0;
                            while (i23 < split3.length) {
                                String[] split4 = split3[i23].split("/", i17);
                                fVarArr[i23] = new f((long) Double.parseDouble(split4[0]), (long) Double.parseDouble(split4[1]));
                                i23++;
                                i17 = -1;
                            }
                            i12 = 1;
                            this.f4689f[i16].put(str3, d.i(fVarArr, this.f4691h));
                            break;
                        case 6:
                        case 8:
                        case 11:
                        default:
                            i12 = i14;
                            if (f4678u) {
                                Log.d("ExifInterface", "Data format isn't one of expected formats: " + i11);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            String[] split5 = str4.split(",", -1);
                            int[] iArr2 = new int[split5.length];
                            for (int i24 = 0; i24 < split5.length; i24++) {
                                iArr2[i24] = Integer.parseInt(split5[i24]);
                            }
                            this.f4689f[i16].put(str3, d.c(iArr2, this.f4691h));
                            i12 = 1;
                            break;
                        case 10:
                            String[] split6 = str4.split(",", -1);
                            f[] fVarArr2 = new f[split6.length];
                            int i25 = i15;
                            while (i25 < split6.length) {
                                String[] split7 = split6[i25].split("/", -1);
                                fVarArr2[i25] = new f((long) Double.parseDouble(split7[i15]), (long) Double.parseDouble(split7[i14]));
                                i25++;
                                split6 = split6;
                                i15 = 0;
                                i14 = 1;
                            }
                            this.f4689f[i16].put(str3, d.d(fVarArr2, this.f4691h));
                            i12 = 1;
                            break;
                        case 12:
                            String[] split8 = str4.split(",", -1);
                            double[] dArr = new double[split8.length];
                            for (int i26 = i15; i26 < split8.length; i26++) {
                                dArr[i26] = Double.parseDouble(split8[i26]);
                            }
                            this.f4689f[i16].put(str3, d.b(dArr, this.f4691h));
                            break;
                    }
                    i16++;
                    i14 = i12;
                    i13 = 2;
                    i15 = 0;
                }
            }
            i12 = i14;
            i16++;
            i14 = i12;
            i13 = 2;
            i15 = 0;
        }
    }

    public void e0(Location location) {
        if (location == null) {
            return;
        }
        d0("GPSProcessingMethod", location.getProvider());
        f0(location.getLatitude(), location.getLongitude());
        c0(location.getAltitude());
        d0("GPSSpeedRef", "K");
        d0("GPSSpeed", new f((location.getSpeed() * ((float) TimeUnit.HOURS.toSeconds(1L))) / 1000.0f).toString());
        String[] split = S.format(new Date(location.getTime())).split("\\s+", -1);
        d0("GPSDateStamp", split[0]);
        d0("GPSTimeStamp", split[1]);
    }

    public double f(double d11) {
        double h11 = h("GPSAltitude", -1.0d);
        int i11 = i("GPSAltitudeRef", -1);
        if (h11 < 0.0d || i11 < 0) {
            return d11;
        }
        return h11 * (i11 != 1 ? 1 : -1);
    }

    public void f0(double d11, double d12) {
        if (d11 >= -90.0d && d11 <= 90.0d && !Double.isNaN(d11)) {
            if (d12 >= -180.0d && d12 <= 180.0d && !Double.isNaN(d12)) {
                d0("GPSLatitudeRef", d11 >= 0.0d ? Gender.NONE : "S");
                d0("GPSLatitude", b(Math.abs(d11)));
                d0("GPSLongitudeRef", d12 >= 0.0d ? "E" : "W");
                d0("GPSLongitude", b(Math.abs(d12)));
                return;
            }
            throw new IllegalArgumentException("Longitude value " + d12 + " is not valid.");
        }
        throw new IllegalArgumentException("Latitude value " + d11 + " is not valid.");
    }

    public String g(String str) {
        Objects.requireNonNull(str, "tag shouldn't be null");
        d j11 = j(str);
        if (j11 != null) {
            if (!f4670l0.contains(str)) {
                return j11.n(this.f4691h);
            }
            if (str.equals("GPSTimeStamp")) {
                int i11 = j11.f4714a;
                if (i11 != 5 && i11 != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + j11.f4714a);
                    return null;
                }
                f[] fVarArr = (f[]) j11.o(this.f4691h);
                if (fVarArr != null && fVarArr.length == 3) {
                    return String.format("%02d:%02d:%02d", Integer.valueOf((int) (((float) fVarArr[0].f4722a) / ((float) fVarArr[0].f4723b))), Integer.valueOf((int) (((float) fVarArr[1].f4722a) / ((float) fVarArr[1].f4723b))), Integer.valueOf((int) (((float) fVarArr[2].f4722a) / ((float) fVarArr[2].f4723b))));
                }
                Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(fVarArr));
                return null;
            }
            try {
                return Double.toString(j11.l(this.f4691h));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public double h(String str, double d11) {
        Objects.requireNonNull(str, "tag shouldn't be null");
        d j11 = j(str);
        if (j11 == null) {
            return d11;
        }
        try {
            return j11.l(this.f4691h);
        } catch (NumberFormatException unused) {
            return d11;
        }
    }

    public int i(String str, int i11) {
        Objects.requireNonNull(str, "tag shouldn't be null");
        d j11 = j(str);
        if (j11 == null) {
            return i11;
        }
        try {
            return j11.m(this.f4691h);
        } catch (NumberFormatException unused) {
            return i11;
        }
    }

    public double[] m() {
        String g11 = g("GPSLatitude");
        String g12 = g("GPSLatitudeRef");
        String g13 = g("GPSLongitude");
        String g14 = g("GPSLongitudeRef");
        if (g11 == null || g12 == null || g13 == null || g14 == null) {
            return null;
        }
        try {
            return new double[]{c(g11, g12), c(g13, g14)};
        } catch (IllegalArgumentException unused) {
            Log.w("ExifInterface", "Latitude/longitude values are not parsable. " + String.format("latValue=%s, latRef=%s, lngValue=%s, lngRef=%s", g11, g12, g13, g14));
            return null;
        }
    }

    public int s() {
        switch (i("Orientation", 1)) {
            case 3:
            case 4:
                return CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256;
            case 5:
            case 8:
                return 270;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    public byte[] v() {
        int i11 = this.f4698o;
        if (i11 == 6 || i11 == 7) {
            return w();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0063 A[Catch: Exception -> 0x009c, all -> 0x00b9, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x009c, blocks: (B:36:0x0063, B:39:0x0079, B:41:0x0085, B:46:0x0090, B:47:0x0095, B:48:0x0096, B:49:0x009b, B:52:0x009e, B:53:0x00a3), top: B:69:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009e A[Catch: Exception -> 0x009c, all -> 0x00b9, TryCatch #0 {Exception -> 0x009c, blocks: (B:36:0x0063, B:39:0x0079, B:41:0x0085, B:46:0x0090, B:47:0x0095, B:48:0x0096, B:49:0x009b, B:52:0x009e, B:53:0x00a3), top: B:69:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c0  */
    /* JADX WARN: Type inference failed for: r1v1, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.content.res.AssetManager$AssetInputStream, java.io.Closeable, java.io.InputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public byte[] w() {
        /*
            Method dump skipped, instructions count: 196
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.w():byte[]");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class g extends b {
        g(byte[] bArr) {
            super(bArr);
            this.f4708a.mark(Integer.MAX_VALUE);
        }

        public void m(long j11) {
            int i11 = this.f4710c;
            if (i11 > j11) {
                this.f4710c = 0;
                this.f4708a.reset();
            } else {
                j11 -= i11;
            }
            l((int) j11);
        }

        g(InputStream inputStream) {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.f4708a.mark(Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public final int f4718a;

        /* renamed from: b  reason: collision with root package name */
        public final String f4719b;

        /* renamed from: c  reason: collision with root package name */
        public final int f4720c;

        /* renamed from: d  reason: collision with root package name */
        public final int f4721d;

        e(String str, int i11, int i12) {
            this.f4719b = str;
            this.f4718a = i11;
            this.f4720c = i12;
            this.f4721d = -1;
        }

        boolean a(int i11) {
            int i12;
            int i13 = this.f4720c;
            if (i13 == 7 || i11 == 7 || i13 == i11 || (i12 = this.f4721d) == i11) {
                return true;
            }
            if ((i13 == 4 || i12 == 4) && i11 == 3) {
                return true;
            }
            if ((i13 == 9 || i12 == 9) && i11 == 8) {
                return true;
            }
            return (i13 == 12 || i12 == 12) && i11 == 11;
        }

        e(String str, int i11, int i12, int i13) {
            this.f4719b = str;
            this.f4718a = i11;
            this.f4720c = i12;
            this.f4721d = i13;
        }
    }

    public a(InputStream inputStream) {
        this(inputStream, 0);
    }

    public a(InputStream inputStream, int i11) {
        e[][] eVarArr = f4666h0;
        this.f4689f = new HashMap[eVarArr.length];
        this.f4690g = new HashSet(eVarArr.length);
        this.f4691h = ByteOrder.BIG_ENDIAN;
        Objects.requireNonNull(inputStream, "inputStream cannot be null");
        this.f4684a = null;
        if (i11 == 1) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, f4673o0.length);
            if (!C(bufferedInputStream)) {
                Log.w("ExifInterface", "Given data does not follow the structure of an Exif-only data.");
                return;
            }
            this.f4688e = true;
            this.f4686c = null;
            this.f4685b = null;
            inputStream = bufferedInputStream;
        } else if (inputStream instanceof AssetManager.AssetInputStream) {
            this.f4686c = (AssetManager.AssetInputStream) inputStream;
            this.f4685b = null;
        } else {
            if (inputStream instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream;
                if (K(fileInputStream.getFD())) {
                    this.f4686c = null;
                    this.f4685b = fileInputStream.getFD();
                }
            }
            this.f4686c = null;
            this.f4685b = null;
        }
        P(inputStream);
    }
}