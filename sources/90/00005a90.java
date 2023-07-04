package com.stripe.android.ui.core.elements;

import android.content.Context;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.text.style.StyleSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import androidx.compose.ui.platform.z;
import c1.e1;
import c1.i;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import k2.c;
import l2.o;
import m00.l;
import n2.a;
import n2.a0;
import n2.q;
import n2.s;
import o1.f;
import r2.j;
import t1.c0;
import vz.p;
import vz.v;
import w0.m;
import w1.b;
import w2.e;
import wz.r0;
import wz.x;
import x2.r;
import y0.h0;

/* loaded from: classes6.dex */
public final class HtmlKt {
    private static final String LINK_TAG = "URL";

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:166:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0110  */
    /* renamed from: ClickableText-DauHOvk  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m443ClickableTextDauHOvk(n2.a r46, o1.f r47, java.util.Map<java.lang.String, w0.l> r48, long r49, n2.a0 r51, boolean r52, int r53, int r54, h00.l<? super n2.w, vz.b0> r55, h00.l<? super java.lang.Integer, vz.b0> r56, c1.i r57, int r58, int r59) {
        /*
            Method dump skipped, instructions count: 718
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.ui.core.elements.HtmlKt.m443ClickableTextDauHOvk(n2.a, o1.f, java.util.Map, long, n2.a0, boolean, int, int, h00.l, h00.l, c1.i, int, int):void");
    }

    /* renamed from: Html-FU0evQE  reason: not valid java name */
    public static final void m444HtmlFU0evQE(String html, Map<String, EmbeddableImage> imageGetter, long j11, a0 style, f fVar, s sVar, i iVar, int i11, int i12) {
        s sVar2;
        int i13;
        int t11;
        int e11;
        int d11;
        kotlin.jvm.internal.s.g(html, "html");
        kotlin.jvm.internal.s.g(imageGetter, "imageGetter");
        kotlin.jvm.internal.s.g(style, "style");
        i h11 = iVar.h(176655522);
        f.a aVar = (i12 & 16) != 0 ? f.f42062f1 : fVar;
        if ((i12 & 32) != 0) {
            i13 = i11 & (-458753);
            sVar2 = new s(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, e.f55408b.d(), null, 12287, null);
        } else {
            sVar2 = sVar;
            i13 = i11;
        }
        h11.x(176655806);
        Set<Map.Entry<String, EmbeddableImage>> entrySet = imageGetter.entrySet();
        t11 = x.t(entrySet, 10);
        e11 = r0.e(t11);
        d11 = l.d(e11, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(d11);
        Iterator<T> it2 = entrySet.iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            EmbeddableImage embeddableImage = (EmbeddableImage) entry.getValue();
            b c11 = c.c(embeddableImage.getId(), h11, 0);
            float g11 = s1.l.g(c11.h());
            float i14 = s1.l.i(c11.h());
            h0 h0Var = h0.f58131a;
            long i15 = h0Var.c(h11, 8).c().i();
            x2.s.b(i15);
            p a11 = v.a((String) entry.getKey(), new w0.l(new n2.p(x2.s.i(r.f(i15), r.h(i15) * (i14 / g11)), h0Var.c(h11, 8).c().i(), q.f40322a.a(), null), j1.c.b(h11, -819893750, true, new HtmlKt$Html$inlineContentMap$1$1(embeddableImage, c11))));
            linkedHashMap.put(a11.c(), a11.d());
        }
        h11.N();
        a annotatedStringResource = annotatedStringResource(html, imageGetter, sVar2, h11, (i13 & 14) | 64 | ((i13 >> 9) & 896));
        int i16 = i13 << 3;
        s sVar3 = sVar2;
        f fVar2 = aVar;
        m443ClickableTextDauHOvk(annotatedStringResource, o.a(aVar, true, HtmlKt$Html$1.INSTANCE), linkedHashMap, j11, style, false, 0, 0, null, new HtmlKt$Html$2(annotatedStringResource, (Context) h11.A(z.g())), h11, (i16 & 7168) | 512 | (i16 & 57344), 480);
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new HtmlKt$Html$3(html, imageGetter, j11, style, fVar2, sVar3, i11, i12));
    }

    private static final a annotatedStringResource(String str, Map<String, EmbeddableImage> map, s sVar, i iVar, int i11) {
        iVar.x(-2096753303);
        iVar.x(-3686930);
        boolean O = iVar.O(str);
        Object y11 = iVar.y();
        if (O || y11 == i.f8486a.a()) {
            y11 = t3.b.a(str, 0);
            iVar.p(y11);
        }
        iVar.N();
        kotlin.jvm.internal.s.f(y11, "remember(text) {\n       …M_HTML_MODE_LEGACY)\n    }");
        Spanned spanned = (Spanned) y11;
        iVar.x(-3686930);
        boolean O2 = iVar.O(spanned);
        Object y12 = iVar.y();
        if (O2 || y12 == i.f8486a.a()) {
            a.C0787a c0787a = new a.C0787a(0, 1, null);
            Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
            kotlin.jvm.internal.s.f(spans, "spanned.getSpans(0, span….length, Any::class.java)");
            int i12 = 0;
            for (Object obj : spans) {
                int spanStart = spanned.getSpanStart(obj);
                int spanEnd = spanned.getSpanEnd(obj);
                if (i12 < spanned.toString().length() && spanStart < spanned.toString().length() && spanStart - i12 >= 0) {
                    String substring = spanned.toString().substring(i12, spanStart);
                    kotlin.jvm.internal.s.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    c0787a.d(substring);
                    if (obj instanceof StyleSpan) {
                        int style = ((StyleSpan) obj).getStyle();
                        if (style == 1) {
                            c0787a.c(new s(0L, 0L, r2.l.f49091b.a(), null, null, null, null, 0L, null, null, null, 0L, null, null, 16379, null), spanStart, spanEnd);
                        } else if (style == 2) {
                            c0787a.c(new s(0L, 0L, null, j.c(j.f49081b.a()), null, null, null, 0L, null, null, null, 0L, null, null, 16375, null), spanStart, spanEnd);
                        } else if (style == 3) {
                            c0787a.c(new s(0L, 0L, r2.l.f49091b.a(), j.c(j.f49081b.a()), null, null, null, 0L, null, null, null, 0L, null, null, 16371, null), spanStart, spanEnd);
                        }
                    } else if (obj instanceof UnderlineSpan) {
                        c0787a.c(new s(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, e.f55408b.d(), null, 12287, null), spanStart, spanEnd);
                    } else if (obj instanceof ForegroundColorSpan) {
                        c0787a.c(new s(c0.b(((ForegroundColorSpan) obj).getForegroundColor()), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 16382, null), spanStart, spanEnd);
                    } else if (obj instanceof ImageSpan) {
                        ImageSpan imageSpan = (ImageSpan) obj;
                        if (imageSpan.getSource() != null) {
                            String source = imageSpan.getSource();
                            kotlin.jvm.internal.s.e(source);
                            map.containsKey(source);
                            String source2 = imageSpan.getSource();
                            kotlin.jvm.internal.s.e(source2);
                            kotlin.jvm.internal.s.f(source2, "span.source!!");
                            m.b(c0787a, source2, null, 2, null);
                        }
                        i12 = spanEnd;
                    } else {
                        if (obj instanceof URLSpan) {
                            c0787a.c(sVar, spanStart, spanEnd);
                            String url = ((URLSpan) obj).getURL();
                            kotlin.jvm.internal.s.f(url, "span.url");
                            c0787a.a(LINK_TAG, url, spanStart, spanEnd);
                        }
                        i12 = spanStart;
                    }
                    i12 = spanStart;
                }
            }
            if (i12 != spanned.toString().length()) {
                String substring2 = spanned.toString().substring(i12);
                kotlin.jvm.internal.s.f(substring2, "this as java.lang.String).substring(startIndex)");
                c0787a.d(substring2);
            }
            y12 = c0787a.h();
            iVar.p(y12);
        }
        iVar.N();
        a aVar = (a) y12;
        iVar.N();
        return aVar;
    }
}