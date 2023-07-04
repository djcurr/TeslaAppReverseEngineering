package com.facebook.react.uimanager.events;

import android.view.MotionEvent;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.SoftAssertions;

/* loaded from: classes3.dex */
public class j extends c<j> {

    /* renamed from: f  reason: collision with root package name */
    private static final String f12282f = "j";

    /* renamed from: g  reason: collision with root package name */
    private static final v3.g<j> f12283g = new v3.g<>(3);

    /* renamed from: a  reason: collision with root package name */
    private MotionEvent f12284a;

    /* renamed from: b  reason: collision with root package name */
    private l f12285b;

    /* renamed from: c  reason: collision with root package name */
    private short f12286c;

    /* renamed from: d  reason: collision with root package name */
    private float f12287d;

    /* renamed from: e  reason: collision with root package name */
    private float f12288e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f12289a;

        static {
            int[] iArr = new int[l.values().length];
            f12289a = iArr;
            try {
                iArr[l.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12289a[l.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12289a[l.CANCEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12289a[l.MOVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private j() {
    }

    private void e(int i11, int i12, l lVar, MotionEvent motionEvent, long j11, float f11, float f12, k kVar) {
        super.init(i11, i12, motionEvent.getEventTime());
        short s11 = 0;
        SoftAssertions.assertCondition(j11 != Long.MIN_VALUE, "Gesture start time must be initialized");
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            kVar.a(j11);
        } else if (action == 1) {
            kVar.e(j11);
        } else if (action == 2) {
            s11 = kVar.b(j11);
        } else if (action == 3) {
            kVar.e(j11);
        } else if (action != 5 && action != 6) {
            throw new RuntimeException("Unhandled MotionEvent action: " + action);
        } else {
            kVar.d(j11);
        }
        this.f12285b = lVar;
        this.f12284a = MotionEvent.obtain(motionEvent);
        this.f12286c = s11;
        this.f12287d = f11;
        this.f12288e = f12;
    }

    public static j f(int i11, int i12, l lVar, MotionEvent motionEvent, long j11, float f11, float f12, k kVar) {
        j b11 = f12283g.b();
        if (b11 == null) {
            b11 = new j();
        }
        b11.e(i11, i12, lVar, (MotionEvent) wf.a.c(motionEvent), j11, f11, f12, kVar);
        return b11;
    }

    private boolean g() {
        if (this.f12284a == null) {
            ReactSoftExceptionLogger.logSoftException(f12282f, new IllegalStateException("Cannot dispatch a TouchEvent that has no MotionEvent; the TouchEvent has been recycled"));
            return false;
        }
        return true;
    }

    public MotionEvent a() {
        wf.a.c(this.f12284a);
        return this.f12284a;
    }

    public l b() {
        return (l) wf.a.c(this.f12285b);
    }

    public float c() {
        return this.f12287d;
    }

    @Override // com.facebook.react.uimanager.events.c
    public boolean canCoalesce() {
        int i11 = a.f12289a[((l) wf.a.c(this.f12285b)).ordinal()];
        if (i11 == 1 || i11 == 2 || i11 == 3) {
            return false;
        }
        if (i11 == 4) {
            return true;
        }
        throw new RuntimeException("Unknown touch event type: " + this.f12285b);
    }

    public float d() {
        return this.f12288e;
    }

    @Override // com.facebook.react.uimanager.events.c
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        if (g()) {
            m.d(rCTEventEmitter, this);
        }
    }

    @Override // com.facebook.react.uimanager.events.c
    public void dispatchModern(RCTModernEventEmitter rCTModernEventEmitter) {
        if (g()) {
            rCTModernEventEmitter.receiveTouches(this);
        }
    }

    @Override // com.facebook.react.uimanager.events.c
    public short getCoalescingKey() {
        return this.f12286c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.events.c
    public int getEventCategory() {
        l lVar = this.f12285b;
        if (lVar == null) {
            return 2;
        }
        int i11 = a.f12289a[lVar.ordinal()];
        if (i11 != 1) {
            if (i11 == 2 || i11 == 3) {
                return 1;
            }
            if (i11 != 4) {
                return super.getEventCategory();
            }
            return 4;
        }
        return 0;
    }

    @Override // com.facebook.react.uimanager.events.c
    public String getEventName() {
        return l.getJSEventName((l) wf.a.c(this.f12285b));
    }

    @Override // com.facebook.react.uimanager.events.c
    public void onDispose() {
        MotionEvent motionEvent = this.f12284a;
        this.f12284a = null;
        if (motionEvent != null) {
            motionEvent.recycle();
        }
        try {
            f12283g.a(this);
        } catch (IllegalStateException e11) {
            ReactSoftExceptionLogger.logSoftException(f12282f, e11);
        }
    }
}