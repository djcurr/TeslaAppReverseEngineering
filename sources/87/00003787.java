package com.google.common.collect;

/* loaded from: classes3.dex */
final class h {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Object obj, Object obj2) {
        if (obj == null) {
            String valueOf = String.valueOf(obj2);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 24);
            sb2.append("null key in entry: null=");
            sb2.append(valueOf);
            throw new NullPointerException(sb2.toString());
        } else if (obj2 != null) {
        } else {
            String valueOf2 = String.valueOf(obj);
            StringBuilder sb3 = new StringBuilder(valueOf2.length() + 26);
            sb3.append("null value in entry: ");
            sb3.append(valueOf2);
            sb3.append("=null");
            throw new NullPointerException(sb3.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(int i11, String str) {
        if (i11 >= 0) {
            return i11;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 40);
        sb2.append(str);
        sb2.append(" cannot be negative but was: ");
        sb2.append(i11);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(boolean z11) {
        com.google.common.base.u.v(z11, "no calls to next() since the last call to remove()");
    }
}