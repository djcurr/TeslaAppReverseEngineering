package com.google.android.gms.vision.face;

import android.graphics.PointF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public class Face {
    public static final float UNCOMPUTED_PROBABILITY = -1.0f;
    private float height;

    /* renamed from: id  reason: collision with root package name */
    private int f14808id;
    private float width;
    private PointF zzca;
    private float zzcb;
    private float zzcc;
    private float zzcd;
    private List<Landmark> zzce;
    private final List<Contour> zzcf;
    private float zzcg;
    private float zzch;
    private float zzci;

    public Face(int i11, PointF pointF, float f11, float f12, float f13, float f14, float f15, Landmark[] landmarkArr, Contour[] contourArr, float f16, float f17, float f18) {
        this.f14808id = i11;
        this.zzca = pointF;
        this.width = f11;
        this.height = f12;
        this.zzcb = f13;
        this.zzcc = f14;
        this.zzcd = f15;
        this.zzce = Arrays.asList(landmarkArr);
        this.zzcf = Arrays.asList(contourArr);
        if (f16 >= BitmapDescriptorFactory.HUE_RED && f16 <= 1.0f) {
            this.zzcg = f16;
        } else {
            this.zzcg = -1.0f;
        }
        if (f17 >= BitmapDescriptorFactory.HUE_RED && f17 <= 1.0f) {
            this.zzch = f17;
        } else {
            this.zzch = -1.0f;
        }
        if (f18 >= BitmapDescriptorFactory.HUE_RED && f18 <= 1.0f) {
            this.zzci = f18;
        } else {
            this.zzci = -1.0f;
        }
    }

    public List<Contour> getContours() {
        return this.zzcf;
    }

    public float getEulerY() {
        return this.zzcb;
    }

    public float getEulerZ() {
        return this.zzcc;
    }

    public float getHeight() {
        return this.height;
    }

    public int getId() {
        return this.f14808id;
    }

    public float getIsLeftEyeOpenProbability() {
        return this.zzcg;
    }

    public float getIsRightEyeOpenProbability() {
        return this.zzch;
    }

    public float getIsSmilingProbability() {
        return this.zzci;
    }

    public List<Landmark> getLandmarks() {
        return this.zzce;
    }

    public PointF getPosition() {
        PointF pointF = this.zzca;
        return new PointF(pointF.x - (this.width / 2.0f), pointF.y - (this.height / 2.0f));
    }

    public float getWidth() {
        return this.width;
    }
}