package d7;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.util.DisplayMetrics;
import android.widget.ImageView;
import d7.b;
import d7.g;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static final C0454a f23747d = new C0454a(null);

    /* renamed from: e  reason: collision with root package name */
    private static final String f23748e;

    /* renamed from: a  reason: collision with root package name */
    private final d7.b f23749a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, g.b> f23750b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, WeakReference<ImageView>> f23751c;

    /* renamed from: d7.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0454a {
        private C0454a() {
        }

        public /* synthetic */ C0454a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(Context context, com.adyen.checkout.core.api.d environment) {
            s.g(context, "context");
            s.g(environment, "environment");
            b.a aVar = d7.b.f23755e;
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            s.f(displayMetrics, "context.resources.displayMetrics");
            return new a(aVar.b(environment, displayMetrics));
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements g.b {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f23753b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f23754c;

        b(String str, int i11) {
            this.f23753b = str;
            this.f23754c = i11;
        }

        @Override // d7.g.b
        public void a() {
            WeakReference weakReference = (WeakReference) a.this.f23751c.get(this.f23753b);
            ImageView imageView = weakReference == null ? null : (ImageView) weakReference.get();
            if (imageView == null) {
                o7.b.c(a.f23748e, s.p("ImageView is null for failed Logo - ", this.f23753b));
            } else {
                imageView.setImageResource(this.f23754c);
            }
            a.this.f23750b.remove(this.f23753b);
            a.this.f23751c.remove(this.f23753b);
        }

        @Override // d7.g.b
        public void b(BitmapDrawable drawable) {
            s.g(drawable, "drawable");
            WeakReference weakReference = (WeakReference) a.this.f23751c.get(this.f23753b);
            ImageView imageView = weakReference == null ? null : (ImageView) weakReference.get();
            if (imageView == null) {
                o7.b.c(a.f23748e, s.p("ImageView is null for received Logo - ", this.f23753b));
            } else {
                imageView.setImageDrawable(drawable);
            }
            a.this.f23750b.remove(this.f23753b);
            a.this.f23751c.remove(this.f23753b);
        }
    }

    static {
        String c11 = o7.a.c();
        s.f(c11, "getTag()");
        f23748e = c11;
    }

    public a(d7.b logoApi) {
        s.g(logoApi, "logoApi");
        this.f23749a = logoApi;
        this.f23750b = new HashMap();
        this.f23751c = new HashMap();
    }

    public final void d(String txVariant, ImageView view, b.EnumC0455b enumC0455b, int i11, int i12) {
        s.g(txVariant, "txVariant");
        s.g(view, "view");
        e(txVariant, "", view, enumC0455b, i11, i12);
    }

    public final void e(String txVariant, String txSubVariant, ImageView view, b.EnumC0455b enumC0455b, int i11, int i12) {
        s.g(txVariant, "txVariant");
        s.g(txSubVariant, "txSubVariant");
        s.g(view, "view");
        if (i11 != 0) {
            view.setImageResource(i11);
        }
        String str = txVariant + txSubVariant + view.hashCode();
        if (this.f23750b.containsKey(str)) {
            this.f23750b.remove(str);
            this.f23751c.remove(str);
        }
        b bVar = new b(str, i12);
        this.f23751c.put(str, new WeakReference<>(view));
        this.f23750b.put(str, bVar);
        this.f23749a.h(txVariant, txSubVariant, enumC0455b, bVar);
    }
}