package androidx.fragment.app;

import android.os.Build;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class a0 {

    /* renamed from: a  reason: collision with root package name */
    static final c0 f4774a;

    /* renamed from: b  reason: collision with root package name */
    static final c0 f4775b;

    static {
        f4774a = Build.VERSION.SDK_INT >= 21 ? new b0() : null;
        f4775b = b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Fragment fragment, Fragment fragment2, boolean z11, androidx.collection.a<String, View> aVar, boolean z12) {
        if (z11) {
            fragment2.getEnterTransitionCallback();
        } else {
            fragment.getEnterTransitionCallback();
        }
    }

    private static c0 b() {
        try {
            return (c0) androidx.transition.h.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(androidx.collection.a<String, String> aVar, androidx.collection.a<String, View> aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            if (!aVar2.containsKey(aVar.o(size))) {
                aVar.m(size);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(ArrayList<View> arrayList, int i11) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i11);
        }
    }
}