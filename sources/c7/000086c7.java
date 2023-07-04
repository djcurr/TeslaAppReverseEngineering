package mh;

import android.graphics.SurfaceTexture;
import android.media.CamcorderProfile;
import android.os.Handler;
import android.view.View;
import com.facebook.react.bridge.ReadableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes3.dex */
abstract class f {

    /* renamed from: a  reason: collision with root package name */
    protected final a f38590a;

    /* renamed from: b  reason: collision with root package name */
    protected final i f38591b;

    /* renamed from: c  reason: collision with root package name */
    protected final Handler f38592c;

    /* loaded from: classes3.dex */
    interface a {
        void a();

        void b();

        void c(byte[] bArr, int i11);

        void d(byte[] bArr, int i11, int i12, int i13);

        void e();

        void f(String str, int i11, int i12);

        void g(String str, int i11, int i12);

        void onCameraClosed();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(a aVar, i iVar, Handler handler) {
        this.f38590a = aVar;
        this.f38591b = iVar;
        this.f38592c = handler;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean A(mh.a aVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void B(boolean z11);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void C(String str);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void D(int i11);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void E(int i11);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void F(float f11);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void G(int i11);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void H(int i11);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void I(float f11, float f12);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void J(float f11);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void K(j jVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void L(boolean z11);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void M(boolean z11);

    public abstract void N(SurfaceTexture surfaceTexture);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void O(boolean z11);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void P(int i11);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void Q(float f11);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean R();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void S();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void T();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void U(ReadableMap readableMap);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract mh.a a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract SortedSet<j> c(mh.a aVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract String d();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract List<Properties> e();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int f();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract float g();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int h();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int i();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract float j();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract j k();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean l();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean m();

    public abstract j n();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean o();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Set<mh.a> p();

    public abstract ArrayList<int[]> q();

    /* JADX INFO: Access modifiers changed from: package-private */
    public View r() {
        return this.f38591b.h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int s();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract float t();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean u();

    public abstract void v();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void w();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean x(String str, int i11, int i12, boolean z11, CamcorderProfile camcorderProfile, int i13, int i14);

    public abstract void y();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void z();
}