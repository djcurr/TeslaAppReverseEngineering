package y3;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final InterfaceC1347c f59077a;

    /* loaded from: classes.dex */
    private static final class b implements InterfaceC1347c {

        /* renamed from: a  reason: collision with root package name */
        private final Uri f59079a;

        /* renamed from: b  reason: collision with root package name */
        private final ClipDescription f59080b;

        /* renamed from: c  reason: collision with root package name */
        private final Uri f59081c;

        b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f59079a = uri;
            this.f59080b = clipDescription;
            this.f59081c = uri2;
        }

        @Override // y3.c.InterfaceC1347c
        public Object a() {
            return null;
        }

        @Override // y3.c.InterfaceC1347c
        public Uri b() {
            return this.f59079a;
        }

        @Override // y3.c.InterfaceC1347c
        public void c() {
        }

        @Override // y3.c.InterfaceC1347c
        public Uri d() {
            return this.f59081c;
        }

        @Override // y3.c.InterfaceC1347c
        public ClipDescription getDescription() {
            return this.f59080b;
        }
    }

    /* renamed from: y3.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private interface InterfaceC1347c {
        Object a();

        Uri b();

        void c();

        Uri d();

        ClipDescription getDescription();
    }

    public c(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f59077a = new a(uri, clipDescription, uri2);
        } else {
            this.f59077a = new b(uri, clipDescription, uri2);
        }
    }

    public static c f(Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new c(new a(obj));
        }
        return null;
    }

    public Uri a() {
        return this.f59077a.b();
    }

    public ClipDescription b() {
        return this.f59077a.getDescription();
    }

    public Uri c() {
        return this.f59077a.d();
    }

    public void d() {
        this.f59077a.c();
    }

    public Object e() {
        return this.f59077a.a();
    }

    /* loaded from: classes.dex */
    private static final class a implements InterfaceC1347c {

        /* renamed from: a  reason: collision with root package name */
        final InputContentInfo f59078a;

        a(Object obj) {
            this.f59078a = (InputContentInfo) obj;
        }

        @Override // y3.c.InterfaceC1347c
        public Object a() {
            return this.f59078a;
        }

        @Override // y3.c.InterfaceC1347c
        public Uri b() {
            return this.f59078a.getContentUri();
        }

        @Override // y3.c.InterfaceC1347c
        public void c() {
            this.f59078a.requestPermission();
        }

        @Override // y3.c.InterfaceC1347c
        public Uri d() {
            return this.f59078a.getLinkUri();
        }

        @Override // y3.c.InterfaceC1347c
        public ClipDescription getDescription() {
            return this.f59078a.getDescription();
        }

        a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f59078a = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    private c(InterfaceC1347c interfaceC1347c) {
        this.f59077a = interfaceC1347c;
    }
}