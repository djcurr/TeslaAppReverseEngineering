package h2;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f28619a;

    /* renamed from: b  reason: collision with root package name */
    private final vz.k f28620b;

    /* renamed from: c  reason: collision with root package name */
    private final Comparator<k> f28621c;

    /* renamed from: d  reason: collision with root package name */
    private final m0<k> f28622d;

    /* loaded from: classes.dex */
    public static final class a implements Comparator<k> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(k l12, k l22) {
            kotlin.jvm.internal.s.g(l12, "l1");
            kotlin.jvm.internal.s.g(l22, "l2");
            int i11 = kotlin.jvm.internal.s.i(l12.L(), l22.L());
            return i11 != 0 ? i11 : kotlin.jvm.internal.s.i(l12.hashCode(), l22.hashCode());
        }
    }

    /* loaded from: classes.dex */
    static final class b extends kotlin.jvm.internal.u implements h00.a<Map<k, Integer>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f28623a = new b();

        b() {
            super(0);
        }

        @Override // h00.a
        public final Map<k, Integer> invoke() {
            return new LinkedHashMap();
        }
    }

    public c(boolean z11) {
        vz.k b11;
        this.f28619a = z11;
        b11 = vz.m.b(kotlin.b.NONE, b.f28623a);
        this.f28620b = b11;
        a aVar = new a();
        this.f28621c = aVar;
        this.f28622d = new m0<>(aVar);
    }

    private final Map<k, Integer> c() {
        return (Map) this.f28620b.getValue();
    }

    public final void a(k node) {
        kotlin.jvm.internal.s.g(node, "node");
        if (node.u0()) {
            if (this.f28619a) {
                Integer num = c().get(node);
                if (num == null) {
                    c().put(node, Integer.valueOf(node.L()));
                } else {
                    if (!(num.intValue() == node.L())) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                }
            }
            this.f28622d.add(node);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final boolean b(k node) {
        kotlin.jvm.internal.s.g(node, "node");
        boolean contains = this.f28622d.contains(node);
        if (this.f28619a) {
            if (!(contains == c().containsKey(node))) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        return contains;
    }

    public final boolean d() {
        return this.f28622d.isEmpty();
    }

    public final k e() {
        k node = this.f28622d.first();
        kotlin.jvm.internal.s.f(node, "node");
        f(node);
        return node;
    }

    public final boolean f(k node) {
        kotlin.jvm.internal.s.g(node, "node");
        if (node.u0()) {
            boolean remove = this.f28622d.remove(node);
            if (this.f28619a) {
                Integer remove2 = c().remove(node);
                if (remove) {
                    int L = node.L();
                    if (remove2 == null || remove2.intValue() != L) {
                        r3 = false;
                    }
                    if (!r3) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } else {
                    if (!(remove2 == null)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                }
            }
            return remove;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public String toString() {
        String treeSet = this.f28622d.toString();
        kotlin.jvm.internal.s.f(treeSet, "set.toString()");
        return treeSet;
    }
}