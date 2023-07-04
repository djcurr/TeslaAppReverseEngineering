package x5;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import b6.j;
import com.google.android.gms.wallet.WalletConstants;
import g6.h;
import g6.k;
import g6.l;
import h00.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.l0;
import t5.d;
import v20.o0;
import v5.e;
import v5.g;
import vz.b0;
import wz.w;
import x5.b;
import z5.l;
import z5.m;
import z5.o;
import z5.r;
import z5.s;

/* loaded from: classes.dex */
public final class a implements x5.b {

    /* renamed from: a  reason: collision with root package name */
    private final r5.b f57047a;

    /* renamed from: b  reason: collision with root package name */
    private final t5.b f57048b;

    /* renamed from: c  reason: collision with root package name */
    private final d f57049c;

    /* renamed from: d  reason: collision with root package name */
    private final s f57050d;

    /* renamed from: e  reason: collision with root package name */
    private final m f57051e;

    /* renamed from: f  reason: collision with root package name */
    private final r f57052f;

    /* renamed from: g  reason: collision with root package name */
    private final l f57053g;

    /* renamed from: h  reason: collision with root package name */
    private final g f57054h;

    /* renamed from: i  reason: collision with root package name */
    private final k f57055i;

    /* renamed from: x5.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C1301a {
        private C1301a() {
        }

        public /* synthetic */ C1301a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "coil.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {110}, m = "intercept")
    /* loaded from: classes.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f57056a;

        /* renamed from: b  reason: collision with root package name */
        int f57057b;

        /* renamed from: d  reason: collision with root package name */
        Object f57059d;

        /* renamed from: e  reason: collision with root package name */
        Object f57060e;

        /* renamed from: f  reason: collision with root package name */
        Object f57061f;

        /* renamed from: g  reason: collision with root package name */
        Object f57062g;

        /* renamed from: h  reason: collision with root package name */
        Object f57063h;

        /* renamed from: i  reason: collision with root package name */
        Object f57064i;

        /* renamed from: j  reason: collision with root package name */
        Object f57065j;

        /* renamed from: k  reason: collision with root package name */
        Object f57066k;

        /* renamed from: l  reason: collision with root package name */
        Object f57067l;

        /* renamed from: m  reason: collision with root package name */
        Object f57068m;

        /* renamed from: n  reason: collision with root package name */
        Object f57069n;

        /* renamed from: o  reason: collision with root package name */
        Object f57070o;

