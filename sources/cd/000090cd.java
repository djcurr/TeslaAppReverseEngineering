package org.bouncycastle.asn1;

import java.util.Objects;

/* loaded from: classes5.dex */
public class d {

    /* renamed from: d  reason: collision with root package name */
    static final e40.b[] f43028d = new e40.b[0];

    /* renamed from: a  reason: collision with root package name */
    private e40.b[] f43029a;

    /* renamed from: b  reason: collision with root package name */
    private int f43030b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f43031c;

    public d() {
        this(10);
    }

    public d(int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("'initialCapacity' must not be negative");
        }
        this.f43029a = i11 == 0 ? f43028d : new e40.b[i11];
        this.f43030b = 0;
        this.f43031c = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static e40.b[] b(e40.b[] bVarArr) {
        return bVarArr.length < 1 ? f43028d : (e40.b[]) bVarArr.clone();
    }

    private void e(int i11) {
        e40.b[] bVarArr = new e40.b[Math.max(this.f43029a.length, i11 + (i11 >> 1))];
        System.arraycopy(this.f43029a, 0, bVarArr, 0, this.f43030b);
        this.f43029a = bVarArr;
        this.f43031c = false;
    }

    public void a(e40.b bVar) {
        Objects.requireNonNull(bVar, "'element' cannot be null");
        int length = this.f43029a.length;
        int i11 = this.f43030b + 1;
        if (this.f43031c | (i11 > length)) {
            e(i11);
        }
        this.f43029a[this.f43030b] = bVar;
        this.f43030b = i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e40.b[] c() {
        int i11 = this.f43030b;
        if (i11 == 0) {
            return f43028d;
        }
        e40.b[] bVarArr = new e40.b[i11];
        System.arraycopy(this.f43029a, 0, bVarArr, 0, i11);
        return bVarArr;
    }

    public e40.b d(int i11) {
        if (i11 < this.f43030b) {
            return this.f43029a[i11];
        }
        throw new ArrayIndexOutOfBoundsException(i11 + " >= " + this.f43030b);
    }

    public int f() {
        return this.f43030b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e40.b[] g() {
        int i11 = this.f43030b;
        if (i11 == 0) {
            return f43028d;
        }
        e40.b[] bVarArr = this.f43029a;
        if (bVarArr.length == i11) {
            this.f43031c = true;
            return bVarArr;
        }
        e40.b[] bVarArr2 = new e40.b[i11];
        System.arraycopy(bVarArr, 0, bVarArr2, 0, i11);
        return bVarArr2;
    }
}