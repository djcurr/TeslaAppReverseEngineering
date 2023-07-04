package com.stripe.android.core.storage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.k;
import vz.m;

/* loaded from: classes2.dex */
public final class SharedPreferencesStorage implements Storage {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final String logTag;
    private final Context context;
    private final String purpose;
    private final k sharedPrefs$delegate;

    /* loaded from: classes2.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getLogTag() {
            return SharedPreferencesStorage.logTag;
        }
    }

    static {
        String simpleName = SharedPreferencesStorage.class.getSimpleName();
        s.f(simpleName, "SharedPreferencesStorage::class.java.simpleName");
        logTag = simpleName;
    }

    public SharedPreferencesStorage(Context context, String purpose) {
        k a11;
        s.g(context, "context");
        s.g(purpose, "purpose");
        this.context = context;
        this.purpose = purpose;
        a11 = m.a(new SharedPreferencesStorage$sharedPrefs$2(this));
        this.sharedPrefs$delegate = a11;
    }

    private final SharedPreferences getSharedPrefs() {
        return (SharedPreferences) this.sharedPrefs$delegate.getValue();
    }

    @Override // com.stripe.android.core.storage.Storage
    public boolean clear() {
        Boolean valueOf;
        SharedPreferences sharedPrefs = getSharedPrefs();
        if (sharedPrefs == null) {
            valueOf = null;
        } else {
            SharedPreferences.Editor edit = sharedPrefs.edit();
            edit.clear();
            valueOf = Boolean.valueOf(edit.commit());
        }
        if (valueOf == null) {
            Log.e(logTag, "Shared preferences is unavailable to clear values");
            return false;
        }
        return valueOf.booleanValue();
    }

    @Override // com.stripe.android.core.storage.Storage
    public boolean getBoolean(String key, boolean z11) {
        Boolean valueOf;
        s.g(key, "key");
        try {
            SharedPreferences sharedPrefs = getSharedPrefs();
            if (sharedPrefs == null) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(sharedPrefs.getBoolean(this.purpose + '_' + key, z11));
            }
            if (valueOf == null) {
                Log.e(logTag, s.p("Unable to retrieve a Boolean for ", key));
                return z11;
            }
            return valueOf.booleanValue();
        } catch (Throwable th2) {
            if (th2 instanceof ClassCastException) {
                Log.e(logTag, s.p(key, " is not a Boolean"), th2);
                return z11;
            }
            Log.d(logTag, s.p("Error retrieving Boolean for ", key), th2);
            return z11;
        }
    }

    @Override // com.stripe.android.core.storage.Storage
    public float getFloat(String key, float f11) {
        Float valueOf;
        s.g(key, "key");
        try {
            SharedPreferences sharedPrefs = getSharedPrefs();
            if (sharedPrefs == null) {
                valueOf = null;
            } else {
                valueOf = Float.valueOf(sharedPrefs.getFloat(this.purpose + '_' + key, f11));
            }
            if (valueOf == null) {
                Log.e(logTag, s.p("Unable to retrieve a Float for ", key));
                return f11;
            }
            return valueOf.floatValue();
        } catch (Throwable th2) {
            if (th2 instanceof ClassCastException) {
                Log.e(logTag, s.p(key, " is not a Float"), th2);
                return f11;
            }
            Log.d(logTag, s.p("Error retrieving Float for ", key), th2);
            return f11;
        }
    }

    @Override // com.stripe.android.core.storage.Storage
    public int getInt(String key, int i11) {
        Integer valueOf;
        s.g(key, "key");
        try {
            SharedPreferences sharedPrefs = getSharedPrefs();
            if (sharedPrefs == null) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(sharedPrefs.getInt(this.purpose + '_' + key, i11));
            }
            if (valueOf == null) {
                Log.e(logTag, s.p("Unable to retrieve an Int for ", key));
                return i11;
            }
            return valueOf.intValue();
        } catch (Throwable th2) {
            if (th2 instanceof ClassCastException) {
                Log.e(logTag, s.p(key, " is not a Int"), th2);
                return i11;
            }
            Log.d(logTag, s.p("Error retrieving Int for ", key), th2);
            return i11;
        }
    }

    @Override // com.stripe.android.core.storage.Storage
    public long getLong(String key, long j11) {
        Long valueOf;
        s.g(key, "key");
        try {
            SharedPreferences sharedPrefs = getSharedPrefs();
            if (sharedPrefs == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(sharedPrefs.getLong(this.purpose + '_' + key, j11));
            }
            if (valueOf == null) {
                Log.e(logTag, s.p("Unable to retrieve a Long for ", key));
                return j11;
            }
            return valueOf.longValue();
        } catch (Throwable th2) {
            if (th2 instanceof ClassCastException) {
                Log.e(logTag, s.p(key, " is not a Long"), th2);
                return j11;
            }
            Log.d(logTag, s.p("Error retrieving Long for ", key), th2);
            return j11;
        }
    }

    @Override // com.stripe.android.core.storage.Storage
    public String getString(String key, String defaultValue) {
        String string;
        s.g(key, "key");
        s.g(defaultValue, "defaultValue");
        try {
            SharedPreferences sharedPrefs = getSharedPrefs();
            if (sharedPrefs == null) {
                string = null;
            } else {
                string = sharedPrefs.getString(this.purpose + '_' + key, defaultValue);
            }
            if (string == null) {
                Log.e(logTag, s.p("Unable to retrieve a String for ", key));
                return defaultValue;
            }
            return string;
        } catch (Throwable th2) {
            if (th2 instanceof ClassCastException) {
                Log.e(logTag, s.p(key, " is not a String"), th2);
                return defaultValue;
            }
            Log.d(logTag, s.p("Error retrieving String for ", key), th2);
            return defaultValue;
        }
    }

    @Override // com.stripe.android.core.storage.Storage
    public boolean remove(String key) {
        Boolean valueOf;
        s.g(key, "key");
        SharedPreferences sharedPrefs = getSharedPrefs();
        if (sharedPrefs == null) {
            valueOf = null;
        } else {
            SharedPreferences.Editor edit = sharedPrefs.edit();
            edit.remove(key);
            valueOf = Boolean.valueOf(edit.commit());
        }
        if (valueOf == null) {
            Log.e(logTag, "Shared preferences is unavailable to remove values");
            return false;
        }
        return valueOf.booleanValue();
    }

    @Override // com.stripe.android.core.storage.Storage
    public boolean storeValue(String key, String value) {
        Boolean valueOf;
        s.g(key, "key");
        s.g(value, "value");
        SharedPreferences sharedPrefs = getSharedPrefs();
        if (sharedPrefs == null) {
            valueOf = null;
        } else {
            SharedPreferences.Editor edit = sharedPrefs.edit();
            edit.putString(this.purpose + '_' + key, value);
            valueOf = Boolean.valueOf(edit.commit());
        }
        if (valueOf == null) {
            String str = logTag;
            Log.e(str, "Shared preferences is unavailable to store " + value + " for " + key);
            return false;
        }
        return valueOf.booleanValue();
    }

    @Override // com.stripe.android.core.storage.Storage
    public boolean storeValue(String key, long j11) {
        Boolean valueOf;
        s.g(key, "key");
        SharedPreferences sharedPrefs = getSharedPrefs();
        if (sharedPrefs == null) {
            valueOf = null;
        } else {
            SharedPreferences.Editor edit = sharedPrefs.edit();
            edit.putLong(this.purpose + '_' + key, j11);
            valueOf = Boolean.valueOf(edit.commit());
        }
        if (valueOf == null) {
            String str = logTag;
            Log.e(str, "Shared preferences is unavailable to store " + j11 + " for " + key);
            return false;
        }
        return valueOf.booleanValue();
    }

    @Override // com.stripe.android.core.storage.Storage
    public boolean storeValue(String key, int i11) {
        Boolean valueOf;
        s.g(key, "key");
        SharedPreferences sharedPrefs = getSharedPrefs();
        if (sharedPrefs == null) {
            valueOf = null;
        } else {
            SharedPreferences.Editor edit = sharedPrefs.edit();
            edit.putInt(this.purpose + '_' + key, i11);
            valueOf = Boolean.valueOf(edit.commit());
        }
        if (valueOf == null) {
            String str = logTag;
            Log.e(str, "Shared preferences is unavailable to store " + i11 + " for " + key);
            return false;
        }
        return valueOf.booleanValue();
    }

    @Override // com.stripe.android.core.storage.Storage
    public boolean storeValue(String key, float f11) {
        Boolean valueOf;
        s.g(key, "key");
        SharedPreferences sharedPrefs = getSharedPrefs();
        if (sharedPrefs == null) {
            valueOf = null;
        } else {
            SharedPreferences.Editor edit = sharedPrefs.edit();
            edit.putFloat(this.purpose + '_' + key, f11);
            valueOf = Boolean.valueOf(edit.commit());
        }
        if (valueOf == null) {
            String str = logTag;
            Log.e(str, "Shared preferences is unavailable to store " + f11 + " for " + key);
            return false;
        }
        return valueOf.booleanValue();
    }

    @Override // com.stripe.android.core.storage.Storage
    public boolean storeValue(String key, boolean z11) {
        Boolean valueOf;
        s.g(key, "key");
        SharedPreferences sharedPrefs = getSharedPrefs();
        if (sharedPrefs == null) {
            valueOf = null;
        } else {
            SharedPreferences.Editor edit = sharedPrefs.edit();
            edit.putBoolean(this.purpose + '_' + key, z11);
            valueOf = Boolean.valueOf(edit.commit());
        }
        if (valueOf == null) {
            String str = logTag;
            Log.e(str, "Shared preferences is unavailable to store " + z11 + " for " + key);
            return false;
        }
        return valueOf.booleanValue();
    }
}