package c4;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.provider.DocumentsContract;

/* loaded from: classes.dex */
public abstract class a {
    /* JADX INFO: Access modifiers changed from: package-private */
    public a(a aVar) {
    }

    public static a g(Context context, Uri uri) {
        if (Build.VERSION.SDK_INT >= 19) {
            return new c(null, context, uri);
        }
        return null;
    }

    public static a h(Context context, Uri uri) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new d(null, context, DocumentsContract.buildDocumentUriUsingTree(uri, DocumentsContract.getTreeDocumentId(uri)));
        }
        return null;
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract a c(String str);

    public abstract a d(String str, String str2);

    public abstract boolean e();

    public abstract boolean f();

    public abstract String i();

    public abstract Uri j();

    public abstract boolean k();

    public abstract boolean l();

    public abstract a[] m();
}