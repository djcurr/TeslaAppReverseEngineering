package bw;

import com.squareup.moshi.f;
import com.squareup.workflow1.ui.backstack.BackStackContainer;
import com.withpersona.sdk.inquiry.internal.network.CreateInquiryRequest;
import com.withpersona.sdk.inquiry.internal.network.NextStep;
import com.withpersona.sdk.inquiry.network.JsonAdapterBinding;
import java.util.Arrays;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import pr.u;
import pr.w;
import retrofit2.t;
import wz.w0;
import wz.x0;
import zv.d0;
import zv.h0;
import zv.o;
import zv.v;
import zv.y;

/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0158a f8307a = new C0158a(null);

    /* renamed from: bw.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class C0158a {
        private C0158a() {
        }

        public /* synthetic */ C0158a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Set<Object> a() {
            Set<Object> i11;
            i11 = x0.i(CreateInquiryRequest.Data.f22649b, NextStep.Start.DisclaimerConfig.Companion);
            return i11;
        }

        public final Set<JsonAdapterBinding<?>> b() {
            Set<JsonAdapterBinding<?>> d11;
            d11 = x0.d();
            return d11;
        }

        public final Set<f.d> c() {
            Set<f.d> c11;
            c11 = w0.c(NextStep.f22683b.a());
            return c11;
        }

        public final Set<u<?>> d() {
            Set<u<?>> i11;
            i11 = x0.i(d0.f60851c, h0.f60894c, v.f61224f, zv.l.f61149b, y.f61241b, o.f61189e, BackStackContainer.f20868d);
            return i11;
        }

        public final String e() {
            return "Persona/1.0 (Android) Inquiry/1.1.23";
        }

        public final pr.v f(Set<u<?>> viewBindings) {
            s.g(viewBindings, "viewBindings");
            Object[] array = viewBindings.toArray(new u[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            u[] uVarArr = (u[]) array;
            return w.b((u[]) Arrays.copyOf(uVarArr, uVarArr.length));
        }
    }

    public static final Set<Object> f() {
        return f8307a.a();
    }

    public static final Set<JsonAdapterBinding<?>> g() {
        return f8307a.b();
    }

    public static final Set<f.d> h() {
        return f8307a.c();
    }

    public static final Set<u<?>> i() {
        return f8307a.d();
    }

    public static final pr.v k(Set<u<?>> set) {
        return f8307a.f(set);
    }

    public final sv.c a(t retrofit) {
        s.g(retrofit, "retrofit");
        Object b11 = retrofit.b(sv.c.class);
        s.f(b11, "retrofit.create(\n    Dat…seService::class.java\n  )");
        return (sv.c) b11;
    }

    public final vv.a b(t retrofit) {
        s.g(retrofit, "retrofit");
        Object b11 = retrofit.b(vv.a.class);
        s.f(b11, "retrofit.create(DocumentService::class.java)");
        return (vv.a) b11;
    }

    public final yv.b c(t retrofit) {
        s.g(retrofit, "retrofit");
        Object b11 = retrofit.b(yv.b.class);
        s.f(b11, "retrofit.create(GovernmentIdService::class.java)");
        return (yv.b) b11;
    }

    public final n d(t retrofit) {
        s.g(retrofit, "retrofit");
        Object b11 = retrofit.b(n.class);
        s.f(b11, "retrofit.create(InquiryService::class.java)");
        return (n) b11;
    }

    public final fw.a e(t retrofit) {
        s.g(retrofit, "retrofit");
        Object b11 = retrofit.b(fw.a.class);
        s.f(b11, "retrofit.create(PhoneService::class.java)");
        return (fw.a) b11;
    }

    public final iw.b j(t retrofit) {
        s.g(retrofit, "retrofit");
        Object b11 = retrofit.b(iw.b.class);
        s.f(b11, "retrofit.create(SelfieService::class.java)");
        return (iw.b) b11;
    }
}