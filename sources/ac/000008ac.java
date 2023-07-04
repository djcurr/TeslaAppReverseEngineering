package androidx.room;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class z0 {
    private final t0 mDatabase;
    private final AtomicBoolean mLock = new AtomicBoolean(false);
    private volatile v4.k mStmt;

    public z0(t0 t0Var) {
        this.mDatabase = t0Var;
    }

    private v4.k createNewStatement() {
        return this.mDatabase.compileStatement(createQuery());
    }

    private v4.k getStmt(boolean z11) {
        if (z11) {
            if (this.mStmt == null) {
                this.mStmt = createNewStatement();
            }
            return this.mStmt;
        }
        return createNewStatement();
    }

    public v4.k acquire() {
        assertNotMainThread();
        return getStmt(this.mLock.compareAndSet(false, true));
    }

    protected void assertNotMainThread() {
        this.mDatabase.assertNotMainThread();
    }

    protected abstract String createQuery();

    public void release(v4.k kVar) {
        if (kVar == this.mStmt) {
            this.mLock.set(false);
        }
    }
}