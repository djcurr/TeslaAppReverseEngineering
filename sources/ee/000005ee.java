package androidx.core.app;

import android.app.Person;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a  reason: collision with root package name */
    CharSequence f4411a;

    /* renamed from: b  reason: collision with root package name */
    IconCompat f4412b;

    /* renamed from: c  reason: collision with root package name */
    String f4413c;

    /* renamed from: d  reason: collision with root package name */
    String f4414d;

    /* renamed from: e  reason: collision with root package name */
    boolean f4415e;

    /* renamed from: f  reason: collision with root package name */
    boolean f4416f;

    public IconCompat a() {
        return this.f4412b;
    }

    public String b() {
        return this.f4414d;
    }

    public CharSequence c() {
        return this.f4411a;
    }

    public String d() {
        return this.f4413c;
    }

    public boolean e() {
        return this.f4415e;
    }

    public boolean f() {
        return this.f4416f;
    }

    public String g() {
        String str = this.f4413c;
        if (str != null) {
            return str;
        }
        if (this.f4411a != null) {
            return "name:" + ((Object) this.f4411a);
        }
        return "";
    }

    public Person h() {
        return new Person.Builder().setName(c()).setIcon(a() != null ? a().p() : null).setUri(d()).setKey(b()).setBot(e()).setImportant(f()).build();
    }
}