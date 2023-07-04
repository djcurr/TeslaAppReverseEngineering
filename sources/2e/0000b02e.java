package r5;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import b6.g;
import b6.h;
import g6.k;
import g6.l;
import h00.p;
import java.io.File;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineExceptionHandler;
import okhttp3.Call;
import okhttp3.HttpUrl;
import org.spongycastle.crypto.tls.CipherSuite;
import r5.c;
import v20.a2;
import v20.e1;
import v20.i;
import v20.o0;
import v20.p0;
import v20.y2;
import vz.b0;
import w5.j;
import wz.e0;
import z5.m;
import z5.o;
import z5.r;
import z5.s;
import z5.v;
import z5.w;
import zz.g;

/* loaded from: classes.dex */
public final class f implements r5.d {

    /* renamed from: b  reason: collision with root package name */
    private final o0 f49201b;

    /* renamed from: c  reason: collision with root package name */
    private final z5.a f49202c;

    /* renamed from: d  reason: collision with root package name */
    private final m f49203d;

    /* renamed from: e  reason: collision with root package name */
    private final r f49204e;

    /* renamed from: f  reason: collision with root package name */
    private final v5.g f49205f;

    /* renamed from: g  reason: collision with root package name */
    private final l f49206g;

    /* renamed from: h  reason: collision with root package name */
    private final r5.b f49207h;

    /* renamed from: i  reason: collision with root package name */
    private final List<x5.b> f49208i;

    /* renamed from: j  reason: collision with root package name */
    private final AtomicBoolean f49209j;

    /* renamed from: k  reason: collision with root package name */
    private final b6.b f49210k;

    /* renamed from: l  reason: collision with root package name */
    private final t5.b f49211l;

    /* renamed from: m  reason: collision with root package name */
    private final t5.d f49212m;

    /* renamed from: n  reason: collision with root package name */
    private final s f49213n;

    /* renamed from: o  reason: collision with root package name */
    private final w f49214o;

    /* renamed from: p  reason: collision with root package name */
    private final c.InterfaceC1072c f49215p;

    /* renamed from: q  reason: collision with root package name */
    private final boolean f49216q;

    /* renamed from: r  reason: collision with root package name */
    private final k f49217r;

