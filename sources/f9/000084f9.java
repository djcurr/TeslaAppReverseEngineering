package lz;

import io.sentry.e3;
import io.sentry.f3;
import io.sentry.g;
import io.sentry.g3;
import io.sentry.i2;
import io.sentry.q3;
import io.sentry.z2;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.WeakHashMap;
import org.jetbrains.annotations.ApiStatus;
import qz.r;
import rz.j;

@ApiStatus.Internal
/* loaded from: classes5.dex */
public final class d extends b implements e {

    /* renamed from: f */
    private final Map<i2, String> f37786f;

    private d(g3 g3Var, String str, int i11) {
        super(g3Var, str, i11);
        this.f37786f = new WeakHashMap();
    }

    private void A(File file, i2 i2Var) {
        if (file.exists()) {
            this.f37781a.getLogger().c(f3.DEBUG, "Overwriting envelope to offline storage: %s", file.getAbsolutePath());
            if (!file.delete()) {
                this.f37781a.getLogger().c(f3.ERROR, "Failed to delete: %s", file.getAbsolutePath());
            }
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            this.f37782b.b(i2Var, fileOutputStream);
            fileOutputStream.close();
        } catch (Throwable th2) {
            this.f37781a.getLogger().a(f3.ERROR, th2, "Error writing Envelope %s to offline storage", file.getAbsolutePath());
        }
    }

    private void B(File file, q3 q3Var) {
        if (file.exists()) {
            this.f37781a.getLogger().c(f3.DEBUG, "Overwriting session to offline storage: %s", q3Var.i());
            if (!file.delete()) {
                this.f37781a.getLogger().c(f3.ERROR, "Failed to delete: %s", file.getAbsolutePath());
            }
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, b.f37780e));
            try {
                this.f37782b.a(q3Var, bufferedWriter);
                bufferedWriter.close();
                fileOutputStream.close();
            } catch (Throwable th2) {
                try {
                    bufferedWriter.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            this.f37781a.getLogger().a(f3.ERROR, th4, "Error writing Session to offline storage: %s", q3Var.i());
        }
    }

    public static /* synthetic */ boolean r(File file, String str) {
        return x(file, str);
    }

    private File[] s() {
        File[] listFiles;
        return (!e() || (listFiles = this.f37783c.listFiles(new FilenameFilter() { // from class: lz.c
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return d.r(file, str);
            }
        })) == null) ? new File[0] : listFiles;
    }

    public static e t(g3 g3Var) {
        String cacheDirPath = g3Var.getCacheDirPath();
        int maxCacheItems = g3Var.getMaxCacheItems();
        if (cacheDirPath == null) {
            g3Var.getLogger().c(f3.WARNING, "maxCacheItems is null, returning NoOpEnvelopeCache", new Object[0]);
            return r.b();
        }
        return new d(g3Var, cacheDirPath, maxCacheItems);
    }

    private File u() {
        return new File(this.f37783c.getAbsolutePath(), "session.json");
    }

    private synchronized File v(i2 i2Var) {
        String uuid;
        String str;
        if (this.f37786f.containsKey(i2Var)) {
            str = this.f37786f.get(i2Var);
        } else {
            if (i2Var.b().a() != null) {
                uuid = i2Var.b().a().toString();
            } else {
                uuid = UUID.randomUUID().toString();
            }
            String str2 = uuid + ".envelope";
            this.f37786f.put(i2Var, str2);
            str = str2;
        }
        return new File(this.f37783c.getAbsolutePath(), str);
    }

    private Date w(File file) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), b.f37780e));
            String readLine = bufferedReader.readLine();
            this.f37781a.getLogger().c(f3.DEBUG, "Crash marker file has %s timestamp.", readLine);
            Date d11 = g.d(readLine);
            bufferedReader.close();
            return d11;
        } catch (IOException e11) {
            this.f37781a.getLogger().b(f3.ERROR, "Error reading the crash marker file.", e11);
            return null;
        } catch (IllegalArgumentException e12) {
            this.f37781a.getLogger().a(f3.ERROR, e12, "Error converting the crash timestamp.", new Object[0]);
            return null;
        }
    }

    public static /* synthetic */ boolean x(File file, String str) {
        return str.endsWith(".envelope");
    }

    private void y(File file, i2 i2Var) {
        Iterable<z2> c11 = i2Var.c();
        if (c11.iterator().hasNext()) {
            z2 next = c11.iterator().next();
            if (e3.Session.equals(next.w().b())) {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(next.v()), b.f37780e));
                    q3 q3Var = (q3) this.f37782b.c(bufferedReader, q3.class);
                    if (q3Var == null) {
                        this.f37781a.getLogger().c(f3.ERROR, "Item of type %s returned null by the parser.", next.w().b());
                    } else {
                        B(file, q3Var);
                    }
                    bufferedReader.close();
                    return;
                } catch (Throwable th2) {
                    this.f37781a.getLogger().b(f3.ERROR, "Item failed to process.", th2);
                    return;
                }
            }
            this.f37781a.getLogger().c(f3.INFO, "Current envelope has a different envelope type %s", next.w().b());
            return;
        }
        this.f37781a.getLogger().c(f3.INFO, "Current envelope %s is empty", file.getAbsolutePath());
    }

    private void z() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(this.f37781a.getCacheDirPath(), "last_crash"));
            fileOutputStream.write(g.f(g.b()).getBytes(b.f37780e));
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (Throwable th2) {
            this.f37781a.getLogger().b(f3.ERROR, "Error writing the crash marker file to the disk", th2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0185  */
    @Override // lz.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void R0(io.sentry.i2 r13, io.sentry.t r14) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lz.d.R0(io.sentry.i2, io.sentry.t):void");
    }

    @Override // lz.e
    public void a(i2 i2Var) {
        j.a(i2Var, "Envelope is required.");
        File v11 = v(i2Var);
        if (v11.exists()) {
            this.f37781a.getLogger().c(f3.DEBUG, "Discarding envelope from cache: %s", v11.getAbsolutePath());
            if (v11.delete()) {
                return;
            }
            this.f37781a.getLogger().c(f3.ERROR, "Failed to delete envelope: %s", v11.getAbsolutePath());
            return;
        }
        this.f37781a.getLogger().c(f3.DEBUG, "Envelope was not cached: %s", v11.getAbsolutePath());
    }

    @Override // java.lang.Iterable
    public Iterator<i2> iterator() {
        BufferedInputStream bufferedInputStream;
        File[] s11 = s();
        ArrayList arrayList = new ArrayList(s11.length);
        for (File file : s11) {
            try {
                bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            } catch (FileNotFoundException unused) {
                this.f37781a.getLogger().c(f3.DEBUG, "Envelope file '%s' disappeared while converting all cached files to envelopes.", file.getAbsolutePath());
            } catch (IOException e11) {
                this.f37781a.getLogger().b(f3.ERROR, String.format("Error while reading cached envelope from file %s", file.getAbsolutePath()), e11);
            }
            try {
                arrayList.add(this.f37782b.d(bufferedInputStream));
                bufferedInputStream.close();
            } catch (Throwable th2) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
                break;
            }
        }
        return arrayList.iterator();
    }
}