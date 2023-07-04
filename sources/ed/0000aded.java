package qf;

import android.util.SparseIntArray;

/* loaded from: classes3.dex */
public class u {

    /* renamed from: a  reason: collision with root package name */
    public final int f48139a;

    /* renamed from: b  reason: collision with root package name */
    public final int f48140b;

    /* renamed from: c  reason: collision with root package name */
    public final SparseIntArray f48141c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f48142d;

    /* renamed from: e  reason: collision with root package name */
    public final int f48143e;

    public u(int i11, int i12, SparseIntArray sparseIntArray) {
        this(i11, i12, sparseIntArray, 0, Integer.MAX_VALUE, -1);
    }

    public u(int i11, int i12, SparseIntArray sparseIntArray, int i13, int i14, int i15) {
        md.k.i(i11 >= 0 && i12 >= i11);
        this.f48140b = i11;
        this.f48139a = i12;
        this.f48141c = sparseIntArray;
        this.f48143e = i15;
    }
}