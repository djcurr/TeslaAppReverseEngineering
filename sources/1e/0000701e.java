package g6;

import android.widget.ImageView;

/* loaded from: classes.dex */
public final /* synthetic */ class d {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f27792a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int[] f27793b;

    static {
        int[] iArr = new int[v5.b.values().length];
        f27792a = iArr;
        iArr[v5.b.MEMORY_CACHE.ordinal()] = 1;
        iArr[v5.b.MEMORY.ordinal()] = 2;
        iArr[v5.b.DISK.ordinal()] = 3;
        iArr[v5.b.NETWORK.ordinal()] = 4;
        int[] iArr2 = new int[ImageView.ScaleType.values().length];
        f27793b = iArr2;
        iArr2[ImageView.ScaleType.FIT_START.ordinal()] = 1;
        iArr2[ImageView.ScaleType.FIT_CENTER.ordinal()] = 2;
        iArr2[ImageView.ScaleType.FIT_END.ordinal()] = 3;
        iArr2[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 4;
    }
}