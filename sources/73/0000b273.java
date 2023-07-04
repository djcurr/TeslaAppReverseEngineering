package sj;

import ak.k0;
import ak.o;
import ak.v;
import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import nj.b;
import nj.f;
import sj.c;

/* loaded from: classes3.dex */
public final class a extends nj.d {

    /* renamed from: s  reason: collision with root package name */
    private static final Pattern f50414s = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: n  reason: collision with root package name */
    private final boolean f50415n;

    /* renamed from: o  reason: collision with root package name */
    private final b f50416o;

    /* renamed from: p  reason: collision with root package name */
    private Map<String, c> f50417p;

    /* renamed from: q  reason: collision with root package name */
    private float f50418q;

    /* renamed from: r  reason: collision with root package name */
    private float f50419r;

    public a(List<byte[]> list) {
        super("SsaDecoder");
        this.f50418q = -3.4028235E38f;
        this.f50419r = -3.4028235E38f;
        if (list != null && !list.isEmpty()) {
            this.f50415n = true;
            String E = k0.E(list.get(0));
            ak.a.a(E.startsWith("Format:"));
            this.f50416o = (b) ak.a.e(b.a(E));
            G(new v(list.get(1)));
            return;
        }
        this.f50415n = false;
        this.f50416o = null;
    }

