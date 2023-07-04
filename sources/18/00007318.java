package hd;

import com.facebook.common.file.FileUtils;
import gd.a;
import hd.d;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import md.k;
import md.n;

/* loaded from: classes.dex */
public class f implements d {

    /* renamed from: f  reason: collision with root package name */
    private static final Class<?> f29100f = f.class;

    /* renamed from: a  reason: collision with root package name */
    private final int f29101a;

    /* renamed from: b  reason: collision with root package name */
    private final n<File> f29102b;

    /* renamed from: c  reason: collision with root package name */
    private final String f29103c;

    /* renamed from: d  reason: collision with root package name */
    private final gd.a f29104d;

    /* renamed from: e  reason: collision with root package name */
    volatile a f29105e = new a(null, null);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final d f29106a;

        /* renamed from: b  reason: collision with root package name */
        public final File f29107b;

        a(File file, d dVar) {
            this.f29106a = dVar;
            this.f29107b = file;
        }
    }

    public f(int i11, n<File> nVar, String str, gd.a aVar) {
        this.f29101a = i11;
        this.f29104d = aVar;
        this.f29102b = nVar;
        this.f29103c = str;
    }

    private void i() {
        File file = new File(this.f29102b.get(), this.f29103c);
        h(file);
        this.f29105e = new a(file, new hd.a(file, this.f29101a, this.f29104d));
    }

    private boolean l() {
        File file;
        a aVar = this.f29105e;
        return aVar.f29106a == null || (file = aVar.f29107b) == null || !file.exists();
    }

    @Override // hd.d
    public void a() {
        k().a();
    }

    @Override // hd.d
    public void b() {
        try {
            k().b();
        } catch (IOException e11) {
            nd.a.g(f29100f, "purgeUnexpectedResources", e11);
        }
    }

    @Override // hd.d
    public boolean c(String str, Object obj) {
        return k().c(str, obj);
    }

    @Override // hd.d
    public long d(d.a aVar) {
        return k().d(aVar);
    }

    @Override // hd.d
    public d.b e(String str, Object obj) {
        return k().e(str, obj);
    }

    @Override // hd.d
    public boolean f(String str, Object obj) {
        return k().f(str, obj);
    }

    @Override // hd.d
    public fd.a g(String str, Object obj) {
        return k().g(str, obj);
    }

    @Override // hd.d
    public Collection<d.a> getEntries() {
        return k().getEntries();
    }

    void h(File file) {
        try {
            FileUtils.a(file);
            nd.a.a(f29100f, "Created cache directory %s", file.getAbsolutePath());
        } catch (FileUtils.CreateDirectoryException e11) {
            this.f29104d.a(a.EnumC0528a.WRITE_CREATE_DIR, f29100f, "createRootDirectoryIfNecessary", e11);
            throw e11;
        }
    }

    @Override // hd.d
    public boolean isExternal() {
        try {
            return k().isExternal();
        } catch (IOException unused) {
            return false;
        }
    }

    void j() {
        if (this.f29105e.f29106a == null || this.f29105e.f29107b == null) {
            return;
        }
        ld.a.b(this.f29105e.f29107b);
    }

    synchronized d k() {
        if (l()) {
            j();
            i();
        }
        return (d) k.g(this.f29105e.f29106a);
    }

    @Override // hd.d
    public long remove(String str) {
        return k().remove(str);
    }
}