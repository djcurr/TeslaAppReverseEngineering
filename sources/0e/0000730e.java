package hd;

import android.content.Context;
import ch.qos.logback.core.rolling.SizeBasedTriggeringPolicy;
import java.io.File;
import md.k;
import md.n;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final int f29049a;

    /* renamed from: b  reason: collision with root package name */
    private final String f29050b;

    /* renamed from: c  reason: collision with root package name */
    private final n<File> f29051c;

    /* renamed from: d  reason: collision with root package name */
    private final long f29052d;

    /* renamed from: e  reason: collision with root package name */
    private final long f29053e;

    /* renamed from: f  reason: collision with root package name */
    private final long f29054f;

    /* renamed from: g  reason: collision with root package name */
    private final h f29055g;

    /* renamed from: h  reason: collision with root package name */
    private final gd.a f29056h;

    /* renamed from: i  reason: collision with root package name */
    private final gd.c f29057i;

    /* renamed from: j  reason: collision with root package name */
    private final jd.b f29058j;

    /* renamed from: k  reason: collision with root package name */
    private final Context f29059k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f29060l;

    /* loaded from: classes.dex */
    class a implements n<File> {
        a() {
        }

        @Override // md.n
        /* renamed from: a */
        public File get() {
            k.g(c.this.f29059k);
            return c.this.f29059k.getApplicationContext().getCacheDir();
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private int f29062a;

        /* renamed from: b  reason: collision with root package name */
        private String f29063b;

        /* renamed from: c  reason: collision with root package name */
        private n<File> f29064c;

        /* renamed from: d  reason: collision with root package name */
        private long f29065d;

        /* renamed from: e  reason: collision with root package name */
        private long f29066e;

        /* renamed from: f  reason: collision with root package name */
        private long f29067f;

        /* renamed from: g  reason: collision with root package name */
        private h f29068g;

        /* renamed from: h  reason: collision with root package name */
        private gd.a f29069h;

        /* renamed from: i  reason: collision with root package name */
        private gd.c f29070i;

        /* renamed from: j  reason: collision with root package name */
        private jd.b f29071j;

        /* renamed from: k  reason: collision with root package name */
        private boolean f29072k;

        /* renamed from: l  reason: collision with root package name */
        private final Context f29073l;

        /* synthetic */ b(Context context, a aVar) {
            this(context);
        }

        public c n() {
            return new c(this);
        }

        private b(Context context) {
            this.f29062a = 1;
            this.f29063b = "image_cache";
            this.f29065d = 41943040L;
            this.f29066e = SizeBasedTriggeringPolicy.DEFAULT_MAX_FILE_SIZE;
            this.f29067f = 2097152L;
            this.f29068g = new hd.b();
            this.f29073l = context;
        }
    }

    protected c(b bVar) {
        gd.a aVar;
        gd.c cVar;
        jd.b bVar2;
        Context context = bVar.f29073l;
        this.f29059k = context;
        k.j((bVar.f29064c == null && context == null) ? false : true, "Either a non-null context or a base directory path or supplier must be provided.");
        if (bVar.f29064c == null && context != null) {
            bVar.f29064c = new a();
        }
        this.f29049a = bVar.f29062a;
        this.f29050b = (String) k.g(bVar.f29063b);
        this.f29051c = (n) k.g(bVar.f29064c);
        this.f29052d = bVar.f29065d;
        this.f29053e = bVar.f29066e;
        this.f29054f = bVar.f29067f;
        this.f29055g = (h) k.g(bVar.f29068g);
        if (bVar.f29069h != null) {
            aVar = bVar.f29069h;
        } else {
            aVar = gd.g.b();
        }
        this.f29056h = aVar;
        if (bVar.f29070i != null) {
            cVar = bVar.f29070i;
        } else {
            cVar = gd.h.i();
        }
        this.f29057i = cVar;
        if (bVar.f29071j != null) {
            bVar2 = bVar.f29071j;
        } else {
            bVar2 = jd.c.b();
        }
        this.f29058j = bVar2;
        this.f29060l = bVar.f29072k;
    }

    public static b m(Context context) {
        return new b(context, null);
    }

    public String b() {
        return this.f29050b;
    }

    public n<File> c() {
        return this.f29051c;
    }

    public gd.a d() {
        return this.f29056h;
    }

    public gd.c e() {
        return this.f29057i;
    }

    public long f() {
        return this.f29052d;
    }

    public jd.b g() {
        return this.f29058j;
    }

    public h h() {
        return this.f29055g;
    }

    public boolean i() {
        return this.f29060l;
    }

    public long j() {
        return this.f29053e;
    }

    public long k() {
        return this.f29054f;
    }

    public int l() {
        return this.f29049a;
    }
}