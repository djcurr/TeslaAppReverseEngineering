package org.spongycastle.i18n.filter;

/* loaded from: classes4.dex */
public class SQLFilter implements Filter {
    @Override // org.spongycastle.i18n.filter.Filter
    public String doFilter(String str) {
        int i11;
        StringBuffer stringBuffer = new StringBuffer(str);
        int i12 = 0;
        while (i12 < stringBuffer.length()) {
            char charAt = stringBuffer.charAt(i12);
            if (charAt == '\n') {
                i11 = i12 + 1;
                stringBuffer.replace(i12, i11, "\\n");
            } else if (charAt == '\r') {
                i11 = i12 + 1;
                stringBuffer.replace(i12, i11, "\\r");
            } else if (charAt == '\"') {
                i11 = i12 + 1;
                stringBuffer.replace(i12, i11, "\\\"");
            } else if (charAt == '\'') {
                i11 = i12 + 1;
                stringBuffer.replace(i12, i11, "\\'");
            } else if (charAt == '-') {
                i11 = i12 + 1;
                stringBuffer.replace(i12, i11, "\\-");
            } else if (charAt == '/') {
                i11 = i12 + 1;
                stringBuffer.replace(i12, i11, "\\/");
            } else if (charAt == ';') {
                i11 = i12 + 1;
                stringBuffer.replace(i12, i11, "\\;");
            } else if (charAt == '=') {
                i11 = i12 + 1;
                stringBuffer.replace(i12, i11, "\\=");
            } else if (charAt != '\\') {
                i12++;
            } else {
                i11 = i12 + 1;
                stringBuffer.replace(i12, i11, "\\\\");
            }
            i12 = i11;
            i12++;
        }
        return stringBuffer.toString();
    }

    @Override // org.spongycastle.i18n.filter.Filter
    public String doFilterUrl(String str) {
        return doFilter(str);
    }
}