        b(zz.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f57056a = obj;
            this.f57057b |= Integer.MIN_VALUE;
            return a.this.a(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "coil.intercept.EngineInterceptor$intercept$2", f = "EngineInterceptor.kt", l = {WalletConstants.ERROR_CODE_MERCHANT_ACCOUNT_ERROR, 428, 480}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements p<o0, zz.d<? super b6.k>, Object> {
        int A;
        final /* synthetic */ l0 C;
        final /* synthetic */ l0 E;
        final /* synthetic */ l0 F;
        final /* synthetic */ l0 G;
        final /* synthetic */ b.a H;
        final /* synthetic */ l0 K;
        final /* synthetic */ l0 L;
        final /* synthetic */ l0 O;

        /* renamed from: a  reason: collision with root package name */
        private o0 f57071a;

        /* renamed from: b  reason: collision with root package name */
        Object f57072b;

        /* renamed from: c  reason: collision with root package name */
        Object f57073c;

        /* renamed from: d  reason: collision with root package name */
        Object f57074d;

        /* renamed from: e  reason: collision with root package name */
        Object f57075e;

        /* renamed from: f  reason: collision with root package name */
        Object f57076f;

        /* renamed from: g  reason: collision with root package name */
        Object f57077g;

        /* renamed from: h  reason: collision with root package name */
        Object f57078h;

        /* renamed from: i  reason: collision with root package name */
        Object f57079i;

        /* renamed from: j  reason: collision with root package name */
        Object f57080j;

        /* renamed from: k  reason: collision with root package name */
        Object f57081k;

        /* renamed from: l  reason: collision with root package name */
        Object f57082l;

        /* renamed from: m  reason: collision with root package name */
        Object f57083m;

        /* renamed from: n  reason: collision with root package name */
        Object f57084n;

        /* renamed from: o  reason: collision with root package name */
        Object f57085o;

        /* renamed from: p  reason: collision with root package name */
        Object f57086p;

        /* renamed from: q  reason: collision with root package name */
        Object f57087q;

        /* renamed from: t  reason: collision with root package name */
        Object f57088t;

        /* renamed from: w  reason: collision with root package name */
        Object f57089w;

        /* renamed from: x  reason: collision with root package name */
        int f57090x;

        /* renamed from: y  reason: collision with root package name */
        int f57091y;

        /* renamed from: z  reason: collision with root package name */
        int f57092z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(l0 l0Var, l0 l0Var2, l0 l0Var3, l0 l0Var4, b.a aVar, l0 l0Var5, l0 l0Var6, l0 l0Var7, zz.d dVar) {
            super(2, dVar);
            this.C = l0Var;
            this.E = l0Var2;
            this.F = l0Var3;
            this.G = l0Var4;
            this.H = aVar;
            this.K = l0Var5;
            this.L = l0Var6;
            this.O = l0Var7;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<b0> create(Object obj, zz.d<?> completion) {
            kotlin.jvm.internal.s.g(completion, "completion");
            c cVar = new c(this.C, this.E, this.F, this.G, this.H, this.K, this.L, this.O, completion);
            cVar.f57071a = (o0) obj;
            return cVar;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public final Object mo160invoke(o0 o0Var, zz.d<? super b6.k> dVar) {
            return ((c) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
        }

        /* JADX WARN: Removed duplicated region for block: B:101:0x049f  */
        /* JADX WARN: Removed duplicated region for block: B:102:0x04a2  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0238 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0239  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0297  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x029c  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x039c  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x0413  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x0449  */
        /* JADX WARN: Removed duplicated region for block: B:97:0x0492  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x0494  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x03fb -> B:85:0x0405). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r29) {
            /*
                Method dump skipped, instructions count: 1204
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: x5.a.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        new C1301a(null);
    }

    public a(r5.b registry, t5.b bitmapPool, d referenceCounter, s strongMemoryCache, m memoryCacheService, r requestService, l systemCallbacks, g drawableDecoder, k kVar) {
        kotlin.jvm.internal.s.g(registry, "registry");
        kotlin.jvm.internal.s.g(bitmapPool, "bitmapPool");
        kotlin.jvm.internal.s.g(referenceCounter, "referenceCounter");
        kotlin.jvm.internal.s.g(strongMemoryCache, "strongMemoryCache");
        kotlin.jvm.internal.s.g(memoryCacheService, "memoryCacheService");
        kotlin.jvm.internal.s.g(requestService, "requestService");
        kotlin.jvm.internal.s.g(systemCallbacks, "systemCallbacks");
        kotlin.jvm.internal.s.g(drawableDecoder, "drawableDecoder");
        this.f57047a = registry;
        this.f57048b = bitmapPool;
        this.f57049c = referenceCounter;
        this.f57050d = strongMemoryCache;
        this.f57051e = memoryCacheService;
        this.f57052f = requestService;
        this.f57053g = systemCallbacks;
        this.f57054h = drawableDecoder;
        this.f57055i = kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(Object obj) {
        if (!(obj instanceof BitmapDrawable)) {
            if (obj instanceof Bitmap) {
                this.f57049c.a((Bitmap) obj, false);
                return;
            }
            return;
        }
        d dVar = this.f57049c;
        Bitmap bitmap = ((BitmapDrawable) obj).getBitmap();
        if (bitmap != null) {
            dVar.a(bitmap, false);
        }
    }

    private final boolean o(z5.l lVar, o.a aVar, b6.g gVar, c6.g gVar2) {
        int width;
        int height;
        if (gVar2 instanceof c6.b) {
            if (aVar.a()) {
                k kVar = this.f57055i;
                if (kVar != null && kVar.getLevel() <= 3) {
                    kVar.a("EngineInterceptor", 3, gVar.l() + ": Requested original size, but cached image is sampled.", null);
                }
                return false;
            }
        } else if (gVar2 instanceof c6.c) {
            z5.l lVar2 = lVar;
            if (!(lVar2 instanceof l.b)) {
                lVar2 = null;
            }
            l.b bVar = (l.b) lVar2;
            c6.g a11 = bVar != null ? bVar.a() : null;
            if (a11 instanceof c6.c) {
                c6.c cVar = (c6.c) a11;
                width = cVar.d();
                height = cVar.c();
            } else if (kotlin.jvm.internal.s.c(a11, c6.b.f8890a) || a11 == null) {
                Bitmap b11 = aVar.b();
                width = b11.getWidth();
                height = b11.getHeight();
            } else {
                throw new NoWhenBranchMatchedException();
            }
            c6.c cVar2 = (c6.c) gVar2;
            if (Math.abs(width - cVar2.d()) > 1 || Math.abs(height - cVar2.c()) > 1) {
                double d11 = e.d(width, height, cVar2.d(), cVar2.c(), gVar.E());
                if (d11 != 1.0d && !h.b(gVar)) {
                    k kVar2 = this.f57055i;
                    if (kVar2 != null && kVar2.getLevel() <= 3) {
                        kVar2.a("EngineInterceptor", 3, gVar.l() + ": Cached image's request size (" + width + ", " + height + ") does not exactly match the requested size (" + cVar2.d() + ", " + cVar2.c() + ", " + gVar.E() + ").", null);
                    }
                    return false;
                } else if (d11 <= 1.0d || !aVar.a()) {
                    return true;
                } else {
                    k kVar3 = this.f57055i;
                    if (kVar3 != null && kVar3.getLevel() <= 3) {
                        kVar3.a("EngineInterceptor", 3, gVar.l() + ": Cached image's request size (" + width + ", " + height + ") is smaller than the requested size (" + cVar2.d() + ", " + cVar2.c() + ", " + gVar.E() + ").", null);
                    }
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(Drawable drawable) {
        if (!(drawable instanceof BitmapDrawable)) {
            drawable = null;
        }
        BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
        Bitmap bitmap = bitmapDrawable != null ? bitmapDrawable.getBitmap() : null;
        if (bitmap != null) {
            this.f57049c.a(bitmap, true);
            this.f57049c.c(bitmap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean q(b6.g gVar, z5.l lVar, Drawable drawable, boolean z11) {
        if (gVar.y().getWriteEnabled() && lVar != null) {
            if (!(drawable instanceof BitmapDrawable)) {
                drawable = null;
            }
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable != null ? bitmapDrawable.getBitmap() : null;
            if (bitmap != null) {
                this.f57050d.c(lVar, bitmap, z11);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0166 A[Catch: all -> 0x0239, TryCatch #0 {all -> 0x0239, blocks: (B:19:0x006d, B:21:0x0071, B:25:0x00de, B:29:0x0102, B:31:0x0117, B:33:0x0123, B:36:0x012b, B:38:0x0131, B:43:0x0151, B:47:0x0166, B:49:0x017e, B:53:0x01b4, B:56:0x01bd, B:28:0x00f0, B:24:0x00d6, B:60:0x022d, B:61:0x0238), top: B:69:0x006d }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x022b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x024a  */
    /* JADX WARN: Type inference failed for: r1v10, types: [c6.g, T] */
    /* JADX WARN: Type inference failed for: r1v13, types: [T, r5.c] */
    /* JADX WARN: Type inference failed for: r1v16, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [b6.g, T] */
    @Override // x5.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(x5.b.a r29, zz.d<? super b6.h> r30) {
        /*
            Method dump skipped, instructions count: 587
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x5.a.a(x5.b$a, zz.d):java.lang.Object");
    }

    public final z5.l l(b6.g request, Object data, w5.g<Object> fetcher, c6.g size) {
        List i11;
        kotlin.jvm.internal.s.g(request, "request");
        kotlin.jvm.internal.s.g(data, "data");
        kotlin.jvm.internal.s.g(fetcher, "fetcher");
        kotlin.jvm.internal.s.g(size, "size");
        String b11 = fetcher.b(data);
        if (b11 != null) {
            if (request.H().isEmpty()) {
                l.a aVar = z5.l.f60255a;
                j A = request.A();
                i11 = w.i();
                return new l.b(b11, i11, null, A.c());
            }
            l.a aVar2 = z5.l.f60255a;
            List<e6.a> H = request.H();
            j A2 = request.A();
            ArrayList arrayList = new ArrayList(H.size());
            int size2 = H.size();
            for (int i12 = 0; i12 < size2; i12++) {
                arrayList.add(H.get(i12).key());
            }
            return new l.b(b11, arrayList, size, A2.c());
        }
        return null;
    }

    public final boolean n(z5.l lVar, o.a cacheValue, b6.g request, c6.g size) {
        kotlin.jvm.internal.s.g(cacheValue, "cacheValue");
        kotlin.jvm.internal.s.g(request, "request");
        kotlin.jvm.internal.s.g(size, "size");
        if (o(lVar, cacheValue, request, size)) {
            if (this.f57052f.b(request, g6.a.c(cacheValue.b()))) {
                return true;
            }
            k kVar = this.f57055i;
            if (kVar != null && kVar.getLevel() <= 3) {
                kVar.a("EngineInterceptor", 3, request.l() + ": Cached bitmap is hardware-backed, which is incompatible with the request.", null);
            }
            return false;
        }
        return false;
    }
}