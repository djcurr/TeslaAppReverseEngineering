package kotlin.text;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import wz.z0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class y extends x {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.l<CharSequence, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f35224a = new a();

        a() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final String invoke(CharSequence it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            return it2.toString();
        }
    }

    public static String e1(String str, int i11) {
        int i12;
        kotlin.jvm.internal.s.g(str, "<this>");
        if (i11 >= 0) {
            i12 = m00.l.i(i11, str.length());
            String substring = str.substring(i12);
            kotlin.jvm.internal.s.f(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i11 + " is less than zero.").toString());
    }

    public static char f1(CharSequence charSequence) {
        kotlin.jvm.internal.s.g(charSequence, "<this>");
        if (!(charSequence.length() == 0)) {
            return charSequence.charAt(0);
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static char g1(CharSequence charSequence) {
        int T;
        kotlin.jvm.internal.s.g(charSequence, "<this>");
        if (!(charSequence.length() == 0)) {
            T = w.T(charSequence);
            return charSequence.charAt(T);
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static char h1(CharSequence charSequence) {
        kotlin.jvm.internal.s.g(charSequence, "<this>");
        int length = charSequence.length();
        if (length != 0) {
            if (length == 1) {
                return charSequence.charAt(0);
            }
            throw new IllegalArgumentException("Char sequence has more than one element.");
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static String i1(String str, int i11) {
        int i12;
        kotlin.jvm.internal.s.g(str, "<this>");
        if (i11 >= 0) {
            i12 = m00.l.i(i11, str.length());
            String substring = str.substring(0, i12);
            kotlin.jvm.internal.s.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i11 + " is less than zero.").toString());
    }

    public static String j1(String str, int i11) {
        int i12;
        kotlin.jvm.internal.s.g(str, "<this>");
        if (i11 >= 0) {
            int length = str.length();
            i12 = m00.l.i(i11, length);
            String substring = str.substring(length - i12);
            kotlin.jvm.internal.s.f(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i11 + " is less than zero.").toString());
    }

    public static List<String> k1(CharSequence charSequence, int i11, int i12, boolean z11) {
        kotlin.jvm.internal.s.g(charSequence, "<this>");
        return l1(charSequence, i11, i12, z11, a.f35224a);
    }

    public static final <R> List<R> l1(CharSequence charSequence, int i11, int i12, boolean z11, h00.l<? super CharSequence, ? extends R> transform) {
        kotlin.jvm.internal.s.g(charSequence, "<this>");
        kotlin.jvm.internal.s.g(transform, "transform");
        z0.a(i11, i12);
        int length = charSequence.length();
        ArrayList arrayList = new ArrayList((length / i12) + (length % i12 == 0 ? 0 : 1));
        int i13 = 0;
        while (true) {
            if (!(i13 >= 0 && i13 < length)) {
                break;
            }
            int i14 = i13 + i11;
            if (i14 < 0 || i14 > length) {
                if (!z11) {
                    break;
                }
                i14 = length;
            }
            arrayList.add(transform.invoke(charSequence.subSequence(i13, i14)));
            i13 += i12;
        }
        return arrayList;
    }
}