package zl;

import java.io.File;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: c  reason: collision with root package name */
    private static final b f60493c = new b();

    /* renamed from: a  reason: collision with root package name */
    private final dm.f f60494a;

    /* renamed from: b  reason: collision with root package name */
    private zl.a f60495b;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class b implements zl.a {
        private b() {
        }

        @Override // zl.a
        public void a() {
        }

        @Override // zl.a
        public String b() {
            return null;
        }

        @Override // zl.a
        public byte[] c() {
            return null;
        }

        @Override // zl.a
        public void d() {
        }

        @Override // zl.a
        public void e(long j11, String str) {
        }
    }

    public c(dm.f fVar) {
        this.f60494a = fVar;
        this.f60495b = f60493c;
    }

    private File d(String str) {
        return this.f60494a.n(str, "userlog");
    }

    public void a() {
        this.f60495b.d();
    }

    public byte[] b() {
        return this.f60495b.c();
    }

    public String c() {
        return this.f60495b.b();
    }

    public final void e(String str) {
        this.f60495b.a();
        this.f60495b = f60493c;
        if (str == null) {
            return;
        }
        f(d(str), 65536);
    }

    void f(File file, int i11) {
        this.f60495b = new f(file, i11);
    }

    public void g(long j11, String str) {
        this.f60495b.e(j11, str);
    }

    public c(dm.f fVar, String str) {
        this(fVar);
        e(str);
    }
}