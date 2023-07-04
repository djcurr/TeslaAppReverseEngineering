package o1;

import h00.l;
import java.util.List;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class j {
    private static final <T> void a(Appendable appendable, T t11, l<? super T, ? extends CharSequence> lVar) {
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

    private static final <T, A extends Appendable> A b(List<? extends T> list, A a11, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i11, CharSequence charSequence4, l<? super T, ? extends CharSequence> lVar) {
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

    public static final <T> String c(List<? extends T> list, CharSequence separator, CharSequence prefix, CharSequence postfix, int i11, CharSequence truncated, l<? super T, ? extends CharSequence> lVar) {
        s.g(list, "<this>");
        s.g(separator, "separator");
        s.g(prefix, "prefix");
        s.g(postfix, "postfix");
        s.g(truncated, "truncated");
        String sb2 = ((StringBuilder) b(list, new StringBuilder(), separator, prefix, postfix, i11, truncated, lVar)).toString();
        s.f(sb2, "fastJoinTo(StringBuilder…form)\n        .toString()");
        return sb2;
    }

    public static /* synthetic */ String d(List list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i11, CharSequence charSequence4, l lVar, int i12, Object obj) {
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
}