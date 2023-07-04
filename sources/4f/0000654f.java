package d50;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes5.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private String f23739a;

    /* renamed from: b  reason: collision with root package name */
    private int f23740b;

    /* renamed from: c  reason: collision with root package name */
    private char f23741c;

    /* renamed from: d  reason: collision with root package name */
    private StringBuffer f23742d;

    public f(String str) {
        this(str, CoreConstants.COMMA_CHAR);
    }

    public f(String str, char c11) {
        this.f23742d = new StringBuffer();
        this.f23739a = str;
        this.f23740b = -1;
        this.f23741c = c11;
    }

    public boolean a() {
        return this.f23740b != this.f23739a.length();
    }

    public String b() {
        if (this.f23740b == this.f23739a.length()) {
            return null;
        }
        int i11 = this.f23740b + 1;
        this.f23742d.setLength(0);
        boolean z11 = false;
        boolean z12 = false;
        while (i11 != this.f23739a.length()) {
            char charAt = this.f23739a.charAt(i11);
            if (charAt == '\"') {
                if (!z11) {
                    z12 = !z12;
                }
            } else if (!z11 && !z12) {
                if (charAt == '\\') {
                    this.f23742d.append(charAt);
                    z11 = true;
                } else if (charAt == this.f23741c) {
                    break;
                } else {
                    this.f23742d.append(charAt);
                }
                i11++;
            }
            this.f23742d.append(charAt);
            z11 = false;
            i11++;
        }
        this.f23740b = i11;
        return this.f23742d.toString();
    }
}