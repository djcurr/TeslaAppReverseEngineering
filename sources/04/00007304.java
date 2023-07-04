package hd;

import android.os.Environment;
import com.facebook.common.file.FileUtils;
import gd.a;
import hd.d;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import md.k;

/* loaded from: classes.dex */
public class a implements hd.d {

    /* renamed from: f  reason: collision with root package name */
    private static final Class<?> f29029f = a.class;

    /* renamed from: g  reason: collision with root package name */
    static final long f29030g = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a  reason: collision with root package name */
    private final File f29031a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f29032b;

    /* renamed from: c  reason: collision with root package name */
    private final File f29033c;

    /* renamed from: d  reason: collision with root package name */
    private final gd.a f29034d;

    /* renamed from: e  reason: collision with root package name */
    private final td.a f29035e;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b implements ld.b {

        /* renamed from: a  reason: collision with root package name */
        private final List<d.a> f29036a;

        private b() {
            this.f29036a = new ArrayList();
        }

        @Override // ld.b
        public void a(File file) {
        }

        @Override // ld.b
        public void b(File file) {
            d t11 = a.this.t(file);
            if (t11 == null || t11.f29042a != ".cnt") {
                return;
            }
            this.f29036a.add(new c(t11.f29043b, file));
        }

        @Override // ld.b
        public void c(File file) {
        }

        public List<d.a> d() {
            return Collections.unmodifiableList(this.f29036a);
        }
    }

    /* loaded from: classes.dex */
    static class c implements d.a {

        /* renamed from: a  reason: collision with root package name */
        private final String f29038a;

        /* renamed from: b  reason: collision with root package name */
        private final fd.b f29039b;

        /* renamed from: c  reason: collision with root package name */
        private long f29040c;

        /* renamed from: d  reason: collision with root package name */
        private long f29041d;

        @Override // hd.d.a
        public long a() {
            if (this.f29040c < 0) {
                this.f29040c = this.f29039b.size();
            }
            return this.f29040c;
        }

        public fd.b b() {
            return this.f29039b;
        }

        @Override // hd.d.a
        public String getId() {
            return this.f29038a;
        }

        @Override // hd.d.a
        public long getTimestamp() {
            if (this.f29041d < 0) {
                this.f29041d = this.f29039b.d().lastModified();
            }
            return this.f29041d;
        }

        private c(String str, File file) {
            k.g(file);
            this.f29038a = (String) k.g(str);
            this.f29039b = fd.b.b(file);
            this.f29040c = -1L;
            this.f29041d = -1L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final String f29042a;

        /* renamed from: b  reason: collision with root package name */
        public final String f29043b;

        public static d b(File file) {
            String r11;
            String name = file.getName();
            int lastIndexOf = name.lastIndexOf(46);
            if (lastIndexOf > 0 && (r11 = a.r(name.substring(lastIndexOf))) != null) {
                String substring = name.substring(0, lastIndexOf);
                if (r11.equals(".tmp")) {
                    int lastIndexOf2 = substring.lastIndexOf(46);
                    if (lastIndexOf2 <= 0) {
                        return null;
                    }
                    substring = substring.substring(0, lastIndexOf2);
                }
                return new d(r11, substring);
            }
            return null;
        }

        public File a(File file) {
            return File.createTempFile(this.f29043b + ".", ".tmp", file);
        }

        public String c(String str) {
            return str + File.separator + this.f29043b + this.f29042a;
        }

        public String toString() {
            return this.f29042a + "(" + this.f29043b + ")";
        }

        private d(String str, String str2) {
            this.f29042a = str;
            this.f29043b = str2;
        }
    }

    /* loaded from: classes.dex */
    private static class e extends IOException {
        public e(long j11, long j12) {
            super("File was not written completely. Expected: " + j11 + ", found: " + j12);
        }
    }

    /* loaded from: classes.dex */
    class f implements d.b {

        /* renamed from: a  reason: collision with root package name */
        private final String f29044a;

        /* renamed from: b  reason: collision with root package name */
        final File f29045b;

        public f(String str, File file) {
            this.f29044a = str;
            this.f29045b = file;
        }

