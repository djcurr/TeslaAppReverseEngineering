package com.android.volley.toolbox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public class d {

    /* renamed from: e  reason: collision with root package name */
    protected static final Comparator<byte[]> f10323e = new a();

    /* renamed from: a  reason: collision with root package name */
    private final List<byte[]> f10324a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private final List<byte[]> f10325b = new ArrayList(64);

    /* renamed from: c  reason: collision with root package name */
    private int f10326c = 0;

    /* renamed from: d  reason: collision with root package name */
    private final int f10327d;

    /* loaded from: classes.dex */
    class a implements Comparator<byte[]> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(byte[] bArr, byte[] bArr2) {
            return bArr.length - bArr2.length;
        }
    }

    public d(int i11) {
        this.f10327d = i11;
    }

    private synchronized void c() {
        while (this.f10326c > this.f10327d) {
            byte[] remove = this.f10324a.remove(0);
            this.f10325b.remove(remove);
            this.f10326c -= remove.length;
        }
    }

    public synchronized byte[] a(int i11) {
        for (int i12 = 0; i12 < this.f10325b.size(); i12++) {
            byte[] bArr = this.f10325b.get(i12);
            if (bArr.length >= i11) {
                this.f10326c -= bArr.length;
                this.f10325b.remove(i12);
                this.f10324a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i11];
    }

    public synchronized void b(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.f10327d) {
                this.f10324a.add(bArr);
                int binarySearch = Collections.binarySearch(this.f10325b, bArr, f10323e);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                this.f10325b.add(binarySearch, bArr);
                this.f10326c += bArr.length;
                c();
            }
        }
    }
}