package com.reactnativestripesdk.pushprovisioning;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.bumptech.glide.k;
import com.bumptech.glide.load.engine.GlideException;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.n0;
import kotlin.jvm.internal.s;
import vz.b0;

/* loaded from: classes2.dex */
public final class b extends AppCompatImageView {

    /* renamed from: c */
    private final n0 f20340c;

    /* renamed from: d */
    private final k f20341d;

    /* renamed from: e */
    private ReadableMap f20342e;

    /* renamed from: f */
    private String f20343f;

    /* renamed from: g */
    private ReadableMap f20344g;

    /* renamed from: h */
    private ReadableMap f20345h;

    /* renamed from: i */
    private com.facebook.react.uimanager.events.d f20346i;

    /* renamed from: j */
    private na.g f20347j;

    /* renamed from: k */
    private int f20348k;

    /* renamed from: l */
    private int f20349l;

    /* loaded from: classes2.dex */
    public static final class a implements com.bumptech.glide.request.g<Drawable> {

        /* renamed from: b */
        final /* synthetic */ na.g f20351b;

        a(na.g gVar) {
            b.this = r1;
            this.f20351b = gVar;
        }

        @Override // com.bumptech.glide.request.g
        /* renamed from: a */
        public boolean onResourceReady(Drawable drawable, Object obj, ya.k<Drawable> kVar, com.bumptech.glide.load.a aVar, boolean z11) {
            b.this.setImageDrawable(new RippleDrawable(ColorStateList.valueOf(Color.parseColor("#e0e0e0")), drawable, null));
            return true;
        }

        @Override // com.bumptech.glide.request.g
        public boolean onLoadFailed(GlideException glideException, Object obj, ya.k<Drawable> kVar, boolean z11) {
            b.this.f(hr.a.d("Failed", s.p("Failed to load the source from ", this.f20351b)));
            return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(n0 context, k requestManager) {
        super(context);
        s.g(context, "context");
        s.g(requestManager, "requestManager");
        this.f20340c = context;
        this.f20341d = requestManager;
        UIManagerModule uIManagerModule = (UIManagerModule) context.getNativeModule(UIManagerModule.class);
        this.f20346i = uIManagerModule == null ? null : uIManagerModule.getEventDispatcher();
        setOnTouchListener(new View.OnTouchListener() { // from class: com.reactnativestripesdk.pushprovisioning.a
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return b.c(view, motionEvent);
            }
        });
    }

    public static /* synthetic */ boolean c(View view, MotionEvent motionEvent) {
        return d(view, motionEvent);
    }

    public static final boolean d(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            view.performClick();
            return true;
        }
        return false;
    }

    private final na.g e(ReadableMap readableMap) {
        String string = readableMap == null ? null : readableMap.getString("uri");
        if (string == null) {
            return null;
        }
        return new na.g(string);
    }

    public final void f(WritableMap writableMap) {
        com.facebook.react.uimanager.events.d dVar = this.f20346i;
        if (dVar == null) {
            return;
        }
        dVar.g(new c(getId(), writableMap));
    }

    public final void g() {
        na.g e11 = e(this.f20344g);
        if (e11 == null) {
            this.f20341d.clear(this);
            setImageDrawable(null);
            this.f20347j = null;
        } else if (!s.c(e11, this.f20347j) || this.f20348k > 0 || this.f20349l > 0) {
            this.f20347j = e11;
            ReadableMap readableMap = this.f20344g;
            double d11 = readableMap == null ? 1.0d : readableMap.getDouble("scale");
            this.f20341d.asDrawable().mo99load((Object) e11).addListener(new a(e11)).centerCrop().override((int) (this.f20349l * d11), (int) (this.f20348k * d11)).into(this);
        }
    }

    public final void h() {
        this.f20341d.clear(this);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        if (i11 <= 0 || i12 <= 0) {
            return;
        }
        this.f20348k = i12;
        this.f20349l = i11;
        g();
        this.f20348k = 0;
        this.f20349l = 0;
    }

    @Override // android.view.View
    public boolean performClick() {
        String string;
        super.performClick();
        ReadableMap readableMap = this.f20342e;
        b0 b0Var = null;
        if (readableMap != null && (string = readableMap.getString("description")) != null) {
            String str = this.f20343f;
            if (str != null) {
                f fVar = f.f20353a;
                ReactApplicationContext b11 = this.f20340c.b();
                s.f(b11, "context.reactApplicationContext");
                fVar.e(b11, this, string, str, this.f20345h);
                b0Var = b0.f54756a;
            }
            if (b0Var == null) {
                f(hr.a.d("Failed", "Missing parameters. `ephemeralKey` must be supplied in the props to <AddToWalletButton />"));
            }
            b0Var = b0.f54756a;
        }
        if (b0Var == null) {
            f(hr.a.d("Failed", "Missing parameters. `cardDetails.cardDescription` must be supplied in the props to <AddToWalletButton />"));
            return true;
        }
        return true;
    }

    public final void setCardDetails(ReadableMap detailsMap) {
        s.g(detailsMap, "detailsMap");
        this.f20342e = detailsMap;
    }

    public final void setEphemeralKey(ReadableMap map) {
        s.g(map, "map");
        this.f20343f = map.toHashMap().toString();
    }

    public final void setSourceMap(ReadableMap map) {
        s.g(map, "map");
        this.f20344g = map;
    }

    public final void setToken(ReadableMap readableMap) {
        this.f20345h = readableMap;
    }
}