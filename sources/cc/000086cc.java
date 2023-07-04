package mh;

import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.View;

/* loaded from: classes3.dex */
abstract class i {

    /* renamed from: a  reason: collision with root package name */
    private a f38601a;

    /* renamed from: b  reason: collision with root package name */
    private int f38602b;

    /* renamed from: c  reason: collision with root package name */
    private int f38603c;

    /* loaded from: classes3.dex */
    interface a {
        void a();

        void b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a() {
        this.f38601a.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b() {
        this.f38601a.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        return this.f38603c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Class d();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Surface e();

    /* JADX INFO: Access modifiers changed from: package-private */
    public SurfaceHolder f() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object g() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract View h();

    /* JADX INFO: Access modifiers changed from: package-private */
    public int i() {
        return this.f38602b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean j();

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(int i11, int i12) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(a aVar) {
        this.f38601a = aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void m(int i11);

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n(int i11, int i12) {
        this.f38602b = i11;
        this.f38603c = i12;
    }
}