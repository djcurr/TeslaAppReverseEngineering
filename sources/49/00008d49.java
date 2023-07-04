package o0;

import c1.s1;
import c1.v1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.s;
import v20.o0;
import vz.b0;

/* loaded from: classes.dex */
public final class f {

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.interaction.FocusInteractionKt$collectIsFocusedAsState$1", f = "FocusInteraction.kt", l = {80}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<o0, zz.d<? super b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f42015a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k f42016b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ c1.o0<Boolean> f42017c;

        /* renamed from: o0.f$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0822a implements kotlinx.coroutines.flow.f<j> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ List f42018a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ c1.o0 f42019b;

            public C0822a(List list, c1.o0 o0Var) {
                this.f42018a = list;
                this.f42019b = o0Var;
            }

            @Override // kotlinx.coroutines.flow.f
            public Object emit(j jVar, zz.d<? super b0> dVar) {
                j jVar2 = jVar;
                if (jVar2 instanceof d) {
                    this.f42018a.add(jVar2);
                } else if (jVar2 instanceof e) {
                    this.f42018a.remove(((e) jVar2).a());
                }
                this.f42019b.setValue(kotlin.coroutines.jvm.internal.b.a(!this.f42018a.isEmpty()));
                return b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(k kVar, c1.o0<Boolean> o0Var, zz.d<? super a> dVar) {
            super(2, dVar);
            this.f42016b = kVar;
            this.f42017c = o0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
            return new a(this.f42016b, this.f42017c, dVar);
        }

        @Override // h00.p
        public final Object invoke(o0 o0Var, zz.d<? super b0> dVar) {
            return ((a) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f42015a;
            if (i11 == 0) {
                vz.r.b(obj);
                ArrayList arrayList = new ArrayList();
                kotlinx.coroutines.flow.e<j> b11 = this.f42016b.b();
                C0822a c0822a = new C0822a(arrayList, this.f42017c);
                this.f42015a = 1;
                if (b11.collect(c0822a, this) == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                vz.r.b(obj);
            }
            return b0.f54756a;
        }
    }

    public static final v1<Boolean> a(k kVar, c1.i iVar, int i11) {
        s.g(kVar, "<this>");
        iVar.x(1885674511);
        iVar.x(-3687241);
        Object y11 = iVar.y();
        if (y11 == c1.i.f8486a.a()) {
            y11 = s1.d(Boolean.FALSE, null, 2, null);
            iVar.p(y11);
        }
        iVar.N();
        c1.o0 o0Var = (c1.o0) y11;
        c1.b0.d(kVar, new a(kVar, o0Var, null), iVar, i11 & 14);
        iVar.N();
        return o0Var;
    }
}