    /* loaded from: classes.dex */
    public static final class a extends zz.a implements CoroutineExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f49218a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g.c cVar, f fVar) {
            super(cVar);
            this.f49218a = fVar;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(zz.g gVar, Throwable th2) {
            k i11 = this.f49218a.i();
            if (i11 != null) {
                g6.f.a(i11, "RealImageLoader", th2);
            }
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

    @kotlin.coroutines.jvm.internal.f(c = "coil.RealImageLoader$enqueue$job$1", f = "RealImageLoader.kt", l = {119}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements p<o0, zz.d<? super b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        private o0 f49219a;

        /* renamed from: b  reason: collision with root package name */
        Object f49220b;

        /* renamed from: c  reason: collision with root package name */
        int f49221c;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ b6.g f49223e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(b6.g gVar, zz.d dVar) {
            super(2, dVar);
            this.f49223e = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<b0> create(Object obj, zz.d<?> completion) {
            kotlin.jvm.internal.s.g(completion, "completion");
            c cVar = new c(this.f49223e, completion);
            cVar.f49219a = (o0) obj;
            return cVar;
        }

        @Override // h00.p
        public final Object invoke(o0 o0Var, zz.d<? super b0> dVar) {
            return ((c) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f49221c;
            if (i11 == 0) {
                vz.r.b(obj);
                o0 o0Var = this.f49219a;
                f fVar = f.this;
                b6.g gVar = this.f49223e;
                this.f49220b = o0Var;
                this.f49221c = 1;
                obj = fVar.f(gVar, 0, this);
                if (obj == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                o0 o0Var2 = (o0) this.f49220b;
                vz.r.b(obj);
            }
            h hVar = (h) obj;
            if (!(hVar instanceof b6.e)) {
                return b0.f54756a;
            }
            throw ((b6.e) hVar).c();
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "coil.RealImageLoader$execute$2", f = "RealImageLoader.kt", l = {140}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class d extends kotlin.coroutines.jvm.internal.l implements p<o0, zz.d<? super h>, Object> {

        /* renamed from: a  reason: collision with root package name */
        private o0 f49224a;

        /* renamed from: b  reason: collision with root package name */
        Object f49225b;

        /* renamed from: c  reason: collision with root package name */
        int f49226c;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ b6.g f49228e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(b6.g gVar, zz.d dVar) {
            super(2, dVar);
            this.f49228e = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<b0> create(Object obj, zz.d<?> completion) {
            kotlin.jvm.internal.s.g(completion, "completion");
            d dVar = new d(this.f49228e, completion);
            dVar.f49224a = (o0) obj;
            return dVar;
        }

        @Override // h00.p
        public final Object invoke(o0 o0Var, zz.d<? super h> dVar) {
            return ((d) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f49226c;
            if (i11 == 0) {
                vz.r.b(obj);
                o0 o0Var = this.f49224a;
                f fVar = f.this;
                b6.g gVar = this.f49228e;
                this.f49225b = o0Var;
                this.f49226c = 1;
                obj = fVar.f(gVar, 1, this);
                if (obj == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                o0 o0Var2 = (o0) this.f49225b;
                vz.r.b(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "coil.RealImageLoader", f = "RealImageLoader.kt", l = {292, CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA384, 300, 302, 313, 330, 341}, m = "executeMain")
    /* loaded from: classes.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f49229a;

        /* renamed from: b  reason: collision with root package name */
        int f49230b;

        /* renamed from: d  reason: collision with root package name */
        Object f49232d;

        /* renamed from: e  reason: collision with root package name */
        Object f49233e;

        /* renamed from: f  reason: collision with root package name */
        Object f49234f;

        /* renamed from: g  reason: collision with root package name */
        Object f49235g;

        /* renamed from: h  reason: collision with root package name */
        Object f49236h;

        /* renamed from: i  reason: collision with root package name */
        Object f49237i;

        /* renamed from: j  reason: collision with root package name */
        Object f49238j;

        /* renamed from: k  reason: collision with root package name */
        Object f49239k;

        /* renamed from: l  reason: collision with root package name */
        Object f49240l;

        /* renamed from: m  reason: collision with root package name */
        Object f49241m;

        /* renamed from: n  reason: collision with root package name */
        Object f49242n;

        /* renamed from: o  reason: collision with root package name */
        Object f49243o;

        /* renamed from: p  reason: collision with root package name */
        Object f49244p;

        /* renamed from: q  reason: collision with root package name */
        int f49245q;

        e(zz.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f49229a = obj;
            this.f49230b |= Integer.MIN_VALUE;
            return f.this.f(null, 0, this);
        }
    }

    static {
        new b(null);
    }

    public f(Context context, b6.b defaults, t5.b bitmapPool, t5.d referenceCounter, s strongMemoryCache, w weakMemoryCache, Call.Factory callFactory, c.InterfaceC1072c eventListenerFactory, r5.b componentRegistry, boolean z11, boolean z12, k kVar) {
        List<x5.b> z02;
        kotlin.jvm.internal.s.g(context, "context");
        kotlin.jvm.internal.s.g(defaults, "defaults");
        kotlin.jvm.internal.s.g(bitmapPool, "bitmapPool");
        kotlin.jvm.internal.s.g(referenceCounter, "referenceCounter");
        kotlin.jvm.internal.s.g(strongMemoryCache, "strongMemoryCache");
        kotlin.jvm.internal.s.g(weakMemoryCache, "weakMemoryCache");
        kotlin.jvm.internal.s.g(callFactory, "callFactory");
        kotlin.jvm.internal.s.g(eventListenerFactory, "eventListenerFactory");
        kotlin.jvm.internal.s.g(componentRegistry, "componentRegistry");
        this.f49210k = defaults;
        this.f49211l = bitmapPool;
        this.f49212m = referenceCounter;
        this.f49213n = strongMemoryCache;
        this.f49214o = weakMemoryCache;
        this.f49215p = eventListenerFactory;
        this.f49216q = z12;
        this.f49217r = kVar;
        this.f49201b = p0.a(y2.b(null, 1, null).plus(e1.c().R0()).plus(new a(CoroutineExceptionHandler.f35225e1, this)));
        this.f49202c = new z5.a(this, referenceCounter, kVar);
        m mVar = new m(referenceCounter, strongMemoryCache, weakMemoryCache);
        this.f49203d = mVar;
        r rVar = new r(kVar);
        this.f49204e = rVar;
        new o(strongMemoryCache, weakMemoryCache, referenceCounter);
        v5.g gVar = new v5.g(g());
        this.f49205f = gVar;
        l lVar = new l(this, context);
        this.f49206g = lVar;
        r5.b d11 = componentRegistry.e().c(new y5.e(), String.class).c(new y5.a(), Uri.class).c(new y5.d(context), Uri.class).c(new y5.c(context), Integer.class).b(new j(callFactory), Uri.class).b(new w5.k(callFactory), HttpUrl.class).b(new w5.h(z11), File.class).b(new w5.a(context), Uri.class).b(new w5.c(context), Uri.class).b(new w5.l(context, gVar), Uri.class).b(new w5.d(gVar), Drawable.class).b(new w5.b(), Bitmap.class).a(new v5.a(context)).d();
        this.f49207h = d11;
        z02 = e0.z0(d11.c(), new x5.a(d11, g(), referenceCounter, strongMemoryCache, mVar, rVar, lVar, gVar, kVar));
        this.f49208i = z02;
        this.f49209j = new AtomicBoolean(false);
    }

    private final void j(b6.g gVar, r5.c cVar) {
        k kVar = this.f49217r;
        if (kVar != null && kVar.getLevel() <= 4) {
            kVar.a("RealImageLoader", 4, "🏗  Cancelled - " + gVar.l(), null);
        }
        cVar.b(gVar);
        g.b w11 = gVar.w();
        if (w11 != null) {
            w11.b(gVar);
        }
    }

    @Override // r5.d
    public b6.d a(b6.g request) {
        a2 d11;
        kotlin.jvm.internal.s.g(request, "request");
        d11 = v20.k.d(this.f49201b, null, null, new c(request, null), 3, null);
        if (request.G() instanceof d6.c) {
            return new b6.l(g6.e.g(((d6.c) request.G()).getView()).f(d11), (d6.c) request.G());
        }
        return new b6.a(d11);
    }

    @Override // r5.d
    public Object b(b6.g gVar, zz.d<? super h> dVar) {
        if (gVar.G() instanceof d6.c) {
            v g11 = g6.e.g(((d6.c) gVar.G()).getView());
            g.b bVar = dVar.getContext().get(a2.f53887l1);
            kotlin.jvm.internal.s.e(bVar);
            g11.f((a2) bVar);
        }
        return i.g(e1.c().R0(), new d(gVar, null), dVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:1|(2:3|(4:5|6|7|8))|321|6|7|8|(3:(0)|(1:278)|(1:98))) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0175, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0176, code lost:
        r19 = " - ";
        r17 = "🚨 Failed - ";
        r3 = r11;
        r2 = r13;
        r11 = r15;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x017a: MOVE  (r3 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r11 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:35:0x0176 */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x017b: MOVE  (r2 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]), block:B:35:0x0176 */
    /* JADX WARN: Not initialized variable reg: 15, insn: 0x017c: MOVE  (r11 I:??[OBJECT, ARRAY]) = (r15 I:??[OBJECT, ARRAY]), block:B:35:0x0176 */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x044c A[Catch: all -> 0x0481, TRY_LEAVE, TryCatch #15 {all -> 0x0481, blocks: (B:128:0x0443, B:130:0x044c), top: B:296:0x0443 }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x049a A[Catch: all -> 0x04ae, TryCatch #5 {all -> 0x04ae, blocks: (B:151:0x048e, B:153:0x049a, B:155:0x049e, B:157:0x04a6, B:158:0x04ad), top: B:277:0x048e }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x056e A[Catch: all -> 0x057f, TryCatch #12 {all -> 0x057f, blocks: (B:199:0x055e, B:201:0x056e, B:202:0x057a), top: B:290:0x055e }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x05ce A[Catch: all -> 0x065f, TryCatch #32 {all -> 0x065f, blocks: (B:239:0x05ca, B:241:0x05ce, B:243:0x05de, B:245:0x05e5, B:247:0x0610, B:249:0x0615, B:260:0x065b, B:261:0x065e), top: B:329:0x05ca }] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x064c A[Catch: all -> 0x0066, TryCatch #2 {all -> 0x0066, blocks: (B:13:0x0061, B:254:0x063f, B:256:0x064c, B:257:0x0655), top: B:271:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:260:0x065b A[Catch: all -> 0x065f, TRY_ENTER, TryCatch #32 {all -> 0x065f, blocks: (B:239:0x05ca, B:241:0x05ce, B:243:0x05de, B:245:0x05e5, B:247:0x0610, B:249:0x0615, B:260:0x065b, B:261:0x065e), top: B:329:0x05ca }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x03a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02a3 A[Catch: all -> 0x05a1, TRY_LEAVE, TryCatch #0 {all -> 0x05a1, blocks: (B:85:0x0300, B:87:0x032b, B:97:0x0367, B:66:0x0297, B:68:0x02a3, B:79:0x02d8, B:81:0x02dc, B:82:0x02df), top: B:268:0x0297 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02b0 A[Catch: all -> 0x05a7, TryCatch #3 {all -> 0x05a7, blocks: (B:72:0x02ab, B:74:0x02b0, B:76:0x02c7, B:78:0x02d3, B:75:0x02c3), top: B:273:0x02ab }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02c3 A[Catch: all -> 0x05a7, TryCatch #3 {all -> 0x05a7, blocks: (B:72:0x02ab, B:74:0x02b0, B:76:0x02c7, B:78:0x02d3, B:75:0x02c3), top: B:273:0x02ab }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02d3 A[Catch: all -> 0x05a7, TRY_LEAVE, TryCatch #3 {all -> 0x05a7, blocks: (B:72:0x02ab, B:74:0x02b0, B:76:0x02c7, B:78:0x02d3, B:75:0x02c3), top: B:273:0x02ab }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02dc A[Catch: all -> 0x05a1, TryCatch #0 {all -> 0x05a1, blocks: (B:85:0x0300, B:87:0x032b, B:97:0x0367, B:66:0x0297, B:68:0x02a3, B:79:0x02d8, B:81:0x02dc, B:82:0x02df), top: B:268:0x0297 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02ff A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x032b A[Catch: all -> 0x05a1, TRY_LEAVE, TryCatch #0 {all -> 0x05a1, blocks: (B:85:0x0300, B:87:0x032b, B:97:0x0367, B:66:0x0297, B:68:0x02a3, B:79:0x02d8, B:81:0x02dc, B:82:0x02df), top: B:268:0x0297 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0367 A[Catch: all -> 0x05a1, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x05a1, blocks: (B:85:0x0300, B:87:0x032b, B:97:0x0367, B:66:0x0297, B:68:0x02a3, B:79:0x02d8, B:81:0x02dc, B:82:0x02df), top: B:268:0x0297 }] */
    /* JADX WARN: Type inference failed for: r1v8, types: [T, x5.c] */
    /* JADX WARN: Type inference failed for: r6v0, types: [int] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r6v42 */
    /* JADX WARN: Type inference failed for: r6v44 */
    /* JADX WARN: Type inference failed for: r6v46 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v51 */
    /* JADX WARN: Type inference failed for: r6v66 */
    /* JADX WARN: Type inference failed for: r6v67 */
    /* JADX WARN: Type inference failed for: r6v72 */
    /* JADX WARN: Type inference failed for: r6v73 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final /* synthetic */ java.lang.Object f(b6.g r28, int r29, zz.d<? super b6.h> r30) {
        /*
            Method dump skipped, instructions count: 1670
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r5.f.f(b6.g, int, zz.d):java.lang.Object");
    }

    public t5.b g() {
        return this.f49211l;
    }

    public b6.b h() {
        return this.f49210k;
    }

    public final k i() {
        return this.f49217r;
    }

    public final void k(int i11) {
        this.f49213n.a(i11);
        this.f49214o.a(i11);
        g().a(i11);
    }
}