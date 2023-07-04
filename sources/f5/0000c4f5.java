package zl;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class e implements Closeable {

    /* renamed from: g  reason: collision with root package name */
    private static final Logger f60499g = Logger.getLogger(e.class.getName());

    /* renamed from: a  reason: collision with root package name */
    private final RandomAccessFile f60500a;

    /* renamed from: b  reason: collision with root package name */
    int f60501b;

    /* renamed from: c  reason: collision with root package name */
    private int f60502c;

    /* renamed from: d  reason: collision with root package name */
    private b f60503d;

    /* renamed from: e  reason: collision with root package name */
    private b f60504e;

    /* renamed from: f  reason: collision with root package name */
    private final byte[] f60505f = new byte[16];

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements d {

        /* renamed from: a  reason: collision with root package name */
        boolean f60506a = true;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StringBuilder f60507b;

        a(e eVar, StringBuilder sb2) {
            this.f60507b = sb2;
        }

        @Override // zl.e.d
        public void a(InputStream inputStream, int i11) {
            if (this.f60506a) {
                this.f60506a = false;
            } else {
                this.f60507b.append(", ");
            }
            this.f60507b.append(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: c  reason: collision with root package name */
        static final b f60508c = new b(0, 0);

        /* renamed from: a  reason: collision with root package name */
        final int f60509a;

        /* renamed from: b  reason: collision with root package name */
        final int f60510b;

        b(int i11, int i12) {
            this.f60509a = i11;
            this.f60510b = i12;
        }

        public String toString() {
            return b.class.getSimpleName() + "[position = " + this.f60509a + ", length = " + this.f60510b + "]";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public final class c extends InputStream {

        /* renamed from: a  reason: collision with root package name */
        private int f60511a;

        /* renamed from: b  reason: collision with root package name */
        private int f60512b;

        /* synthetic */ c(e eVar, b bVar, a aVar) {
            this(bVar);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i11, int i12) {
            e.a0(bArr, "buffer");
            if ((i11 | i12) >= 0 && i12 <= bArr.length - i11) {
                int i13 = this.f60512b;
                if (i13 > 0) {
                    if (i12 > i13) {
                        i12 = i13;
                    }
                    e.this.D0(this.f60511a, bArr, i11, i12);
                    this.f60511a = e.this.J0(this.f60511a + i12);
                    this.f60512b -= i12;
                    return i12;
                }
                return -1;
            }
            throw new ArrayIndexOutOfBoundsException();
        }

        private c(b bVar) {
            this.f60511a = e.this.J0(bVar.f60509a + 4);
            this.f60512b = bVar.f60510b;
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f60512b == 0) {
                return -1;
            }
            e.this.f60500a.seek(this.f60511a);
            int read = e.this.f60500a.read();
            this.f60511a = e.this.J0(this.f60511a + 1);
            this.f60512b--;
            return read;
        }
    }

    /* loaded from: classes3.dex */
    public interface d {
        void a(InputStream inputStream, int i11);
    }

    public e(File file) {
        if (!file.exists()) {
            L(file);
        }
        this.f60500a = e0(file);
        p0();
    }

    private void D(int i11) {
        int i12 = i11 + 4;
        int u02 = u0();
        if (u02 >= i12) {
            return;
        }
        int i13 = this.f60501b;
        do {
            u02 += i13;
            i13 <<= 1;
        } while (u02 < i12);
        G0(i13);
        b bVar = this.f60504e;
        int J0 = J0(bVar.f60509a + 4 + bVar.f60510b);
        if (J0 < this.f60503d.f60509a) {
            FileChannel channel = this.f60500a.getChannel();
            channel.position(this.f60501b);
            long j11 = J0 - 4;
            if (channel.transferTo(16L, j11, channel) != j11) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i14 = this.f60504e.f60509a;
        int i15 = this.f60503d.f60509a;
        if (i14 < i15) {
            int i16 = (this.f60501b + i14) - 16;
            P0(i13, this.f60502c, i15, i16);
            this.f60504e = new b(i16, this.f60504e.f60510b);
        } else {
            P0(i13, this.f60502c, i15, i14);
        }
        this.f60501b = i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D0(int i11, byte[] bArr, int i12, int i13) {
        int J0 = J0(i11);
        int i14 = J0 + i13;
        int i15 = this.f60501b;
        if (i14 <= i15) {
            this.f60500a.seek(J0);
            this.f60500a.readFully(bArr, i12, i13);
            return;
        }
        int i16 = i15 - J0;
        this.f60500a.seek(J0);
        this.f60500a.readFully(bArr, i12, i16);
        this.f60500a.seek(16L);
        this.f60500a.readFully(bArr, i12 + i16, i13 - i16);
    }

    private void F0(int i11, byte[] bArr, int i12, int i13) {
        int J0 = J0(i11);
        int i14 = J0 + i13;
        int i15 = this.f60501b;
        if (i14 <= i15) {
            this.f60500a.seek(J0);
            this.f60500a.write(bArr, i12, i13);
            return;
        }
        int i16 = i15 - J0;
        this.f60500a.seek(J0);
        this.f60500a.write(bArr, i12, i16);
        this.f60500a.seek(16L);
        this.f60500a.write(bArr, i12 + i16, i13 - i16);
    }

    private void G0(int i11) {
        this.f60500a.setLength(i11);
        this.f60500a.getChannel().force(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int J0(int i11) {
        int i12 = this.f60501b;
        return i11 < i12 ? i11 : (i11 + 16) - i12;
    }

    private static void L(File file) {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile e02 = e0(file2);
        try {
            e02.setLength(ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF);
            e02.seek(0L);
            byte[] bArr = new byte[16];
            R0(bArr, 4096, 0, 0, 0);
            e02.write(bArr);
            e02.close();
            if (!file2.renameTo(file)) {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th2) {
            e02.close();
            throw th2;
        }
    }

    private void P0(int i11, int i12, int i13, int i14) {
        R0(this.f60505f, i11, i12, i13, i14);
        this.f60500a.seek(0L);
        this.f60500a.write(this.f60505f);
    }

    private static void Q0(byte[] bArr, int i11, int i12) {
        bArr[i11] = (byte) (i12 >> 24);
        bArr[i11 + 1] = (byte) (i12 >> 16);
        bArr[i11 + 2] = (byte) (i12 >> 8);
        bArr[i11 + 3] = (byte) i12;
    }

    private static void R0(byte[] bArr, int... iArr) {
        int i11 = 0;
        for (int i12 : iArr) {
            Q0(bArr, i11, i12);
            i11 += 4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> T a0(T t11, String str) {
        Objects.requireNonNull(t11, str);
        return t11;
    }

    private static RandomAccessFile e0(File file) {
        return new RandomAccessFile(file, "rwd");
    }

    private b n0(int i11) {
        if (i11 == 0) {
            return b.f60508c;
        }
        this.f60500a.seek(i11);
        return new b(i11, this.f60500a.readInt());
    }

    private void p0() {
        this.f60500a.seek(0L);
        this.f60500a.readFully(this.f60505f);
        int t02 = t0(this.f60505f, 0);
        this.f60501b = t02;
        if (t02 <= this.f60500a.length()) {
            this.f60502c = t0(this.f60505f, 4);
            int t03 = t0(this.f60505f, 8);
            int t04 = t0(this.f60505f, 12);
            this.f60503d = n0(t03);
            this.f60504e = n0(t04);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f60501b + ", Actual length: " + this.f60500a.length());
    }

    private static int t0(byte[] bArr, int i11) {
        return ((bArr[i11] & 255) << 24) + ((bArr[i11 + 1] & 255) << 16) + ((bArr[i11 + 2] & 255) << 8) + (bArr[i11 + 3] & 255);
    }

    private int u0() {
        return this.f60501b - I0();
    }

    public synchronized void C() {
        P0(4096, 0, 0, 0);
        this.f60502c = 0;
        b bVar = b.f60508c;
        this.f60503d = bVar;
        this.f60504e = bVar;
        if (this.f60501b > 4096) {
            G0(4096);
        }
        this.f60501b = 4096;
    }

    public synchronized void C0() {
        if (!R()) {
            if (this.f60502c == 1) {
                C();
            } else {
                b bVar = this.f60503d;
                int J0 = J0(bVar.f60509a + 4 + bVar.f60510b);
                D0(J0, this.f60505f, 0, 4);
                int t02 = t0(this.f60505f, 0);
                P0(this.f60501b, this.f60502c - 1, J0, this.f60504e.f60509a);
                this.f60502c--;
                this.f60503d = new b(J0, t02);
            }
        } else {
            throw new NoSuchElementException();
        }
    }

    public int I0() {
        if (this.f60502c == 0) {
            return 16;
        }
        b bVar = this.f60504e;
        int i11 = bVar.f60509a;
        int i12 = this.f60503d.f60509a;
        if (i11 >= i12) {
            return (i11 - i12) + 4 + bVar.f60510b + 16;
        }
        return (((i11 + 4) + bVar.f60510b) + this.f60501b) - i12;
    }

    public synchronized void J(d dVar) {
        int i11 = this.f60503d.f60509a;
        for (int i12 = 0; i12 < this.f60502c; i12++) {
            b n02 = n0(i11);
            dVar.a(new c(this, n02, null), n02.f60510b);
            i11 = J0(n02.f60509a + 4 + n02.f60510b);
        }
    }

    public synchronized boolean R() {
        return this.f60502c == 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f60500a.close();
    }

    public void m(byte[] bArr) {
        p(bArr, 0, bArr.length);
    }

    public synchronized void p(byte[] bArr, int i11, int i12) {
        int J0;
        a0(bArr, "buffer");
        if ((i11 | i12) >= 0 && i12 <= bArr.length - i11) {
            D(i12);
            boolean R = R();
            if (R) {
                J0 = 16;
            } else {
                b bVar = this.f60504e;
                J0 = J0(bVar.f60509a + 4 + bVar.f60510b);
            }
            b bVar2 = new b(J0, i12);
            Q0(this.f60505f, 0, i12);
            F0(bVar2.f60509a, this.f60505f, 0, 4);
            F0(bVar2.f60509a + 4, bArr, i11, i12);
            P0(this.f60501b, this.f60502c + 1, R ? bVar2.f60509a : this.f60503d.f60509a, bVar2.f60509a);
            this.f60504e = bVar2;
            this.f60502c++;
            if (R) {
                this.f60503d = bVar2;
            }
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(e.class.getSimpleName());
        sb2.append('[');
        sb2.append("fileLength=");
        sb2.append(this.f60501b);
        sb2.append(", size=");
        sb2.append(this.f60502c);
        sb2.append(", first=");
        sb2.append(this.f60503d);
        sb2.append(", last=");
        sb2.append(this.f60504e);
        sb2.append(", element lengths=[");
        try {
            J(new a(this, sb2));
        } catch (IOException e11) {
            f60499g.log(Level.WARNING, "read error", (Throwable) e11);
        }
        sb2.append("]]");
        return sb2.toString();
    }
}