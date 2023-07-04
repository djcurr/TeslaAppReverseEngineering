package com.auth0.android.jwt;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
class e {

    /* renamed from: a  reason: collision with root package name */
    final String f10360a;

    /* renamed from: b  reason: collision with root package name */
    final Date f10361b;

    /* renamed from: c  reason: collision with root package name */
    final Date f10362c;

    /* renamed from: d  reason: collision with root package name */
    final List<String> f10363d;

    /* renamed from: e  reason: collision with root package name */
    final Map<String, ba.a> f10364e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(String str, String str2, Date date, Date date2, Date date3, String str3, List<String> list, Map<String, ba.a> map) {
        this.f10360a = str;
        this.f10361b = date;
        this.f10362c = date3;
        this.f10363d = list;
        this.f10364e = Collections.unmodifiableMap(map);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ba.a a(String str) {
        ba.a aVar = this.f10364e.get(str);
        return aVar != null ? aVar : new a();
    }
}