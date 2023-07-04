package expo.modules.core.interfaces.services;

/* loaded from: classes5.dex */
public interface KeepAwakeManager {
    void activate(String str, Runnable runnable);

    void deactivate(String str, Runnable runnable);

    boolean isActivated();
}