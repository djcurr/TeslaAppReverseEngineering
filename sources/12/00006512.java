package d20;

import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;

/* loaded from: classes5.dex */
public final class g extends d20.a {

    /* renamed from: b  reason: collision with root package name */
    private final j20.i<h> f23476b;

    /* loaded from: classes5.dex */
    static final class a extends u implements h00.a<h> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h00.a<h> f23477a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(h00.a<? extends h> aVar) {
            super(0);
            this.f23477a = aVar;
        }

        @Override // h00.a
        /* renamed from: a */
        public final h invoke() {
            h invoke = this.f23477a.invoke();
            return invoke instanceof d20.a ? ((d20.a) invoke).h() : invoke;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(h00.a<? extends h> getScope) {
        this(null, getScope, 1, null);
        s.g(getScope, "getScope");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ g(j20.n r1, h00.a r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
        /*
            r0 = this;
            r3 = r3 & 1
            if (r3 == 0) goto Lb
            j20.n r1 = j20.f.f33124e
            java.lang.String r3 = "NO_LOCKS"
            kotlin.jvm.internal.s.f(r1, r3)
        Lb:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d20.g.<init>(j20.n, h00.a, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @Override // d20.a
    protected h i() {
        return this.f23476b.invoke();
    }

    public g(j20.n storageManager, h00.a<? extends h> getScope) {
        s.g(storageManager, "storageManager");
        s.g(getScope, "getScope");
        this.f23476b = storageManager.b(new a(getScope));
    }
}