package y5;

import android.net.Uri;
import kotlin.jvm.internal.s;
import y5.b;

/* loaded from: classes.dex */
public final class e implements b<String, Uri> {
    @Override // y5.b
    /* renamed from: c */
    public boolean a(String data) {
        s.g(data, "data");
        return b.a.a(this, data);
    }

    @Override // y5.b
    /* renamed from: d */
    public Uri b(String data) {
        s.g(data, "data");
        Uri parse = Uri.parse(data);
        s.d(parse, "Uri.parse(this)");
        return parse;
    }
}