package com.airbnb.lottie;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.a0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import v7.i;
import v7.j;
import v7.k;
import v7.l;
import v7.m;
import v7.n;
import v7.o;
import v7.p;

/* loaded from: classes.dex */
public class LottieAnimationView extends AppCompatImageView {

    /* renamed from: c  reason: collision with root package name */
    private final v7.g<v7.d> f9960c;

    /* renamed from: d  reason: collision with root package name */
    private final v7.g<Throwable> f9961d;

    /* renamed from: e  reason: collision with root package name */
    private v7.g<Throwable> f9962e;

    /* renamed from: f  reason: collision with root package name */
    private int f9963f;

    /* renamed from: g  reason: collision with root package name */
    private final com.airbnb.lottie.a f9964g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f9965h;

    /* renamed from: i  reason: collision with root package name */
    private String f9966i;

    /* renamed from: j  reason: collision with root package name */
    private int f9967j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f9968k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f9969l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f9970m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f9971n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f9972o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f9973p;

    /* renamed from: q  reason: collision with root package name */
    private com.airbnb.lottie.c f9974q;

    /* renamed from: t  reason: collision with root package name */
    private final Set<i> f9975t;

    /* renamed from: w  reason: collision with root package name */
    private int f9976w;

    /* renamed from: x  reason: collision with root package name */
    private com.airbnb.lottie.b<v7.d> f9977x;

    /* renamed from: y  reason: collision with root package name */
    private v7.d f9978y;

    /* renamed from: z  reason: collision with root package name */
    private static final String f9959z = LottieAnimationView.class.getSimpleName();
    private static final v7.g<Throwable> A = new a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements v7.g<Throwable> {
        a() {
        }

        @Override // v7.g
        /* renamed from: b */
        public void a(Throwable th2) {
            if (h8.h.k(th2)) {
                h8.d.d("Unable to load composition.", th2);
                return;
            }
            throw new IllegalStateException("Unable to parse composition", th2);
        }
    }

    /* loaded from: classes.dex */
    class b implements v7.g<v7.d> {
        b() {
        }

        @Override // v7.g
        /* renamed from: b */
        public void a(v7.d dVar) {
            LottieAnimationView.this.setComposition(dVar);
        }
    }

    /* loaded from: classes.dex */
    class c implements v7.g<Throwable> {
        c() {
        }

