package g20;

import java.util.List;
import k20.d0;

/* loaded from: classes5.dex */
public final class m extends y10.b {

    /* renamed from: c  reason: collision with root package name */
    private final d0 f27426c;

    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.l<w00.x, d0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d0 f27427a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(d0 d0Var) {
            super(1);
            this.f27427a = d0Var;
        }

        @Override // h00.l
        /* renamed from: a */
        public final d0 invoke(w00.x it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            return this.f27427a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(List<? extends y10.g<?>> value, d0 type) {
        super(value, new a(type));
        kotlin.jvm.internal.s.g(value, "value");
        kotlin.jvm.internal.s.g(type, "type");
        this.f27426c = type;
    }

    public final d0 c() {
        return this.f27426c;
    }
}