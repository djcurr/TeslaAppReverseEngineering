package ye;

import android.icu.util.ULocale;
import android.text.TextUtils;
import com.facebook.hermes.intl.JSRangeErrorException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class f implements b<ULocale> {

    /* renamed from: a  reason: collision with root package name */
    private ULocale f59456a;

    /* renamed from: b  reason: collision with root package name */
    private ULocale.Builder f59457b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f59458c;

    private f(ULocale uLocale) {
        this.f59456a = null;
        this.f59457b = null;
        this.f59458c = false;
        this.f59456a = uLocale;
    }

    public static b<ULocale> i() {
        return new f(ULocale.getDefault(ULocale.Category.FORMAT));
    }

    public static b<ULocale> j(String str) {
        return new f(str);
    }

    public static b<ULocale> k(ULocale uLocale) {
        return new f(uLocale);
    }

    private void l() {
        if (this.f59458c) {
            try {
                this.f59456a = this.f59457b.build();
                this.f59458c = false;
            } catch (RuntimeException e11) {
                throw new JSRangeErrorException(e11.getMessage());
            }
        }
    }

    @Override // ye.b
    public HashMap<String, String> a() {
        l();
        HashMap<String, String> hashMap = new HashMap<>();
        Iterator<String> keywords = this.f59456a.getKeywords();
        if (keywords != null) {
            while (keywords.hasNext()) {
                String next = keywords.next();
                hashMap.put(g.b(next), this.f59456a.getKeywordValue(next));
            }
        }
        return hashMap;
    }

    @Override // ye.b
    public ArrayList<String> b(String str) {
        l();
        String a11 = g.a(str);
        ArrayList<String> arrayList = new ArrayList<>();
        String keywordValue = this.f59456a.getKeywordValue(a11);
        if (keywordValue != null && !keywordValue.isEmpty()) {
            Collections.addAll(arrayList, keywordValue.split("-|_"));
        }
        return arrayList;
    }

    @Override // ye.b
    public b<ULocale> d() {
        l();
        return new f(this.f59456a);
    }

    @Override // ye.b
    public String e() {
        return c().toLanguageTag();
    }

    @Override // ye.b
    public void f(String str, ArrayList<String> arrayList) {
        l();
        if (this.f59457b == null) {
            this.f59457b = new ULocale.Builder().setLocale(this.f59456a);
        }
        try {
            this.f59457b.setUnicodeLocaleKeyword(str, TextUtils.join("-", arrayList));
            this.f59458c = true;
        } catch (RuntimeException e11) {
            throw new JSRangeErrorException(e11.getMessage());
        }
    }

    @Override // ye.b
    public String g() {
        return h().toLanguageTag();
    }

    @Override // ye.b
    /* renamed from: m */
    public ULocale h() {
        l();
        return this.f59456a;
    }

    @Override // ye.b
    /* renamed from: n */
    public ULocale c() {
        l();
        ULocale.Builder builder = new ULocale.Builder();
        builder.setLocale(this.f59456a);
        builder.clearExtensions();
        return builder.build();
    }

    private f(String str) {
        this.f59456a = null;
        this.f59457b = null;
        this.f59458c = false;
        ULocale.Builder builder = new ULocale.Builder();
        this.f59457b = builder;
        try {
            builder.setLanguageTag(str);
            this.f59458c = true;
        } catch (RuntimeException e11) {
            throw new JSRangeErrorException(e11.getMessage());
        }
    }
}