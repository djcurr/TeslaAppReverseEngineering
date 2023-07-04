package pr;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class g<OuterT, InnerT> implements u<OuterT> {

    /* renamed from: a  reason: collision with root package name */
    private final n00.d<OuterT> f46858a;

    /* renamed from: b  reason: collision with root package name */
    private final h00.p<OuterT, s, vz.p<InnerT, s>> f46859b;

    /* renamed from: c  reason: collision with root package name */
    private final y f46860c;

    /* renamed from: d  reason: collision with root package name */
    private final h00.r<View, h00.p<? super InnerT, ? super s, vz.b0>, OuterT, s, vz.b0> f46861d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.r<View, h00.p<? super InnerT, ? super s, ? extends vz.b0>, OuterT, s, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h00.l<OuterT, InnerT> f46862a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(h00.l<? super OuterT, ? extends InnerT> lVar) {
            super(4);
            this.f46862a = lVar;
        }

        public final void a(View noName_0, h00.p<? super InnerT, ? super s, vz.b0> innerShowRendering, OuterT outerRendering, s viewEnvironment) {
            kotlin.jvm.internal.s.g(noName_0, "$noName_0");
            kotlin.jvm.internal.s.g(innerShowRendering, "innerShowRendering");
            kotlin.jvm.internal.s.g(outerRendering, "outerRendering");
            kotlin.jvm.internal.s.g(viewEnvironment, "viewEnvironment");
            innerShowRendering.invoke((InnerT) this.f46862a.invoke(outerRendering), viewEnvironment);
        }

        @Override // h00.r
        public /* bridge */ /* synthetic */ vz.b0 invoke(View view, Object obj, Object obj2, s sVar) {
            a(view, (h00.p) obj, obj2, sVar);
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes2.dex */
    static final class b extends kotlin.jvm.internal.u implements h00.p<OuterT, s, vz.p<? extends InnerT, ? extends s>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h00.l<OuterT, InnerT> f46863a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(h00.l<? super OuterT, ? extends InnerT> lVar) {
            super(2);
            this.f46863a = lVar;
        }

        @Override // h00.p
        /* renamed from: a */
        public final vz.p<InnerT, s> invoke(OuterT outer, s viewEnvironment) {
            kotlin.jvm.internal.s.g(outer, "outer");
            kotlin.jvm.internal.s.g(viewEnvironment, "viewEnvironment");
            return new vz.p<>(this.f46863a.invoke(outer), viewEnvironment);
        }
    }

    /* loaded from: classes2.dex */
    static final class c extends kotlin.jvm.internal.u implements h00.p<OuterT, s, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g<OuterT, InnerT> f46864a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f46865b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h00.p<InnerT, s, vz.b0> f46866c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(g<OuterT, InnerT> gVar, View view, h00.p<? super InnerT, ? super s, vz.b0> pVar) {
            super(2);
            this.f46864a = gVar;
            this.f46865b = view;
            this.f46866c = pVar;
        }

        public final void a(OuterT rendering, s env) {
            kotlin.jvm.internal.s.g(rendering, "rendering");
            kotlin.jvm.internal.s.g(env, "env");
            ((g) this.f46864a).f46861d.invoke(this.f46865b, this.f46866c, rendering, env);
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ vz.b0 invoke(Object obj, s sVar) {
            a(obj, sVar);
            return vz.b0.f54756a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(n00.d<OuterT> type, h00.p<? super OuterT, ? super s, ? extends vz.p<? extends InnerT, s>> map, y yVar, h00.r<? super View, ? super h00.p<? super InnerT, ? super s, vz.b0>, ? super OuterT, ? super s, vz.b0> doShowRendering) {
        kotlin.jvm.internal.s.g(type, "type");
        kotlin.jvm.internal.s.g(map, "map");
        kotlin.jvm.internal.s.g(doShowRendering, "doShowRendering");
        this.f46858a = type;
        this.f46859b = map;
        this.f46860c = yVar;
        this.f46861d = doShowRendering;
    }

    @Override // pr.u
    public View a(OuterT initialRendering, s initialViewEnvironment, Context contextForNewView, ViewGroup viewGroup) {
        kotlin.jvm.internal.s.g(initialRendering, "initialRendering");
        kotlin.jvm.internal.s.g(initialViewEnvironment, "initialViewEnvironment");
        kotlin.jvm.internal.s.g(contextForNewView, "contextForNewView");
        vz.p<InnerT, s> invoke = this.f46859b.invoke(initialRendering, initialViewEnvironment);
        InnerT a11 = invoke.a();
        s b11 = invoke.b();
        View c11 = w.c((v) b11.a(v.f46897a), a11, b11, contextForNewView, viewGroup, this.f46860c);
        h00.p d11 = x.d(c11);
        kotlin.jvm.internal.s.e(d11);
        x.a(c11, initialRendering, b11, new c(this, c11, d11));
        return c11;
    }

    @Override // pr.u
    public n00.d<OuterT> getType() {
        return this.f46858a;
    }

    public /* synthetic */ g(n00.d dVar, h00.l lVar, y yVar, h00.r rVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, lVar, (i11 & 4) != 0 ? null : yVar, (i11 & 8) != 0 ? new a(lVar) : rVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(n00.d<OuterT> type, h00.l<? super OuterT, ? extends InnerT> map, y yVar, h00.r<? super View, ? super h00.p<? super InnerT, ? super s, vz.b0>, ? super OuterT, ? super s, vz.b0> doShowRendering) {
        this(type, new b(map), yVar, doShowRendering);
        kotlin.jvm.internal.s.g(type, "type");
        kotlin.jvm.internal.s.g(map, "map");
        kotlin.jvm.internal.s.g(doShowRendering, "doShowRendering");
    }
}