package nr;

import nr.k;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final /* synthetic */ class y {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.a<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f41852a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(0);
            this.f41852a = str;
        }

        @Override // h00.a
        public final String invoke() {
            return this.f41852a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [StateT, OutputT, PropsT] */
    /* loaded from: classes2.dex */
    public static final class b<OutputT, PropsT, StateT> extends q<PropsT, StateT, OutputT> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h00.l<q<? super PropsT, StateT, ? extends OutputT>.c, vz.b0> f41853a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h00.a<String> f41854b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k<PropsT, StateT, OutputT, RenderingT> f41855c;

        /* JADX WARN: Multi-variable type inference failed */
        b(h00.l<? super q<? super PropsT, StateT, ? extends OutputT>.c, vz.b0> lVar, h00.a<String> aVar, k<? super PropsT, StateT, ? extends OutputT, ? extends RenderingT> kVar) {
            this.f41853a = lVar;
            this.f41854b = aVar;
            this.f41855c = kVar;
        }

        @Override // nr.q
        public void a(q<? super PropsT, StateT, ? extends OutputT>.c cVar) {
            kotlin.jvm.internal.s.g(cVar, "<this>");
            this.f41853a.invoke(cVar);
        }

        public String toString() {
            return "action(" + this.f41854b.invoke() + ")-" + this.f41855c;
        }
    }

    public static final <PropsT, StateT, OutputT, RenderingT> k<PropsT, StateT, OutputT, RenderingT>.a a(nr.a<? extends PropsT, StateT, ? super OutputT> baseContext, k<? super PropsT, StateT, ? extends OutputT, ? extends RenderingT> workflow) {
        kotlin.jvm.internal.s.g(baseContext, "baseContext");
        kotlin.jvm.internal.s.g(workflow, "workflow");
        k<PropsT, StateT, OutputT, RenderingT>.a aVar = baseContext instanceof k.a ? (k.a) baseContext : null;
        return aVar == null ? new k.a(workflow, baseContext) : aVar;
    }

    public static final <PropsT, StateT, OutputT, RenderingT> q<PropsT, StateT, OutputT> b(k<? super PropsT, StateT, ? extends OutputT, ? extends RenderingT> kVar, h00.a<String> name, h00.l<? super q<? super PropsT, StateT, ? extends OutputT>.c, vz.b0> update) {
        kotlin.jvm.internal.s.g(kVar, "<this>");
        kotlin.jvm.internal.s.g(name, "name");
        kotlin.jvm.internal.s.g(update, "update");
        return new b(update, name, kVar);
    }

    public static final <PropsT, StateT, OutputT, RenderingT> q<PropsT, StateT, OutputT> c(k<? super PropsT, StateT, ? extends OutputT, ? extends RenderingT> kVar, String name, h00.l<? super q<? super PropsT, StateT, ? extends OutputT>.c, vz.b0> update) {
        kotlin.jvm.internal.s.g(kVar, "<this>");
        kotlin.jvm.internal.s.g(name, "name");
        kotlin.jvm.internal.s.g(update, "update");
        return v.b(kVar, new a(name), update);
    }

    public static /* synthetic */ q d(k kVar, String str, h00.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = "";
        }
        return v.c(kVar, str, lVar);
    }
}