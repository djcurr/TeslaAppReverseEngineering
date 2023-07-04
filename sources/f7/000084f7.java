package lz;

import io.sentry.e3;
import io.sentry.f3;
import io.sentry.g3;
import io.sentry.h0;
import io.sentry.i2;
import io.sentry.q3;
import io.sentry.z2;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import rz.j;

/* loaded from: classes5.dex */
public abstract class b {

    /* renamed from: e */
    protected static final Charset f37780e = Charset.forName("UTF-8");

    /* renamed from: a */
    protected final g3 f37781a;

    /* renamed from: b */
    protected final h0 f37782b;

    /* renamed from: c */
    protected final File f37783c;

    /* renamed from: d */
    private final int f37784d;

    public b(g3 g3Var, String str, int i11) {
        j.a(str, "Directory is required.");
        this.f37781a = (g3) j.a(g3Var, "SentryOptions is required.");
        this.f37782b = g3Var.getSerializer();
        this.f37783c = new File(str);
        this.f37784d = i11;
    }

    public static /* synthetic */ int b(File file, File file2) {
        return j(file, file2);
    }

    private i2 c(i2 i2Var, z2 z2Var) {
        ArrayList arrayList = new ArrayList();
        for (z2 z2Var2 : i2Var.c()) {
            arrayList.add(z2Var2);
        }
        arrayList.add(z2Var);
        return new i2(i2Var.b(), arrayList);
    }

    private q3 d(i2 i2Var) {
        for (z2 z2Var : i2Var.c()) {
            if (f(z2Var)) {
                return n(z2Var);
            }
        }
        return null;
    }

    private boolean f(z2 z2Var) {
        if (z2Var == null) {
            return false;
        }
        return z2Var.w().b().equals(e3.Session);
    }

    private boolean h(i2 i2Var) {
        return i2Var.c().iterator().hasNext();
    }

    private boolean i(q3 q3Var) {
        return q3Var.j().equals(q3.b.Ok) && q3Var.i() != null;
    }

    public static /* synthetic */ int j(File file, File file2) {
        return Long.compare(file.lastModified(), file2.lastModified());
    }

    private void k(File file, File[] fileArr) {
        Boolean f11;
        int i11;
        File file2;
        i2 m11;
        z2 z2Var;
        q3 n11;
        i2 m12 = m(file);
        if (m12 == null || !h(m12)) {
            return;
        }
        this.f37781a.getClientReportRecorder().b(mz.e.CACHE_OVERFLOW, m12);
        q3 d11 = d(m12);
        if (d11 == null || !i(d11) || (f11 = d11.f()) == null || !f11.booleanValue()) {
            return;
        }
        int length = fileArr.length;
        for (i11 = 0; i11 < length; i11++) {
            file2 = fileArr[i11];
            m11 = m(file2);
            if (m11 != null && h(m11)) {
                z2Var = null;
                Iterator<z2> it2 = m11.c().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    z2 next = it2.next();
                    if (f(next) && (n11 = n(next)) != null && i(n11)) {
                        Boolean f12 = n11.f();
                        if (f12 != null && f12.booleanValue()) {
                            this.f37781a.getLogger().c(f3.ERROR, "Session %s has 2 times the init flag.", d11.i());
                            return;
                        } else if (d11.i() != null && d11.i().equals(n11.i())) {
                            n11.k();
                            try {
                                z2Var = z2.t(this.f37782b, n11);
                                it2.remove();
                                break;
                            } catch (IOException e11) {
                                this.f37781a.getLogger().a(f3.ERROR, e11, "Failed to create new envelope item for the session %s", d11.i());
                            }
                        }
                    }
                }
            }
        }
        return;
        if (z2Var != null) {
            i2 c11 = c(m11, z2Var);
            long lastModified = file2.lastModified();
            if (!file2.delete()) {
                this.f37781a.getLogger().c(f3.WARNING, "File can't be deleted: %s", file2.getAbsolutePath());
            }
            p(c11, file2, lastModified);
            return;
        }
    }

    private i2 m(File file) {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            i2 d11 = this.f37782b.d(bufferedInputStream);
            bufferedInputStream.close();
            return d11;
        } catch (IOException e11) {
            this.f37781a.getLogger().b(f3.ERROR, "Failed to deserialize the envelope.", e11);
            return null;
        }
    }

    private q3 n(z2 z2Var) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(z2Var.v()), f37780e));
            q3 q3Var = (q3) this.f37782b.c(bufferedReader, q3.class);
            bufferedReader.close();
            return q3Var;
        } catch (Throwable th2) {
            this.f37781a.getLogger().b(f3.ERROR, "Failed to deserialize the session.", th2);
            return null;
        }
    }

    private void p(i2 i2Var, File file, long j11) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            this.f37782b.b(i2Var, fileOutputStream);
            file.setLastModified(j11);
            fileOutputStream.close();
        } catch (Throwable th2) {
            this.f37781a.getLogger().b(f3.ERROR, "Failed to serialize the new envelope to the disk.", th2);
        }
    }

    private void q(File[] fileArr) {
        if (fileArr.length > 1) {
            Arrays.sort(fileArr, new Comparator() { // from class: lz.a
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return b.b((File) obj, (File) obj2);
                }
            });
        }
    }

    public boolean e() {
        if (this.f37783c.isDirectory() && this.f37783c.canWrite() && this.f37783c.canRead()) {
            return true;
        }
        this.f37781a.getLogger().c(f3.ERROR, "The directory for caching files is inaccessible.: %s", this.f37783c.getAbsolutePath());
        return false;
    }

    public void o(File[] fileArr) {
        int length = fileArr.length;
        if (length >= this.f37784d) {
            this.f37781a.getLogger().c(f3.WARNING, "Cache folder if full (respecting maxSize). Rotating files", new Object[0]);
            int i11 = (length - this.f37784d) + 1;
            q(fileArr);
            File[] fileArr2 = (File[]) Arrays.copyOfRange(fileArr, i11, length);
            for (int i12 = 0; i12 < i11; i12++) {
                File file = fileArr[i12];
                k(file, fileArr2);
                if (!file.delete()) {
                    this.f37781a.getLogger().c(f3.WARNING, "File can't be deleted: %s", file.getAbsolutePath());
                }
            }
        }
    }
}