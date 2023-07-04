package dm;

import am.a0;
import am.b0;
import bm.g;
import com.google.firebase.crashlytics.internal.common.o;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import zl.i;

/* loaded from: classes3.dex */
public class e {

    /* renamed from: d */
    private static final Charset f24190d = Charset.forName("UTF-8");

    /* renamed from: e */
    private static final int f24191e = 15;

    /* renamed from: f */
    private static final g f24192f = new g();

    /* renamed from: g */
    private static final Comparator<? super File> f24193g = new Comparator() { // from class: dm.c
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return e.a((File) obj, (File) obj2);
        }
    };

    /* renamed from: h */
    private static final FilenameFilter f24194h = new FilenameFilter() { // from class: dm.b
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return e.d(file, str);
        }
    };

    /* renamed from: a */
    private final AtomicInteger f24195a = new AtomicInteger(0);

    /* renamed from: b */
    private final f f24196b;

    /* renamed from: c */
    private final fm.e f24197c;

    public e(f fVar, fm.e eVar) {
        this.f24196b = fVar;
        this.f24197c = eVar;
    }

    private static String A(File file) {
        byte[] bArr = new byte[PKIFailureInfo.certRevoked];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    String str = new String(byteArrayOutputStream.toByteArray(), f24190d);
                    fileInputStream.close();
                    return str;
                }
            } catch (Throwable th2) {
                try {
                    fileInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    private void B(File file, a0.d dVar, String str) {
        try {
            g gVar = f24192f;
            F(this.f24196b.f(str), gVar.E(gVar.D(A(file)).m(dVar)));
        } catch (IOException e11) {
            wl.f f11 = wl.f.f();
            f11.l("Could not synthesize final native report file for " + file, e11);
        }
    }

    private void C(String str, long j11) {
        boolean z11;
        List<File> o11 = this.f24196b.o(str, f24194h);
        if (o11.isEmpty()) {
            wl.f.f().i("Session " + str + " has no events.");
            return;
        }
        Collections.sort(o11);
        ArrayList arrayList = new ArrayList();
        loop0: while (true) {
            z11 = false;
            for (File file : o11) {
                try {
                    arrayList.add(f24192f.g(A(file)));
                } catch (IOException e11) {
                    wl.f.f().l("Could not add event to report for " + file, e11);
                }
                if (z11 || s(file.getName())) {
                    z11 = true;
                }
            }
        }
        if (arrayList.isEmpty()) {
            wl.f.f().k("Could not parse event files for session " + str);
            return;
        }
        D(this.f24196b.n(str, "report"), arrayList, j11, z11, i.j(str, this.f24196b));
    }

    private void D(File file, List<a0.e.d> list, long j11, boolean z11, String str) {
        File k11;
        try {
            g gVar = f24192f;
            a0 l11 = gVar.D(A(file)).n(j11, z11, str).l(b0.b(list));
            a0.e j12 = l11.j();
            if (j12 == null) {
                return;
            }
            if (z11) {
                k11 = this.f24196b.i(j12.h());
            } else {
                k11 = this.f24196b.k(j12.h());
            }
            F(k11, gVar.E(l11));
        } catch (IOException e11) {
            wl.f f11 = wl.f.f();
            f11.l("Could not synthesize final report file for " + file, e11);
        }
    }

    private int E(String str, int i11) {
        List<File> o11 = this.f24196b.o(str, new FilenameFilter() { // from class: dm.a
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                return e.b(file, str2);
            }
        });
        Collections.sort(o11, new Comparator() { // from class: dm.d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return e.c((File) obj, (File) obj2);
            }
        });
        return f(o11, i11);
    }

    private static void F(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f24190d);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th2) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private static void G(File file, String str, long j11) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f24190d);
        try {
            outputStreamWriter.write(str);
            file.setLastModified(h(j11));
            outputStreamWriter.close();
        } catch (Throwable th2) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static /* synthetic */ int a(File file, File file2) {
        return u(file, file2);
    }

    public static /* synthetic */ boolean b(File file, String str) {
        return t(file, str);
    }

    public static /* synthetic */ int c(File file, File file2) {
        return x(file, file2);
    }

    public static /* synthetic */ boolean d(File file, String str) {
        return v(file, str);
    }

    private SortedSet<String> e(String str) {
        this.f24196b.a();
        SortedSet<String> p11 = p();
        if (str != null) {
            p11.remove(str);
        }
        if (p11.size() <= 8) {
            return p11;
        }
        while (p11.size() > 8) {
            String last = p11.last();
            wl.f f11 = wl.f.f();
            f11.b("Removing session over cap: " + last);
            this.f24196b.b(last);
            p11.remove(last);
        }
        return p11;
    }

    private static int f(List<File> list, int i11) {
        int size = list.size();
        for (File file : list) {
            if (size <= i11) {
                return size;
            }
            f.r(file);
            size--;
        }
        return size;
    }

    private void g() {
        int i11 = this.f24197c.a().b().f28019b;
        List<File> n11 = n();
        int size = n11.size();
        if (size <= i11) {
            return;
        }
        for (File file : n11.subList(i11, size)) {
            file.delete();
        }
    }

    private static long h(long j11) {
        return j11 * 1000;
    }

    private void j(List<File> list) {
        for (File file : list) {
            file.delete();
        }
    }

    private static String m(int i11, boolean z11) {
        String format = String.format(Locale.US, "%010d", Integer.valueOf(i11));
        String str = z11 ? "_" : "";
        return "event" + format + str;
    }

    private List<File> n() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f24196b.j());
        arrayList.addAll(this.f24196b.g());
        Comparator<? super File> comparator = f24193g;
        Collections.sort(arrayList, comparator);
        List<File> l11 = this.f24196b.l();
        Collections.sort(l11, comparator);
        arrayList.addAll(l11);
        return arrayList;
    }

    private static String o(String str) {
        return str.substring(0, f24191e);
    }

    private static boolean s(String str) {
        return str.startsWith("event") && str.endsWith("_");
    }

    public static boolean t(File file, String str) {
        return str.startsWith("event") && !str.endsWith("_");
    }

    public static /* synthetic */ int u(File file, File file2) {
        return file2.getName().compareTo(file.getName());
    }

    public static /* synthetic */ boolean v(File file, String str) {
        return str.startsWith("event");
    }

    public static int x(File file, File file2) {
        return o(file.getName()).compareTo(o(file2.getName()));
    }

    public void i() {
        j(this.f24196b.l());
        j(this.f24196b.j());
        j(this.f24196b.g());
    }

    public void k(String str, long j11) {
        for (String str2 : e(str)) {
            wl.f f11 = wl.f.f();
            f11.i("Finalizing report for session " + str2);
            C(str2, j11);
            this.f24196b.b(str2);
        }
        g();
    }

    public void l(String str, a0.d dVar) {
        File n11 = this.f24196b.n(str, "report");
        wl.f f11 = wl.f.f();
        f11.b("Writing native session report for " + str + " to file: " + n11);
        B(n11, dVar, str);
    }

    public SortedSet<String> p() {
        return new TreeSet(this.f24196b.c()).descendingSet();
    }

    public long q(String str) {
        return this.f24196b.n(str, "start-time").lastModified();
    }

    public boolean r() {
        return (this.f24196b.l().isEmpty() && this.f24196b.j().isEmpty() && this.f24196b.g().isEmpty()) ? false : true;
    }

    public List<o> w() {
        List<File> n11 = n();
        ArrayList arrayList = new ArrayList();
        for (File file : n11) {
            try {
                arrayList.add(o.a(f24192f.D(A(file)), file.getName(), file));
            } catch (IOException e11) {
                wl.f f11 = wl.f.f();
                f11.l("Could not load report file " + file + "; deleting", e11);
                file.delete();
            }
        }
        return arrayList;
    }

    public void y(a0.e.d dVar, String str, boolean z11) {
        int i11 = this.f24197c.a().b().f28018a;
        try {
            F(this.f24196b.n(str, m(this.f24195a.getAndIncrement(), z11)), f24192f.h(dVar));
        } catch (IOException e11) {
            wl.f f11 = wl.f.f();
            f11.l("Could not persist event for session " + str, e11);
        }
        E(str, i11);
    }

    public void z(a0 a0Var) {
        a0.e j11 = a0Var.j();
        if (j11 == null) {
            wl.f.f().b("Could not get session for report");
            return;
        }
        String h11 = j11.h();
        try {
            F(this.f24196b.n(h11, "report"), f24192f.E(a0Var));
            G(this.f24196b.n(h11, "start-time"), "", j11.k());
        } catch (IOException e11) {
            wl.f f11 = wl.f.f();
            f11.c("Could not persist report for session " + h11, e11);
        }
    }
}