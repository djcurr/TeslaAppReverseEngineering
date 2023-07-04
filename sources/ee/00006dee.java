package f80;

import android.content.Context;
import java.io.File;

/* loaded from: classes5.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private File f26124a = null;

    public d(Context context) {
        a(context);
    }

    public void a(Context context) {
        this.f26124a = new File(context.getCacheDir() + "/Camera/");
    }

    public File b() {
        return this.f26124a;
    }
}