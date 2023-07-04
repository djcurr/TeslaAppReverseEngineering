package wj;

import ak.k0;
import ak.v;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
final class a {

    /* renamed from: c  reason: collision with root package name */
    private static final Pattern f55915c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: a  reason: collision with root package name */
    private final v f55916a = new v();

    /* renamed from: b  reason: collision with root package name */
    private final StringBuilder f55917b = new StringBuilder();

    private void a(d dVar, String str) {
        if ("".equals(str)) {
            return;
        }
        int indexOf = str.indexOf(91);
        if (indexOf != -1) {
            Matcher matcher = f55915c.matcher(str.substring(indexOf));
            if (matcher.matches()) {
                dVar.x((String) ak.a.e(matcher.group(1)));
            }
            str = str.substring(0, indexOf);
        }
        String[] L0 = k0.L0(str, "\\.");
        String str2 = L0[0];
        int indexOf2 = str2.indexOf(35);
        if (indexOf2 != -1) {
            dVar.w(str2.substring(0, indexOf2));
            dVar.v(str2.substring(indexOf2 + 1));
        } else {
            dVar.w(str2);
        }
        if (L0.length > 1) {
            dVar.u((String[]) k0.C0(L0, 1, L0.length));
        }
    }

    private static boolean b(v vVar) {
        int e11 = vVar.e();
        int f11 = vVar.f();
        byte[] d11 = vVar.d();
        if (e11 + 2 > f11) {
            return false;
        }
        int i11 = e11 + 1;
        if (d11[e11] != 47) {
            return false;
        }
        int i12 = i11 + 1;
        if (d11[i11] != 42) {
            return false;
        }
        while (true) {
            int i13 = i12 + 1;
            if (i13 < f11) {
                if (((char) d11[i12]) == '*' && ((char) d11[i13]) == '/') {
                    i12 = i13 + 1;
                    f11 = i12;
                } else {
                    i12 = i13;
                }
            } else {
                vVar.P(f11 - vVar.e());
                return true;
            }
        }
    }

    private static boolean c(v vVar) {
        char j11 = j(vVar, vVar.e());
        if (j11 == '\t' || j11 == '\n' || j11 == '\f' || j11 == '\r' || j11 == ' ') {
            vVar.P(1);
            return true;
        }
        return false;
    }

    private static String e(v vVar, StringBuilder sb2) {
        boolean z11 = false;
        sb2.setLength(0);
        int e11 = vVar.e();
        int f11 = vVar.f();
        while (e11 < f11 && !z11) {
            char c11 = (char) vVar.d()[e11];
            if ((c11 < 'A' || c11 > 'Z') && ((c11 < 'a' || c11 > 'z') && !((c11 >= '0' && c11 <= '9') || c11 == '#' || c11 == '-' || c11 == '.' || c11 == '_'))) {
                z11 = true;
            } else {
                e11++;
                sb2.append(c11);
            }
        }
        vVar.P(e11 - vVar.e());
        return sb2.toString();
    }

    static String f(v vVar, StringBuilder sb2) {
        m(vVar);
        if (vVar.a() == 0) {
            return null;
        }
        String e11 = e(vVar, sb2);
        if ("".equals(e11)) {
            StringBuilder sb3 = new StringBuilder(1);
            sb3.append((char) vVar.C());
            return sb3.toString();
        }
        return e11;
    }

    private static String g(v vVar, StringBuilder sb2) {
        StringBuilder sb3 = new StringBuilder();
        boolean z11 = false;
        while (!z11) {
            int e11 = vVar.e();
            String f11 = f(vVar, sb2);
            if (f11 == null) {
                return null;
            }
            if (!"}".equals(f11) && !";".equals(f11)) {
                sb3.append(f11);
            } else {
                vVar.O(e11);
                z11 = true;
            }
        }
        return sb3.toString();
    }

