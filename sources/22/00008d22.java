package nx;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import nx.b;
import nx.f;
import okio.e0;
import okio.f0;

/* loaded from: classes5.dex */
public final class g implements j {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f41959a = Logger.getLogger(b.class.getName());

    /* renamed from: b  reason: collision with root package name */
    private static final okio.i f41960b = okio.i.f("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a implements e0 {

        /* renamed from: a  reason: collision with root package name */
        private final okio.h f41961a;

        /* renamed from: b  reason: collision with root package name */
        int f41962b;

        /* renamed from: c  reason: collision with root package name */
        byte f41963c;

        /* renamed from: d  reason: collision with root package name */
        int f41964d;

        /* renamed from: e  reason: collision with root package name */
        int f41965e;

        /* renamed from: f  reason: collision with root package name */
        short f41966f;

        public a(okio.h hVar) {
            this.f41961a = hVar;
        }

        private void a() {
            int i11 = this.f41964d;
            int m11 = g.m(this.f41961a);
            this.f41965e = m11;
            this.f41962b = m11;
            byte readByte = (byte) (this.f41961a.readByte() & 255);
            this.f41963c = (byte) (this.f41961a.readByte() & 255);
            if (g.f41959a.isLoggable(Level.FINE)) {
                g.f41959a.fine(b.b(true, this.f41964d, this.f41962b, readByte, this.f41963c));
            }
            int readInt = this.f41961a.readInt() & Integer.MAX_VALUE;
            this.f41964d = readInt;
            if (readByte != 9) {
                throw g.k("%s != TYPE_CONTINUATION", Byte.valueOf(readByte));
            }
            if (readInt != i11) {
                throw g.k("TYPE_CONTINUATION streamId changed", new Object[0]);
            }
        }

        @Override // okio.e0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // okio.e0
        public long read(okio.f fVar, long j11) {
            while (true) {
                int i11 = this.f41965e;
                if (i11 == 0) {
                    this.f41961a.skip(this.f41966f);
                    this.f41966f = (short) 0;
                    if ((this.f41963c & 4) != 0) {
                        return -1L;
                    }
                    a();
                } else {
                    long read = this.f41961a.read(fVar, Math.min(j11, i11));
                    if (read == -1) {
                        return -1L;
                    }
                    this.f41965e -= (int) read;
                    return read;
                }
            }
        }

        @Override // okio.e0
        public f0 timeout() {
            return this.f41961a.timeout();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private static final String[] f41967a = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

        /* renamed from: b  reason: collision with root package name */
        private static final String[] f41968b = new String[64];

        /* renamed from: c  reason: collision with root package name */
        private static final String[] f41969c = new String[256];

        static {
            int i11;
            String[] strArr;
            int i12 = 0;
            int i13 = 0;
            while (true) {
                String[] strArr2 = f41969c;
                if (i13 >= strArr2.length) {
                    break;
                }
                strArr2[i13] = String.format("%8s", Integer.toBinaryString(i13)).replace(' ', '0');
                i13++;
            }
            String[] strArr3 = f41968b;
            strArr3[0] = "";
            strArr3[1] = "END_STREAM";
            int[] iArr = {1};
            strArr3[8] = "PADDED";
            for (int i14 = 0; i14 < 1; i14++) {
                f41968b[iArr[i14] | 8] = strArr[i11] + "|PADDED";
            }
            String[] strArr4 = f41968b;
            strArr4[4] = "END_HEADERS";
            strArr4[32] = "PRIORITY";
            strArr4[36] = "END_HEADERS|PRIORITY";
            int[] iArr2 = {4, 32, 36};
            for (int i15 = 0; i15 < 3; i15++) {
                int i16 = iArr2[i15];
                for (int i17 = 0; i17 < 1; i17++) {
                    int i18 = iArr[i17];
                    String[] strArr5 = f41968b;
                    int i19 = i18 | i16;
                    strArr5[i19] = strArr5[i18] + '|' + strArr5[i16];
                    strArr5[i19 | 8] = strArr5[i18] + '|' + strArr5[i16] + "|PADDED";
                }
            }
            while (true) {
                String[] strArr6 = f41968b;
                if (i12 >= strArr6.length) {
                    return;
                }
                if (strArr6[i12] == null) {
                    strArr6[i12] = f41969c[i12];
                }
                i12++;
            }
        }

        b() {
        }

        static String a(byte b11, byte b12) {
            if (b12 == 0) {
                return "";
            }
            if (b11 != 2 && b11 != 3) {
                if (b11 == 4 || b11 == 6) {
                    return b12 == 1 ? "ACK" : f41969c[b12];
                } else if (b11 != 7 && b11 != 8) {
                    String[] strArr = f41968b;
                    String str = b12 < strArr.length ? strArr[b12] : f41969c[b12];
                    if (b11 != 5 || (b12 & 4) == 0) {
                        return (b11 != 0 || (b12 & 32) == 0) ? str : str.replace("PRIORITY", "COMPRESSED");
                    }
                    return str.replace("HEADERS", "PUSH_PROMISE");
                }
            }
            return f41969c[b12];
        }

        static String b(boolean z11, int i11, int i12, byte b11, byte b12) {
            String[] strArr = f41967a;
            String format = b11 < strArr.length ? strArr[b11] : String.format("0x%02x", Byte.valueOf(b11));
            String a11 = a(b11, b12);
            Object[] objArr = new Object[5];
            objArr[0] = z11 ? "<<" : ">>";
            objArr[1] = Integer.valueOf(i11);
            objArr[2] = Integer.valueOf(i12);
            objArr[3] = format;
            objArr[4] = a11;
            return String.format("%s 0x%08x %5d %-13s %s", objArr);
        }
    }

    /* loaded from: classes5.dex */
    static final class c implements nx.b {

        /* renamed from: a  reason: collision with root package name */
        private final okio.h f41970a;

        /* renamed from: b  reason: collision with root package name */
        private final a f41971b;

        /* renamed from: c  reason: collision with root package name */
        final f.a f41972c;

        c(okio.h hVar, int i11, boolean z11) {
            this.f41970a = hVar;
            a aVar = new a(hVar);
            this.f41971b = aVar;
            this.f41972c = new f.a(i11, aVar);
        }

        private void C(b.a aVar, int i11, byte b11, int i12) {
            if (i11 != 5) {
                throw g.k("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i11));
            }
            if (i12 != 0) {
                p(aVar, i12);
                return;
            }
            throw g.k("TYPE_PRIORITY streamId == 0", new Object[0]);
        }

        private void D(b.a aVar, int i11, byte b11, int i12) {
            if (i12 != 0) {
                short readByte = (b11 & 8) != 0 ? (short) (this.f41970a.readByte() & 255) : (short) 0;
                aVar.pushPromise(i12, this.f41970a.readInt() & Integer.MAX_VALUE, j(g.l(i11 - 4, b11, readByte), readByte, b11, i12));
                return;
            }
            throw g.k("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
        }

        private void J(b.a aVar, int i11, byte b11, int i12) {
            if (i11 != 4) {
                throw g.k("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i11));
            }
            if (i12 != 0) {
                int readInt = this.f41970a.readInt();
                nx.a fromHttp2 = nx.a.fromHttp2(readInt);
                if (fromHttp2 == null) {
                    throw g.k("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(readInt));
                }
                aVar.k(i12, fromHttp2);
                return;
            }
            throw g.k("TYPE_RST_STREAM streamId == 0", new Object[0]);
        }

        private void L(b.a aVar, int i11, byte b11, int i12) {
            if (i12 != 0) {
                throw g.k("TYPE_SETTINGS streamId != 0", new Object[0]);
            }
            if ((b11 & 1) != 0) {
                if (i11 == 0) {
                    aVar.ackSettings();
                    return;
                }
                throw g.k("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
            } else if (i11 % 6 != 0) {
                throw g.k("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i11));
            } else {
                i iVar = new i();
                for (int i13 = 0; i13 < i11; i13 += 6) {
                    short readShort = this.f41970a.readShort();
                    int readInt = this.f41970a.readInt();
                    switch (readShort) {
                        case 1:
                        case 6:
                            break;
                        case 2:
                            if (readInt != 0 && readInt != 1) {
                                throw g.k("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                            }
                            break;
                        case 3:
                            readShort = 4;
                            break;
                        case 4:
                            readShort = 7;
                            if (readInt < 0) {
                                throw g.k("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                            }
                            break;
                        case 5:
                            if (readInt < 16384 || readInt > 16777215) {
                                throw g.k("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(readInt));
                            }
                            break;
                        default:
                    }
                    iVar.e(readShort, 0, readInt);
                }
                aVar.n(false, iVar);
                if (iVar.b() >= 0) {
                    this.f41972c.g(iVar.b());
                }
            }
        }

        private void R(b.a aVar, int i11, byte b11, int i12) {
            if (i11 == 4) {
                long readInt = this.f41970a.readInt() & 2147483647L;
                if (readInt == 0) {
                    throw g.k("windowSizeIncrement was 0", new Object[0]);
                }
                aVar.windowUpdate(i12, readInt);
                return;
            }
            throw g.k("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i11));
        }

        private void a(b.a aVar, int i11, byte b11, int i12) {
            boolean z11 = (b11 & 1) != 0;
            if (!((b11 & 32) != 0)) {
                short readByte = (b11 & 8) != 0 ? (short) (this.f41970a.readByte() & 255) : (short) 0;
                aVar.data(z11, i12, this.f41970a, g.l(i11, b11, readByte));
                this.f41970a.skip(readByte);
                return;
            }
            throw g.k("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
        }

        private void g(b.a aVar, int i11, byte b11, int i12) {
            if (i11 < 8) {
                throw g.k("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i11));
            }
            if (i12 == 0) {
                int readInt = this.f41970a.readInt();
                int readInt2 = this.f41970a.readInt();
                int i13 = i11 - 8;
                nx.a fromHttp2 = nx.a.fromHttp2(readInt2);
                if (fromHttp2 == null) {
                    throw g.k("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(readInt2));
                }
                okio.i iVar = okio.i.f42656d;
                if (i13 > 0) {
                    iVar = this.f41970a.z0(i13);
                }
                aVar.m(readInt, fromHttp2, iVar);
                return;
            }
            throw g.k("TYPE_GOAWAY streamId != 0", new Object[0]);
        }

        private List<nx.d> j(int i11, short s11, byte b11, int i12) {
            a aVar = this.f41971b;
            aVar.f41965e = i11;
            aVar.f41962b = i11;
            aVar.f41966f = s11;
            aVar.f41963c = b11;
            aVar.f41964d = i12;
            this.f41972c.l();
            return this.f41972c.e();
        }

        private void l(b.a aVar, int i11, byte b11, int i12) {
            if (i12 != 0) {
                boolean z11 = (b11 & 1) != 0;
                short readByte = (b11 & 8) != 0 ? (short) (this.f41970a.readByte() & 255) : (short) 0;
                if ((b11 & 32) != 0) {
                    p(aVar, i12);
                    i11 -= 5;
                }
                aVar.l(false, z11, i12, -1, j(g.l(i11, b11, readByte), readByte, b11, i12), e.HTTP_20_HEADERS);
                return;
            }
            throw g.k("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
        }

        private void m(b.a aVar, int i11, byte b11, int i12) {
            if (i11 != 8) {
                throw g.k("TYPE_PING length != 8: %s", Integer.valueOf(i11));
            }
            if (i12 == 0) {
                aVar.ping((b11 & 1) != 0, this.f41970a.readInt(), this.f41970a.readInt());
                return;
            }
            throw g.k("TYPE_PING streamId != 0", new Object[0]);
        }

        private void p(b.a aVar, int i11) {
            int readInt = this.f41970a.readInt();
            aVar.priority(i11, readInt & Integer.MAX_VALUE, (this.f41970a.readByte() & 255) + 1, (Integer.MIN_VALUE & readInt) != 0);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f41970a.close();
        }

        @Override // nx.b
        public boolean y0(b.a aVar) {
            try {
                this.f41970a.m0(9L);
                int m11 = g.m(this.f41970a);
                if (m11 < 0 || m11 > 16384) {
                    throw g.k("FRAME_SIZE_ERROR: %s", Integer.valueOf(m11));
                }
                byte readByte = (byte) (this.f41970a.readByte() & 255);
                byte readByte2 = (byte) (this.f41970a.readByte() & 255);
                int readInt = this.f41970a.readInt() & Integer.MAX_VALUE;
                if (g.f41959a.isLoggable(Level.FINE)) {
                    g.f41959a.fine(b.b(true, readInt, m11, readByte, readByte2));
                }
                switch (readByte) {
                    case 0:
                        a(aVar, m11, readByte2, readInt);
                        break;
                    case 1:
                        l(aVar, m11, readByte2, readInt);
                        break;
                    case 2:
                        C(aVar, m11, readByte2, readInt);
                        break;
                    case 3:
                        J(aVar, m11, readByte2, readInt);
                        break;
                    case 4:
                        L(aVar, m11, readByte2, readInt);
                        break;
                    case 5:
                        D(aVar, m11, readByte2, readInt);
                        break;
                    case 6:
                        m(aVar, m11, readByte2, readInt);
                        break;
                    case 7:
                        g(aVar, m11, readByte2, readInt);
                        break;
                    case 8:
                        R(aVar, m11, readByte2, readInt);
                        break;
                    default:
                        this.f41970a.skip(m11);
                        break;
                }
                return true;
            } catch (IOException unused) {
                return false;
            }
        }
    }

    /* loaded from: classes5.dex */
    static final class d implements nx.c {

        /* renamed from: a  reason: collision with root package name */
        private final okio.g f41973a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f41974b;

        /* renamed from: c  reason: collision with root package name */
        private final okio.f f41975c;

        /* renamed from: d  reason: collision with root package name */
        private final f.b f41976d;

        /* renamed from: e  reason: collision with root package name */
        private int f41977e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f41978f;

        d(okio.g gVar, boolean z11) {
            this.f41973a = gVar;
            this.f41974b = z11;
            okio.f fVar = new okio.f();
            this.f41975c = fVar;
            this.f41976d = new f.b(fVar);
            this.f41977e = 16384;
        }

        private void l(int i11, long j11) {
            while (j11 > 0) {
                int min = (int) Math.min(this.f41977e, j11);
                long j12 = min;
                j11 -= j12;
                g(i11, min, (byte) 9, j11 == 0 ? (byte) 4 : (byte) 0);
                this.f41973a.write(this.f41975c, j12);
            }
        }

        @Override // nx.c
        public synchronized void B0(i iVar) {
            if (!this.f41978f) {
                int i11 = 0;
                g(0, iVar.f() * 6, (byte) 4, (byte) 0);
                while (i11 < 10) {
                    if (iVar.d(i11)) {
                        this.f41973a.E0(i11 == 4 ? 3 : i11 == 7 ? 4 : i11);
                        this.f41973a.x(iVar.a(i11));
                    }
                    i11++;
                }
                this.f41973a.flush();
            } else {
                throw new IOException("closed");
            }
        }

        @Override // nx.c
        public synchronized void E1(boolean z11, boolean z12, int i11, int i12, List<nx.d> list) {
            try {
                if (!z12) {
                    if (!this.f41978f) {
                        j(z11, i11, list);
                    } else {
                        throw new IOException("closed");
                    }
                } else {
                    throw new UnsupportedOperationException();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }

        void a(int i11, byte b11, okio.f fVar, int i12) {
            g(i11, i12, (byte) 0, b11);
            if (i12 > 0) {
                this.f41973a.write(fVar, i12);
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            this.f41978f = true;
            this.f41973a.close();
        }

        @Override // nx.c
        public synchronized void connectionPreface() {
            if (!this.f41978f) {
                if (this.f41974b) {
                    if (g.f41959a.isLoggable(Level.FINE)) {
                        g.f41959a.fine(String.format(">> CONNECTION %s", g.f41960b.n()));
                    }
                    this.f41973a.j0(g.f41960b.E());
                    this.f41973a.flush();
                    return;
                }
                return;
            }
            throw new IOException("closed");
        }

        @Override // nx.c
        public synchronized void data(boolean z11, int i11, okio.f fVar, int i12) {
            if (!this.f41978f) {
                a(i11, z11 ? (byte) 1 : (byte) 0, fVar, i12);
            } else {
                throw new IOException("closed");
            }
        }

        @Override // nx.c
        public synchronized void flush() {
            if (!this.f41978f) {
                this.f41973a.flush();
            } else {
                throw new IOException("closed");
            }
        }

        void g(int i11, int i12, byte b11, byte b12) {
            if (g.f41959a.isLoggable(Level.FINE)) {
                g.f41959a.fine(b.b(false, i11, i12, b11, b12));
            }
            int i13 = this.f41977e;
            if (i12 > i13) {
                throw g.j("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i13), Integer.valueOf(i12));
            }
            if ((Integer.MIN_VALUE & i11) == 0) {
                g.n(this.f41973a, i12);
                this.f41973a.O0(b11 & 255);
                this.f41973a.O0(b12 & 255);
                this.f41973a.x(i11 & Integer.MAX_VALUE);
                return;
            }
            throw g.j("reserved bit set: %s", Integer.valueOf(i11));
        }

        void j(boolean z11, int i11, List<nx.d> list) {
            if (!this.f41978f) {
                this.f41976d.e(list);
                long P0 = this.f41975c.P0();
                int min = (int) Math.min(this.f41977e, P0);
                long j11 = min;
                int i12 = (P0 > j11 ? 1 : (P0 == j11 ? 0 : -1));
                byte b11 = i12 == 0 ? (byte) 4 : (byte) 0;
                if (z11) {
                    b11 = (byte) (b11 | 1);
                }
                g(i11, min, (byte) 1, b11);
                this.f41973a.write(this.f41975c, j11);
                if (i12 > 0) {
                    l(i11, P0 - j11);
                    return;
                }
                return;
            }
            throw new IOException("closed");
        }

        @Override // nx.c
        public synchronized void k(int i11, nx.a aVar) {
            if (!this.f41978f) {
                if (aVar.httpCode != -1) {
                    g(i11, 4, (byte) 3, (byte) 0);
                    this.f41973a.x(aVar.httpCode);
                    this.f41973a.flush();
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                throw new IOException("closed");
            }
        }

        @Override // nx.c
        public int maxDataLength() {
            return this.f41977e;
        }

        @Override // nx.c
        public synchronized void n1(int i11, nx.a aVar, byte[] bArr) {
            if (!this.f41978f) {
                if (aVar.httpCode == -1) {
                    throw g.j("errorCode.httpCode == -1", new Object[0]);
                }
                g(0, bArr.length + 8, (byte) 7, (byte) 0);
                this.f41973a.x(i11);
                this.f41973a.x(aVar.httpCode);
                if (bArr.length > 0) {
                    this.f41973a.j0(bArr);
                }
                this.f41973a.flush();
            } else {
                throw new IOException("closed");
            }
        }

        @Override // nx.c
        public synchronized void ping(boolean z11, int i11, int i12) {
            if (!this.f41978f) {
                g(0, 8, (byte) 6, z11 ? (byte) 1 : (byte) 0);
                this.f41973a.x(i11);
                this.f41973a.x(i12);
                this.f41973a.flush();
            } else {
                throw new IOException("closed");
            }
        }

        @Override // nx.c
        public synchronized void v0(i iVar) {
            if (!this.f41978f) {
                this.f41977e = iVar.c(this.f41977e);
                g(0, 0, (byte) 4, (byte) 1);
                this.f41973a.flush();
            } else {
                throw new IOException("closed");
            }
        }

        @Override // nx.c
        public synchronized void windowUpdate(int i11, long j11) {
            if (this.f41978f) {
                throw new IOException("closed");
            }
            if (j11 == 0 || j11 > 2147483647L) {
                throw g.j("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j11));
            }
            g(i11, 4, (byte) 8, (byte) 0);
            this.f41973a.x((int) j11);
            this.f41973a.flush();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static IllegalArgumentException j(String str, Object... objArr) {
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static IOException k(String str, Object... objArr) {
        throw new IOException(String.format(str, objArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int l(int i11, byte b11, short s11) {
        if ((b11 & 8) != 0) {
            i11--;
        }
        if (s11 <= i11) {
            return (short) (i11 - s11);
        }
        throw k("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s11), Integer.valueOf(i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int m(okio.h hVar) {
        return (hVar.readByte() & 255) | ((hVar.readByte() & 255) << 16) | ((hVar.readByte() & 255) << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void n(okio.g gVar, int i11) {
        gVar.O0((i11 >>> 16) & 255);
        gVar.O0((i11 >>> 8) & 255);
        gVar.O0(i11 & 255);
    }

    @Override // nx.j
    public nx.b a(okio.h hVar, boolean z11) {
        return new c(hVar, 4096, z11);
    }

    @Override // nx.j
    public nx.c b(okio.g gVar, boolean z11) {
        return new d(gVar, z11);
    }
}