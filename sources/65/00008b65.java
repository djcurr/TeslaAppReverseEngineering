package net.time4j.format.expert;

import ch.qos.logback.core.CoreConstants;
import java.text.ParsePosition;

/* loaded from: classes5.dex */
public class s {

    /* renamed from: a  reason: collision with root package name */
    private ParsePosition f41223a;

    /* renamed from: b  reason: collision with root package name */
    private String f41224b;

    /* renamed from: c  reason: collision with root package name */
    private net.time4j.engine.q<?> f41225c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f41226d;

    public s() {
        this(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        this.f41223a.setErrorIndex(-1);
        this.f41224b = "";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        this.f41226d = false;
    }

    public int c() {
        return this.f41223a.getErrorIndex();
    }

    public String d() {
        return this.f41224b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ParsePosition e() {
        return this.f41223a;
    }

    public int f() {
        return this.f41223a.getIndex();
    }

    public net.time4j.engine.q<?> g() {
        if (this.f41225c == null) {
            this.f41225c = new v(0, false);
        }
        return this.f41225c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public net.time4j.engine.q<?> h() {
        return this.f41225c;
    }

    public boolean i() {
        return this.f41223a.getErrorIndex() != -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean j() {
        return this.f41226d;
    }

    public void k(int i11, String str) {
        if (i11 >= 0) {
            if (str == null || str.isEmpty()) {
                str = "Error occurred at position: " + i11;
            }
            this.f41224b = str;
            this.f41223a.setErrorIndex(i11);
            return;
        }
        throw new IllegalArgumentException("Undefined error index: " + i11);
    }

    public void l(int i11) {
        if (i11 >= 0) {
            this.f41223a.setIndex(i11);
            return;
        }
        throw new IllegalArgumentException("Undefined position: " + i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(net.time4j.engine.q<?> qVar) {
        this.f41225c = qVar;
    }

    public void n() {
        if (!i()) {
            this.f41224b = "Warning state active.";
            this.f41223a.setErrorIndex(f());
        }
        this.f41226d = true;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("[position=");
        sb2.append(f());
        sb2.append(", error-index=");
        sb2.append(c());
        sb2.append(", error-message=\"");
        sb2.append(this.f41224b);
        sb2.append(CoreConstants.DOUBLE_QUOTE_CHAR);
        if (this.f41226d) {
            sb2.append(", warning-active");
        }
        if (this.f41225c != null) {
            sb2.append(", raw-values=");
            sb2.append(this.f41225c);
        }
        sb2.append(']');
        return sb2.toString();
    }

    public s(int i11) {
        if (i11 >= 0) {
            this.f41223a = new ParsePosition(i11);
            this.f41224b = "";
            this.f41225c = null;
            this.f41226d = false;
            return;
        }
        throw new IllegalArgumentException("Undefined: " + i11);
    }
}