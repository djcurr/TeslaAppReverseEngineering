package tj;

import ak.o;
import ak.p;
import ak.v;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import nj.b;
import nj.d;
import nj.f;

/* loaded from: classes3.dex */
public final class a extends d {

    /* renamed from: p  reason: collision with root package name */
    private static final Pattern f52315p = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* renamed from: q  reason: collision with root package name */
    private static final Pattern f52316q = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: n  reason: collision with root package name */
    private final StringBuilder f52317n;

    /* renamed from: o  reason: collision with root package name */
    private final ArrayList<String> f52318o;

    public a() {
        super("SubripDecoder");
        this.f52317n = new StringBuilder();
        this.f52318o = new ArrayList<>();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private nj.b B(Spanned spanned, String str) {
        char c11;
        char c12;
        b.C0811b m11 = new b.C0811b().m(spanned);
        if (str == null) {
            return m11.a();
        }
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    c11 = 0;
                    break;
                }
                c11 = 65535;
                break;
            case -685620679:
                if (str.equals("{\\an2}")) {
                    c11 = 6;
                    break;
                }
                c11 = 65535;
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    c11 = 3;
                    break;
                }
                c11 = 65535;
                break;
            case -685620617:
                if (str.equals("{\\an4}")) {
                    c11 = 1;
                    break;
                }
                c11 = 65535;
                break;
            case -685620586:
                if (str.equals("{\\an5}")) {
                    c11 = 7;
                    break;
                }
                c11 = 65535;
                break;
            case -685620555:
                if (str.equals("{\\an6}")) {
                    c11 = 4;
                    break;
                }
                c11 = 65535;
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    c11 = 2;
                    break;
                }
                c11 = 65535;
                break;
            case -685620493:
                if (str.equals("{\\an8}")) {
                    c11 = '\b';
                    break;
                }
                c11 = 65535;
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    c11 = 5;
                    break;
                }
                c11 = 65535;
                break;
            default:
                c11 = 65535;
                break;
        }
        if (c11 == 0 || c11 == 1 || c11 == 2) {
            m11.k(0);
        } else if (c11 != 3 && c11 != 4 && c11 != 5) {
            m11.k(1);
        } else {
            m11.k(2);
        }
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    c12 = 0;
                    break;
                }
                c12 = 65535;
                break;
            case -685620679:
                if (str.equals("{\\an2}")) {
                    c12 = 1;
                    break;
                }
                c12 = 65535;
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    c12 = 2;
                    break;
                }
                c12 = 65535;
                break;
            case -685620617:
                if (str.equals("{\\an4}")) {
                    c12 = 6;
                    break;
                }
                c12 = 65535;
                break;
            case -685620586:
                if (str.equals("{\\an5}")) {
                    c12 = 7;
                    break;
                }
                c12 = 65535;
                break;
            case -685620555:
                if (str.equals("{\\an6}")) {
                    c12 = '\b';
                    break;
                }
                c12 = 65535;
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    c12 = 3;
                    break;
                }
                c12 = 65535;
                break;
            case -685620493:
                if (str.equals("{\\an8}")) {
                    c12 = 4;
                    break;
                }
                c12 = 65535;
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    c12 = 5;
                    break;
                }
                c12 = 65535;
                break;
            default:
                c12 = 65535;
                break;
        }
        if (c12 == 0 || c12 == 1 || c12 == 2) {
            m11.i(2);
        } else if (c12 != 3 && c12 != 4 && c12 != 5) {
            m11.i(1);
        } else {
            m11.i(0);
        }
        return m11.j(C(m11.d())).h(C(m11.c()), 0).a();
    }

    static float C(int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    return 0.92f;
                }
                throw new IllegalArgumentException();
            }
            return 0.5f;
        }
        return 0.08f;
    }

    private static long D(Matcher matcher, int i11) {
        String group = matcher.group(i11 + 1);
        long parseLong = (group != null ? Long.parseLong(group) * 60 * 60 * 1000 : 0L) + (Long.parseLong((String) ak.a.e(matcher.group(i11 + 2))) * 60 * 1000) + (Long.parseLong((String) ak.a.e(matcher.group(i11 + 3))) * 1000);
        String group2 = matcher.group(i11 + 4);
        if (group2 != null) {
            parseLong += Long.parseLong(group2);
        }
        return parseLong * 1000;
    }

    private String E(String str, ArrayList<String> arrayList) {
        String trim = str.trim();
        StringBuilder sb2 = new StringBuilder(trim);
        Matcher matcher = f52316q.matcher(trim);
        int i11 = 0;
        while (matcher.find()) {
            String group = matcher.group();
            arrayList.add(group);
            int start = matcher.start() - i11;
            int length = group.length();
            sb2.replace(start, start + length, "");
            i11 += length;
        }
        return sb2.toString();
    }

    @Override // nj.d
    protected f A(byte[] bArr, int i11, boolean z11) {
        ArrayList arrayList = new ArrayList();
        p pVar = new p();
        v vVar = new v(bArr, i11);
        while (true) {
            String o11 = vVar.o();
            int i12 = 0;
            if (o11 == null) {
                break;
            } else if (o11.length() != 0) {
                try {
                    Integer.parseInt(o11);
                    String o12 = vVar.o();
                    if (o12 == null) {
                        o.h("SubripDecoder", "Unexpected end");
                        break;
                    }
                    Matcher matcher = f52315p.matcher(o12);
                    if (matcher.matches()) {
                        pVar.a(D(matcher, 1));
                        pVar.a(D(matcher, 6));
                        this.f52317n.setLength(0);
                        this.f52318o.clear();
                        for (String o13 = vVar.o(); !TextUtils.isEmpty(o13); o13 = vVar.o()) {
                            if (this.f52317n.length() > 0) {
                                this.f52317n.append("<br>");
                            }
                            this.f52317n.append(E(o13, this.f52318o));
                        }
                        Spanned fromHtml = Html.fromHtml(this.f52317n.toString());
                        String str = null;
                        while (true) {
                            if (i12 >= this.f52318o.size()) {
                                break;
                            }
                            String str2 = this.f52318o.get(i12);
                            if (str2.matches("\\{\\\\an[1-9]\\}")) {
                                str = str2;
                                break;
                            }
                            i12++;
                        }
                        arrayList.add(B(fromHtml, str));
                        arrayList.add(nj.b.f41693p);
                    } else {
                        o.h("SubripDecoder", o12.length() != 0 ? "Skipping invalid timing: ".concat(o12) : new String("Skipping invalid timing: "));
                    }
                } catch (NumberFormatException unused) {
                    o.h("SubripDecoder", o11.length() != 0 ? "Skipping invalid index: ".concat(o11) : new String("Skipping invalid index: "));
                }
            }
        }
        return new b((nj.b[]) arrayList.toArray(new nj.b[0]), pVar.d());
    }
}