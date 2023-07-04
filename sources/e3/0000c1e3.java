package y5;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class c implements b<Integer, Uri> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f59139a;

    public c(Context context) {
        s.g(context, "context");
        this.f59139a = context;
    }

    @Override // y5.b
    public /* bridge */ /* synthetic */ boolean a(Integer num) {
        return c(num.intValue());
    }

    @Override // y5.b
    public /* bridge */ /* synthetic */ Uri b(Integer num) {
        return d(num.intValue());
    }

    public boolean c(int i11) {
        try {
            return this.f59139a.getResources().getResourceEntryName(i11) != null;
        } catch (Resources.NotFoundException unused) {
            return false;
        }
    }

    public Uri d(int i11) {
        Uri parse = Uri.parse("android.resource://" + this.f59139a.getPackageName() + '/' + i11);
        s.d(parse, "Uri.parse(this)");
        return parse;
    }
}