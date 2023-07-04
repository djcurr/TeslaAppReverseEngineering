package org.spongycastle.i18n.filter;

/* loaded from: classes4.dex */
public class HTMLFilter implements Filter {
    @Override // org.spongycastle.i18n.filter.Filter
    public String doFilter(String str) {
        StringBuffer stringBuffer = new StringBuffer(str);
        int i11 = 0;
        while (i11 < stringBuffer.length()) {
            char charAt = stringBuffer.charAt(i11);
            if (charAt == '\"') {
                stringBuffer.replace(i11, i11 + 1, "&#34");
            } else if (charAt == '#') {
                stringBuffer.replace(i11, i11 + 1, "&#35");
            } else if (charAt == '+') {
                stringBuffer.replace(i11, i11 + 1, "&#43");
            } else if (charAt == '-') {
                stringBuffer.replace(i11, i11 + 1, "&#45");
            } else if (charAt == '>') {
                stringBuffer.replace(i11, i11 + 1, "&#62");
            } else if (charAt == ';') {
                stringBuffer.replace(i11, i11 + 1, "&#59");
            } else if (charAt != '<') {
                switch (charAt) {
                    case '%':
                        stringBuffer.replace(i11, i11 + 1, "&#37");
                        continue;
                    case '&':
                        stringBuffer.replace(i11, i11 + 1, "&#38");
                        continue;
                    case '\'':
                        stringBuffer.replace(i11, i11 + 1, "&#39");
                        continue;
                    case '(':
                        stringBuffer.replace(i11, i11 + 1, "&#40");
                        continue;
                    case ')':
                        stringBuffer.replace(i11, i11 + 1, "&#41");
                        continue;
                    default:
                        i11 -= 3;
                        continue;
                }
            } else {
                stringBuffer.replace(i11, i11 + 1, "&#60");
            }
            i11 += 4;
        }
        return stringBuffer.toString();
    }

    @Override // org.spongycastle.i18n.filter.Filter
    public String doFilterUrl(String str) {
        return doFilter(str);
    }
}