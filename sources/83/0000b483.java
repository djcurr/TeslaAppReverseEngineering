package t5;

import android.graphics.Bitmap;
import android.os.Build;

/* loaded from: classes.dex */
public interface c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f51638a = a.f51639a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f51639a = new a();

        private a() {
        }

        public final c a() {
            return Build.VERSION.SDK_INT >= 19 ? new h() : new t5.a();
        }
    }

    String a(int i11, int i12, Bitmap.Config config);

    void b(Bitmap bitmap);

    Bitmap c(int i11, int i12, Bitmap.Config config);

    String d(Bitmap bitmap);

    Bitmap removeLast();
}