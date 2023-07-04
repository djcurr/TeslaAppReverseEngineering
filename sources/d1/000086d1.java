package mh;

import android.content.Context;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.a0;

/* loaded from: classes3.dex */
class l extends i {

    /* renamed from: d  reason: collision with root package name */
    final SurfaceView f38607d;

    /* loaded from: classes3.dex */
    class a implements SurfaceHolder.Callback {
        a() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i11, int i12, int i13) {
            l.this.n(i12, i13);
            if (a0.Z(l.this.f38607d)) {
                return;
            }
            l.this.a();
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            l.this.n(0, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(Context context, ViewGroup viewGroup) {
        SurfaceView surfaceView = (SurfaceView) View.inflate(context, org.reactnative.camera.b.surface_view, viewGroup).findViewById(org.reactnative.camera.a.surface_view);
        this.f38607d = surfaceView;
        SurfaceHolder holder = surfaceView.getHolder();
        holder.setType(3);
        holder.addCallback(new a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.i
    public Class d() {
        return SurfaceHolder.class;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.i
    public Surface e() {
        return f().getSurface();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.i
    public SurfaceHolder f() {
        return this.f38607d.getHolder();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.i
    public View h() {
        return this.f38607d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.i
    public boolean j() {
        return (i() == 0 || c() == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.i
    public void m(int i11) {
    }
}