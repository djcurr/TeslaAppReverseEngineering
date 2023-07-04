package n4;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.core.os.OperationCanceledException;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;
import n4.c;

/* loaded from: classes.dex */
public class b extends a<Cursor> {

    /* renamed from: p  reason: collision with root package name */
    final c<Cursor>.a f40457p;

    /* renamed from: q  reason: collision with root package name */
    Uri f40458q;

    /* renamed from: r  reason: collision with root package name */
    String[] f40459r;

    /* renamed from: s  reason: collision with root package name */
    String f40460s;

    /* renamed from: t  reason: collision with root package name */
    String[] f40461t;

    /* renamed from: u  reason: collision with root package name */
    String f40462u;

    /* renamed from: v  reason: collision with root package name */
    Cursor f40463v;

    /* renamed from: w  reason: collision with root package name */
    r3.c f40464w;

    public b(Context context, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        super(context);
        this.f40457p = new c.a();
        this.f40458q = uri;
        this.f40459r = strArr;
        this.f40460s = str;
        this.f40461t = strArr2;
        this.f40462u = str2;
    }

    @Override // n4.c
    /* renamed from: H */
    public void f(Cursor cursor) {
        if (k()) {
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        Cursor cursor2 = this.f40463v;
        this.f40463v = cursor;
        if (l()) {
            super.f(cursor);
        }
        if (cursor2 == null || cursor2 == cursor || cursor2.isClosed()) {
            return;
        }
        cursor2.close();
    }

    @Override // n4.a
    /* renamed from: I */
    public Cursor E() {
        synchronized (this) {
            if (!D()) {
                this.f40464w = new r3.c();
            } else {
                throw new OperationCanceledException();
            }
        }
        try {
            Cursor a11 = androidx.core.content.a.a(i().getContentResolver(), this.f40458q, this.f40459r, this.f40460s, this.f40461t, this.f40462u, this.f40464w);
            if (a11 != null) {
                try {
                    a11.getCount();
                    a11.registerContentObserver(this.f40457p);
                } catch (RuntimeException e11) {
                    a11.close();
                    throw e11;
                }
            }
            synchronized (this) {
                this.f40464w = null;
            }
            return a11;
        } catch (Throwable th2) {
            synchronized (this) {
                this.f40464w = null;
                throw th2;
            }
        }
    }

    @Override // n4.a
    /* renamed from: J */
    public void F(Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }

    @Override // n4.a, n4.c
    @Deprecated
    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.g(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("mUri=");
        printWriter.println(this.f40458q);
        printWriter.print(str);
        printWriter.print("mProjection=");
        printWriter.println(Arrays.toString(this.f40459r));
        printWriter.print(str);
        printWriter.print("mSelection=");
        printWriter.println(this.f40460s);
        printWriter.print(str);
        printWriter.print("mSelectionArgs=");
        printWriter.println(Arrays.toString(this.f40461t));
        printWriter.print(str);
        printWriter.print("mSortOrder=");
        printWriter.println(this.f40462u);
        printWriter.print(str);
        printWriter.print("mCursor=");
        printWriter.println(this.f40463v);
        printWriter.print(str);
        printWriter.print("mContentChanged=");
        printWriter.println(this.f40472h);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // n4.c
    public void q() {
        super.q();
        s();
        Cursor cursor = this.f40463v;
        if (cursor != null && !cursor.isClosed()) {
            this.f40463v.close();
        }
        this.f40463v = null;
    }

    @Override // n4.c
    protected void r() {
        Cursor cursor = this.f40463v;
        if (cursor != null) {
            f(cursor);
        }
        if (x() || this.f40463v == null) {
            h();
        }
    }

    @Override // n4.c
    protected void s() {
        b();
    }

    @Override // n4.a
    public void z() {
        super.z();
        synchronized (this) {
            r3.c cVar = this.f40464w;
            if (cVar != null) {
                cVar.a();
            }
        }
    }
}