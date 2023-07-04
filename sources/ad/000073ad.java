package hq;

import com.adyen.checkout.components.model.payments.request.Address;
import java.io.IOException;

/* loaded from: classes2.dex */
class j {

    /* renamed from: a  reason: collision with root package name */
    public static final e f29398a = new e();

    /* renamed from: b  reason: collision with root package name */
    public static final f f29399b = new f();

    /* renamed from: c  reason: collision with root package name */
    public static final d f29400c = new d();

    /* renamed from: d  reason: collision with root package name */
    public static final c f29401d = new c();

    /* renamed from: e  reason: collision with root package name */
    public static final b f29402e = new b();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class b implements h {
        private b() {
        }

        @Override // hq.j.h
        public void a(String str, Appendable appendable) {
            try {
                int length = str.length();
                for (int i11 = 0; i11 < length; i11++) {
                    char charAt = str.charAt(i11);
                    if (charAt == '\f') {
                        appendable.append("\\f");
                    } else if (charAt == '\r') {
                        appendable.append("\\r");
                    } else if (charAt == '\"') {
                        appendable.append("\\\"");
                    } else if (charAt == '/') {
                        appendable.append("\\/");
                    } else if (charAt != '\\') {
                        switch (charAt) {
                            case '\b':
                                appendable.append("\\b");
                                continue;
                            case '\t':
                                appendable.append("\\t");
                                continue;
                            case '\n':
                                appendable.append("\\n");
                                continue;
                            default:
                                if ((charAt >= 0 && charAt <= 31) || ((charAt >= 127 && charAt <= 159) || (charAt >= 8192 && charAt <= 8447))) {
                                    appendable.append("\\u");
                                    appendable.append("0123456789ABCDEF".charAt((charAt >> '\f') & 15));
                                    appendable.append("0123456789ABCDEF".charAt((charAt >> '\b') & 15));
                                    appendable.append("0123456789ABCDEF".charAt((charAt >> 4) & 15));
                                    appendable.append("0123456789ABCDEF".charAt((charAt >> 0) & 15));
                                    continue;
                                } else {
                                    appendable.append(charAt);
                                    break;
                                }
                                break;
                        }
                    } else {
                        appendable.append("\\\\");
                    }
                }
            } catch (IOException unused) {
                throw new RuntimeException("Impossible Error");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class c implements h {
        private c() {
        }

        @Override // hq.j.h
        public void a(String str, Appendable appendable) {
            try {
                int length = str.length();
                for (int i11 = 0; i11 < length; i11++) {
                    char charAt = str.charAt(i11);
                    if (charAt == '\f') {
                        appendable.append("\\f");
                    } else if (charAt == '\r') {
                        appendable.append("\\r");
                    } else if (charAt == '\"') {
                        appendable.append("\\\"");
                    } else if (charAt != '\\') {
                        switch (charAt) {
                            case '\b':
                                appendable.append("\\b");
                                continue;
                            case '\t':
                                appendable.append("\\t");
                                continue;
                            case '\n':
                                appendable.append("\\n");
                                continue;
                            default:
                                if ((charAt >= 0 && charAt <= 31) || ((charAt >= 127 && charAt <= 159) || (charAt >= 8192 && charAt <= 8447))) {
                                    appendable.append("\\u");
                                    appendable.append("0123456789ABCDEF".charAt((charAt >> '\f') & 15));
                                    appendable.append("0123456789ABCDEF".charAt((charAt >> '\b') & 15));
                                    appendable.append("0123456789ABCDEF".charAt((charAt >> 4) & 15));
                                    appendable.append("0123456789ABCDEF".charAt((charAt >> 0) & 15));
                                    continue;
                                } else {
                                    appendable.append(charAt);
                                    break;
                                }
                        }
                    } else {
                        appendable.append("\\\\");
                    }
                }
            } catch (IOException unused) {
                throw new RuntimeException("Impossible Exception");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class d implements g {
        private d() {
        }

        @Override // hq.j.g
        public boolean a(String str) {
            if (str == null) {
                return false;
            }
            int length = str.length();
            if (length != 0 && str.trim() == str) {
                char charAt = str.charAt(0);
                if (j.c(charAt) || j.f(charAt)) {
                    return true;
                }
                for (int i11 = 1; i11 < length; i11++) {
                    char charAt2 = str.charAt(i11);
                    if (j.e(charAt2) || j.f(charAt2)) {
                        return true;
                    }
                }
                if (j.a(str)) {
                    return true;
                }
                char charAt3 = str.charAt(0);
                if ((charAt3 >= '0' && charAt3 <= '9') || charAt3 == '-') {
                    int i12 = 1;
                    while (i12 < length) {
                        charAt3 = str.charAt(i12);
                        if (charAt3 < '0' || charAt3 > '9') {
                            break;
                        }
                        i12++;
                    }
                    if (i12 == length) {
                        return true;
                    }
                    if (charAt3 == '.') {
                        i12++;
                    }
                    while (i12 < length) {
                        charAt3 = str.charAt(i12);
                        if (charAt3 < '0' || charAt3 > '9') {
                            break;
                        }
                        i12++;
                    }
                    if (i12 == length) {
                        return true;
                    }
                    if (charAt3 == 'E' || charAt3 == 'e') {
                        i12++;
                        if (i12 == length) {
                            return false;
                        }
                        char charAt4 = str.charAt(i12);
                        if (charAt4 == '+' || charAt4 == '-') {
                            i12++;
                            str.charAt(i12);
                        }
                    }
                    if (i12 == length) {
                        return false;
                    }
                    while (i12 < length) {
                        char charAt5 = str.charAt(i12);
                        if (charAt5 < '0' || charAt5 > '9') {
                            break;
                        }
                        i12++;
                    }
                    if (i12 == length) {
                        return true;
                    }
                }
                return false;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class e implements g {
        private e() {
        }

        @Override // hq.j.g
        public boolean a(String str) {
            if (str == null) {
                return false;
            }
            int length = str.length();
            if (length != 0 && str.trim() == str) {
                char charAt = str.charAt(0);
                if ((charAt < '0' || charAt > '9') && charAt != '-') {
                    for (int i11 = 0; i11 < length; i11++) {
                        char charAt2 = str.charAt(i11);
                        if (j.b(charAt2) || j.c(charAt2) || j.d(charAt2) || j.f(charAt2)) {
                            return true;
                        }
                    }
                    return j.a(str);
                }
                return true;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class f implements g {
        private f() {
        }

        @Override // hq.j.g
        public boolean a(String str) {
            return true;
        }
    }

    /* loaded from: classes2.dex */
    public interface g {
        boolean a(String str);
    }

    /* loaded from: classes2.dex */
    public interface h {
        void a(String str, Appendable appendable);
    }

    public static boolean a(String str) {
        if (str.length() < 3) {
            return false;
        }
        char charAt = str.charAt(0);
        if (charAt == 'n') {
            return str.equals(Address.ADDRESS_NULL_PLACEHOLDER);
        }
        if (charAt == 't') {
            return str.equals("true");
        }
        if (charAt == 'f') {
            return str.equals("false");
        }
        if (charAt == 'N') {
            return str.equals("NaN");
        }
        return false;
    }

    public static boolean b(char c11) {
        return c11 == '\r' || c11 == '\n' || c11 == '\t' || c11 == ' ';
    }

    public static boolean c(char c11) {
        return c11 == '{' || c11 == '[' || c11 == ',' || c11 == '}' || c11 == ']' || c11 == ':' || c11 == '\'' || c11 == '\"';
    }

    public static boolean d(char c11) {
        return c11 == '\b' || c11 == '\f' || c11 == '\n';
    }

    public static boolean e(char c11) {
        return c11 == '}' || c11 == ']' || c11 == ',' || c11 == ':';
    }

    public static boolean f(char c11) {
        return (c11 >= 0 && c11 <= 31) || (c11 >= 127 && c11 <= 159) || (c11 >= 8192 && c11 <= 8447);
    }
}