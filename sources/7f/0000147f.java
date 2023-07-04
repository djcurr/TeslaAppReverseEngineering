package com.android.volley;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    public final int f10283a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f10284b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, String> f10285c;

    /* renamed from: d  reason: collision with root package name */
    public final List<e> f10286d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f10287e;

    @Deprecated
    public h(int i11, byte[] bArr, Map<String, String> map, boolean z11, long j11) {
        this(i11, bArr, map, a(map), z11, j11);
    }

    private static List<e> a(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(new e(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    private static Map<String, String> b(List<e> list) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return Collections.emptyMap();
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (e eVar : list) {
            treeMap.put(eVar.a(), eVar.b());
        }
        return treeMap;
    }

    public h(int i11, byte[] bArr, boolean z11, long j11, List<e> list) {
        this(i11, bArr, b(list), list, z11, j11);
    }

    @Deprecated
    public h(byte[] bArr, Map<String, String> map) {
        this(200, bArr, map, false, 0L);
    }

    private h(int i11, byte[] bArr, Map<String, String> map, List<e> list, boolean z11, long j11) {
        this.f10283a = i11;
        this.f10284b = bArr;
        this.f10285c = map;
        if (list == null) {
            this.f10286d = null;
        } else {
            this.f10286d = Collections.unmodifiableList(list);
        }
        this.f10287e = z11;
    }
}