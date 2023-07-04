package wj;

import ak.k0;
import ak.o;
import ak.v;
import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import nj.b;
import wj.f;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a */
    public static final Pattern f55940a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: b */
    private static final Pattern f55941b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c */
    private static final Map<String, Integer> f55942c;

    /* renamed from: d */
    private static final Map<String, Integer> f55943d;

    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: c */
        private static final Comparator<b> f55944c = new Comparator() { // from class: wj.g
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return f.b.a((f.b) obj, (f.b) obj2);
            }
        };

        /* renamed from: a */
        private final c f55945a;

        /* renamed from: b */
        private final int f55946b;

        public static /* synthetic */ int a(b bVar, b bVar2) {
            return e(bVar, bVar2);
        }

        public static /* synthetic */ int e(b bVar, b bVar2) {
            return Integer.compare(bVar.f55945a.f55948b, bVar2.f55945a.f55948b);
        }

        private b(c cVar, int i11) {
            this.f55945a = cVar;
            this.f55946b = i11;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a */
        public final String f55947a;

        /* renamed from: b */
        public final int f55948b;

        /* renamed from: c */
        public final String f55949c;

        /* renamed from: d */
        public final Set<String> f55950d;

        private c(String str, int i11, String str2, Set<String> set) {
            this.f55948b = i11;
            this.f55947a = str;
            this.f55949c = str2;
            this.f55950d = set;
        }

        public static c a(String str, int i11) {
            String str2;
            String trim = str.trim();
            ak.a.a(!trim.isEmpty());
            int indexOf = trim.indexOf(" ");
            if (indexOf == -1) {
                str2 = "";
            } else {
                String trim2 = trim.substring(indexOf).trim();
                trim = trim.substring(0, indexOf);
                str2 = trim2;
            }
            String[] L0 = k0.L0(trim, "\\.");
            String str3 = L0[0];
            HashSet hashSet = new HashSet();
            for (int i12 = 1; i12 < L0.length; i12++) {
                hashSet.add(L0[i12]);
            }
            return new c(str3, i11, str2, hashSet);
        }

        public static c b() {
            return new c("", 0, "", Collections.emptySet());
        }
    }

    /* loaded from: classes3.dex */
    public static final class d implements Comparable<d> {

        /* renamed from: a */
        public final int f55951a;

        /* renamed from: b */
        public final wj.d f55952b;

        public d(int i11, wj.d dVar) {
            this.f55951a = i11;
            this.f55952b = dVar;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(d dVar) {
            return Integer.compare(this.f55951a, dVar.f55951a);
        }
    }

    /* loaded from: classes3.dex */
    public static final class e {

        /* renamed from: c */
        public CharSequence f55955c;

        /* renamed from: a */
        public long f55953a = 0;

        /* renamed from: b */
        public long f55954b = 0;

        /* renamed from: d */
        public int f55956d = 2;

        /* renamed from: e */
        public float f55957e = -3.4028235E38f;

        /* renamed from: f */
        public int f55958f = 1;

        /* renamed from: g */
        public int f55959g = 0;

        /* renamed from: h */
        public float f55960h = -3.4028235E38f;

        /* renamed from: i */
        public int f55961i = Integer.MIN_VALUE;

        /* renamed from: j */
        public float f55962j = 1.0f;

        /* renamed from: k */
        public int f55963k = Integer.MIN_VALUE;

        private static float b(float f11, int i11) {
            int i12 = (f11 > (-3.4028235E38f) ? 1 : (f11 == (-3.4028235E38f) ? 0 : -1));
            if (i12 == 0 || i11 != 0 || (f11 >= BitmapDescriptorFactory.HUE_RED && f11 <= 1.0f)) {
                return i12 != 0 ? f11 : i11 == 0 ? 1.0f : -3.4028235E38f;
            }
            return 1.0f;
        }

        private static Layout.Alignment c(int i11) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 != 5) {
                                StringBuilder sb2 = new StringBuilder(34);
                                sb2.append("Unknown textAlignment: ");
                                sb2.append(i11);
                                o.h("WebvttCueParser", sb2.toString());
                                return null;
                            }
                        }
                    }
                    return Layout.Alignment.ALIGN_OPPOSITE;
                }
                return Layout.Alignment.ALIGN_CENTER;
            }
            return Layout.Alignment.ALIGN_NORMAL;
        }

        private static float d(int i11, float f11) {
            if (i11 != 0) {
                if (i11 == 1) {
                    return f11 <= 0.5f ? f11 * 2.0f : (1.0f - f11) * 2.0f;
                } else if (i11 == 2) {
                    return f11;
                } else {
                    throw new IllegalStateException(String.valueOf(i11));
                }
            }
            return 1.0f - f11;
        }

        private static float e(int i11) {
            return i11 != 4 ? i11 != 5 ? 0.5f : 1.0f : BitmapDescriptorFactory.HUE_RED;
        }

        private static int f(int i11) {
            if (i11 != 1) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        return i11 != 5 ? 1 : 2;
                    }
                    return 0;
                }
                return 2;
            }
            return 0;
        }

        public wj.e a() {
            return new wj.e(g().a(), this.f55953a, this.f55954b);
        }

        public b.C0811b g() {
            float f11 = this.f55960h;
            if (f11 == -3.4028235E38f) {
                f11 = e(this.f55956d);
            }
            int i11 = this.f55961i;
            if (i11 == Integer.MIN_VALUE) {
                i11 = f(this.f55956d);
            }
            b.C0811b p11 = new b.C0811b().n(c(this.f55956d)).h(b(this.f55957e, this.f55958f), this.f55958f).i(this.f55959g).j(f11).k(i11).l(Math.min(this.f55962j, d(i11, f11))).p(this.f55963k);
            CharSequence charSequence = this.f55955c;
            if (charSequence != null) {
                p11.m(charSequence);
            }
            return p11;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f55942c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f55943d = Collections.unmodifiableMap(hashMap2);
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, Set<String> set, int i11, int i12) {
        for (String str : set) {
            Map<String, Integer> map = f55942c;
            if (map.containsKey(str)) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(map.get(str).intValue()), i11, i12, 33);
            } else {
                Map<String, Integer> map2 = f55943d;
                if (map2.containsKey(str)) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(map2.get(str).intValue()), i11, i12, 33);
                }
            }
        }
    }

    private static void b(String str, SpannableStringBuilder spannableStringBuilder) {
        str.hashCode();
        char c11 = 65535;
        switch (str.hashCode()) {
            case 3309:
                if (str.equals("gt")) {
                    c11 = 0;
                    break;
                }
                break;
            case 3464:
                if (str.equals("lt")) {
                    c11 = 1;
                    break;
                }
                break;
            case 96708:
                if (str.equals("amp")) {
                    c11 = 2;
                    break;
                }
                break;
            case 3374865:
                if (str.equals("nbsp")) {
                    c11 = 3;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                spannableStringBuilder.append('>');
                return;
            case 1:
                spannableStringBuilder.append('<');
                return;
            case 2:
                spannableStringBuilder.append('&');
                return;
            case 3:
                spannableStringBuilder.append(' ');
                return;
            default:
                StringBuilder sb2 = new StringBuilder(str.length() + 33);
                sb2.append("ignoring unsupported entity: '&");
                sb2.append(str);
                sb2.append(";'");
                o.h("WebvttCueParser", sb2.toString());
                return;
        }
    }

    private static void c(SpannableStringBuilder spannableStringBuilder, String str, c cVar, List<b> list, List<wj.d> list2) {
        int i11 = i(list2, str, cVar);
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        Collections.sort(arrayList, b.f55944c);
        int i12 = cVar.f55948b;
        int i13 = 0;
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            if ("rt".equals(((b) arrayList.get(i14)).f55945a.f55947a)) {
                b bVar = (b) arrayList.get(i14);
                int g11 = g(i(list2, str, bVar.f55945a), i11, 1);
                int i15 = bVar.f55945a.f55948b - i13;
                int i16 = bVar.f55946b - i13;
                CharSequence subSequence = spannableStringBuilder.subSequence(i15, i16);
                spannableStringBuilder.delete(i15, i16);
                spannableStringBuilder.setSpan(new rj.b(subSequence.toString(), g11), i12, i15, 33);
                i13 += subSequence.length();
                i12 = i15;
            }
        }
    }

    private static void d(String str, c cVar, List<b> list, SpannableStringBuilder spannableStringBuilder, List<wj.d> list2) {
        int i11 = cVar.f55948b;
        int length = spannableStringBuilder.length();
        String str2 = cVar.f55947a;
        str2.hashCode();
        char c11 = 65535;
        switch (str2.hashCode()) {
            case 0:
                if (str2.equals("")) {
                    c11 = 0;
                    break;
                }
                break;
            case 98:
                if (str2.equals("b")) {
                    c11 = 1;
                    break;
                }
                break;
            case 99:
                if (str2.equals(cg.c.f9084i)) {
                    c11 = 2;
                    break;
                }
                break;
            case 105:
                if (str2.equals(IntegerTokenConverter.CONVERTER_KEY)) {
                    c11 = 3;
                    break;
                }
                break;
            case 117:
                if (str2.equals("u")) {
                    c11 = 4;
                    break;
                }
                break;
            case 118:
                if (str2.equals("v")) {
                    c11 = 5;
                    break;
                }
                break;
            case 3314158:
                if (str2.equals("lang")) {
                    c11 = 6;
                    break;
                }
                break;
            case 3511770:
                if (str2.equals("ruby")) {
                    c11 = 7;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
            case 5:
            case 6:
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(1), i11, length, 33);
                break;
            case 2:
                a(spannableStringBuilder, cVar.f55950d, i11, length);
                break;
            case 3:
                spannableStringBuilder.setSpan(new StyleSpan(2), i11, length, 33);
                break;
            case 4:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i11, length, 33);
                break;
            case 7:
                c(spannableStringBuilder, str, cVar, list, list2);
                break;
            default:
                return;
        }
        List<d> h11 = h(list2, str, cVar);
        for (int i12 = 0; i12 < h11.size(); i12++) {
            e(spannableStringBuilder, h11.get(i12).f55952b, i11, length);
        }
    }

    private static void e(SpannableStringBuilder spannableStringBuilder, wj.d dVar, int i11, int i12) {
        if (dVar == null) {
            return;
        }
        if (dVar.i() != -1) {
            rj.c.a(spannableStringBuilder, new StyleSpan(dVar.i()), i11, i12, 33);
        }
        if (dVar.l()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i11, i12, 33);
        }
        if (dVar.m()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i11, i12, 33);
        }
        if (dVar.k()) {
            rj.c.a(spannableStringBuilder, new ForegroundColorSpan(dVar.c()), i11, i12, 33);
        }
        if (dVar.j()) {
            rj.c.a(spannableStringBuilder, new BackgroundColorSpan(dVar.a()), i11, i12, 33);
        }
        if (dVar.d() != null) {
            rj.c.a(spannableStringBuilder, new TypefaceSpan(dVar.d()), i11, i12, 33);
        }
        int f11 = dVar.f();
        if (f11 == 1) {
            rj.c.a(spannableStringBuilder, new AbsoluteSizeSpan((int) dVar.e(), true), i11, i12, 33);
        } else if (f11 == 2) {
            rj.c.a(spannableStringBuilder, new RelativeSizeSpan(dVar.e()), i11, i12, 33);
        } else if (f11 == 3) {
            rj.c.a(spannableStringBuilder, new RelativeSizeSpan(dVar.e() / 100.0f), i11, i12, 33);
        }
        if (dVar.b()) {
            spannableStringBuilder.setSpan(new rj.a(), i11, i12, 33);
        }
    }

    private static int f(String str, int i11) {
        int indexOf = str.indexOf(62, i11);
        return indexOf == -1 ? str.length() : indexOf + 1;
    }

    private static int g(int i11, int i12, int i13) {
        if (i11 != -1) {
            return i11;
        }
        if (i12 != -1) {
            return i12;
        }
        if (i13 != -1) {
            return i13;
        }
        throw new IllegalArgumentException();
    }

    private static List<d> h(List<wj.d> list, String str, c cVar) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            wj.d dVar = list.get(i11);
            int h11 = dVar.h(str, cVar.f55947a, cVar.f55950d, cVar.f55949c);
            if (h11 > 0) {
                arrayList.add(new d(h11, dVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static int i(List<wj.d> list, String str, c cVar) {
        List<d> h11 = h(list, str, cVar);
        for (int i11 = 0; i11 < h11.size(); i11++) {
            wj.d dVar = h11.get(i11).f55952b;
            if (dVar.g() != -1) {
                return dVar.g();
            }
        }
        return -1;
    }

    private static String j(String str) {
        String trim = str.trim();
        ak.a.a(!trim.isEmpty());
        return k0.M0(trim, "[ \\.]")[0];
    }

    private static boolean k(String str) {
        str.hashCode();
        char c11 = 65535;
        switch (str.hashCode()) {
            case 98:
                if (str.equals("b")) {
                    c11 = 0;
                    break;
                }
                break;
            case 99:
                if (str.equals(cg.c.f9084i)) {
                    c11 = 1;
                    break;
                }
                break;
            case 105:
                if (str.equals(IntegerTokenConverter.CONVERTER_KEY)) {
                    c11 = 2;
                    break;
                }
                break;
            case 117:
                if (str.equals("u")) {
                    c11 = 3;
                    break;
                }
                break;
            case 118:
                if (str.equals("v")) {
                    c11 = 4;
                    break;
                }
                break;
            case 3650:
                if (str.equals("rt")) {
                    c11 = 5;
                    break;
                }
                break;
            case 3314158:
                if (str.equals("lang")) {
                    c11 = 6;
                    break;
                }
                break;
            case 3511770:
                if (str.equals("ruby")) {
                    c11 = 7;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return true;
            default:
                return false;
        }
    }

    public static nj.b l(CharSequence charSequence) {
        e eVar = new e();
        eVar.f55955c = charSequence;
        return eVar.g().a();
    }

    public static wj.e m(v vVar, List<wj.d> list) {
        String o11 = vVar.o();
        if (o11 == null) {
            return null;
        }
        Pattern pattern = f55940a;
        Matcher matcher = pattern.matcher(o11);
        if (matcher.matches()) {
            return n(null, matcher, vVar, list);
        }
        String o12 = vVar.o();
        if (o12 == null) {
            return null;
        }
        Matcher matcher2 = pattern.matcher(o12);
        if (matcher2.matches()) {
            return n(o11.trim(), matcher2, vVar, list);
        }
        return null;
    }

    private static wj.e n(String str, Matcher matcher, v vVar, List<wj.d> list) {
        e eVar = new e();
        try {
            eVar.f55953a = i.d((String) ak.a.e(matcher.group(1)));
            eVar.f55954b = i.d((String) ak.a.e(matcher.group(2)));
            p((String) ak.a.e(matcher.group(3)), eVar);
            StringBuilder sb2 = new StringBuilder();
            String o11 = vVar.o();
            while (!TextUtils.isEmpty(o11)) {
                if (sb2.length() > 0) {
                    sb2.append("\n");
                }
                sb2.append(o11.trim());
                o11 = vVar.o();
            }
            eVar.f55955c = q(str, sb2.toString(), list);
            return eVar.a();
        } catch (NumberFormatException unused) {
            String valueOf = String.valueOf(matcher.group());
            o.h("WebvttCueParser", valueOf.length() != 0 ? "Skipping cue with bad header: ".concat(valueOf) : new String("Skipping cue with bad header: "));
            return null;
        }
    }

    public static b.C0811b o(String str) {
        e eVar = new e();
        p(str, eVar);
        return eVar.g();
    }

    private static void p(String str, e eVar) {
        Matcher matcher = f55941b.matcher(str);
        while (matcher.find()) {
            String str2 = (String) ak.a.e(matcher.group(1));
            String str3 = (String) ak.a.e(matcher.group(2));
            try {
                if ("line".equals(str2)) {
                    s(str3, eVar);
                } else if ("align".equals(str2)) {
                    eVar.f55956d = v(str3);
                } else if ("position".equals(str2)) {
                    u(str3, eVar);
                } else if ("size".equals(str2)) {
                    eVar.f55962j = i.c(str3);
                } else if ("vertical".equals(str2)) {
                    eVar.f55963k = w(str3);
                } else {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 21 + String.valueOf(str3).length());
                    sb2.append("Unknown cue setting ");
                    sb2.append(str2);
                    sb2.append(":");
                    sb2.append(str3);
                    o.h("WebvttCueParser", sb2.toString());
                }
            } catch (NumberFormatException unused) {
                String valueOf = String.valueOf(matcher.group());
                o.h("WebvttCueParser", valueOf.length() != 0 ? "Skipping bad cue setting: ".concat(valueOf) : new String("Skipping bad cue setting: "));
            }
        }
    }

    public static SpannedString q(String str, String str2, List<wj.d> list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        while (i11 < str2.length()) {
            char charAt = str2.charAt(i11);
            if (charAt == '&') {
                i11++;
                int indexOf = str2.indexOf(59, i11);
                int indexOf2 = str2.indexOf(32, i11);
                if (indexOf == -1) {
                    indexOf = indexOf2;
                } else if (indexOf2 != -1) {
                    indexOf = Math.min(indexOf, indexOf2);
                }
                if (indexOf != -1) {
                    b(str2.substring(i11, indexOf), spannableStringBuilder);
                    if (indexOf == indexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i11 = indexOf + 1;
                } else {
                    spannableStringBuilder.append(charAt);
                }
            } else if (charAt != '<') {
                spannableStringBuilder.append(charAt);
                i11++;
            } else {
                int i12 = i11 + 1;
                if (i12 < str2.length()) {
                    boolean z11 = str2.charAt(i12) == '/';
                    i12 = f(str2, i12);
                    int i13 = i12 - 2;
                    boolean z12 = str2.charAt(i13) == '/';
                    int i14 = i11 + (z11 ? 2 : 1);
                    if (!z12) {
                        i13 = i12 - 1;
                    }
                    String substring = str2.substring(i14, i13);
                    if (!substring.trim().isEmpty()) {
                        String j11 = j(substring);
                        if (k(j11)) {
                            if (z11) {
                                while (!arrayDeque.isEmpty()) {
                                    c cVar = (c) arrayDeque.pop();
                                    d(str, cVar, arrayList, spannableStringBuilder, list);
                                    if (!arrayDeque.isEmpty()) {
                                        arrayList.add(new b(cVar, spannableStringBuilder.length()));
                                    } else {
                                        arrayList.clear();
                                    }
                                    if (cVar.f55947a.equals(j11)) {
                                        break;
                                    }
                                }
                            } else if (!z12) {
                                arrayDeque.push(c.a(substring, spannableStringBuilder.length()));
                            }
                        }
                    }
                }
                i11 = i12;
            }
        }
        while (!arrayDeque.isEmpty()) {
            d(str, (c) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        d(str, c.b(), Collections.emptyList(), spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    private static int r(String str) {
        str.hashCode();
        char c11 = 65535;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals("center")) {
                    c11 = 0;
                    break;
                }
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    c11 = 1;
                    break;
                }
                break;
            case 100571:
                if (str.equals("end")) {
                    c11 = 2;
                    break;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    c11 = 3;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 0;
            default:
                o.h("WebvttCueParser", str.length() != 0 ? "Invalid anchor value: ".concat(str) : new String("Invalid anchor value: "));
                return Integer.MIN_VALUE;
        }
    }

    private static void s(String str, e eVar) {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            eVar.f55959g = r(str.substring(indexOf + 1));
            str = str.substring(0, indexOf);
        }
        if (str.endsWith("%")) {
            eVar.f55957e = i.c(str);
            eVar.f55958f = 0;
            return;
        }
        eVar.f55957e = Integer.parseInt(str);
        eVar.f55958f = 1;
    }

    private static int t(String str) {
        str.hashCode();
        char c11 = 65535;
        switch (str.hashCode()) {
            case -1842484672:
                if (str.equals("line-left")) {
                    c11 = 0;
                    break;
                }
                break;
            case -1364013995:
                if (str.equals("center")) {
                    c11 = 1;
                    break;
                }
                break;
            case -1276788989:
                if (str.equals("line-right")) {
                    c11 = 2;
                    break;
                }
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    c11 = 3;
                    break;
                }
                break;
            case 100571:
                if (str.equals("end")) {
                    c11 = 4;
                    break;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    c11 = 5;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
            case 5:
                return 0;
            case 1:
            case 3:
                return 1;
            case 2:
            case 4:
                return 2;
            default:
                o.h("WebvttCueParser", str.length() != 0 ? "Invalid anchor value: ".concat(str) : new String("Invalid anchor value: "));
                return Integer.MIN_VALUE;
        }
    }

    private static void u(String str, e eVar) {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            eVar.f55961i = t(str.substring(indexOf + 1));
            str = str.substring(0, indexOf);
        }
        eVar.f55960h = i.c(str);
    }

    private static int v(String str) {
        str.hashCode();
        char c11 = 65535;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals("center")) {
                    c11 = 0;
                    break;
                }
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    c11 = 1;
                    break;
                }
                break;
            case 100571:
                if (str.equals("end")) {
                    c11 = 2;
                    break;
                }
                break;
            case 3317767:
                if (str.equals("left")) {
                    c11 = 3;
                    break;
                }
                break;
            case 108511772:
                if (str.equals("right")) {
                    c11 = 4;
                    break;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    c11 = 5;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 1;
            default:
                o.h("WebvttCueParser", str.length() != 0 ? "Invalid alignment value: ".concat(str) : new String("Invalid alignment value: "));
                return 2;
        }
    }

    private static int w(String str) {
        str.hashCode();
        if (str.equals("lr")) {
            return 2;
        }
        if (str.equals("rl")) {
            return 1;
        }
        o.h("WebvttCueParser", str.length() != 0 ? "Invalid 'vertical' value: ".concat(str) : new String("Invalid 'vertical' value: "));
        return Integer.MIN_VALUE;
    }
}