package io.grpc.okhttp.internal;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final String[] f31541a;

    /* loaded from: classes5.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final List<String> f31542a = new ArrayList(20);

        private void d(String str, String str2) {
            if (str != null) {
                if (!str.isEmpty()) {
                    int length = str.length();
                    for (int i11 = 0; i11 < length; i11++) {
                        char charAt = str.charAt(i11);
                        if (charAt <= 31 || charAt >= 127) {
                            throw new IllegalArgumentException(String.format("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i11), str));
                        }
                    }
                    if (str2 != null) {
                        int length2 = str2.length();
                        for (int i12 = 0; i12 < length2; i12++) {
                            char charAt2 = str2.charAt(i12);
                            if (charAt2 <= 31 || charAt2 >= 127) {
                                throw new IllegalArgumentException(String.format("Unexpected char %#04x at %d in header value: %s", Integer.valueOf(charAt2), Integer.valueOf(i12), str2));
                            }
                        }
                        return;
                    }
                    throw new IllegalArgumentException("value == null");
                }
                throw new IllegalArgumentException("name is empty");
            }
            throw new IllegalArgumentException("name == null");
        }

        b b(String str, String str2) {
            this.f31542a.add(str);
            this.f31542a.add(str2.trim());
            return this;
        }

        public e c() {
            return new e(this);
        }

        public b e(String str) {
            int i11 = 0;
            while (i11 < this.f31542a.size()) {
                if (str.equalsIgnoreCase(this.f31542a.get(i11))) {
                    this.f31542a.remove(i11);
                    this.f31542a.remove(i11);
                    i11 -= 2;
                }
                i11 += 2;
            }
            return this;
        }

        public b f(String str, String str2) {
            d(str, str2);
            e(str);
            b(str, str2);
            return this;
        }
    }

    public String a(int i11) {
        int i12 = i11 * 2;
        if (i12 >= 0) {
            String[] strArr = this.f31541a;
            if (i12 >= strArr.length) {
                return null;
            }
            return strArr[i12];
        }
        return null;
    }

    public int b() {
        return this.f31541a.length / 2;
    }

    public String c(int i11) {
        int i12 = (i11 * 2) + 1;
        if (i12 >= 0) {
            String[] strArr = this.f31541a;
            if (i12 >= strArr.length) {
                return null;
            }
            return strArr[i12];
        }
        return null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int b11 = b();
        for (int i11 = 0; i11 < b11; i11++) {
            sb2.append(a(i11));
            sb2.append(": ");
            sb2.append(c(i11));
            sb2.append("\n");
        }
        return sb2.toString();
    }

    private e(b bVar) {
        this.f31541a = (String[]) bVar.f31542a.toArray(new String[bVar.f31542a.size()]);
    }
}