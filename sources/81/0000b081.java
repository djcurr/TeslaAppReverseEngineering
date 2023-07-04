package retrofit2;

import okhttp3.Request;
import okio.f0;

/* loaded from: classes4.dex */
public interface b<T> extends Cloneable {
    void cancel();

    /* renamed from: clone */
    b<T> mo117clone();

    void enqueue(d<T> dVar);

    s<T> execute();

    boolean isCanceled();

    boolean isExecuted();

    Request request();

    f0 timeout();
}