    private static int B(long j11, List<Long> list, List<List<nj.b>> list2) {
        int i11;
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                i11 = 0;
                break;
            } else if (list.get(size).longValue() == j11) {
                return size;
            } else {
                if (list.get(size).longValue() < j11) {
                    i11 = size + 1;
                    break;
                }
                size--;
            }
        }
        list.add(i11, Long.valueOf(j11));
        list2.add(i11, i11 == 0 ? new ArrayList() : new ArrayList(list2.get(i11 - 1)));
        return i11;
    }

    private static float C(int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                return i11 != 2 ? -3.4028235E38f : 0.95f;
            }
            return 0.5f;
        }
        return 0.05f;
    }

    private static nj.b D(String str, c cVar, c.b bVar, float f11, float f12) {
        SpannableString spannableString = new SpannableString(str);
        b.C0811b m11 = new b.C0811b().m(spannableString);
        if (cVar != null) {
            if (cVar.f50427c != null) {
                spannableString.setSpan(new ForegroundColorSpan(cVar.f50427c.intValue()), 0, spannableString.length(), 33);
            }
            float f13 = cVar.f50428d;
            if (f13 != -3.4028235E38f && f12 != -3.4028235E38f) {
                m11.o(f13 / f12, 1);
            }
        }
        int i11 = bVar.f50438a;
        if (i11 == -1) {
            i11 = cVar != null ? cVar.f50426b : -1;
        }
        m11.n(M(i11)).k(L(i11)).i(K(i11));
        PointF pointF = bVar.f50439b;
        if (pointF != null && f12 != -3.4028235E38f && f11 != -3.4028235E38f) {
            m11.j(pointF.x / f11);
            m11.h(bVar.f50439b.y / f12, 0);
        } else {
            m11.j(C(m11.d()));
            m11.h(C(m11.c()), 0);
        }
        return m11.a();
    }

    private void E(String str, b bVar, List<List<nj.b>> list, List<Long> list2) {
        int i11;
        ak.a.a(str.startsWith("Dialogue:"));
        String[] split = str.substring(9).split(",", bVar.f50424e);
        if (split.length != bVar.f50424e) {
            o.h("SsaDecoder", str.length() != 0 ? "Skipping dialogue line with fewer columns than format: ".concat(str) : new String("Skipping dialogue line with fewer columns than format: "));
            return;
        }
        long J = J(split[bVar.f50420a]);
        if (J == -9223372036854775807L) {
            o.h("SsaDecoder", str.length() != 0 ? "Skipping invalid timing: ".concat(str) : new String("Skipping invalid timing: "));
            return;
        }
        long J2 = J(split[bVar.f50421b]);
        if (J2 == -9223372036854775807L) {
            o.h("SsaDecoder", str.length() != 0 ? "Skipping invalid timing: ".concat(str) : new String("Skipping invalid timing: "));
            return;
        }
        Map<String, c> map = this.f50417p;
        c cVar = (map == null || (i11 = bVar.f50422c) == -1) ? null : map.get(split[i11].trim());
        String str2 = split[bVar.f50423d];
        nj.b D = D(c.b.d(str2).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " "), cVar, c.b.b(str2), this.f50418q, this.f50419r);
        int B = B(J2, list2, list);
        for (int B2 = B(J, list2, list); B2 < B; B2++) {
            list.get(B2).add(D);
        }
    }

    private void F(v vVar, List<List<nj.b>> list, List<Long> list2) {
        b bVar = this.f50415n ? this.f50416o : null;
        while (true) {
            String o11 = vVar.o();
            if (o11 == null) {
                return;
            }
            if (o11.startsWith("Format:")) {
                bVar = b.a(o11);
            } else if (o11.startsWith("Dialogue:")) {
                if (bVar == null) {
                    o.h("SsaDecoder", o11.length() != 0 ? "Skipping dialogue line before complete format: ".concat(o11) : new String("Skipping dialogue line before complete format: "));
                } else {
                    E(o11, bVar, list, list2);
                }
            }
        }
    }

    private void G(v vVar) {
        while (true) {
            String o11 = vVar.o();
            if (o11 == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(o11)) {
                H(vVar);
            } else if ("[V4+ Styles]".equalsIgnoreCase(o11)) {
                this.f50417p = I(vVar);
            } else if ("[V4 Styles]".equalsIgnoreCase(o11)) {
                o.f("SsaDecoder", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(o11)) {
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0006  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void H(ak.v r5) {
        /*
            r4 = this;
        L0:
            java.lang.String r0 = r5.o()
            if (r0 == 0) goto L59
            int r1 = r5.a()
            if (r1 == 0) goto L14
            int r1 = r5.h()
            r2 = 91
            if (r1 == r2) goto L59
        L14:
            java.lang.String r1 = ":"
            java.lang.String[] r0 = r0.split(r1)
            int r1 = r0.length
            r2 = 2
            if (r1 == r2) goto L1f
            goto L0
        L1f:
            r1 = 0
            r1 = r0[r1]
            java.lang.String r1 = r1.trim()
            java.lang.String r1 = ak.k0.R0(r1)
            r1.hashCode()
            java.lang.String r2 = "playresx"
            boolean r2 = r1.equals(r2)
            r3 = 1
            if (r2 != 0) goto L4c
            java.lang.String r2 = "playresy"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L3f
            goto L0
        L3f:
            r0 = r0[r3]     // Catch: java.lang.NumberFormatException -> L0
            java.lang.String r0 = r0.trim()     // Catch: java.lang.NumberFormatException -> L0
            float r0 = java.lang.Float.parseFloat(r0)     // Catch: java.lang.NumberFormatException -> L0
            r4.f50419r = r0     // Catch: java.lang.NumberFormatException -> L0
            goto L0
        L4c:
            r0 = r0[r3]     // Catch: java.lang.NumberFormatException -> L0
            java.lang.String r0 = r0.trim()     // Catch: java.lang.NumberFormatException -> L0
            float r0 = java.lang.Float.parseFloat(r0)     // Catch: java.lang.NumberFormatException -> L0
            r4.f50418q = r0     // Catch: java.lang.NumberFormatException -> L0
            goto L0
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sj.a.H(ak.v):void");
    }

    private static Map<String, c> I(v vVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c.a aVar = null;
        while (true) {
            String o11 = vVar.o();
            if (o11 == null || (vVar.a() != 0 && vVar.h() == 91)) {
                break;
            } else if (o11.startsWith("Format:")) {
                aVar = c.a.a(o11);
            } else if (o11.startsWith("Style:")) {
                if (aVar == null) {
                    o.h("SsaDecoder", o11.length() != 0 ? "Skipping 'Style:' line before 'Format:' line: ".concat(o11) : new String("Skipping 'Style:' line before 'Format:' line: "));
                } else {
                    c b11 = c.b(o11, aVar);
                    if (b11 != null) {
                        linkedHashMap.put(b11.f50425a, b11);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    private static long J(String str) {
        Matcher matcher = f50414s.matcher(str.trim());
        if (matcher.matches()) {
            return (Long.parseLong((String) k0.j(matcher.group(1))) * 60 * 60 * 1000000) + (Long.parseLong((String) k0.j(matcher.group(2))) * 60 * 1000000) + (Long.parseLong((String) k0.j(matcher.group(3))) * 1000000) + (Long.parseLong((String) k0.j(matcher.group(4))) * AbstractComponentTracker.LINGERING_TIMEOUT);
        }
        return -9223372036854775807L;
    }

    private static int K(int i11) {
        switch (i11) {
            case -1:
                return Integer.MIN_VALUE;
            case 0:
            default:
                StringBuilder sb2 = new StringBuilder(30);
                sb2.append("Unknown alignment: ");
                sb2.append(i11);
                o.h("SsaDecoder", sb2.toString());
                return Integer.MIN_VALUE;
            case 1:
            case 2:
            case 3:
                return 2;
            case 4:
            case 5:
            case 6:
                return 1;
            case 7:
            case 8:
            case 9:
                return 0;
        }
    }

    private static int L(int i11) {
        switch (i11) {
            case -1:
                return Integer.MIN_VALUE;
            case 0:
            default:
                StringBuilder sb2 = new StringBuilder(30);
                sb2.append("Unknown alignment: ");
                sb2.append(i11);
                o.h("SsaDecoder", sb2.toString());
                return Integer.MIN_VALUE;
            case 1:
            case 4:
            case 7:
                return 0;
            case 2:
            case 5:
            case 8:
                return 1;
            case 3:
            case 6:
            case 9:
                return 2;
        }
    }

    private static Layout.Alignment M(int i11) {
        switch (i11) {
            case -1:
                return null;
            case 0:
            default:
                StringBuilder sb2 = new StringBuilder(30);
                sb2.append("Unknown alignment: ");
                sb2.append(i11);
                o.h("SsaDecoder", sb2.toString());
                return null;
            case 1:
            case 4:
            case 7:
                return Layout.Alignment.ALIGN_NORMAL;
            case 2:
            case 5:
            case 8:
                return Layout.Alignment.ALIGN_CENTER;
            case 3:
            case 6:
            case 9:
                return Layout.Alignment.ALIGN_OPPOSITE;
        }
    }

    @Override // nj.d
    protected f A(byte[] bArr, int i11, boolean z11) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        v vVar = new v(bArr, i11);
        if (!this.f50415n) {
            G(vVar);
        }
        F(vVar, arrayList, arrayList2);
        return new d(arrayList, arrayList2);
    }
}