package wj;

import ak.k0;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: f  reason: collision with root package name */
    private int f55925f;

    /* renamed from: h  reason: collision with root package name */
    private int f55927h;

    /* renamed from: o  reason: collision with root package name */
    private float f55934o;

    /* renamed from: a  reason: collision with root package name */
    private String f55920a = "";

    /* renamed from: b  reason: collision with root package name */
    private String f55921b = "";

    /* renamed from: c  reason: collision with root package name */
    private Set<String> f55922c = Collections.emptySet();

    /* renamed from: d  reason: collision with root package name */
    private String f55923d = "";

    /* renamed from: e  reason: collision with root package name */
    private String f55924e = null;

    /* renamed from: g  reason: collision with root package name */
    private boolean f55926g = false;

    /* renamed from: i  reason: collision with root package name */
    private boolean f55928i = false;

    /* renamed from: j  reason: collision with root package name */
    private int f55929j = -1;

    /* renamed from: k  reason: collision with root package name */
    private int f55930k = -1;

    /* renamed from: l  reason: collision with root package name */
    private int f55931l = -1;

    /* renamed from: m  reason: collision with root package name */
    private int f55932m = -1;

    /* renamed from: n  reason: collision with root package name */
    private int f55933n = -1;

    /* renamed from: p  reason: collision with root package name */
    private int f55935p = -1;

    /* renamed from: q  reason: collision with root package name */
    private boolean f55936q = false;

    private static int z(int i11, String str, String str2, int i12) {
        if (str.isEmpty() || i11 == -1) {
            return i11;
        }
        if (str.equals(str2)) {
            return i11 + i12;
        }
        return -1;
    }

    public int a() {
        if (this.f55928i) {
            return this.f55927h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public boolean b() {
        return this.f55936q;
    }

    public int c() {
        if (this.f55926g) {
            return this.f55925f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    public String d() {
        return this.f55924e;
    }

    public float e() {
        return this.f55934o;
    }

    public int f() {
        return this.f55933n;
    }

    public int g() {
        return this.f55935p;
    }

    public int h(String str, String str2, Set<String> set, String str3) {
        if (this.f55920a.isEmpty() && this.f55921b.isEmpty() && this.f55922c.isEmpty() && this.f55923d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int z11 = z(z(z(0, this.f55920a, str, 1073741824), this.f55921b, str2, 2), this.f55923d, str3, 4);
        if (z11 == -1 || !set.containsAll(this.f55922c)) {
            return 0;
        }
        return z11 + (this.f55922c.size() * 4);
    }

    public int i() {
        int i11 = this.f55931l;
        if (i11 == -1 && this.f55932m == -1) {
            return -1;
        }
        return (i11 == 1 ? 1 : 0) | (this.f55932m == 1 ? 2 : 0);
    }

    public boolean j() {
        return this.f55928i;
    }

    public boolean k() {
        return this.f55926g;
    }

    public boolean l() {
        return this.f55929j == 1;
    }

    public boolean m() {
        return this.f55930k == 1;
    }

    public d n(int i11) {
        this.f55927h = i11;
        this.f55928i = true;
        return this;
    }

    public d o(boolean z11) {
        this.f55931l = z11 ? 1 : 0;
        return this;
    }

    public d p(boolean z11) {
        this.f55936q = z11;
        return this;
    }

    public d q(int i11) {
        this.f55925f = i11;
        this.f55926g = true;
        return this;
    }

    public d r(String str) {
        this.f55924e = k0.R0(str);
        return this;
    }

    public d s(boolean z11) {
        this.f55932m = z11 ? 1 : 0;
        return this;
    }

    public d t(int i11) {
        this.f55935p = i11;
        return this;
    }

    public void u(String[] strArr) {
        this.f55922c = new HashSet(Arrays.asList(strArr));
    }

    public void v(String str) {
        this.f55920a = str;
    }

    public void w(String str) {
        this.f55921b = str;
    }

    public void x(String str) {
        this.f55923d = str;
    }

    public d y(boolean z11) {
        this.f55930k = z11 ? 1 : 0;
        return this;
    }
}