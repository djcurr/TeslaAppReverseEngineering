package m10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import vz.b0;
import vz.v;
import wz.k0;
import wz.r0;
import wz.x;

/* loaded from: classes5.dex */
final class m {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, k> f38345a = new LinkedHashMap();

    /* loaded from: classes5.dex */
    public final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f38346a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ m f38347b;

        /* renamed from: m10.m$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public final class C0736a {

            /* renamed from: a  reason: collision with root package name */
            private final String f38348a;

            /* renamed from: b  reason: collision with root package name */
            private final List<vz.p<String, s>> f38349b;

            /* renamed from: c  reason: collision with root package name */
            private vz.p<String, s> f38350c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ a f38351d;

            public C0736a(a this$0, String functionName) {
                kotlin.jvm.internal.s.g(this$0, "this$0");
                kotlin.jvm.internal.s.g(functionName, "functionName");
                this.f38351d = this$0;
                this.f38348a = functionName;
                this.f38349b = new ArrayList();
                this.f38350c = v.a("V", null);
            }

            public final vz.p<String, k> a() {
                int t11;
                int t12;
                n10.v vVar = n10.v.f40228a;
                String b11 = this.f38351d.b();
                String b12 = b();
                List<vz.p<String, s>> list = this.f38349b;
                t11 = x.t(list, 10);
                ArrayList arrayList = new ArrayList(t11);
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add((String) ((vz.p) it2.next()).c());
                }
                String k11 = vVar.k(b11, vVar.j(b12, arrayList, this.f38350c.c()));
                s d11 = this.f38350c.d();
                List<vz.p<String, s>> list2 = this.f38349b;
                t12 = x.t(list2, 10);
                ArrayList arrayList2 = new ArrayList(t12);
                Iterator<T> it3 = list2.iterator();
                while (it3.hasNext()) {
                    arrayList2.add((s) ((vz.p) it3.next()).d());
                }
                return v.a(k11, new k(d11, arrayList2));
            }

            public final String b() {
                return this.f38348a;
            }

            public final void c(String type, e... qualifiers) {
                Iterable<k0> F0;
                int t11;
                int e11;
                int d11;
                s sVar;
                kotlin.jvm.internal.s.g(type, "type");
                kotlin.jvm.internal.s.g(qualifiers, "qualifiers");
                List<vz.p<String, s>> list = this.f38349b;
                if (qualifiers.length == 0) {
                    sVar = null;
                } else {
                    F0 = wz.p.F0(qualifiers);
                    t11 = x.t(F0, 10);
                    e11 = r0.e(t11);
                    d11 = m00.l.d(e11, 16);
                    LinkedHashMap linkedHashMap = new LinkedHashMap(d11);
                    for (k0 k0Var : F0) {
                        linkedHashMap.put(Integer.valueOf(k0Var.c()), (e) k0Var.d());
                    }
                    sVar = new s(linkedHashMap);
                }
                list.add(v.a(type, sVar));
            }

            public final void d(b20.e type) {
                kotlin.jvm.internal.s.g(type, "type");
                String desc = type.getDesc();
                kotlin.jvm.internal.s.f(desc, "type.desc");
                this.f38350c = v.a(desc, null);
            }

            public final void e(String type, e... qualifiers) {
                Iterable<k0> F0;
                int t11;
                int e11;
                int d11;
                kotlin.jvm.internal.s.g(type, "type");
                kotlin.jvm.internal.s.g(qualifiers, "qualifiers");
                F0 = wz.p.F0(qualifiers);
                t11 = x.t(F0, 10);
                e11 = r0.e(t11);
                d11 = m00.l.d(e11, 16);
                LinkedHashMap linkedHashMap = new LinkedHashMap(d11);
                for (k0 k0Var : F0) {
                    linkedHashMap.put(Integer.valueOf(k0Var.c()), (e) k0Var.d());
                }
                this.f38350c = v.a(type, new s(linkedHashMap));
            }
        }

        public a(m this$0, String className) {
            kotlin.jvm.internal.s.g(this$0, "this$0");
            kotlin.jvm.internal.s.g(className, "className");
            this.f38347b = this$0;
            this.f38346a = className;
        }

        public final void a(String name, h00.l<? super C0736a, b0> block) {
            kotlin.jvm.internal.s.g(name, "name");
            kotlin.jvm.internal.s.g(block, "block");
            Map map = this.f38347b.f38345a;
            C0736a c0736a = new C0736a(this, name);
            block.invoke(c0736a);
            vz.p<String, k> a11 = c0736a.a();
            map.put(a11.c(), a11.d());
        }

        public final String b() {
            return this.f38346a;
        }
    }

    public final Map<String, k> b() {
        return this.f38345a;
    }
}