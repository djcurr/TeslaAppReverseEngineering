package f;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import f.a;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public class g extends a<Uri, Boolean> {
    @Override // f.a
    /* renamed from: a */
    public Intent createIntent(Context context, Uri input) {
        s.g(context, "context");
        s.g(input, "input");
        Intent putExtra = new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", input);
        s.f(putExtra, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
        return putExtra;
    }

    @Override // f.a
    /* renamed from: b */
    public final a.C0496a<Boolean> getSynchronousResult(Context context, Uri input) {
        s.g(context, "context");
        s.g(input, "input");
        return null;
    }

    @Override // f.a
    /* renamed from: c */
    public final Boolean parseResult(int i11, Intent intent) {
        return Boolean.valueOf(i11 == -1);
    }
}