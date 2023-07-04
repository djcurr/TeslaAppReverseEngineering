package kj;

import ak.g0;
import android.net.Uri;
import android.text.TextUtils;
import ci.i;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import ti.h0;
import wi.a;

/* loaded from: classes3.dex */
public final class d implements h {

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f34683d = {8, 13, 11, 2, 0, 1, 7};

    /* renamed from: b  reason: collision with root package name */
    private final int f34684b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f34685c;

    public d() {
        this(0, true);
    }

    private static void b(int i11, List<Integer> list) {
        if (i11 == -1 || list.contains(Integer.valueOf(i11))) {
            return;
        }
        list.add(Integer.valueOf(i11));
    }

    private ji.h d(int i11, ci.i iVar, List<ci.i> list, g0 g0Var) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 7) {
                        if (i11 != 8) {
                            if (i11 != 11) {
                                if (i11 != 13) {
                                    return null;
                                }
                                return new t(iVar.f9196c, g0Var);
                            }
                            return f(this.f34684b, this.f34685c, iVar, list, g0Var);
                        }
                        return e(g0Var, iVar, list);
                    }
                    return new pi.f(0, 0L);
                }
                return new ti.h();
            }
            return new ti.e();
        }
        return new ti.b();
    }

    private static qi.g e(g0 g0Var, ci.i iVar, List<ci.i> list) {
        int i11 = g(iVar) ? 4 : 0;
        if (list == null) {
            list = Collections.emptyList();
        }
        return new qi.g(i11, g0Var, null, list);
    }

    private static h0 f(int i11, boolean z11, ci.i iVar, List<ci.i> list, g0 g0Var) {
        int i12 = i11 | 16;
        if (list != null) {
            i12 |= 32;
        } else if (z11) {
            list = Collections.singletonList(new i.b().e0("application/cea-608").E());
        } else {
            list = Collections.emptyList();
        }
        String str = iVar.f9202i;
        if (!TextUtils.isEmpty(str)) {
            if (!ak.r.b(str, "audio/mp4a-latm")) {
                i12 |= 2;
            }
            if (!ak.r.b(str, "video/avc")) {
                i12 |= 4;
            }
        }
        return new h0(2, g0Var, new ti.j(i12, list));
    }

    private static boolean g(ci.i iVar) {
        a.b c11;
        wi.a aVar = iVar.f9203j;
        if (aVar == null) {
            return false;
        }
        for (int i11 = 0; i11 < aVar.d(); i11++) {
            if (aVar.c(i11) instanceof r) {
                return !((r) c11).f34803c.isEmpty();
            }
        }
        return false;
    }

    private static boolean h(ji.h hVar, ji.i iVar) {
        try {
            boolean d11 = hVar.d(iVar);
            iVar.d();
            return d11;
        } catch (EOFException unused) {
            iVar.d();
            return false;
        } catch (Throwable th2) {
            iVar.d();
            throw th2;
        }
    }

    @Override // kj.h
    /* renamed from: c */
    public b a(Uri uri, ci.i iVar, List<ci.i> list, g0 g0Var, Map<String, List<String>> map, ji.i iVar2) {
        int a11 = ak.h.a(iVar.f9205l);
        int b11 = ak.h.b(map);
        int c11 = ak.h.c(uri);
        int[] iArr = f34683d;
        ArrayList arrayList = new ArrayList(iArr.length);
        b(a11, arrayList);
        b(b11, arrayList);
        b(c11, arrayList);
        for (int i11 : iArr) {
            b(i11, arrayList);
        }
        ji.h hVar = null;
        iVar2.d();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            int intValue = ((Integer) arrayList.get(i12)).intValue();
            ji.h hVar2 = (ji.h) ak.a.e(d(intValue, iVar, list, g0Var));
            if (h(hVar2, iVar2)) {
                return new b(hVar2, iVar, g0Var);
            }
            if (intValue == 11) {
                hVar = hVar2;
            }
        }
        return new b((ji.h) ak.a.e(hVar), iVar, g0Var);
    }

    public d(int i11, boolean z11) {
        this.f34684b = i11;
        this.f34685c = z11;
    }
}