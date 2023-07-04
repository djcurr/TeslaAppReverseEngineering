package h30;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes5.dex */
public final class h0 {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f28846a;

    /* renamed from: b  reason: collision with root package name */
    private static final byte[] f28847b;

    static {
        String[] strArr = new String[93];
        for (int i11 = 0; i11 < 32; i11++) {
            strArr[i11] = "\\u" + e(i11 >> 12) + e(i11 >> 8) + e(i11 >> 4) + e(i11);
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        f28846a = strArr;
        byte[] bArr = new byte[93];
        for (int i12 = 0; i12 < 32; i12++) {
            bArr[i12] = 1;
        }
        bArr[34] = (byte) 34;
        bArr[92] = (byte) 92;
        bArr[9] = (byte) 116;
        bArr[8] = (byte) 98;
        bArr[10] = (byte) 110;
        bArr[13] = (byte) 114;
        bArr[12] = (byte) 102;
        f28847b = bArr;
    }

    public static final byte[] a() {
        return f28847b;
    }

    public static final String[] b() {
        return f28846a;
    }

    public static final void c(StringBuilder sb2, String value) {
        kotlin.jvm.internal.s.g(sb2, "<this>");
        kotlin.jvm.internal.s.g(value, "value");
        sb2.append(CoreConstants.DOUBLE_QUOTE_CHAR);
        int length = value.length();
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            char charAt = value.charAt(i12);
            String[] strArr = f28846a;
            if (charAt < strArr.length && strArr[charAt] != null) {
                sb2.append((CharSequence) value, i11, i12);
                sb2.append(strArr[charAt]);
                i11 = i12 + 1;
            }
        }
        if (i11 != 0) {
            sb2.append((CharSequence) value, i11, value.length());
        } else {
            sb2.append(value);
        }
        sb2.append(CoreConstants.DOUBLE_QUOTE_CHAR);
    }

    public static final Boolean d(String str) {
        boolean u11;
        boolean u12;
        kotlin.jvm.internal.s.g(str, "<this>");
        u11 = kotlin.text.v.u(str, "true", true);
        if (u11) {
            return Boolean.TRUE;
        }
        u12 = kotlin.text.v.u(str, "false", true);
        if (u12) {
            return Boolean.FALSE;
        }
        return null;
    }

    private static final char e(int i11) {
        int i12 = i11 & 15;
        return (char) (i12 < 10 ? i12 + 48 : (i12 - 10) + 97);
    }
}