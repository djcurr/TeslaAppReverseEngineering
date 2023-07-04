package ss;

import android.content.Context;
import com.google.android.vending.expansion.downloader.impl.DownloaderService;
import com.tesla.command.CommandCenterBackgroundTasker;
import gu.t;
import it.d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import ku.a;
import lt.w2;
import ss.h;
import ts.e0;
import uu.f;
import vz.v;
import wz.s0;
import wz.w;
import wz.x0;
import yu.e;
import yu.y;
import yu.z;

/* loaded from: classes6.dex */
public final class q implements j {

    /* renamed from: j */
    public static final a f50617j = new a(null);

    /* renamed from: k */
    private static final com.tesla.logging.g f50618k = com.tesla.logging.g.f21878b.a("CC");

    /* renamed from: l */
    private static final Set<ot.f> f50619l;

    /* renamed from: m */
    private static j f50620m;

    /* renamed from: a */
    private final Context f50621a;

    /* renamed from: b */
    private final j f50622b;

    /* renamed from: c */
    private final j f50623c;

    /* renamed from: d */
    private final j f50624d;

    /* renamed from: e */
    private final es.c f50625e;

    /* renamed from: f */
    private final yu.e f50626f;

    /* renamed from: g */
    private final ku.e f50627g;

    /* renamed from: h */
    private final List<j> f50628h;

