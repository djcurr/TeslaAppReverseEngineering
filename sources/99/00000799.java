package androidx.loader.app;

import androidx.lifecycle.u0;
import androidx.lifecycle.v;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public abstract class a {
    public static <T extends v & u0> a b(T t11) {
        return new b(t11, t11.getViewModelStore());
    }

    @Deprecated
    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract void c();
}