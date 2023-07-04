package ww;

import ezvcard.VCardVersion;
import java.util.ArrayList;
import java.util.List;
import ww.b;

/* loaded from: classes5.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private VCardVersion f56420a;

    /* renamed from: b  reason: collision with root package name */
    private List<b> f56421b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private Integer f56422c;

    /* renamed from: d  reason: collision with root package name */
    private String f56423d;

    public void a(int i11, Object... objArr) {
        this.f56421b.add(new b.C1282b(this).c(i11, objArr).a());
    }

    public Integer b() {
        return this.f56422c;
    }

    public String c() {
        return this.f56423d;
    }

    public VCardVersion d() {
        return this.f56420a;
    }

    public List<b> e() {
        return this.f56421b;
    }

    public void f(Integer num) {
        this.f56422c = num;
    }

    public void g(String str) {
        this.f56423d = str;
    }

    public void h(VCardVersion vCardVersion) {
        this.f56420a = vCardVersion;
    }
}