    /* renamed from: i */
    private final ConcurrentSkipListSet<String> f50629i;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final j a(Context context) {
            s.g(context, "context");
            Context appContext = context.getApplicationContext();
            if (q.f50620m == null) {
                y.a aVar = y.f59842h;
                s.f(appContext, "appContext");
                y a11 = aVar.a(appContext);
                yu.m b11 = yu.m.f59801c.b(appContext);
                e.a aVar2 = yu.e.f59783c;
                yu.e a12 = aVar2.a();
                at.e a13 = at.d.a(appContext);
                com.tesla.data.oapi.h a14 = com.tesla.data.oapi.h.f21733b.a(context);
                vu.a a15 = vu.a.f54617a.a();
                ct.i realmHelper = ct.i.i();
                ys.j a16 = ys.j.f59731c.a(new ys.a(a12), a12);
                t a17 = t.f28135c.a(gu.f.f28098b.a(zs.d.f60700a.a(context)), gu.o.f28120c.a(a11, a14));
                h.a aVar3 = h.f50534l;
                f.a aVar4 = uu.f.f53677a;
                j d11 = aVar3.d(appContext, b11, a12, aVar4.a(a15, ot.m.TRANSPORT_BLUETOOTH), a15, a17);
                e0.a aVar5 = e0.A;
                es.c a18 = es.b.a();
                ys.e a19 = ys.e.f59712d.a(a11, a13, a14);
                ys.i a21 = ys.i.f59725e.a(a11, es.b.a(), a13, a14);
                uu.f a22 = aVar4.a(a15, ot.m.TRANSPORT_HERMES);
                z p11 = z.p(appContext);
                d.a aVar6 = it.d.f32752a;
                s.f(realmHelper, "realmHelper");
                it.d a23 = aVar6.a(realmHelper);
                zu.c a24 = zu.c.f60760g3.a(appContext);
                s.f(p11, "getInstance(appContext)");
                q.f50620m = new q(appContext, d11, aVar5.a(appContext, p11, a15, a22, b11, a12, a18, a19, a21, a23, a24, a17), new n(b11, a12, a11, a14, context), es.b.a(), aVar2.a(), a16, null, 128, null);
            }
            j jVar = q.f50620m;
            if (jVar == null) {
                s.x("INSTANCE");
                return null;
            }
            return jVar;
        }
    }

    /* loaded from: classes6.dex */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f50630a;

        static {
            int[] iArr = new int[ot.m.values().length];
            iArr[ot.m.TRANSPORT_OWNER_API.ordinal()] = 1;
            iArr[ot.m.TRANSPORT_HERMES.ordinal()] = 2;
            iArr[ot.m.TRANSPORT_BLUETOOTH.ordinal()] = 3;
            iArr[ot.m.TRANSPORT_NONE.ordinal()] = 4;
            f50630a = iArr;
        }
    }

    /* loaded from: classes6.dex */
    static final class c extends u implements h00.l<j, CharSequence> {

        /* renamed from: a */
        public static final c f50631a = new c();

        c() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final CharSequence mo12invoke(j it2) {
            s.g(it2, "it");
            return ps.a.b(it2.a());
        }
    }

    static {
        Set<ot.f> i11;
        i11 = x0.i(ot.f.RESULT_SUCCESS, ot.f.RESULT_NOMINAL_ERROR);
        f50619l = i11;
    }

    public q(Context context, j bluetooth, j hermes, j oapi, es.c analyticsService, yu.e getVehicleData, ys.j getTransportsList, ku.e monitoringService) {
        List<j> l11;
        s.g(context, "context");
        s.g(bluetooth, "bluetooth");
        s.g(hermes, "hermes");
        s.g(oapi, "oapi");
        s.g(analyticsService, "analyticsService");
        s.g(getVehicleData, "getVehicleData");
        s.g(getTransportsList, "getTransportsList");
        s.g(monitoringService, "monitoringService");
        this.f50621a = context;
        this.f50622b = bluetooth;
        this.f50623c = hermes;
        this.f50624d = oapi;
        this.f50625e = analyticsService;
        this.f50626f = getVehicleData;
        this.f50627g = monitoringService;
        l11 = w.l(bluetooth, hermes, oapi);
        this.f50628h = l11;
        this.f50629i = new ConcurrentSkipListSet<>();
    }

    public static /* synthetic */ void d(q qVar, String str, ot.c cVar, uu.d dVar, ku.i iVar) {
        q(qVar, str, cVar, dVar, iVar);
    }

    public static /* synthetic */ void e(q qVar, List list, ot.c cVar, ot.m mVar, ku.i iVar, boolean z11, j jVar, int i11, String str, uu.d dVar, ku.i iVar2, List list2, ot.e eVar) {
        j(qVar, list, cVar, mVar, iVar, z11, jVar, i11, str, dVar, iVar2, list2, eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x001f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x009c A[Catch: Exception -> 0x0018, TryCatch #0 {Exception -> 0x0018, blocks: (B:66:0x000e, B:78:0x004e, B:86:0x008f, B:93:0x009c, B:97:0x00ab, B:99:0x00c0, B:101:0x00d6, B:107:0x010b, B:108:0x0110, B:109:0x0111, B:110:0x0118, B:111:0x0119, B:114:0x0121, B:112:0x011c, B:113:0x011f), top: B:118:0x000e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void h(final java.util.List<? extends ss.j> r30, final ot.c r31, final uu.d r32, final ku.i r33, final int r34, ot.f r35) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ss.q.h(java.util.List, ot.c, uu.d, ku.i, int, ot.f):void");
    }

    static /* synthetic */ void i(q qVar, List list, ot.c cVar, uu.d dVar, ku.i iVar, int i11, ot.f fVar, int i12, Object obj) {
        if ((i12 & 16) != 0) {
            i11 = 0;
        }
        int i13 = i11;
        if ((i12 & 32) != 0) {
            fVar = null;
        }
        qVar.h(list, cVar, dVar, iVar, i13, fVar);
    }

    public static final void j(q this$0, List analyticsParameters, ot.c request, ot.m currentTransport, ku.i transportCommandToken, boolean z11, j currentDispatcher, int i11, String commandId, uu.d listener, ku.i trace, List dispatchers, ot.e response) {
        jt.f b11;
        List l11;
        List<jt.f> y02;
        ot.f fVar;
        ku.i iVar;
        ot.c cVar;
        Map l12;
        s.g(this$0, "this$0");
        s.g(analyticsParameters, "$analyticsParameters");
        s.g(request, "$request");
        s.g(currentTransport, "$currentTransport");
        s.g(transportCommandToken, "$transportCommandToken");
        s.g(currentDispatcher, "$currentDispatcher");
        s.g(commandId, "$commandId");
        s.g(listener, "$listener");
        s.g(trace, "$trace");
        s.g(dispatchers, "$dispatchers");
        s.g(response, "response");
        ot.f h11 = response.h();
        es.c cVar2 = this$0.f50625e;
        jt.d dVar = jt.d.SEND_COMMAND_ATTEMPT;
        jt.f[] fVarArr = new jt.f[4];
        os.b bVar = os.b.f43973a;
        fVarArr[0] = bVar.c(response.f());
        fVarArr[1] = bVar.d(response.j());
        if (us.a.b(h11)) {
            b11 = fs.a.g();
        } else {
            b11 = fs.a.b();
        }
        fVarArr[2] = b11;
        fVarArr[3] = fs.a.f(h11);
        l11 = w.l(fVarArr);
        y02 = wz.e0.y0(analyticsParameters, l11);
        cVar2.a(dVar, y02);
        String a11 = ps.a.a(h11);
        String b12 = ps.a.b(currentTransport);
        o(this$0, request, "tesla dispatcher received " + a11 + " from " + b12, null, 2, null);
        transportCommandToken.a(this$0.r(request, response));
        if (!f50619l.contains(h11) && z11) {
            o(this$0, request, "trying next dispatcher...", null, 2, null);
            if (currentDispatcher.a() == ot.m.TRANSPORT_HERMES) {
                l12 = s0.l(v.a("X-Command-Fallback-Reason", ps.a.a(response.h())), v.a("X-Command-Fallback-Origin-Txid", response.f()));
                fVar = h11;
                iVar = trace;
                cVar = ot.c.b(request, null, null, null, null, l12, false, false, null, null, DownloaderService.STATUS_HTTP_DATA_ERROR, null);
            } else {
                fVar = h11;
                iVar = trace;
                cVar = request;
            }
            k(request, this$0, dispatchers, listener, trace, i11, fVar, cVar);
        } else if (this$0.f50629i.remove(commandId)) {
            String a12 = ps.a.a(h11);
            this$0.n(request, "notifying root listener of " + a12 + "!", com.tesla.logging.d.DEBUG);
            this$0.p(request, response, listener);
            trace.a(this$0.r(request, response));
        } else {
            trace.a(this$0.r(request, response));
            this$0.n(request, "received response but cannot do anything with it.", com.tesla.logging.d.ERROR);
        }
    }

    private static final void k(ot.c cVar, q qVar, List<? extends j> list, uu.d dVar, ku.i iVar, int i11, ot.f fVar, ot.c cVar2) {
        qVar.h(list, cVar2, dVar, iVar, i11 + 1, fVar);
    }

    static /* synthetic */ void l(ot.c cVar, q qVar, List list, uu.d dVar, ku.i iVar, int i11, ot.f fVar, ot.c cVar2, int i12, Object obj) {
        k(cVar, qVar, list, dVar, iVar, i11, fVar, (i12 & 128) != 0 ? cVar : cVar2);
    }

    private final List<j> m(ot.c cVar) {
        List<ot.m> i11 = cVar.i();
        ArrayList arrayList = new ArrayList();
        if (i11.contains(ot.m.TRANSPORT_BLUETOOTH)) {
            arrayList.add(this.f50622b);
        }
        if (i11.contains(ot.m.TRANSPORT_HERMES)) {
            arrayList.add(this.f50623c);
        }
        if (i11.contains(ot.m.TRANSPORT_OWNER_API)) {
            arrayList.add(this.f50624d);
        }
        return arrayList;
    }

    private final void n(ot.c cVar, String str, com.tesla.logging.d dVar) {
        us.c.b(cVar, str, f50618k, dVar);
    }

    static /* synthetic */ void o(q qVar, ot.c cVar, String str, com.tesla.logging.d dVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            dVar = com.tesla.logging.d.INFO;
        }
        qVar.n(cVar, str, dVar);
    }

    private final void p(ot.c cVar, ot.e eVar, uu.d dVar) {
        CommandCenterBackgroundTasker commandCenterBackgroundTasker = CommandCenterBackgroundTasker.f21463a;
        Context context = this.f50621a;
        ot.b c11 = cVar.c();
        s.e(c11);
        commandCenterBackgroundTasker.d(context, c11, eVar);
        Context context2 = this.f50621a;
        ot.b c12 = cVar.c();
        s.e(c12);
        commandCenterBackgroundTasker.e(context2, c12);
        dVar.a(eVar);
    }

    public static final void q(q this$0, String commandId, ot.c request, uu.d listener, ku.i trace) {
        List<jt.f> l11;
        s.g(this$0, "this$0");
        s.g(commandId, "$commandId");
        s.g(request, "$request");
        s.g(listener, "$listener");
        s.g(trace, "$trace");
        if (this$0.f50629i.remove(commandId)) {
            o(this$0, request, "GLOBAL TIMEOUT", null, 2, null);
            ot.e eVar = new ot.e(commandId, null, null, ot.f.RESULT_TIMEOUT, null, 0, null, null, null, null, 1014, null);
            this$0.c(request);
            this$0.p(request, eVar, listener);
            trace.a(this$0.r(request, eVar));
            es.c cVar = this$0.f50625e;
            jt.d dVar = jt.d.SEND_COMMAND_ATTEMPT;
            os.b bVar = os.b.f43973a;
            l11 = w.l(bVar.a(commandId), bVar.b(request), fs.a.b(), fs.a.f(eVar.h()));
            cVar.a(dVar, l11);
        }
    }

    private final List<ku.a> r(ot.c cVar, ot.e eVar) {
        String g11;
        List<ku.a> o11;
        w2 a11 = this.f50626f.a(cVar.j());
        String str = "undetermined";
        if (a11 == null) {
            g11 = "undetermined";
        } else {
            str = String.valueOf(et.a.f(a11));
            g11 = et.a.g(a11);
        }
        a.C0683a c0683a = ku.a.f35879c;
        o11 = w.o(c0683a.a("result", ps.a.a(eVar.h())), c0683a.a("car_api_version", str), c0683a.a("car_type", g11));
        if (eVar.k() != ot.m.TRANSPORT_NONE) {
            o11.add(c0683a.a("transport", ps.a.b(eVar.k())));
        }
        if (b.f50630a[eVar.k().ordinal()] == 2) {
            o11.add(c0683a.a("in_whitelist", Boolean.valueOf(eVar.h() != ot.f.RESULT_NOT_IN_WHITELIST)));
        }
        return o11;
    }

    @Override // ss.i
    public ot.m a() {
        throw new IllegalStateException("Not a valid transport");
    }

    @Override // ss.j
    public void b(final ot.c request, final uu.d listener) {
        List<ku.a> d11;
        String l02;
        s.g(request, "request");
        s.g(listener, "listener");
        ot.d h11 = request.h();
        if (h11 == ot.d.SOURCE_NONE) {
            n(request, "ERROR! Request has no UI_SOURCE source NONE!", com.tesla.logging.d.ERROR);
        }
        final String d12 = gu.c.d(request);
        o(this, request, "ENTERED COMMAND CENTER FROM " + h11 + "!", null, 2, null);
        ku.e eVar = this.f50627g;
        tt.l lVar = tt.l.COMMAND;
        d11 = wz.v.d(ku.a.f35879c.a("command", uu.c.b(request)));
        final ku.i f11 = eVar.f(lVar, d11);
        this.f50629i.add(d12);
        CommandCenterBackgroundTasker commandCenterBackgroundTasker = CommandCenterBackgroundTasker.f21463a;
        Context context = this.f50621a;
        ot.b c11 = request.c();
        s.e(c11);
        commandCenterBackgroundTasker.f(context, c11);
        hy.b.j(60L, TimeUnit.SECONDS).g(new ky.a() { // from class: ss.o
            @Override // ky.a
            public final void run() {
                q.d(q.this, d12, request, listener, f11);
            }
        });
        List<j> m11 = m(request);
        l02 = wz.e0.l0(m11, null, null, null, 0, null, c.f50631a, 31, null);
        o(this, request, "dispatching sequentially into transports: " + l02, null, 2, null);
        i(this, m11, request, listener, f11, 0, null, 48, null);
    }

    @Override // ss.j
    public void c(ot.c request) {
        s.g(request, "request");
        o(this, request, "cancelling", null, 2, null);
        for (j jVar : this.f50628h) {
            jVar.c(request);
        }
    }

    public /* synthetic */ q(Context context, j jVar, j jVar2, j jVar3, es.c cVar, yu.e eVar, ys.j jVar4, ku.e eVar2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, jVar, jVar2, jVar3, cVar, eVar, jVar4, (i11 & 128) != 0 ? ku.e.f35884a.a() : eVar2);
    }
}