package androidx.core.content;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;

/* loaded from: classes.dex */
public final class a {
    public static Cursor a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, r3.c cVar) {
        Object b11;
        if (Build.VERSION.SDK_INT >= 16) {
            if (cVar != null) {
                try {
                    b11 = cVar.b();
                } catch (Exception e11) {
                    if (e11 instanceof OperationCanceledException) {
                        throw new androidx.core.os.OperationCanceledException();
                    }
                    throw e11;
                }
            } else {
                b11 = null;
            }
            return contentResolver.query(uri, strArr, str, strArr2, str2, (CancellationSignal) b11);
        }
        if (cVar != null) {
            cVar.e();
        }
        return contentResolver.query(uri, strArr, str, strArr2, str2);
    }
}