package kotlin.text;

import ch.qos.logback.core.CoreConstants;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.jvm.internal.q0;
import wz.n0;

/* loaded from: classes5.dex */
public class v extends u {
    public static final String A(String str, char c11, char c12, boolean z11) {
        kotlin.jvm.internal.s.g(str, "<this>");
        if (!z11) {
            String replace = str.replace(c11, c12);
            kotlin.jvm.internal.s.f(replace, "this as java.lang.String…replace(oldChar, newChar)");
            return replace;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        for (int i11 = 0; i11 < str.length(); i11++) {
            char charAt = str.charAt(i11);
            if (c.e(charAt, c11, z11)) {
                charAt = c12;
            }
            sb2.append(charAt);
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.s.f(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }

    public static String B(String str, String oldValue, String newValue, boolean z11) {
        int d11;
        kotlin.jvm.internal.s.g(str, "<this>");
        kotlin.jvm.internal.s.g(oldValue, "oldValue");
        kotlin.jvm.internal.s.g(newValue, "newValue");
        int i11 = 0;
        int V = w.V(str, oldValue, 0, z11);
        if (V < 0) {
            return str;
        }
        int length = oldValue.length();
        d11 = m00.l.d(length, 1);
        int length2 = (str.length() - length) + newValue.length();
        if (length2 >= 0) {
            StringBuilder sb2 = new StringBuilder(length2);
            do {
                sb2.append((CharSequence) str, i11, V);
                sb2.append(newValue);
                i11 = V + length;
                if (V >= str.length()) {
                    break;
                }
                V = w.V(str, oldValue, V + d11, z11);
            } while (V > 0);
            sb2.append((CharSequence) str, i11, str.length());
            String sb3 = sb2.toString();
            kotlin.jvm.internal.s.f(sb3, "stringBuilder.append(this, i, length).toString()");
            return sb3;
        }
        throw new OutOfMemoryError();
    }

    public static /* synthetic */ String C(String str, char c11, char c12, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        return A(str, c11, c12, z11);
    }

    public static /* synthetic */ String D(String str, String str2, String str3, boolean z11, int i11, Object obj) {
        String B;
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        B = B(str, str2, str3, z11);
        return B;
    }

    public static boolean E(String str, String prefix, int i11, boolean z11) {
        kotlin.jvm.internal.s.g(str, "<this>");
        kotlin.jvm.internal.s.g(prefix, "prefix");
        if (!z11) {
            return str.startsWith(prefix, i11);
        }
        return x(str, i11, prefix, 0, prefix.length(), z11);
    }

    public static boolean F(String str, String prefix, boolean z11) {
        kotlin.jvm.internal.s.g(str, "<this>");
        kotlin.jvm.internal.s.g(prefix, "prefix");
        if (!z11) {
            return str.startsWith(prefix);
        }
        return x(str, 0, prefix, 0, prefix.length(), z11);
    }

    public static /* synthetic */ boolean G(String str, String str2, int i11, boolean z11, int i12, Object obj) {
        boolean E;
        if ((i12 & 4) != 0) {
            z11 = false;
        }
        E = E(str, str2, i11, z11);
        return E;
    }

    public static /* synthetic */ boolean H(String str, String str2, boolean z11, int i11, Object obj) {
        boolean F;
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        F = F(str, str2, z11);
        return F;
    }

    public static byte[] r(String str) {
        kotlin.jvm.internal.s.g(str, "<this>");
        byte[] bytes = str.getBytes(d.f35187b);
        kotlin.jvm.internal.s.f(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    public static final boolean s(String str, String suffix, boolean z11) {
        kotlin.jvm.internal.s.g(str, "<this>");
        kotlin.jvm.internal.s.g(suffix, "suffix");
        if (!z11) {
            return str.endsWith(suffix);
        }
        return x(str, str.length() - suffix.length(), suffix, 0, suffix.length(), true);
    }

    public static /* synthetic */ boolean t(String str, String str2, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return s(str, str2, z11);
    }

    public static boolean u(String str, String str2, boolean z11) {
        if (str == null) {
            return str2 == null;
        } else if (!z11) {
            return str.equals(str2);
        } else {
            return str.equalsIgnoreCase(str2);
        }
    }

    public static Comparator<String> v(q0 q0Var) {
        kotlin.jvm.internal.s.g(q0Var, "<this>");
        Comparator<String> CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        kotlin.jvm.internal.s.f(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
        return CASE_INSENSITIVE_ORDER;
    }

    public static boolean w(CharSequence charSequence) {
        m00.i S;
        boolean c11;
        boolean z11;
        kotlin.jvm.internal.s.g(charSequence, "<this>");
        if (charSequence.length() != 0) {
            S = w.S(charSequence);
            if (!(S instanceof Collection) || !((Collection) S).isEmpty()) {
                Iterator<Integer> it2 = S.iterator();
                while (it2.hasNext()) {
                    c11 = b.c(charSequence.charAt(((n0) it2).a()));
                    if (!c11) {
                        z11 = false;
                        break;
                    }
                }
            }
            z11 = true;
            if (!z11) {
                return false;
            }
        }
        return true;
    }

    public static final boolean x(String str, int i11, String other, int i12, int i13, boolean z11) {
        kotlin.jvm.internal.s.g(str, "<this>");
        kotlin.jvm.internal.s.g(other, "other");
        if (!z11) {
            return str.regionMatches(i11, other, i12, i13);
        }
        return str.regionMatches(z11, i11, other, i12, i13);
    }

    public static /* synthetic */ boolean y(String str, int i11, String str2, int i12, int i13, boolean z11, int i14, Object obj) {
        if ((i14 & 16) != 0) {
            z11 = false;
        }
        return x(str, i11, str2, i12, i13, z11);
    }

    public static String z(CharSequence charSequence, int i11) {
        kotlin.jvm.internal.s.g(charSequence, "<this>");
        int i12 = 1;
        if (!(i11 >= 0)) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i11 + CoreConstants.DOT).toString());
        } else if (i11 != 0) {
            if (i11 != 1) {
                int length = charSequence.length();
                if (length != 0) {
                    if (length != 1) {
                        StringBuilder sb2 = new StringBuilder(charSequence.length() * i11);
                        if (1 <= i11) {
                            while (true) {
                                sb2.append(charSequence);
                                if (i12 == i11) {
                                    break;
                                }
                                i12++;
                            }
                        }
                        String sb3 = sb2.toString();
                        kotlin.jvm.internal.s.f(sb3, "{\n                    va…tring()\n                }");
                        return sb3;
                    }
                    char charAt = charSequence.charAt(0);
                    char[] cArr = new char[i11];
                    for (int i13 = 0; i13 < i11; i13++) {
                        cArr[i13] = charAt;
                    }
                    return new String(cArr);
                }
                return "";
            }
            return charSequence.toString();
        } else {
            return "";
        }
    }
}