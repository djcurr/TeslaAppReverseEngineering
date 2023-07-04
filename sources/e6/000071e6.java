package h2;

import java.util.Comparator;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    private final d1.e<k> f28624a = new d1.e<>(new k[16], 0);

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: h2.c0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static final class C0554a implements Comparator<k> {

            /* renamed from: a  reason: collision with root package name */
            public static final C0554a f28625a = new C0554a();

            private C0554a() {
            }

            @Override // java.util.Comparator
            /* renamed from: a */
            public int compare(k a11, k b11) {
                kotlin.jvm.internal.s.g(a11, "a");
                kotlin.jvm.internal.s.g(b11, "b");
                int i11 = kotlin.jvm.internal.s.i(b11.L(), a11.L());
                return i11 != 0 ? i11 : kotlin.jvm.internal.s.i(a11.hashCode(), b11.hashCode());
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a(null);
    }

    private final void b(k kVar) {
        kVar.F();
        int i11 = 0;
        kVar.U0(false);
        d1.e<k> j02 = kVar.j0();
        int l11 = j02.l();
        if (l11 > 0) {
            k[] k11 = j02.k();
            do {
                b(k11[i11]);
                i11++;
            } while (i11 < l11);
        }
    }

    public final void a() {
        this.f28624a.v(a.C0554a.f28625a);
        d1.e<k> eVar = this.f28624a;
        int l11 = eVar.l();
        if (l11 > 0) {
            int i11 = l11 - 1;
            k[] k11 = eVar.k();
            do {
                k kVar = k11[i11];
                if (kVar.a0()) {
                    b(kVar);
                }
                i11--;
            } while (i11 >= 0);
            this.f28624a.g();
        }
        this.f28624a.g();
    }

    public final void c(k node) {
        kotlin.jvm.internal.s.g(node, "node");
        this.f28624a.b(node);
        node.U0(true);
    }

    public final void d(k rootNode) {
        kotlin.jvm.internal.s.g(rootNode, "rootNode");
        this.f28624a.g();
        this.f28624a.b(rootNode);
        rootNode.U0(true);
    }
}