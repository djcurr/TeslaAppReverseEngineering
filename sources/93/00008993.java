package n30;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import m30.c;
import net.time4j.g0;
import net.time4j.tz.m;
import net.time4j.tz.r;
import net.time4j.tz.s;

/* loaded from: classes5.dex */
public class a implements r, c {

    /* renamed from: a  reason: collision with root package name */
    private final String f40438a;

    /* renamed from: b  reason: collision with root package name */
    private final String f40439b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, byte[]> f40440c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, String> f40441d;

    /* renamed from: e  reason: collision with root package name */
    private final g0 f40442e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<net.time4j.base.a, Integer> f40443f;

    /* JADX WARN: Removed duplicated region for block: B:100:0x020c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x022d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0229  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a() {
        /*
            Method dump skipped, instructions count: 561
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n30.a.<init>():void");
    }

    private static void h(DataInputStream dataInputStream, String str) {
        byte readByte = dataInputStream.readByte();
        byte readByte2 = dataInputStream.readByte();
        byte readByte3 = dataInputStream.readByte();
        byte readByte4 = dataInputStream.readByte();
        byte readByte5 = dataInputStream.readByte();
        byte readByte6 = dataInputStream.readByte();
        if (readByte == 116 && readByte2 == 122 && readByte3 == 114 && readByte4 == 101 && readByte5 == 112 && readByte6 == 111) {
            return;
        }
        throw new IOException("Invalid tz-repository: " + str);
    }

    private static Class<?> j() {
        if (Boolean.getBoolean("test.environment")) {
            try {
                return Class.forName("net.time4j.tz.spi.RepositoryTest");
            } catch (ClassNotFoundException e11) {
                throw new AssertionError(e11);
            }
        }
        return a.class;
    }

    @Override // net.time4j.tz.r
    public s a() {
        return null;
    }

    @Override // m30.c
    public boolean b() {
        return !this.f40443f.isEmpty();
    }

    @Override // net.time4j.tz.r
    public Map<String, String> c() {
        return this.f40441d;
    }

    @Override // m30.c
    public Map<net.time4j.base.a, Integer> e() {
        return Collections.unmodifiableMap(this.f40443f);
    }

    @Override // net.time4j.tz.r
    public Set<String> f() {
        return this.f40440c.keySet();
    }

    @Override // net.time4j.tz.r
    public String g() {
        return "";
    }

    @Override // net.time4j.tz.r
    public String getLocation() {
        return this.f40439b;
    }

    @Override // net.time4j.tz.r
    public String getName() {
        return "TZDB";
    }

    @Override // net.time4j.tz.r
    public String getVersion() {
        return this.f40438a;
    }

    @Override // m30.c
    /* renamed from: i */
    public g0 d() {
        return this.f40442e;
    }

    @Override // net.time4j.tz.r
    public m load(String str) {
        try {
            byte[] bArr = this.f40440c.get(str);
            if (bArr != null) {
                return (m) new ObjectInputStream(new ByteArrayInputStream(bArr)).readObject();
            }
            return null;
        } catch (IOException e11) {
            e11.printStackTrace();
            return null;
        } catch (ClassNotFoundException e12) {
            e12.printStackTrace();
            return null;
        }
    }

    public String toString() {
        return "TZ-REPOSITORY(" + this.f40438a + ")";
    }
}