package w4;

import android.database.sqlite.SQLiteProgram;
import v4.i;

/* loaded from: classes.dex */
class d implements i {

    /* renamed from: a  reason: collision with root package name */
    private final SQLiteProgram f55492a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(SQLiteProgram sQLiteProgram) {
        this.f55492a = sQLiteProgram;
    }

    @Override // v4.i
    public void A(int i11, double d11) {
        this.f55492a.bindDouble(i11, d11);
    }

    @Override // v4.i
    public void A0(int i11, String str) {
        this.f55492a.bindString(i11, str);
    }

    @Override // v4.i
    public void U0(int i11, long j11) {
        this.f55492a.bindLong(i11, j11);
    }

    @Override // v4.i
    public void V0(int i11, byte[] bArr) {
        this.f55492a.bindBlob(i11, bArr);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f55492a.close();
    }

    @Override // v4.i
    public void o1(int i11) {
        this.f55492a.bindNull(i11);
    }
}