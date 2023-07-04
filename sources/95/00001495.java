package com.android.volley.toolbox;

import android.os.SystemClock;
import android.text.TextUtils;
import com.android.volley.a;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class e implements com.android.volley.a {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, a> f10328a;

    /* renamed from: b  reason: collision with root package name */
    private long f10329b;

    /* renamed from: c  reason: collision with root package name */
    private final c f10330c;

    /* renamed from: d  reason: collision with root package name */
    private final int f10331d;

    /* loaded from: classes.dex */
    public interface c {
        File get();
    }

    public e(c cVar, int i11) {
        this.f10328a = new LinkedHashMap(16, 0.75f, true);
        this.f10329b = 0L;
        this.f10330c = cVar;
        this.f10331d = i11;
    }

    private String f(String str) {
        int length = str.length() / 2;
        String valueOf = String.valueOf(str.substring(0, length).hashCode());
        return valueOf + String.valueOf(str.substring(length).hashCode());
    }

    private void g() {
        if (this.f10330c.get().exists()) {
            return;
        }
        com.android.volley.n.b("Re-initializing cache after external clearing.", new Object[0]);
        this.f10328a.clear();
        this.f10329b = 0L;
        initialize();
    }

    private void h() {
        if (this.f10329b < this.f10331d) {
            return;
        }
        if (com.android.volley.n.f10307b) {
            com.android.volley.n.e("Pruning old cache entries.", new Object[0]);
        }
        long j11 = this.f10329b;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Iterator<Map.Entry<String, a>> it2 = this.f10328a.entrySet().iterator();
        int i11 = 0;
        while (it2.hasNext()) {
            a value = it2.next().getValue();
            if (e(value.f10333b).delete()) {
                this.f10329b -= value.f10332a;
            } else {
                String str = value.f10333b;
                com.android.volley.n.b("Could not delete cache entry for key=%s, filename=%s", str, f(str));
            }
            it2.remove();
            i11++;
            if (((float) this.f10329b) < this.f10331d * 0.9f) {
                break;
            }
        }
        if (com.android.volley.n.f10307b) {
            com.android.volley.n.e("pruned %d files, %d bytes, %d ms", Integer.valueOf(i11), Long.valueOf(this.f10329b - j11), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
        }
    }

    private void i(String str, a aVar) {
        if (!this.f10328a.containsKey(str)) {
            this.f10329b += aVar.f10332a;
        } else {
            this.f10329b += aVar.f10332a - this.f10328a.get(str).f10332a;
        }
        this.f10328a.put(str, aVar);
    }

    private static int j(InputStream inputStream) {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    static List<com.android.volley.e> k(b bVar) {
        int l11 = l(bVar);
        if (l11 >= 0) {
            List<com.android.volley.e> emptyList = l11 == 0 ? Collections.emptyList() : new ArrayList<>();
            for (int i11 = 0; i11 < l11; i11++) {
                emptyList.add(new com.android.volley.e(n(bVar).intern(), n(bVar).intern()));
            }
            return emptyList;
        }
        throw new IOException("readHeaderList size=" + l11);
    }

    static int l(InputStream inputStream) {
        return (j(inputStream) << 24) | (j(inputStream) << 0) | 0 | (j(inputStream) << 8) | (j(inputStream) << 16);
    }

    static long m(InputStream inputStream) {
        return ((j(inputStream) & 255) << 0) | 0 | ((j(inputStream) & 255) << 8) | ((j(inputStream) & 255) << 16) | ((j(inputStream) & 255) << 24) | ((j(inputStream) & 255) << 32) | ((j(inputStream) & 255) << 40) | ((j(inputStream) & 255) << 48) | ((255 & j(inputStream)) << 56);
    }

    static String n(b bVar) {
        return new String(q(bVar, m(bVar)), "UTF-8");
    }

    private void p(String str) {
        a remove = this.f10328a.remove(str);
        if (remove != null) {
            this.f10329b -= remove.f10332a;
        }
    }

    static byte[] q(b bVar, long j11) {
        long a11 = bVar.a();
        if (j11 >= 0 && j11 <= a11) {
            int i11 = (int) j11;
            if (i11 == j11) {
                byte[] bArr = new byte[i11];
                new DataInputStream(bVar).readFully(bArr);
                return bArr;
            }
        }
        throw new IOException("streamToBytes length=" + j11 + ", maxLength=" + a11);
    }

    static void r(List<com.android.volley.e> list, OutputStream outputStream) {
        if (list != null) {
            s(outputStream, list.size());
            for (com.android.volley.e eVar : list) {
                u(outputStream, eVar.a());
                u(outputStream, eVar.b());
            }
            return;
        }
        s(outputStream, 0);
    }

    static void s(OutputStream outputStream, int i11) {
        outputStream.write((i11 >> 0) & 255);
        outputStream.write((i11 >> 8) & 255);
        outputStream.write((i11 >> 16) & 255);
        outputStream.write((i11 >> 24) & 255);
    }

    static void t(OutputStream outputStream, long j11) {
        outputStream.write((byte) (j11 >>> 0));
        outputStream.write((byte) (j11 >>> 8));
        outputStream.write((byte) (j11 >>> 16));
        outputStream.write((byte) (j11 >>> 24));
        outputStream.write((byte) (j11 >>> 32));
        outputStream.write((byte) (j11 >>> 40));
        outputStream.write((byte) (j11 >>> 48));
        outputStream.write((byte) (j11 >>> 56));
    }

    static void u(OutputStream outputStream, String str) {
        byte[] bytes = str.getBytes("UTF-8");
        t(outputStream, bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }

    @Override // com.android.volley.a
    public synchronized void a(String str, boolean z11) {
        a.C0196a c0196a = get(str);
        if (c0196a != null) {
            c0196a.f10255f = 0L;
            if (z11) {
                c0196a.f10254e = 0L;
            }
            b(str, c0196a);
        }
    }

    @Override // com.android.volley.a
    public synchronized void b(String str, a.C0196a c0196a) {
        BufferedOutputStream bufferedOutputStream;
        a aVar;
        long j11 = this.f10329b;
        byte[] bArr = c0196a.f10250a;
        long length = j11 + bArr.length;
        int i11 = this.f10331d;
        if (length <= i11 || bArr.length <= i11 * 0.9f) {
            File e11 = e(str);
            try {
                bufferedOutputStream = new BufferedOutputStream(d(e11));
                aVar = new a(str, c0196a);
            } catch (IOException unused) {
                if (!e11.delete()) {
                    com.android.volley.n.b("Could not clean up file %s", e11.getAbsolutePath());
                }
                g();
            }
            if (aVar.d(bufferedOutputStream)) {
                bufferedOutputStream.write(c0196a.f10250a);
                bufferedOutputStream.close();
                aVar.f10332a = e11.length();
                i(str, aVar);
                h();
                return;
            }
            bufferedOutputStream.close();
            com.android.volley.n.b("Failed to write header for %s", e11.getAbsolutePath());
            throw new IOException();
        }
    }

    InputStream c(File file) {
        return new FileInputStream(file);
    }

    OutputStream d(File file) {
        return new FileOutputStream(file);
    }

    public File e(String str) {
        return new File(this.f10330c.get(), f(str));
    }

    @Override // com.android.volley.a
    public synchronized a.C0196a get(String str) {
        a aVar = this.f10328a.get(str);
        if (aVar == null) {
            return null;
        }
        File e11 = e(str);
        try {
            b bVar = new b(new BufferedInputStream(c(e11)), e11.length());
            try {
                a b11 = a.b(bVar);
                if (!TextUtils.equals(str, b11.f10333b)) {
                    com.android.volley.n.b("%s: key=%s, found=%s", e11.getAbsolutePath(), str, b11.f10333b);
                    p(str);
                    return null;
                }
                return aVar.c(q(bVar, bVar.a()));
            } finally {
                bVar.close();
            }
        } catch (IOException e12) {
            com.android.volley.n.b("%s: %s", e11.getAbsolutePath(), e12.toString());
            o(str);
            return null;
        }
    }

    @Override // com.android.volley.a
    public synchronized void initialize() {
        long length;
        b bVar;
        File file = this.f10330c.get();
        if (!file.exists()) {
            if (!file.mkdirs()) {
                com.android.volley.n.c("Unable to create cache dir %s", file.getAbsolutePath());
            }
            return;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file2 : listFiles) {
            try {
                length = file2.length();
                bVar = new b(new BufferedInputStream(c(file2)), length);
            } catch (IOException unused) {
                file2.delete();
            }
            try {
                a b11 = a.b(bVar);
                b11.f10332a = length;
                i(b11.f10333b, b11);
                bVar.close();
            } catch (Throwable th2) {
                bVar.close();
                throw th2;
                break;
            }
        }
    }

    public synchronized void o(String str) {
        boolean delete = e(str).delete();
        p(str);
        if (!delete) {
            com.android.volley.n.b("Could not delete cache entry for key=%s, filename=%s", str, f(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b extends FilterInputStream {

        /* renamed from: a  reason: collision with root package name */
        private final long f10340a;

        /* renamed from: b  reason: collision with root package name */
        private long f10341b;

        b(InputStream inputStream, long j11) {
            super(inputStream);
            this.f10340a = j11;
        }

        long a() {
            return this.f10340a - this.f10341b;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() {
            int read = super.read();
            if (read != -1) {
                this.f10341b++;
            }
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i11, int i12) {
            int read = super.read(bArr, i11, i12);
            if (read != -1) {
                this.f10341b += read;
            }
            return read;
        }
    }

    public e(c cVar) {
        this(cVar, 5242880);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        long f10332a;

        /* renamed from: b  reason: collision with root package name */
        final String f10333b;

        /* renamed from: c  reason: collision with root package name */
        final String f10334c;

        /* renamed from: d  reason: collision with root package name */
        final long f10335d;

        /* renamed from: e  reason: collision with root package name */
        final long f10336e;

        /* renamed from: f  reason: collision with root package name */
        final long f10337f;

        /* renamed from: g  reason: collision with root package name */
        final long f10338g;

        /* renamed from: h  reason: collision with root package name */
        final List<com.android.volley.e> f10339h;

        private a(String str, String str2, long j11, long j12, long j13, long j14, List<com.android.volley.e> list) {
            this.f10333b = str;
            this.f10334c = "".equals(str2) ? null : str2;
            this.f10335d = j11;
            this.f10336e = j12;
            this.f10337f = j13;
            this.f10338g = j14;
            this.f10339h = list;
        }

        private static List<com.android.volley.e> a(a.C0196a c0196a) {
            List<com.android.volley.e> list = c0196a.f10257h;
            return list != null ? list : g.h(c0196a.f10256g);
        }

        static a b(b bVar) {
            if (e.l(bVar) == 538247942) {
                return new a(e.n(bVar), e.n(bVar), e.m(bVar), e.m(bVar), e.m(bVar), e.m(bVar), e.k(bVar));
            }
            throw new IOException();
        }

        a.C0196a c(byte[] bArr) {
            a.C0196a c0196a = new a.C0196a();
            c0196a.f10250a = bArr;
            c0196a.f10251b = this.f10334c;
            c0196a.f10252c = this.f10335d;
            c0196a.f10253d = this.f10336e;
            c0196a.f10254e = this.f10337f;
            c0196a.f10255f = this.f10338g;
            c0196a.f10256g = g.i(this.f10339h);
            c0196a.f10257h = Collections.unmodifiableList(this.f10339h);
            return c0196a;
        }

        boolean d(OutputStream outputStream) {
            try {
                e.s(outputStream, 538247942);
                e.u(outputStream, this.f10333b);
                String str = this.f10334c;
                if (str == null) {
                    str = "";
                }
                e.u(outputStream, str);
                e.t(outputStream, this.f10335d);
                e.t(outputStream, this.f10336e);
                e.t(outputStream, this.f10337f);
                e.t(outputStream, this.f10338g);
                e.r(this.f10339h, outputStream);
                outputStream.flush();
                return true;
            } catch (IOException e11) {
                com.android.volley.n.b("%s", e11.toString());
                return false;
            }
        }

        a(String str, a.C0196a c0196a) {
            this(str, c0196a.f10251b, c0196a.f10252c, c0196a.f10253d, c0196a.f10254e, c0196a.f10255f, a(c0196a));
        }
    }
}