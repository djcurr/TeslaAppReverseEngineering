package ih;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private static final String f30405a = System.getProperty("line.separator");

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final Iterator<String> f30406a;

        public a(String str) {
            this(str, -1);
        }

        public boolean a() {
            return this.f30406a.hasNext();
        }

        public String b() {
            if (a()) {
                String next = this.f30406a.next();
                if (next.length() == 0) {
                    return null;
                }
                return next;
            }
            return null;
        }

        public a(String str, int i11) {
            this.f30406a = e.c(str, i11).iterator();
        }
    }

    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final Iterator<List<String>> f30407a;

        public b(String str) {
            this(e.d(str));
        }

        public boolean a() {
            return this.f30407a.hasNext();
        }

        public List<String> b() {
            if (!a()) {
                return new ArrayList(0);
            }
            return this.f30407a.next();
        }

        public String c() {
            if (a()) {
                List<String> next = this.f30407a.next();
                if (next.isEmpty()) {
                    return null;
                }
                return next.get(0);
            }
            return null;
        }

        public b(List<List<String>> list) {
            this.f30407a = list.iterator();
        }
    }

    public static List<String> a(String str) {
        return e(str, CoreConstants.COMMA_CHAR, -1);
    }

    public static List<String> b(String str) {
        return c(str, -1);
    }

    public static List<String> c(String str, int i11) {
        return e(str, ';', i11);
    }

    public static List<List<String>> d(String str) {
        if (str.length() == 0) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.add(arrayList2);
        int i11 = 0;
        boolean z11 = false;
        for (int i12 = 0; i12 < str.length(); i12++) {
            if (z11) {
                z11 = false;
            } else {
                char charAt = str.charAt(i12);
                if (charAt == ',') {
                    arrayList2.add(g(str, i11, i12));
                } else if (charAt == ';') {
                    String g11 = g(str, i11, i12);
                    if (!arrayList2.isEmpty() || g11.length() != 0) {
                        arrayList2.add(g11);
                    }
                    arrayList2 = new ArrayList();
                    arrayList.add(arrayList2);
                } else if (charAt == '\\') {
                    z11 = true;
                }
                i11 = i12 + 1;
            }
        }
        String g12 = g(str, i11, str.length());
        if (!arrayList2.isEmpty() || g12.length() != 0) {
            arrayList2.add(g12);
        }
        return arrayList;
    }

    private static List<String> e(String str, char c11, int i11) {
        if (str.length() == 0) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList();
        boolean z11 = false;
        int i12 = 0;
        for (int i13 = 0; i13 < str.length(); i13++) {
            char charAt = str.charAt(i13);
            if (z11) {
                z11 = false;
            } else if (charAt == c11) {
                arrayList.add(g(str, i12, i13));
                i12 = i13 + 1;
                if (i11 > 0 && arrayList.size() == i11 - 1) {
                    break;
                }
            } else if (charAt == '\\') {
                z11 = true;
            }
        }
        arrayList.add(g(str, i12, str.length()));
        return arrayList;
    }

    public static String f(String str) {
        return g(str, 0, str.length());
    }

    private static String g(String str, int i11, int i12) {
        StringBuilder sb2 = null;
        boolean z11 = false;
        for (int i13 = i11; i13 < i12; i13++) {
            char charAt = str.charAt(i13);
            if (z11) {
                if (sb2 == null) {
                    sb2 = new StringBuilder(i12 - i11);
                    sb2.append(str.substring(i11, i13 - 1));
                }
                if (charAt != 'N' && charAt != 'n') {
                    sb2.append(charAt);
                } else {
                    sb2.append(f30405a);
                }
                z11 = false;
            } else if (charAt == '\\') {
                z11 = true;
            } else if (sb2 != null) {
                sb2.append(charAt);
            }
        }
        if (sb2 != null) {
            return sb2.toString();
        }
        return (i11 == 0 && i12 == str.length()) ? str : str.substring(i11, i12);
    }
}