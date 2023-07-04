package l1;

import c1.b0;
import c1.n1;
import c1.o0;
import c1.s1;
import c1.y;
import c1.z;
import h00.l;
import java.util.Arrays;
import java.util.Objects;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import l1.f;
import m1.q;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final int f36335a = 36;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends u implements l<z, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f36336a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f36337b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ o0<i<T, Object>> f36338c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ T f36339d;

        /* renamed from: l1.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0692a implements y {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ f.a f36340a;

            public C0692a(f.a aVar) {
                this.f36340a = aVar;
            }

            @Override // c1.y
            public void dispose() {
                this.f36340a.a();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: l1.b$a$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0693b extends u implements h00.a<Object> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ o0<i<T, Object>> f36341a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ T f36342b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ f f36343c;

            /* renamed from: l1.b$a$b$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            static final class C0694a implements k {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ f f36344a;

                C0694a(f fVar) {
                    this.f36344a = fVar;
                }

                @Override // l1.k
                public final boolean a(Object it2) {
                    s.g(it2, "it");
                    return this.f36344a.a(it2);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0693b(o0<i<T, Object>> o0Var, T t11, f fVar) {
                super(0);
                this.f36341a = o0Var;
                this.f36342b = t11;
                this.f36343c = fVar;
            }

            @Override // h00.a
            public final Object invoke() {
                Object value = this.f36341a.getValue();
                return ((i) value).a(new C0694a(this.f36343c), this.f36342b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f fVar, String str, o0<i<T, Object>> o0Var, T t11) {
            super(1);
            this.f36336a = fVar;
            this.f36337b = str;
            this.f36338c = o0Var;
            this.f36339d = t11;
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ y invoke(z zVar) {
            return invoke2(zVar);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final y invoke2(z DisposableEffect) {
            s.g(DisposableEffect, "$this$DisposableEffect");
            C0693b c0693b = new C0693b(this.f36338c, this.f36339d, this.f36336a);
            b.c(this.f36336a, c0693b.invoke());
            return new C0692a(this.f36336a.d(this.f36337b, c0693b));
        }
    }

    static {
    }

    public static final <T> T b(Object[] inputs, i<T, ? extends Object> iVar, String str, h00.a<? extends T> init, c1.i iVar2, int i11, int i12) {
        Object c11;
        int a11;
        s.g(inputs, "inputs");
        s.g(init, "init");
        iVar2.x(1059366159);
        if ((i12 & 2) != 0) {
            iVar = j.b();
        }
        if ((i12 & 4) != 0) {
            str = null;
        }
        iVar2.x(1059366416);
        int i13 = 0;
        if (str == null || str.length() == 0) {
            int a12 = c1.h.a(iVar2, 0);
            a11 = kotlin.text.b.a(f36335a);
            str = Integer.toString(a12, a11);
            s.f(str, "toString(this, checkRadix(radix))");
        }
        String str2 = str;
        iVar2.N();
        Objects.requireNonNull(iVar, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>");
        f fVar = (f) iVar2.A(h.b());
        Object[] copyOf = Arrays.copyOf(inputs, inputs.length);
        iVar2.x(-3685570);
        int length = copyOf.length;
        boolean z11 = false;
        while (i13 < length) {
            Object obj = copyOf[i13];
            i13++;
            z11 |= iVar2.O(obj);
        }
        T t11 = (T) iVar2.y();
        if (z11 || t11 == c1.i.f8486a.a()) {
            t11 = (fVar == null || (c11 = fVar.c(str2)) == null) ? null : iVar.b(c11);
            if (t11 == null) {
                t11 = init.invoke();
            }
            iVar2.p(t11);
        }
        iVar2.N();
        iVar2.x(-3687241);
        Object y11 = iVar2.y();
        if (y11 == c1.i.f8486a.a()) {
            y11 = s1.d(iVar, null, 2, null);
            iVar2.p(y11);
        }
        iVar2.N();
        o0 o0Var = (o0) y11;
        o0Var.setValue(iVar);
        if (fVar != null) {
            b0.c(fVar, str2, t11, new a(fVar, str2, o0Var, t11), iVar2, 0);
        }
        iVar2.N();
        return t11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(f fVar, Object obj) {
        String str;
        if (obj == null || fVar.a(obj)) {
            return;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (qVar.d() == n1.h() || qVar.d() == n1.o() || qVar.d() == n1.l()) {
                str = "MutableState containing " + qVar.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
            } else {
                str = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
            }
        } else {
            str = obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
        }
        throw new IllegalArgumentException(str);
    }
}