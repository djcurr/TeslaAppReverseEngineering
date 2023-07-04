package com.google.android.exoplayer2.ui;

import ak.k0;
import android.text.Html;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.SparseArray;
import com.google.android.exoplayer2.ui.d;
import com.google.common.collect.t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a */
    private static final Pattern f14529a = Pattern.compile("(&#13;)?&#10;");

    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a */
        public final String f14530a;

        /* renamed from: b */
        public final Map<String, String> f14531b;

        private b(String str, Map<String, String> map) {
            this.f14530a = str;
            this.f14531b = map;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: e */
        private static final Comparator<c> f14532e = new Comparator() { // from class: com.google.android.exoplayer2.ui.e
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return d.c.a((d.c) obj, (d.c) obj2);
            }
        };

        /* renamed from: f */
        private static final Comparator<c> f14533f = new Comparator() { // from class: com.google.android.exoplayer2.ui.f
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return d.c.b((d.c) obj, (d.c) obj2);
            }
        };

        /* renamed from: a */
        public final int f14534a;

        /* renamed from: b */
        public final int f14535b;

        /* renamed from: c */
        public final String f14536c;

        /* renamed from: d */
        public final String f14537d;

        public static /* synthetic */ int a(c cVar, c cVar2) {
            return e(cVar, cVar2);
        }

        public static /* synthetic */ int b(c cVar, c cVar2) {
            return f(cVar, cVar2);
        }

        public static /* synthetic */ int e(c cVar, c cVar2) {
            int compare = Integer.compare(cVar2.f14535b, cVar.f14535b);
            if (compare != 0) {
                return compare;
            }
            int compareTo = cVar.f14536c.compareTo(cVar2.f14536c);
            return compareTo != 0 ? compareTo : cVar.f14537d.compareTo(cVar2.f14537d);
        }

        public static /* synthetic */ int f(c cVar, c cVar2) {
            int compare = Integer.compare(cVar2.f14534a, cVar.f14534a);
            if (compare != 0) {
                return compare;
            }
            int compareTo = cVar2.f14536c.compareTo(cVar.f14536c);
            return compareTo != 0 ? compareTo : cVar2.f14537d.compareTo(cVar.f14537d);
        }

        private c(int i11, int i12, String str, String str2) {
            this.f14534a = i11;
            this.f14535b = i12;
            this.f14536c = str;
            this.f14537d = str2;
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.d$d */
    /* loaded from: classes3.dex */
    public static final class C0257d {

        /* renamed from: a */
        private final List<c> f14538a = new ArrayList();

        /* renamed from: b */
        private final List<c> f14539b = new ArrayList();
    }

    public static b a(CharSequence charSequence, float f11) {
        if (charSequence == null) {
            return new b("", t.l());
        }
        if (!(charSequence instanceof Spanned)) {
            return new b(b(charSequence), t.l());
        }
        Spanned spanned = (Spanned) charSequence;
        HashSet<Integer> hashSet = new HashSet();
        int i11 = 0;
        for (BackgroundColorSpan backgroundColorSpan : (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class)) {
            hashSet.add(Integer.valueOf(backgroundColorSpan.getBackgroundColor()));
        }
        HashMap hashMap = new HashMap();
        for (Integer num : hashSet) {
            int intValue = num.intValue();
            StringBuilder sb2 = new StringBuilder(14);
            sb2.append("bg_");
            sb2.append(intValue);
            hashMap.put(com.google.android.exoplayer2.ui.b.a(sb2.toString()), k0.D("background-color:%s;", com.google.android.exoplayer2.ui.b.b(intValue)));
        }
        SparseArray<C0257d> c11 = c(spanned, f11);
        StringBuilder sb3 = new StringBuilder(spanned.length());
        int i12 = 0;
        while (i11 < c11.size()) {
            int keyAt = c11.keyAt(i11);
            sb3.append(b(spanned.subSequence(i12, keyAt)));
            C0257d c0257d = c11.get(keyAt);
            Collections.sort(c0257d.f14539b, c.f14533f);
            for (c cVar : c0257d.f14539b) {
                sb3.append(cVar.f14537d);
            }
            Collections.sort(c0257d.f14538a, c.f14532e);
            for (c cVar2 : c0257d.f14538a) {
                sb3.append(cVar2.f14536c);
            }
            i11++;
            i12 = keyAt;
        }
        sb3.append(b(spanned.subSequence(i12, spanned.length())));
        return new b(sb3.toString(), hashMap);
    }

    private static String b(CharSequence charSequence) {
        return f14529a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }

    private static SparseArray<C0257d> c(Spanned spanned, float f11) {
        Object[] spans;
        SparseArray<C0257d> sparseArray = new SparseArray<>();
        for (Object obj : spanned.getSpans(0, spanned.length(), Object.class)) {
            String e11 = e(obj, f11);
            String d11 = d(obj);
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            if (e11 != null) {
                ak.a.e(d11);
                c cVar = new c(spanStart, spanEnd, e11, d11);
                f(sparseArray, spanStart).f14538a.add(cVar);
                f(sparseArray, spanEnd).f14539b.add(cVar);
            }
        }
        return sparseArray;
    }

    private static String d(Object obj) {
        if ((obj instanceof StrikethroughSpan) || (obj instanceof ForegroundColorSpan) || (obj instanceof BackgroundColorSpan) || (obj instanceof rj.a) || (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan)) {
            return "</span>";
        }
        if (obj instanceof TypefaceSpan) {
            if (((TypefaceSpan) obj).getFamily() != null) {
                return "</span>";
            }
            return null;
        }
        if (obj instanceof StyleSpan) {
            int style = ((StyleSpan) obj).getStyle();
            if (style == 1) {
                return "</b>";
            }
            if (style == 2) {
                return "</i>";
            }
            if (style == 3) {
                return "</i></b>";
            }
        } else if (obj instanceof rj.b) {
            String b11 = b(((rj.b) obj).f49627a);
            StringBuilder sb2 = new StringBuilder(String.valueOf(b11).length() + 16);
            sb2.append("<rt>");
            sb2.append(b11);
            sb2.append("</rt></ruby>");
            return sb2.toString();
        } else if (obj instanceof UnderlineSpan) {
            return "</u>";
        }
        return null;
    }

    private static String e(Object obj, float f11) {
        float size;
        if (obj instanceof StrikethroughSpan) {
            return "<span style='text-decoration:line-through;'>";
        }
        if (obj instanceof ForegroundColorSpan) {
            return k0.D("<span style='color:%s;'>", com.google.android.exoplayer2.ui.b.b(((ForegroundColorSpan) obj).getForegroundColor()));
        }
        if (obj instanceof BackgroundColorSpan) {
            return k0.D("<span class='bg_%s'>", Integer.valueOf(((BackgroundColorSpan) obj).getBackgroundColor()));
        }
        if (obj instanceof rj.a) {
            return "<span style='text-combine-upright:all;'>";
        }
        if (obj instanceof AbsoluteSizeSpan) {
            AbsoluteSizeSpan absoluteSizeSpan = (AbsoluteSizeSpan) obj;
            if (absoluteSizeSpan.getDip()) {
                size = absoluteSizeSpan.getSize();
            } else {
                size = absoluteSizeSpan.getSize() / f11;
            }
            return k0.D("<span style='font-size:%.2fpx;'>", Float.valueOf(size));
        } else if (obj instanceof RelativeSizeSpan) {
            return k0.D("<span style='font-size:%.2f%%;'>", Float.valueOf(((RelativeSizeSpan) obj).getSizeChange() * 100.0f));
        } else {
            if (obj instanceof TypefaceSpan) {
                String family = ((TypefaceSpan) obj).getFamily();
                if (family != null) {
                    return k0.D("<span style='font-family:\"%s\";'>", family);
                }
                return null;
            } else if (obj instanceof StyleSpan) {
                int style = ((StyleSpan) obj).getStyle();
                if (style != 1) {
                    if (style != 2) {
                        if (style != 3) {
                            return null;
                        }
                        return "<b><i>";
                    }
                    return "<i>";
                }
                return "<b>";
            } else if (obj instanceof rj.b) {
                int i11 = ((rj.b) obj).f49628b;
                if (i11 != -1) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            return null;
                        }
                        return "<ruby style='ruby-position:under;'>";
                    }
                    return "<ruby style='ruby-position:over;'>";
                }
                return "<ruby style='ruby-position:unset;'>";
            } else if (obj instanceof UnderlineSpan) {
                return "<u>";
            } else {
                return null;
            }
        }
    }

    private static C0257d f(SparseArray<C0257d> sparseArray, int i11) {
        C0257d c0257d = sparseArray.get(i11);
        if (c0257d == null) {
            C0257d c0257d2 = new C0257d();
            sparseArray.put(i11, c0257d2);
            return c0257d2;
        }
        return c0257d;
    }
}