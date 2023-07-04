package la;

import android.content.Context;
import java.io.File;
import la.d;

/* loaded from: classes.dex */
public final class f extends d {

    /* loaded from: classes.dex */
    class a implements d.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f37136a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f37137b;

        a(Context context, String str) {
            this.f37136a = context;
            this.f37137b = str;
        }

        @Override // la.d.a
        public File a() {
            File cacheDir = this.f37136a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f37137b != null ? new File(cacheDir, this.f37137b) : cacheDir;
        }
    }

    public f(Context context) {
        this(context, "image_manager_disk_cache", 262144000L);
    }

    public f(Context context, String str, long j11) {
        super(new a(context, str), j11);
    }
}