package androidx.security.crypto;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import hl.g;
import hl.i;
import il.f;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import ll.a;

/* loaded from: classes.dex */
public final class a implements SharedPreferences {

    /* renamed from: a */
    final SharedPreferences f5943a;

    /* renamed from: b */
    final List<SharedPreferences.OnSharedPreferenceChangeListener> f5944b = new ArrayList();

    /* renamed from: c */
    final String f5945c;

    /* renamed from: d */
    final hl.a f5946d;

    /* renamed from: e */
    final hl.d f5947e;

    /* renamed from: androidx.security.crypto.a$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C0100a {

        /* renamed from: a */
        static final /* synthetic */ int[] f5948a;

        static {
            int[] iArr = new int[c.values().length];
            f5948a = iArr;
            try {
                iArr[c.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5948a[c.INT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5948a[c.LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5948a[c.FLOAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5948a[c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5948a[c.STRING_SET.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* loaded from: classes.dex */
    private static final class b implements SharedPreferences.Editor {

        /* renamed from: a */
        private final a f5949a;

        /* renamed from: b */
        private final SharedPreferences.Editor f5950b;

        /* renamed from: d */
        private AtomicBoolean f5952d = new AtomicBoolean(false);

        /* renamed from: c */
        private final List<String> f5951c = new CopyOnWriteArrayList();

        b(a aVar, SharedPreferences.Editor editor) {
            this.f5949a = aVar;
            this.f5950b = editor;
        }

        private void a() {
            if (this.f5952d.getAndSet(false)) {
                for (String str : this.f5949a.getAll().keySet()) {
                    if (!this.f5951c.contains(str) && !this.f5949a.g(str)) {
                        this.f5950b.remove(this.f5949a.d(str));
                    }
                }
            }
        }

        private void b() {
            for (SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : this.f5949a.f5944b) {
                for (String str : this.f5951c) {
                    onSharedPreferenceChangeListener.onSharedPreferenceChanged(this.f5949a, str);
                }
            }
        }

        private void c(String str, byte[] bArr) {
            if (!this.f5949a.g(str)) {
                this.f5951c.add(str);
                if (str == null) {
                    str = "__NULL__";
                }
                try {
                    Pair<String, String> e11 = this.f5949a.e(str, bArr);
                    this.f5950b.putString((String) e11.first, (String) e11.second);
                    return;
                } catch (GeneralSecurityException e12) {
                    throw new SecurityException("Could not encrypt data: " + e12.getMessage(), e12);
                }
            }
            throw new SecurityException(str + " is a reserved key for the encryption keyset.");
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            a();
            this.f5950b.apply();
            b();
            this.f5951c.clear();
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor clear() {
            this.f5952d.set(true);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            a();
            try {
                return this.f5950b.commit();
            } finally {
                b();
                this.f5951c.clear();
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putBoolean(String str, boolean z11) {
            ByteBuffer allocate = ByteBuffer.allocate(5);
            allocate.putInt(c.BOOLEAN.getId());
            allocate.put(z11 ? (byte) 1 : (byte) 0);
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putFloat(String str, float f11) {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putInt(c.FLOAT.getId());
            allocate.putFloat(f11);
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putInt(String str, int i11) {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putInt(c.INT.getId());
            allocate.putInt(i11);
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putLong(String str, long j11) {
            ByteBuffer allocate = ByteBuffer.allocate(12);
            allocate.putInt(c.LONG.getId());
            allocate.putLong(j11);
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putString(String str, String str2) {
            if (str2 == null) {
                str2 = "__NULL__";
            }
            byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
            int length = bytes.length;
            ByteBuffer allocate = ByteBuffer.allocate(length + 8);
            allocate.putInt(c.STRING.getId());
            allocate.putInt(length);
            allocate.put(bytes);
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            if (set == null) {
                set = new androidx.collection.b<>();
                set.add("__NULL__");
            }
            ArrayList<byte[]> arrayList = new ArrayList(set.size());
            int size = set.size() * 4;
            for (String str2 : set) {
                byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
                arrayList.add(bytes);
                size += bytes.length;
            }
            ByteBuffer allocate = ByteBuffer.allocate(size + 4);
            allocate.putInt(c.STRING_SET.getId());
            for (byte[] bArr : arrayList) {
                allocate.putInt(bArr.length);
                allocate.put(bArr);
            }
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor remove(String str) {
            if (!this.f5949a.g(str)) {
                this.f5950b.remove(this.f5949a.d(str));
                this.f5951c.remove(str);
                return this;
            }
            throw new SecurityException(str + " is a reserved key for the encryption keyset.");
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        STRING(0),
        STRING_SET(1),
        INT(2),
        LONG(3),
        FLOAT(4),
        BOOLEAN(5);
        
        private final int mId;

        c(int i11) {
            this.mId = i11;
        }

        public static c fromId(int i11) {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 4) {
                                if (i11 != 5) {
                                    return null;
                                }
                                return BOOLEAN;
                            }
                            return FLOAT;
                        }
                        return LONG;
                    }
                    return INT;
                }
                return STRING_SET;
            }
            return STRING;
        }

        public int getId() {
            return this.mId;
        }
    }

    /* loaded from: classes.dex */
    public enum d {
        AES256_SIV(kl.a.j());
        
        private final g mDeterministicAeadKeyTemplate;

        d(g gVar) {
            this.mDeterministicAeadKeyTemplate = gVar;
        }

        g getKeyTemplate() {
            return this.mDeterministicAeadKeyTemplate;
        }
    }

    /* loaded from: classes.dex */
    public enum e {
        AES256_GCM(f.j());
        
        private final g mAeadKeyTemplate;

        e(g gVar) {
            this.mAeadKeyTemplate = gVar;
        }

        g getKeyTemplate() {
            return this.mAeadKeyTemplate;
        }
    }

    a(String str, String str2, SharedPreferences sharedPreferences, hl.a aVar, hl.d dVar) {
        this.f5945c = str;
        this.f5943a = sharedPreferences;
        this.f5946d = aVar;
        this.f5947e = dVar;
    }

    public static SharedPreferences a(Context context, String str, androidx.security.crypto.b bVar, d dVar, e eVar) {
        return b(str, bVar.a(), context, dVar, eVar);
    }

    @Deprecated
    public static SharedPreferences b(String str, String str2, Context context, d dVar, e eVar) {
        kl.b.b();
        il.a.b();
        Context applicationContext = context.getApplicationContext();
        a.b j11 = new a.b().h(dVar.getKeyTemplate()).j(applicationContext, "__androidx_security_crypto_encrypted_prefs_key_keyset__", str);
        i c11 = j11.i("android-keystore://" + str2).d().c();
        a.b j12 = new a.b().h(eVar.getKeyTemplate()).j(applicationContext, "__androidx_security_crypto_encrypted_prefs_value_keyset__", str);
        i c12 = j12.i("android-keystore://" + str2).d().c();
        hl.d dVar2 = (hl.d) c11.h(hl.d.class);
        return new a(str, str2, applicationContext.getSharedPreferences(str, 0), (hl.a) c12.h(hl.a.class), dVar2);
    }

    private Object f(String str) {
        if (!g(str)) {
            if (str == null) {
                str = "__NULL__";
            }
            try {
                String d11 = d(str);
                String string = this.f5943a.getString(d11, null);
                if (string != null) {
                    ByteBuffer wrap = ByteBuffer.wrap(this.f5946d.decrypt(pl.f.a(string, 0), d11.getBytes(StandardCharsets.UTF_8)));
                    wrap.position(0);
                    switch (C0100a.f5948a[c.fromId(wrap.getInt()).ordinal()]) {
                        case 1:
                            int i11 = wrap.getInt();
                            ByteBuffer slice = wrap.slice();
                            wrap.limit(i11);
                            String charBuffer = StandardCharsets.UTF_8.decode(slice).toString();
                            if (charBuffer.equals("__NULL__")) {
                                return null;
                            }
                            return charBuffer;
                        case 2:
                            return Integer.valueOf(wrap.getInt());
                        case 3:
                            return Long.valueOf(wrap.getLong());
                        case 4:
                            return Float.valueOf(wrap.getFloat());
                        case 5:
                            return Boolean.valueOf(wrap.get() != 0);
                        case 6:
                            androidx.collection.b bVar = new androidx.collection.b();
                            while (wrap.hasRemaining()) {
                                int i12 = wrap.getInt();
                                ByteBuffer slice2 = wrap.slice();
                                slice2.limit(i12);
                                wrap.position(wrap.position() + i12);
                                bVar.add(StandardCharsets.UTF_8.decode(slice2).toString());
                            }
                            if (bVar.size() == 1 && "__NULL__".equals(bVar.j(0))) {
                                return null;
                            }
                            return bVar;
                        default:
                            return null;
                    }
                }
                return null;
            } catch (GeneralSecurityException e11) {
                throw new SecurityException("Could not decrypt value. " + e11.getMessage(), e11);
            }
        }
        throw new SecurityException(str + " is a reserved key for the encryption keyset.");
    }

    String c(String str) {
        try {
            String str2 = new String(this.f5947e.b(pl.f.a(str, 0), this.f5945c.getBytes()), StandardCharsets.UTF_8);
            if (str2.equals("__NULL__")) {
                return null;
            }
            return str2;
        } catch (GeneralSecurityException e11) {
            throw new SecurityException("Could not decrypt key. " + e11.getMessage(), e11);
        }
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        if (!g(str)) {
            return this.f5943a.contains(d(str));
        }
        throw new SecurityException(str + " is a reserved key for the encryption keyset.");
    }

    String d(String str) {
        if (str == null) {
            str = "__NULL__";
        }
        try {
            return pl.f.d(this.f5947e.a(str.getBytes(StandardCharsets.UTF_8), this.f5945c.getBytes()));
        } catch (GeneralSecurityException e11) {
            throw new SecurityException("Could not encrypt key. " + e11.getMessage(), e11);
        }
    }

    Pair<String, String> e(String str, byte[] bArr) {
        String d11 = d(str);
        return new Pair<>(d11, pl.f.d(this.f5946d.a(bArr, d11.getBytes(StandardCharsets.UTF_8))));
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        return new b(this, this.f5943a.edit());
    }

    boolean g(String str) {
        return "__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(str) || "__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(str);
    }

    @Override // android.content.SharedPreferences
    public Map<String, ?> getAll() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ?> entry : this.f5943a.getAll().entrySet()) {
            if (!g(entry.getKey())) {
                String c11 = c(entry.getKey());
                hashMap.put(c11, f(c11));
            }
        }
        return hashMap;
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z11) {
        Object f11 = f(str);
        return (f11 == null || !(f11 instanceof Boolean)) ? z11 : ((Boolean) f11).booleanValue();
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f11) {
        Object f12 = f(str);
        return (f12 == null || !(f12 instanceof Float)) ? f11 : ((Float) f12).floatValue();
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i11) {
        Object f11 = f(str);
        return (f11 == null || !(f11 instanceof Integer)) ? i11 : ((Integer) f11).intValue();
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j11) {
        Object f11 = f(str);
        return (f11 == null || !(f11 instanceof Long)) ? j11 : ((Long) f11).longValue();
    }

    @Override // android.content.SharedPreferences
    public String getString(String str, String str2) {
        Object f11 = f(str);
        return (f11 == null || !(f11 instanceof String)) ? str2 : (String) f11;
    }

    @Override // android.content.SharedPreferences
    public Set<String> getStringSet(String str, Set<String> set) {
        Set<String> bVar;
        Object f11 = f(str);
        if (f11 instanceof Set) {
            bVar = (Set) f11;
        } else {
            bVar = new androidx.collection.b<>();
        }
        return bVar.size() > 0 ? bVar : set;
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f5944b.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f5944b.remove(onSharedPreferenceChangeListener);
    }
}