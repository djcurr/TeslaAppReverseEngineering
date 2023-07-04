package f;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import f.a;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public class c extends a<String[], Uri> {
    @Override // f.a
    /* renamed from: a */
    public Intent createIntent(Context context, String[] input) {
        s.g(context, "context");
        s.g(input, "input");
        Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", input).setType("*/*");
        s.f(type, "Intent(Intent.ACTION_OPE…          .setType(\"*/*\")");
        return type;
    }

    @Override // f.a
    /* renamed from: b */
    public final a.C0496a<Uri> getSynchronousResult(Context context, String[] input) {
        s.g(context, "context");
        s.g(input, "input");
        return null;
    }

    @Override // f.a
    /* renamed from: c */
    public final Uri parseResult(int i11, Intent intent) {
        if (!(i11 == -1)) {
            intent = null;
        }
        if (intent == null) {
            return null;
        }
        return intent.getData();
    }
}