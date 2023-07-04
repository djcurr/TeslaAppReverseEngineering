package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import androidx.core.graphics.PathParser;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.IOException;
import java.util.ArrayList;
import m3.c;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class e {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a implements TypeEvaluator<PathParser.PathDataNode[]> {

        /* renamed from: a  reason: collision with root package name */
        private c.b[] f6290a;

        a() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a */
        public c.b[] evaluate(float f11, c.b[] bVarArr, c.b[] bVarArr2) {
            if (m3.c.b(bVarArr, bVarArr2)) {
                if (!m3.c.b(this.f6290a, bVarArr)) {
                    this.f6290a = m3.c.f(bVarArr);
                }
                for (int i11 = 0; i11 < bVarArr.length; i11++) {
                    this.f6290a[i11].d(bVarArr[i11], bVarArr2[i11], f11);
                }
                return this.f6290a;
            }
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }

    private static Animator a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, float f11) {
        return b(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser), null, 0, f11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.animation.Animator b(android.content.Context r18, android.content.res.Resources r19, android.content.res.Resources.Theme r20, org.xmlpull.v1.XmlPullParser r21, android.util.AttributeSet r22, android.animation.AnimatorSet r23, int r24, float r25) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.vectordrawable.graphics.drawable.e.b(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float):android.animation.Animator");
    }

    private static Keyframe c(Keyframe keyframe, float f11) {
        if (keyframe.getType() == Float.TYPE) {
            return Keyframe.ofFloat(f11);
        }
        if (keyframe.getType() == Integer.TYPE) {
            return Keyframe.ofInt(f11);
        }
        return Keyframe.ofObject(f11);
    }

    private static void d(Keyframe[] keyframeArr, float f11, int i11, int i12) {
        float f12 = f11 / ((i12 - i11) + 2);
        while (i11 <= i12) {
            keyframeArr[i11].setFraction(keyframeArr[i11 - 1].getFraction() + f12);
            i11++;
        }
    }

    private static PropertyValuesHolder e(TypedArray typedArray, int i11, int i12, int i13, String str) {
        int i14;
        int i15;
        int i16;
        float f11;
        PropertyValuesHolder ofFloat;
        float f12;
        float f13;
        PropertyValuesHolder ofObject;
        TypedValue peekValue = typedArray.peekValue(i12);
        boolean z11 = peekValue != null;
        int i17 = z11 ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i13);
        boolean z12 = peekValue2 != null;
        int i18 = z12 ? peekValue2.type : 0;
        if (i11 == 4) {
            i11 = ((z11 && h(i17)) || (z12 && h(i18))) ? 3 : 0;
        }
        boolean z13 = i11 == 0;
        PropertyValuesHolder propertyValuesHolder = null;
        if (i11 == 2) {
            String string = typedArray.getString(i12);
            String string2 = typedArray.getString(i13);
            c.b[] d11 = m3.c.d(string);
            c.b[] d12 = m3.c.d(string2);
            if (d11 == null && d12 == null) {
                return null;
            }
            if (d11 == null) {
                if (d12 != null) {
                    return PropertyValuesHolder.ofObject(str, new a(), d12);
                }
                return null;
            }
            a aVar = new a();
            if (d12 != null) {
                if (m3.c.b(d11, d12)) {
                    ofObject = PropertyValuesHolder.ofObject(str, aVar, d11, d12);
                } else {
                    throw new InflateException(" Can't morph from " + string + " to " + string2);
                }
            } else {
                ofObject = PropertyValuesHolder.ofObject(str, aVar, d11);
            }
            return ofObject;
        }
        f a11 = i11 == 3 ? f.a() : null;
        if (z13) {
            if (z11) {
                if (i17 == 5) {
                    f12 = typedArray.getDimension(i12, BitmapDescriptorFactory.HUE_RED);
                } else {
                    f12 = typedArray.getFloat(i12, BitmapDescriptorFactory.HUE_RED);
                }
                if (z12) {
                    if (i18 == 5) {
                        f13 = typedArray.getDimension(i13, BitmapDescriptorFactory.HUE_RED);
                    } else {
                        f13 = typedArray.getFloat(i13, BitmapDescriptorFactory.HUE_RED);
                    }
                    ofFloat = PropertyValuesHolder.ofFloat(str, f12, f13);
                } else {
                    ofFloat = PropertyValuesHolder.ofFloat(str, f12);
                }
            } else {
                if (i18 == 5) {
                    f11 = typedArray.getDimension(i13, BitmapDescriptorFactory.HUE_RED);
                } else {
                    f11 = typedArray.getFloat(i13, BitmapDescriptorFactory.HUE_RED);
                }
                ofFloat = PropertyValuesHolder.ofFloat(str, f11);
            }
            propertyValuesHolder = ofFloat;
        } else if (z11) {
            if (i17 == 5) {
                i15 = (int) typedArray.getDimension(i12, BitmapDescriptorFactory.HUE_RED);
            } else if (h(i17)) {
                i15 = typedArray.getColor(i12, 0);
            } else {
                i15 = typedArray.getInt(i12, 0);
            }
            if (z12) {
                if (i18 == 5) {
                    i16 = (int) typedArray.getDimension(i13, BitmapDescriptorFactory.HUE_RED);
                } else if (h(i18)) {
                    i16 = typedArray.getColor(i13, 0);
                } else {
                    i16 = typedArray.getInt(i13, 0);
                }
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i15, i16);
            } else {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i15);
            }
        } else if (z12) {
            if (i18 == 5) {
                i14 = (int) typedArray.getDimension(i13, BitmapDescriptorFactory.HUE_RED);
            } else if (h(i18)) {
                i14 = typedArray.getColor(i13, 0);
            } else {
                i14 = typedArray.getInt(i13, 0);
            }
            propertyValuesHolder = PropertyValuesHolder.ofInt(str, i14);
        }
        if (propertyValuesHolder == null || a11 == null) {
            return propertyValuesHolder;
        }
        propertyValuesHolder.setEvaluator(a11);
        return propertyValuesHolder;
    }

    private static int f(TypedArray typedArray, int i11, int i12) {
        TypedValue peekValue = typedArray.peekValue(i11);
        boolean z11 = peekValue != null;
        int i13 = z11 ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i12);
        boolean z12 = peekValue2 != null;
        return ((z11 && h(i13)) || (z12 && h(z12 ? peekValue2.type : 0))) ? 3 : 0;
    }

    private static int g(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray k11 = l3.i.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f6276j);
        int i11 = 0;
        TypedValue l11 = l3.i.l(k11, xmlPullParser, "value", 0);
        if ((l11 != null) && h(l11.type)) {
            i11 = 3;
        }
        k11.recycle();
        return i11;
    }

    private static boolean h(int i11) {
        return i11 >= 28 && i11 <= 31;
    }

    public static Animator i(Context context, int i11) {
        if (Build.VERSION.SDK_INT >= 24) {
            return AnimatorInflater.loadAnimator(context, i11);
        }
        return j(context, context.getResources(), context.getTheme(), i11);
    }

    public static Animator j(Context context, Resources resources, Resources.Theme theme, int i11) {
        return k(context, resources, theme, i11, 1.0f);
    }

    public static Animator k(Context context, Resources resources, Resources.Theme theme, int i11, float f11) {
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = resources.getAnimation(i11);
                    return a(context, resources, theme, xmlResourceParser, f11);
                } catch (IOException e11) {
                    Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i11));
                    notFoundException.initCause(e11);
                    throw notFoundException;
                }
            } catch (XmlPullParserException e12) {
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i11));
                notFoundException2.initCause(e12);
                throw notFoundException2;
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }

    private static ValueAnimator l(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f11, XmlPullParser xmlPullParser) {
        TypedArray k11 = l3.i.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f6273g);
        TypedArray k12 = l3.i.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f6277k);
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        q(valueAnimator, k11, k12, f11, xmlPullParser);
        int h11 = l3.i.h(k11, xmlPullParser, "interpolator", 0, 0);
        if (h11 > 0) {
            valueAnimator.setInterpolator(d.b(context, h11));
        }
        k11.recycle();
        if (k12 != null) {
            k12.recycle();
        }
        return valueAnimator;
    }

    private static Keyframe m(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, int i11, XmlPullParser xmlPullParser) {
        Keyframe ofInt;
        TypedArray k11 = l3.i.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f6276j);
        float f11 = l3.i.f(k11, xmlPullParser, "fraction", 3, -1.0f);
        TypedValue l11 = l3.i.l(k11, xmlPullParser, "value", 0);
        boolean z11 = l11 != null;
        if (i11 == 4) {
            i11 = (z11 && h(l11.type)) ? 3 : 0;
        }
        if (z11) {
            if (i11 != 0) {
                ofInt = (i11 == 1 || i11 == 3) ? Keyframe.ofInt(f11, l3.i.g(k11, xmlPullParser, "value", 0, 0)) : null;
            } else {
                ofInt = Keyframe.ofFloat(f11, l3.i.f(k11, xmlPullParser, "value", 0, BitmapDescriptorFactory.HUE_RED));
            }
        } else if (i11 == 0) {
            ofInt = Keyframe.ofFloat(f11);
        } else {
            ofInt = Keyframe.ofInt(f11);
        }
        int h11 = l3.i.h(k11, xmlPullParser, "interpolator", 1, 0);
        if (h11 > 0) {
            ofInt.setInterpolator(d.b(context, h11));
        }
        k11.recycle();
        return ofInt;
    }

    private static ObjectAnimator n(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, float f11, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        l(context, resources, theme, attributeSet, objectAnimator, f11, xmlPullParser);
        return objectAnimator;
    }

    private static PropertyValuesHolder o(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, String str, int i11) {
        int size;
        PropertyValuesHolder propertyValuesHolder = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 3 || next == 1) {
                break;
            } else if (xmlPullParser.getName().equals("keyframe")) {
                if (i11 == 4) {
                    i11 = g(resources, theme, Xml.asAttributeSet(xmlPullParser), xmlPullParser);
                }
                Keyframe m11 = m(context, resources, theme, Xml.asAttributeSet(xmlPullParser), i11, xmlPullParser);
                if (m11 != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(m11);
                }
                xmlPullParser.next();
            }
        }
        if (arrayList != null && (size = arrayList.size()) > 0) {
            Keyframe keyframe = (Keyframe) arrayList.get(0);
            Keyframe keyframe2 = (Keyframe) arrayList.get(size - 1);
            float fraction = keyframe2.getFraction();
            if (fraction < 1.0f) {
                if (fraction < BitmapDescriptorFactory.HUE_RED) {
                    keyframe2.setFraction(1.0f);
                } else {
                    arrayList.add(arrayList.size(), c(keyframe2, 1.0f));
                    size++;
                }
            }
            float fraction2 = keyframe.getFraction();
            if (fraction2 != BitmapDescriptorFactory.HUE_RED) {
                if (fraction2 < BitmapDescriptorFactory.HUE_RED) {
                    keyframe.setFraction(BitmapDescriptorFactory.HUE_RED);
                } else {
                    arrayList.add(0, c(keyframe, BitmapDescriptorFactory.HUE_RED));
                    size++;
                }
            }
            Keyframe[] keyframeArr = new Keyframe[size];
            arrayList.toArray(keyframeArr);
            for (int i12 = 0; i12 < size; i12++) {
                Keyframe keyframe3 = keyframeArr[i12];
                if (keyframe3.getFraction() < BitmapDescriptorFactory.HUE_RED) {
                    if (i12 == 0) {
                        keyframe3.setFraction(BitmapDescriptorFactory.HUE_RED);
                    } else {
                        int i13 = size - 1;
                        if (i12 == i13) {
                            keyframe3.setFraction(1.0f);
                        } else {
                            int i14 = i12;
                            for (int i15 = i12 + 1; i15 < i13 && keyframeArr[i15].getFraction() < BitmapDescriptorFactory.HUE_RED; i15++) {
                                i14 = i15;
                            }
                            d(keyframeArr, keyframeArr[i14 + 1].getFraction() - keyframeArr[i12 - 1].getFraction(), i12, i14);
                        }
                    }
                }
            }
            propertyValuesHolder = PropertyValuesHolder.ofKeyframe(str, keyframeArr);
            if (i11 == 3) {
                propertyValuesHolder.setEvaluator(f.a());
            }
        }
        return propertyValuesHolder;
    }

    private static PropertyValuesHolder[] p(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        int i11;
        PropertyValuesHolder[] propertyValuesHolderArr = null;
        ArrayList arrayList = null;
        while (true) {
            int eventType = xmlPullParser.getEventType();
            if (eventType == 3 || eventType == 1) {
                break;
            } else if (eventType != 2) {
                xmlPullParser.next();
            } else {
                if (xmlPullParser.getName().equals("propertyValuesHolder")) {
                    TypedArray k11 = l3.i.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f6275i);
                    String i12 = l3.i.i(k11, xmlPullParser, "propertyName", 3);
                    int g11 = l3.i.g(k11, xmlPullParser, "valueType", 2, 4);
                    PropertyValuesHolder o11 = o(context, resources, theme, xmlPullParser, i12, g11);
                    if (o11 == null) {
                        o11 = e(k11, g11, 0, 1, i12);
                    }
                    if (o11 != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(o11);
                    }
                    k11.recycle();
                }
                xmlPullParser.next();
            }
        }
        if (arrayList != null) {
            int size = arrayList.size();
            propertyValuesHolderArr = new PropertyValuesHolder[size];
            for (i11 = 0; i11 < size; i11++) {
                propertyValuesHolderArr[i11] = (PropertyValuesHolder) arrayList.get(i11);
            }
        }
        return propertyValuesHolderArr;
    }

    private static void q(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f11, XmlPullParser xmlPullParser) {
        long g11 = l3.i.g(typedArray, xmlPullParser, "duration", 1, 300);
        long g12 = l3.i.g(typedArray, xmlPullParser, "startOffset", 2, 0);
        int g13 = l3.i.g(typedArray, xmlPullParser, "valueType", 7, 4);
        if (l3.i.j(xmlPullParser, "valueFrom") && l3.i.j(xmlPullParser, "valueTo")) {
            if (g13 == 4) {
                g13 = f(typedArray, 5, 6);
            }
            PropertyValuesHolder e11 = e(typedArray, g13, 5, 6, "");
            if (e11 != null) {
                valueAnimator.setValues(e11);
            }
        }
        valueAnimator.setDuration(g11);
        valueAnimator.setStartDelay(g12);
        valueAnimator.setRepeatCount(l3.i.g(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(l3.i.g(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            r(valueAnimator, typedArray2, g13, f11, xmlPullParser);
        }
    }

    private static void r(ValueAnimator valueAnimator, TypedArray typedArray, int i11, float f11, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
        String i12 = l3.i.i(typedArray, xmlPullParser, "pathData", 1);
        if (i12 != null) {
            String i13 = l3.i.i(typedArray, xmlPullParser, "propertyXName", 2);
            String i14 = l3.i.i(typedArray, xmlPullParser, "propertyYName", 3);
            if (i11 != 2) {
            }
            if (i13 == null && i14 == null) {
                throw new InflateException(typedArray.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
            }
            s(m3.c.e(i12), objectAnimator, f11 * 0.5f, i13, i14);
            return;
        }
        objectAnimator.setPropertyName(l3.i.i(typedArray, xmlPullParser, "propertyName", 0));
    }

    private static void s(Path path, ObjectAnimator objectAnimator, float f11, String str, String str2) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        ArrayList arrayList = new ArrayList();
        float f12 = BitmapDescriptorFactory.HUE_RED;
        arrayList.add(Float.valueOf((float) BitmapDescriptorFactory.HUE_RED));
        float f13 = 0.0f;
        do {
            f13 += pathMeasure.getLength();
            arrayList.add(Float.valueOf(f13));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path, false);
        int min = Math.min(100, ((int) (f13 / f11)) + 1);
        float[] fArr = new float[min];
        float[] fArr2 = new float[min];
        float[] fArr3 = new float[2];
        float f14 = f13 / (min - 1);
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= min) {
                break;
            }
            pathMeasure2.getPosTan(f12 - ((Float) arrayList.get(i12)).floatValue(), fArr3, null);
            fArr[i11] = fArr3[0];
            fArr2[i11] = fArr3[1];
            f12 += f14;
            int i13 = i12 + 1;
            if (i13 < arrayList.size() && f12 > ((Float) arrayList.get(i13)).floatValue()) {
                pathMeasure2.nextContour();
                i12 = i13;
            }
            i11++;
        }
        PropertyValuesHolder ofFloat = str != null ? PropertyValuesHolder.ofFloat(str, fArr) : null;
        PropertyValuesHolder ofFloat2 = str2 != null ? PropertyValuesHolder.ofFloat(str2, fArr2) : null;
        if (ofFloat == null) {
            objectAnimator.setValues(ofFloat2);
        } else if (ofFloat2 == null) {
            objectAnimator.setValues(ofFloat);
        } else {
            objectAnimator.setValues(ofFloat, ofFloat2);
        }
    }
}