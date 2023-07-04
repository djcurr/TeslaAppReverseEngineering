package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.SparseArray;
import androidx.browser.customtabs.a;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final Intent f2065a;

    /* renamed from: b  reason: collision with root package name */
    public final Bundle f2066b;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: c  reason: collision with root package name */
        private ArrayList<Bundle> f2069c;

        /* renamed from: d  reason: collision with root package name */
        private Bundle f2070d;

        /* renamed from: e  reason: collision with root package name */
        private ArrayList<Bundle> f2071e;

        /* renamed from: f  reason: collision with root package name */
        private SparseArray<Bundle> f2072f;

        /* renamed from: g  reason: collision with root package name */
        private Bundle f2073g;

        /* renamed from: a  reason: collision with root package name */
        private final Intent f2067a = new Intent("android.intent.action.VIEW");

        /* renamed from: b  reason: collision with root package name */
        private final a.C0040a f2068b = new a.C0040a();

        /* renamed from: h  reason: collision with root package name */
        private int f2074h = 0;

        /* renamed from: i  reason: collision with root package name */
        private boolean f2075i = true;

        private void g(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            androidx.core.app.e.b(bundle, "android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.f2067a.putExtras(bundle);
        }

        @Deprecated
        public a a() {
            h(1);
            return this;
        }

        public d b() {
            if (!this.f2067a.hasExtra("android.support.customtabs.extra.SESSION")) {
                g(null, null);
            }
            ArrayList<Bundle> arrayList = this.f2069c;
            if (arrayList != null) {
                this.f2067a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.f2071e;
            if (arrayList2 != null) {
                this.f2067a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f2067a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f2075i);
            this.f2067a.putExtras(this.f2068b.a().a());
            Bundle bundle = this.f2073g;
            if (bundle != null) {
                this.f2067a.putExtras(bundle);
            }
            if (this.f2072f != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f2072f);
                this.f2067a.putExtras(bundle2);
            }
            this.f2067a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f2074h);
            return new d(this.f2067a, this.f2070d);
        }

        public a c(Bitmap bitmap) {
            this.f2067a.putExtra("android.support.customtabs.extra.CLOSE_BUTTON_ICON", bitmap);
            return this;
        }

        public a d(androidx.browser.customtabs.a aVar) {
            this.f2073g = aVar.a();
            return this;
        }

        public a e(Context context, int i11, int i12) {
            this.f2067a.putExtra("android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE", androidx.core.app.b.a(context, i11, i12).b());
            return this;
        }

        @Deprecated
        public a f(int i11) {
            this.f2068b.b(i11);
            return this;
        }

        public a h(int i11) {
            if (i11 >= 0 && i11 <= 2) {
                this.f2074h = i11;
                if (i11 == 1) {
                    this.f2067a.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", true);
                } else if (i11 == 2) {
                    this.f2067a.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", false);
                } else {
                    this.f2067a.removeExtra("android.support.customtabs.extra.SHARE_MENU_ITEM");
                }
                return this;
            }
            throw new IllegalArgumentException("Invalid value for the shareState argument");
        }

        public a i(boolean z11) {
            this.f2067a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", z11 ? 1 : 0);
            return this;
        }

        public a j(Context context, int i11, int i12) {
            this.f2070d = androidx.core.app.b.a(context, i11, i12).b();
            return this;
        }

        @Deprecated
        public a k(int i11) {
            this.f2068b.c(i11);
            return this;
        }
    }

    d(Intent intent, Bundle bundle) {
        this.f2065a = intent;
        this.f2066b = bundle;
    }

    public void a(Context context, Uri uri) {
        this.f2065a.setData(uri);
        androidx.core.content.b.startActivity(context, this.f2065a, this.f2066b);
    }
}