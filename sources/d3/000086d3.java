package mh;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import org.spongycastle.crypto.tls.CipherSuite;

/* loaded from: classes3.dex */
class m extends i {

    /* renamed from: d  reason: collision with root package name */
    private final TextureView f38609d;

    /* renamed from: e  reason: collision with root package name */
    private int f38610e;

    /* loaded from: classes3.dex */
    class a implements TextureView.SurfaceTextureListener {
        a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i11, int i12) {
            m.this.n(i11, i12);
            m.this.o();
            m.this.a();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            m.this.n(0, 0);
            m.this.b();
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i11, int i12) {
            m.this.n(i11, i12);
            m.this.o();
            m.this.a();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(Context context, ViewGroup viewGroup) {
        TextureView textureView = (TextureView) View.inflate(context, org.reactnative.camera.b.texture_view, viewGroup).findViewById(org.reactnative.camera.a.texture_view);
        this.f38609d = textureView;
        textureView.setSurfaceTextureListener(new a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.i
    public Class d() {
        return SurfaceTexture.class;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.i
    public Surface e() {
        return new Surface(this.f38609d.getSurfaceTexture());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.i
    public View h() {
        return this.f38609d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.i
    public boolean j() {
        return this.f38609d.getSurfaceTexture() != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.i
    public void k(int i11, int i12) {
        this.f38609d.getSurfaceTexture().setDefaultBufferSize(i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.i
    public void m(int i11) {
        this.f38610e = i11;
        o();
    }

    void o() {
        Matrix matrix = new Matrix();
        int i11 = this.f38610e;
        if (i11 % CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256 == 90) {
            float i12 = i();
            float c11 = c();
            matrix.setPolyToPoly(new float[]{BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, i12, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, c11, i12, c11}, 0, this.f38610e == 90 ? new float[]{BitmapDescriptorFactory.HUE_RED, c11, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, i12, c11, i12, BitmapDescriptorFactory.HUE_RED} : new float[]{i12, BitmapDescriptorFactory.HUE_RED, i12, c11, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, c11}, 0, 4);
        } else if (i11 == 180) {
            matrix.postRotate(180.0f, i() / 2, c() / 2);
        }
        this.f38609d.setTransform(matrix);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.i
    /* renamed from: p */
    public SurfaceTexture g() {
        return this.f38609d.getSurfaceTexture();
    }
}