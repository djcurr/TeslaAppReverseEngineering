package freemarker.core;

/* loaded from: classes5.dex */
public class BugException extends RuntimeException {
    public BugException() {
        this((Throwable) null);
    }

    public BugException(String str) {
        this(str, null);
    }

    public BugException(Throwable th2) {
        super("A bug was detected in FreeMarker; please report it with stack-trace", th2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public BugException(java.lang.String r3, java.lang.Throwable r4) {
        /*
            r2 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r1 = "A bug was detected in FreeMarker; please report it with stack-trace: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: freemarker.core.BugException.<init>(java.lang.String, java.lang.Throwable):void");
    }
}