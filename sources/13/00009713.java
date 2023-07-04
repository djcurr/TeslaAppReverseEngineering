package org.json.alipay;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes5.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public ArrayList f43239a;

    public a() {
        this.f43239a = new ArrayList();
    }

    public a(Object obj) {
        this();
        if (!obj.getClass().isArray()) {
            throw new JSONException("JSONArray initial value should be a string or collection or array.");
        }
        int length = Array.getLength(obj);
        for (int i11 = 0; i11 < length; i11++) {
            this.f43239a.add(Array.get(obj, i11));
        }
    }

    public a(String str) {
        this(new c(str));
    }

    public a(Collection collection) {
        this.f43239a = collection == null ? new ArrayList() : new ArrayList(collection);
    }

    public a(c cVar) {
        this();
        char c11;
        ArrayList arrayList;
        Object d11;
        char c12 = cVar.c();
        if (c12 == '[') {
            c11 = ']';
        } else if (c12 != '(') {
            throw cVar.a("A JSONArray text must start with '['");
        } else {
            c11 = ')';
        }
        if (cVar.c() == ']') {
            return;
        }
        do {
            cVar.a();
            char c13 = cVar.c();
            cVar.a();
            if (c13 == ',') {
                arrayList = this.f43239a;
                d11 = null;
            } else {
                arrayList = this.f43239a;
                d11 = cVar.d();
            }
            arrayList.add(d11);
            char c14 = cVar.c();
            if (c14 != ')') {
                if (c14 != ',' && c14 != ';') {
                    if (c14 != ']') {
                        throw cVar.a("Expected a ',' or ']'");
                    }
                }
            }
            if (c11 == c14) {
                return;
            }
            throw cVar.a("Expected a '" + new Character(c11) + "'");
        } while (cVar.c() != ']');
    }

    private String a(String str) {
        int size = this.f43239a.size();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i11 = 0; i11 < size; i11++) {
            if (i11 > 0) {
                stringBuffer.append(str);
            }
            stringBuffer.append(b.a(this.f43239a.get(i11)));
        }
        return stringBuffer.toString();
    }

    public final int a() {
        return this.f43239a.size();
    }

    public final Object a(int i11) {
        Object obj = (i11 < 0 || i11 >= this.f43239a.size()) ? null : this.f43239a.get(i11);
        if (obj != null) {
            return obj;
        }
        throw new JSONException("JSONArray[" + i11 + "] not found.");
    }

    public String toString() {
        try {
            return "[" + a(",") + ']';
        } catch (Exception unused) {
            return null;
        }
    }
}