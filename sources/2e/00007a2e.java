package is;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import av.b;
import kotlin.jvm.internal.s;
import vz.p;
import zz.d;

/* loaded from: classes6.dex */
public final class a implements ev.a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f32747a;

    public a(Context context) {
        s.g(context, "context");
        this.f32747a = context;
    }

    @Override // ev.a
    public boolean a() {
        return !cs.a.Companion.a().a(this.f32747a);
    }

    @Override // ev.a
    public Intent b(Context context) {
        s.g(context, "context");
        try {
            return new Intent(context, Class.forName("com.tesla.privacy.PrivacyPolicyActivity"));
        } catch (Exception unused) {
            Uri parse = Uri.parse("tesla://");
            s.f(parse, "parse(this)");
            return new Intent("android.intent.action.VIEW", parse);
        }
    }

    @Override // ev.a
    public Object c(p<Double, Double> pVar, d<? super String> dVar) {
        return b.a(this.f32747a, pVar, dVar);
    }
}