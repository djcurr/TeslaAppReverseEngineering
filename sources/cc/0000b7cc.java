package uj;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import nj.b;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f53490a;

    /* renamed from: b  reason: collision with root package name */
    public final String f53491b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f53492c;

    /* renamed from: d  reason: collision with root package name */
    public final long f53493d;

    /* renamed from: e  reason: collision with root package name */
    public final long f53494e;

    /* renamed from: f  reason: collision with root package name */
    public final f f53495f;

    /* renamed from: g  reason: collision with root package name */
    private final String[] f53496g;

    /* renamed from: h  reason: collision with root package name */
    public final String f53497h;

    /* renamed from: i  reason: collision with root package name */
    public final String f53498i;

    /* renamed from: j  reason: collision with root package name */
    public final c f53499j;

    /* renamed from: k  reason: collision with root package name */
    private final HashMap<String, Integer> f53500k;

    /* renamed from: l  reason: collision with root package name */
    private final HashMap<String, Integer> f53501l;

    /* renamed from: m  reason: collision with root package name */
    private List<c> f53502m;

    private c(String str, String str2, long j11, long j12, f fVar, String[] strArr, String str3, String str4, c cVar) {
        this.f53490a = str;
        this.f53491b = str2;
        this.f53498i = str4;
        this.f53495f = fVar;
        this.f53496g = strArr;
        this.f53492c = str2 != null;
        this.f53493d = j11;
        this.f53494e = j12;
        this.f53497h = (String) ak.a.e(str3);
        this.f53499j = cVar;
        this.f53500k = new HashMap<>();
        this.f53501l = new HashMap<>();
    }

    private void b(Map<String, f> map, b.C0811b c0811b, int i11, int i12) {
        f f11 = e.f(this.f53495f, this.f53496g, map);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) c0811b.e();
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder();
            c0811b.m(spannableStringBuilder);
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        if (f11 != null) {
            e.a(spannableStringBuilder2, i11, i12, f11, this.f53499j, map);
            c0811b.n(f11.k());
        }
    }

    public static c c(String str, long j11, long j12, f fVar, String[] strArr, String str2, String str3, c cVar) {
        return new c(str, null, j11, j12, fVar, strArr, str2, str3, cVar);
    }

    public static c d(String str) {
        return new c(null, e.b(str), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    private static void e(SpannableStringBuilder spannableStringBuilder) {
        a[] aVarArr;
        for (a aVar : (a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), a.class)) {
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(aVar), spannableStringBuilder.getSpanEnd(aVar), "");
        }
        for (int i11 = 0; i11 < spannableStringBuilder.length(); i11++) {
            if (spannableStringBuilder.charAt(i11) == ' ') {
                int i12 = i11 + 1;
                int i13 = i12;
                while (i13 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i13) == ' ') {
                    i13++;
                }
                int i14 = i13 - i12;
                if (i14 > 0) {
                    spannableStringBuilder.delete(i11, i14 + i11);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
        }
        for (int i15 = 0; i15 < spannableStringBuilder.length() - 1; i15++) {
            if (spannableStringBuilder.charAt(i15) == '\n') {
                int i16 = i15 + 1;
                if (spannableStringBuilder.charAt(i16) == ' ') {
                    spannableStringBuilder.delete(i16, i15 + 2);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
        for (int i17 = 0; i17 < spannableStringBuilder.length() - 1; i17++) {
            if (spannableStringBuilder.charAt(i17) == ' ') {
                int i18 = i17 + 1;
                if (spannableStringBuilder.charAt(i18) == '\n') {
                    spannableStringBuilder.delete(i17, i18);
                }
            }
        }
        if (spannableStringBuilder.length() <= 0 || spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
            return;
        }
        spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
    }

    private void i(TreeSet<Long> treeSet, boolean z11) {
        boolean equals = "p".equals(this.f53490a);
        boolean equals2 = "div".equals(this.f53490a);
        if (z11 || equals || (equals2 && this.f53498i != null)) {
            long j11 = this.f53493d;
            if (j11 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j11));
            }
            long j12 = this.f53494e;
            if (j12 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j12));
            }
        }
        if (this.f53502m == null) {
            return;
        }
        for (int i11 = 0; i11 < this.f53502m.size(); i11++) {
            this.f53502m.get(i11).i(treeSet, z11 || equals);
        }
    }

    private static SpannableStringBuilder k(String str, Map<String, b.C0811b> map) {
        if (!map.containsKey(str)) {
            b.C0811b c0811b = new b.C0811b();
            c0811b.m(new SpannableStringBuilder());
            map.put(str, c0811b);
        }
        return (SpannableStringBuilder) ak.a.e(map.get(str).e());
    }

    private void n(long j11, String str, List<Pair<String, String>> list) {
        if (!"".equals(this.f53497h)) {
            str = this.f53497h;
        }
        if (m(j11) && "div".equals(this.f53490a) && this.f53498i != null) {
            list.add(new Pair<>(str, this.f53498i));
            return;
        }
        for (int i11 = 0; i11 < g(); i11++) {
            f(i11).n(j11, str, list);
        }
    }

    private void o(long j11, Map<String, f> map, Map<String, b.C0811b> map2) {
        int i11;
        if (m(j11)) {
            Iterator<Map.Entry<String, Integer>> it2 = this.f53501l.entrySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Map.Entry<String, Integer> next = it2.next();
                String key = next.getKey();
                i11 = this.f53500k.containsKey(key) ? this.f53500k.get(key).intValue() : 0;
                int intValue = next.getValue().intValue();
                if (i11 != intValue) {
                    b(map, (b.C0811b) ak.a.e(map2.get(key)), i11, intValue);
                }
            }
            while (i11 < g()) {
                f(i11).o(j11, map, map2);
                i11++;
            }
        }
    }

    private void p(long j11, boolean z11, String str, Map<String, b.C0811b> map) {
        this.f53500k.clear();
        this.f53501l.clear();
        if ("metadata".equals(this.f53490a)) {
            return;
        }
        if (!"".equals(this.f53497h)) {
            str = this.f53497h;
        }
        if (this.f53492c && z11) {
            k(str, map).append((CharSequence) ak.a.e(this.f53491b));
        } else if ("br".equals(this.f53490a) && z11) {
            k(str, map).append('\n');
        } else if (m(j11)) {
            for (Map.Entry<String, b.C0811b> entry : map.entrySet()) {
                this.f53500k.put(entry.getKey(), Integer.valueOf(((CharSequence) ak.a.e(entry.getValue().e())).length()));
            }
            boolean equals = "p".equals(this.f53490a);
            for (int i11 = 0; i11 < g(); i11++) {
                f(i11).p(j11, z11 || equals, str, map);
            }
            if (equals) {
                e.c(k(str, map));
            }
            for (Map.Entry<String, b.C0811b> entry2 : map.entrySet()) {
                this.f53501l.put(entry2.getKey(), Integer.valueOf(((CharSequence) ak.a.e(entry2.getValue().e())).length()));
            }
        }
    }

    public void a(c cVar) {
        if (this.f53502m == null) {
            this.f53502m = new ArrayList();
        }
        this.f53502m.add(cVar);
    }

    public c f(int i11) {
        List<c> list = this.f53502m;
        if (list != null) {
            return list.get(i11);
        }
        throw new IndexOutOfBoundsException();
    }

    public int g() {
        List<c> list = this.f53502m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<nj.b> h(long j11, Map<String, f> map, Map<String, d> map2, Map<String, String> map3) {
        List<Pair<String, String>> arrayList = new ArrayList<>();
        n(j11, this.f53497h, arrayList);
        TreeMap treeMap = new TreeMap();
        p(j11, false, this.f53497h, treeMap);
        o(j11, map, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair<String, String> pair : arrayList) {
            String str = map3.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                d dVar = (d) ak.a.e(map2.get(pair.first));
                arrayList2.add(new b.C0811b().f(decodeByteArray).j(dVar.f53504b).k(0).h(dVar.f53505c, 0).i(dVar.f53507e).l(dVar.f53508f).g(dVar.f53509g).p(dVar.f53512j).a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            d dVar2 = (d) ak.a.e(map2.get(entry.getKey()));
            b.C0811b c0811b = (b.C0811b) entry.getValue();
            e((SpannableStringBuilder) ak.a.e(c0811b.e()));
            c0811b.h(dVar2.f53505c, dVar2.f53506d);
            c0811b.i(dVar2.f53507e);
            c0811b.j(dVar2.f53504b);
            c0811b.l(dVar2.f53508f);
            c0811b.o(dVar2.f53511i, dVar2.f53510h);
            c0811b.p(dVar2.f53512j);
            arrayList2.add(c0811b.a());
        }
        return arrayList2;
    }

    public long[] j() {
        TreeSet<Long> treeSet = new TreeSet<>();
        int i11 = 0;
        i(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator<Long> it2 = treeSet.iterator();
        while (it2.hasNext()) {
            jArr[i11] = it2.next().longValue();
            i11++;
        }
        return jArr;
    }

    public String[] l() {
        return this.f53496g;
    }

    public boolean m(long j11) {
        long j12 = this.f53493d;
        return (j12 == -9223372036854775807L && this.f53494e == -9223372036854775807L) || (j12 <= j11 && this.f53494e == -9223372036854775807L) || ((j12 == -9223372036854775807L && j11 < this.f53494e) || (j12 <= j11 && j11 < this.f53494e));
    }
}