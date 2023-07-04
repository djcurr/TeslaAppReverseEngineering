package z8;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public String f60380a;

    /* renamed from: b  reason: collision with root package name */
    public int f60381b;

    /* renamed from: c  reason: collision with root package name */
    public long f60382c = System.currentTimeMillis() + CoreConstants.MILLIS_IN_ONE_DAY;

    public d(String str, int i11) {
        this.f60380a = str;
        this.f60381b = i11;
    }

    public String toString() {
        return "ValueData{value='" + this.f60380a + CoreConstants.SINGLE_QUOTE_CHAR + ", code=" + this.f60381b + ", expired=" + this.f60382c + CoreConstants.CURLY_RIGHT;
    }
}