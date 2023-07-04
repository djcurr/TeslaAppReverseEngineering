package jc;

import java.util.HashMap;

/* loaded from: classes.dex */
public class b extends cc.b {

    /* renamed from: e  reason: collision with root package name */
    protected static final HashMap<Integer, String> f33329e;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f33329e = hashMap;
        hashMap.put(1, "Detected File Type Name");
        hashMap.put(2, "Detected File Type Long Name");
        hashMap.put(3, "Detected MIME Type");
        hashMap.put(4, "Expected File Name Extension");
    }

    public b(com.drew.imaging.a aVar) {
        E(new a(this));
        R(1, aVar.getName());
        R(2, aVar.getLongName());
        if (aVar.getMimeType() != null) {
            R(3, aVar.getMimeType());
        }
        if (aVar.getCommonExtension() != null) {
            R(4, aVar.getCommonExtension());
        }
    }

    @Override // cc.b
    public String n() {
        return "File Type";
    }

    @Override // cc.b
    protected HashMap<Integer, String> w() {
        return f33329e;
    }
}