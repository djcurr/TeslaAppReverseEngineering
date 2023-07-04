package ph;

import android.content.Context;
import java.io.Closeable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class u implements Closeable {

    /* loaded from: classes3.dex */
    interface a {
        a a(Context context);

        u build();
    }

    abstract yh.d a();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a().close();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract t g();
}