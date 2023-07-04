package androidx.compose.ui.platform;

/* loaded from: classes.dex */
public final class o1 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.l<l2.v, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f3045a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(1);
            this.f3045a = str;
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(l2.v vVar) {
            invoke2(vVar);
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(l2.v semantics) {
            kotlin.jvm.internal.s.g(semantics, "$this$semantics");
            l2.t.Q(semantics, this.f3045a);
        }
    }

    public static final o1.f a(o1.f fVar, String tag) {
        kotlin.jvm.internal.s.g(fVar, "<this>");
        kotlin.jvm.internal.s.g(tag, "tag");
        return l2.o.b(fVar, false, new a(tag), 1, null);
    }
}