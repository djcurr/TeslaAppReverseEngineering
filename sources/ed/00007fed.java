package kotlinx.coroutines.internal;

import java.util.List;
import v20.l2;

/* loaded from: classes5.dex */
public interface MainDispatcherFactory {
    l2 createDispatcher(List<? extends MainDispatcherFactory> list);

    int getLoadPriority();

    String hintOnError();
}