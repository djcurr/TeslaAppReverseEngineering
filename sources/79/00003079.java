package com.google.android.gms.vision.text;

import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.internal.vision.zzan;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class Element implements Text {
    private zzan zzes;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Element(zzan zzanVar) {
        this.zzes = zzanVar;
    }

    @Override // com.google.android.gms.vision.text.Text
    public Rect getBoundingBox() {
        return zzc.zza(this);
    }

    @Override // com.google.android.gms.vision.text.Text
    public List<? extends Text> getComponents() {
        return new ArrayList();
    }

    @Override // com.google.android.gms.vision.text.Text
    public Point[] getCornerPoints() {
        return zzc.zza(this.zzes.zzfd);
    }

    public String getLanguage() {
        return this.zzes.zzex;
    }

    @Override // com.google.android.gms.vision.text.Text
    public String getValue() {
        return this.zzes.zzfg;
    }
}