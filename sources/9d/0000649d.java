package d;

import androidx.activity.result.ActivityResultRegistry;
import c1.i;
import c1.n1;
import c1.v1;
import c1.y;
import c1.z;
import h00.l;
import java.util.UUID;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import vz.b0;

/* loaded from: classes.dex */
public final class b {

    /* loaded from: classes.dex */
    static final class a extends u implements l<z, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d.a<I> f23218a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ActivityResultRegistry f23219b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f23220c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ f.a<I, O> f23221d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ v1<l<O, b0>> f23222e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: d.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0445a<O> implements androidx.activity.result.b {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ v1<l<O, b0>> f23223a;

            /* JADX WARN: Multi-variable type inference failed */
            C0445a(v1<? extends l<? super O, b0>> v1Var) {
                this.f23223a = v1Var;
            }

            @Override // androidx.activity.result.b
            public final void a(O o11) {
                this.f23223a.getValue().invoke(o11);
            }
        }

        /* renamed from: d.b$a$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0446b implements y {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d.a f23224a;

            public C0446b(d.a aVar) {
                this.f23224a = aVar;
            }

            @Override // c1.y
            public void dispose() {
                this.f23224a.c();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(d.a<I> aVar, ActivityResultRegistry activityResultRegistry, String str, f.a<I, O> aVar2, v1<? extends l<? super O, b0>> v1Var) {
            super(1);
            this.f23218a = aVar;
            this.f23219b = activityResultRegistry;
            this.f23220c = str;
            this.f23221d = aVar2;
            this.f23222e = v1Var;
        }

        @Override // h00.l
        public final y invoke(z DisposableEffect) {
            s.g(DisposableEffect, "$this$DisposableEffect");
            this.f23218a.b(this.f23219b.j(this.f23220c, this.f23221d, new C0445a(this.f23222e)));
            return new C0446b(this.f23218a);
        }
    }

    /* renamed from: d.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static final class C0447b extends u implements h00.a<String> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0447b f23225a = new C0447b();

        C0447b() {
            super(0);
        }

        @Override // h00.a
        public final String invoke() {
            return UUID.randomUUID().toString();
        }
    }

    public static final <I, O> g<I, O> a(f.a<I, O> contract, l<? super O, b0> onResult, i iVar, int i11) {
        s.g(contract, "contract");
        s.g(onResult, "onResult");
        iVar.x(-1672766681);
        v1 m11 = n1.m(contract, iVar, 8);
        v1 m12 = n1.m(onResult, iVar, (i11 >> 3) & 14);
        Object b11 = l1.b.b(new Object[0], null, null, C0447b.f23225a, iVar, 8, 6);
        s.f(b11, "rememberSaveable { UUID.randomUUID().toString() }");
        String str = (String) b11;
        androidx.activity.result.e a11 = e.f23238a.a(iVar, 0);
        if (a11 != null) {
            ActivityResultRegistry activityResultRegistry = a11.getActivityResultRegistry();
            s.f(activityResultRegistry, "checkNotNull(LocalActivi… }.activityResultRegistry");
            iVar.x(-3687241);
            Object y11 = iVar.y();
            i.a aVar = i.f8486a;
            if (y11 == aVar.a()) {
                y11 = new d.a();
                iVar.p(y11);
            }
            iVar.N();
            d.a aVar2 = (d.a) y11;
            iVar.x(-3687241);
            Object y12 = iVar.y();
            if (y12 == aVar.a()) {
                y12 = new g(aVar2, m11);
                iVar.p(y12);
            }
            iVar.N();
            g<I, O> gVar = (g) y12;
            c1.b0.c(activityResultRegistry, str, contract, new a(aVar2, activityResultRegistry, str, contract, m12), iVar, 520);
            iVar.N();
            return gVar;
        }
        throw new IllegalStateException("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner".toString());
    }
}