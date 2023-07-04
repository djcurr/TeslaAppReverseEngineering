package d7;

import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class c extends com.adyen.checkout.core.api.b<BitmapDrawable> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String logoUrl) {
        super(logoUrl);
        s.g(logoUrl, "logoUrl");
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: i */
    public BitmapDrawable call() {
        String str;
        str = d.f23764a;
        o7.b.f(str, s.p("call - ", Integer.valueOf(d().hashCode())));
        byte[] a11 = a();
        s.f(a11, "get()");
        return new BitmapDrawable(Resources.getSystem(), BitmapFactory.decodeByteArray(a11, 0, a11.length));
    }
}