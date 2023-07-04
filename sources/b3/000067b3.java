package ea;

import android.os.Build;
import android.os.StrictMode;
import ch.qos.logback.core.CoreConstants;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class a implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    private final File f25024a;

    /* renamed from: b  reason: collision with root package name */
    private final File f25025b;

    /* renamed from: c  reason: collision with root package name */
    private final File f25026c;

    /* renamed from: d  reason: collision with root package name */
    private final File f25027d;

    /* renamed from: e  reason: collision with root package name */
    private final int f25028e;

    /* renamed from: f  reason: collision with root package name */
    private long f25029f;

    /* renamed from: g  reason: collision with root package name */
    private final int f25030g;

    /* renamed from: i  reason: collision with root package name */
    private Writer f25032i;

    /* renamed from: k  reason: collision with root package name */
    private int f25034k;

    /* renamed from: h  reason: collision with root package name */
    private long f25031h = 0;

    /* renamed from: j  reason: collision with root package name */
    private final LinkedHashMap<String, d> f25033j = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: l  reason: collision with root package name */
    private long f25035l = 0;

    /* renamed from: m  reason: collision with root package name */
    final ThreadPoolExecutor f25036m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b(null));

    /* renamed from: n  reason: collision with root package name */
    private final Callable<Void> f25037n = new CallableC0482a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ea.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class CallableC0482a implements Callable<Void> {
        CallableC0482a() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() {
            synchronized (a.this) {
                if (a.this.f25032i == null) {
                    return null;
                }
                a.this.R0();
                if (a.this.C0()) {
                    a.this.J0();
                    a.this.f25034k = 0;
                }
                return null;
            }
        }
    }

    /* loaded from: classes.dex */
    private static final class b implements ThreadFactory {
        private b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }

        /* synthetic */ b(CallableC0482a callableC0482a) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public final class c {

        /* renamed from: a  reason: collision with root package name */
        private final d f25039a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean[] f25040b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f25041c;

        /* synthetic */ c(a aVar, d dVar, CallableC0482a callableC0482a) {
            this(dVar);
        }

        public void a() {
            a.this.R(this, false);
        }

        public void b() {
            if (this.f25041c) {
                return;
            }
            try {
                a();
            } catch (IOException unused) {
            }
        }

        public void e() {
            a.this.R(this, true);
            this.f25041c = true;
        }

        public File f(int i11) {
            File k11;
            synchronized (a.this) {
                if (this.f25039a.f25048f == this) {
                    if (!this.f25039a.f25047e) {
                        this.f25040b[i11] = true;
                    }
                    k11 = this.f25039a.k(i11);
                    a.this.f25024a.mkdirs();
                } else {
                    throw new IllegalStateException();
                }
            }
            return k11;
        }

        private c(d dVar) {
            this.f25039a = dVar;
            this.f25040b = dVar.f25047e ? null : new boolean[a.this.f25030g];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class d {

        /* renamed from: a  reason: collision with root package name */
        private final String f25043a;

        /* renamed from: b  reason: collision with root package name */
        private final long[] f25044b;

        /* renamed from: c  reason: collision with root package name */
        File[] f25045c;

        /* renamed from: d  reason: collision with root package name */
        File[] f25046d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f25047e;

        /* renamed from: f  reason: collision with root package name */
        private c f25048f;

        /* renamed from: g  reason: collision with root package name */
        private long f25049g;

        /* synthetic */ d(a aVar, String str, CallableC0482a callableC0482a) {
            this(str);
        }

        private IOException m(String[] strArr) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void n(String[] strArr) {
            if (strArr.length == a.this.f25030g) {
                for (int i11 = 0; i11 < strArr.length; i11++) {
                    try {
                        this.f25044b[i11] = Long.parseLong(strArr[i11]);
                    } catch (NumberFormatException unused) {
                        throw m(strArr);
                    }
                }
                return;
            }
            throw m(strArr);
        }

        public File j(int i11) {
            return this.f25045c[i11];
        }

        public File k(int i11) {
            return this.f25046d[i11];
        }

        public String l() {
            long[] jArr;
            StringBuilder sb2 = new StringBuilder();
            for (long j11 : this.f25044b) {
                sb2.append(' ');
                sb2.append(j11);
            }
            return sb2.toString();
        }

        private d(String str) {
            this.f25043a = str;
            this.f25044b = new long[a.this.f25030g];
            this.f25045c = new File[a.this.f25030g];
            this.f25046d = new File[a.this.f25030g];
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append(CoreConstants.DOT);
            int length = sb2.length();
            for (int i11 = 0; i11 < a.this.f25030g; i11++) {
                sb2.append(i11);
                this.f25045c[i11] = new File(a.this.f25024a, sb2.toString());
                sb2.append(".tmp");
                this.f25046d[i11] = new File(a.this.f25024a, sb2.toString());
                sb2.setLength(length);
            }
        }
    }

    /* loaded from: classes.dex */
    public final class e {

        /* renamed from: a  reason: collision with root package name */
        private final File[] f25051a;

        /* synthetic */ e(a aVar, String str, long j11, File[] fileArr, long[] jArr, CallableC0482a callableC0482a) {
            this(aVar, str, j11, fileArr, jArr);
        }

        public File a(int i11) {
            return this.f25051a[i11];
        }

        private e(a aVar, String str, long j11, File[] fileArr, long[] jArr) {
            this.f25051a = fileArr;
        }
    }

    private a(File file, int i11, int i12, long j11) {
        this.f25024a = file;
        this.f25028e = i11;
        this.f25025b = new File(file, "journal");
        this.f25026c = new File(file, "journal.tmp");
        this.f25027d = new File(file, "journal.bkp");
        this.f25030g = i12;
        this.f25029f = j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean C0() {
        int i11 = this.f25034k;
        return i11 >= 2000 && i11 >= this.f25033j.size();
    }

    public static a D0(File file, int i11, int i12, long j11) {
        if (j11 > 0) {
            if (i12 > 0) {
                File file2 = new File(file, "journal.bkp");
                if (file2.exists()) {
                    File file3 = new File(file, "journal");
                    if (file3.exists()) {
                        file2.delete();
                    } else {
                        Q0(file2, file3, false);
                    }
                }
                a aVar = new a(file, i11, i12, j11);
                if (aVar.f25025b.exists()) {
                    try {
                        aVar.G0();
                        aVar.F0();
                        return aVar;
                    } catch (IOException e11) {
                        PrintStream printStream = System.out;
                        printStream.println("DiskLruCache " + file + " is corrupt: " + e11.getMessage() + ", removing");
                        aVar.a0();
                    }
                }
                file.mkdirs();
                a aVar2 = new a(file, i11, i12, j11);
                aVar2.J0();
                return aVar2;
            }
            throw new IllegalArgumentException("valueCount <= 0");
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    private void F0() {
        e0(this.f25026c);
        Iterator<d> it2 = this.f25033j.values().iterator();
        while (it2.hasNext()) {
            d next = it2.next();
            int i11 = 0;
            if (next.f25048f != null) {
                next.f25048f = null;
                while (i11 < this.f25030g) {
                    e0(next.j(i11));
                    e0(next.k(i11));
                    i11++;
                }
                it2.remove();
            } else {
                while (i11 < this.f25030g) {
                    this.f25031h += next.f25044b[i11];
                    i11++;
                }
            }
        }
    }

    private void G0() {
        ea.b bVar = new ea.b(new FileInputStream(this.f25025b), ea.c.f25058a);
        try {
            String l11 = bVar.l();
            String l12 = bVar.l();
            String l13 = bVar.l();
            String l14 = bVar.l();
            String l15 = bVar.l();
            if (!"libcore.io.DiskLruCache".equals(l11) || !"1".equals(l12) || !Integer.toString(this.f25028e).equals(l13) || !Integer.toString(this.f25030g).equals(l14) || !"".equals(l15)) {
                throw new IOException("unexpected journal header: [" + l11 + ", " + l12 + ", " + l14 + ", " + l15 + "]");
            }
            int i11 = 0;
            while (true) {
                try {
                    I0(bVar.l());
                    i11++;
                } catch (EOFException unused) {
                    this.f25034k = i11 - this.f25033j.size();
                    if (bVar.j()) {
                        J0();
                    } else {
                        this.f25032i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f25025b, true), ea.c.f25058a));
                    }
                    ea.c.a(bVar);
                    return;
                }
            }
        } catch (Throwable th2) {
            ea.c.a(bVar);
            throw th2;
        }
    }

    private void I0(String str) {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i11 = indexOf + 1;
            int indexOf2 = str.indexOf(32, i11);
            if (indexOf2 == -1) {
                substring = str.substring(i11);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f25033j.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i11, indexOf2);
            }
            d dVar = this.f25033j.get(substring);
            if (dVar == null) {
                dVar = new d(this, substring, null);
                this.f25033j.put(substring, dVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                dVar.f25047e = true;
                dVar.f25048f = null;
                dVar.n(split);
                return;
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                dVar.f25048f = new c(this, dVar, null);
                return;
            } else if (indexOf2 == -1 && indexOf == 4 && str.startsWith("READ")) {
                return;
            } else {
                throw new IOException("unexpected journal line: " + str);
            }
        }
        throw new IOException("unexpected journal line: " + str);
    }

    private void J() {
        if (this.f25032i == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void J0() {
        Writer writer = this.f25032i;
        if (writer != null) {
            L(writer);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f25026c), ea.c.f25058a));
        bufferedWriter.write("libcore.io.DiskLruCache");
        bufferedWriter.write("\n");
        bufferedWriter.write("1");
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.f25028e));
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.f25030g));
        bufferedWriter.write("\n");
        bufferedWriter.write("\n");
        for (d dVar : this.f25033j.values()) {
            if (dVar.f25048f != null) {
                bufferedWriter.write("DIRTY " + dVar.f25043a + '\n');
            } else {
                bufferedWriter.write("CLEAN " + dVar.f25043a + dVar.l() + '\n');
            }
        }
        L(bufferedWriter);
        if (this.f25025b.exists()) {
            Q0(this.f25025b, this.f25027d, true);
        }
        Q0(this.f25026c, this.f25025b, false);
        this.f25027d.delete();
        this.f25032i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f25025b, true), ea.c.f25058a));
    }

    private static void L(Writer writer) {
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    private static void Q0(File file, File file2, boolean z11) {
        if (z11) {
            e0(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void R(c cVar, boolean z11) {
        d dVar = cVar.f25039a;
        if (dVar.f25048f == cVar) {
            if (z11 && !dVar.f25047e) {
                for (int i11 = 0; i11 < this.f25030g; i11++) {
                    if (cVar.f25040b[i11]) {
                        if (!dVar.k(i11).exists()) {
                            cVar.a();
                            return;
                        }
                    } else {
                        cVar.a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i11);
                    }
                }
            }
            for (int i12 = 0; i12 < this.f25030g; i12++) {
                File k11 = dVar.k(i12);
                if (z11) {
                    if (k11.exists()) {
                        File j11 = dVar.j(i12);
                        k11.renameTo(j11);
                        long j12 = dVar.f25044b[i12];
                        long length = j11.length();
                        dVar.f25044b[i12] = length;
                        this.f25031h = (this.f25031h - j12) + length;
                    }
                } else {
                    e0(k11);
                }
            }
            this.f25034k++;
            dVar.f25048f = null;
            if (dVar.f25047e | z11) {
                dVar.f25047e = true;
                this.f25032i.append((CharSequence) "CLEAN");
                this.f25032i.append(' ');
                this.f25032i.append((CharSequence) dVar.f25043a);
                this.f25032i.append((CharSequence) dVar.l());
                this.f25032i.append('\n');
                if (z11) {
                    long j13 = this.f25035l;
                    this.f25035l = 1 + j13;
                    dVar.f25049g = j13;
                }
            } else {
                this.f25033j.remove(dVar.f25043a);
                this.f25032i.append((CharSequence) "REMOVE");
                this.f25032i.append(' ');
                this.f25032i.append((CharSequence) dVar.f25043a);
                this.f25032i.append('\n');
            }
            t0(this.f25032i);
            if (this.f25031h > this.f25029f || C0()) {
                this.f25036m.submit(this.f25037n);
            }
            return;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R0() {
        while (this.f25031h > this.f25029f) {
            P0(this.f25033j.entrySet().iterator().next().getKey());
        }
    }

    private static void e0(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private synchronized c p0(String str, long j11) {
        J();
        d dVar = this.f25033j.get(str);
        if (j11 == -1 || (dVar != null && dVar.f25049g == j11)) {
            if (dVar != null) {
                if (dVar.f25048f != null) {
                    return null;
                }
            } else {
                dVar = new d(this, str, null);
                this.f25033j.put(str, dVar);
            }
            c cVar = new c(this, dVar, null);
            dVar.f25048f = cVar;
            this.f25032i.append((CharSequence) "DIRTY");
            this.f25032i.append(' ');
            this.f25032i.append((CharSequence) str);
            this.f25032i.append('\n');
            t0(this.f25032i);
            return cVar;
        }
        return null;
    }

    private static void t0(Writer writer) {
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public synchronized boolean P0(String str) {
        J();
        d dVar = this.f25033j.get(str);
        if (dVar != null && dVar.f25048f == null) {
            for (int i11 = 0; i11 < this.f25030g; i11++) {
                File j11 = dVar.j(i11);
                if (j11.exists() && !j11.delete()) {
                    throw new IOException("failed to delete " + j11);
                }
                this.f25031h -= dVar.f25044b[i11];
                dVar.f25044b[i11] = 0;
            }
            this.f25034k++;
            this.f25032i.append((CharSequence) "REMOVE");
            this.f25032i.append(' ');
            this.f25032i.append((CharSequence) str);
            this.f25032i.append('\n');
            this.f25033j.remove(str);
            if (C0()) {
                this.f25036m.submit(this.f25037n);
            }
            return true;
        }
        return false;
    }

    public void a0() {
        close();
        ea.c.b(this.f25024a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (this.f25032i == null) {
            return;
        }
        Iterator it2 = new ArrayList(this.f25033j.values()).iterator();
        while (it2.hasNext()) {
            d dVar = (d) it2.next();
            if (dVar.f25048f != null) {
                dVar.f25048f.a();
            }
        }
        R0();
        L(this.f25032i);
        this.f25032i = null;
    }

    public c n0(String str) {
        return p0(str, -1L);
    }

    public synchronized e u0(String str) {
        J();
        d dVar = this.f25033j.get(str);
        if (dVar == null) {
            return null;
        }
        if (dVar.f25047e) {
            for (File file : dVar.f25045c) {
                if (!file.exists()) {
                    return null;
                }
            }
            this.f25034k++;
            this.f25032i.append((CharSequence) "READ");
            this.f25032i.append(' ');
            this.f25032i.append((CharSequence) str);
            this.f25032i.append('\n');
            if (C0()) {
                this.f25036m.submit(this.f25037n);
            }
            return new e(this, str, dVar.f25049g, dVar.f25045c, dVar.f25044b, null);
        }
        return null;
    }
}