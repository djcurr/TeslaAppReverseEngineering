package w4;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.os.CancellationSignal;
import android.util.Pair;
import java.util.List;
import v4.g;
import v4.j;
import v4.k;

/* loaded from: classes.dex */
class a implements g {

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f55476b = new String[0];

    /* renamed from: a  reason: collision with root package name */
    private final SQLiteDatabase f55477a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w4.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C1265a implements SQLiteDatabase.CursorFactory {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f55478a;

        C1265a(a aVar, j jVar) {
            this.f55478a = jVar;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f55478a.g(new d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    /* loaded from: classes.dex */
    class b implements SQLiteDatabase.CursorFactory {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f55479a;

        b(a aVar, j jVar) {
            this.f55479a = jVar;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f55479a.g(new d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(SQLiteDatabase sQLiteDatabase) {
        this.f55477a = sQLiteDatabase;
    }

    @Override // v4.g
    public boolean B1() {
        return v4.b.d(this.f55477a);
    }

    @Override // v4.g
    public k H0(String str) {
        return new e(this.f55477a.compileStatement(str));
    }

    @Override // v4.g
    public void N() {
        this.f55477a.setTransactionSuccessful();
    }

    @Override // v4.g
    public void P(String str, Object[] objArr) {
        this.f55477a.execSQL(str, objArr);
    }

    @Override // v4.g
    public void Q() {
        this.f55477a.beginTransactionNonExclusive();
    }

    @Override // v4.g
    public void X() {
        this.f55477a.endTransaction();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(SQLiteDatabase sQLiteDatabase) {
        return this.f55477a == sQLiteDatabase;
    }

    @Override // v4.g
    public Cursor a1(String str) {
        return d0(new v4.a(str));
    }

    @Override // v4.g
    public void beginTransaction() {
        this.f55477a.beginTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f55477a.close();
    }

    @Override // v4.g
    public Cursor d0(j jVar) {
        return this.f55477a.rawQueryWithFactory(new C1265a(this, jVar), jVar.a(), f55476b, null);
    }

    @Override // v4.g
    public Cursor e1(j jVar, CancellationSignal cancellationSignal) {
        return v4.b.e(this.f55477a, jVar.a(), f55476b, null, cancellationSignal, new b(this, jVar));
    }

    @Override // v4.g
    public String getPath() {
        return this.f55477a.getPath();
    }

    @Override // v4.g
    public boolean isOpen() {
        return this.f55477a.isOpen();
    }

    @Override // v4.g
    public List<Pair<String, String>> s() {
        return this.f55477a.getAttachedDbs();
    }

    @Override // v4.g
    public boolean s1() {
        return this.f55477a.inTransaction();
    }

    @Override // v4.g
    public void u(String str) {
        this.f55477a.execSQL(str);
    }
}