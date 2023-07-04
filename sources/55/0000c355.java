package yv;

import com.withpersona.sdk.inquiry.governmentid.RawExtraction;
import com.withpersona.sdk.inquiry.governmentid.a;
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
    private final String f59891b;

    /* renamed from: c  reason: collision with root package name */
    private final String f59892c;

    /* renamed from: d  reason: collision with root package name */
    private final com.withpersona.sdk.inquiry.governmentid.a f59893d;

    /* renamed from: e  reason: collision with root package name */
    private final yv.b f59894e;

    /* loaded from: classes6.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final yv.b f59895a;

        public a(yv.b service) {
            s.g(service, "service");
            this.f59895a = service;
        }

        public final e a(String sessionToken, String verificationToken, com.withpersona.sdk.inquiry.governmentid.a governmentId) {
            s.g(sessionToken, "sessionToken");
            s.g(verificationToken, "verificationToken");
            s.g(governmentId, "governmentId");
            return new e(sessionToken, verificationToken, governmentId, this.f59895a);
        }
    }

    /* loaded from: classes6.dex */
    public static abstract class b {

        /* loaded from: classes6.dex */
        public static final class a extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final a f59896a = new a();

            private a() {
                super(null);
            }
        }

        /* renamed from: yv.e$b$b  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C1368b extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final C1368b f59897a = new C1368b();

            private C1368b() {
                super(null);
            }
        }

        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @f(c = "com.withpersona.sdk.inquiry.governmentid.network.UpdateVerificationWorker$run$1", f = "UpdateVerificationWorker.kt", l = {57, 65, 67}, m = "invokeSuspend")
    /* loaded from: classes6.dex */
    static final class c extends l implements p<kotlinx.coroutines.flow.f<? super b>, zz.d<? super b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f59898a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f59899b;

        /* loaded from: classes6.dex */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f59901a;

            static {
                int[] iArr = new int[a.c.values().length];
                iArr[a.c.FRONT.ordinal()] = 1;
                iArr[a.c.BACK.ordinal()] = 2;
                f59901a = iArr;
            }
        }

        c(zz.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
            c cVar = new c(dVar);
            cVar.f59899b = obj;
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
            List<MultipartBody.Part> o11;
            d11 = a00.d.d();
            int i11 = this.f59898a;
            if (i11 == 0) {
                r.b(obj);
                fVar = (kotlinx.coroutines.flow.f) this.f59899b;
                File file = new File(e.this.f59893d.a());
                u.b(file);
                RequestBody create = RequestBody.create(MediaType.parse("image/*"), file);
                s.f(create, "create(MediaType.parse(\"image/*\"), file)");
                int i12 = a.f59901a[e.this.f59893d.e().ordinal()];
                if (i12 == 1) {
                    str = "front-photo";
                } else if (i12 != 2) {
                    throw new NoWhenBranchMatchedException();
                } else {
                    str = "back-photo";
                }
                MultipartBody.Part createFormData = MultipartBody.Part.createFormData("data[attributes][" + str + "][data][]", file.getName(), create);
                s.f(createFormData, "createFormData(\"data[att…, file.name, fileReqBody)");
                MultipartBody.Part createFormData2 = MultipartBody.Part.createFormData("data[attributes][" + str + "][capture-method]", e.this.f59893d.b().toString());
                s.f(createFormData2, "createFormData(\n        …Method.toString()\n      )");
                MultipartBody.Part createFormData3 = MultipartBody.Part.createFormData("data[attributes][selected-id-class]", e.this.f59893d.c().toAbbreviation());
                s.f(createFormData3, "createFormData(\n        ….toAbbreviation()\n      )");
                o11 = w.o(createFormData, createFormData2, createFormData3);
                RawExtraction d12 = e.this.f59893d.d();
                if (d12 != null) {
                    o11.add(MultipartBody.Part.createFormData("data[attributes][client-extraction-raws][][type]", d12.a()));
                    o11.add(MultipartBody.Part.createFormData("data[attributes][client-extraction-raws][][value]", d12.b()));
                }
                yv.b bVar = e.this.f59894e;
                String str2 = e.this.f59891b;
                String str3 = e.this.f59892c;
                this.f59899b = fVar;
                this.f59898a = 1;
                obj = bVar.b(str2, str3, o11, this);
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
                fVar = (kotlinx.coroutines.flow.f) this.f59899b;
                r.b(obj);
            }
            if (((retrofit2.s) obj).f()) {
                new File(e.this.f59893d.a()).delete();
                b.C1368b c1368b = b.C1368b.f59897a;
                this.f59899b = null;
                this.f59898a = 2;
                if (fVar.emit(c1368b, this) == d11) {
                    return d11;
                }
            } else {
                b.a aVar = b.a.f59896a;
                this.f59899b = null;
                this.f59898a = 3;
                if (fVar.emit(aVar, this) == d11) {
                    return d11;
                }
            }
            return b0.f54756a;
        }
    }

    public e(String sessionToken, String verificationToken, com.withpersona.sdk.inquiry.governmentid.a governmentId, yv.b service) {
        s.g(sessionToken, "sessionToken");
        s.g(verificationToken, "verificationToken");
        s.g(governmentId, "governmentId");
        s.g(service, "service");
        this.f59891b = sessionToken;
        this.f59892c = verificationToken;
        this.f59893d = governmentId;
        this.f59894e = service;
    }

    @Override // nr.n
    public boolean a(n<?> otherWorker) {
        s.g(otherWorker, "otherWorker");
        if (otherWorker instanceof e) {
            e eVar = (e) otherWorker;
            if (s.c(this.f59891b, eVar.f59891b) && s.c(this.f59892c, eVar.f59892c) && s.c(this.f59893d, eVar.f59893d)) {
                return true;
            }
        }
        return false;
    }

    @Override // nr.n
    public kotlinx.coroutines.flow.e<b> run() {
        return g.v(new c(null));
    }
}