package q00;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import k20.f1;
import q00.u;
import r00.e;

/* loaded from: classes5.dex */
public final class v {

    /* loaded from: classes5.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ u.a f47268a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(u.a aVar) {
            super(0);
            this.f47268a = aVar;
        }

        public final boolean a() {
            return this.f47268a.E().y().mo140getAnnotations().b1(l0.j());
        }

        @Override // h00.a
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Boolean mo11invoke() {
            return Boolean.valueOf(a());
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ u.a f47269a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(u.a aVar) {
            super(0);
            this.f47269a = aVar;
        }

        public final boolean a() {
            return !f1.m(this.f47269a.E().y().getType());
        }

        @Override // h00.a
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Boolean mo11invoke() {
            return Boolean.valueOf(a());
        }
    }

    /* loaded from: classes5.dex */
    public static final class c extends kotlin.jvm.internal.u implements h00.l<Field, r00.e<? extends Field>> {

        /* renamed from: a */
        final /* synthetic */ u.a f47270a;

        /* renamed from: b */
        final /* synthetic */ boolean f47271b;

        /* renamed from: c */
        final /* synthetic */ b f47272c;

        /* renamed from: d */
        final /* synthetic */ a f47273d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(u.a aVar, boolean z11, b bVar, a aVar2) {
            super(1);
            this.f47270a = aVar;
            this.f47271b = z11;
            this.f47272c = bVar;
            this.f47273d = aVar2;
        }

        @Override // h00.l
        /* renamed from: a */
        public final r00.e<Field> mo12invoke(Field field) {
            kotlin.jvm.internal.s.g(field, "field");
            return (v.e(this.f47270a.E().y()) || !Modifier.isStatic(field.getModifiers())) ? this.f47271b ? this.f47270a.A() ? new e.f.a(field, v.d(this.f47270a)) : new e.f.c(field) : this.f47270a.A() ? new e.g.a(field, this.f47272c.a(), v.d(this.f47270a)) : new e.g.c(field, this.f47272c.a()) : this.f47273d.a() ? this.f47271b ? this.f47270a.A() ? new e.f.b(field) : new e.f.d(field) : this.f47270a.A() ? new e.g.b(field, this.f47272c.a()) : new e.g.d(field, this.f47272c.a()) : this.f47271b ? new e.f.C1064e(field) : new e.g.C1065e(field, this.f47272c.a());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final r00.d<?> c(q00.u.a<?, ?> r7, boolean r8) {
        /*
            Method dump skipped, instructions count: 602
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q00.v.c(q00.u$a, boolean):r00.d");
    }

    public static final Object d(u.a<?, ?> boundReceiver) {
        kotlin.jvm.internal.s.g(boundReceiver, "$this$boundReceiver");
        return boundReceiver.E().E();
    }

    public static final boolean e(w00.i0 i0Var) {
        w00.i containingDeclaration = i0Var.mo223b();
        kotlin.jvm.internal.s.f(containingDeclaration, "containingDeclaration");
        if (w10.d.x(containingDeclaration)) {
            w00.i mo223b = containingDeclaration.mo223b();
            return !(w10.d.C(mo223b) || w10.d.t(mo223b)) || ((i0Var instanceof i20.j) && t10.g.f(((i20.j) i0Var).b0()));
        }
        return false;
    }
}