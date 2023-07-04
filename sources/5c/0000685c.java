package expo.modules.adapters.react.apploader;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\t\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006R%\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000b0\n8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lexpo/modules/adapters/react/apploader/HeadlessAppLoaderNotifier;", "", "Lexpo/modules/adapters/react/apploader/HeadlessAppLoaderListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lvz/b0;", "registerListener", "", "appScopeKey", "notifyAppLoaded", "notifyAppDestroyed", "", "Ljava/lang/ref/WeakReference;", "listeners", "Ljava/util/Set;", "getListeners", "()Ljava/util/Set;", "<init>", "()V", "expo-modules-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class HeadlessAppLoaderNotifier {
    public static final HeadlessAppLoaderNotifier INSTANCE = new HeadlessAppLoaderNotifier();
    private static final Set<WeakReference<HeadlessAppLoaderListener>> listeners = new LinkedHashSet();

    private HeadlessAppLoaderNotifier() {
    }

    public final Set<WeakReference<HeadlessAppLoaderListener>> getListeners() {
        return listeners;
    }

    public final void notifyAppDestroyed(String str) {
        if (str != null) {
            Iterator<T> it2 = listeners.iterator();
            while (it2.hasNext()) {
                HeadlessAppLoaderListener headlessAppLoaderListener = (HeadlessAppLoaderListener) ((WeakReference) it2.next()).get();
                if (headlessAppLoaderListener != null) {
                    headlessAppLoaderListener.appDestroyed(str);
                }
            }
        }
    }

    public final void notifyAppLoaded(String str) {
        if (str != null) {
            Iterator<T> it2 = listeners.iterator();
            while (it2.hasNext()) {
                HeadlessAppLoaderListener headlessAppLoaderListener = (HeadlessAppLoaderListener) ((WeakReference) it2.next()).get();
                if (headlessAppLoaderListener != null) {
                    headlessAppLoaderListener.appLoaded(str);
                }
            }
        }
    }

    public final void registerListener(HeadlessAppLoaderListener listener) {
        s.g(listener, "listener");
        listeners.add(new WeakReference<>(listener));
    }
}