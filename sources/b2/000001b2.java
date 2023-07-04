package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public abstract class e {
    private CopyOnWriteArrayList<a> mCancellables = new CopyOnWriteArrayList<>();
    private boolean mEnabled;

    public e(boolean z11) {
        this.mEnabled = z11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addCancellable(a aVar) {
        this.mCancellables.add(aVar);
    }

    public abstract void handleOnBackPressed();

    public final boolean isEnabled() {
        return this.mEnabled;
    }

    public final void remove() {
        Iterator<a> it2 = this.mCancellables.iterator();
        while (it2.hasNext()) {
            it2.next().cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void removeCancellable(a aVar) {
        this.mCancellables.remove(aVar);
    }

    public final void setEnabled(boolean z11) {
        this.mEnabled = z11;
    }
}