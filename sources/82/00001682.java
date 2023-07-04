package com.facebook.hermes.intl;

import android.os.Build;
import android.text.TextUtils;
import com.facebook.hermes.intl.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes3.dex */
public class g implements ye.b<Locale> {

    /* renamed from: a  reason: collision with root package name */
    private Locale f11218a;

    /* renamed from: b  reason: collision with root package name */
    private j f11219b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f11220c;

    private g(Locale locale) {
        this.f11218a = null;
        this.f11219b = null;
        this.f11220c = false;
        this.f11218a = locale;
    }

    public static ye.b<Locale> i() {
        return new g(Locale.getDefault());
    }

    public static ye.b<Locale> j(String str) {
        return new g(str);
    }

    private void k() {
        if (this.f11220c) {
            try {
                o();
                this.f11220c = false;
            } catch (RuntimeException e11) {
                throw new JSRangeErrorException(e11.getMessage());
            }
        }
    }

    private void l() {
        if (this.f11219b == null) {
            if (Build.VERSION.SDK_INT < 21) {
                this.f11219b = e.f("en");
            } else {
                this.f11219b = e.f(this.f11218a.toLanguageTag());
            }
        }
    }

    private void o() {
        if (Build.VERSION.SDK_INT < 21) {
            this.f11218a = Locale.ENGLISH;
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();
        StringBuffer stringBuffer3 = new StringBuffer();
        StringBuffer stringBuffer4 = new StringBuffer();
        String str = this.f11219b.f11221a.f11228a;
        if (str != null && !str.isEmpty()) {
            stringBuffer2.append(this.f11219b.f11221a.f11228a);
        }
        String str2 = this.f11219b.f11221a.f11229b;
        if (str2 != null && !str2.isEmpty()) {
            stringBuffer3.append(this.f11219b.f11221a.f11229b);
        }
        String str3 = this.f11219b.f11221a.f11230c;
        if (str3 != null && !str3.isEmpty()) {
            stringBuffer4.append(this.f11219b.f11221a.f11230c);
        }
        e.m(stringBuffer2, stringBuffer3, stringBuffer4);
        if (stringBuffer2.length() > 0) {
            stringBuffer.append(stringBuffer2.toString());
        }
        if (stringBuffer3.length() > 0) {
            stringBuffer.append("-");
            stringBuffer.append(stringBuffer3.toString());
        }
        if (stringBuffer4.length() > 0) {
            stringBuffer.append("-");
            stringBuffer.append(e.n(stringBuffer4));
        }
        ArrayList<String> arrayList = this.f11219b.f11221a.f11231d;
        if (arrayList != null && !arrayList.isEmpty()) {
            stringBuffer.append("-");
            stringBuffer.append(TextUtils.join("-", this.f11219b.f11221a.f11231d));
        }
        TreeMap<Character, ArrayList<String>> treeMap = this.f11219b.f11226f;
        if (treeMap != null) {
            for (Map.Entry<Character, ArrayList<String>> entry : treeMap.entrySet()) {
                stringBuffer.append("-");
                stringBuffer.append(entry.getKey());
                stringBuffer.append("-");
                stringBuffer.append(TextUtils.join("-", entry.getValue()));
            }
        }
        j jVar = this.f11219b;
        if (jVar.f11224d != null || jVar.f11225e != null) {
            stringBuffer.append("-");
            stringBuffer.append('t');
            stringBuffer.append("-");
            StringBuffer stringBuffer5 = new StringBuffer();
            j.a aVar = this.f11219b.f11224d;
            if (aVar != null) {
                stringBuffer5.append(aVar.f11228a);
                if (this.f11219b.f11224d.f11229b != null) {
                    stringBuffer5.append("-");
                    stringBuffer5.append(this.f11219b.f11224d.f11229b);
                }
                if (this.f11219b.f11224d.f11230c != null) {
                    stringBuffer5.append("-");
                    stringBuffer5.append(this.f11219b.f11224d.f11230c);
                }
                ArrayList<String> arrayList2 = this.f11219b.f11224d.f11231d;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    stringBuffer5.append("-");
                    stringBuffer5.append(TextUtils.join("-", this.f11219b.f11224d.f11231d));
                }
            }
            TreeMap<String, ArrayList<String>> treeMap2 = this.f11219b.f11225e;
            if (treeMap2 != null) {
                for (Map.Entry<String, ArrayList<String>> entry2 : treeMap2.entrySet()) {
                    stringBuffer5.append("-" + entry2.getKey());
                    Iterator<String> it2 = entry2.getValue().iterator();
                    while (it2.hasNext()) {
                        stringBuffer5.append("-" + it2.next());
                    }
                }
                if (stringBuffer5.length() > 0 && stringBuffer5.charAt(0) == '-') {
                    stringBuffer5.deleteCharAt(0);
                }
            }
            stringBuffer.append(stringBuffer5.toString());
        }
        j jVar2 = this.f11219b;
        if (jVar2.f11222b != null || jVar2.f11223c != null) {
            stringBuffer.append("-");
            stringBuffer.append('u');
            stringBuffer.append("-");
            StringBuffer stringBuffer6 = new StringBuffer();
            ArrayList<CharSequence> arrayList3 = this.f11219b.f11222b;
            if (arrayList3 != null) {
                stringBuffer6.append(TextUtils.join("-", arrayList3));
            }
            TreeMap<String, ArrayList<String>> treeMap3 = this.f11219b.f11223c;
            if (treeMap3 != null) {
                for (Map.Entry<String, ArrayList<String>> entry3 : treeMap3.entrySet()) {
                    stringBuffer6.append("-" + entry3.getKey());
                    Iterator<String> it3 = entry3.getValue().iterator();
                    while (it3.hasNext()) {
                        stringBuffer6.append("-" + it3.next());
                    }
                }
            }
            if (stringBuffer6.length() > 0 && stringBuffer6.charAt(0) == '-') {
                stringBuffer6.deleteCharAt(0);
            }
            stringBuffer.append(stringBuffer6.toString());
        }
        if (this.f11219b.f11227g != null) {
            stringBuffer.append("-");
            stringBuffer.append('x');
            stringBuffer.append("-");
            stringBuffer.append(TextUtils.join("-", this.f11219b.f11227g));
        }
        try {
            this.f11218a = Locale.forLanguageTag(stringBuffer.toString());
            this.f11220c = false;
        } catch (RuntimeException e11) {
            throw new JSRangeErrorException(e11.getMessage());
        }
    }

