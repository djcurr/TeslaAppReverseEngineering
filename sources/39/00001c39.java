package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import ci.i;
import com.google.android.exoplayer2.drm.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class c extends lj.d {

    /* renamed from: n  reason: collision with root package name */
    public static final c f14063n = new c("", Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, Collections.emptyList(), false, Collections.emptyMap(), Collections.emptyList());

    /* renamed from: d  reason: collision with root package name */
    public final List<Uri> f14064d;

    /* renamed from: e  reason: collision with root package name */
    public final List<b> f14065e;

    /* renamed from: f  reason: collision with root package name */
    public final List<a> f14066f;

    /* renamed from: g  reason: collision with root package name */
    public final List<a> f14067g;

    /* renamed from: h  reason: collision with root package name */
    public final List<a> f14068h;

    /* renamed from: i  reason: collision with root package name */
    public final List<a> f14069i;

    /* renamed from: j  reason: collision with root package name */
    public final i f14070j;

    /* renamed from: k  reason: collision with root package name */
    public final List<i> f14071k;

    /* renamed from: l  reason: collision with root package name */
    public final Map<String, String> f14072l;

    /* renamed from: m  reason: collision with root package name */
    public final List<e> f14073m;

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f14074a;

        /* renamed from: b  reason: collision with root package name */
        public final i f14075b;

        /* renamed from: c  reason: collision with root package name */
        public final String f14076c;

        public a(Uri uri, i iVar, String str, String str2) {
            this.f14074a = uri;
            this.f14075b = iVar;
            this.f14076c = str2;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f14077a;

        /* renamed from: b  reason: collision with root package name */
        public final i f14078b;

        /* renamed from: c  reason: collision with root package name */
        public final String f14079c;

        /* renamed from: d  reason: collision with root package name */
        public final String f14080d;

        /* renamed from: e  reason: collision with root package name */
        public final String f14081e;

        /* renamed from: f  reason: collision with root package name */
        public final String f14082f;

        public b(Uri uri, i iVar, String str, String str2, String str3, String str4) {
            this.f14077a = uri;
            this.f14078b = iVar;
            this.f14079c = str;
            this.f14080d = str2;
            this.f14081e = str3;
            this.f14082f = str4;
        }

        public static b b(Uri uri) {
            return new b(uri, new i.b().S("0").K("application/x-mpegURL").E(), null, null, null, null);
        }

        public b a(i iVar) {
            return new b(this.f14077a, iVar, this.f14079c, this.f14080d, this.f14081e, this.f14082f);
        }
    }

    public c(String str, List<String> list, List<b> list2, List<a> list3, List<a> list4, List<a> list5, List<a> list6, i iVar, List<i> list7, boolean z11, Map<String, String> map, List<e> list8) {
        super(str, list, z11);
        this.f14064d = Collections.unmodifiableList(f(list2, list3, list4, list5, list6));
        this.f14065e = Collections.unmodifiableList(list2);
        this.f14066f = Collections.unmodifiableList(list3);
        this.f14067g = Collections.unmodifiableList(list4);
        this.f14068h = Collections.unmodifiableList(list5);
        this.f14069i = Collections.unmodifiableList(list6);
        this.f14070j = iVar;
        this.f14071k = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.f14072l = Collections.unmodifiableMap(map);
        this.f14073m = Collections.unmodifiableList(list8);
    }

    private static void b(List<a> list, List<Uri> list2) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            Uri uri = list.get(i11).f14074a;
            if (uri != null && !list2.contains(uri)) {
                list2.add(uri);
            }
        }
    }

    private static <T> List<T> d(List<T> list, int i11, List<ej.c> list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i12 = 0; i12 < list.size(); i12++) {
            T t11 = list.get(i12);
            int i13 = 0;
            while (true) {
                if (i13 < list2.size()) {
                    ej.c cVar = list2.get(i13);
                    if (cVar.f25188b == i11 && cVar.f25189c == i12) {
                        arrayList.add(t11);
                        break;
                    }
                    i13++;
                }
            }
        }
        return arrayList;
    }

    public static c e(String str) {
        return new c("", Collections.emptyList(), Collections.singletonList(b.b(Uri.parse(str))), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, null, false, Collections.emptyMap(), Collections.emptyList());
    }

    private static List<Uri> f(List<b> list, List<a> list2, List<a> list3, List<a> list4, List<a> list5) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            Uri uri = list.get(i11).f14077a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(list2, arrayList);
        b(list3, arrayList);
        b(list4, arrayList);
        b(list5, arrayList);
        return arrayList;
    }

    @Override // ej.a
    /* renamed from: c */
    public c a(List<ej.c> list) {
        return new c(this.f37205a, this.f37206b, d(this.f14065e, 0, list), Collections.emptyList(), d(this.f14067g, 1, list), d(this.f14068h, 2, list), Collections.emptyList(), this.f14070j, this.f14071k, this.f37207c, this.f14072l, this.f14073m);
    }
}