        public fd.a a(Object obj, long j11) {
            a.EnumC0528a enumC0528a;
            File p11 = a.this.p(this.f29044a);
            try {
                FileUtils.b(this.f29045b, p11);
                if (p11.exists()) {
                    p11.setLastModified(j11);
                }
                return fd.b.b(p11);
            } catch (FileUtils.RenameException e11) {
                Throwable cause = e11.getCause();
                if (cause != null) {
                    if (!(cause instanceof FileUtils.ParentDirNotFoundException)) {
                        if (cause instanceof FileNotFoundException) {
                            enumC0528a = a.EnumC0528a.WRITE_RENAME_FILE_TEMPFILE_NOT_FOUND;
                        } else {
                            enumC0528a = a.EnumC0528a.WRITE_RENAME_FILE_OTHER;
                        }
                    } else {
                        enumC0528a = a.EnumC0528a.WRITE_RENAME_FILE_TEMPFILE_PARENT_NOT_FOUND;
                    }
                } else {
                    enumC0528a = a.EnumC0528a.WRITE_RENAME_FILE_OTHER;
                }
                a.this.f29034d.a(enumC0528a, a.f29029f, "commit", e11);
                throw e11;
            }
        }

        @Override // hd.d.b
        public boolean e() {
            return !this.f29045b.exists() || this.f29045b.delete();
        }

        @Override // hd.d.b
        public void f(gd.j jVar, Object obj) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(this.f29045b);
                try {
                    md.c cVar = new md.c(fileOutputStream);
                    jVar.write(cVar);
                    cVar.flush();
                    long a11 = cVar.a();
                    fileOutputStream.close();
                    if (this.f29045b.length() != a11) {
                        throw new e(a11, this.f29045b.length());
                    }
                } catch (Throwable th2) {
                    fileOutputStream.close();
                    throw th2;
                }
            } catch (FileNotFoundException e11) {
                a.this.f29034d.a(a.EnumC0528a.WRITE_UPDATE_FILE_NOT_FOUND, a.f29029f, "updateResource", e11);
                throw e11;
            }
        }