        @Override // v7.g
        /* renamed from: b */
        public void a(Throwable th2) {
            if (LottieAnimationView.this.f9963f != 0) {
                LottieAnimationView lottieAnimationView = LottieAnimationView.this;
                lottieAnimationView.setImageResource(lottieAnimationView.f9963f);
            }
            (LottieAnimationView.this.f9962e == null ? LottieAnimationView.A : LottieAnimationView.this.f9962e).a(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements Callable<k<v7.d>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f9981a;

        d(int i11) {
            this.f9981a = i11;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public k<v7.d> call() {
            return LottieAnimationView.this.f9973p ? v7.e.o(LottieAnimationView.this.getContext(), this.f9981a) : v7.e.p(LottieAnimationView.this.getContext(), this.f9981a, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e implements Callable<k<v7.d>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f9983a;

        e(String str) {
            this.f9983a = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public k<v7.d> call() {
            return LottieAnimationView.this.f9973p ? v7.e.f(LottieAnimationView.this.getContext(), this.f9983a) : v7.e.g(LottieAnimationView.this.getContext(), this.f9983a, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public class f<T> extends i8.c<T> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ i8.e f9985c;

        f(LottieAnimationView lottieAnimationView, i8.e eVar) {
            this.f9985c = eVar;
        }

        @Override // i8.c
        public T a(i8.b<T> bVar) {
            return (T) this.f9985c.a(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class g {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f9986a;

        static {
            int[] iArr = new int[com.airbnb.lottie.c.values().length];
            f9986a = iArr;
            try {
                iArr[com.airbnb.lottie.c.HARDWARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9986a[com.airbnb.lottie.c.SOFTWARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9986a[com.airbnb.lottie.c.AUTOMATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class h extends View.BaseSavedState {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        String f9987a;

        /* renamed from: b  reason: collision with root package name */
        int f9988b;

        /* renamed from: c  reason: collision with root package name */
        float f9989c;

        /* renamed from: d  reason: collision with root package name */
        boolean f9990d;

        /* renamed from: e  reason: collision with root package name */
        String f9991e;

        /* renamed from: f  reason: collision with root package name */
        int f9992f;

        /* renamed from: g  reason: collision with root package name */
        int f9993g;

        /* loaded from: classes.dex */
        class a implements Parcelable.Creator<h> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public h createFromParcel(Parcel parcel) {
                return new h(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public h[] newArray(int i11) {
                return new h[i11];
            }
        }

        /* synthetic */ h(Parcel parcel, a aVar) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeString(this.f9987a);
            parcel.writeFloat(this.f9989c);
            parcel.writeInt(this.f9990d ? 1 : 0);
            parcel.writeString(this.f9991e);
            parcel.writeInt(this.f9992f);
            parcel.writeInt(this.f9993g);
        }

        h(Parcelable parcelable) {
            super(parcelable);
        }

        private h(Parcel parcel) {
            super(parcel);
            this.f9987a = parcel.readString();
            this.f9989c = parcel.readFloat();
            this.f9990d = parcel.readInt() == 1;
            this.f9991e = parcel.readString();
            this.f9992f = parcel.readInt();
            this.f9993g = parcel.readInt();
        }
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9960c = new b();
        this.f9961d = new c();
        this.f9963f = 0;
        this.f9964g = new com.airbnb.lottie.a();
        this.f9968k = false;
        this.f9969l = false;
        this.f9970m = false;
        this.f9971n = false;
        this.f9972o = false;
        this.f9973p = true;
        this.f9974q = com.airbnb.lottie.c.AUTOMATIC;
        this.f9975t = new HashSet();
        this.f9976w = 0;
        q(attributeSet, m.f54311a);
    }

    private void k() {
        com.airbnb.lottie.b<v7.d> bVar = this.f9977x;
        if (bVar != null) {
            bVar.k(this.f9960c);
            this.f9977x.j(this.f9961d);
        }
    }

    private void l() {
        this.f9978y = null;
        this.f9964g.j();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0044, code lost:
        if (r3 != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void n() {
        /*
            r5 = this;
            int[] r0 = com.airbnb.lottie.LottieAnimationView.g.f9986a
            com.airbnb.lottie.c r1 = r5.f9974q
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 2
            r2 = 1
            if (r0 == r2) goto L46
            if (r0 == r1) goto L13
            r3 = 3
            if (r0 == r3) goto L15
        L13:
            r1 = r2
            goto L46
        L15:
            v7.d r0 = r5.f9978y
            r3 = 0
            if (r0 == 0) goto L27
            boolean r0 = r0.q()
            if (r0 == 0) goto L27
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 28
            if (r0 >= r4) goto L27
            goto L44
        L27:
            v7.d r0 = r5.f9978y
            if (r0 == 0) goto L33
            int r0 = r0.m()
            r4 = 4
            if (r0 <= r4) goto L33
            goto L44
        L33:
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 21
            if (r0 >= r4) goto L3a
            goto L44
        L3a:
            r4 = 24
            if (r0 == r4) goto L44
            r4 = 25
            if (r0 != r4) goto L43
            goto L44
        L43:
            r3 = r2
        L44:
            if (r3 == 0) goto L13
        L46:
            int r0 = r5.getLayerType()
            if (r1 == r0) goto L50
            r0 = 0
            r5.setLayerType(r1, r0)
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.LottieAnimationView.n():void");
    }

    private com.airbnb.lottie.b<v7.d> o(String str) {
        if (isInEditMode()) {
            return new com.airbnb.lottie.b<>(new e(str), true);
        }
        return this.f9973p ? v7.e.d(getContext(), str) : v7.e.e(getContext(), str, null);
    }

    private com.airbnb.lottie.b<v7.d> p(int i11) {
        if (isInEditMode()) {
            return new com.airbnb.lottie.b<>(new d(i11), true);
        }
        return this.f9973p ? v7.e.m(getContext(), i11) : v7.e.n(getContext(), i11, null);
    }

    private void q(AttributeSet attributeSet, int i11) {
        String string;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, n.f54312a, i11, 0);
        this.f9973p = obtainStyledAttributes.getBoolean(n.f54314c, true);
        int i12 = n.f54323l;
        boolean hasValue = obtainStyledAttributes.hasValue(i12);
        int i13 = n.f54318g;
        boolean hasValue2 = obtainStyledAttributes.hasValue(i13);
        int i14 = n.f54329r;
        boolean hasValue3 = obtainStyledAttributes.hasValue(i14);
        if (hasValue && hasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (hasValue) {
            int resourceId = obtainStyledAttributes.getResourceId(i12, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (hasValue2) {
            String string2 = obtainStyledAttributes.getString(i13);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (hasValue3 && (string = obtainStyledAttributes.getString(i14)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(obtainStyledAttributes.getResourceId(n.f54317f, 0));
        if (obtainStyledAttributes.getBoolean(n.f54313b, false)) {
            this.f9970m = true;
            this.f9972o = true;
        }
        if (obtainStyledAttributes.getBoolean(n.f54321j, false)) {
            this.f9964g.i0(-1);
        }
        int i15 = n.f54326o;
        if (obtainStyledAttributes.hasValue(i15)) {
            setRepeatMode(obtainStyledAttributes.getInt(i15, 1));
        }
        int i16 = n.f54325n;
        if (obtainStyledAttributes.hasValue(i16)) {
            setRepeatCount(obtainStyledAttributes.getInt(i16, -1));
        }
        int i17 = n.f54328q;
        if (obtainStyledAttributes.hasValue(i17)) {
            setSpeed(obtainStyledAttributes.getFloat(i17, 1.0f));
        }
        setImageAssetsFolder(obtainStyledAttributes.getString(n.f54320i));
        setProgress(obtainStyledAttributes.getFloat(n.f54322k, BitmapDescriptorFactory.HUE_RED));
        m(obtainStyledAttributes.getBoolean(n.f54316e, false));
        int i18 = n.f54315d;
        if (obtainStyledAttributes.hasValue(i18)) {
            h(new a8.e("**"), j.K, new i8.c(new o(h.a.c(getContext(), obtainStyledAttributes.getResourceId(i18, -1)).getDefaultColor())));
        }
        int i19 = n.f54327p;
        if (obtainStyledAttributes.hasValue(i19)) {
            this.f9964g.l0(obtainStyledAttributes.getFloat(i19, 1.0f));
        }
        int i21 = n.f54324m;
        if (obtainStyledAttributes.hasValue(i21)) {
            com.airbnb.lottie.c cVar = com.airbnb.lottie.c.AUTOMATIC;
            int i22 = obtainStyledAttributes.getInt(i21, cVar.ordinal());
            if (i22 >= com.airbnb.lottie.c.values().length) {
                i22 = cVar.ordinal();
            }
            setRenderMode(com.airbnb.lottie.c.values()[i22]);
        }
        setIgnoreDisabledSystemAnimations(obtainStyledAttributes.getBoolean(n.f54319h, false));
        obtainStyledAttributes.recycle();
        this.f9964g.n0(Boolean.valueOf(h8.h.f(getContext()) != BitmapDescriptorFactory.HUE_RED));
        n();
        this.f9965h = true;
    }

    private void setCompositionTask(com.airbnb.lottie.b<v7.d> bVar) {
        l();
        k();
        this.f9977x = bVar.f(this.f9960c).e(this.f9961d);
    }

    private void z() {
        boolean r11 = r();
        setImageDrawable(null);
        setImageDrawable(this.f9964g);
        if (r11) {
            this.f9964g.P();
        }
    }

    @Override // android.view.View
    public void buildDrawingCache(boolean z11) {
        v7.c.a("buildDrawingCache");
        this.f9976w++;
        super.buildDrawingCache(z11);
        if (this.f9976w == 1 && getWidth() > 0 && getHeight() > 0 && getLayerType() == 1 && getDrawingCache(z11) == null) {
            setRenderMode(com.airbnb.lottie.c.HARDWARE);
        }
        this.f9976w--;
        v7.c.b("buildDrawingCache");
    }

    public void g(Animator.AnimatorListener animatorListener) {
        this.f9964g.c(animatorListener);
    }

    public v7.d getComposition() {
        return this.f9978y;
    }

    public long getDuration() {
        v7.d dVar = this.f9978y;
        if (dVar != null) {
            return dVar.d();
        }
        return 0L;
    }

    public int getFrame() {
        return this.f9964g.t();
    }

    public String getImageAssetsFolder() {
        return this.f9964g.w();
    }

    public float getMaxFrame() {
        return this.f9964g.x();
    }

    public float getMinFrame() {
        return this.f9964g.z();
    }

    public l getPerformanceTracker() {
        return this.f9964g.A();
    }

    public float getProgress() {
        return this.f9964g.B();
    }

    public int getRepeatCount() {
        return this.f9964g.C();
    }

    public int getRepeatMode() {
        return this.f9964g.D();
    }

    public float getScale() {
        return this.f9964g.E();
    }

    public float getSpeed() {
        return this.f9964g.F();
    }

    public <T> void h(a8.e eVar, T t11, i8.c<T> cVar) {
        this.f9964g.d(eVar, t11, cVar);
    }

    public <T> void i(a8.e eVar, T t11, i8.e<T> eVar2) {
        this.f9964g.d(eVar, t11, new f(this, eVar2));
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        com.airbnb.lottie.a aVar = this.f9964g;
        if (drawable2 == aVar) {
            super.invalidateDrawable(aVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public void j() {
        this.f9970m = false;
        this.f9969l = false;
        this.f9968k = false;
        this.f9964g.i();
        n();
    }

    public void m(boolean z11) {
        this.f9964g.n(z11);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode() && (this.f9972o || this.f9970m)) {
            t();
            this.f9972o = false;
            this.f9970m = false;
        }
        if (Build.VERSION.SDK_INT < 23) {
            onVisibilityChanged(this, getVisibility());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        if (r()) {
            j();
            this.f9970m = true;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.getSuperState());
        String str = hVar.f9987a;
        this.f9966i = str;
        if (!TextUtils.isEmpty(str)) {
            setAnimation(this.f9966i);
        }
        int i11 = hVar.f9988b;
        this.f9967j = i11;
        if (i11 != 0) {
            setAnimation(i11);
        }
        setProgress(hVar.f9989c);
        if (hVar.f9990d) {
            t();
        }
        this.f9964g.W(hVar.f9991e);
        setRepeatMode(hVar.f9992f);
        setRepeatCount(hVar.f9993g);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        h hVar = new h(super.onSaveInstanceState());
        hVar.f9987a = this.f9966i;
        hVar.f9988b = this.f9967j;
        hVar.f9989c = this.f9964g.B();
        hVar.f9990d = this.f9964g.I() || (!a0.Y(this) && this.f9970m);
        hVar.f9991e = this.f9964g.w();
        hVar.f9992f = this.f9964g.D();
        hVar.f9993g = this.f9964g.C();
        return hVar;
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i11) {
        if (this.f9965h) {
            if (isShown()) {
                if (this.f9969l) {
                    w();
                } else if (this.f9968k) {
                    t();
                }
                this.f9969l = false;
                this.f9968k = false;
            } else if (r()) {
                s();
                this.f9969l = true;
            }
        }
    }

    public boolean r() {
        return this.f9964g.I();
    }

    public void s() {
        this.f9972o = false;
        this.f9970m = false;
        this.f9969l = false;
        this.f9968k = false;
        this.f9964g.K();
        n();
    }

    public void setAnimation(int i11) {
        this.f9967j = i11;
        this.f9966i = null;
        setCompositionTask(p(i11));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        y(str, null);
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(this.f9973p ? v7.e.q(getContext(), str) : v7.e.r(getContext(), str, null));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z11) {
        this.f9964g.Q(z11);
    }

    public void setCacheComposition(boolean z11) {
        this.f9973p = z11;
    }

    public void setComposition(v7.d dVar) {
        if (v7.c.f54232a) {
            String str = f9959z;
            Log.v(str, "Set Composition \n" + dVar);
        }
        this.f9964g.setCallback(this);
        this.f9978y = dVar;
        this.f9971n = true;
        boolean R = this.f9964g.R(dVar);
        this.f9971n = false;
        n();
        if (getDrawable() != this.f9964g || R) {
            if (!R) {
                z();
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            for (i iVar : this.f9975t) {
                iVar.a(dVar);
            }
        }
    }

    public void setFailureListener(v7.g<Throwable> gVar) {
        this.f9962e = gVar;
    }

    public void setFallbackResource(int i11) {
        this.f9963f = i11;
    }

    public void setFontAssetDelegate(v7.a aVar) {
        this.f9964g.S(aVar);
    }

    public void setFrame(int i11) {
        this.f9964g.T(i11);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z11) {
        this.f9964g.U(z11);
    }

    public void setImageAssetDelegate(v7.b bVar) {
        this.f9964g.V(bVar);
    }

    public void setImageAssetsFolder(String str) {
        this.f9964g.W(str);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        k();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        k();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i11) {
        k();
        super.setImageResource(i11);
    }

    public void setMaxFrame(int i11) {
        this.f9964g.X(i11);
    }

    public void setMaxProgress(float f11) {
        this.f9964g.Z(f11);
    }

    public void setMinAndMaxFrame(String str) {
        this.f9964g.b0(str);
    }

    public void setMinFrame(int i11) {
        this.f9964g.c0(i11);
    }

    public void setMinProgress(float f11) {
        this.f9964g.e0(f11);
    }

    public void setOutlineMasksAndMattes(boolean z11) {
        this.f9964g.f0(z11);
    }

    public void setPerformanceTrackingEnabled(boolean z11) {
        this.f9964g.g0(z11);
    }

    public void setProgress(float f11) {
        this.f9964g.h0(f11);
    }

    public void setRenderMode(com.airbnb.lottie.c cVar) {
        this.f9974q = cVar;
        n();
    }

    public void setRepeatCount(int i11) {
        this.f9964g.i0(i11);
    }

    public void setRepeatMode(int i11) {
        this.f9964g.j0(i11);
    }

    public void setSafeMode(boolean z11) {
        this.f9964g.k0(z11);
    }

    public void setScale(float f11) {
        this.f9964g.l0(f11);
        if (getDrawable() == this.f9964g) {
            z();
        }
    }

    public void setSpeed(float f11) {
        this.f9964g.m0(f11);
    }

    public void setTextDelegate(p pVar) {
        this.f9964g.o0(pVar);
    }

    public void t() {
        if (isShown()) {
            this.f9964g.L();
            n();
            return;
        }
        this.f9968k = true;
    }

    public void u() {
        this.f9964g.M();
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        com.airbnb.lottie.a aVar;
        if (!this.f9971n && drawable == (aVar = this.f9964g) && aVar.I()) {
            s();
        } else if (!this.f9971n && (drawable instanceof com.airbnb.lottie.a)) {
            com.airbnb.lottie.a aVar2 = (com.airbnb.lottie.a) drawable;
            if (aVar2.I()) {
                aVar2.K();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public void v() {
        this.f9964g.N();
    }

    public void w() {
        if (isShown()) {
            this.f9964g.P();
            n();
            return;
        }
        this.f9968k = false;
        this.f9969l = true;
    }

    public void x(InputStream inputStream, String str) {
        setCompositionTask(v7.e.h(inputStream, str));
    }

    public void y(String str, String str2) {
        x(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void setMaxFrame(String str) {
        this.f9964g.Y(str);
    }

    public void setMinFrame(String str) {
        this.f9964g.d0(str);
    }

    public void setAnimation(String str) {
        this.f9966i = str;
        this.f9967j = 0;
        setCompositionTask(o(str));
    }
}