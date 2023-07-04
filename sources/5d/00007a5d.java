package iw;

import gw.n;
import h00.p;
import java.io.File;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.g;
import nr.n;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import pv.u;
import vz.b0;
import vz.r;
import wz.w;

/* loaded from: classes6.dex */
public final class e implements n<b> {

    /* renamed from: b  reason: collision with root package name */
    private final String f32805b;

    /* renamed from: c  reason: collision with root package name */
    private final String f32806c;

    /* renamed from: d  reason: collision with root package name */
    private final gw.n f32807d;

    /* renamed from: e  reason: collision with root package name */
    private final iw.b f32808e;

    /* loaded from: classes6.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final iw.b f32809a;

        public a(iw.b service) {
            s.g(service, "service");
            this.f32809a = service;
        }

        public final e a(String sessionToken, String verificationToken, gw.n selfie) {
            s.g(sessionToken, "sessionToken");
            s.g(verificationToken, "verificationToken");
            s.g(selfie, "selfie");
            return new e(sessionToken, verificationToken, selfie, this.f32809a);
        }
    }

    /* loaded from: classes6.dex */
    public static abstract class b {

        /* loaded from: classes6.dex */
        public static final class a extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final a f32810a = new a();

            private a() {
                super(null);
            }
        }

        /* renamed from: iw.e$b$b  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C0606b extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final C0606b f32811a = new C0606b();

            private C0606b() {
                super(null);
            }
        }

        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @f(c = "com.withpersona.sdk.inquiry.selfie.network.UpdateVerificationWorker$run$1", f = "UpdateVerificationWorker.kt", l = {36, 50, 52}, m = "invokeSuspend")
    /* loaded from: classes6.dex */
    static final class c extends l implements p<kotlinx.coroutines.flow.f<? super b>, zz.d<? super b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f32812a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f32813b;

        /* loaded from: classes6.dex */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f32815a;

            static {
                int[] iArr = new int[n.c.values().length];
                iArr[n.c.CENTER.ordinal()] = 1;
                iArr[n.c.LEFT.ordinal()] = 2;
                iArr[n.c.RIGHT.ordinal()] = 3;
                f32815a = iArr;
            }
        }

        c(zz.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
            c cVar = new c(dVar);
            cVar.f32813b = obj;
            return cVar;
        }

        @Override // h00.p
        public final Object invoke(kotlinx.coroutines.flow.f<? super b> fVar, zz.d<? super b0> dVar) {
            return ((c) create(fVar, dVar)).invokeSuspend(b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            kotlinx.coroutines.flow.f fVar;
            String str;
            List<MultipartBody.Part> l11;
            d11 = a00.d.d();
            int i11 = this.f32812a;
            if (i11 == 0) {
                r.b(obj);
                fVar = (kotlinx.coroutines.flow.f) this.f32813b;
                File file = new File(e.this.f32807d.a());
                u.b(file);
                RequestBody create = RequestBody.create(MediaType.parse("image/*"), file);
                s.f(create, "create(MediaType.parse(\"image/*\"), file)");
                int i12 = a.f32815a[e.this.f32807d.c().ordinal()];
                if (i12 == 1) {
                    str = "center-photo";
                } else if (i12 == 2) {
                    str = "left-photo";
                } else if (i12 != 3) {
                    throw new NoWhenBranchMatchedException();
                } else {
                    str = "right-photo";
                }
                MultipartBody.Part createFormData = MultipartBody.Part.createFormData("data[attributes][" + str + "][data]", file.getName(), create);
                iw.b bVar = e.this.f32808e;
                String str2 = e.this.f32805b;
                String str3 = e.this.f32806c;
                l11 = w.l(createFormData, MultipartBody.Part.createFormData("data[attributes][" + str + "][capture-method]", e.this.f32807d.b().getMethod()));
                this.f32813b = fVar;
                this.f32812a = 1;
                obj = bVar.b(str2, str3, l11, this);
                if (obj == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                if (i11 != 2 && i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                return b0.f54756a;
            } else {
                fVar = (kotlinx.coroutines.flow.f) this.f32813b;
                r.b(obj);
            }
            if (((retrofit2.s) obj).f()) {
                new File(e.this.f32807d.a()).delete();
                b.C0606b c0606b = b.C0606b.f32811a;
                this.f32813b = null;
                this.f32812a = 2;
                if (fVar.emit(c0606b, this) == d11) {
                    return d11;
                }
            } else {
                b.a aVar = b.a.f32810a;
                this.f32813b = null;
                this.f32812a = 3;
                if (fVar.emit(aVar, this) == d11) {
                    return d11;
                }
            }
            return b0.f54756a;
        }
    }

    public e(String sessionToken, String verificationToken, gw.n selfie, iw.b service) {
        s.g(sessionToken, "sessionToken");
        s.g(verificationToken, "verificationToken");
        s.g(selfie, "selfie");
        s.g(service, "service");
        this.f32805b = sessionToken;
        this.f32806c = verificationToken;
        this.f32807d = selfie;
        this.f32808e = service;
    }

    @Override // nr.n
    public boolean a(nr.n<?> otherWorker) {
        s.g(otherWorker, "otherWorker");
        return (otherWorker instanceof e) && this.f32807d.c() == ((e) otherWorker).f32807d.c();
    }

    @Override // nr.n
    public kotlinx.coroutines.flow.e<b> run() {
        return g.v(new c(null));
    }
}