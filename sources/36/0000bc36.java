package w4;

import android.database.sqlite.SQLiteStatement;
import v4.k;

/* loaded from: classes.dex */
class e extends d implements k {

    /* renamed from: b  reason: collision with root package name */
    private final SQLiteStatement f55493b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f55493b = sQLiteStatement;
    }

    @Override // v4.k
    public long s0() {
        return this.f55493b.executeInsert();
    }

    @Override // v4.k
    public int w() {
        return this.f55493b.executeUpdateDelete();
    }
}