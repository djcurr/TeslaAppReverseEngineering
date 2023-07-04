package kotlin.text;

import com.stripe.android.core.networking.FileUploadRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public class w extends v {

    /* loaded from: classes5.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.p<CharSequence, Integer, vz.p<? extends Integer, ? extends Integer>> {

        /* renamed from: a */
        final /* synthetic */ char[] f35219a;

        /* renamed from: b */
        final /* synthetic */ boolean f35220b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(char[] cArr, boolean z11) {
            super(2);
            this.f35219a = cArr;
            this.f35220b = z11;
        }

        public final vz.p<Integer, Integer> a(CharSequence $receiver, int i11) {
            kotlin.jvm.internal.s.g($receiver, "$this$$receiver");
            int a02 = w.a0($receiver, this.f35219a, i11, this.f35220b);
            if (a02 < 0) {
                return null;
            }
            return vz.v.a(Integer.valueOf(a02), 1);
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ vz.p<? extends Integer, ? extends Integer> invoke(CharSequence charSequence, Integer num) {
            return a(charSequence, num.intValue());
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.p<CharSequence, Integer, vz.p<? extends Integer, ? extends Integer>> {

        /* renamed from: a */
        final /* synthetic */ List<String> f35221a;

        /* renamed from: b */
        final /* synthetic */ boolean f35222b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(List<String> list, boolean z11) {
            super(2);
            this.f35221a = list;
            this.f35222b = z11;
        }

        public final vz.p<Integer, Integer> a(CharSequence $receiver, int i11) {
            kotlin.jvm.internal.s.g($receiver, "$this$$receiver");
            vz.p R = w.R($receiver, this.f35221a, i11, this.f35222b, false);
            if (R != null) {
                return vz.v.a(R.c(), Integer.valueOf(((String) R.d()).length()));
            }
            return null;
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ vz.p<? extends Integer, ? extends Integer> invoke(CharSequence charSequence, Integer num) {
            return a(charSequence, num.intValue());
        }
    }

    /* loaded from: classes5.dex */
    public static final class c extends kotlin.jvm.internal.u implements h00.l<m00.i, String> {

        /* renamed from: a */
        final /* synthetic */ CharSequence f35223a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(CharSequence charSequence) {
            super(1);
            this.f35223a = charSequence;
        }

        @Override // h00.l
        /* renamed from: a */
        public final String invoke(m00.i it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            return w.L0(this.f35223a, it2);
        }
    }

    public static final List<String> A0(CharSequence charSequence, char[] delimiters, boolean z11, int i11) {
        Iterable<m00.i> n11;
        int t11;
        kotlin.jvm.internal.s.g(charSequence, "<this>");
        kotlin.jvm.internal.s.g(delimiters, "delimiters");
        if (delimiters.length == 1) {
            return C0(charSequence, String.valueOf(delimiters[0]), z11, i11);
        }
        n11 = u20.p.n(q0(charSequence, delimiters, 0, z11, i11, 2, null));
        t11 = wz.x.t(n11, 10);
        ArrayList arrayList = new ArrayList(t11);
        for (m00.i iVar : n11) {
            arrayList.add(L0(charSequence, iVar));
        }
        return arrayList;
    }

    public static final List<String> B0(CharSequence charSequence, String[] delimiters, boolean z11, int i11) {
        Iterable<m00.i> n11;
        int t11;
        kotlin.jvm.internal.s.g(charSequence, "<this>");
        kotlin.jvm.internal.s.g(delimiters, "delimiters");
        if (delimiters.length == 1) {
            String str = delimiters[0];
            if (!(str.length() == 0)) {
                return C0(charSequence, str, z11, i11);
            }
        }
        n11 = u20.p.n(r0(charSequence, delimiters, 0, z11, i11, 2, null));
        t11 = wz.x.t(n11, 10);
        ArrayList arrayList = new ArrayList(t11);
        for (m00.i iVar : n11) {
            arrayList.add(L0(charSequence, iVar));
        }
        return arrayList;
    }

    private static final List<String> C0(CharSequence charSequence, String str, boolean z11, int i11) {
        List<String> d11;
        z0(i11);
        int i12 = 0;
        int V = V(charSequence, str, 0, z11);
        if (V != -1 && i11 != 1) {
            boolean z12 = i11 > 0;
            ArrayList arrayList = new ArrayList(z12 ? m00.l.i(i11, 10) : 10);
            do {
                arrayList.add(charSequence.subSequence(i12, V).toString());
                i12 = str.length() + V;
                if (z12 && arrayList.size() == i11 - 1) {
                    break;
                }
                V = V(charSequence, str, i12, z11);
            } while (V != -1);
            arrayList.add(charSequence.subSequence(i12, charSequence.length()).toString());
            return arrayList;
        }
        d11 = wz.v.d(charSequence.toString());
        return d11;
    }

    public static /* synthetic */ List D0(CharSequence charSequence, char[] cArr, boolean z11, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        return A0(charSequence, cArr, z11, i11);
    }

    public static /* synthetic */ List E0(CharSequence charSequence, String[] strArr, boolean z11, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        return B0(charSequence, strArr, z11, i11);
    }

    public static final u20.h<String> F0(CharSequence charSequence, String[] delimiters, boolean z11, int i11) {
        u20.h<String> B;
        kotlin.jvm.internal.s.g(charSequence, "<this>");
        kotlin.jvm.internal.s.g(delimiters, "delimiters");
        B = u20.p.B(r0(charSequence, delimiters, 0, z11, i11, 2, null), new c(charSequence));
        return B;
    }

    public static /* synthetic */ u20.h G0(CharSequence charSequence, String[] strArr, boolean z11, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        return F0(charSequence, strArr, z11, i11);
    }

    public static final boolean H0(CharSequence charSequence, char c11, boolean z11) {
        kotlin.jvm.internal.s.g(charSequence, "<this>");
        return charSequence.length() > 0 && kotlin.text.c.e(charSequence.charAt(0), c11, z11);
    }

    public static final boolean I0(CharSequence charSequence, CharSequence prefix, boolean z11) {
        boolean H;
        kotlin.jvm.internal.s.g(charSequence, "<this>");
        kotlin.jvm.internal.s.g(prefix, "prefix");
        if (!z11 && (charSequence instanceof String) && (prefix instanceof String)) {
            H = v.H((String) charSequence, (String) prefix, false, 2, null);
            return H;
        }
        return s0(charSequence, 0, prefix, 0, prefix.length(), z11);
    }

    public static final boolean J(CharSequence charSequence, char c11, boolean z11) {
        int Y;
        kotlin.jvm.internal.s.g(charSequence, "<this>");
        Y = Y(charSequence, c11, 0, z11, 2, null);
        return Y >= 0;
    }

    public static /* synthetic */ boolean J0(CharSequence charSequence, char c11, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return H0(charSequence, c11, z11);
    }

    public static boolean K(CharSequence charSequence, CharSequence other, boolean z11) {
        int Z;
        kotlin.jvm.internal.s.g(charSequence, "<this>");
        kotlin.jvm.internal.s.g(other, "other");
        if (other instanceof String) {
            Z = Z(charSequence, (String) other, 0, z11, 2, null);
            if (Z >= 0) {
                return true;
            }
        } else if (X(charSequence, other, 0, charSequence.length(), z11, false, 16, null) >= 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean K0(CharSequence charSequence, CharSequence charSequence2, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return I0(charSequence, charSequence2, z11);
    }

    public static /* synthetic */ boolean L(CharSequence charSequence, char c11, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return J(charSequence, c11, z11);
    }

    public static final String L0(CharSequence charSequence, m00.i range) {
        kotlin.jvm.internal.s.g(charSequence, "<this>");
        kotlin.jvm.internal.s.g(range, "range");
        return charSequence.subSequence(range.m().intValue(), range.k().intValue() + 1).toString();
    }

    public static /* synthetic */ boolean M(CharSequence charSequence, CharSequence charSequence2, boolean z11, int i11, Object obj) {
        boolean K;
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        K = K(charSequence, charSequence2, z11);
        return K;
    }

    public static final String M0(String str, char c11, String missingDelimiterValue) {
        int Y;
        kotlin.jvm.internal.s.g(str, "<this>");
        kotlin.jvm.internal.s.g(missingDelimiterValue, "missingDelimiterValue");
        Y = Y(str, c11, 0, false, 6, null);
        if (Y == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(Y + 1, str.length());
        kotlin.jvm.internal.s.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final boolean N(CharSequence charSequence, char c11, boolean z11) {
        int T;
        kotlin.jvm.internal.s.g(charSequence, "<this>");
        if (charSequence.length() > 0) {
            T = T(charSequence);
            if (kotlin.text.c.e(charSequence.charAt(T), c11, z11)) {
                return true;
            }
        }
        return false;
    }

    public static String N0(String str, String delimiter, String missingDelimiterValue) {
        int Z;
        kotlin.jvm.internal.s.g(str, "<this>");
        kotlin.jvm.internal.s.g(delimiter, "delimiter");
        kotlin.jvm.internal.s.g(missingDelimiterValue, "missingDelimiterValue");
        Z = Z(str, delimiter, 0, false, 6, null);
        if (Z == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(Z + delimiter.length(), str.length());
        kotlin.jvm.internal.s.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final boolean O(CharSequence charSequence, CharSequence suffix, boolean z11) {
        boolean t11;
        kotlin.jvm.internal.s.g(charSequence, "<this>");
        kotlin.jvm.internal.s.g(suffix, "suffix");
        if (!z11 && (charSequence instanceof String) && (suffix instanceof String)) {
            t11 = v.t((String) charSequence, (String) suffix, false, 2, null);
            return t11;
        }
        return s0(charSequence, charSequence.length() - suffix.length(), suffix, 0, suffix.length(), z11);
    }

    public static /* synthetic */ String O0(String str, char c11, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = str;
        }
        return M0(str, c11, str2);
    }

    public static /* synthetic */ boolean P(CharSequence charSequence, char c11, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return N(charSequence, c11, z11);
    }

    public static /* synthetic */ String P0(String str, String str2, String str3, int i11, Object obj) {
        String N0;
        if ((i11 & 2) != 0) {
            str3 = str;
        }
        N0 = N0(str, str2, str3);
        return N0;
    }

    public static /* synthetic */ boolean Q(CharSequence charSequence, CharSequence charSequence2, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return O(charSequence, charSequence2, z11);
    }

    public static String Q0(String str, char c11, String missingDelimiterValue) {
        int d02;
        kotlin.jvm.internal.s.g(str, "<this>");
        kotlin.jvm.internal.s.g(missingDelimiterValue, "missingDelimiterValue");
        d02 = d0(str, c11, 0, false, 6, null);
        if (d02 == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(d02 + 1, str.length());
        kotlin.jvm.internal.s.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final vz.p<Integer, String> R(CharSequence charSequence, Collection<String> collection, int i11, boolean z11, boolean z12) {
        int T;
        int i12;
        m00.g p11;
        Object obj;
        Object obj2;
        int d11;
        if (!z11 && collection.size() == 1) {
            String str = (String) wz.u.B0(collection);
            int Z = !z12 ? Z(charSequence, str, i11, false, 4, null) : e0(charSequence, str, i11, false, 4, null);
            if (Z < 0) {
                return null;
            }
            return vz.v.a(Integer.valueOf(Z), str);
        }
        if (z12) {
            T = T(charSequence);
            i12 = m00.l.i(i11, T);
            p11 = m00.l.p(i12, 0);
        } else {
            d11 = m00.l.d(i11, 0);
            p11 = new m00.i(d11, charSequence.length());
        }
        if (charSequence instanceof String) {
            int c11 = p11.c();
            int e11 = p11.e();
            int f11 = p11.f();
            if ((f11 > 0 && c11 <= e11) || (f11 < 0 && e11 <= c11)) {
                while (true) {
                    Iterator<T> it2 = collection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it2.next();
                        String str2 = (String) obj2;
                        if (v.x(str2, 0, (String) charSequence, c11, str2.length(), z11)) {
                            break;
                        }
                    }
                    String str3 = (String) obj2;
                    if (str3 == null) {
                        if (c11 == e11) {
                            break;
                        }
                        c11 += f11;
                    } else {
                        return vz.v.a(Integer.valueOf(c11), str3);
                    }
                }
            }
        } else {
            int c12 = p11.c();
            int e12 = p11.e();
            int f12 = p11.f();
            if ((f12 > 0 && c12 <= e12) || (f12 < 0 && e12 <= c12)) {
                while (true) {
                    Iterator<T> it3 = collection.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it3.next();
                        String str4 = (String) obj;
                        if (s0(str4, 0, charSequence, c12, str4.length(), z11)) {
                            break;
                        }
                    }
                    String str5 = (String) obj;
                    if (str5 == null) {
                        if (c12 == e12) {
                            break;
                        }
                        c12 += f12;
                    } else {
                        return vz.v.a(Integer.valueOf(c12), str5);
                    }
                }
            }
        }
        return null;
    }

    public static final String R0(String str, String delimiter, String missingDelimiterValue) {
        int e02;
        kotlin.jvm.internal.s.g(str, "<this>");
        kotlin.jvm.internal.s.g(delimiter, "delimiter");
        kotlin.jvm.internal.s.g(missingDelimiterValue, "missingDelimiterValue");
        e02 = e0(str, delimiter, 0, false, 6, null);
        if (e02 == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(e02 + delimiter.length(), str.length());
        kotlin.jvm.internal.s.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static m00.i S(CharSequence charSequence) {
        kotlin.jvm.internal.s.g(charSequence, "<this>");
        return new m00.i(0, charSequence.length() - 1);
    }

    public static /* synthetic */ String S0(String str, char c11, String str2, int i11, Object obj) {
        String Q0;
        if ((i11 & 2) != 0) {
            str2 = str;
        }
        Q0 = Q0(str, c11, str2);
        return Q0;
    }

    public static int T(CharSequence charSequence) {
        kotlin.jvm.internal.s.g(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static /* synthetic */ String T0(String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str3 = str;
        }
        return R0(str, str2, str3);
    }

    public static final int U(CharSequence charSequence, char c11, int i11, boolean z11) {
        kotlin.jvm.internal.s.g(charSequence, "<this>");
        if (!z11 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c11, i11);
        }
        return a0(charSequence, new char[]{c11}, i11, z11);
    }

    public static final String U0(String str, char c11, String missingDelimiterValue) {
        int Y;
        kotlin.jvm.internal.s.g(str, "<this>");
        kotlin.jvm.internal.s.g(missingDelimiterValue, "missingDelimiterValue");
        Y = Y(str, c11, 0, false, 6, null);
        if (Y == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(0, Y);
        kotlin.jvm.internal.s.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final int V(CharSequence charSequence, String string, int i11, boolean z11) {
        kotlin.jvm.internal.s.g(charSequence, "<this>");
        kotlin.jvm.internal.s.g(string, "string");
        if (!z11 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(string, i11);
        }
        return X(charSequence, string, i11, charSequence.length(), z11, false, 16, null);
    }

    public static final String V0(String str, String delimiter, String missingDelimiterValue) {
        int Z;
        kotlin.jvm.internal.s.g(str, "<this>");
        kotlin.jvm.internal.s.g(delimiter, "delimiter");
        kotlin.jvm.internal.s.g(missingDelimiterValue, "missingDelimiterValue");
        Z = Z(str, delimiter, 0, false, 6, null);
        if (Z == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(0, Z);
        kotlin.jvm.internal.s.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    private static final int W(CharSequence charSequence, CharSequence charSequence2, int i11, int i12, boolean z11, boolean z12) {
        int T;
        int i13;
        int d11;
        m00.g p11;
        int d12;
        int i14;
        if (!z12) {
            d12 = m00.l.d(i11, 0);
            i14 = m00.l.i(i12, charSequence.length());
            p11 = new m00.i(d12, i14);
        } else {
            T = T(charSequence);
            i13 = m00.l.i(i11, T);
            d11 = m00.l.d(i12, 0);
            p11 = m00.l.p(i13, d11);
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int c11 = p11.c();
            int e11 = p11.e();
            int f11 = p11.f();
            if ((f11 <= 0 || c11 > e11) && (f11 >= 0 || e11 > c11)) {
                return -1;
            }
            while (!v.x((String) charSequence2, 0, (String) charSequence, c11, charSequence2.length(), z11)) {
                if (c11 == e11) {
                    return -1;
                }
                c11 += f11;
            }
            return c11;
        }
        int c12 = p11.c();
        int e12 = p11.e();
        int f12 = p11.f();
        if ((f12 <= 0 || c12 > e12) && (f12 >= 0 || e12 > c12)) {
            return -1;
        }
        while (!s0(charSequence2, 0, charSequence, c12, charSequence2.length(), z11)) {
            if (c12 == e12) {
                return -1;
            }
            c12 += f12;
        }
        return c12;
    }

    public static /* synthetic */ String W0(String str, char c11, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = str;
        }
        return U0(str, c11, str2);
    }

    static /* synthetic */ int X(CharSequence charSequence, CharSequence charSequence2, int i11, int i12, boolean z11, boolean z12, int i13, Object obj) {
        if ((i13 & 16) != 0) {
            z12 = false;
        }
        return W(charSequence, charSequence2, i11, i12, z11, z12);
    }

    public static /* synthetic */ String X0(String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str3 = str;
        }
        return V0(str, str2, str3);
    }

    public static /* synthetic */ int Y(CharSequence charSequence, char c11, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            z11 = false;
        }
        return U(charSequence, c11, i11, z11);
    }

    public static final String Y0(String str, char c11, String missingDelimiterValue) {
        int d02;
        kotlin.jvm.internal.s.g(str, "<this>");
        kotlin.jvm.internal.s.g(missingDelimiterValue, "missingDelimiterValue");
        d02 = d0(str, c11, 0, false, 6, null);
        if (d02 == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(0, d02);
        kotlin.jvm.internal.s.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ int Z(CharSequence charSequence, String str, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            z11 = false;
        }
        return V(charSequence, str, i11, z11);
    }

    public static String Z0(String str, String delimiter, String missingDelimiterValue) {
        int e02;
        kotlin.jvm.internal.s.g(str, "<this>");
        kotlin.jvm.internal.s.g(delimiter, "delimiter");
        kotlin.jvm.internal.s.g(missingDelimiterValue, "missingDelimiterValue");
        e02 = e0(str, delimiter, 0, false, 6, null);
        if (e02 == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(0, e02);
        kotlin.jvm.internal.s.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final int a0(CharSequence charSequence, char[] chars, int i11, boolean z11) {
        int d11;
        int T;
        boolean z12;
        char f02;
        kotlin.jvm.internal.s.g(charSequence, "<this>");
        kotlin.jvm.internal.s.g(chars, "chars");
        if (!z11 && chars.length == 1 && (charSequence instanceof String)) {
            f02 = wz.p.f0(chars);
            return ((String) charSequence).indexOf(f02, i11);
        }
        d11 = m00.l.d(i11, 0);
        T = T(charSequence);
        if (d11 > T) {
            return -1;
        }
        while (true) {
            char charAt = charSequence.charAt(d11);
            int length = chars.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    z12 = false;
                    break;
                } else if (kotlin.text.c.e(chars[i12], charAt, z11)) {
                    z12 = true;
                    break;
                } else {
                    i12++;
                }
            }
            if (z12) {
                return d11;
            }
            if (d11 == T) {
                return -1;
            }
            d11++;
        }
    }

    public static /* synthetic */ String a1(String str, char c11, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = str;
        }
        return Y0(str, c11, str2);
    }

    public static final int b0(CharSequence charSequence, char c11, int i11, boolean z11) {
        kotlin.jvm.internal.s.g(charSequence, "<this>");
        if (!z11 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(c11, i11);
        }
        return f0(charSequence, new char[]{c11}, i11, z11);
    }

    public static /* synthetic */ String b1(String str, String str2, String str3, int i11, Object obj) {
        String Z0;
        if ((i11 & 2) != 0) {
            str3 = str;
        }
        Z0 = Z0(str, str2, str3);
        return Z0;
    }

    public static final int c0(CharSequence charSequence, String string, int i11, boolean z11) {
        kotlin.jvm.internal.s.g(charSequence, "<this>");
        kotlin.jvm.internal.s.g(string, "string");
        if (!z11 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(string, i11);
        }
        return W(charSequence, string, i11, 0, z11, true);
    }

    public static Boolean c1(String str) {
        kotlin.jvm.internal.s.g(str, "<this>");
        if (kotlin.jvm.internal.s.c(str, "true")) {
            return Boolean.TRUE;
        }
        if (kotlin.jvm.internal.s.c(str, "false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static /* synthetic */ int d0(CharSequence charSequence, char c11, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = T(charSequence);
        }
        if ((i12 & 4) != 0) {
            z11 = false;
        }
        return b0(charSequence, c11, i11, z11);
    }

    public static CharSequence d1(CharSequence charSequence) {
        boolean c11;
        kotlin.jvm.internal.s.g(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i11 = 0;
        boolean z11 = false;
        while (i11 <= length) {
            c11 = kotlin.text.b.c(charSequence.charAt(!z11 ? i11 : length));
            if (z11) {
                if (!c11) {
                    break;
                }
                length--;
            } else if (c11) {
                i11++;
            } else {
                z11 = true;
            }
        }
        return charSequence.subSequence(i11, length + 1);
    }

    public static /* synthetic */ int e0(CharSequence charSequence, String str, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = T(charSequence);
        }
        if ((i12 & 4) != 0) {
            z11 = false;
        }
        return c0(charSequence, str, i11, z11);
    }

    public static final int f0(CharSequence charSequence, char[] chars, int i11, boolean z11) {
        int T;
        int i12;
        char f02;
        kotlin.jvm.internal.s.g(charSequence, "<this>");
        kotlin.jvm.internal.s.g(chars, "chars");
        if (!z11 && chars.length == 1 && (charSequence instanceof String)) {
            f02 = wz.p.f0(chars);
            return ((String) charSequence).lastIndexOf(f02, i11);
        }
        T = T(charSequence);
        for (i12 = m00.l.i(i11, T); -1 < i12; i12--) {
            char charAt = charSequence.charAt(i12);
            int length = chars.length;
            boolean z12 = false;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    break;
                } else if (kotlin.text.c.e(chars[i13], charAt, z11)) {
                    z12 = true;
                    break;
                } else {
                    i13++;
                }
            }
            if (z12) {
                return i12;
            }
        }
        return -1;
    }

    public static final u20.h<String> g0(CharSequence charSequence) {
        kotlin.jvm.internal.s.g(charSequence, "<this>");
        return G0(charSequence, new String[]{FileUploadRequest.LINE_BREAK, "\n", "\r"}, false, 0, 6, null);
    }

    public static final List<String> h0(CharSequence charSequence) {
        List<String> I;
        kotlin.jvm.internal.s.g(charSequence, "<this>");
        I = u20.p.I(g0(charSequence));
        return I;
    }

    public static final CharSequence i0(CharSequence charSequence, int i11, char c11) {
        kotlin.jvm.internal.s.g(charSequence, "<this>");
        if (i11 >= 0) {
            if (i11 <= charSequence.length()) {
                return charSequence.subSequence(0, charSequence.length());
            }
            StringBuilder sb2 = new StringBuilder(i11);
            sb2.append(charSequence);
            int length = i11 - charSequence.length();
            int i12 = 1;
            if (1 <= length) {
                while (true) {
                    sb2.append(c11);
                    if (i12 == length) {
                        break;
                    }
                    i12++;
                }
            }
            return sb2;
        }
        throw new IllegalArgumentException("Desired length " + i11 + " is less than zero.");
    }

    public static String j0(String str, int i11, char c11) {
        kotlin.jvm.internal.s.g(str, "<this>");
        return i0(str, i11, c11).toString();
    }

    public static /* synthetic */ String k0(String str, int i11, char c11, int i12, Object obj) {
        String j02;
        if ((i12 & 2) != 0) {
            c11 = ' ';
        }
        j02 = j0(str, i11, c11);
        return j02;
    }

    public static final CharSequence l0(CharSequence charSequence, int i11, char c11) {
        kotlin.jvm.internal.s.g(charSequence, "<this>");
        if (i11 >= 0) {
            if (i11 <= charSequence.length()) {
                return charSequence.subSequence(0, charSequence.length());
            }
            StringBuilder sb2 = new StringBuilder(i11);
            int length = i11 - charSequence.length();
            int i12 = 1;
            if (1 <= length) {
                while (true) {
                    sb2.append(c11);
                    if (i12 == length) {
                        break;
                    }
                    i12++;
                }
            }
            sb2.append(charSequence);
            return sb2;
        }
        throw new IllegalArgumentException("Desired length " + i11 + " is less than zero.");
    }

    public static String m0(String str, int i11, char c11) {
        kotlin.jvm.internal.s.g(str, "<this>");
        return l0(str, i11, c11).toString();
    }

    public static /* synthetic */ String n0(String str, int i11, char c11, int i12, Object obj) {
        String m02;
        if ((i12 & 2) != 0) {
            c11 = ' ';
        }
        m02 = m0(str, i11, c11);
        return m02;
    }

    private static final u20.h<m00.i> o0(CharSequence charSequence, char[] cArr, int i11, boolean z11, int i12) {
        z0(i12);
        return new e(charSequence, i11, i12, new a(cArr, z11));
    }

    private static final u20.h<m00.i> p0(CharSequence charSequence, String[] strArr, int i11, boolean z11, int i12) {
        List e11;
        z0(i12);
        e11 = wz.o.e(strArr);
        return new e(charSequence, i11, i12, new b(e11, z11));
    }

    static /* synthetic */ u20.h q0(CharSequence charSequence, char[] cArr, int i11, boolean z11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            z11 = false;
        }
        if ((i13 & 8) != 0) {
            i12 = 0;
        }
        return o0(charSequence, cArr, i11, z11, i12);
    }

    static /* synthetic */ u20.h r0(CharSequence charSequence, String[] strArr, int i11, boolean z11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            z11 = false;
        }
        if ((i13 & 8) != 0) {
            i12 = 0;
        }
        return p0(charSequence, strArr, i11, z11, i12);
    }

    public static final boolean s0(CharSequence charSequence, int i11, CharSequence other, int i12, int i13, boolean z11) {
        kotlin.jvm.internal.s.g(charSequence, "<this>");
        kotlin.jvm.internal.s.g(other, "other");
        if (i12 < 0 || i11 < 0 || i11 > charSequence.length() - i13 || i12 > other.length() - i13) {
            return false;
        }
        for (int i14 = 0; i14 < i13; i14++) {
            if (!kotlin.text.c.e(charSequence.charAt(i11 + i14), other.charAt(i12 + i14), z11)) {
                return false;
            }
        }
        return true;
    }

    public static String t0(String str, CharSequence prefix) {
        kotlin.jvm.internal.s.g(str, "<this>");
        kotlin.jvm.internal.s.g(prefix, "prefix");
        if (K0(str, prefix, false, 2, null)) {
            String substring = str.substring(prefix.length());
            kotlin.jvm.internal.s.f(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        return str;
    }

    public static CharSequence u0(CharSequence charSequence, int i11, int i12) {
        kotlin.jvm.internal.s.g(charSequence, "<this>");
        if (i12 < i11) {
            throw new IndexOutOfBoundsException("End index (" + i12 + ") is less than start index (" + i11 + ").");
        } else if (i12 == i11) {
            return charSequence.subSequence(0, charSequence.length());
        } else {
            StringBuilder sb2 = new StringBuilder(charSequence.length() - (i12 - i11));
            sb2.append(charSequence, 0, i11);
            kotlin.jvm.internal.s.f(sb2, "this.append(value, startIndex, endIndex)");
            sb2.append(charSequence, i12, charSequence.length());
            kotlin.jvm.internal.s.f(sb2, "this.append(value, startIndex, endIndex)");
            return sb2;
        }
    }

    public static String v0(String str, CharSequence suffix) {
        boolean Q;
        kotlin.jvm.internal.s.g(str, "<this>");
        kotlin.jvm.internal.s.g(suffix, "suffix");
        Q = Q(str, suffix, false, 2, null);
        if (Q) {
            String substring = str.substring(0, str.length() - suffix.length());
            kotlin.jvm.internal.s.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return str;
    }

    public static String w0(String str, CharSequence delimiter) {
        kotlin.jvm.internal.s.g(str, "<this>");
        kotlin.jvm.internal.s.g(delimiter, "delimiter");
        return x0(str, delimiter, delimiter);
    }

    public static final String x0(String str, CharSequence prefix, CharSequence suffix) {
        boolean Q;
        kotlin.jvm.internal.s.g(str, "<this>");
        kotlin.jvm.internal.s.g(prefix, "prefix");
        kotlin.jvm.internal.s.g(suffix, "suffix");
        if (str.length() < prefix.length() + suffix.length() || !K0(str, prefix, false, 2, null)) {
            return str;
        }
        Q = Q(str, suffix, false, 2, null);
        if (Q) {
            String substring = str.substring(prefix.length(), str.length() - suffix.length());
            kotlin.jvm.internal.s.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return str;
    }

    public static CharSequence y0(CharSequence charSequence, int i11, int i12, CharSequence replacement) {
        kotlin.jvm.internal.s.g(charSequence, "<this>");
        kotlin.jvm.internal.s.g(replacement, "replacement");
        if (i12 >= i11) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(charSequence, 0, i11);
            kotlin.jvm.internal.s.f(sb2, "this.append(value, startIndex, endIndex)");
            sb2.append(replacement);
            sb2.append(charSequence, i12, charSequence.length());
            kotlin.jvm.internal.s.f(sb2, "this.append(value, startIndex, endIndex)");
            return sb2;
        }
        throw new IndexOutOfBoundsException("End index (" + i12 + ") is less than start index (" + i11 + ").");
    }

    public static final void z0(int i11) {
        if (i11 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i11).toString());
    }
}