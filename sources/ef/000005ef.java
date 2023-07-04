package androidx.core.app;

import android.app.RemoteInput;

/* loaded from: classes.dex */
public final class o {
    static RemoteInput a(o oVar) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static RemoteInput[] b(o[] oVarArr) {
        if (oVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[oVarArr.length];
        for (int i11 = 0; i11 < oVarArr.length; i11++) {
            remoteInputArr[i11] = a(oVarArr[i11]);
        }
        return remoteInputArr;
    }
}