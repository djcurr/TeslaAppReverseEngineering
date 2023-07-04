package o8;

import android.content.Context;

/* loaded from: classes.dex */
public class c implements m8.a {

    /* renamed from: a  reason: collision with root package name */
    public q9.a f42317a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f42318b = false;

    /* renamed from: c  reason: collision with root package name */
    public boolean f42319c = false;

    @Override // m8.a
    public String a(Context context) {
        if (context == null) {
            return null;
        }
        if (!this.f42318b) {
            q9.a aVar = new q9.a();
            this.f42317a = aVar;
            this.f42319c = aVar.a(context, null) == 1;
            this.f42318b = true;
        }
        q8.a.c("getOAID", "isSupported", Boolean.valueOf(this.f42319c));
        if (this.f42319c && this.f42317a.h()) {
            return this.f42317a.f();
        }
        return null;
    }
}