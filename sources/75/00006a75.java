package expo.modules.kotlin.callbacks;

import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import n00.m;
import n00.p;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0003¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0086\u0002R$\u0010\u000b\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\u00030\u00030\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\"\u0010\u000e\u001a\u00020\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, d2 = {"Lexpo/modules/kotlin/callbacks/ViewCallbackDelegate;", "T", "", "Landroid/view/View;", "thisRef", "Ln00/m;", "property", "Lexpo/modules/kotlin/callbacks/Callback;", "getValue", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "viewHolder", "Ljava/lang/ref/WeakReference;", "", "isValidated", "Z", "isValidated$expo_modules_core_release", "()Z", "setValidated$expo_modules_core_release", "(Z)V", "Ln00/p;", "type", "view", "<init>", "(Ln00/p;Landroid/view/View;)V", "expo-modules-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class ViewCallbackDelegate<T> {
    private boolean isValidated;
    private final p type;
    private final WeakReference<View> viewHolder;

    public ViewCallbackDelegate(p type, View view) {
        s.g(type, "type");
        s.g(view, "view");
        this.type = type;
        this.viewHolder = new WeakReference<>(view);
    }

    public final Callback<T> getValue(View thisRef, m<?> property) {
        s.g(thisRef, "thisRef");
        s.g(property, "property");
        if (this.isValidated) {
            View view = this.viewHolder.get();
            if (view != null) {
                return new ViewCallback(property.getName(), this.type, view);
            }
            throw new IllegalStateException("Can't send an event from the view that is deallocated.");
        }
        throw new IllegalStateException("You have to export this property as a callback in the `ViewManager`.");
    }

    public final boolean isValidated$expo_modules_core_release() {
        return this.isValidated;
    }

    public final void setValidated$expo_modules_core_release(boolean z11) {
        this.isValidated = z11;
    }
}