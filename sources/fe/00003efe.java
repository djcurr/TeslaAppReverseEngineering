package com.nimbusds.jose;

/* loaded from: classes2.dex */
public class KeyLengthException extends KeyException {
    public KeyLengthException(String str) {
        super(str);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public KeyLengthException(int r4, zp.a r5) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            if (r4 <= 0) goto L1e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "The expected key length is "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " bits"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            goto L20
        L1e:
            java.lang.String r4 = "Unexpected key length"
        L20:
            r0.append(r4)
            if (r5 == 0) goto L3c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r1 = " (for "
            r4.append(r1)
            r4.append(r5)
            java.lang.String r5 = " algorithm)"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            goto L3e
        L3c:
            java.lang.String r4 = ""
        L3e:
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nimbusds.jose.KeyLengthException.<init>(int, zp.a):void");
    }
}