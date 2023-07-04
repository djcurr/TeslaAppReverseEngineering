package bc;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class p {
    public static String a(Iterable<? extends CharSequence> iterable, String str) {
        int length = str.length();
        Iterator<? extends CharSequence> it2 = iterable.iterator();
        StringBuilder sb2 = new StringBuilder(it2.hasNext() ? 0 + it2.next().length() + length : 0);
        Iterator<? extends CharSequence> it3 = iterable.iterator();
        if (it3.hasNext()) {
            sb2.append(it3.next());
            while (it3.hasNext()) {
                sb2.append(str);
                sb2.append(it3.next());
            }
        }
        return sb2.toString();
    }

    public static <T extends CharSequence> String b(T[] tArr, String str) {
        int length = str.length();
        int i11 = 0;
        for (T t11 : tArr) {
            i11 += t11.length() + length;
        }
        StringBuilder sb2 = new StringBuilder(i11);
        boolean z11 = true;
        for (T t12 : tArr) {
            if (z11) {
                z11 = false;
            } else {
                sb2.append(str);
            }
            sb2.append((CharSequence) t12);
        }
        return sb2.toString();
    }
}