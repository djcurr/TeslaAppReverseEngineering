package c4;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.util.Log;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class d extends a {

    /* renamed from: a  reason: collision with root package name */
    private Context f8874a;

    /* renamed from: b  reason: collision with root package name */
    private Uri f8875b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(a aVar, Context context, Uri uri) {
        super(aVar);
        this.f8874a = context;
        this.f8875b = uri;
    }

    private static void n(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (RuntimeException e11) {
                throw e11;
            } catch (Exception unused) {
            }
        }
    }

    private static Uri o(Context context, Uri uri, String str, String str2) {
        try {
            return DocumentsContract.createDocument(context.getContentResolver(), uri, str, str2);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // c4.a
    public boolean a() {
        return b.a(this.f8874a, this.f8875b);
    }

    @Override // c4.a
    public boolean b() {
        return b.b(this.f8874a, this.f8875b);
    }

    @Override // c4.a
    public a c(String str) {
        Uri o11 = o(this.f8874a, this.f8875b, "vnd.android.document/directory", str);
        if (o11 != null) {
            return new d(this, this.f8874a, o11);
        }
        return null;
    }

    @Override // c4.a
    public a d(String str, String str2) {
        Uri o11 = o(this.f8874a, this.f8875b, str, str2);
        if (o11 != null) {
            return new d(this, this.f8874a, o11);
        }
        return null;
    }

    @Override // c4.a
    public boolean e() {
        try {
            return DocumentsContract.deleteDocument(this.f8874a.getContentResolver(), this.f8875b);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // c4.a
    public boolean f() {
        return b.d(this.f8874a, this.f8875b);
    }

    @Override // c4.a
    public String i() {
        return b.e(this.f8874a, this.f8875b);
    }

    @Override // c4.a
    public Uri j() {
        return this.f8875b;
    }

    @Override // c4.a
    public boolean k() {
        return b.g(this.f8874a, this.f8875b);
    }

    @Override // c4.a
    public boolean l() {
        return b.h(this.f8874a, this.f8875b);
    }

    @Override // c4.a
    public a[] m() {
        ContentResolver contentResolver = this.f8874a.getContentResolver();
        Uri uri = this.f8875b;
        Uri buildChildDocumentsUriUsingTree = DocumentsContract.buildChildDocumentsUriUsingTree(uri, DocumentsContract.getDocumentId(uri));
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                cursor = contentResolver.query(buildChildDocumentsUriUsingTree, new String[]{"document_id"}, null, null, null);
                while (cursor.moveToNext()) {
                    arrayList.add(DocumentsContract.buildDocumentUriUsingTree(this.f8875b, cursor.getString(0)));
                }
            } catch (Exception e11) {
                Log.w("DocumentFile", "Failed query: " + e11);
            }
            Uri[] uriArr = (Uri[]) arrayList.toArray(new Uri[arrayList.size()]);
            a[] aVarArr = new a[uriArr.length];
            for (int i11 = 0; i11 < uriArr.length; i11++) {
                aVarArr[i11] = new d(this, this.f8874a, uriArr[i11]);
            }
            return aVarArr;
        } finally {
            n(cursor);
        }
    }
}