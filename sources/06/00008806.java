package mx;

import com.google.common.base.u;
import io.grpc.h0;
import io.grpc.internal.l2;
import io.grpc.internal.q0;
import io.grpc.r0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
class c {

    /* renamed from: a  reason: collision with root package name */
    public static final nx.d f39506a;

    /* renamed from: b  reason: collision with root package name */
    public static final nx.d f39507b;

    /* renamed from: c  reason: collision with root package name */
    public static final nx.d f39508c;

    /* renamed from: d  reason: collision with root package name */
    public static final nx.d f39509d;

    /* renamed from: e  reason: collision with root package name */
    public static final nx.d f39510e;

    /* renamed from: f  reason: collision with root package name */
    public static final nx.d f39511f;

    static {
        okio.i iVar = nx.d.f41934g;
        f39506a = new nx.d(iVar, "https");
        f39507b = new nx.d(iVar, "http");
        okio.i iVar2 = nx.d.f41932e;
        f39508c = new nx.d(iVar2, "POST");
        f39509d = new nx.d(iVar2, "GET");
        f39510e = new nx.d(q0.f31165h.d(), "application/grpc");
        f39511f = new nx.d("te", "trailers");
    }

    public static List<nx.d> a(r0 r0Var, String str, String str2, String str3, boolean z11, boolean z12) {
        u.p(r0Var, "headers");
        u.p(str, "defaultPath");
        u.p(str2, "authority");
        r0Var.e(q0.f31165h);
        r0Var.e(q0.f31166i);
        r0.f<String> fVar = q0.f31167j;
        r0Var.e(fVar);
        ArrayList arrayList = new ArrayList(h0.a(r0Var) + 7);
        if (z12) {
            arrayList.add(f39507b);
        } else {
            arrayList.add(f39506a);
        }
        if (z11) {
            arrayList.add(f39509d);
        } else {
            arrayList.add(f39508c);
        }
        arrayList.add(new nx.d(nx.d.f41935h, str2));
        arrayList.add(new nx.d(nx.d.f41933f, str));
        arrayList.add(new nx.d(fVar.d(), str3));
        arrayList.add(f39510e);
        arrayList.add(f39511f);
        byte[][] d11 = l2.d(r0Var);
        for (int i11 = 0; i11 < d11.length; i11 += 2) {
            okio.i s11 = okio.i.s(d11[i11]);
            if (b(s11.F())) {
                arrayList.add(new nx.d(s11, okio.i.s(d11[i11 + 1])));
            }
        }
        return arrayList;
    }

    private static boolean b(String str) {
        return (str.startsWith(":") || q0.f31165h.d().equalsIgnoreCase(str) || q0.f31167j.d().equalsIgnoreCase(str)) ? false : true;
    }
}