        @Override // hd.d.b
        public fd.a g(Object obj) {
            return a(obj, a.this.f29035e.now());
        }
    }

    /* loaded from: classes.dex */
    private class g implements ld.b {

        /* renamed from: a  reason: collision with root package name */
        private boolean f29047a;

        private g() {
        }

        private boolean d(File file) {
            d t11 = a.this.t(file);
            if (t11 == null) {
                return false;
            }
            String str = t11.f29042a;
            if (str == ".tmp") {
                return e(file);
            }
            k.i(str == ".cnt");
            return true;
        }

        private boolean e(File file) {
            return file.lastModified() > a.this.f29035e.now() - a.f29030g;
        }

        @Override // ld.b
        public void a(File file) {
            if (!a.this.f29031a.equals(file) && !this.f29047a) {
                file.delete();
            }
            if (this.f29047a && file.equals(a.this.f29033c)) {
                this.f29047a = false;
            }
        }

        @Override // ld.b
        public void b(File file) {
            if (this.f29047a && d(file)) {
                return;
            }
            file.delete();
        }

        @Override // ld.b
        public void c(File file) {
            if (this.f29047a || !file.equals(a.this.f29033c)) {
                return;
            }
            this.f29047a = true;
        }
    }

    public a(File file, int i11, gd.a aVar) {
        k.g(file);
        this.f29031a = file;
        this.f29032b = x(file, aVar);
        this.f29033c = new File(file, w(i11));
        this.f29034d = aVar;
        A();
        this.f29035e = td.c.a();
    }

    private void A() {
        boolean z11 = true;
        if (this.f29031a.exists()) {
            if (this.f29033c.exists()) {
                z11 = false;
            } else {
                ld.a.b(this.f29031a);
            }
        }
        if (z11) {
            try {
                FileUtils.a(this.f29033c);
            } catch (FileUtils.CreateDirectoryException unused) {
                gd.a aVar = this.f29034d;
                a.EnumC0528a enumC0528a = a.EnumC0528a.WRITE_CREATE_DIR;
                Class<?> cls = f29029f;
                aVar.a(enumC0528a, cls, "version directory could not be created: " + this.f29033c, null);
            }
        }
    }

    private long o(File file) {
        if (file.exists()) {
            long length = file.length();
            if (file.delete()) {
                return length;
            }
            return -1L;
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String r(String str) {
        if (".cnt".equals(str)) {
            return ".cnt";
        }
        if (".tmp".equals(str)) {
            return ".tmp";
        }
        return null;
    }

    private String s(String str) {
        d dVar = new d(".cnt", str);
        return dVar.c(v(dVar.f29043b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public d t(File file) {
        d b11 = d.b(file);
        if (b11 != null && u(b11.f29043b).equals(file.getParentFile())) {
            return b11;
        }
        return null;
    }

    private File u(String str) {
        return new File(v(str));
    }

    private String v(String str) {
        String valueOf = String.valueOf(Math.abs(str.hashCode() % 100));
        return this.f29033c + File.separator + valueOf;
    }

    static String w(int i11) {
        return String.format(null, "%s.ols%d.%d", "v2", 100, Integer.valueOf(i11));
    }

    private static boolean x(File file, gd.a aVar) {
        try {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (externalStorageDirectory == null) {
                return false;
            }
            try {
                try {
                    return file.getCanonicalPath().contains(externalStorageDirectory.toString());
                } catch (IOException e11) {
                    e = e11;
                    a.EnumC0528a enumC0528a = a.EnumC0528a.OTHER;
                    Class<?> cls = f29029f;
                    aVar.a(enumC0528a, cls, "failed to read folder to check if external: " + ((String) null), e);
                    return false;
                }
            } catch (IOException e12) {
                e = e12;
            }
        } catch (Exception e13) {
            aVar.a(a.EnumC0528a.OTHER, f29029f, "failed to get the external storage directory!", e13);
            return false;
        }
    }

    private void y(File file, String str) {
        try {
            FileUtils.a(file);
        } catch (FileUtils.CreateDirectoryException e11) {
            this.f29034d.a(a.EnumC0528a.WRITE_CREATE_DIR, f29029f, str, e11);
            throw e11;
        }
    }

    private boolean z(String str, boolean z11) {
        File p11 = p(str);
        boolean exists = p11.exists();
        if (z11 && exists) {
            p11.setLastModified(this.f29035e.now());
        }
        return exists;
    }

    @Override // hd.d
    public void a() {
        ld.a.a(this.f29031a);
    }

    @Override // hd.d
    public void b() {
        ld.a.c(this.f29031a, new g());
    }

    @Override // hd.d
    public boolean c(String str, Object obj) {
        return z(str, true);
    }

    @Override // hd.d
    public long d(d.a aVar) {
        return o(((c) aVar).b().d());
    }

    @Override // hd.d
    public d.b e(String str, Object obj) {
        d dVar = new d(".tmp", str);
        File u11 = u(dVar.f29043b);
        if (!u11.exists()) {
            y(u11, "insert");
        }
        try {
            return new f(str, dVar.a(u11));
        } catch (IOException e11) {
            this.f29034d.a(a.EnumC0528a.WRITE_CREATE_TEMPFILE, f29029f, "insert", e11);
            throw e11;
        }
    }

    @Override // hd.d
    public boolean f(String str, Object obj) {
        return z(str, false);
    }

    @Override // hd.d
    public fd.a g(String str, Object obj) {
        File p11 = p(str);
        if (p11.exists()) {
            p11.setLastModified(this.f29035e.now());
            return fd.b.c(p11);
        }
        return null;
    }

    @Override // hd.d
    public boolean isExternal() {
        return this.f29032b;
    }

    File p(String str) {
        return new File(s(str));
    }

    @Override // hd.d
    /* renamed from: q */
    public List<d.a> getEntries() {
        b bVar = new b();
        ld.a.c(this.f29033c, bVar);
        return bVar.d();
    }

    @Override // hd.d
    public long remove(String str) {
        return o(p(str));
    }
}