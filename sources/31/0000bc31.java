package w4;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import java.io.File;
import v4.g;
import v4.h;

/* loaded from: classes.dex */
class b implements h {

    /* renamed from: a  reason: collision with root package name */
    private final Context f55480a;

    /* renamed from: b  reason: collision with root package name */
    private final String f55481b;

    /* renamed from: c  reason: collision with root package name */
    private final h.a f55482c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f55483d;

    /* renamed from: e  reason: collision with root package name */
    private final Object f55484e = new Object();

    /* renamed from: f  reason: collision with root package name */
    private a f55485f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f55486g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a extends SQLiteOpenHelper {

        /* renamed from: a  reason: collision with root package name */
        final w4.a[] f55487a;

        /* renamed from: b  reason: collision with root package name */
        final h.a f55488b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f55489c;

        /* renamed from: w4.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C1266a implements DatabaseErrorHandler {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h.a f55490a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ w4.a[] f55491b;

            C1266a(h.a aVar, w4.a[] aVarArr) {
                this.f55490a = aVar;
                this.f55491b = aVarArr;
            }

            @Override // android.database.DatabaseErrorHandler
            public void onCorruption(SQLiteDatabase sQLiteDatabase) {
                this.f55490a.c(a.g(this.f55491b, sQLiteDatabase));
            }
        }

        a(Context context, String str, w4.a[] aVarArr, h.a aVar) {
            super(context, str, null, aVar.f54035a, new C1266a(aVar, aVarArr));
            this.f55488b = aVar;
            this.f55487a = aVarArr;
        }

        static w4.a g(w4.a[] aVarArr, SQLiteDatabase sQLiteDatabase) {
            w4.a aVar = aVarArr[0];
            if (aVar == null || !aVar.a(sQLiteDatabase)) {
                aVarArr[0] = new w4.a(sQLiteDatabase);
            }
            return aVarArr[0];
        }

        w4.a a(SQLiteDatabase sQLiteDatabase) {
            return g(this.f55487a, sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public synchronized void close() {
            super.close();
            this.f55487a[0] = null;
        }

        synchronized g j() {
            this.f55489c = false;
            SQLiteDatabase writableDatabase = super.getWritableDatabase();
            if (this.f55489c) {
                close();
                return j();
            }
            return a(writableDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            this.f55488b.b(a(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            this.f55488b.d(a(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
            this.f55489c = true;
            this.f55488b.e(a(sQLiteDatabase), i11, i12);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (this.f55489c) {
                return;
            }
            this.f55488b.f(a(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
            this.f55489c = true;
            this.f55488b.g(a(sQLiteDatabase), i11, i12);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Context context, String str, h.a aVar, boolean z11) {
        this.f55480a = context;
        this.f55481b = str;
        this.f55482c = aVar;
        this.f55483d = z11;
    }

    private a a() {
        a aVar;
        synchronized (this.f55484e) {
            if (this.f55485f == null) {
                w4.a[] aVarArr = new w4.a[1];
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 23 && this.f55481b != null && this.f55483d) {
                    this.f55485f = new a(this.f55480a, new File(v4.d.a(this.f55480a), this.f55481b).getAbsolutePath(), aVarArr, this.f55482c);
                } else {
                    this.f55485f = new a(this.f55480a, this.f55481b, aVarArr, this.f55482c);
                }
                if (i11 >= 16) {
                    v4.b.f(this.f55485f, this.f55486g);
                }
            }
            aVar = this.f55485f;
        }
        return aVar;
    }

    @Override // v4.h
    public g W0() {
        return a().j();
    }

    @Override // v4.h, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a().close();
    }

    @Override // v4.h
    public String getDatabaseName() {
        return this.f55481b;
    }

    @Override // v4.h
    public void setWriteAheadLoggingEnabled(boolean z11) {
        synchronized (this.f55484e) {
            a aVar = this.f55485f;
            if (aVar != null) {
                v4.b.f(aVar, z11);
            }
            this.f55486g = z11;
        }
    }
}