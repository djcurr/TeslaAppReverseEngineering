package zu;

import kotlin.jvm.internal.m0;

/* loaded from: classes6.dex */
public final class b0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.l<n00.o<? extends Object, ?>, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f60757a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Object obj) {
            super(1);
            this.f60757a = obj;
        }

        @Override // h00.l
        /* renamed from: a */
        public final Boolean invoke(n00.o<? extends Object, ?> it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            return Boolean.valueOf(it2.call(this.f60757a) != null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.l<n00.o<? extends Object, ?>, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f60758a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Object obj) {
            super(1);
            this.f60758a = obj;
        }

        @Override // h00.l
        /* renamed from: a */
        public final Boolean invoke(n00.o<? extends Object, ?> it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            return Boolean.valueOf(it2.call(this.f60758a) == null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static final class c extends kotlin.jvm.internal.u implements h00.l<n00.o<? extends Object, ?>, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h00.l<n00.o<? extends Object, ?>, Boolean> f60759a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(h00.l<? super n00.o<? extends Object, ?>, Boolean> lVar) {
            super(1);
            this.f60759a = lVar;
        }

        @Override // h00.l
        /* renamed from: a */
        public final Boolean invoke(n00.o<? extends Object, ?> property) {
            kotlin.jvm.internal.s.g(property, "property");
            boolean z11 = true;
            p00.a.a(property, true);
            return Boolean.valueOf((property.getReturnType().e() && this.f60759a.invoke(property).booleanValue()) ? false : false);
        }
    }

    public static final u20.h<n00.o<? extends Object, ?>> a(Object obj) {
        kotlin.jvm.internal.s.g(obj, "<this>");
        return c(obj, new a(obj));
    }

    public static final u20.h<n00.o<? extends Object, ?>> b(Object obj) {
        kotlin.jvm.internal.s.g(obj, "<this>");
        return c(obj, new b(obj));
    }

    public static final u20.h<n00.o<? extends Object, ?>> c(Object obj, h00.l<? super n00.o<? extends Object, ?>, Boolean> filter) {
        u20.h S;
        u20.h<n00.o<? extends Object, ?>> q11;
        kotlin.jvm.internal.s.g(obj, "<this>");
        kotlin.jvm.internal.s.g(filter, "filter");
        S = wz.e0.S(o00.b.b(m0.b(obj.getClass())));
        q11 = u20.p.q(S, new c(filter));
        return q11;
    }
}