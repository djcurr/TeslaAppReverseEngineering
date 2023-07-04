package mh;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.CamcorderProfile;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.a0;
import com.facebook.react.bridge.ReadableMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.SortedSet;
import mh.f;
import org.spongycastle.crypto.tls.CipherSuite;

/* loaded from: classes3.dex */
public class e extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    f f38566a;

    /* renamed from: b  reason: collision with root package name */
    private final c f38567b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f38568c;

    /* renamed from: d  reason: collision with root package name */
    private Context f38569d;

    /* renamed from: e  reason: collision with root package name */
    private final h f38570e;

    /* renamed from: f  reason: collision with root package name */
    protected HandlerThread f38571f;

    /* renamed from: g  reason: collision with root package name */
    protected Handler f38572g;

    /* loaded from: classes3.dex */
    class a extends h {
        a(Context context) {
            super(context);
        }

        @Override // mh.h
        public void g(int i11, int i12) {
            e.this.f38566a.E(i11);
            e.this.f38566a.D(i12);
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class b {
        public void a(e eVar) {
        }

        public void b(e eVar) {
        }

        public void c(e eVar, byte[] bArr, int i11, int i12, int i13) {
        }

        public void d(e eVar) {
        }

        public void e(e eVar, byte[] bArr, int i11) {
        }

        public void f(e eVar) {
        }

        public void g(e eVar, String str, int i11, int i12) {
        }

        public void h(e eVar, String str, int i11, int i12) {
        }
    }

    /* loaded from: classes3.dex */
    private class c implements f.a {

        /* renamed from: a  reason: collision with root package name */
        private final ArrayList<b> f38574a = new ArrayList<>();

        /* renamed from: b  reason: collision with root package name */
        private boolean f38575b;

        c() {
        }

        @Override // mh.f.a
        public void a() {
            Iterator<b> it2 = this.f38574a.iterator();
            while (it2.hasNext()) {
                it2.next().f(e.this);
            }
        }

        @Override // mh.f.a
        public void b() {
            if (this.f38575b) {
                this.f38575b = false;
                e.this.requestLayout();
            }
            Iterator<b> it2 = this.f38574a.iterator();
            while (it2.hasNext()) {
                it2.next().b(e.this);
            }
        }

        @Override // mh.f.a
        public void c(byte[] bArr, int i11) {
            Iterator<b> it2 = this.f38574a.iterator();
            while (it2.hasNext()) {
                it2.next().e(e.this, bArr, i11);
            }
        }

        @Override // mh.f.a
        public void d(byte[] bArr, int i11, int i12, int i13) {
            Iterator<b> it2 = this.f38574a.iterator();
            while (it2.hasNext()) {
                it2.next().c(e.this, bArr, i11, i12, i13);
            }
        }

        @Override // mh.f.a
        public void e() {
            Iterator<b> it2 = this.f38574a.iterator();
            while (it2.hasNext()) {
                it2.next().d(e.this);
            }
        }

        @Override // mh.f.a
        public void f(String str, int i11, int i12) {
            Iterator<b> it2 = this.f38574a.iterator();
            while (it2.hasNext()) {
                it2.next().g(e.this, str, i11, i12);
            }
        }

        @Override // mh.f.a
        public void g(String str, int i11, int i12) {
            Iterator<b> it2 = this.f38574a.iterator();
            while (it2.hasNext()) {
                it2.next().h(e.this, str, i11, i12);
            }
        }

        public void h(b bVar) {
            this.f38574a.add(bVar);
        }

        public void i() {
            this.f38575b = true;
        }

        @Override // mh.f.a
        public void onCameraClosed() {
            Iterator<b> it2 = this.f38574a.iterator();
            while (it2.hasNext()) {
                it2.next().a(e.this);
            }
        }
    }

    public e(Context context, boolean z11) {
        this(context, null, z11);
    }

    private i n(Context context) {
        if (Build.VERSION.SDK_INT < 14) {
            return new l(context, this);
        }
        return new m(context, this);
    }

    public boolean getAdjustViewBounds() {
        return this.f38568c;
    }

    public mh.a getAspectRatio() {
        return this.f38566a.a();
    }

    public boolean getAutoFocus() {
        return this.f38566a.b();
    }

    public String getCameraId() {
        return this.f38566a.d();
    }

    public List<Properties> getCameraIds() {
        return this.f38566a.e();
    }

    public int getCameraOrientation() {
        return this.f38566a.f();
    }

    public float getExposureCompensation() {
        return this.f38566a.g();
    }

    public int getFacing() {
        return this.f38566a.h();
    }

    public int getFlash() {
        return this.f38566a.i();
    }

    public float getFocusDepth() {
        return this.f38566a.j();
    }

    public j getPictureSize() {
        return this.f38566a.k();
    }

    public boolean getPlaySoundOnCapture() {
        return this.f38566a.l();
    }

    public boolean getPlaySoundOnRecord() {
        return this.f38566a.m();
    }

    public j getPreviewSize() {
        return this.f38566a.n();
    }

    public boolean getScanning() {
        return this.f38566a.o();
    }

    public Set<mh.a> getSupportedAspectRatios() {
        return this.f38566a.p();
    }

    public ArrayList<int[]> getSupportedPreviewFpsRange() {
        return this.f38566a.q();
    }

    public View getView() {
        f fVar = this.f38566a;
        if (fVar != null) {
            return fVar.r();
        }
        return null;
    }

    public int getWhiteBalance() {
        return this.f38566a.s();
    }

    public float getZoom() {
        return this.f38566a.t();
    }

    public void l(b bVar) {
        this.f38567b.h(bVar);
    }

    public void m() {
        HandlerThread handlerThread = this.f38571f;
        if (handlerThread != null) {
            if (Build.VERSION.SDK_INT < 18) {
                handlerThread.quit();
            } else {
                handlerThread.quitSafely();
            }
            this.f38571f = null;
        }
    }

    public SortedSet<j> o(mh.a aVar) {
        return this.f38566a.c(aVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode()) {
            return;
        }
        this.f38570e.e(a0.y(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        if (!isInEditMode()) {
            this.f38570e.c();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        if (isInEditMode()) {
            super.onMeasure(i11, i12);
            return;
        }
        if (this.f38568c) {
            if (!p()) {
                this.f38567b.i();
                super.onMeasure(i11, i12);
                return;
            }
            int mode = View.MeasureSpec.getMode(i11);
            int mode2 = View.MeasureSpec.getMode(i12);
            if (mode == 1073741824 && mode2 != 1073741824) {
                int size = (int) (View.MeasureSpec.getSize(i11) * getAspectRatio().i());
                if (mode2 == Integer.MIN_VALUE) {
                    size = Math.min(size, View.MeasureSpec.getSize(i12));
                }
                super.onMeasure(i11, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
            } else if (mode != 1073741824 && mode2 == 1073741824) {
                int size2 = (int) (View.MeasureSpec.getSize(i12) * getAspectRatio().i());
                if (mode == Integer.MIN_VALUE) {
                    size2 = Math.min(size2, View.MeasureSpec.getSize(i11));
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(size2, 1073741824), i12);
            } else {
                super.onMeasure(i11, i12);
            }
        } else {
            super.onMeasure(i11, i12);
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        mh.a aspectRatio = getAspectRatio();
        if (this.f38570e.f() % CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256 == 0) {
            aspectRatio = aspectRatio.e();
        }
        if (measuredHeight < (aspectRatio.d() * measuredWidth) / aspectRatio.c()) {
            this.f38566a.r().measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec((measuredWidth * aspectRatio.d()) / aspectRatio.c(), 1073741824));
        } else {
            this.f38566a.r().measure(View.MeasureSpec.makeMeasureSpec((aspectRatio.c() * measuredHeight) / aspectRatio.d(), 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        setFacing(dVar.f38577a);
        setCameraId(dVar.f38578b);
        setAspectRatio(dVar.f38579c);
        setAutoFocus(dVar.f38580d);
        setFlash(dVar.f38581e);
        setExposureCompensation(dVar.f38582f);
        setFocusDepth(dVar.f38583g);
        setZoom(dVar.f38584h);
        setWhiteBalance(dVar.f38585i);
        setPlaySoundOnCapture(dVar.f38586j);
        setPlaySoundOnRecord(dVar.f38587k);
        setScanning(dVar.f38588l);
        setPictureSize(dVar.f38589m);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.f38577a = getFacing();
        dVar.f38578b = getCameraId();
        dVar.f38579c = getAspectRatio();
        dVar.f38580d = getAutoFocus();
        dVar.f38581e = getFlash();
        dVar.f38582f = getExposureCompensation();
        dVar.f38583g = getFocusDepth();
        dVar.f38584h = getZoom();
        dVar.f38585i = getWhiteBalance();
        dVar.f38586j = getPlaySoundOnCapture();
        dVar.f38587k = getPlaySoundOnRecord();
        dVar.f38588l = getScanning();
        dVar.f38589m = getPictureSize();
        return dVar;
    }

    public boolean p() {
        return this.f38566a.u();
    }

    public void q() {
        this.f38566a.v();
    }

    public void r() {
        this.f38566a.w();
    }

    public boolean s(String str, int i11, int i12, boolean z11, CamcorderProfile camcorderProfile, int i13, int i14) {
        return this.f38566a.x(str, i11, i12, z11, camcorderProfile, i13, i14);
    }

    public void setAdjustViewBounds(boolean z11) {
        if (this.f38568c != z11) {
            this.f38568c = z11;
            requestLayout();
        }
    }

    public void setAspectRatio(mh.a aVar) {
        if (this.f38566a.A(aVar)) {
            requestLayout();
        }
    }

    public void setAutoFocus(boolean z11) {
        this.f38566a.B(z11);
    }

    public void setCameraId(String str) {
        this.f38566a.C(str);
    }

    public void setExposureCompensation(float f11) {
        this.f38566a.F(f11);
    }

    public void setFacing(int i11) {
        this.f38566a.G(i11);
    }

    public void setFlash(int i11) {
        this.f38566a.H(i11);
    }

    public void setFocusDepth(float f11) {
        this.f38566a.J(f11);
    }

    public void setPictureSize(j jVar) {
        this.f38566a.K(jVar);
    }

    public void setPlaySoundOnCapture(boolean z11) {
        this.f38566a.L(z11);
    }

    public void setPlaySoundOnRecord(boolean z11) {
        this.f38566a.M(z11);
    }

    public void setPreviewTexture(SurfaceTexture surfaceTexture) {
        this.f38566a.N(surfaceTexture);
    }

    public void setScanning(boolean z11) {
        this.f38566a.O(z11);
    }

    public void setUsingCamera2Api(boolean z11) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 21) {
            return;
        }
        boolean p11 = p();
        Parcelable onSaveInstanceState = onSaveInstanceState();
        if (z11 && !mh.c.h0(this.f38569d)) {
            if (p11) {
                x();
            }
            if (i11 < 23) {
                this.f38566a = new mh.c(this.f38567b, this.f38566a.f38591b, this.f38569d, this.f38572g);
            } else {
                this.f38566a = new mh.d(this.f38567b, this.f38566a.f38591b, this.f38569d, this.f38572g);
            }
            onRestoreInstanceState(onSaveInstanceState);
        } else if (this.f38566a instanceof mh.b) {
            return;
        } else {
            if (p11) {
                x();
            }
            this.f38566a = new mh.b(this.f38567b, this.f38566a.f38591b, this.f38572g);
        }
        if (p11) {
            w();
        }
    }

    public void setWhiteBalance(int i11) {
        this.f38566a.P(i11);
    }

    public void setZoom(float f11) {
        this.f38566a.Q(f11);
    }

    public void t() {
        this.f38566a.y();
    }

    public void u() {
        this.f38566a.z();
    }

    public void v(float f11, float f12) {
        this.f38566a.I(f11, f12);
    }

    public void w() {
        this.f38566a.R();
    }

    public void x() {
        this.f38566a.S();
    }

    public void y() {
        this.f38566a.T();
    }

    public void z(ReadableMap readableMap) {
        this.f38566a.U(readableMap);
    }

    public e(Context context, AttributeSet attributeSet, boolean z11) {
        this(context, attributeSet, 0, z11);
    }

    public e(Context context, AttributeSet attributeSet, int i11, boolean z11) {
        super(context, attributeSet, i11);
        int i12;
        HandlerThread handlerThread = new HandlerThread("RNCamera-Handler-Thread");
        this.f38571f = handlerThread;
        handlerThread.start();
        this.f38572g = new Handler(this.f38571f.getLooper());
        if (isInEditMode()) {
            this.f38567b = null;
            this.f38570e = null;
            return;
        }
        this.f38568c = true;
        this.f38569d = context;
        i n11 = n(context);
        c cVar = new c();
        this.f38567b = cVar;
        if (z11 || (i12 = Build.VERSION.SDK_INT) < 21 || mh.c.h0(context)) {
            this.f38566a = new mh.b(cVar, n11, this.f38572g);
        } else if (i12 < 23) {
            this.f38566a = new mh.c(cVar, n11, context, this.f38572g);
        } else {
            this.f38566a = new mh.d(cVar, n11, context, this.f38572g);
        }
        this.f38570e = new a(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes3.dex */
    public static class d extends View.BaseSavedState {
        public static final Parcelable.Creator<d> CREATOR = r3.k.a(new a());

        /* renamed from: a  reason: collision with root package name */
        int f38577a;

        /* renamed from: b  reason: collision with root package name */
        String f38578b;

        /* renamed from: c  reason: collision with root package name */
        mh.a f38579c;

        /* renamed from: d  reason: collision with root package name */
        boolean f38580d;

        /* renamed from: e  reason: collision with root package name */
        int f38581e;

        /* renamed from: f  reason: collision with root package name */
        float f38582f;

        /* renamed from: g  reason: collision with root package name */
        float f38583g;

        /* renamed from: h  reason: collision with root package name */
        float f38584h;

        /* renamed from: i  reason: collision with root package name */
        int f38585i;

        /* renamed from: j  reason: collision with root package name */
        boolean f38586j;

        /* renamed from: k  reason: collision with root package name */
        boolean f38587k;

        /* renamed from: l  reason: collision with root package name */
        boolean f38588l;

        /* renamed from: m  reason: collision with root package name */
        j f38589m;

        /* loaded from: classes3.dex */
        class a implements r3.l<d> {
            a() {
            }

            @Override // r3.l
            /* renamed from: a */
            public d createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new d(parcel, classLoader);
            }

            @Override // r3.l
            /* renamed from: b */
            public d[] newArray(int i11) {
                return new d[i11];
            }
        }

        public d(Parcel parcel, ClassLoader classLoader) {
            super(parcel);
            this.f38577a = parcel.readInt();
            this.f38578b = parcel.readString();
            this.f38579c = (mh.a) parcel.readParcelable(classLoader);
            this.f38580d = parcel.readByte() != 0;
            this.f38581e = parcel.readInt();
            this.f38582f = parcel.readFloat();
            this.f38583g = parcel.readFloat();
            this.f38584h = parcel.readFloat();
            this.f38585i = parcel.readInt();
            this.f38586j = parcel.readByte() != 0;
            this.f38587k = parcel.readByte() != 0;
            this.f38588l = parcel.readByte() != 0;
            this.f38589m = (j) parcel.readParcelable(classLoader);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeInt(this.f38577a);
            parcel.writeString(this.f38578b);
            parcel.writeParcelable(this.f38579c, 0);
            parcel.writeByte(this.f38580d ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.f38581e);
            parcel.writeFloat(this.f38582f);
            parcel.writeFloat(this.f38583g);
            parcel.writeFloat(this.f38584h);
            parcel.writeInt(this.f38585i);
            parcel.writeByte(this.f38586j ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f38587k ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f38588l ? (byte) 1 : (byte) 0);
            parcel.writeParcelable(this.f38589m, i11);
        }

        public d(Parcelable parcelable) {
            super(parcelable);
        }
    }
}