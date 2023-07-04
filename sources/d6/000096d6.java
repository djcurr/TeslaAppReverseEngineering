package org.godotengine.godot;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import org.godotengine.godot.input.GodotGestureHandler;
import org.godotengine.godot.input.GodotInputHandler;
import org.godotengine.godot.utils.GLUtils;
import org.godotengine.godot.xr.XRMode;
import org.godotengine.godot.xr.ovr.OvrConfigChooser;
import org.godotengine.godot.xr.ovr.OvrContextFactory;
import org.godotengine.godot.xr.ovr.OvrWindowSurfaceFactory;
import org.godotengine.godot.xr.regular.RegularConfigChooser;
import org.godotengine.godot.xr.regular.RegularContextFactory;
import org.godotengine.godot.xr.regular.RegularFallbackConfigChooser;

/* loaded from: classes5.dex */
public class GodotView extends GLSurfaceView {
    private static String TAG = GodotView.class.getSimpleName();
    private final GestureDetector detector;
    private final Godot godot;
    private final GodotRenderer godotRenderer;
    private final GodotInputHandler inputHandler;

    /* renamed from: org.godotengine.godot.GodotView$3 */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$org$godotengine$godot$xr$XRMode;

        static {
            int[] iArr = new int[XRMode.values().length];
            $SwitchMap$org$godotengine$godot$xr$XRMode = iArr;
            try {
                iArr[XRMode.OVR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$godotengine$godot$xr$XRMode[XRMode.REGULAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public GodotView(Context context, Godot godot, XRMode xRMode, boolean z11, boolean z12, boolean z13) {
        super(context);
        GLUtils.use_gl3 = z11;
        GLUtils.use_32 = z12;
        GLUtils.use_debug_opengl = z13;
        this.godot = godot;
        this.inputHandler = new GodotInputHandler(this);
        this.detector = new GestureDetector(context, new GodotGestureHandler(this));
        this.godotRenderer = new GodotRenderer();
        init(xRMode, false, 16, 0);
    }

    private void init(XRMode xRMode, boolean z11, int i11, int i12) {
        setPreserveEGLContextOnPause(true);
        setFocusableInTouchMode(true);
        if (AnonymousClass3.$SwitchMap$org$godotengine$godot$xr$XRMode[xRMode.ordinal()] != 1) {
            if (z11) {
                getHolder().setFormat(-3);
            }
            setEGLContextFactory(new RegularContextFactory());
            if (GLUtils.use_32) {
                setEGLConfigChooser(z11 ? new RegularFallbackConfigChooser(8, 8, 8, 8, 24, i12, new RegularConfigChooser(8, 8, 8, 8, 16, i12)) : new RegularFallbackConfigChooser(8, 8, 8, 8, 24, i12, new RegularConfigChooser(5, 6, 5, 0, 16, i12)));
            } else {
                setEGLConfigChooser(z11 ? new RegularConfigChooser(8, 8, 8, 8, 16, i12) : new RegularConfigChooser(8, 8, 8, 0, 16, i12));
            }
        } else {
            setEGLConfigChooser(new OvrConfigChooser());
            setEGLContextFactory(new OvrContextFactory());
            setEGLWindowSurfaceFactory(new OvrWindowSurfaceFactory());
        }
        setRenderer(this.godotRenderer);
    }

    public void initInputDevices() {
        this.inputHandler.initInputDevices();
    }

    public void onBackPressed() {
        this.godot.onBackPressed();
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        return this.inputHandler.onGenericMotionEvent(motionEvent) || super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i11, KeyEvent keyEvent) {
        return this.inputHandler.onKeyDown(i11, keyEvent) || super.onKeyDown(i11, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        return this.inputHandler.onKeyUp(i11, keyEvent) || super.onKeyUp(i11, keyEvent);
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
        super.onPause();
        queueEvent(new Runnable() { // from class: org.godotengine.godot.GodotView.2
            {
                GodotView.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                GodotLib.focusout();
                GodotView.this.godotRenderer.onActivityPaused();
            }
        });
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        super.onResume();
        queueEvent(new Runnable() { // from class: org.godotengine.godot.GodotView.1
            {
                GodotView.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                GodotView.this.godotRenderer.onActivityResumed();
                GodotLib.focusin();
            }
        });
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        this.detector.onTouchEvent(motionEvent);
        return this.godot.gotTouchEvent(motionEvent);
    }
}