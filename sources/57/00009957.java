package org.spongycastle.asn1.x500.style;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes5.dex */
public class X500NameTokenizer {
    private StringBuffer buf;
    private int index;
    private char separator;
    private String value;

    public X500NameTokenizer(String str) {
        this(str, CoreConstants.COMMA_CHAR);
    }

    public boolean hasMoreTokens() {
        return this.index != this.value.length();
    }

    public String nextToken() {
        if (this.index == this.value.length()) {
            return null;
        }
        int i11 = this.index + 1;
        this.buf.setLength(0);
        boolean z11 = false;
        boolean z12 = false;
        while (i11 != this.value.length()) {
            char charAt = this.value.charAt(i11);
            if (charAt == '\"') {
                if (!z11) {
                    z12 = !z12;
                }
                this.buf.append(charAt);
            } else if (z11 || z12) {
                this.buf.append(charAt);
            } else {
                if (charAt == '\\') {
                    this.buf.append(charAt);
                    z11 = true;
                } else if (charAt == this.separator) {
                    break;
                } else {
                    this.buf.append(charAt);
                }
                i11++;
            }
            z11 = false;
            i11++;
        }
        this.index = i11;
        return this.buf.toString();
    }

    public X500NameTokenizer(String str, char c11) {
        this.buf = new StringBuffer();
        this.value = str;
        this.index = -1;
        this.separator = c11;
    }
}