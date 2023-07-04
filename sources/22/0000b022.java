package r5;

import android.graphics.Bitmap;
import b6.g;
import b6.h;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import v5.j;

/* loaded from: classes.dex */
public interface c extends g.b {

    /* renamed from: a  reason: collision with root package name */
    public static final c f49182a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: r5.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C1071a implements c {
            C1071a() {
            }

            @Override // r5.c, b6.g.b
            public void a(b6.g request, h.a metadata) {
                s.g(request, "request");
                s.g(metadata, "metadata");
                a.j(this, request, metadata);
            }

            @Override // r5.c, b6.g.b
            public void b(b6.g request) {
                s.g(request, "request");
                a.g(this, request);
            }

            @Override // r5.c, b6.g.b
            public void c(b6.g request, Throwable throwable) {
                s.g(request, "request");
                s.g(throwable, "throwable");
                a.h(this, request, throwable);
            }

            @Override // r5.c, b6.g.b
            public void d(b6.g request) {
                s.g(request, "request");
                a.i(this, request);
            }

            @Override // r5.c
            public void e(b6.g request) {
                s.g(request, "request");
                a.o(this, request);
            }

            @Override // r5.c
            public void f(b6.g request, Bitmap output) {
                s.g(request, "request");
                s.g(output, "output");
                a.m(this, request, output);
            }

            @Override // r5.c
            public void g(b6.g request) {
                s.g(request, "request");
                a.l(this, request);
            }

            @Override // r5.c
            public void h(b6.g request, Bitmap input) {
                s.g(request, "request");
                s.g(input, "input");
                a.n(this, request, input);
            }

            @Override // r5.c
            public void i(b6.g request) {
                s.g(request, "request");
                a.p(this, request);
            }

            @Override // r5.c
            public void j(b6.g request, Object input) {
                s.g(request, "request");
                s.g(input, "input");
                a.f(this, request, input);
            }

            @Override // r5.c
            public void k(b6.g request, Object output) {
                s.g(request, "request");
                s.g(output, "output");
                a.e(this, request, output);
            }

            @Override // r5.c
            public void l(b6.g request, w5.g<?> fetcher, j options) {
                s.g(request, "request");
                s.g(fetcher, "fetcher");
                s.g(options, "options");
                a.d(this, request, fetcher, options);
            }

            @Override // r5.c
            public void m(b6.g request, v5.f decoder, j options, v5.c result) {
                s.g(request, "request");
                s.g(decoder, "decoder");
                s.g(options, "options");
                s.g(result, "result");
                a.a(this, request, decoder, options, result);
            }

            @Override // r5.c
            public void n(b6.g request, c6.g size) {
                s.g(request, "request");
                s.g(size, "size");
                a.k(this, request, size);
            }

            @Override // r5.c
            public void o(b6.g request, w5.g<?> fetcher, j options, w5.f result) {
                s.g(request, "request");
                s.g(fetcher, "fetcher");
                s.g(options, "options");
                s.g(result, "result");
                a.c(this, request, fetcher, options, result);
            }

            @Override // r5.c
            public void p(b6.g request, v5.f decoder, j options) {
                s.g(request, "request");
                s.g(decoder, "decoder");
                s.g(options, "options");
                a.b(this, request, decoder, options);
            }
        }

        public static void a(c cVar, b6.g request, v5.f decoder, j options, v5.c result) {
            s.g(request, "request");
            s.g(decoder, "decoder");
            s.g(options, "options");
            s.g(result, "result");
        }

        public static void b(c cVar, b6.g request, v5.f decoder, j options) {
            s.g(request, "request");
            s.g(decoder, "decoder");
            s.g(options, "options");
        }

        public static void c(c cVar, b6.g request, w5.g<?> fetcher, j options, w5.f result) {
            s.g(request, "request");
            s.g(fetcher, "fetcher");
            s.g(options, "options");
            s.g(result, "result");
        }

        public static void d(c cVar, b6.g request, w5.g<?> fetcher, j options) {
            s.g(request, "request");
            s.g(fetcher, "fetcher");
            s.g(options, "options");
        }

        public static void e(c cVar, b6.g request, Object output) {
            s.g(request, "request");
            s.g(output, "output");
        }

        public static void f(c cVar, b6.g request, Object input) {
            s.g(request, "request");
            s.g(input, "input");
        }

        public static void g(c cVar, b6.g request) {
            s.g(request, "request");
        }

        public static void h(c cVar, b6.g request, Throwable throwable) {
            s.g(request, "request");
            s.g(throwable, "throwable");
        }

        public static void i(c cVar, b6.g request) {
            s.g(request, "request");
        }

        public static void j(c cVar, b6.g request, h.a metadata) {
            s.g(request, "request");
            s.g(metadata, "metadata");
        }

        public static void k(c cVar, b6.g request, c6.g size) {
            s.g(request, "request");
            s.g(size, "size");
        }

        public static void l(c cVar, b6.g request) {
            s.g(request, "request");
        }

        public static void m(c cVar, b6.g request, Bitmap output) {
            s.g(request, "request");
            s.g(output, "output");
        }

        public static void n(c cVar, b6.g request, Bitmap input) {
            s.g(request, "request");
            s.g(input, "input");
        }

        public static void o(c cVar, b6.g request) {
            s.g(request, "request");
        }

        public static void p(c cVar, b6.g request) {
            s.g(request, "request");
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: r5.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC1072c {

        /* renamed from: a  reason: collision with root package name */
        public static final InterfaceC1072c f49183a;

        /* renamed from: b  reason: collision with root package name */
        public static final a f49184b;

        /* renamed from: r5.c$c$a */
        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: r5.c$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C1073a implements InterfaceC1072c {

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ c f49185c;

                C1073a(c cVar) {
                    this.f49185c = cVar;
                }

                @Override // r5.c.InterfaceC1072c
                public c a(b6.g request) {
                    s.g(request, "request");
                    return this.f49185c;
                }
            }

            private a() {
            }

            public final InterfaceC1072c a(c listener) {
                s.g(listener, "listener");
                return new C1073a(listener);
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            a aVar = new a(null);
            f49184b = aVar;
            f49183a = aVar.a(c.f49182a);
        }

        c a(b6.g gVar);
    }

    static {
        new b(null);
        f49182a = new a.C1071a();
    }

    @Override // b6.g.b
    void a(b6.g gVar, h.a aVar);

    @Override // b6.g.b
    void b(b6.g gVar);

    @Override // b6.g.b
    void c(b6.g gVar, Throwable th2);

    @Override // b6.g.b
    void d(b6.g gVar);

    void e(b6.g gVar);

    void f(b6.g gVar, Bitmap bitmap);

    void g(b6.g gVar);

    void h(b6.g gVar, Bitmap bitmap);

    void i(b6.g gVar);

    void j(b6.g gVar, Object obj);

    void k(b6.g gVar, Object obj);

    void l(b6.g gVar, w5.g<?> gVar2, j jVar);

    void m(b6.g gVar, v5.f fVar, j jVar, v5.c cVar);

    void n(b6.g gVar, c6.g gVar2);

    void o(b6.g gVar, w5.g<?> gVar2, j jVar, w5.f fVar);

    void p(b6.g gVar, v5.f fVar, j jVar);
}