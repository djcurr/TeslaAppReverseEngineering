package com.google.android.gms.vision.text;

import android.graphics.Point;
import android.graphics.Rect;
import android.util.SparseArray;
import com.google.android.gms.internal.vision.zzae;
import com.google.android.gms.internal.vision.zzy;
import com.stripe.android.core.networking.RequestHeadersFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class TextBlock implements Text {
    private Point[] cornerPoints;
    private zzae[] zzev;
    private List<Line> zzew;
    private String zzex;
    private Rect zzey;

    /* JADX INFO: Access modifiers changed from: package-private */
    public TextBlock(SparseArray<zzae> sparseArray) {
        this.zzev = new zzae[sparseArray.size()];
        int i11 = 0;
        while (true) {
            zzae[] zzaeVarArr = this.zzev;
            if (i11 >= zzaeVarArr.length) {
                return;
            }
            zzaeVarArr[i11] = sparseArray.valueAt(i11);
            i11++;
        }
    }

    @Override // com.google.android.gms.vision.text.Text
    public Rect getBoundingBox() {
        if (this.zzey == null) {
            this.zzey = zzc.zza(this);
        }
        return this.zzey;
    }

    @Override // com.google.android.gms.vision.text.Text
    public List<? extends Text> getComponents() {
        if (this.zzev.length == 0) {
            return new ArrayList(0);
        }
        if (this.zzew == null) {
            this.zzew = new ArrayList(this.zzev.length);
            for (zzae zzaeVar : this.zzev) {
                this.zzew.add(new Line(zzaeVar));
            }
        }
        return this.zzew;
    }

    @Override // com.google.android.gms.vision.text.Text
    public Point[] getCornerPoints() {
        TextBlock textBlock;
        zzae[] zzaeVarArr;
        TextBlock textBlock2 = this;
        if (textBlock2.cornerPoints == null) {
            char c11 = 0;
            if (textBlock2.zzev.length == 0) {
                textBlock2.cornerPoints = new Point[0];
            } else {
                int i11 = Integer.MIN_VALUE;
                int i12 = 0;
                int i13 = Integer.MAX_VALUE;
                int i14 = Integer.MAX_VALUE;
                int i15 = Integer.MIN_VALUE;
                while (true) {
                    zzaeVarArr = textBlock2.zzev;
                    if (i12 >= zzaeVarArr.length) {
                        break;
                    }
                    zzy zzyVar = zzaeVarArr[i12].zzfd;
                    zzy zzyVar2 = zzaeVarArr[c11].zzfd;
                    double sin = Math.sin(Math.toRadians(zzyVar2.zzfb));
                    double cos = Math.cos(Math.toRadians(zzyVar2.zzfb));
                    Point[] pointArr = new Point[4];
                    pointArr[c11] = new Point(zzyVar.left, zzyVar.top);
                    pointArr[c11].offset(-zzyVar2.left, -zzyVar2.top);
                    int i16 = i15;
                    int i17 = (int) ((pointArr[c11].x * cos) + (pointArr[c11].y * sin));
                    int i18 = (int) (((-pointArr[0].x) * sin) + (pointArr[0].y * cos));
                    pointArr[0].x = i17;
                    pointArr[0].y = i18;
                    pointArr[1] = new Point(zzyVar.width + i17, i18);
                    pointArr[2] = new Point(zzyVar.width + i17, zzyVar.height + i18);
                    pointArr[3] = new Point(i17, i18 + zzyVar.height);
                    i15 = i16;
                    for (int i19 = 0; i19 < 4; i19++) {
                        Point point = pointArr[i19];
                        i13 = Math.min(i13, point.x);
                        i11 = Math.max(i11, point.x);
                        i14 = Math.min(i14, point.y);
                        i15 = Math.max(i15, point.y);
                    }
                    i12++;
                    c11 = 0;
                    textBlock2 = this;
                }
                int i21 = i15;
                zzy zzyVar3 = zzaeVarArr[c11].zzfd;
                int i22 = zzyVar3.left;
                int i23 = zzyVar3.top;
                double sin2 = Math.sin(Math.toRadians(zzyVar3.zzfb));
                double cos2 = Math.cos(Math.toRadians(zzyVar3.zzfb));
                Point[] pointArr2 = {new Point(i13, i14), new Point(i11, i14), new Point(i11, i21), new Point(i13, i21)};
                for (int i24 = 0; i24 < 4; i24++) {
                    pointArr2[i24].x = (int) ((pointArr2[i24].x * cos2) - (pointArr2[i24].y * sin2));
                    pointArr2[i24].y = (int) ((pointArr2[i24].x * sin2) + (pointArr2[i24].y * cos2));
                    pointArr2[i24].offset(i22, i23);
                }
                textBlock = this;
                textBlock.cornerPoints = pointArr2;
                return textBlock.cornerPoints;
            }
        }
        textBlock = textBlock2;
        return textBlock.cornerPoints;
    }

    public String getLanguage() {
        zzae[] zzaeVarArr;
        String str = this.zzex;
        if (str != null) {
            return str;
        }
        HashMap hashMap = new HashMap();
        for (zzae zzaeVar : this.zzev) {
            hashMap.put(zzaeVar.zzex, Integer.valueOf((hashMap.containsKey(zzaeVar.zzex) ? ((Integer) hashMap.get(zzaeVar.zzex)).intValue() : 0) + 1));
        }
        String str2 = (String) ((Map.Entry) Collections.max(hashMap.entrySet(), new zza(this))).getKey();
        this.zzex = str2;
        if (str2 == null || str2.isEmpty()) {
            this.zzex = RequestHeadersFactory.UNDETERMINED_LANGUAGE;
        }
        return this.zzex;
    }

    @Override // com.google.android.gms.vision.text.Text
    public String getValue() {
        zzae[] zzaeVarArr = this.zzev;
        if (zzaeVarArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(zzaeVarArr[0].zzfg);
        for (int i11 = 1; i11 < this.zzev.length; i11++) {
            sb2.append("\n");
            sb2.append(this.zzev[i11].zzfg);
        }
        return sb2.toString();
    }
}