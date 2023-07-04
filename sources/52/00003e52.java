package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public abstract class RenderableView extends VirtualView {
    private static final int CAP_BUTT = 0;
    static final int CAP_ROUND = 1;
    private static final int CAP_SQUARE = 2;
    private static final int FILL_RULE_EVENODD = 0;
    static final int FILL_RULE_NONZERO = 1;
    private static final int JOIN_BEVEL = 2;
    private static final int JOIN_MITER = 0;
    static final int JOIN_ROUND = 1;
    private static final int VECTOR_EFFECT_DEFAULT = 0;
    private static final int VECTOR_EFFECT_NON_SCALING_STROKE = 1;
    static RenderableView contextElement;
    private static final Pattern regex = Pattern.compile("[0-9.-]+");
    public ReadableArray fill;
    public float fillOpacity;
    public Path.FillType fillRule;
    private ArrayList<String> mAttributeList;
    private ArrayList<String> mLastMergedList;
    private ArrayList<Object> mOriginProperties;
    private ArrayList<String> mPropList;
    public ReadableArray stroke;
    public SVGLength[] strokeDasharray;
    public float strokeDashoffset;
    public Paint.Cap strokeLinecap;
    public Paint.Join strokeLinejoin;
    public float strokeMiterlimit;
    public float strokeOpacity;
    public SVGLength strokeWidth;
    public int vectorEffect;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f17518a;

        static {
            int[] iArr = new int[z.values().length];
            f17518a = iArr;
            try {
                iArr[z.kStartMarker.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17518a[z.kMidMarker.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17518a[z.kEndMarker.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RenderableView(ReactContext reactContext) {
        super(reactContext);
        this.vectorEffect = 0;
        this.strokeWidth = new SVGLength(1.0d);
        this.strokeOpacity = 1.0f;
        this.strokeMiterlimit = 4.0f;
        this.strokeDashoffset = BitmapDescriptorFactory.HUE_RED;
        this.strokeLinecap = Paint.Cap.BUTT;
        this.strokeLinejoin = Paint.Join.MITER;
        this.fillOpacity = 1.0f;
        this.fillRule = Path.FillType.WINDING;
        setPivotX(BitmapDescriptorFactory.HUE_RED);
        setPivotY(BitmapDescriptorFactory.HUE_RED);
    }

    private ArrayList<String> getAttributeList() {
        return this.mAttributeList;
    }

    private boolean hasOwnProperty(String str) {
        ArrayList<String> arrayList = this.mAttributeList;
        return arrayList != null && arrayList.contains(str);
    }

    private static double saturate(double d11) {
        if (d11 <= 0.0d) {
            return 0.0d;
        }
        if (d11 >= 1.0d) {
            return 1.0d;
        }
        return d11;
    }

    private void setupPaint(Paint paint, float f11, ReadableArray readableArray) {
        ReadableArray readableArray2;
        RenderableView renderableView;
        ReadableArray readableArray3;
        int i11 = readableArray.getInt(0);
        if (i11 == 0) {
            if (readableArray.size() == 2) {
                int i12 = readableArray.getInt(1);
                paint.setColor((Math.round((i12 >>> 24) * f11) << 24) | (i12 & 16777215));
                return;
            }
            paint.setARGB((int) (readableArray.size() > 4 ? readableArray.getDouble(4) * f11 * 255.0d : f11 * 255.0f), (int) (readableArray.getDouble(1) * 255.0d), (int) (readableArray.getDouble(2) * 255.0d), (int) (readableArray.getDouble(3) * 255.0d));
        } else if (i11 == 1) {
            com.horcrux.svg.a definedBrush = getSvgView().getDefinedBrush(readableArray.getString(1));
            if (definedBrush != null) {
                definedBrush.i(paint, this.mBox, this.mScale, f11);
            }
        } else if (i11 == 2) {
            int i13 = getSvgView().mTintColor;
            paint.setARGB((int) (f11 * 255.0f), (16711680 & i13) >> 16, (65280 & i13) >> 8, i13 & 255);
        } else if (i11 != 3) {
            if (i11 != 4 || (renderableView = contextElement) == null || (readableArray3 = renderableView.stroke) == null) {
                return;
            }
            setupPaint(paint, f11, readableArray3);
        } else {
            RenderableView renderableView2 = contextElement;
            if (renderableView2 == null || (readableArray2 = renderableView2.fill) == null) {
                return;
            }
            setupPaint(paint, f11, readableArray2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.VirtualView
    public void draw(Canvas canvas, Paint paint, float f11) {
        float f12 = f11 * this.mOpacity;
        boolean z11 = ((VirtualView) this).mPath == null;
        if (z11) {
            Path path = getPath(canvas, paint);
            ((VirtualView) this).mPath = path;
            path.setFillType(this.fillRule);
        }
        boolean z12 = this.vectorEffect == 1;
        Path path2 = ((VirtualView) this).mPath;
        if (z12) {
            path2 = new Path();
            ((VirtualView) this).mPath.transform(this.mCTM, path2);
            canvas.setMatrix(null);
        }
        if (z11 || path2 != ((VirtualView) this).mPath) {
            RectF rectF = new RectF();
            this.mBox = rectF;
            path2.computeBounds(rectF, true);
        }
        RectF rectF2 = new RectF(this.mBox);
        this.mCTM.mapRect(rectF2);
        setClientRect(rectF2);
        clip(canvas, paint);
        if (setupFillPaint(paint, this.fillOpacity * f12)) {
            if (z11) {
                Path path3 = new Path();
                this.mFillPath = path3;
                paint.getFillPath(path2, path3);
            }
            canvas.drawPath(path2, paint);
        }
        if (setupStrokePaint(paint, this.strokeOpacity * f12)) {
            if (z11) {
                Path path4 = new Path();
                this.mStrokePath = path4;
                paint.getFillPath(path2, path4);
            }
            canvas.drawPath(path2, paint);
        }
        renderMarkers(canvas, paint, f12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.VirtualView
    public abstract Path getPath(Canvas canvas, Paint paint);

    /* JADX INFO: Access modifiers changed from: package-private */
    public Region getRegion(Path path, RectF rectF) {
        Region region = new Region();
        region.setPath(path, new Region((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom)));
        return region;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.VirtualView
    public int hitTest(float[] fArr) {
        Region region;
        Region region2;
        if (((VirtualView) this).mPath == null || !this.mInvertible || !this.mTransformInvertible || ((VirtualView) this).mPointerEvents == com.facebook.react.uimanager.q.NONE) {
            return -1;
        }
        float[] fArr2 = new float[2];
        this.mInvMatrix.mapPoints(fArr2, fArr);
        this.mInvTransform.mapPoints(fArr2);
        int round = Math.round(fArr2[0]);
        int round2 = Math.round(fArr2[1]);
        initBounds();
        Region region3 = this.mRegion;
        if ((region3 != null && region3.contains(round, round2)) || ((region = this.mStrokeRegion) != null && (region.contains(round, round2) || ((region2 = this.mMarkerRegion) != null && region2.contains(round, round2))))) {
            if (getClipPath() == null || this.mClipRegion.contains(round, round2)) {
                return getId();
            }
            return -1;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void initBounds() {
        if (this.mRegion == null && this.mFillPath != null) {
            RectF rectF = new RectF();
            this.mFillBounds = rectF;
            this.mFillPath.computeBounds(rectF, true);
            this.mRegion = getRegion(this.mFillPath, this.mFillBounds);
        }
        if (this.mRegion == null && ((VirtualView) this).mPath != null) {
            RectF rectF2 = new RectF();
            this.mFillBounds = rectF2;
            ((VirtualView) this).mPath.computeBounds(rectF2, true);
            this.mRegion = getRegion(((VirtualView) this).mPath, this.mFillBounds);
        }
        if (this.mStrokeRegion == null && this.mStrokePath != null) {
            RectF rectF3 = new RectF();
            this.mStrokeBounds = rectF3;
            this.mStrokePath.computeBounds(rectF3, true);
            this.mStrokeRegion = getRegion(this.mStrokePath, this.mStrokeBounds);
        }
        if (this.mMarkerRegion == null && this.mMarkerPath != null) {
            RectF rectF4 = new RectF();
            this.mMarkerBounds = rectF4;
            this.mMarkerPath.computeBounds(rectF4, true);
            this.mMarkerRegion = getRegion(this.mMarkerPath, this.mMarkerBounds);
        }
        Path clipPath = getClipPath();
        if (clipPath == null || this.mClipRegionPath == clipPath) {
            return;
        }
        this.mClipRegionPath = clipPath;
        RectF rectF5 = new RectF();
        this.mClipBounds = rectF5;
        clipPath.computeBounds(rectF5, true);
        this.mClipRegion = getRegion(clipPath, this.mClipBounds);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void mergeProperties(RenderableView renderableView) {
        ArrayList<String> attributeList = renderableView.getAttributeList();
        if (attributeList == null || attributeList.size() == 0) {
            return;
        }
        this.mOriginProperties = new ArrayList<>();
        this.mAttributeList = this.mPropList == null ? new ArrayList<>() : new ArrayList<>(this.mPropList);
        int size = attributeList.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                String str = attributeList.get(i11);
                Field field = getClass().getField(str);
                Object obj = field.get(renderableView);
                this.mOriginProperties.add(field.get(this));
                if (!hasOwnProperty(str)) {
                    this.mAttributeList.add(str);
                    field.set(this, obj);
                }
            } catch (Exception e11) {
                throw new IllegalStateException(e11);
            }
        }
        this.mLastMergedList = attributeList;
    }

    @Override // com.horcrux.svg.VirtualView
    void render(Canvas canvas, Paint paint, float f11) {
        q qVar = this.mMask != null ? (q) getSvgView().getDefinedMask(this.mMask) : null;
        if (qVar != null) {
            Rect clipBounds = canvas.getClipBounds();
            int height = clipBounds.height();
            int width = clipBounds.width();
            Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            Bitmap createBitmap2 = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            Bitmap createBitmap3 = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            Canvas canvas3 = new Canvas(createBitmap);
            Canvas canvas4 = new Canvas(createBitmap3);
            canvas3.clipRect((float) relativeOnWidth(qVar.f17683c), (float) relativeOnHeight(qVar.f17684d), (float) relativeOnWidth(qVar.f17685e), (float) relativeOnHeight(qVar.f17686f));
            Paint paint2 = new Paint(1);
            qVar.draw(canvas3, paint2, 1.0f);
            int i11 = width * height;
            int[] iArr = new int[i11];
            createBitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            int i12 = 0;
            while (i12 < i11) {
                int i13 = iArr[i12];
                iArr[i12] = ((int) ((i13 >>> 24) * saturate((((((i13 >> 16) & 255) * 0.299d) + (((i13 >> 8) & 255) * 0.587d)) + ((i13 & 255) * 0.144d)) / 255.0d))) << 24;
                i12++;
                i11 = i11;
                paint2 = paint2;
            }
            Paint paint3 = paint2;
            createBitmap.setPixels(iArr, 0, width, 0, 0, width, height);
            draw(canvas2, paint, f11);
            paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            canvas4.drawBitmap(createBitmap2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (Paint) null);
            canvas4.drawBitmap(createBitmap, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, paint3);
            canvas.drawBitmap(createBitmap3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, paint);
            return;
        }
        draw(canvas, paint, f11);
    }

    void renderMarkers(Canvas canvas, Paint paint, float f11) {
        p pVar = (p) getSvgView().getDefinedMarker(this.mMarkerStart);
        p pVar2 = (p) getSvgView().getDefinedMarker(this.mMarkerMid);
        p pVar3 = (p) getSvgView().getDefinedMarker(this.mMarkerEnd);
        ArrayList<s> arrayList = this.elements;
        if (arrayList != null) {
            if (pVar == null && pVar2 == null && pVar3 == null) {
                return;
            }
            contextElement = this;
            ArrayList<y> h11 = y.h(arrayList);
            SVGLength sVGLength = this.strokeWidth;
            float relativeOnOther = (float) (sVGLength != null ? relativeOnOther(sVGLength) : 1.0d);
            this.mMarkerPath = new Path();
            Iterator<y> it2 = h11.iterator();
            while (it2.hasNext()) {
                y next = it2.next();
                int i11 = a.f17518a[next.f17744a.ordinal()];
                p pVar4 = i11 != 1 ? i11 != 2 ? i11 != 3 ? null : pVar3 : pVar2 : pVar;
                if (pVar4 != null) {
                    pVar4.m(canvas, paint, f11, next, relativeOnOther);
                    this.mMarkerPath.addPath(pVar4.getPath(canvas, paint), pVar4.f17681o);
                }
            }
            contextElement = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void resetProperties() {
        ArrayList<String> arrayList = this.mLastMergedList;
        if (arrayList == null || this.mOriginProperties == null) {
            return;
        }
        try {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                getClass().getField(this.mLastMergedList.get(size)).set(this, this.mOriginProperties.get(size));
            }
            this.mLastMergedList = null;
            this.mOriginProperties = null;
            this.mAttributeList = this.mPropList;
        } catch (Exception e11) {
            throw new IllegalStateException(e11);
        }
    }

    @ng.a(name = "fill")
    public void setFill(Dynamic dynamic) {
        if (dynamic != null && !dynamic.isNull()) {
            ReadableType type = dynamic.getType();
            int i11 = 0;
            if (type.equals(ReadableType.Number)) {
                this.fill = JavaOnlyArray.of(0, Integer.valueOf(dynamic.asInt()));
            } else if (type.equals(ReadableType.Array)) {
                this.fill = dynamic.asArray();
            } else {
                JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
                javaOnlyArray.pushInt(0);
                Matcher matcher = regex.matcher(dynamic.asString());
                while (matcher.find()) {
                    double parseDouble = Double.parseDouble(matcher.group());
                    int i12 = i11 + 1;
                    if (i11 < 3) {
                        parseDouble /= 255.0d;
                    }
                    javaOnlyArray.pushDouble(parseDouble);
                    i11 = i12;
                }
                this.fill = javaOnlyArray;
            }
            invalidate();
            return;
        }
        this.fill = null;
        invalidate();
    }

    @ng.a(defaultFloat = 1.0f, name = "fillOpacity")
    public void setFillOpacity(float f11) {
        this.fillOpacity = f11;
        invalidate();
    }

    @ng.a(defaultInt = 1, name = "fillRule")
    public void setFillRule(int i11) {
        if (i11 == 0) {
            this.fillRule = Path.FillType.EVEN_ODD;
        } else if (i11 != 1) {
            throw new JSApplicationIllegalArgumentException("fillRule " + i11 + " unrecognized");
        }
        invalidate();
    }

    @Override // android.view.View
    public void setId(int i11) {
        super.setId(i11);
        RenderableViewManager.setRenderableView(i11, this);
    }

    @ng.a(name = "propList")
    public void setPropList(ReadableArray readableArray) {
        if (readableArray != null) {
            ArrayList<String> arrayList = new ArrayList<>();
            this.mAttributeList = arrayList;
            this.mPropList = arrayList;
            for (int i11 = 0; i11 < readableArray.size(); i11++) {
                this.mPropList.add(readableArray.getString(i11));
            }
        }
        invalidate();
    }

    @ng.a(name = "stroke")
    public void setStroke(Dynamic dynamic) {
        if (dynamic != null && !dynamic.isNull()) {
            ReadableType type = dynamic.getType();
            int i11 = 0;
            if (type.equals(ReadableType.Number)) {
                this.stroke = JavaOnlyArray.of(0, Integer.valueOf(dynamic.asInt()));
            } else if (type.equals(ReadableType.Array)) {
                this.stroke = dynamic.asArray();
            } else {
                JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
                javaOnlyArray.pushInt(0);
                Matcher matcher = regex.matcher(dynamic.asString());
                while (matcher.find()) {
                    double parseDouble = Double.parseDouble(matcher.group());
                    int i12 = i11 + 1;
                    if (i11 < 3) {
                        parseDouble /= 255.0d;
                    }
                    javaOnlyArray.pushDouble(parseDouble);
                    i11 = i12;
                }
                this.stroke = javaOnlyArray;
            }
            invalidate();
            return;
        }
        this.stroke = null;
        invalidate();
    }

    @ng.a(name = "strokeDasharray")
    public void setStrokeDasharray(ReadableArray readableArray) {
        if (readableArray != null) {
            int size = readableArray.size();
            this.strokeDasharray = new SVGLength[size];
            for (int i11 = 0; i11 < size; i11++) {
                this.strokeDasharray[i11] = SVGLength.b(readableArray.getDynamic(i11));
            }
        } else {
            this.strokeDasharray = null;
        }
        invalidate();
    }

    @ng.a(name = "strokeDashoffset")
    public void setStrokeDashoffset(float f11) {
        this.strokeDashoffset = f11 * this.mScale;
        invalidate();
    }

    @ng.a(defaultInt = 1, name = "strokeLinecap")
    public void setStrokeLinecap(int i11) {
        if (i11 == 0) {
            this.strokeLinecap = Paint.Cap.BUTT;
        } else if (i11 == 1) {
            this.strokeLinecap = Paint.Cap.ROUND;
        } else if (i11 == 2) {
            this.strokeLinecap = Paint.Cap.SQUARE;
        } else {
            throw new JSApplicationIllegalArgumentException("strokeLinecap " + i11 + " unrecognized");
        }
        invalidate();
    }

    @ng.a(defaultInt = 1, name = "strokeLinejoin")
    public void setStrokeLinejoin(int i11) {
        if (i11 == 0) {
            this.strokeLinejoin = Paint.Join.MITER;
        } else if (i11 == 1) {
            this.strokeLinejoin = Paint.Join.ROUND;
        } else if (i11 == 2) {
            this.strokeLinejoin = Paint.Join.BEVEL;
        } else {
            throw new JSApplicationIllegalArgumentException("strokeLinejoin " + i11 + " unrecognized");
        }
        invalidate();
    }

    @ng.a(defaultFloat = 4.0f, name = "strokeMiterlimit")
    public void setStrokeMiterlimit(float f11) {
        this.strokeMiterlimit = f11;
        invalidate();
    }

    @ng.a(defaultFloat = 1.0f, name = "strokeOpacity")
    public void setStrokeOpacity(float f11) {
        this.strokeOpacity = f11;
        invalidate();
    }

    @ng.a(name = "strokeWidth")
    public void setStrokeWidth(Dynamic dynamic) {
        this.strokeWidth = SVGLength.b(dynamic);
        invalidate();
    }

    @ng.a(name = "vectorEffect")
    public void setVectorEffect(int i11) {
        this.vectorEffect = i11;
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean setupFillPaint(Paint paint, float f11) {
        ReadableArray readableArray = this.fill;
        if (readableArray == null || readableArray.size() <= 0) {
            return false;
        }
        paint.reset();
        paint.setFlags(385);
        paint.setStyle(Paint.Style.FILL);
        setupPaint(paint, f11, this.fill);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean setupStrokePaint(Paint paint, float f11) {
        ReadableArray readableArray;
        paint.reset();
        double relativeOnOther = relativeOnOther(this.strokeWidth);
        if (relativeOnOther == 0.0d || (readableArray = this.stroke) == null || readableArray.size() == 0) {
            return false;
        }
        paint.setFlags(385);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(this.strokeLinecap);
        paint.setStrokeJoin(this.strokeLinejoin);
        paint.setStrokeMiter(this.strokeMiterlimit * this.mScale);
        paint.setStrokeWidth((float) relativeOnOther);
        setupPaint(paint, f11, this.stroke);
        SVGLength[] sVGLengthArr = this.strokeDasharray;
        if (sVGLengthArr != null) {
            int length = sVGLengthArr.length;
            float[] fArr = new float[length];
            for (int i11 = 0; i11 < length; i11++) {
                fArr[i11] = (float) relativeOnOther(this.strokeDasharray[i11]);
            }
            paint.setPathEffect(new DashPathEffect(fArr, this.strokeDashoffset));
            return true;
        }
        return true;
    }
}