    private static String h(v vVar, StringBuilder sb2) {
        m(vVar);
        if (vVar.a() >= 5 && "::cue".equals(vVar.z(5))) {
            int e11 = vVar.e();
            String f11 = f(vVar, sb2);
            if (f11 == null) {
                return null;
            }
            if ("{".equals(f11)) {
                vVar.O(e11);
                return "";
            }
            String k11 = "(".equals(f11) ? k(vVar) : null;
            if (")".equals(f(vVar, sb2))) {
                return k11;
            }
            return null;
        }
        return null;
    }

    private static void i(v vVar, d dVar, StringBuilder sb2) {
        m(vVar);
        String e11 = e(vVar, sb2);
        if (!"".equals(e11) && ":".equals(f(vVar, sb2))) {
            m(vVar);
            String g11 = g(vVar, sb2);
            if (g11 == null || "".equals(g11)) {
                return;
            }
            int e12 = vVar.e();
            String f11 = f(vVar, sb2);
            if (!";".equals(f11)) {
                if (!"}".equals(f11)) {
                    return;
                }
                vVar.O(e12);
            }
            if ("color".equals(e11)) {
                dVar.q(ak.d.b(g11));
            } else if ("background-color".equals(e11)) {
                dVar.n(ak.d.b(g11));
            } else {
                boolean z11 = true;
                if ("ruby-position".equals(e11)) {
                    if ("over".equals(g11)) {
                        dVar.t(1);
                    } else if ("under".equals(g11)) {
                        dVar.t(2);
                    }
                } else if ("text-combine-upright".equals(e11)) {
                    if (!"all".equals(g11) && !g11.startsWith("digits")) {
                        z11 = false;
                    }
                    dVar.p(z11);
                } else if ("text-decoration".equals(e11)) {
                    if ("underline".equals(g11)) {
                        dVar.y(true);
                    }
                } else if ("font-family".equals(e11)) {
                    dVar.r(g11);
                } else if ("font-weight".equals(e11)) {
                    if ("bold".equals(g11)) {
                        dVar.o(true);
                    }
                } else if ("font-style".equals(e11) && "italic".equals(g11)) {
                    dVar.s(true);
                }
            }
        }
    }

    private static char j(v vVar, int i11) {
        return (char) vVar.d()[i11];
    }

    private static String k(v vVar) {
        int e11 = vVar.e();
        int f11 = vVar.f();
        boolean z11 = false;
        while (e11 < f11 && !z11) {
            int i11 = e11 + 1;
            z11 = ((char) vVar.d()[e11]) == ')';
            e11 = i11;
        }
        return vVar.z((e11 - 1) - vVar.e()).trim();
    }

    static void l(v vVar) {
        do {
        } while (!TextUtils.isEmpty(vVar.o()));
    }

    static void m(v vVar) {
        while (true) {
            for (boolean z11 = true; vVar.a() > 0 && z11; z11 = false) {
                if (!c(vVar) && !b(vVar)) {
                }
            }
            return;
        }
    }

    public List<d> d(v vVar) {
        this.f55917b.setLength(0);
        int e11 = vVar.e();
        l(vVar);
        this.f55916a.M(vVar.d(), vVar.e());
        this.f55916a.O(e11);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String h11 = h(this.f55916a, this.f55917b);
            if (h11 == null || !"{".equals(f(this.f55916a, this.f55917b))) {
                return arrayList;
            }
            d dVar = new d();
            a(dVar, h11);
            String str = null;
            boolean z11 = false;
            while (!z11) {
                int e12 = this.f55916a.e();
                String f11 = f(this.f55916a, this.f55917b);
                boolean z12 = f11 == null || "}".equals(f11);
                if (!z12) {
                    this.f55916a.O(e12);
                    i(this.f55916a, dVar, this.f55917b);
                }
                str = f11;
                z11 = z12;
            }
            if ("}".equals(str)) {
                arrayList.add(dVar);
            }
        }
    }
}