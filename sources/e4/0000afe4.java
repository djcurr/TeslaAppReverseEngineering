package r10;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.s;
import p10.q;
import p10.t;
import wz.w;
import wz.x;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private final List<q> f49062a;

    public g(t typeTable) {
        int t11;
        s.g(typeTable, "typeTable");
        List<q> u11 = typeTable.u();
        if (typeTable.v()) {
            int r11 = typeTable.r();
            List<q> u12 = typeTable.u();
            s.f(u12, "typeTable.typeList");
            t11 = x.t(u12, 10);
            ArrayList arrayList = new ArrayList(t11);
            int i11 = 0;
            for (Object obj : u12) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    w.s();
                }
                q qVar = (q) obj;
                if (i11 >= r11) {
                    qVar = qVar.toBuilder().C(true).build();
                }
                arrayList.add(qVar);
                i11 = i12;
            }
            u11 = arrayList;
        }
        s.f(u11, "run {\n        val origin… else originalTypes\n    }");
        this.f49062a = u11;
    }

    public final q a(int i11) {
        return this.f49062a.get(i11);
    }
}