package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class p0 {
    private final Map<String, Object> mBagOfTags = new HashMap();
    private volatile boolean mCleared = false;

    private static void closeWithRuntimeException(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e11) {
                throw new RuntimeException(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void clear() {
        this.mCleared = true;
        Map<String, Object> map = this.mBagOfTags;
        if (map != null) {
            synchronized (map) {
                for (Object obj : this.mBagOfTags.values()) {
                    closeWithRuntimeException(obj);
                }
            }
        }
        onCleared();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <T> T getTag(String str) {
        T t11;
        Map<String, Object> map = this.mBagOfTags;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            t11 = (T) this.mBagOfTags.get(str);
        }
        return t11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onCleared() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <T> T setTagIfAbsent(String str, T t11) {
        Object obj;
        synchronized (this.mBagOfTags) {
            obj = this.mBagOfTags.get(str);
            if (obj == null) {
                this.mBagOfTags.put(str, t11);
            }
        }
        if (obj != null) {
            t11 = obj;
        }
        if (this.mCleared) {
            closeWithRuntimeException(t11);
        }
        return t11;
    }
}