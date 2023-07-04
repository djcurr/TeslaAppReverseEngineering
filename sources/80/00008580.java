package m0;

import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public interface z {

    /* renamed from: a  reason: collision with root package name */
    public static final a f38136a = a.f38137a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f38137a = new a();

        private a() {
        }

        public final z a() {
            if (t.b(0, 1, null)) {
                return Build.VERSION.SDK_INT == 28 ? a0.f37828b : b0.f37833b;
            }
            throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
        }
    }

    boolean a();

    y b(u uVar, View view, x2.d dVar, float f11);
}