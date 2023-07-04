package b7;

import ch.qos.logback.core.CoreConstants;
import j7.f;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.s;
import kotlin.text.y;
import v6.z;
import vz.p;
import vz.v;
import wz.w;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f7528a = new h();

    /* renamed from: b  reason: collision with root package name */
    private static final Pattern f7529b = Pattern.compile("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}");

    /* renamed from: c  reason: collision with root package name */
    private static final List<Integer> f7530c;

    /* renamed from: d  reason: collision with root package name */
    private static final List<Character> f7531d;

    /* renamed from: e  reason: collision with root package name */
    private static final Pattern f7532e;

    /* renamed from: f  reason: collision with root package name */
    private static final List<Integer> f7533f;

    /* renamed from: g  reason: collision with root package name */
    private static final List<Character> f7534g;

    static {
        List<Integer> l11;
        List<Character> l12;
        List<Integer> l13;
        List<Character> l14;
        l11 = w.l(3, 3, 3, 2);
        f7530c = l11;
        Character valueOf = Character.valueOf(CoreConstants.DOT);
        Character valueOf2 = Character.valueOf(CoreConstants.DASH_CHAR);
        l12 = w.l(valueOf, valueOf, valueOf2);
        f7531d = l12;
        f7532e = Pattern.compile("\\d{2}\\.\\d{3}\\.\\d{3}/\\d{4}-\\d{2}");
        l13 = w.l(2, 3, 3, 4, 2);
        f7533f = l13;
        l14 = w.l(valueOf, valueOf, '/', valueOf2);
        f7534g = l14;
    }

    private h() {
    }

    public final String a(String inputString) {
        p a11;
        int k11;
        String i12;
        s.g(inputString, "inputString");
        StringBuilder sb2 = new StringBuilder();
        int length = inputString.length();
        int i11 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            char charAt = inputString.charAt(i13);
            if (Character.isDigit(charAt)) {
                sb2.append(charAt);
            }
        }
        String sb3 = sb2.toString();
        s.f(sb3, "filterTo(StringBuilder(), predicate).toString()");
        ArrayList arrayList = new ArrayList();
        StringBuilder sb4 = new StringBuilder();
        if (sb3.length() <= 11) {
            a11 = v.a(f7530c, f7531d);
        } else {
            a11 = v.a(f7533f, f7534g);
        }
        List list = (List) a11.a();
        List list2 = (List) a11.b();
        int size = list.size() - 1;
        if (size >= 0) {
            int i14 = 0;
            while (true) {
                int i15 = i14 + 1;
                if (sb3.length() >= ((Number) list.get(i14)).intValue()) {
                    i12 = y.i1(sb3, ((Number) list.get(i14)).intValue());
                    arrayList.add(i12);
                    sb3 = sb3.substring(((Number) list.get(i14)).intValue());
                    s.f(sb3, "(this as java.lang.String).substring(startIndex)");
                } else if (sb3.length() > 0) {
                    arrayList.add(sb3);
                    break;
                }
                if (i15 > size) {
                    break;
                }
                i14 = i15;
            }
        }
        for (Object obj : arrayList) {
            int i16 = i11 + 1;
            if (i11 < 0) {
                w.s();
            }
            sb4.append((String) obj);
            k11 = w.k(arrayList);
            if (i11 != k11) {
                sb4.append(((Character) list2.get(i11)).charValue());
            }
            i11 = i16;
        }
        String sb5 = sb4.toString();
        s.f(sb5, "resultBuilder.toString()");
        return sb5;
    }

    public final List<Character> b() {
        return f7534g;
    }

    public final j7.a<String> c(String socialSecurityNumber) {
        j7.f aVar;
        s.g(socialSecurityNumber, "socialSecurityNumber");
        StringBuilder sb2 = new StringBuilder();
        int length = socialSecurityNumber.length();
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = socialSecurityNumber.charAt(i11);
            if (Character.isDigit(charAt)) {
                sb2.append(charAt);
            }
        }
        String sb3 = sb2.toString();
        s.f(sb3, "filterTo(StringBuilder(), predicate).toString()");
        int length2 = sb3.length();
        if (length2 == 11 && f7529b.matcher(socialSecurityNumber).matches()) {
            aVar = f.b.f33276a;
        } else {
            aVar = (length2 == 14 && f7532e.matcher(socialSecurityNumber).matches()) ? f.b.f33276a : new f.a(z.checkout_social_security_number_not_valid);
        }
        StringBuilder sb4 = new StringBuilder();
        int length3 = socialSecurityNumber.length();
        for (int i12 = 0; i12 < length3; i12++) {
            char charAt2 = socialSecurityNumber.charAt(i12);
            if (Character.isDigit(charAt2)) {
                sb4.append(charAt2);
            }
        }
        String sb5 = sb4.toString();
        s.f(sb5, "filterTo(StringBuilder(), predicate).toString()");
        return new j7.a<>(sb5, aVar);
    }
}