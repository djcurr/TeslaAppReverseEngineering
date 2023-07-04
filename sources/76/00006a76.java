package expo.modules.kotlin.callbacks;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u0001H\u0086\b¨\u0006\u0004"}, d2 = {"T", "Landroid/view/View;", "Lexpo/modules/kotlin/callbacks/ViewCallbackDelegate;", "callback", "expo-modules-core_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class ViewCallbackDelegateKt {
    public static final /* synthetic */ <T> ViewCallbackDelegate<T> callback(View view) {
        s.g(view, "<this>");
        s.m(6, "T");
        return new ViewCallbackDelegate<>(null, view);
    }
}