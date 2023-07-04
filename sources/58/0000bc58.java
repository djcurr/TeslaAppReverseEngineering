package w5;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import okhttp3.CacheControl;
import okhttp3.Call;
import okhttp3.HttpUrl;
import w5.g;

/* loaded from: classes.dex */
public abstract class i<T> implements g<T> {

    /* renamed from: b  reason: collision with root package name */
    private static final CacheControl f55612b;

    /* renamed from: c  reason: collision with root package name */
    private static final CacheControl f55613c;

    /* renamed from: a  reason: collision with root package name */
    private final Call.Factory f55614a;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "coil.fetch.HttpFetcher", f = "HttpFetcher.kt", l = {108}, m = "fetch$suspendImpl")
    /* loaded from: classes.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f55615a;

        /* renamed from: b  reason: collision with root package name */
        int f55616b;

        /* renamed from: d  reason: collision with root package name */
        Object f55618d;

        /* renamed from: e  reason: collision with root package name */
        Object f55619e;

        /* renamed from: f  reason: collision with root package name */
        Object f55620f;

        /* renamed from: g  reason: collision with root package name */
        Object f55621g;

        /* renamed from: h  reason: collision with root package name */
        Object f55622h;

        /* renamed from: i  reason: collision with root package name */
        Object f55623i;

        /* renamed from: j  reason: collision with root package name */
        Object f55624j;

        /* renamed from: k  reason: collision with root package name */
        Object f55625k;

        /* renamed from: l  reason: collision with root package name */
        boolean f55626l;

        /* renamed from: m  reason: collision with root package name */
        boolean f55627m;

        b(zz.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f55615a = obj;
            this.f55616b |= Integer.MIN_VALUE;
            return i.d(i.this, null, null, null, null, this);
        }
    }

    static {
        new a(null);
        f55612b = new CacheControl.Builder().noCache().noStore().build();
        f55613c = new CacheControl.Builder().noCache().onlyIfCached().build();
    }

    public i(Call.Factory callFactory) {
        s.g(callFactory, "callFactory");
        this.f55614a = callFactory;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ java.lang.Object d(w5.i r9, t5.b r10, java.lang.Object r11, c6.g r12, v5.j r13, zz.d r14) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w5.i.d(w5.i, t5.b, java.lang.Object, c6.g, v5.j, zz.d):java.lang.Object");
    }

    @Override // w5.g
    public boolean a(T data) {
        s.g(data, "data");
        return g.a.a(this, data);
    }

    @Override // w5.g
    public Object c(t5.b bVar, T t11, c6.g gVar, v5.j jVar, zz.d<? super f> dVar) {
        return d(this, bVar, t11, gVar, jVar, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
        if (r2 != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String e(okhttp3.HttpUrl r5, okhttp3.ResponseBody r6) {
        /*
            r4 = this;
            java.lang.String r0 = "data"
            kotlin.jvm.internal.s.g(r5, r0)
            java.lang.String r0 = "body"
            kotlin.jvm.internal.s.g(r6, r0)
            okhttp3.MediaType r6 = r6.contentType()
            r0 = 0
            if (r6 == 0) goto L16
            java.lang.String r6 = r6.toString()
            goto L17
        L16:
            r6 = r0
        L17:
            r1 = 2
            if (r6 == 0) goto L23
            r2 = 0
            java.lang.String r3 = "text/plain"
            boolean r2 = kotlin.text.m.H(r6, r3, r2, r1, r0)
            if (r2 == 0) goto L37
        L23:
            android.webkit.MimeTypeMap r2 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r3 = "MimeTypeMap.getSingleton()"
            kotlin.jvm.internal.s.f(r2, r3)
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = g6.e.e(r2, r5)
            if (r5 == 0) goto L37
            return r5
        L37:
            if (r6 == 0) goto L3f
            r5 = 59
            java.lang.String r0 = kotlin.text.m.W0(r6, r5, r0, r1, r0)
        L3f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w5.i.e(okhttp3.HttpUrl, okhttp3.ResponseBody):java.lang.String");
    }

    public abstract HttpUrl f(T t11);
}