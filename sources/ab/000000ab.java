package ak;

import android.os.SystemClock;
import com.google.android.exoplayer2.upstream.Loader;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.ConcurrentModificationException;

/* loaded from: classes3.dex */
public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f440a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static final Object f441b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static boolean f442c = false;

    /* renamed from: d  reason: collision with root package name */
    private static long f443d = 0;

    /* renamed from: e  reason: collision with root package name */
    private static String f444e = "time.android.com";

    /* loaded from: classes3.dex */
    public interface b {
        void a(IOException iOException);

        void b();
    }

    /* loaded from: classes3.dex */
    private static final class c implements Loader.b<Loader.e> {

        /* renamed from: a  reason: collision with root package name */
        private final b f445a;

        public c(b bVar) {
            this.f445a = bVar;
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        public void i(Loader.e eVar, long j11, long j12, boolean z11) {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        public void j(Loader.e eVar, long j11, long j12) {
            if (this.f445a != null) {
                if (!b0.k()) {
                    this.f445a.a(new IOException(new ConcurrentModificationException()));
                } else {
                    this.f445a.b();
                }
            }
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        public Loader.c n(Loader.e eVar, long j11, long j12, IOException iOException, int i11) {
            b bVar = this.f445a;
            if (bVar != null) {
                bVar.a(iOException);
            }
            return Loader.f14597e;
        }
    }

    /* loaded from: classes3.dex */
    private static final class d implements Loader.e {
        private d() {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.e
        public void a() {
            synchronized (b0.f440a) {
                synchronized (b0.f441b) {
                    if (b0.f442c) {
                        return;
                    }
                    long e11 = b0.e();
                    synchronized (b0.f441b) {
                        long unused = b0.f443d = e11;
                        boolean unused2 = b0.f442c = true;
                    }
                }
            }
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.e
        public void b() {
        }
    }

    static /* synthetic */ long e() {
        return l();
    }

    private static void g(byte b11, byte b12, int i11, long j11) {
        if (b11 == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if (b12 != 4 && b12 != 5) {
            StringBuilder sb2 = new StringBuilder(26);
            sb2.append("SNTP: Untrusted mode: ");
            sb2.append((int) b12);
            throw new IOException(sb2.toString());
        } else if (i11 != 0 && i11 <= 15) {
            if (j11 == 0) {
                throw new IOException("SNTP: Zero transmitTime");
            }
        } else {
            StringBuilder sb3 = new StringBuilder(36);
            sb3.append("SNTP: Untrusted stratum: ");
            sb3.append(i11);
            throw new IOException(sb3.toString());
        }
    }

    public static long h() {
        long j11;
        synchronized (f441b) {
            j11 = f442c ? f443d : -9223372036854775807L;
        }
        return j11;
    }

    public static String i() {
        String str;
        synchronized (f441b) {
            str = f444e;
        }
        return str;
    }

    public static void j(Loader loader, b bVar) {
        if (k()) {
            if (bVar != null) {
                bVar.b();
                return;
            }
            return;
        }
        if (loader == null) {
            loader = new Loader("SntpClient");
        }
        loader.n(new d(), new c(bVar), 1);
    }

    public static boolean k() {
        boolean z11;
        synchronized (f441b) {
            z11 = f442c;
        }
        return z11;
    }

    private static long l() {
        InetAddress byName = InetAddress.getByName(i());
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            datagramSocket.setSoTimeout(10000);
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, 123);
            bArr[0] = 27;
            long currentTimeMillis = System.currentTimeMillis();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            o(bArr, 40, currentTimeMillis);
            datagramSocket.send(datagramPacket);
            datagramSocket.receive(new DatagramPacket(bArr, 48));
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            long j11 = currentTimeMillis + (elapsedRealtime2 - elapsedRealtime);
            long n11 = n(bArr, 24);
            long n12 = n(bArr, 32);
            long n13 = n(bArr, 40);
            g((byte) ((bArr[0] >> 6) & 3), (byte) (bArr[0] & 7), bArr[1] & 255, n13);
            long j12 = (j11 + (((n12 - n11) + (n13 - j11)) / 2)) - elapsedRealtime2;
            datagramSocket.close();
            return j12;
        } catch (Throwable th2) {
            try {
                datagramSocket.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private static long m(byte[] bArr, int i11) {
        int i12 = bArr[i11];
        int i13 = bArr[i11 + 1];
        int i14 = bArr[i11 + 2];
        int i15 = bArr[i11 + 3];
        if ((i12 & 128) == 128) {
            i12 = (i12 & 127) + 128;
        }
        if ((i13 & 128) == 128) {
            i13 = (i13 & 127) + 128;
        }
        if ((i14 & 128) == 128) {
            i14 = (i14 & 127) + 128;
        }
        if ((i15 & 128) == 128) {
            i15 = (i15 & 127) + 128;
        }
        return (i12 << 24) + (i13 << 16) + (i14 << 8) + i15;
    }

    private static long n(byte[] bArr, int i11) {
        long m11 = m(bArr, i11);
        long m12 = m(bArr, i11 + 4);
        if (m11 == 0 && m12 == 0) {
            return 0L;
        }
        return ((m11 - 2208988800L) * 1000) + ((m12 * 1000) / 4294967296L);
    }

    private static void o(byte[] bArr, int i11, long j11) {
        if (j11 == 0) {
            Arrays.fill(bArr, i11, i11 + 8, (byte) 0);
            return;
        }
        long j12 = j11 / 1000;
        long j13 = j12 + 2208988800L;
        int i12 = i11 + 1;
        bArr[i11] = (byte) (j13 >> 24);
        int i13 = i12 + 1;
        bArr[i12] = (byte) (j13 >> 16);
        int i14 = i13 + 1;
        bArr[i13] = (byte) (j13 >> 8);
        int i15 = i14 + 1;
        bArr[i14] = (byte) (j13 >> 0);
        long j14 = ((j11 - (j12 * 1000)) * 4294967296L) / 1000;
        int i16 = i15 + 1;
        bArr[i15] = (byte) (j14 >> 24);
        int i17 = i16 + 1;
        bArr[i16] = (byte) (j14 >> 16);
        bArr[i17] = (byte) (j14 >> 8);
        bArr[i17 + 1] = (byte) (Math.random() * 255.0d);
    }
}