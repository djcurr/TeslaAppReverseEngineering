package uj;

import ak.k0;
import ak.o;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.stripe.android.core.networking.FileUploadRequest;
import java.util.ArrayDeque;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class e {
    public static void a(Spannable spannable, int i11, int i12, f fVar, c cVar, Map<String, f> map) {
        c e11;
        if (fVar.j() != -1) {
            spannable.setSpan(new StyleSpan(fVar.j()), i11, i12, 33);
        }
        if (fVar.p()) {
            spannable.setSpan(new StrikethroughSpan(), i11, i12, 33);
        }
        if (fVar.q()) {
            spannable.setSpan(new UnderlineSpan(), i11, i12, 33);
        }
        if (fVar.n()) {
            rj.c.a(spannable, new ForegroundColorSpan(fVar.c()), i11, i12, 33);
        }
        if (fVar.m()) {
            rj.c.a(spannable, new BackgroundColorSpan(fVar.b()), i11, i12, 33);
        }
        if (fVar.d() != null) {
            rj.c.a(spannable, new TypefaceSpan(fVar.d()), i11, i12, 33);
        }
        int i13 = fVar.i();
        if (i13 == 2) {
            c d11 = d(cVar, map);
            if (d11 != null && (e11 = e(d11, map)) != null) {
                if (e11.g() == 1 && e11.f(0).f53491b != null) {
                    String str = (String) k0.j(e11.f(0).f53491b);
                    f fVar2 = d11.f53495f;
                    spannable.setSpan(new rj.b(str, fVar2 != null ? fVar2.h() : -1), i11, i12, 33);
                } else {
                    o.f("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                }
            }
        } else if (i13 == 3 || i13 == 4) {
            spannable.setSpan(new a(), i11, i12, 33);
        }
        if (fVar.l()) {
            rj.c.a(spannable, new rj.a(), i11, i12, 33);
        }
        int f11 = fVar.f();
        if (f11 == 1) {
            rj.c.a(spannable, new AbsoluteSizeSpan((int) fVar.e(), true), i11, i12, 33);
        } else if (f11 == 2) {
            rj.c.a(spannable, new RelativeSizeSpan(fVar.e()), i11, i12, 33);
        } else if (f11 != 3) {
        } else {
            rj.c.a(spannable, new RelativeSizeSpan(fVar.e() / 100.0f), i11, i12, 33);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b(String str) {
        return str.replaceAll(FileUploadRequest.LINE_BREAK, "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " ");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length < 0 || spannableStringBuilder.charAt(length) == '\n') {
            return;
        }
        spannableStringBuilder.append('\n');
    }

    private static c d(c cVar, Map<String, f> map) {
        while (cVar != null) {
            f f11 = f(cVar.f53495f, cVar.l(), map);
            if (f11 != null && f11.i() == 1) {
                return cVar;
            }
            cVar = cVar.f53499j;
        }
        return null;
    }

    private static c e(c cVar, Map<String, f> map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(cVar);
        while (!arrayDeque.isEmpty()) {
            c cVar2 = (c) arrayDeque.pop();
            f f11 = f(cVar2.f53495f, cVar2.l(), map);
            if (f11 != null && f11.i() == 3) {
                return cVar2;
            }
            for (int g11 = cVar2.g() - 1; g11 >= 0; g11--) {
                arrayDeque.push(cVar2.f(g11));
            }
        }
        return null;
    }

    public static f f(f fVar, String[] strArr, Map<String, f> map) {
        int i11 = 0;
        if (fVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                f fVar2 = new f();
                int length = strArr.length;
                while (i11 < length) {
                    fVar2.a(map.get(strArr[i11]));
                    i11++;
                }
                return fVar2;
            }
        } else if (strArr != null && strArr.length == 1) {
            return fVar.a(map.get(strArr[0]));
        } else {
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i11 < length2) {
                    fVar.a(map.get(strArr[i11]));
                    i11++;
                }
            }
        }
        return fVar;
    }
}