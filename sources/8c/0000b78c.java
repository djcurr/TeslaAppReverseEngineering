package u70;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public class b implements c {

    /* renamed from: d  reason: collision with root package name */
    private static final List f53361d = Collections.unmodifiableList(new ArrayList());

    /* renamed from: a  reason: collision with root package name */
    private String f53362a;

    /* renamed from: b  reason: collision with root package name */
    private List f53363b;

    /* renamed from: c  reason: collision with root package name */
    private byte[] f53364c;

    public b(String str, List list, byte[] bArr) {
        this.f53362a = str;
        this.f53363b = Collections.unmodifiableList(list);
        this.f53364c = bArr;
    }

    public b(String str, byte[] bArr) {
        this(str, f53361d, bArr);
    }

    public byte[] a() {
        return this.f53364c;
    }

    public List b() {
        return this.f53363b;
    }

    public String c() {
        return this.f53362a;
    }

    @Override // u70.c
    public b generate() {
        return this;
    }
}