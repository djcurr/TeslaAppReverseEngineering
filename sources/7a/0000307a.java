package com.google.android.gms.vision.text;

import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.internal.vision.zzae;
import com.google.android.gms.internal.vision.zzan;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class Line implements Text {
    private zzae zzet;
    private List<Element> zzeu;

    public Line(zzae zzaeVar) {
        this.zzet = zzaeVar;
    }

    public float getAngle() {
        return this.zzet.zzfd.zzfb;
    }

    @Override // com.google.android.gms.vision.text.Text
    public Rect getBoundingBox() {
        return zzc.zza(this);
    }

    @Override // com.google.android.gms.vision.text.Text
    public List<? extends Text> getComponents() {
        if (this.zzet.zzfc.length == 0) {
            return new ArrayList(0);
        }
        if (this.zzeu == null) {
            this.zzeu = new ArrayList(this.zzet.zzfc.length);
            for (zzan zzanVar : this.zzet.zzfc) {
                this.zzeu.add(new Element(zzanVar));
            }
        }
        return this.zzeu;
    }

    @Override // com.google.android.gms.vision.text.Text
    public Point[] getCornerPoints() {
        return zzc.zza(this.zzet.zzfd);
    }

    public String getLanguage() {
        return this.zzet.zzex;
    }

    @Override // com.google.android.gms.vision.text.Text
    public String getValue() {
        return this.zzet.zzfg;
    }

    public boolean isVertical() {
        return this.zzet.zzfi;
    }
}