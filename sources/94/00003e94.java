package com.horcrux.svg;

import android.graphics.Paint;
import android.graphics.Path;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;

/* loaded from: classes2.dex */
class k {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<Path> f17641a;

    /* renamed from: b  reason: collision with root package name */
    private final int[][] f17642b;

    /* renamed from: c  reason: collision with root package name */
    private final Paint f17643c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(Paint paint) {
        ArrayList<Path> arrayList = new ArrayList<>();
        this.f17641a = arrayList;
        this.f17642b = new int[256];
        this.f17643c = paint;
        arrayList.add(new Path());
    }

    private int a(char c11) {
        int[] iArr = this.f17642b[c11 >> '\b'];
        if (iArr == null) {
            return 0;
        }
        return iArr[c11 & 255];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Path b(char c11, String str) {
        Path path;
        int a11 = a(c11);
        if (a11 != 0) {
            path = this.f17641a.get(a11);
        } else {
            Path path2 = new Path();
            this.f17643c.getTextPath(str, 0, 1, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, path2);
            int[][] iArr = this.f17642b;
            int i11 = c11 >> '\b';
            int[] iArr2 = iArr[i11];
            if (iArr2 == null) {
                iArr2 = new int[256];
                iArr[i11] = iArr2;
            }
            iArr2[c11 & 255] = this.f17641a.size();
            this.f17641a.add(path2);
            path = path2;
        }
        Path path3 = new Path();
        path3.addPath(path);
        return path3;
    }
}