    @Override // ye.b
    public HashMap<String, String> a() {
        HashMap<String, String> hashMap = new HashMap<>();
        TreeMap<String, ArrayList<String>> treeMap = this.f11219b.f11223c;
        if (treeMap != null) {
            for (String str : treeMap.keySet()) {
                hashMap.put(str, TextUtils.join("-", this.f11219b.f11223c.get(str)));
            }
        }
        return hashMap;
    }

    @Override // ye.b
    public ArrayList<String> b(String str) {
        ArrayList<String> arrayList;
        k();
        l();
        TreeMap<String, ArrayList<String>> treeMap = this.f11219b.f11223c;
        return (treeMap == null || (arrayList = treeMap.get(str)) == null) ? new ArrayList<>() : arrayList;
    }

    @Override // ye.b
    public ye.b<Locale> d() {
        k();
        return new g(this.f11218a);
    }

    @Override // ye.b
    public String e() {
        return Build.VERSION.SDK_INT < 21 ? "en" : c().toLanguageTag();
    }

    @Override // ye.b
    public void f(String str, ArrayList<String> arrayList) {
        k();
        l();
        j jVar = this.f11219b;
        if (jVar.f11223c == null) {
            jVar.f11223c = new TreeMap<>();
        }
        if (!this.f11219b.f11223c.containsKey(str)) {
            this.f11219b.f11223c.put(str, new ArrayList<>());
        }
        this.f11219b.f11223c.get(str).clear();
        this.f11219b.f11223c.get(str).addAll(arrayList);
        this.f11220c = true;
    }

    @Override // ye.b
    public String g() {
        return Build.VERSION.SDK_INT < 21 ? "en" : h().toLanguageTag();
    }

    @Override // ye.b
    /* renamed from: m */
    public Locale h() {
        k();
        return this.f11218a;
    }

    @Override // ye.b
    /* renamed from: n */
    public Locale c() {
        k();
        l();
        j jVar = new j();
        jVar.f11221a = this.f11219b.f11221a;
        return new g(jVar).h();
    }

    private g(String str) {
        this.f11218a = null;
        this.f11219b = null;
        this.f11220c = false;
        this.f11219b = e.f(str);
        o();
    }

    private g(j jVar) {
        this.f11218a = null;
        this.f11219b = null;
        this.f11220c = false;
        this.f11219b = jVar;
        o();
    }
}