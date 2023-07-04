package m1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class b {
    private static final <T> void a(Appendable appendable, T t11, h00.l<? super T, ? extends CharSequence> lVar) {
        if (lVar != null) {
            appendable.append(lVar.invoke(t11));
            return;
        }
        if (t11 == null ? true : t11 instanceof CharSequence) {
            appendable.append((CharSequence) t11);
        } else if (t11 instanceof Character) {
            appendable.append(((Character) t11).charValue());
        } else {
            appendable.append(String.valueOf(t11));
        }
    }

    private static final <T, A extends Appendable> A b(List<? extends T> list, A a11, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i11, CharSequence charSequence4, h00.l<? super T, ? extends CharSequence> lVar) {
        a11.append(charSequence2);
        int size = list.size();
        int i12 = 0;
        int i13 = 0;
        while (i12 < size) {
            int i14 = i12 + 1;
            T t11 = list.get(i12);
            i13++;
            if (i13 > 1) {
                a11.append(charSequence);
            }
            if (i11 >= 0 && i13 > i11) {
                break;
            }
            a(a11, t11, lVar);
            i12 = i14;
        }
        if (i11 >= 0 && i13 > i11) {
            a11.append(charSequence4);
        }
        a11.append(charSequence3);
        return a11;
    }

    public static final <T> String c(List<? extends T> list, CharSequence separator, CharSequence prefix, CharSequence postfix, int i11, CharSequence truncated, h00.l<? super T, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.s.g(list, "<this>");
        kotlin.jvm.internal.s.g(separator, "separator");
        kotlin.jvm.internal.s.g(prefix, "prefix");
        kotlin.jvm.internal.s.g(postfix, "postfix");
        kotlin.jvm.internal.s.g(truncated, "truncated");
        String sb2 = ((StringBuilder) b(list, new StringBuilder(), separator, prefix, postfix, i11, truncated, lVar)).toString();
        kotlin.jvm.internal.s.f(sb2, "fastJoinTo(StringBuilder…form)\n        .toString()");
        return sb2;
    }

    public static /* synthetic */ String d(List list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i11, CharSequence charSequence4, h00.l lVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            charSequence = ", ";
        }
        String str = (i12 & 2) != 0 ? "" : charSequence2;
        String str2 = (i12 & 4) == 0 ? charSequence3 : "";
        if ((i12 & 8) != 0) {
            i11 = -1;
        }
        int i13 = i11;
        if ((i12 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence5 = charSequence4;
        if ((i12 & 32) != 0) {
            lVar = null;
        }
        return c(list, charSequence, str, str2, i13, charSequence5, lVar);
    }

    public static final <T> Set<T> e(List<? extends T> list) {
        kotlin.jvm.internal.s.g(list, "<this>");
        HashSet hashSet = new HashSet(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            hashSet.add(list.get(i11));
        }
        return hashSet;
    }
}