package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.UIManagerModule;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.horcrux.svg.SVGLength;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public abstract class VirtualView extends com.facebook.react.views.view.g {
    private static final int CLIP_RULE_EVENODD = 0;
    static final int CLIP_RULE_NONZERO = 1;
    private static final double M_SQRT1_2l = 0.7071067811865476d;
    private static final float[] sRawMatrix = {1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f};
    private double canvasDiagonal;
    private float canvasHeight;
    private float canvasWidth;
    ArrayList<s> elements;
    private double fontSize;
    private j glyphContext;
    RectF mBox;
    Matrix mCTM;
    boolean mCTMInvertible;
    private Path mCachedClipPath;
    private RectF mClientRect;
    RectF mClipBounds;
    private String mClipPath;
    Region mClipRegion;
    Path mClipRegionPath;
    int mClipRule;
    final ReactContext mContext;
    String mDisplay;
    RectF mFillBounds;
    Path mFillPath;
    Matrix mInvCTM;
    Matrix mInvMatrix;
    final Matrix mInvTransform;
    boolean mInvertible;
    RectF mMarkerBounds;
    String mMarkerEnd;
    String mMarkerMid;
    Path mMarkerPath;
    Region mMarkerRegion;
    String mMarkerStart;
    String mMask;
    Matrix mMatrix;
    String mName;
    private boolean mOnLayout;
    float mOpacity;
    Path mPath;
    com.facebook.react.uimanager.q mPointerEvents;
    Region mRegion;
    private boolean mResponsible;
    final float mScale;
    RectF mStrokeBounds;
    Path mStrokePath;
    Region mStrokeRegion;
    private l mTextRoot;
    Matrix mTransform;
    boolean mTransformInvertible;
    private SvgView svgView;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f17537a;

        static {
            int[] iArr = new int[SVGLength.UnitType.values().length];
            f17537a = iArr;
            try {
                iArr[SVGLength.UnitType.EMS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17537a[SVGLength.UnitType.EXS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17537a[SVGLength.UnitType.CM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17537a[SVGLength.UnitType.MM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17537a[SVGLength.UnitType.IN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17537a[SVGLength.UnitType.PT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17537a[SVGLength.UnitType.PC.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public VirtualView(ReactContext reactContext) {
        super(reactContext);
        this.mOpacity = 1.0f;
        this.mCTM = new Matrix();
        this.mMatrix = new Matrix();
        this.mTransform = new Matrix();
        this.mInvCTM = new Matrix();
        this.mInvMatrix = new Matrix();
        this.mInvTransform = new Matrix();
        this.mInvertible = true;
        this.mCTMInvertible = true;
        this.mTransformInvertible = true;
        this.fontSize = -1.0d;
        this.canvasDiagonal = -1.0d;
        this.canvasHeight = -1.0f;
        this.canvasWidth = -1.0f;
        this.mContext = reactContext;
        this.mScale = com.facebook.react.uimanager.c.c().density;
    }

    private void clearParentCache() {
        VirtualView virtualView = this;
        while (true) {
            ViewParent parent = virtualView.getParent();
            if (!(parent instanceof VirtualView)) {
                return;
            }
            virtualView = (VirtualView) parent;
            if (virtualView.mPath == null) {
                return;
            }
            virtualView.clearCache();
        }
    }

    private double fromRelativeFast(SVGLength sVGLength) {
        double fontSizeFromContext;
        switch (a.f17537a[sVGLength.f17528b.ordinal()]) {
            case 1:
                fontSizeFromContext = getFontSizeFromContext();
                break;
            case 2:
                fontSizeFromContext = getFontSizeFromContext() / 2.0d;
                break;
            case 3:
                fontSizeFromContext = 35.43307d;
                break;
            case 4:
                fontSizeFromContext = 3.543307d;
                break;
            case 5:
                fontSizeFromContext = 90.0d;
                break;
            case 6:
                fontSizeFromContext = 1.25d;
                break;
            case 7:
                fontSizeFromContext = 15.0d;
                break;
            default:
                fontSizeFromContext = 1.0d;
                break;
        }
        return sVGLength.f17527a * fontSizeFromContext * this.mScale;
    }

    private double getCanvasDiagonal() {
        double d11 = this.canvasDiagonal;
        if (d11 != -1.0d) {
            return d11;
        }
        double sqrt = Math.sqrt(Math.pow(getCanvasWidth(), 2.0d) + Math.pow(getCanvasHeight(), 2.0d)) * M_SQRT1_2l;
        this.canvasDiagonal = sqrt;
        return sqrt;
    }

    private float getCanvasHeight() {
        float f11 = this.canvasHeight;
        if (f11 != -1.0f) {
            return f11;
        }
        l textRoot = getTextRoot();
        if (textRoot == null) {
            this.canvasHeight = getSvgView().getCanvasBounds().height();
        } else {
            this.canvasHeight = textRoot.f().d();
        }
        return this.canvasHeight;
    }

    private float getCanvasWidth() {
        float f11 = this.canvasWidth;
        if (f11 != -1.0f) {
            return f11;
        }
        l textRoot = getTextRoot();
        if (textRoot == null) {
            this.canvasWidth = getSvgView().getCanvasBounds().width();
        } else {
            this.canvasWidth = textRoot.f().g();
        }
        return this.canvasWidth;
    }

    private double getFontSizeFromContext() {
        double d11 = this.fontSize;
        if (d11 != -1.0d) {
            return d11;
        }
        l textRoot = getTextRoot();
        if (textRoot == null) {
            return 12.0d;
        }
        if (this.glyphContext == null) {
            this.glyphContext = textRoot.f();
        }
        double c11 = this.glyphContext.c();
        this.fontSize = c11;
        return c11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void clearCache() {
        this.canvasDiagonal = -1.0d;
        this.canvasHeight = -1.0f;
        this.canvasWidth = -1.0f;
        this.fontSize = -1.0d;
        this.mStrokeRegion = null;
        this.mMarkerRegion = null;
        this.mRegion = null;
        this.mPath = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void clearChildCache() {
        clearCache();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof VirtualView) {
                ((VirtualView) childAt).clearChildCache();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void clip(Canvas canvas, Paint paint) {
        Path clipPath = getClipPath(canvas, paint);
        if (clipPath != null) {
            canvas.clipPath(clipPath);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void draw(Canvas canvas, Paint paint, float f11);

    /* JADX INFO: Access modifiers changed from: package-private */
    public RectF getClientRect() {
        return this.mClientRect;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Path getClipPath() {
        return this.mCachedClipPath;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l getParentTextRoot() {
        ViewParent parent = getParent();
        if (parent instanceof VirtualView) {
            return ((VirtualView) parent).getTextRoot();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Path getPath(Canvas canvas, Paint paint);

    /* JADX INFO: Access modifiers changed from: package-private */
    public SvgView getSvgView() {
        SvgView svgView = this.svgView;
        if (svgView != null) {
            return svgView;
        }
        ViewParent parent = getParent();
        if (parent == null) {
            return null;
        }
        if (parent instanceof SvgView) {
            this.svgView = (SvgView) parent;
        } else if (parent instanceof VirtualView) {
            this.svgView = ((VirtualView) parent).getSvgView();
        } else {
            nd.a.j("ReactNative", "RNSVG: " + getClass().getName() + " should be descendant of a SvgView.");
        }
        return this.svgView;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l getTextRoot() {
        if (this.mTextRoot == null) {
            VirtualView virtualView = this;
            while (true) {
                if (virtualView == null) {
                    break;
                }
                if (virtualView instanceof l) {
                    l lVar = (l) virtualView;
                    if (lVar.f() != null) {
                        this.mTextRoot = lVar;
                        break;
                    }
                }
                ViewParent parent = virtualView.getParent();
                virtualView = !(parent instanceof VirtualView) ? null : (VirtualView) parent;
            }
        }
        return this.mTextRoot;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int hitTest(float[] fArr);

    @Override // android.view.View
    public void invalidate() {
        if ((this instanceof RenderableView) && this.mPath == null) {
            return;
        }
        clearCache();
        clearParentCache();
        super.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isResponsible() {
        return this.mResponsible;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.views.view.g, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        RectF rectF = this.mClientRect;
        if (rectF == null) {
            return;
        }
        if (!(this instanceof l)) {
            setLeft((int) Math.floor(rectF.left));
            setTop((int) Math.floor(this.mClientRect.top));
            setRight((int) Math.ceil(this.mClientRect.right));
            setBottom((int) Math.ceil(this.mClientRect.bottom));
        }
        setMeasuredDimension((int) Math.ceil(this.mClientRect.width()), (int) Math.ceil(this.mClientRect.height()));
    }

    @Override // com.facebook.react.views.view.g, android.view.View
    protected void onMeasure(int i11, int i12) {
        int defaultSize;
        int defaultSize2;
        RectF rectF = this.mClientRect;
        if (rectF != null) {
            defaultSize = (int) Math.ceil(rectF.width());
        } else {
            defaultSize = ViewGroup.getDefaultSize(getSuggestedMinimumWidth(), i11);
        }
        RectF rectF2 = this.mClientRect;
        if (rectF2 != null) {
            defaultSize2 = (int) Math.ceil(rectF2.height());
        } else {
            defaultSize2 = ViewGroup.getDefaultSize(getSuggestedMinimumHeight(), i12);
        }
        setMeasuredDimension(defaultSize, defaultSize2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public double relativeOnHeight(SVGLength sVGLength) {
        double d11;
        float canvasHeight;
        SVGLength.UnitType unitType = sVGLength.f17528b;
        if (unitType == SVGLength.UnitType.NUMBER) {
            d11 = sVGLength.f17527a;
            canvasHeight = this.mScale;
        } else if (unitType == SVGLength.UnitType.PERCENTAGE) {
            d11 = sVGLength.f17527a / 100.0d;
            canvasHeight = getCanvasHeight();
        } else {
            return fromRelativeFast(sVGLength);
        }
        return d11 * canvasHeight;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public double relativeOnOther(SVGLength sVGLength) {
        double d11;
        double canvasDiagonal;
        SVGLength.UnitType unitType = sVGLength.f17528b;
        if (unitType == SVGLength.UnitType.NUMBER) {
            d11 = sVGLength.f17527a;
            canvasDiagonal = this.mScale;
        } else if (unitType == SVGLength.UnitType.PERCENTAGE) {
            d11 = sVGLength.f17527a / 100.0d;
            canvasDiagonal = getCanvasDiagonal();
        } else {
            return fromRelativeFast(sVGLength);
        }
        return d11 * canvasDiagonal;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public double relativeOnWidth(SVGLength sVGLength) {
        double d11;
        float canvasWidth;
        SVGLength.UnitType unitType = sVGLength.f17528b;
        if (unitType == SVGLength.UnitType.NUMBER) {
            d11 = sVGLength.f17527a;
            canvasWidth = this.mScale;
        } else if (unitType == SVGLength.UnitType.PERCENTAGE) {
            d11 = sVGLength.f17527a / 100.0d;
            canvasWidth = getCanvasWidth();
        } else {
            return fromRelativeFast(sVGLength);
        }
        return d11 * canvasWidth;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void render(Canvas canvas, Paint paint, float f11) {
        draw(canvas, paint, f11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void restoreCanvas(Canvas canvas, int i11) {
        canvas.restoreToCount(i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int saveAndSetupCanvas(Canvas canvas, Matrix matrix) {
        int save = canvas.save();
        this.mCTM.setConcat(this.mMatrix, this.mTransform);
        canvas.concat(this.mCTM);
        this.mCTM.preConcat(matrix);
        this.mCTMInvertible = this.mCTM.invert(this.mInvCTM);
        return save;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void saveDefinition() {
        if (this.mName != null) {
            getSvgView().defineTemplate(this, this.mName);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setClientRect(RectF rectF) {
        RectF rectF2 = this.mClientRect;
        if (rectF2 == null || !rectF2.equals(rectF)) {
            this.mClientRect = rectF;
            if (rectF == null) {
                return;
            }
            int ceil = (int) Math.ceil(rectF.width());
            int ceil2 = (int) Math.ceil(this.mClientRect.height());
            int floor = (int) Math.floor(this.mClientRect.left);
            int floor2 = (int) Math.floor(this.mClientRect.top);
            int ceil3 = (int) Math.ceil(this.mClientRect.right);
            int ceil4 = (int) Math.ceil(this.mClientRect.bottom);
            setMeasuredDimension(ceil, ceil2);
            if (!(this instanceof l)) {
                setLeft(floor);
                setTop(floor2);
                setRight(ceil3);
                setBottom(ceil4);
            }
            if (this.mOnLayout) {
                ((UIManagerModule) this.mContext.getNativeModule(UIManagerModule.class)).getEventDispatcher().g(com.facebook.react.uimanager.o.b(getId(), floor, floor2, ceil, ceil2));
            }
        }
    }

    @ng.a(name = "clipPath")
    public void setClipPath(String str) {
        this.mCachedClipPath = null;
        this.mClipPath = str;
        invalidate();
    }

    @ng.a(defaultInt = 1, name = "clipRule")
    public void setClipRule(int i11) {
        this.mClipRule = i11;
        invalidate();
    }

    @ng.a(name = "display")
    public void setDisplay(String str) {
        this.mDisplay = str;
        invalidate();
    }

    @ng.a(name = "markerEnd")
    public void setMarkerEnd(String str) {
        this.mMarkerEnd = str;
        invalidate();
    }

    @ng.a(name = "markerMid")
    public void setMarkerMid(String str) {
        this.mMarkerMid = str;
        invalidate();
    }

    @ng.a(name = "markerStart")
    public void setMarkerStart(String str) {
        this.mMarkerStart = str;
        invalidate();
    }

    @ng.a(name = "mask")
    public void setMask(String str) {
        this.mMask = str;
        invalidate();
    }

    @ng.a(name = "matrix")
    public void setMatrix(Dynamic dynamic) {
        ReadableType type = dynamic.getType();
        if (!dynamic.isNull() && type.equals(ReadableType.Array)) {
            ReadableArray asArray = dynamic.asArray();
            float[] fArr = sRawMatrix;
            int c11 = x.c(asArray, fArr, this.mScale);
            if (c11 == 6) {
                if (this.mMatrix == null) {
                    this.mMatrix = new Matrix();
                    this.mInvMatrix = new Matrix();
                }
                this.mMatrix.setValues(fArr);
                this.mInvertible = this.mMatrix.invert(this.mInvMatrix);
            } else if (c11 != -1) {
                nd.a.G("ReactNative", "RNSVG: Transform matrices must be of size 6");
            }
        } else {
            this.mMatrix.reset();
            this.mInvMatrix.reset();
            this.mInvertible = true;
        }
        super.invalidate();
        clearParentCache();
    }

    @ng.a(name = "name")
    public void setName(String str) {
        this.mName = str;
        invalidate();
    }

    @ng.a(name = "onLayout")
    public void setOnLayout(boolean z11) {
        this.mOnLayout = z11;
        invalidate();
    }

    @ng.a(defaultFloat = 1.0f, name = "opacity")
    public void setOpacity(float f11) {
        this.mOpacity = f11;
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setPointerEvents(com.facebook.react.uimanager.q qVar) {
        this.mPointerEvents = qVar;
    }

    @ng.a(name = "responsible")
    public void setResponsible(boolean z11) {
        this.mResponsible = z11;
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Path getClipPath(Canvas canvas, Paint paint) {
        if (this.mClipPath != null) {
            c cVar = (c) getSvgView().getDefinedClipPath(this.mClipPath);
            if (cVar != null) {
                Path path = this.mClipRule == 0 ? cVar.getPath(canvas, paint) : cVar.g(canvas, paint, Region.Op.UNION);
                path.transform(cVar.mMatrix);
                path.transform(cVar.mTransform);
                int i11 = this.mClipRule;
                if (i11 == 0) {
                    path.setFillType(Path.FillType.EVEN_ODD);
                } else if (i11 != 1) {
                    nd.a.G("ReactNative", "RNSVG: clipRule: " + this.mClipRule + " unrecognized");
                }
                this.mCachedClipPath = path;
            } else {
                nd.a.G("ReactNative", "RNSVG: Undefined clipPath: " + this.mClipPath);
            }
        }
        return getClipPath();
    }
}