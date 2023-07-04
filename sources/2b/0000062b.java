package androidx.core.view;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import com.stripe.android.model.Stripe3ds2AuthParams;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final f f4489a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final InterfaceC0076c f4490a;

        public a(ClipData clipData, int i11) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f4490a = new b(clipData, i11);
            } else {
                this.f4490a = new d(clipData, i11);
            }
        }

        public c a() {
            return this.f4490a.build();
        }

        public a b(Bundle bundle) {
            this.f4490a.setExtras(bundle);
            return this;
        }

        public a c(int i11) {
            this.f4490a.b(i11);
            return this;
        }

        public a d(Uri uri) {
            this.f4490a.a(uri);
            return this;
        }
    }

    /* loaded from: classes.dex */
    private static final class b implements InterfaceC0076c {

        /* renamed from: a  reason: collision with root package name */
        private final ContentInfo.Builder f4491a;

        b(ClipData clipData, int i11) {
            this.f4491a = new ContentInfo.Builder(clipData, i11);
        }

        @Override // androidx.core.view.c.InterfaceC0076c
        public void a(Uri uri) {
            this.f4491a.setLinkUri(uri);
        }

        @Override // androidx.core.view.c.InterfaceC0076c
        public void b(int i11) {
            this.f4491a.setFlags(i11);
        }

        @Override // androidx.core.view.c.InterfaceC0076c
        public c build() {
            return new c(new e(this.f4491a.build()));
        }

        @Override // androidx.core.view.c.InterfaceC0076c
        public void setExtras(Bundle bundle) {
            this.f4491a.setExtras(bundle);
        }
    }

    /* renamed from: androidx.core.view.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private interface InterfaceC0076c {
        void a(Uri uri);

        void b(int i11);

        c build();

        void setExtras(Bundle bundle);
    }

    /* loaded from: classes.dex */
    private static final class d implements InterfaceC0076c {

        /* renamed from: a  reason: collision with root package name */
        ClipData f4492a;

        /* renamed from: b  reason: collision with root package name */
        int f4493b;

        /* renamed from: c  reason: collision with root package name */
        int f4494c;

        /* renamed from: d  reason: collision with root package name */
        Uri f4495d;

        /* renamed from: e  reason: collision with root package name */
        Bundle f4496e;

        d(ClipData clipData, int i11) {
            this.f4492a = clipData;
            this.f4493b = i11;
        }

        @Override // androidx.core.view.c.InterfaceC0076c
        public void a(Uri uri) {
            this.f4495d = uri;
        }

        @Override // androidx.core.view.c.InterfaceC0076c
        public void b(int i11) {
            this.f4494c = i11;
        }

        @Override // androidx.core.view.c.InterfaceC0076c
        public c build() {
            return new c(new g(this));
        }

        @Override // androidx.core.view.c.InterfaceC0076c
        public void setExtras(Bundle bundle) {
            this.f4496e = bundle;
        }
    }

    /* loaded from: classes.dex */
    private static final class e implements f {

        /* renamed from: a  reason: collision with root package name */
        private final ContentInfo f4497a;

        e(ContentInfo contentInfo) {
            this.f4497a = (ContentInfo) v3.h.f(contentInfo);
        }

        @Override // androidx.core.view.c.f
        public int f() {
            return this.f4497a.getSource();
        }

        @Override // androidx.core.view.c.f
        public ContentInfo g() {
            return this.f4497a;
        }

        @Override // androidx.core.view.c.f
        public ClipData h() {
            return this.f4497a.getClip();
        }

        @Override // androidx.core.view.c.f
        public int i() {
            return this.f4497a.getFlags();
        }

        public String toString() {
            return "ContentInfoCompat{" + this.f4497a + "}";
        }
    }

    /* loaded from: classes.dex */
    private interface f {
        int f();

        ContentInfo g();

        ClipData h();

        int i();
    }

    /* loaded from: classes.dex */
    private static final class g implements f {

        /* renamed from: a  reason: collision with root package name */
        private final ClipData f4498a;

        /* renamed from: b  reason: collision with root package name */
        private final int f4499b;

        /* renamed from: c  reason: collision with root package name */
        private final int f4500c;

        /* renamed from: d  reason: collision with root package name */
        private final Uri f4501d;

        /* renamed from: e  reason: collision with root package name */
        private final Bundle f4502e;

        g(d dVar) {
            this.f4498a = (ClipData) v3.h.f(dVar.f4492a);
            this.f4499b = v3.h.c(dVar.f4493b, 0, 5, Stripe3ds2AuthParams.FIELD_SOURCE);
            this.f4500c = v3.h.e(dVar.f4494c, 1);
            this.f4501d = dVar.f4495d;
            this.f4502e = dVar.f4496e;
        }

        @Override // androidx.core.view.c.f
        public int f() {
            return this.f4499b;
        }

        @Override // androidx.core.view.c.f
        public ContentInfo g() {
            return null;
        }

        @Override // androidx.core.view.c.f
        public ClipData h() {
            return this.f4498a;
        }

        @Override // androidx.core.view.c.f
        public int i() {
            return this.f4500c;
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ContentInfoCompat{clip=");
            sb2.append(this.f4498a.getDescription());
            sb2.append(", source=");
            sb2.append(c.e(this.f4499b));
            sb2.append(", flags=");
            sb2.append(c.a(this.f4500c));
            if (this.f4501d == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + this.f4501d.toString().length() + ")";
            }
            sb2.append(str);
            sb2.append(this.f4502e != null ? ", hasExtras" : "");
            sb2.append("}");
            return sb2.toString();
        }
    }

    c(f fVar) {
        this.f4489a = fVar;
    }

    static String a(int i11) {
        return (i11 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i11);
    }

    static String e(int i11) {
        return i11 != 0 ? i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? i11 != 5 ? String.valueOf(i11) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP";
    }

    public static c g(ContentInfo contentInfo) {
        return new c(new e(contentInfo));
    }

    public ClipData b() {
        return this.f4489a.h();
    }

    public int c() {
        return this.f4489a.i();
    }

    public int d() {
        return this.f4489a.f();
    }

    public ContentInfo f() {
        return this.f4489a.g();
    }

    public String toString() {
        return this.f4489a.toString();
    }
}