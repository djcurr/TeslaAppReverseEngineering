package n2;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.List;
import n2.a;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    private static final a f40282a = new a("", null, null, 6, null);

    public static final boolean c(int i11, int i12, int i13, int i14) {
        if (i11 <= i13 && i14 <= i12) {
            if (i12 != i14) {
                return true;
            }
            if ((i13 == i14) == (i11 == i12)) {
                return true;
            }
        }
        return false;
    }

    public static final a d() {
        return f40282a;
    }

    public static final <T> List<a.b<T>> e(List<? extends a.b<? extends T>> list, int i11, int i12) {
        int i13 = 0;
        if (i11 <= i12) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            int i14 = 0;
            while (i14 < size) {
                int i15 = i14 + 1;
                a.b<? extends T> bVar = list.get(i14);
                a.b<? extends T> bVar2 = bVar;
                if (g(i11, i12, bVar2.f(), bVar2.d())) {
                    arrayList.add(bVar);
                }
                i14 = i15;
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            while (i13 < size2) {
                int i16 = i13 + 1;
                a.b bVar3 = (a.b) arrayList.get(i13);
                arrayList2.add(new a.b(bVar3.e(), Math.max(i11, bVar3.f()) - i11, Math.min(i12, bVar3.d()) - i11, bVar3.g()));
                i13 = i16;
            }
            return arrayList2;
        }
        throw new IllegalArgumentException(("start (" + i11 + ") should be less than or equal to end (" + i12 + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
    }

    private static final List<a.b<s>> f(a aVar, int i11, int i12) {
        int m11;
        int m12;
        List<a.b<s>> i13;
        if (i11 == i12) {
            i13 = wz.w.i();
            return i13;
        } else if (i11 == 0 && i12 >= aVar.g().length()) {
            return aVar.e();
        } else {
            List<a.b<s>> e11 = aVar.e();
            ArrayList arrayList = new ArrayList(e11.size());
            int size = e11.size();
            int i14 = 0;
            int i15 = 0;
            while (i15 < size) {
                int i16 = i15 + 1;
                a.b<s> bVar = e11.get(i15);
                a.b<s> bVar2 = bVar;
                if (g(i11, i12, bVar2.f(), bVar2.d())) {
                    arrayList.add(bVar);
                }
                i15 = i16;
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            while (i14 < size2) {
                int i17 = i14 + 1;
                a.b bVar3 = (a.b) arrayList.get(i14);
                Object e12 = bVar3.e();
                m11 = m00.l.m(bVar3.f(), i11, i12);
                m12 = m00.l.m(bVar3.d(), i11, i12);
                arrayList2.add(new a.b(e12, m11 - i11, m12 - i11));
                i14 = i17;
            }
            return arrayList2;
        }
    }

    public static final boolean g(int i11, int i12, int i13, int i14) {
        return Math.max(i11, i13) < Math.min(i12, i14) || c(i11, i12, i13, i14) || c(i13, i14, i11, i12);
    }

    public static final List<a.b<n>> h(a aVar, n defaultParagraphStyle) {
        kotlin.jvm.internal.s.g(aVar, "<this>");
        kotlin.jvm.internal.s.g(defaultParagraphStyle, "defaultParagraphStyle");
        int length = aVar.g().length();
        List<a.b<n>> d11 = aVar.d();
        ArrayList arrayList = new ArrayList();
        int size = d11.size();
        int i11 = 0;
        int i12 = 0;
        while (i11 < size) {
            int i13 = i11 + 1;
            a.b<n> bVar = d11.get(i11);
            n a11 = bVar.a();
            int b11 = bVar.b();
            int c11 = bVar.c();
            if (b11 != i12) {
                arrayList.add(new a.b(defaultParagraphStyle, i12, b11));
            }
            arrayList.add(new a.b(defaultParagraphStyle.g(a11), b11, c11));
            i12 = c11;
            i11 = i13;
        }
        if (i12 != length) {
            arrayList.add(new a.b(defaultParagraphStyle, i12, length));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new a.b(defaultParagraphStyle, 0, 0));
        }
        return arrayList;
    }

    public static final a i(a aVar, int i11, int i12) {
        String str;
        if (i11 != i12) {
            str = aVar.g().substring(i11, i12);
            kotlin.jvm.internal.s.f(str, "this as java.lang.String…ing(startIndex, endIndex)");
        } else {
            str = "";
        }
        return new a(str, f(aVar, i11, i12), null, 4, null);
    }
}