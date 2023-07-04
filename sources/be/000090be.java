package org.aspectj.lang;

/* loaded from: classes5.dex */
public class NoAspectBoundException extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    Throwable f43007a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public NoAspectBoundException(java.lang.String r3, java.lang.Throwable r4) {
        /*
            r2 = this;
            if (r4 != 0) goto L3
            goto L1c
        L3:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Exception while initializing "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = ": "
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = r0.toString()
        L1c:
            r2.<init>(r3)
            r2.f43007a = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.aspectj.lang.NoAspectBoundException.<init>(java.lang.String, java.lang.Throwable):void");
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f43007a;
    }

    public NoAspectBoundException() {
    }
}