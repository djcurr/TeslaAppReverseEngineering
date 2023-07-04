package r5;

import android.content.Context;
import b6.h;
import g6.i;
import g6.k;
import g6.m;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import r5.c;
import z5.q;
import z5.w;

/* loaded from: classes.dex */
public interface d {

    /* renamed from: a  reason: collision with root package name */
    public static final b f49186a = b.f49200a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Context f49187a;

        /* renamed from: b  reason: collision with root package name */
        private Call.Factory f49188b;

        /* renamed from: c  reason: collision with root package name */
        private c.InterfaceC1072c f49189c;

        /* renamed from: d  reason: collision with root package name */
        private r5.b f49190d;

        /* renamed from: e  reason: collision with root package name */
        private k f49191e;

        /* renamed from: f  reason: collision with root package name */
        private b6.b f49192f;

        /* renamed from: g  reason: collision with root package name */
        private double f49193g;

        /* renamed from: h  reason: collision with root package name */
        private double f49194h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f49195i;

        /* renamed from: j  reason: collision with root package name */
        private boolean f49196j;

        /* renamed from: k  reason: collision with root package name */
        private boolean f49197k;

        /* renamed from: l  reason: collision with root package name */
        private boolean f49198l;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: r5.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C1074a extends u implements h00.a<Call.Factory> {
            C1074a() {
                super(0);
            }

            @Override // h00.a
            /* renamed from: a */
            public final Call.Factory invoke() {
                OkHttpClient.Builder builder = new OkHttpClient.Builder();
                Context applicationContext = a.this.f49187a;
                s.f(applicationContext, "applicationContext");
                OkHttpClient build = builder.cache(i.a(applicationContext)).build();
                s.f(build, "OkHttpClient.Builder()\n …\n                .build()");
                return build;
            }
        }

        public a(Context context) {
            s.g(context, "context");
            Context applicationContext = context.getApplicationContext();
            this.f49187a = applicationContext;
            this.f49192f = b6.b.f7411m;
            m mVar = m.f27804a;
            s.f(applicationContext, "applicationContext");
            this.f49193g = mVar.e(applicationContext);
            this.f49194h = mVar.f();
            this.f49195i = true;
            this.f49196j = true;
            this.f49197k = true;
            this.f49198l = true;
        }

        private final Call.Factory c() {
            return g6.e.l(new C1074a());
        }

        public final d b() {
            w wVar;
            t5.d dVar;
            m mVar = m.f27804a;
            Context applicationContext = this.f49187a;
            s.f(applicationContext, "applicationContext");
            long b11 = mVar.b(applicationContext, this.f49193g);
            int i11 = (int) ((this.f49196j ? this.f49194h : 0.0d) * b11);
            int i12 = (int) (b11 - i11);
            t5.f fVar = new t5.f(i11, null, null, this.f49191e, 6, null);
            if (this.f49198l) {
                wVar = new q(this.f49191e);
            } else {
                wVar = z5.d.f60223a;
            }
            w wVar2 = wVar;
            if (this.f49196j) {
                dVar = new t5.g(wVar2, fVar, this.f49191e);
            } else {
                dVar = t5.e.f51640a;
            }
            t5.d dVar2 = dVar;
            z5.s a11 = z5.s.f60316a.a(wVar2, dVar2, i12, this.f49191e);
            Context applicationContext2 = this.f49187a;
            s.f(applicationContext2, "applicationContext");
            b6.b bVar = this.f49192f;
            Call.Factory factory = this.f49188b;
            if (factory == null) {
                factory = c();
            }
            Call.Factory factory2 = factory;
            c.InterfaceC1072c interfaceC1072c = this.f49189c;
            if (interfaceC1072c == null) {
                interfaceC1072c = c.InterfaceC1072c.f49183a;
            }
            c.InterfaceC1072c interfaceC1072c2 = interfaceC1072c;
            r5.b bVar2 = this.f49190d;
            if (bVar2 == null) {
                bVar2 = new r5.b();
            }
            return new f(applicationContext2, bVar, fVar, dVar2, a11, wVar2, factory2, interfaceC1072c2, bVar2, this.f49195i, this.f49197k, this.f49191e);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ b f49200a = new b();

        private b() {
        }

        public final d a(Context context) {
            s.g(context, "context");
            return new a(context).b();
        }
    }

    b6.d a(b6.g gVar);

    Object b(b6.g gVar, zz.d<? super h> dVar);
}